package v8;

import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import cm.l;
import s8.b;

public final class e implements u0.b {

    /* renamed from: b  reason: collision with root package name */
    private final b f17408b;

    public e(b bVar) {
        l.f(bVar, "repository");
        this.f17408b = bVar;
    }

    public t0 a(Class cls) {
        l.f(cls, "modelClass");
        if (cls.isAssignableFrom(f.class)) {
            return new f(this.f17408b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
