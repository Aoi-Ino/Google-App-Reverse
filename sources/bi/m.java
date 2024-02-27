package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.e;

public final class m implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f19745b;

    public m(e eVar) {
        l.f(eVar, "repository");
        this.f19745b = eVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(l.class)) {
            return new l(this.f19745b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
