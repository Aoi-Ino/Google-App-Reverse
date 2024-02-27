package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4.i;
import p4.j;
import x3.b;

class i1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7509a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f7510b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f7511c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f7512d;

    /* renamed from: e  reason: collision with root package name */
    private f1 f7513e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7514f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f7515a;

        /* renamed from: b  reason: collision with root package name */
        private final j f7516b = new j();

        a(Intent intent) {
            this.f7515a = intent;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f7515a.getAction() + " finishing.");
            d();
        }

        /* access modifiers changed from: package-private */
        public void c(ScheduledExecutorService scheduledExecutorService) {
            e().b(scheduledExecutorService, new h1(scheduledExecutorService.schedule(new g1(this), 20, TimeUnit.SECONDS)));
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f7516b.e((Object) null);
        }

        /* access modifiers changed from: package-private */
        public i e() {
            return this.f7516b.a();
        }
    }

    i1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f7512d.isEmpty()) {
            ((a) this.f7512d.poll()).d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f7512d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                f1 f1Var = this.f7513e;
                if (f1Var == null || !f1Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f7513e.c((a) this.f7512d.poll());
            }
        } finally {
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f7514f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f7514f) {
            this.f7514f = true;
            try {
                if (!v3.b.b().a(this.f7509a, this.f7510b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f7514f = false;
                    a();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f7511c);
            this.f7512d.add(aVar);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f7514f = false;
            if (!(iBinder instanceof f1)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.f7513e = (f1) iBinder;
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    i1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f7512d = new ArrayDeque();
        this.f7514f = false;
        Context applicationContext = context.getApplicationContext();
        this.f7509a = applicationContext;
        this.f7510b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f7511c = scheduledExecutorService;
    }
}
