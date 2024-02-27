package oh;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import qh.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f30097b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f30097b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f30097b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
