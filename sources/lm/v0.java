package lm;

import androidx.concurrent.futures.b;
import cm.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qm.n0;
import qm.u;
import tl.g;

public abstract class v0 extends w0 implements m0 {

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25030j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25031k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f25032l;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public static final class a extends n0 {
    }

    static {
        Class<v0> cls = v0.class;
        Class<Object> cls2 = Object.class;
        f25030j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f25031k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f25032l = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    private final void P0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25030j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (b.a(f25030j, this, (Object) null, y0.f25035b)) {
                    return;
                }
            } else if (obj instanceof u) {
                ((u) obj).d();
                return;
            } else if (obj != y0.f25035b) {
                u uVar = new u(8, true);
                l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.a((Runnable) obj);
                if (b.a(f25030j, this, obj, uVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable Q0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25030j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof u) {
                l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u uVar = (u) obj;
                Object j10 = uVar.j();
                if (j10 != u.f30859h) {
                    return (Runnable) j10;
                }
                b.a(f25030j, this, obj, uVar.i());
            } else if (obj == y0.f25035b) {
                return null;
            } else {
                if (b.a(f25030j, this, obj, (Object) null)) {
                    l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean S0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25030j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (T0()) {
                return false;
            }
            if (obj == null) {
                if (b.a(f25030j, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof u) {
                l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u uVar = (u) obj;
                int a10 = uVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    b.a(f25030j, this, obj, uVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == y0.f25035b) {
                return false;
            } else {
                u uVar2 = new u(8, true);
                l.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.a((Runnable) obj);
                uVar2.a(runnable);
                if (b.a(f25030j, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    private final boolean T0() {
        return f25032l.get(this) != 0;
    }

    private final void W0() {
        c.a();
        System.nanoTime();
        a aVar = (a) f25031k.get(this);
    }

    private final void Y0(boolean z10) {
        f25032l.set(this, z10 ? 1 : 0);
    }

    public final void A0(g gVar, Runnable runnable) {
        R0(runnable);
    }

    /* access modifiers changed from: protected */
    public long H0() {
        if (super.H0() == 0) {
            return 0;
        }
        Object obj = f25030j.get(this);
        if (obj != null) {
            if (!(obj instanceof u)) {
                return obj == y0.f25035b ? Long.MAX_VALUE : 0;
            }
            if (!((u) obj).g()) {
                return 0;
            }
        }
        a aVar = (a) f25031k.get(this);
        return Long.MAX_VALUE;
    }

    public void R0(Runnable runnable) {
        if (S0(runnable)) {
            O0();
        } else {
            i0.f24964m.R0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean U0() {
        if (!L0()) {
            return false;
        }
        a aVar = (a) f25031k.get(this);
        Object obj = f25030j.get(this);
        if (obj != null) {
            if (obj instanceof u) {
                return ((u) obj).g();
            }
            if (obj != y0.f25035b) {
                return false;
            }
        }
        return true;
    }

    public long V0() {
        if (M0()) {
            return 0;
        }
        a aVar = (a) f25031k.get(this);
        Runnable Q0 = Q0();
        if (Q0 == null) {
            return H0();
        }
        Q0.run();
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void X0() {
        f25030j.set(this, (Object) null);
        f25031k.set(this, (Object) null);
    }

    public void shutdown() {
        f2.f24958a.b();
        Y0(true);
        P0();
        do {
        } while (V0() <= 0);
        W0();
    }
}
