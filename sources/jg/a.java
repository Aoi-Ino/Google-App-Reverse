package jg;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final ig.a f24569b;

    public a(ig.a aVar) {
        l.f(aVar, "repository");
        this.f24569b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(kg.a.class)) {
            return new kg.a(this.f24569b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
