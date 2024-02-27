package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.k;
import cm.g;
import cm.l;

public class g0 extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final b f3283f = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private a f3284e;

    public interface a {
        void a();

        void b();

        void onCreate();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(Activity activity, k.a aVar) {
            l.f(activity, "activity");
            l.f(aVar, "event");
            if (activity instanceof s) {
                k d02 = ((s) activity).d0();
                if (d02 instanceof u) {
                    ((u) d02).i(aVar);
                }
            }
        }

        public final g0 b(Activity activity) {
            l.f(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            l.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (g0) findFragmentByTag;
        }

        public final void c(Activity activity) {
            l.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new g0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((g) null);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final void a(Activity activity) {
                l.f(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            l.f(activity, "activity");
            g0.f3283f.a(activity, k.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            l.f(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            l.f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            l.f(activity, "activity");
        }
    }

    private final void a(k.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f3283f;
            Activity activity = getActivity();
            l.e(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public static final void e(Activity activity) {
        f3283f.c(activity);
    }

    public final void f(a aVar) {
        this.f3284e = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f3284e);
        a(k.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(k.a.ON_DESTROY);
        this.f3284e = null;
    }

    public void onPause() {
        super.onPause();
        a(k.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f3284e);
        a(k.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f3284e);
        a(k.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(k.a.ON_STOP);
    }
}
