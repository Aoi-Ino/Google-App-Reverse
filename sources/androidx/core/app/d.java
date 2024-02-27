package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class f2203a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f2204b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f2205c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f2206d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f2207e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f2208f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f2209g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C0024d f2210e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f2211f;

        a(C0024d dVar, Object obj) {
            this.f2210e = dVar;
            this.f2211f = obj;
        }

        public void run() {
            this.f2210e.f2216e = this.f2211f;
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Application f2212e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C0024d f2213f;

        b(Application application, C0024d dVar) {
            this.f2212e = application;
            this.f2213f = dVar;
        }

        public void run() {
            this.f2212e.unregisterActivityLifecycleCallbacks(this.f2213f);
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f2214e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f2215f;

        c(Object obj, Object obj2) {
            this.f2214e = obj;
            this.f2215f = obj2;
        }

        public void run() {
            try {
                Method method = d.f2206d;
                if (method != null) {
                    method.invoke(this.f2214e, new Object[]{this.f2215f, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f2207e.invoke(this.f2214e, new Object[]{this.f2215f, Boolean.FALSE});
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    private static final class C0024d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e  reason: collision with root package name */
        Object f2216e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f2217f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2218g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2219h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2220i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2221j = false;

        C0024d(Activity activity) {
            this.f2217f = activity;
            this.f2218g = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2217f == activity) {
                this.f2217f = null;
                this.f2220i = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2220i && !this.f2221j && !this.f2219h && d.h(this.f2216e, this.f2218g, activity)) {
                this.f2221j = true;
                this.f2216e = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2217f == activity) {
                this.f2219h = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a10 = a();
        f2203a = a10;
        f2206d = d(a10);
        f2207e = c(a10);
        f2208f = e(a10);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        Class<Configuration> cls2 = Configuration.class;
        Class<List> cls3 = List.class;
        if (g() && cls != null) {
            try {
                Class cls4 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, cls3, cls3, Integer.TYPE, cls4, cls2, cls2, cls4, cls4});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2205c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f2209g.postAtFrontOfQueue(new c(f2204b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0024d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f2208f == null) {
            return false;
        } else {
            if (f2207e == null && f2206d == null) {
                return false;
            }
            try {
                Object obj2 = f2205c.get(activity);
                if (obj2 == null || (obj = f2204b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0024d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2209g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f2208f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
