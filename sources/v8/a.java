package v8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final s8.a f17378b;

    public a(s8.a aVar) {
        l.f(aVar, "repository");
        this.f17378b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f17378b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
