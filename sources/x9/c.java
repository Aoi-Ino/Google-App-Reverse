package x9;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f18243b;

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f18243b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(d.class)) {
            return new d(this.f18243b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
