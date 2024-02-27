package lm;

import bm.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qm.d0;
import qm.k;
import tl.d;
import tl.g;

public final class n0 extends d0 {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24984i = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_decision");
    private volatile int _decision;

    public n0(g gVar, d dVar) {
        super(gVar, dVar);
    }

    private final boolean N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24984i;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f24984i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24984i;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f24984i.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        if (!N0()) {
            k.c(c.b(this.f30808h), y.a(obj, this.f30808h), (l) null, 2, (Object) null);
        }
    }

    public final Object M0() {
        if (O0()) {
            return d.c();
        }
        Object h10 = s1.h(a0());
        if (!(h10 instanceof u)) {
            return h10;
        }
        throw ((u) h10).f25023a;
    }

    /* access modifiers changed from: protected */
    public void z(Object obj) {
        I0(obj);
    }
}
