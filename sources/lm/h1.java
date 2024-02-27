package lm;

import bm.l;
import pl.x;

final class h1 extends h {

    /* renamed from: e  reason: collision with root package name */
    private final l f24962e;

    public h1(l lVar) {
        this.f24962e = lVar;
    }

    public void b(Throwable th2) {
        this.f24962e.invoke(th2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return x.f30437a;
    }

    public String toString() {
        return "InvokeOnCancel[" + h0.a(this.f24962e) + '@' + h0.b(this) + ']';
    }
}
