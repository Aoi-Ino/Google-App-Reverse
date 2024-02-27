package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import di.a;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final wg.c f19547b;

    public c(wg.c cVar) {
        l.f(cVar, "repository");
        this.f19547b = cVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f19547b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
