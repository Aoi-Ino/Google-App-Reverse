package tl;

import bm.p;
import cm.l;
import tl.g;

public abstract class a implements g.b {

    /* renamed from: e  reason: collision with root package name */
    private final g.c f31674e;

    public a(g.c cVar) {
        l.f(cVar, "key");
        this.f31674e = cVar;
    }

    public Object X(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    public g.b f(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    public g g(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    public g.c getKey() {
        return this.f31674e;
    }

    public g l(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
