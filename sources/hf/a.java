package hf;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f24086b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f24086b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(p001if.a.class)) {
            return new p001if.a(this.f24086b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
