package lm;

import java.util.concurrent.CancellationException;
import tl.g;

abstract /* synthetic */ class p1 {
    public static final s a(k1 k1Var) {
        return new n1(k1Var);
    }

    public static /* synthetic */ s b(k1 k1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k1Var = null;
        }
        return o1.a(k1Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        k1 k1Var = (k1) gVar.f(k1.f24977b);
        if (k1Var != null) {
            k1Var.e(cancellationException);
        }
    }

    public static /* synthetic */ void d(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        o1.c(gVar, cancellationException);
    }

    public static final void e(k1 k1Var) {
        if (!k1Var.c()) {
            throw k1Var.c0();
        }
    }

    public static final void f(g gVar) {
        k1 k1Var = (k1) gVar.f(k1.f24977b);
        if (k1Var != null) {
            o1.e(k1Var);
        }
    }
}
