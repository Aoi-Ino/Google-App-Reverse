package qm;

import cm.l;

public abstract class f0 {
    public static Object a(Object obj) {
        return obj;
    }

    public static final e0 b(Object obj) {
        if (obj != d.f30807a) {
            l.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (e0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == d.f30807a;
    }
}
