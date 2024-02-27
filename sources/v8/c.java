package v8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import s8.b;

public final class c implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f17398b;

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f17398b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(d.class)) {
            return new d(this.f17398b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
