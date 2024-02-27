package androidx.lifecycle;

import androidx.lifecycle.k;
import cm.l;

public final class k0 implements o {

    /* renamed from: e  reason: collision with root package name */
    private final n0 f3305e;

    public k0(n0 n0Var) {
        l.f(n0Var, "provider");
        this.f3305e = n0Var;
    }

    public void d(s sVar, k.a aVar) {
        l.f(sVar, "source");
        l.f(aVar, "event");
        if (aVar == k.a.ON_CREATE) {
            sVar.d0().d(this);
            this.f3305e.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
