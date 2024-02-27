package qm;

import lm.b0;
import lm.c0;
import tl.g;

public abstract class h {
    public static final void a(g gVar, Throwable th2) {
        for (b0 E : g.a()) {
            try {
                E.E(gVar, th2);
            } catch (Throwable th3) {
                g.b(c0.b(th2, th3));
            }
        }
        try {
            b.a(th2, new i(gVar));
        } catch (Throwable unused) {
        }
        g.b(th2);
    }
}
