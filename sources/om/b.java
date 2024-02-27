package om;

import bm.p;
import nm.a;
import nm.r;
import pl.x;
import pm.d;
import tl.g;

abstract class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private final p f30150d;

    public b(p pVar, g gVar, int i10, a aVar) {
        super(gVar, i10, aVar);
        this.f30150d = pVar;
    }

    static /* synthetic */ Object i(b bVar, r rVar, tl.d dVar) {
        Object h10 = bVar.f30150d.h(rVar, dVar);
        return h10 == d.c() ? h10 : x.f30437a;
    }

    /* access modifiers changed from: protected */
    public Object e(r rVar, tl.d dVar) {
        return i(this, rVar, dVar);
    }

    public String toString() {
        return "block[" + this.f30150d + "] -> " + super.toString();
    }
}
