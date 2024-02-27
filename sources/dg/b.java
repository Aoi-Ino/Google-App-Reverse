package dg;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final cg.b f22773b;

    public b(cg.b bVar) {
        l.f(bVar, "repository");
        this.f22773b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(eg.b.class)) {
            return new eg.b(this.f22773b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
