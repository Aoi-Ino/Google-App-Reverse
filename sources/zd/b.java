package zd;

import ae.a;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final yd.b f33156b;

    public b(yd.b bVar) {
        l.f(bVar, "repository");
        this.f33156b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f33156b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
