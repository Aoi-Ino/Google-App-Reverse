package de;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final ce.a f22745b;

    public a(ce.a aVar) {
        l.f(aVar, "repository");
        this.f22745b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(ee.a.class)) {
            return new ee.a(this.f22745b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
