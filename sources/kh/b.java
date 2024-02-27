package kh;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import jh.a;

public final class b implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f24677b;

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f24677b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(lh.a.class)) {
            return new lh.a(this.f24677b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
