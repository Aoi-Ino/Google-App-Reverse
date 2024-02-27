package w8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final c f17953b;

    public a(c cVar) {
        l.f(cVar, "repository");
        this.f17953b = cVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f17953b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
