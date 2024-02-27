package rm;

import bm.l;
import pl.p;
import pl.q;
import pl.x;
import qm.k;
import tl.d;

public abstract class a {
    private static final void a(d dVar, Throwable th2) {
        p.a aVar = p.f30426e;
        dVar.resumeWith(p.a(q.a(th2)));
        throw th2;
    }

    public static final void b(bm.p pVar, Object obj, d dVar, l lVar) {
        try {
            d b10 = c.b(c.a(pVar, obj, dVar));
            p.a aVar = p.f30426e;
            k.b(b10, p.a(x.f30437a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final void c(d dVar, d dVar2) {
        try {
            d b10 = c.b(dVar);
            p.a aVar = p.f30426e;
            k.c(b10, p.a(x.f30437a), (l) null, 2, (Object) null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    public static /* synthetic */ void d(bm.p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, dVar, lVar);
    }
}
