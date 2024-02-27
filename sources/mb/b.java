package mb;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f13993b;

    public b(e eVar) {
        l.f(eVar, "repository");
        this.f13993b = eVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(d.class)) {
            return new d(this.f13993b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
