package b9;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import c9.a;
import cm.l;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f4488b;

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f4488b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f4488b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
