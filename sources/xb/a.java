package xb;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import wb.b;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final wb.a f18251b;

    public a(wb.a aVar) {
        l.f(aVar, "repository");
        this.f18251b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f18251b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
