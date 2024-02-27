package lb;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f13469b;

    public d(e eVar) {
        l.f(eVar, "repository");
        this.f13469b = eVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f13469b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
