package e4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i4.k;
import o.g;
import r3.c;
import s3.e;
import s3.h;

public final class v extends h {
    private final g I = new g();
    private final g J = new g();
    private final g K = new g();

    public v(Context context, Looper looper, e eVar, c cVar, r3.h hVar) {
        super(context, looper, 23, eVar, cVar, hVar);
    }

    private final boolean k0(p3.c cVar) {
        p3.c cVar2;
        p3.c[] h10 = h();
        if (h10 == null) {
            return false;
        }
        int length = h10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar2 = null;
                break;
            }
            cVar2 = h10[i10];
            if (cVar.c().equals(cVar2.c())) {
                break;
            }
            i10++;
        }
        return cVar2 != null && cVar2.d() >= cVar.d();
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void L(int i10) {
        super.L(i10);
        synchronized (this.I) {
            this.I.clear();
        }
        synchronized (this.J) {
            this.J.clear();
        }
        synchronized (this.K) {
            this.K.clear();
        }
    }

    public final boolean Q() {
        return true;
    }

    public final int f() {
        return 11717000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0(com.google.android.gms.common.api.internal.c.a r10, boolean r11, p4.j r12) {
        /*
            r9 = this;
            o.g r0 = r9.J
            monitor-enter(r0)
            o.g r1 = r9.J     // Catch:{ all -> 0x0015 }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x0015 }
            r5 = r10
            e4.t r5 = (e4.t) r5     // Catch:{ all -> 0x0015 }
            if (r5 != 0) goto L_0x0017
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0015 }
            r12.c(r10)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0015:
            r10 = move-exception
            goto L_0x005d
        L_0x0017:
            r5.m0()     // Catch:{ all -> 0x0015 }
            if (r11 == 0) goto L_0x0056
            p3.c r10 = i4.k.f12350j     // Catch:{ all -> 0x0015 }
            boolean r10 = r9.k0(r10)     // Catch:{ all -> 0x0015 }
            if (r10 == 0) goto L_0x003a
            android.os.IInterface r10 = r9.C()     // Catch:{ all -> 0x0015 }
            e4.w0 r10 = (e4.w0) r10     // Catch:{ all -> 0x0015 }
            r11 = 0
            e4.w r11 = e4.w.c(r11, r5, r11, r11)     // Catch:{ all -> 0x0015 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            e4.m r2 = new e4.m     // Catch:{ all -> 0x0015 }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x0015 }
            r10.I(r11, r2)     // Catch:{ all -> 0x0015 }
            goto L_0x005b
        L_0x003a:
            android.os.IInterface r10 = r9.C()     // Catch:{ all -> 0x0015 }
            e4.w0 r10 = (e4.w0) r10     // Catch:{ all -> 0x0015 }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            e4.n r7 = new e4.n     // Catch:{ all -> 0x0015 }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x0015 }
            e4.a0 r11 = new e4.a0     // Catch:{ all -> 0x0015 }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0015 }
            r10.u(r11)     // Catch:{ all -> 0x0015 }
            goto L_0x005b
        L_0x0056:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0015 }
            r12.c(r10)     // Catch:{ all -> 0x0015 }
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.v.j0(com.google.android.gms.common.api.internal.c$a, boolean, p4.j):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059 A[Catch:{ all -> 0x002e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0(e4.p r18, com.google.android.gms.location.LocationRequest r19, p4.j r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.c r3 = r18.a()
            com.google.android.gms.common.api.internal.c$a r4 = r3.b()
            r4.getClass()
            p3.c r5 = i4.k.f12350j
            boolean r5 = r1.k0(r5)
            o.g r6 = r1.J
            monitor-enter(r6)
            o.g r7 = r1.J     // Catch:{ all -> 0x002e }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x002e }
            e4.t r7 = (e4.t) r7     // Catch:{ all -> 0x002e }
            r8 = 0
            if (r7 == 0) goto L_0x0030
            if (r5 == 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            r7.l0(r3)     // Catch:{ all -> 0x002e }
            r13 = r7
            r7 = r8
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x0084
        L_0x0030:
            e4.t r3 = new e4.t     // Catch:{ all -> 0x002e }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x002e }
            o.g r9 = r1.J     // Catch:{ all -> 0x002e }
            r9.put(r4, r3)     // Catch:{ all -> 0x002e }
            r13 = r3
        L_0x003d:
            r17.x()     // Catch:{ all -> 0x002e }
            java.lang.String r3 = r4.a()     // Catch:{ all -> 0x002e }
            if (r5 == 0) goto L_0x0059
            android.os.IInterface r4 = r17.C()     // Catch:{ all -> 0x002e }
            e4.w0 r4 = (e4.w0) r4     // Catch:{ all -> 0x002e }
            e4.w r3 = e4.w.c(r7, r13, r8, r3)     // Catch:{ all -> 0x002e }
            e4.m r5 = new e4.m     // Catch:{ all -> 0x002e }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x002e }
            r4.Y(r3, r0, r5)     // Catch:{ all -> 0x002e }
            goto L_0x0082
        L_0x0059:
            android.os.IInterface r4 = r17.C()     // Catch:{ all -> 0x002e }
            e4.w0 r4 = (e4.w0) r4     // Catch:{ all -> 0x002e }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x002e }
            r5.<init>(r0)     // Catch:{ all -> 0x002e }
            r5.f(r8)     // Catch:{ all -> 0x002e }
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch:{ all -> 0x002e }
            e4.y r11 = e4.y.c(r8, r0)     // Catch:{ all -> 0x002e }
            e4.o r15 = new e4.o     // Catch:{ all -> 0x002e }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x002e }
            e4.a0 r0 = new e4.a0     // Catch:{ all -> 0x002e }
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x002e }
            r4.u(r0)     // Catch:{ all -> 0x002e }
        L_0x0082:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            return
        L_0x0084:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.v.l0(e4.p, com.google.android.gms.location.LocationRequest, p4.j):void");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof w0 ? (w0) queryLocalInterface : new v0(iBinder);
    }

    public final p3.c[] u() {
        return k.f12352l;
    }
}
