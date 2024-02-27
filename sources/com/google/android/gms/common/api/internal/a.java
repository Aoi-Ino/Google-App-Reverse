package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import w3.j;

public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    private static final a f5246i = new a();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f5247e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f5248f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f5249g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f5250h = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    public interface C0096a {
        void a(boolean z10);
    }

    private a() {
    }

    public static a b() {
        return f5246i;
    }

    public static void c(Application application) {
        a aVar = f5246i;
        synchronized (aVar) {
            try {
                if (!aVar.f5250h) {
                    application.registerActivityLifecycleCallbacks(aVar);
                    application.registerComponentCallbacks(aVar);
                    aVar.f5250h = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f5246i) {
            try {
                Iterator it = this.f5249g.iterator();
                while (it.hasNext()) {
                    ((C0096a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(C0096a aVar) {
        synchronized (f5246i) {
            this.f5249g.add(aVar);
        }
    }

    public boolean d() {
        return this.f5247e.get();
    }

    public boolean e(boolean z10) {
        if (!this.f5248f.get()) {
            if (!j.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5248f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5247e.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5247e.compareAndSet(true, false);
        this.f5248f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5247e.compareAndSet(true, false);
        this.f5248f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5247e.compareAndSet(false, true)) {
            this.f5248f.set(true);
            f(true);
        }
    }
}
