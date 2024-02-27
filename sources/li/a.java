package li;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final ji.a f24829b;

    public a(ji.a aVar) {
        l.f(aVar, "repository");
        this.f24829b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(mi.a.class)) {
            return new mi.a(this.f24829b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
