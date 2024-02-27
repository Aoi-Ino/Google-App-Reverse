package ze;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f33157b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f33157b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(af.a.class)) {
            return new af.a(this.f33157b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
