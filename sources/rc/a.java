package rc;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f15628b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f15628b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f15628b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
