package ea;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final d f11128b;

    public b(d dVar) {
        l.f(dVar, "repository");
        this.f11128b = dVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f11128b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
