package v8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import s8.b;

public final class g implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f17435b;

    public g(b bVar) {
        l.f(bVar, "repository");
        this.f17435b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(h.class)) {
            return new h(this.f17435b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
