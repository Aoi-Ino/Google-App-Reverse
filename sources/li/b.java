package li;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import ji.c;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final c f24830b;

    public b(c cVar) {
        l.f(cVar, "repository");
        this.f24830b = cVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f24830b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
