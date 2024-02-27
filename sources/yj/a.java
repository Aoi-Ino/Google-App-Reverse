package yj;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import xj.b;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final xj.a f33053b;

    public a(xj.a aVar) {
        l.f(aVar, "repository");
        this.f33053b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f33053b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
