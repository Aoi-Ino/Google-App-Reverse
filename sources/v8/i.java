package v8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import s8.a;

public final class i implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f17475b;

    public i(a aVar) {
        l.f(aVar, "repository");
        this.f17475b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(j.class)) {
            return new j(this.f17475b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
