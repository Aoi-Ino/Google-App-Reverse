package lm;

import bm.p;
import kotlin.coroutines.jvm.internal.h;
import qm.d0;
import qm.f;
import rm.b;
import tl.d;
import tl.g;

public abstract class e0 {
    public static final d0 a(g gVar) {
        if (gVar.f(k1.f24977b) == null) {
            gVar = gVar.l(p1.b((k1) null, 1, (Object) null));
        }
        return new f(gVar);
    }

    public static final d0 b() {
        return new f(d2.b((k1) null, 1, (Object) null).l(q0.c()));
    }

    public static final Object c(p pVar, d dVar) {
        d0 d0Var = new d0(dVar.getContext(), dVar);
        Object b10 = b.b(d0Var, d0Var, pVar);
        if (b10 == d.c()) {
            h.c(dVar);
        }
        return b10;
    }
}
