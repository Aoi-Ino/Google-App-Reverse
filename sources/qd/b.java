package qd;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import pd.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f15403b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f15403b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f15403b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
