package mg;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final lg.a f25086b;

    public a(lg.a aVar) {
        l.f(aVar, "repository");
        this.f25086b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(ng.a.class)) {
            return new ng.a(this.f25086b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
