package qm;

import bm.l;
import lm.f2;
import lm.u0;
import pl.x;
import tl.d;

public abstract class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f30826a = new h0("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f30827b = new h0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r8.M0() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r8.M0() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(tl.d r6, java.lang.Object r7, bm.l r8) {
        /*
            boolean r0 = r6 instanceof qm.j
            if (r0 == 0) goto L_0x00b2
            qm.j r6 = (qm.j) r6
            java.lang.Object r8 = lm.y.b(r7, r8)
            lm.a0 r0 = r6.f30821h
            tl.g r1 = r6.getContext()
            boolean r0 = r0.C0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f30823j = r8
            r6.f24987g = r1
            lm.a0 r7 = r6.f30821h
            tl.g r8 = r6.getContext()
            r7.A0(r8, r6)
            goto L_0x00b5
        L_0x0026:
            lm.f2 r0 = lm.f2.f24958a
            lm.u0 r0 = r0.a()
            boolean r2 = r0.K0()
            if (r2 == 0) goto L_0x003b
            r6.f30823j = r8
            r6.f24987g = r1
            r0.G0(r6)
            goto L_0x00b5
        L_0x003b:
            r0.I0(r1)
            r2 = 0
            tl.g r3 = r6.getContext()     // Catch:{ all -> 0x0068 }
            lm.k1$b r4 = lm.k1.f24977b     // Catch:{ all -> 0x0068 }
            tl.g$b r3 = r3.f(r4)     // Catch:{ all -> 0x0068 }
            lm.k1 r3 = (lm.k1) r3     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x006a
            boolean r4 = r3.c()     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x006a
            java.util.concurrent.CancellationException r7 = r3.c0()     // Catch:{ all -> 0x0068 }
            r6.b(r8, r7)     // Catch:{ all -> 0x0068 }
            pl.p$a r8 = pl.p.f30426e     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = pl.q.a(r7)     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = pl.p.a(r7)     // Catch:{ all -> 0x0068 }
            r6.resumeWith(r7)     // Catch:{ all -> 0x0068 }
            goto L_0x0092
        L_0x0068:
            r7 = move-exception
            goto L_0x00a9
        L_0x006a:
            tl.d r8 = r6.f30822i     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r6.f30824k     // Catch:{ all -> 0x0068 }
            tl.g r4 = r8.getContext()     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = qm.l0.c(r4, r3)     // Catch:{ all -> 0x0068 }
            qm.h0 r5 = qm.l0.f30829a     // Catch:{ all -> 0x0068 }
            if (r3 == r5) goto L_0x007f
            lm.h2 r8 = lm.z.g(r8, r4, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            tl.d r5 = r6.f30822i     // Catch:{ all -> 0x009c }
            r5.resumeWith(r7)     // Catch:{ all -> 0x009c }
            pl.x r7 = pl.x.f30437a     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x008f
            boolean r7 = r8.M0()     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0092
        L_0x008f:
            qm.l0.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x0092:
            boolean r7 = r0.M0()     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0092
        L_0x0098:
            r0.E0(r1)
            goto L_0x00b5
        L_0x009c:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.M0()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x00a8
        L_0x00a5:
            qm.l0.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x00a8:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x00a9:
            r6.f(r7, r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0098
        L_0x00ad:
            r6 = move-exception
            r0.E0(r1)
            throw r6
        L_0x00b2:
            r6.resumeWith(r7)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.k.b(tl.d, java.lang.Object, bm.l):void");
    }

    public static /* synthetic */ void c(d dVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(j jVar) {
        x xVar = x.f30437a;
        u0 a10 = f2.f24958a.a();
        if (a10.L0()) {
            return false;
        }
        if (a10.K0()) {
            jVar.f30823j = xVar;
            jVar.f24987g = 1;
            a10.G0(jVar);
            return true;
        }
        a10.I0(true);
        try {
            jVar.run();
            do {
            } while (a10.M0());
        } catch (Throwable th2) {
            a10.E0(true);
            throw th2;
        }
        a10.E0(true);
        return false;
    }
}
