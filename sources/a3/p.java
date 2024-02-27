package a3;

import java.util.Set;
import y2.c;
import y2.g;
import y2.h;
import y2.i;

final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Set f186a;

    /* renamed from: b  reason: collision with root package name */
    private final o f187b;

    /* renamed from: c  reason: collision with root package name */
    private final s f188c;

    p(Set set, o oVar, s sVar) {
        this.f186a = set;
        this.f187b = oVar;
        this.f188c = sVar;
    }

    public h a(String str, Class cls, c cVar, g gVar) {
        if (this.f186a.contains(cVar)) {
            return new r(this.f187b, str, cVar, gVar, this.f188c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, this.f186a}));
    }
}
