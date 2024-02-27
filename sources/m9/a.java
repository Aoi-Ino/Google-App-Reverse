package m9;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final n9.a f13879b;

    public a(n9.a aVar) {
        l.f(aVar, "repository");
        this.f13879b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(t9.a.class)) {
            return new t9.a(this.f13879b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
