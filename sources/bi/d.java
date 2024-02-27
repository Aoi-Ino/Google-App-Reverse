package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import fi.a;
import fi.b;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f19548b;

    public d(a aVar) {
        l.f(aVar, "repository");
        this.f19548b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f19548b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
