package lm;

import bm.p;
import cm.l;
import qm.d0;
import qm.l0;
import rm.a;
import rm.b;
import tl.d;
import tl.e;
import tl.h;

abstract /* synthetic */ class g {
    public static final k0 a(d0 d0Var, tl.g gVar, f0 f0Var, p pVar) {
        tl.g d10 = z.d(d0Var, gVar);
        l0 t1Var = f0Var.c() ? new t1(d10, pVar) : new l0(d10, true);
        t1Var.L0(f0Var, t1Var, pVar);
        return t1Var;
    }

    public static /* synthetic */ k0 b(d0 d0Var, tl.g gVar, f0 f0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f31683e;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.DEFAULT;
        }
        return f.a(d0Var, gVar, f0Var, pVar);
    }

    public static final k1 c(d0 d0Var, tl.g gVar, f0 f0Var, p pVar) {
        tl.g d10 = z.d(d0Var, gVar);
        a u1Var = f0Var.c() ? new u1(d10, pVar) : new b2(d10, true);
        u1Var.L0(f0Var, u1Var, pVar);
        return u1Var;
    }

    public static /* synthetic */ k1 d(d0 d0Var, tl.g gVar, f0 f0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f31683e;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.DEFAULT;
        }
        return f.c(d0Var, gVar, f0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final Object e(tl.g gVar, p pVar, d dVar) {
        Object obj;
        tl.g context = dVar.getContext();
        tl.g e10 = z.e(context, gVar);
        o1.f(e10);
        if (e10 == context) {
            d0 d0Var = new d0(e10, dVar);
            obj = b.b(d0Var, d0Var, pVar);
        } else {
            e.b bVar = e.f31680d;
            if (l.a(e10.f(bVar), context.f(bVar))) {
                h2 h2Var = new h2(e10, dVar);
                tl.g context2 = h2Var.getContext();
                Object c10 = l0.c(context2, (Object) null);
                try {
                    Object b10 = b.b(h2Var, h2Var, pVar);
                    l0.a(context2, c10);
                    obj = b10;
                } catch (Throwable th2) {
                    l0.a(context2, c10);
                    throw th2;
                }
            } else {
                n0 n0Var = new n0(e10, dVar);
                a.d(pVar, n0Var, n0Var, (bm.l) null, 4, (Object) null);
                obj = n0Var.M0();
            }
        }
        if (obj == d.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj;
    }
}
