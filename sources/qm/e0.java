package qm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lm.y1;
import tl.g;

public abstract class e0 extends e implements y1 {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f30811h = AtomicIntegerFieldUpdater.newUpdater(e0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: g  reason: collision with root package name */
    public final long f30812g;

    public e0(long j10, e0 e0Var, int i10) {
        super(e0Var);
        this.f30812g = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public boolean h() {
        return f30811h.get(this) == n() && !i();
    }

    public final boolean m() {
        return f30811h.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th2, g gVar);

    public final void p() {
        if (f30811h.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30811h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
