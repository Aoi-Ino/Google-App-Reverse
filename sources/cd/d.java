package cd;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import bd.b;
import cm.l;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f5028b;

    public d(b bVar) {
        l.f(bVar, "repository");
        this.f5028b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f5028b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
