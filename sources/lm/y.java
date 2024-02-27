package lm;

import bm.l;
import cm.g;
import pl.p;
import pl.q;
import tl.d;

public abstract class y {
    public static final Object a(Object obj, d dVar) {
        if (obj instanceof u) {
            p.a aVar = p.f30426e;
            obj = q.a(((u) obj).f25023a);
        }
        return p.a(obj);
    }

    public static final Object b(Object obj, l lVar) {
        Throwable b10 = p.b(obj);
        if (b10 == null) {
            return lVar != null ? new v(obj, lVar) : obj;
        }
        return new u(b10, false, 2, (g) null);
    }

    public static final Object c(Object obj, j jVar) {
        Throwable b10 = p.b(obj);
        return b10 == null ? obj : new u(b10, false, 2, (g) null);
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
