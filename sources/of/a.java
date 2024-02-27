package of;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final qf.a f29981b;

    public a(qf.a aVar) {
        l.f(aVar, "repository");
        this.f29981b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f29981b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
