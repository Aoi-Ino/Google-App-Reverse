package li;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import ji.b;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f24835b;

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f24835b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f24835b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
