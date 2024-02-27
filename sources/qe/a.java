package qe;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final pe.a f30542b;

    public a(pe.a aVar) {
        l.f(aVar, "repository");
        this.f30542b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f30542b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
