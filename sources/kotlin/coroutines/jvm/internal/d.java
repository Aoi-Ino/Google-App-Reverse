package kotlin.coroutines.jvm.internal;

import cm.l;
import tl.e;
import tl.g;

public abstract class d extends a {
    private final g _context;
    private transient tl.d intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(tl.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public g getContext() {
        g gVar = this._context;
        l.c(gVar);
        return gVar;
    }

    public final tl.d intercepted() {
        tl.d dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().f(e.f31680d);
            if (eVar == null || (dVar = eVar.H(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        tl.d dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b f10 = getContext().f(e.f31680d);
            l.c(f10);
            ((e) f10).Y(dVar);
        }
        this.intercepted = c.f24777e;
    }

    public d(tl.d dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }
}
