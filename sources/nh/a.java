package nh;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f25140b;

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f25140b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(mh.a.class)) {
            return new mh.a(this.f25140b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
