package qc;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final pc.a f15360b;

    public a(pc.a aVar) {
        l.f(aVar, "repository");
        this.f15360b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f15360b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
