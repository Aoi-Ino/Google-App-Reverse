package lm;

import pl.o;
import pl.t;
import pl.x;
import qm.d0;
import qm.l0;
import tl.d;
import tl.g;

public final class h2 extends d0 {

    /* renamed from: i  reason: collision with root package name */
    private final ThreadLocal f24963i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h2(tl.g r3, tl.d r4) {
        /*
            r2 = this;
            lm.i2 r0 = lm.i2.f24968e
            tl.g$b r1 = r3.f(r0)
            if (r1 != 0) goto L_0x000d
            tl.g r0 = r3.l(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f24963i = r0
            tl.g r4 = r4.getContext()
            tl.e$b r0 = tl.e.f31680d
            tl.g$b r4 = r4.f(r0)
            boolean r4 = r4 instanceof lm.a0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = qm.l0.c(r3, r4)
            qm.l0.a(r3, r4)
            r2.N0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm.h2.<init>(tl.g, tl.d):void");
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        if (this.threadLocalIsSet) {
            o oVar = (o) this.f24963i.get();
            if (oVar != null) {
                l0.a((g) oVar.a(), oVar.b());
            }
            this.f24963i.remove();
        }
        Object a10 = y.a(obj, this.f30808h);
        d dVar = this.f30808h;
        g context = dVar.getContext();
        h2 h2Var = null;
        Object c10 = l0.c(context, h2Var);
        if (c10 != l0.f30829a) {
            h2Var = z.g(dVar, context, c10);
        }
        try {
            this.f30808h.resumeWith(a10);
            x xVar = x.f30437a;
        } finally {
            if (h2Var == null || h2Var.M0()) {
                l0.a(context, c10);
            }
        }
    }

    public final boolean M0() {
        boolean z10 = this.threadLocalIsSet && this.f24963i.get() == null;
        this.f24963i.remove();
        return !z10;
    }

    public final void N0(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f24963i.set(t.a(gVar, obj));
    }
}
