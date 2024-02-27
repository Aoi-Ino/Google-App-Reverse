package k9;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;

public final class a implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final i9.a f13097b;

    public a(i9.a aVar) {
        l.f(aVar, "repository");
        this.f13097b = aVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(this.f13097b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
