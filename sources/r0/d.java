package r0;

import cm.g;
import cm.l;
import r0.a;

public final class d extends a {
    public d() {
        this((a) null, 1, (g) null);
    }

    public Object a(a.b bVar) {
        l.f(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        l.f(bVar, "key");
        b().put(bVar, obj);
    }

    public d(a aVar) {
        l.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0208a.f15425b : aVar);
    }
}
