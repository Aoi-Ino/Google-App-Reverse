package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.v;
import androidx.work.impl.foreground.b;
import m1.m;

public class SystemForegroundService extends v implements b.C0074b {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f4213j = m.i("SystemFgService");

    /* renamed from: k  reason: collision with root package name */
    private static SystemForegroundService f4214k = null;

    /* renamed from: f  reason: collision with root package name */
    private Handler f4215f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4216g;

    /* renamed from: h  reason: collision with root package name */
    b f4217h;

    /* renamed from: i  reason: collision with root package name */
    NotificationManager f4218i;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f4219e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Notification f4220f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f4221g;

        a(int i10, Notification notification, int i11) {
            this.f4219e = i10;
            this.f4220f = notification;
            this.f4221g = i11;
        }

        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f4219e, this.f4220f, this.f4221g);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f4219e, this.f4220f, this.f4221g);
            } else {
                SystemForegroundService.this.startForeground(this.f4219e, this.f4220f);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f4223e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Notification f4224f;

        b(int i10, Notification notification) {
            this.f4223e = i10;
            this.f4224f = notification;
        }

        public void run() {
            SystemForegroundService.this.f4218i.notify(this.f4223e, this.f4224f);
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f4226e;

        c(int i10) {
            this.f4226e = i10;
        }

        public void run() {
            SystemForegroundService.this.f4218i.cancel(this.f4226e);
        }
    }

    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                m.e().l(SystemForegroundService.f4213j, "Unable to start foreground service", e10);
            }
        }
    }

    private void f() {
        this.f4215f = new Handler(Looper.getMainLooper());
        this.f4218i = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f4217h = bVar;
        bVar.n(this);
    }

    public void b(int i10) {
        this.f4215f.post(new c(i10));
    }

    public void c(int i10, int i11, Notification notification) {
        this.f4215f.post(new a(i10, notification, i11));
    }

    public void d(int i10, Notification notification) {
        this.f4215f.post(new b(i10, notification));
    }

    public void onCreate() {
        super.onCreate();
        f4214k = this;
        f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4217h.l();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4216g) {
            m.e().f(f4213j, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4217h.l();
            f();
            this.f4216g = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4217h.m(intent);
        return 3;
    }

    public void stop() {
        this.f4216g = true;
        m.e().a(f4213j, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4214k = null;
        stopSelf();
    }
}
