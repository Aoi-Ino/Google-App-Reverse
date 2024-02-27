package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g0;
import androidx.lifecycle.k;
import cm.g;
import cm.l;

public final class e0 implements s {

    /* renamed from: m  reason: collision with root package name */
    public static final b f3266m = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final e0 f3267n = new e0();

    /* renamed from: e  reason: collision with root package name */
    private int f3268e;

    /* renamed from: f  reason: collision with root package name */
    private int f3269f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3270g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3271h = true;

    /* renamed from: i  reason: collision with root package name */
    private Handler f3272i;

    /* renamed from: j  reason: collision with root package name */
    private final u f3273j = new u(this);

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f3274k = new d0(this);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final g0.a f3275l = new d(this);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3276a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            l.f(activity, "activity");
            l.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final s a() {
            return e0.f3267n;
        }

        public final void b(Context context) {
            l.f(context, "context");
            e0.f3267n.h(context);
        }
    }

    public static final class c extends g {
        final /* synthetic */ e0 this$0;

        public static final class a extends g {
            final /* synthetic */ e0 this$0;

            a(e0 e0Var) {
                this.this$0 = e0Var;
            }

            public void onActivityPostResumed(Activity activity) {
                l.f(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                l.f(activity, "activity");
                this.this$0.f();
            }
        }

        c(e0 e0Var) {
            this.this$0 = e0Var;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                g0.f3283f.b(activity).f(this.this$0.f3275l);
            }
        }

        public void onActivityPaused(Activity activity) {
            l.f(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            l.f(activity, "activity");
            this.this$0.g();
        }
    }

    public static final class d implements g0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f3277a;

        d(e0 e0Var) {
            this.f3277a = e0Var;
        }

        public void a() {
            this.f3277a.e();
        }

        public void b() {
            this.f3277a.f();
        }

        public void onCreate() {
        }
    }

    private e0() {
    }

    /* access modifiers changed from: private */
    public static final void i(e0 e0Var) {
        l.f(e0Var, "this$0");
        e0Var.j();
        e0Var.m();
    }

    public final void d() {
        int i10 = this.f3269f - 1;
        this.f3269f = i10;
        if (i10 == 0) {
            Handler handler = this.f3272i;
            l.c(handler);
            handler.postDelayed(this.f3274k, 700);
        }
    }

    public k d0() {
        return this.f3273j;
    }

    public final void e() {
        int i10 = this.f3269f + 1;
        this.f3269f = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f3270g) {
            this.f3273j.i(k.a.ON_RESUME);
            this.f3270g = false;
            return;
        }
        Handler handler = this.f3272i;
        l.c(handler);
        handler.removeCallbacks(this.f3274k);
    }

    public final void f() {
        int i10 = this.f3268e + 1;
        this.f3268e = i10;
        if (i10 == 1 && this.f3271h) {
            this.f3273j.i(k.a.ON_START);
            this.f3271h = false;
        }
    }

    public final void g() {
        this.f3268e--;
        m();
    }

    public final void h(Context context) {
        l.f(context, "context");
        this.f3272i = new Handler();
        this.f3273j.i(k.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f3269f == 0) {
            this.f3270g = true;
            this.f3273j.i(k.a.ON_PAUSE);
        }
    }

    public final void m() {
        if (this.f3268e == 0 && this.f3270g) {
            this.f3273j.i(k.a.ON_STOP);
            this.f3271h = true;
        }
    }
}
