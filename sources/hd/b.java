package hd;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import ed.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f12091b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f12091b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f12091b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
