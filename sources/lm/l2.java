package lm;

import kotlin.coroutines.jvm.internal.h;
import pl.x;
import qm.j;
import qm.k;
import tl.d;
import tl.g;

public abstract class l2 {
    public static final Object a(d dVar) {
        Object obj;
        g context = dVar.getContext();
        o1.f(context);
        d b10 = c.b(dVar);
        j jVar = b10 instanceof j ? (j) b10 : null;
        if (jVar == null) {
            obj = x.f30437a;
        } else {
            if (jVar.f30821h.C0(context)) {
                jVar.k(context, x.f30437a);
            } else {
                k2 k2Var = new k2();
                g l10 = context.l(k2Var);
                x xVar = x.f30437a;
                jVar.k(l10, xVar);
                if (k2Var.f24980f && !k.d(jVar)) {
                    obj = xVar;
                }
            }
            obj = d.c();
        }
        if (obj == d.c()) {
            h.c(dVar);
        }
        return obj == d.c() ? obj : x.f30437a;
    }
}
