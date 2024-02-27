package sj;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import rj.c;
import rj.d;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final c f31259b;

    public b(c cVar) {
        l.f(cVar, "repository");
        this.f31259b = cVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(d.class)) {
            return new d(this.f31259b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
