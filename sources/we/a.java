package we;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final ve.a f32563b;

    public a(ve.a aVar) {
        l.f(aVar, "repository");
        this.f32563b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(xe.a.class)) {
            return new xe.a(this.f32563b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
