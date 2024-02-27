package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.v0;
import h6.e;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4.l;
import s3.o;
import v6.b;
import v6.d;
import y2.i;

public class FirebaseMessaging {

    /* renamed from: n  reason: collision with root package name */
    private static final long f7398n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o  reason: collision with root package name */
    private static v0 f7399o;

    /* renamed from: p  reason: collision with root package name */
    static i f7400p;

    /* renamed from: q  reason: collision with root package name */
    static ScheduledExecutorService f7401q;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f7402a;

    /* renamed from: b  reason: collision with root package name */
    private final z6.e f7403b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f7404c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f7405d;

    /* renamed from: e  reason: collision with root package name */
    private final q0 f7406e;

    /* renamed from: f  reason: collision with root package name */
    private final a f7407f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f7408g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f7409h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f7410i;

    /* renamed from: j  reason: collision with root package name */
    private final p4.i f7411j;

    /* renamed from: k  reason: collision with root package name */
    private final f0 f7412k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7413l;

    /* renamed from: m  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f7414m;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private final d f7415a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7416b;

        /* renamed from: c  reason: collision with root package name */
        private b f7417c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f7418d;

        a(d dVar) {
            this.f7415a = dVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(v6.a aVar) {
            if (c()) {
                FirebaseMessaging.this.y();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j10 = FirebaseMessaging.this.f7402a.j();
            SharedPreferences sharedPreferences = j10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            try {
                if (!this.f7416b) {
                    Boolean e10 = e();
                    this.f7418d = e10;
                    if (e10 == null) {
                        x xVar = new x(this);
                        this.f7417c = xVar;
                        this.f7415a.a(h6.b.class, xVar);
                    }
                    this.f7416b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f7418d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f7402a.s();
        }
    }

    FirebaseMessaging(e eVar, x6.a aVar, y6.b bVar, y6.b bVar2, z6.e eVar2, i iVar, d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, iVar, dVar, new f0(eVar.j()));
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
            o.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized v0 k(Context context) {
        v0 v0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f7399o == null) {
                    f7399o = new v0(context);
                }
                v0Var = f7399o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v0Var;
    }

    private String l() {
        return "[DEFAULT]".equals(this.f7402a.l()) ? "" : this.f7402a.n();
    }

    public static i n() {
        return f7400p;
    }

    private void o(String str) {
        if ("[DEFAULT]".equals(this.f7402a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f7402a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new n(this.f7404c).k(intent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ p4.i r(String str, v0.a aVar) {
        return this.f7405d.e().n(this.f7410i, new w(this, str, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ p4.i s(String str, v0.a aVar, String str2) {
        k(this.f7404c).f(l(), str, str2, this.f7412k.a());
        if (aVar == null || !str2.equals(aVar.f7586a)) {
            o(str2);
        }
        return l.e(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        if (p()) {
            y();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(a1 a1Var) {
        if (p()) {
            a1Var.o();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v() {
        l0.c(this.f7404c);
    }

    private synchronized void x() {
        if (!this.f7413l) {
            z(0);
        }
    }

    /* access modifiers changed from: private */
    public void y() {
        if (A(m())) {
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A(v0.a aVar) {
        return aVar == null || aVar.b(this.f7412k.a());
    }

    /* access modifiers changed from: package-private */
    public String h() {
        v0.a m10 = m();
        if (!A(m10)) {
            return m10.f7586a;
        }
        String c10 = f0.c(this.f7402a);
        try {
            return (String) l.a(this.f7406e.b(c10, new v(this, c10, m10)));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f7401q == null) {
                    f7401q = new ScheduledThreadPoolExecutor(1, new x3.b("TAG"));
                }
                f7401q.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Context j() {
        return this.f7404c;
    }

    /* access modifiers changed from: package-private */
    public v0.a m() {
        return k(this.f7404c).d(l(), f0.c(this.f7402a));
    }

    public boolean p() {
        return this.f7407f.c();
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f7412k.g();
    }

    /* access modifiers changed from: package-private */
    public synchronized void w(boolean z10) {
        this.f7413l = z10;
    }

    /* access modifiers changed from: package-private */
    public synchronized void z(long j10) {
        i(new w0(this, Math.min(Math.max(30, 2 * j10), f7398n)), j10);
        this.f7413l = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(h6.e r12, x6.a r13, y6.b r14, y6.b r15, z6.e r16, y2.i r17, v6.d r18, com.google.firebase.messaging.f0 r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.a0 r7 = new com.google.firebase.messaging.a0
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.o.f()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.o.c()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.o.b()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(h6.e, x6.a, y6.b, y6.b, z6.e, y2.i, v6.d, com.google.firebase.messaging.f0):void");
    }

    FirebaseMessaging(e eVar, x6.a aVar, z6.e eVar2, i iVar, d dVar, f0 f0Var, a0 a0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f7413l = false;
        f7400p = iVar;
        this.f7402a = eVar;
        this.f7403b = eVar2;
        this.f7407f = new a(dVar);
        Context j10 = eVar.j();
        this.f7404c = j10;
        q qVar = new q();
        this.f7414m = qVar;
        this.f7412k = f0Var;
        this.f7409h = executor;
        this.f7405d = a0Var;
        this.f7406e = new q0(executor);
        this.f7408g = executor2;
        this.f7410i = executor3;
        Context j11 = eVar.j();
        if (j11 instanceof Application) {
            ((Application) j11).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new r(this));
        }
        executor2.execute(new s(this));
        p4.i e10 = a1.e(this, f0Var, a0Var, j10, o.g());
        this.f7411j = e10;
        e10.e(executor2, new t(this));
        executor2.execute(new u(this));
    }
}
