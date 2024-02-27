package lm;

import cm.l;
import sm.h;
import tl.d;

public abstract class o0 extends h {

    /* renamed from: g  reason: collision with root package name */
    public int f24987g;

    public o0(int i10) {
        this.f24987g = i10;
    }

    public abstract void b(Object obj, Throwable th2);

    public abstract d c();

    public Throwable d(Object obj) {
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null) {
            return uVar.f25023a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void f(Throwable th2, Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                b.a(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            l.c(th2);
            c0.a(c().getContext(), new g0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    public abstract Object g();

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r4.M0() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r4.M0() != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            sm.i r0 = r10.f31309f
            tl.d r1 = r10.c()     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            cm.l.d(r1, r2)     // Catch:{ all -> 0x0023 }
            qm.j r1 = (qm.j) r1     // Catch:{ all -> 0x0023 }
            tl.d r2 = r1.f30822i     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.f30824k     // Catch:{ all -> 0x0023 }
            tl.g r3 = r2.getContext()     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = qm.l0.c(r3, r1)     // Catch:{ all -> 0x0023 }
            qm.h0 r4 = qm.l0.f30829a     // Catch:{ all -> 0x0023 }
            r5 = 0
            if (r1 == r4) goto L_0x0026
            lm.h2 r4 = lm.z.g(r2, r3, r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r1 = move-exception
            goto L_0x00b4
        L_0x0026:
            r4 = r5
        L_0x0027:
            tl.g r6 = r2.getContext()     // Catch:{ all -> 0x0046 }
            java.lang.Object r7 = r10.g()     // Catch:{ all -> 0x0046 }
            java.lang.Throwable r8 = r10.d(r7)     // Catch:{ all -> 0x0046 }
            if (r8 != 0) goto L_0x0048
            int r9 = r10.f24987g     // Catch:{ all -> 0x0046 }
            boolean r9 = lm.p0.b(r9)     // Catch:{ all -> 0x0046 }
            if (r9 == 0) goto L_0x0048
            lm.k1$b r9 = lm.k1.f24977b     // Catch:{ all -> 0x0046 }
            tl.g$b r6 = r6.f(r9)     // Catch:{ all -> 0x0046 }
            lm.k1 r6 = (lm.k1) r6     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r2 = move-exception
            goto L_0x00a8
        L_0x0048:
            r6 = r5
        L_0x0049:
            if (r6 == 0) goto L_0x0066
            boolean r9 = r6.c()     // Catch:{ all -> 0x0046 }
            if (r9 != 0) goto L_0x0066
            java.util.concurrent.CancellationException r6 = r6.c0()     // Catch:{ all -> 0x0046 }
            r10.b(r7, r6)     // Catch:{ all -> 0x0046 }
            pl.p$a r7 = pl.p.f30426e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = pl.q.a(r6)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = pl.p.a(r6)     // Catch:{ all -> 0x0046 }
        L_0x0062:
            r2.resumeWith(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x007e
        L_0x0066:
            if (r8 == 0) goto L_0x0073
            pl.p$a r6 = pl.p.f30426e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = pl.q.a(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = pl.p.a(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0062
        L_0x0073:
            pl.p$a r6 = pl.p.f30426e     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = pl.p.a(r6)     // Catch:{ all -> 0x0046 }
            goto L_0x0062
        L_0x007e:
            pl.x r2 = pl.x.f30437a     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0088
            boolean r2 = r4.M0()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x008b
        L_0x0088:
            qm.l0.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x008b:
            r0.a()     // Catch:{ all -> 0x0095 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            pl.p$a r1 = pl.p.f30426e
            java.lang.Object r0 = pl.q.a(r0)
            java.lang.Object r0 = pl.p.a(r0)
        L_0x00a0:
            java.lang.Throwable r0 = pl.p.b(r0)
            r10.f(r5, r0)
            goto L_0x00d2
        L_0x00a8:
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r4.M0()     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x00b3
        L_0x00b0:
            qm.l0.a(r3, r1)     // Catch:{ all -> 0x0023 }
        L_0x00b3:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x00b4:
            pl.p$a r2 = pl.p.f30426e     // Catch:{ all -> 0x00c0 }
            r0.a()     // Catch:{ all -> 0x00c0 }
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = pl.p.a(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00cb
        L_0x00c0:
            r0 = move-exception
            pl.p$a r2 = pl.p.f30426e
            java.lang.Object r0 = pl.q.a(r0)
            java.lang.Object r0 = pl.p.a(r0)
        L_0x00cb:
            java.lang.Throwable r0 = pl.p.b(r0)
            r10.f(r1, r0)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.o0.run():void");
    }
}
