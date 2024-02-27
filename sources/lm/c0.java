package lm;

import qm.h;
import tl.g;

public abstract class c0 {
    public static final void a(g gVar, Throwable th2) {
        try {
            b0 b0Var = (b0) gVar.f(b0.f24945a);
            if (b0Var != null) {
                b0Var.E(gVar, th2);
            } else {
                h.a(gVar, th2);
            }
        } catch (Throwable th3) {
            h.a(gVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        b.a(runtimeException, th2);
        return runtimeException;
    }
}
