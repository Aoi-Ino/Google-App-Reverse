package ef;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f22950b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f22950b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(gf.a.class)) {
            return new gf.a(this.f22950b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
