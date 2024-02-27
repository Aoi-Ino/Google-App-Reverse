package lm;

import pl.p;
import pl.q;
import pl.x;

final class a2 extends q1 {

    /* renamed from: i  reason: collision with root package name */
    private final k f24944i;

    public a2(k kVar) {
        this.f24944i = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        x((Throwable) obj);
        return x.f30437a;
    }

    public void x(Throwable th2) {
        k kVar;
        Object h10;
        Object a02 = y().a0();
        if (a02 instanceof u) {
            kVar = this.f24944i;
            p.a aVar = p.f30426e;
            h10 = q.a(((u) a02).f25023a);
        } else {
            kVar = this.f24944i;
            p.a aVar2 = p.f30426e;
            h10 = s1.h(a02);
        }
        kVar.resumeWith(p.a(h10));
    }
}
