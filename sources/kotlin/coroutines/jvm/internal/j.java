package kotlin.coroutines.jvm.internal;

import tl.d;
import tl.g;
import tl.h;

public abstract class j extends a {
    public j(d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != h.f31683e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    public g getContext() {
        return h.f31683e;
    }
}
