package sj;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import rj.b;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final rj.a f31258b;

    public a(rj.a aVar) {
        l.f(aVar, "repository");
        this.f31258b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f31258b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
