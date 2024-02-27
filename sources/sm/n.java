package sm;

import androidx.concurrent.futures.b;
import cm.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nm.i;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f31321b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31322c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31323d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31324e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray f31325a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<n> cls = n.class;
        f31321b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f31322c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f31323d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f31324e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f31309f.b() == 1) {
            f31324e.incrementAndGet(this);
        }
        int i10 = f31322c.get(this) & 127;
        while (this.f31325a.get(i10) != null) {
            Thread.yield();
        }
        this.f31325a.lazySet(i10, hVar);
        f31322c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null && hVar.f31309f.b() == 1) {
            f31324e.decrementAndGet(this);
        }
    }

    private final int d() {
        return f31322c.get(this) - f31323d.get(this);
    }

    private final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31323d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f31322c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f31325a.getAndSet(i11, (Object) null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f31321b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z11 = true;
                if (hVar.f31309f.b() != 1) {
                    z11 = false;
                }
                if (z11 == z10) {
                }
            }
            int i10 = f31323d.get(this);
            int i11 = f31322c.get(this);
            while (i10 != i11) {
                if (z10 && f31324e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z10);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f31323d.get(this);
        int i12 = f31322c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f31324e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z10);
            if (m10 != null) {
                return m10;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f31325a.get(i11);
        if (hVar != null) {
            boolean z11 = true;
            if (hVar.f31309f.b() != 1) {
                z11 = false;
            }
            if (z11 == z10 && i.a(this.f31325a, i11, hVar, (Object) null)) {
                if (z10) {
                    f31324e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i10, u uVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f31321b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2;
            }
            int i11 = 1;
            if (hVar.f31309f.b() != 1) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2;
            }
            long a10 = l.f31317f.a() - hVar.f31308e;
            long j10 = l.f31313b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        uVar.f20234e = hVar;
        return -1;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f31321b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f31321b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f31321b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f31321b.getAndSet(this, (Object) null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i10, u uVar) {
        h i11 = i10 == 3 ? i() : l(i10);
        if (i11 == null) {
            return o(i10, uVar);
        }
        uVar.f20234e = i11;
        return -1;
    }
}
