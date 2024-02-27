package ic;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f12666b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f12666b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f12666b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
