package mk;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f25102b;

    public b(e eVar) {
        l.f(eVar, "repository");
        this.f25102b = eVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f25102b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
