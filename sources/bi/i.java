package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.e;

public final class i implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f19715b;

    public i(e eVar) {
        l.f(eVar, "repository");
        this.f19715b = eVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(j.class)) {
            return new j(this.f19715b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
