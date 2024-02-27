package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import o4.a;

abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    static final long f7480a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f7481b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f7482c;

    private static void b(Context context) {
        if (f7482c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f7482c = aVar;
            aVar.d(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f7481b) {
            try {
                if (f7482c != null && d(intent)) {
                    g(intent, false);
                    f7482c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, i1 i1Var, Intent intent) {
        synchronized (f7481b) {
            try {
                b(context);
                boolean d10 = d(intent);
                g(intent, true);
                if (!d10) {
                    f7482c.a(f7480a);
                }
                i1Var.c(intent).c(new c1(intent));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName h(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f7481b
            monitor-enter(r0)
            b(r3)     // Catch:{ all -> 0x0017 }
            boolean r1 = d(r4)     // Catch:{ all -> 0x0017 }
            r2 = 1
            g(r4, r2)     // Catch:{ all -> 0x0017 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            r3 = 0
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0024
        L_0x0019:
            if (r1 != 0) goto L_0x0022
            o4.a r4 = f7482c     // Catch:{ all -> 0x0017 }
            long r1 = f7480a     // Catch:{ all -> 0x0017 }
            r4.a(r1)     // Catch:{ all -> 0x0017 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r3
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d1.h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
