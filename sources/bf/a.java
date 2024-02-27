package bf;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f19430b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f19430b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(cf.a.class)) {
            return new cf.a(this.f19430b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
