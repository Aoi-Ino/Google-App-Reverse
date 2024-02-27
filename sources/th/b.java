package th;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import sh.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f31425b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f31425b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(uh.a.class)) {
            return new uh.a(this.f31425b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
