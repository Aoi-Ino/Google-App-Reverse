package tl;

import bm.l;
import tl.g;

public abstract class b implements g.c {

    /* renamed from: e  reason: collision with root package name */
    private final l f31675e;

    /* renamed from: f  reason: collision with root package name */
    private final g.c f31676f;

    public b(g.c cVar, l lVar) {
        cm.l.f(cVar, "baseKey");
        cm.l.f(lVar, "safeCast");
        this.f31675e = lVar;
        this.f31676f = cVar instanceof b ? ((b) cVar).f31676f : cVar;
    }

    public final boolean a(g.c cVar) {
        cm.l.f(cVar, "key");
        return cVar == this || this.f31676f == cVar;
    }

    public final g.b b(g.b bVar) {
        cm.l.f(bVar, "element");
        return (g.b) this.f31675e.invoke(bVar);
    }
}
