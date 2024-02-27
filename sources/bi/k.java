package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.d;

public final class k implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final d f19731b;

    public k(d dVar) {
        l.f(dVar, "repository");
        this.f19731b = dVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(h.class)) {
            return new h(this.f19731b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
