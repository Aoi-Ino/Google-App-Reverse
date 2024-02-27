package zd;

import ae.b;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final yd.a f33155b;

    public a(yd.a aVar) {
        l.f(aVar, "repository");
        this.f33155b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f33155b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
