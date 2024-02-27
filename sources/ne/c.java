package ne;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f25132b;

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f25132b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f25132b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
