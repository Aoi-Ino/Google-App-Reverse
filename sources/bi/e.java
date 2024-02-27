package bi;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wg.a;

public final class e implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f19549b;

    public e(a aVar) {
        l.f(aVar, "repository");
        this.f19549b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f19549b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
