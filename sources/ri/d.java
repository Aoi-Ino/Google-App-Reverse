package ri;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f31071b;

    public d(a aVar) {
        l.f(aVar, "repository");
        this.f31071b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f31071b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
