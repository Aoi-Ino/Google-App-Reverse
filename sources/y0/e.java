package y0;

import cm.l;
import d1.h;

public final class e implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f18310a;

    /* renamed from: b  reason: collision with root package name */
    private final c f18311b;

    public e(h.c cVar, c cVar2) {
        l.f(cVar, "delegate");
        l.f(cVar2, "autoCloser");
        this.f18310a = cVar;
        this.f18311b = cVar2;
    }

    /* renamed from: b */
    public d a(h.b bVar) {
        l.f(bVar, "configuration");
        return new d(this.f18310a.a(bVar), this.f18311b);
    }
}
