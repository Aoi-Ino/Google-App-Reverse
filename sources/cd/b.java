package cd;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import bd.a;
import cm.l;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f4972b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f4972b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f4972b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
