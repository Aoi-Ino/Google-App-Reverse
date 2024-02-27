package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.a;
import p4.i;
import p4.l;

class a1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f7449i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f7450a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f7451b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f7452c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f7453d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f7454e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f7455f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7456g = false;

    /* renamed from: h  reason: collision with root package name */
    private final y0 f7457h;

    private a1(FirebaseMessaging firebaseMessaging, f0 f0Var, y0 y0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7453d = firebaseMessaging;
        this.f7451b = f0Var;
        this.f7457h = y0Var;
        this.f7452c = a0Var;
        this.f7450a = context;
        this.f7455f = scheduledExecutorService;
    }

    private static void b(i iVar) {
        try {
            l.b(iVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    private void c(String str) {
        b(this.f7452c.k(this.f7453d.h(), str));
    }

    private void d(String str) {
        b(this.f7452c.l(this.f7453d.h(), str));
    }

    static i e(FirebaseMessaging firebaseMessaging, f0 f0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return l.c(scheduledExecutorService, new z0(context, scheduledExecutorService, firebaseMessaging, f0Var, a0Var));
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, f0 f0Var, a0 a0Var) {
        return new a1(firebaseMessaging, f0Var, y0.a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(com.google.firebase.messaging.x0 r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f7454e
            monitor-enter(r0)
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x0011 }
            java.util.Map r1 = r4.f7454e     // Catch:{ all -> 0x0011 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r5 = move-exception
            goto L_0x0034
        L_0x0013:
            java.util.Map r1 = r4.f7454e     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0011 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0011 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0011 }
            p4.j r2 = (p4.j) r2     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0027
            r3 = 0
            r2.c(r3)     // Catch:{ all -> 0x0011 }
        L_0x0027:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0032
            java.util.Map r1 = r4.f7454e     // Catch:{ all -> 0x0011 }
            r1.remove(r5)     // Catch:{ all -> 0x0011 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a1.j(com.google.firebase.messaging.x0):void");
    }

    private void n() {
        if (!h()) {
            q(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f7457h.b() != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean h() {
        return this.f7456g;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[Catch:{ IOException -> 0x001f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(com.google.firebase.messaging.x0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch:{ IOException -> 0x001f }
            int r3 = r2.hashCode()     // Catch:{ IOException -> 0x001f }
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L_0x0022
            r4 = 85
            if (r3 == r4) goto L_0x0015
            goto L_0x002c
        L_0x0015:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x001f }
            if (r2 == 0) goto L_0x002c
            r2 = r5
            goto L_0x002d
        L_0x001f:
            r7 = move-exception
            goto L_0x00a0
        L_0x0022:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x001f }
            if (r2 == 0) goto L_0x002c
            r2 = r1
            goto L_0x002d
        L_0x002c:
            r2 = -1
        L_0x002d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L_0x0079
            if (r2 == r5) goto L_0x0053
            boolean r2 = g()     // Catch:{ IOException -> 0x001f }
            if (r2 == 0) goto L_0x009f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x001f }
            r2.<init>()     // Catch:{ IOException -> 0x001f }
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch:{ IOException -> 0x001f }
            r2.append(r7)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = "."
            r2.append(r7)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x001f }
        L_0x004f:
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x001f }
            goto L_0x009f
        L_0x0053:
            java.lang.String r2 = r7.c()     // Catch:{ IOException -> 0x001f }
            r6.d(r2)     // Catch:{ IOException -> 0x001f }
            boolean r2 = g()     // Catch:{ IOException -> 0x001f }
            if (r2 == 0) goto L_0x009f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x001f }
            r2.<init>()     // Catch:{ IOException -> 0x001f }
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = r7.c()     // Catch:{ IOException -> 0x001f }
            r2.append(r7)     // Catch:{ IOException -> 0x001f }
            r2.append(r3)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x001f }
            goto L_0x004f
        L_0x0079:
            java.lang.String r2 = r7.c()     // Catch:{ IOException -> 0x001f }
            r6.c(r2)     // Catch:{ IOException -> 0x001f }
            boolean r2 = g()     // Catch:{ IOException -> 0x001f }
            if (r2 == 0) goto L_0x009f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x001f }
            r2.<init>()     // Catch:{ IOException -> 0x001f }
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = r7.c()     // Catch:{ IOException -> 0x001f }
            r2.append(r7)     // Catch:{ IOException -> 0x001f }
            r2.append(r3)     // Catch:{ IOException -> 0x001f }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x001f }
            goto L_0x004f
        L_0x009f:
            return r5
        L_0x00a0:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c6
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b9
            goto L_0x00c6
        L_0x00b9:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00c5
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        L_0x00c1:
            android.util.Log.e(r0, r7)
            return r1
        L_0x00c5:
            throw r7
        L_0x00c6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a1.k(com.google.firebase.messaging.x0):boolean");
    }

    /* access modifiers changed from: package-private */
    public void l(Runnable runnable, long j10) {
        this.f7455f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public synchronized void m(boolean z10) {
        this.f7456g = z10;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (k(r0) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.y0 r0 = r2.f7457h     // Catch:{ all -> 0x0017 }
            com.google.firebase.messaging.x0 r0 = r0.b()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001c
            boolean r0 = g()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r0 = move-exception
            goto L_0x002e
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            r0 = 1
            return r0
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L_0x0025
            r0 = 0
            return r0
        L_0x0025:
            com.google.firebase.messaging.y0 r1 = r2.f7457h
            r1.d(r0)
            r2.j(r0)
            goto L_0x0000
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a1.p():boolean");
    }

    /* access modifiers changed from: package-private */
    public void q(long j10) {
        l(new b1(this, this.f7450a, this.f7451b, Math.min(Math.max(30, 2 * j10), f7449i)), j10);
        m(true);
    }
}
