package lm;

import cm.l;
import pl.p;
import pl.q;
import pl.x;
import qm.j;
import qm.l0;
import tl.d;
import tl.g;

public abstract class p0 {
    public static final void a(o0 o0Var, int i10) {
        d c10 = o0Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(c10 instanceof j) || b(i10) != b(o0Var.f24987g)) {
            d(o0Var, c10, z10);
            return;
        }
        a0 a0Var = ((j) c10).f30821h;
        g context = c10.getContext();
        if (a0Var.C0(context)) {
            a0Var.A0(context, o0Var);
        } else {
            e(o0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(o0 o0Var, d dVar, boolean z10) {
        Object e10;
        Object g10 = o0Var.g();
        Throwable d10 = o0Var.d(g10);
        if (d10 != null) {
            p.a aVar = p.f30426e;
            e10 = q.a(d10);
        } else {
            p.a aVar2 = p.f30426e;
            e10 = o0Var.e(g10);
        }
        Object a10 = p.a(e10);
        if (z10) {
            l.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            j jVar = (j) dVar;
            d dVar2 = jVar.f30822i;
            Object obj = jVar.f30824k;
            g context = dVar2.getContext();
            Object c10 = l0.c(context, obj);
            h2 g11 = c10 != l0.f30829a ? z.g(dVar2, context, c10) : null;
            try {
                jVar.f30822i.resumeWith(a10);
                x xVar = x.f30437a;
            } finally {
                if (g11 == null || g11.M0()) {
                    l0.a(context, c10);
                }
            }
        } else {
            dVar.resumeWith(a10);
        }
    }

    private static final void e(o0 o0Var) {
        u0 a10 = f2.f24958a.a();
        if (a10.K0()) {
            a10.G0(o0Var);
            return;
        }
        a10.I0(true);
        try {
            d(o0Var, o0Var.c(), true);
            do {
            } while (a10.M0());
        } catch (Throwable th2) {
            a10.E0(true);
            throw th2;
        }
        a10.E0(true);
    }
}
