package ca;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f4781b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f4781b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(c.class)) {
            return new c(this.f4781b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
