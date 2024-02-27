package ba;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final y9.a f4489b;

    public a(y9.a aVar) {
        l.f(aVar, "repository");
        this.f4489b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f4489b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
