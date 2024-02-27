package rm;

import bm.p;
import cm.y;
import kotlin.coroutines.jvm.internal.h;
import lm.s1;
import lm.u;
import pl.p;
import pl.q;
import qm.d0;
import qm.l0;
import tl.d;
import tl.g;

public abstract class b {
    public static final void a(p pVar, Object obj, d dVar) {
        Object obj2;
        g context;
        Object c10;
        d a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = l0.c(context, (Object) null);
            obj2 = ((p) y.d(pVar, 2)).h(obj, a10);
            l0.a(context, c10);
            if (obj2 == d.c()) {
                return;
            }
        } catch (Throwable th2) {
            p.a aVar = pl.p.f30426e;
            obj2 = q.a(th2);
        }
        a10.resumeWith(pl.p.a(obj2));
    }

    public static final Object b(d0 d0Var, Object obj, bm.p pVar) {
        Object obj2;
        Object l02;
        try {
            obj2 = ((bm.p) y.d(pVar, 2)).h(obj, d0Var);
        } catch (Throwable th2) {
            obj2 = new u(th2, false, 2, (cm.g) null);
        }
        if (obj2 == d.c() || (l02 = d0Var.l0(obj2)) == s1.f25009b) {
            return d.c();
        }
        if (!(l02 instanceof u)) {
            return s1.h(l02);
        }
        throw ((u) l02).f25023a;
    }
}
