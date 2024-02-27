package qm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f30804a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f30803a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30804a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f30803a;
        if (obj2 != obj3) {
            return obj2;
        }
        return androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public final Object a(Object obj) {
        Object obj2 = f30804a.get(this);
        if (obj2 == a.f30803a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}
