package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.f;

public final class n implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f f19746b;

    public n(f fVar) {
        l.f(fVar, "repository");
        this.f19746b = fVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(o.class)) {
            return new o(this.f19746b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
