package zf;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import yf.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f33159b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f33159b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(ag.a.class)) {
            return new ag.a(this.f33159b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
