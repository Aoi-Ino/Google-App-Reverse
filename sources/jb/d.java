package jb;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import hb.a;

public final class d implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final a f12829b;

    public d(a aVar) {
        l.f(aVar, "repository");
        this.f12829b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f12829b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
