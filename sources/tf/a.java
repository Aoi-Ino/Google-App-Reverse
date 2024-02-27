package tf;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final sf.a f31336b;

    public a(sf.a aVar) {
        l.f(aVar, "repository");
        this.f31336b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(uf.a.class)) {
            return new uf.a(this.f31336b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
