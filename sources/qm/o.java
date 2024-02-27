package qm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lm.a0;
import lm.c0;
import lm.j0;
import lm.m0;
import tl.g;
import tl.h;

public final class o extends a0 implements m0 {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f30837l = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final a0 f30838g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30839h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ m0 f30840i;

    /* renamed from: j  reason: collision with root package name */
    private final t f30841j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f30842k;
    private volatile int runningWorkers;

    private final class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private Runnable f30843e;

        public a(Runnable runnable) {
            this.f30843e = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f30843e.run();
                } catch (Throwable th2) {
                    c0.a(h.f31683e, th2);
                }
                Runnable F0 = o.this.G0();
                if (F0 != null) {
                    this.f30843e = F0;
                    i10++;
                    if (i10 >= 16 && o.this.f30838g.C0(o.this)) {
                        o.this.f30838g.A0(o.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public o(a0 a0Var, int i10) {
        this.f30838g = a0Var;
        this.f30839h = i10;
        m0 m0Var = a0Var instanceof m0 ? (m0) a0Var : null;
        this.f30840i = m0Var == null ? j0.a() : m0Var;
        this.f30841j = new t(false);
        this.f30842k = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable G0() {
        while (true) {
            Runnable runnable = (Runnable) this.f30841j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f30842k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30837l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f30841j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean H0() {
        synchronized (this.f30842k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f30837l;
            if (atomicIntegerFieldUpdater.get(this) >= this.f30839h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public void A0(g gVar, Runnable runnable) {
        Runnable G0;
        this.f30841j.a(runnable);
        if (f30837l.get(this) < this.f30839h && H0() && (G0 = G0()) != null) {
            this.f30838g.A0(this, new a(G0));
        }
    }

    public void B0(g gVar, Runnable runnable) {
        Runnable G0;
        this.f30841j.a(runnable);
        if (f30837l.get(this) < this.f30839h && H0() && (G0 = G0()) != null) {
            this.f30838g.B0(this, new a(G0));
        }
    }
}
