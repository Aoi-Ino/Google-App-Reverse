package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.b;

public final class f implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f19550b;

    public f(b bVar) {
        l.f(bVar, "repository");
        this.f19550b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f19550b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
