package lf;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f24821b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f24821b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(mf.a.class)) {
            return new mf.a(this.f24821b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
