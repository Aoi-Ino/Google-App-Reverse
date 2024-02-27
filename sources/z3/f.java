package z3;

import java.util.Iterator;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f18877a;

    f(a aVar) {
        this.f18877a = aVar;
    }

    public final void a(c cVar) {
        this.f18877a.f18872a = cVar;
        Iterator it = this.f18877a.f18874c.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(this.f18877a.f18872a);
        }
        this.f18877a.f18874c.clear();
        this.f18877a.f18873b = null;
    }
}
