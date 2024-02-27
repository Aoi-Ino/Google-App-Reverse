package cg;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import eg.a;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f20047b;

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f20047b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f20047b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
