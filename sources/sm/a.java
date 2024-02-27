package sm;

import cm.g;
import cm.l;
import cm.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import pl.x;
import qm.c0;
import qm.h0;

public final class a implements Executor, Closeable {

    /* renamed from: l  reason: collision with root package name */
    public static final C0352a f31271l = new C0352a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f31272m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f31273n;

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31274o;

    /* renamed from: p  reason: collision with root package name */
    public static final h0 f31275p = new h0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: e  reason: collision with root package name */
    public final int f31276e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31277f;

    /* renamed from: g  reason: collision with root package name */
    public final long f31278g;

    /* renamed from: h  reason: collision with root package name */
    public final String f31279h;

    /* renamed from: i  reason: collision with root package name */
    public final d f31280i;

    /* renamed from: j  reason: collision with root package name */
    public final d f31281j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f31282k;
    private volatile long parkedWorkersStack;

    /* renamed from: sm.a$a  reason: collision with other inner class name */
    public static final class C0352a {
        private C0352a() {
        }

        public /* synthetic */ C0352a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31283a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                sm.a$d[] r0 = sm.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sm.a$d r1 = sm.a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sm.a$d r1 = sm.a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                sm.a$d r1 = sm.a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                sm.a$d r1 = sm.a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                sm.a$d r1 = sm.a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f31283a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sm.a.b.<clinit>():void");
        }
    }

    public final class c extends Thread {

        /* renamed from: m  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f31284m = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: e  reason: collision with root package name */
        public final n f31285e;

        /* renamed from: f  reason: collision with root package name */
        private final u f31286f;

        /* renamed from: g  reason: collision with root package name */
        public d f31287g;

        /* renamed from: h  reason: collision with root package name */
        private long f31288h;

        /* renamed from: i  reason: collision with root package name */
        private long f31289i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        private int f31290j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f31291k;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f31285e = new n();
            this.f31286f = new u();
            this.f31287g = d.DORMANT;
            this.nextParkedWorker = a.f31275p;
            this.f31290j = fm.c.f23593e.c();
        }

        private final void b(int i10) {
            if (i10 != 0) {
                a.f31273n.addAndGet(a.this, -2097152);
                if (this.f31287g != d.TERMINATED) {
                    this.f31287g = d.DORMANT;
                }
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.Z();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f31309f.b();
            k(b10);
            c(b10);
            a.this.R(hVar);
            b(b10);
        }

        private final h e(boolean z10) {
            h o10;
            h o11;
            if (z10) {
                boolean z11 = m(a.this.f31276e * 2) == 0;
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f31285e.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f31285e.h();
            if (h10 != null) {
                return h10;
            }
            h hVar = (h) a.this.f31281j.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f31284m;
        }

        private final void k(int i10) {
            this.f31288h = 0;
            if (this.f31287g == d.PARKING) {
                this.f31287g = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f31275p;
        }

        private final void n() {
            if (this.f31288h == 0) {
                this.f31288h = System.nanoTime() + a.this.f31278g;
            }
            LockSupport.parkNanos(a.this.f31278g);
            if (System.nanoTime() - this.f31288h >= 0) {
                this.f31288h = 0;
                w();
            }
        }

        private final h o() {
            d dVar;
            if (m(2) == 0) {
                h hVar = (h) a.this.f31280i.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f31281j;
            } else {
                h hVar2 = (h) a.this.f31281j.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f31280i;
            }
            return (h) dVar.d();
        }

        private final void p() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f31287g != d.TERMINATED) {
                    h g10 = g(this.f31291k);
                    if (g10 != null) {
                        this.f31289i = 0;
                        d(g10);
                    } else {
                        this.f31291k = false;
                        if (this.f31289i == 0) {
                            t();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f31289i);
                            this.f31289i = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j10;
            if (this.f31287g == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater c10 = a.f31273n;
            do {
                j10 = c10.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f31273n.compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f31287g = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.E(this);
                return;
            }
            f31284m.set(this, -1);
            while (l() && f31284m.get(this) == -1 && !a.this.isTerminated() && this.f31287g != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f31273n.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c cVar = (c) aVar.f31282k.b(m10);
                if (cVar == null || cVar == this) {
                    int i13 = i10;
                } else {
                    long n10 = cVar.f31285e.n(i10, this.f31286f);
                    if (n10 == -1) {
                        u uVar = this.f31286f;
                        h hVar = (h) uVar.f20234e;
                        uVar.f20234e = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f31289i = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f31282k) {
                try {
                    if (!aVar.isTerminated()) {
                        if (((int) (a.f31273n.get(aVar) & 2097151)) > aVar.f31276e) {
                            if (f31284m.compareAndSet(this, -1, 1)) {
                                int i10 = this.indexInArray;
                                q(0);
                                aVar.H(this, i10, 0);
                                int andDecrement = (int) (a.f31273n.getAndDecrement(aVar) & 2097151);
                                if (andDecrement != i10) {
                                    Object b10 = aVar.f31282k.b(andDecrement);
                                    l.c(b10);
                                    c cVar = (c) b10;
                                    aVar.f31282k.c(i10, cVar);
                                    cVar.q(i10);
                                    aVar.H(cVar, andDecrement, i10);
                                }
                                aVar.f31282k.c(andDecrement, (Object) null);
                                x xVar = x.f30437a;
                                this.f31287g = d.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h g(boolean z10) {
            return s() ? e(z10) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f31290j;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f31290j = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f31279h);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f31287g;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.f31273n.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f31287g = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        Class<a> cls = a.class;
        f31272m = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f31273n = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f31274o = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public a(int i10, int i11, long j10, String str) {
        this.f31276e = i10;
        this.f31277f = i11;
        this.f31278g = j10;
        this.f31279h = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        } else if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j10 > 0) {
            this.f31280i = new d();
            this.f31281j = new d();
            this.f31282k = new c0((i10 + 1) * 2);
            this.controlState = ((long) i10) << 42;
            this._isTerminated = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
    }

    private final boolean A0() {
        c y10;
        do {
            y10 = y();
            if (y10 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(y10, -1, 0));
        LockSupport.unpark(y10);
        return true;
    }

    private final void Y(long j10, boolean z10) {
        if (!z10 && !A0() && !i0(j10)) {
            A0();
        }
    }

    private final h c0(c cVar, h hVar, boolean z10) {
        if (cVar == null || cVar.f31287g == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f31309f.b() == 0 && cVar.f31287g == d.BLOCKING) {
            return hVar;
        }
        cVar.f31291k = true;
        return cVar.f31285e.a(hVar, z10);
    }

    private final boolean e(h hVar) {
        return (hVar.f31309f.b() == 1 ? this.f31281j : this.f31280i).a(hVar);
    }

    private final int f() {
        synchronized (this.f31282k) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f31273n;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int b10 = f.b(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (b10 >= this.f31276e) {
                    return 0;
                }
                if (i10 >= this.f31277f) {
                    return 0;
                }
                int i11 = ((int) (f31273n.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f31282k.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i11);
                this.f31282k.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i12 = b10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean i0(long j10) {
        if (f.b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f31276e) {
            int f10 = f();
            if (f10 == 1 && this.f31276e > 1) {
                f();
            }
            if (f10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean j0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f31273n.get(aVar);
        }
        return aVar.i0(j10);
    }

    private final c l() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void o(a aVar, Runnable runnable, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f31318g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.n(runnable, iVar, z10);
    }

    private final int s(c cVar) {
        int h10;
        do {
            Object i10 = cVar.i();
            if (i10 == f31275p) {
                return -1;
            }
            if (i10 == null) {
                return 0;
            }
            cVar = (c) i10;
            h10 = cVar.h();
        } while (h10 == 0);
        return h10;
    }

    private final c y() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31272m;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f31282k.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int s10 = s(cVar);
            if (s10 >= 0) {
                if (f31272m.compareAndSet(this, j10, ((long) s10) | j11)) {
                    cVar.r(f31275p);
                    return cVar;
                }
            }
        }
    }

    public final boolean E(c cVar) {
        long j10;
        int h10;
        if (cVar.i() != f31275p) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31272m;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            h10 = cVar.h();
            cVar.r(this.f31282k.b((int) (2097151 & j10)));
        } while (!f31272m.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) h10)));
        return true;
    }

    public final void H(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31272m;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? s(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f31272m.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void R(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            lm.c.a();
            throw th2;
        }
        lm.c.a();
    }

    public final void X(long j10) {
        int i10;
        h hVar;
        if (f31274o.compareAndSet(this, 0, 1)) {
            c l10 = l();
            synchronized (this.f31282k) {
                i10 = (int) (f31273n.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b10 = this.f31282k.b(i11);
                    l.c(b10);
                    c cVar = (c) b10;
                    if (cVar != l10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f31285e.f(this.f31281j);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f31281j.b();
            this.f31280i.b();
            while (true) {
                if (l10 != null) {
                    hVar = l10.g(true);
                    if (hVar != null) {
                        continue;
                        R(hVar);
                    }
                }
                hVar = (h) this.f31280i.d();
                if (hVar == null && (hVar = (h) this.f31281j.d()) == null) {
                    break;
                }
                R(hVar);
            }
            if (l10 != null) {
                l10.u(d.TERMINATED);
            }
            f31272m.set(this, 0);
            f31273n.set(this, 0);
        }
    }

    public final void Z() {
        if (!A0() && !j0(this, 0, 1, (Object) null)) {
            A0();
        }
    }

    public void close() {
        X(10000);
    }

    public void execute(Runnable runnable) {
        o(this, runnable, (i) null, false, 6, (Object) null);
    }

    public final h g(Runnable runnable, i iVar) {
        long a10 = l.f31317f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a10, iVar);
        }
        h hVar = (h) runnable;
        hVar.f31308e = a10;
        hVar.f31309f = iVar;
        return hVar;
    }

    public final boolean isTerminated() {
        return f31274o.get(this) != 0;
    }

    public final void n(Runnable runnable, i iVar, boolean z10) {
        lm.c.a();
        h g10 = g(runnable, iVar);
        boolean z11 = false;
        boolean z12 = g10.f31309f.b() == 1;
        long addAndGet = z12 ? f31273n.addAndGet(this, 2097152) : 0;
        c l10 = l();
        h c02 = c0(l10, g10, z10);
        if (c02 == null || e(c02)) {
            if (z10 && l10 != null) {
                z11 = true;
            }
            if (z12) {
                Y(addAndGet, z11);
            } else if (!z11) {
                Z();
            }
        } else {
            throw new RejectedExecutionException(this.f31279h + " was terminated");
        }
    }

    public String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f31282k.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c cVar = (c) this.f31282k.b(i15);
            if (cVar != null) {
                int e10 = cVar.f31285e.e();
                int i16 = b.f31283a[cVar.f31287g.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(e10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(e10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (e10 > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(e10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = f31273n.get(this);
        return this.f31279h + '@' + lm.h0.b(this) + "[Pool Size {core = " + this.f31276e + ", max = " + this.f31277f + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f31280i.c() + ", global blocking queue size = " + this.f31281j.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f31276e - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }
}
