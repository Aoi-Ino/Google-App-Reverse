package ym;

import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import pl.x;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final e f33073h = new e(new c(vm.b.J(vm.b.f32405i + " TaskRunner", true)));
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f33074i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f33075j = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private int f33076a = 10000;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33077b;

    /* renamed from: c  reason: collision with root package name */
    private long f33078c;

    /* renamed from: d  reason: collision with root package name */
    private final List f33079d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List f33080e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f33081f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final a f33082g;

    public interface a {
        void a(e eVar);

        long b();

        void c(e eVar, long j10);

        void execute(Runnable runnable);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Logger a() {
            return e.f33074i;
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadPoolExecutor f33083a;

        public c(ThreadFactory threadFactory) {
            l.f(threadFactory, "threadFactory");
            this.f33083a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(e eVar) {
            l.f(eVar, "taskRunner");
            eVar.notify();
        }

        public long b() {
            return System.nanoTime();
        }

        public void c(e eVar, long j10) {
            l.f(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        public void execute(Runnable runnable) {
            l.f(runnable, "runnable");
            this.f33083a.execute(runnable);
        }
    }

    public static final class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f33084e;

        d(e eVar) {
            this.f33084e = eVar;
        }

        public void run() {
            a d10;
            long j10;
            while (true) {
                synchronized (this.f33084e) {
                    d10 = this.f33084e.d();
                }
                if (d10 != null) {
                    d d11 = d10.d();
                    l.c(d11);
                    boolean isLoggable = e.f33075j.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = d11.h().g().b();
                        b.c(d10, d11, "starting");
                    } else {
                        j10 = -1;
                    }
                    try {
                        this.f33084e.j(d10);
                        x xVar = x.f30437a;
                        if (isLoggable) {
                            b.c(d10, d11, "finished run in " + b.b(d11.h().g().b() - j10));
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            b.c(d10, d11, "failed a run in " + b.b(d11.h().g().b() - j10));
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        l.e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f33074i = logger;
    }

    public e(a aVar) {
        l.f(aVar, "backend");
        this.f33082g = aVar;
    }

    private final void c(a aVar, long j10) {
        if (!vm.b.f32404h || Thread.holdsLock(this)) {
            d d10 = aVar.d();
            l.c(d10);
            if (d10.c() == aVar) {
                boolean d11 = d10.d();
                d10.m(false);
                d10.l((a) null);
                this.f33079d.remove(d10);
                if (j10 != -1 && !d11 && !d10.g()) {
                    d10.k(aVar, j10, true);
                }
                if (!d10.e().isEmpty()) {
                    this.f33080e.add(d10);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    private final void e(a aVar) {
        if (!vm.b.f32404h || Thread.holdsLock(this)) {
            aVar.g(-1);
            d d10 = aVar.d();
            l.c(d10);
            d10.e().remove(aVar);
            this.f33080e.remove(d10);
            d10.l(aVar);
            this.f33079d.add(d10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* access modifiers changed from: private */
    public final void j(a aVar) {
        if (!vm.b.f32404h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f10 = aVar.f();
                synchronized (this) {
                    c(aVar, f10);
                    x xVar = x.f30437a;
                }
                currentThread.setName(name);
            } catch (Throwable th2) {
                synchronized (this) {
                    c(aVar, -1);
                    x xVar2 = x.f30437a;
                    currentThread.setName(name);
                    throw th2;
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            l.e(currentThread2, "Thread.currentThread()");
            sb2.append(currentThread2.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ym.a d() {
        /*
            r14 = this;
            boolean r0 = vm.b.f32404h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            cm.l.e(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.util.List r0 = r14.f33080e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            ym.e$a r0 = r14.f33082g
            long r2 = r0.b()
            java.util.List r0 = r14.f33080e
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x0053:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.next()
            ym.d r7 = (ym.d) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            ym.a r7 = (ym.a) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007f
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x0053
        L_0x007f:
            if (r6 == 0) goto L_0x0083
            r0 = r8
            goto L_0x0086
        L_0x0083:
            r6 = r7
            goto L_0x0053
        L_0x0085:
            r0 = r9
        L_0x0086:
            if (r6 == 0) goto L_0x00a4
            r14.e(r6)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r14.f33077b
            if (r0 != 0) goto L_0x00a3
            java.util.List r0 = r14.f33080e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00a3
        L_0x009c:
            ym.e$a r0 = r14.f33082g
            java.lang.Runnable r1 = r14.f33081f
            r0.execute(r1)
        L_0x00a3:
            return r6
        L_0x00a4:
            boolean r0 = r14.f33077b
            if (r0 == 0) goto L_0x00b5
            long r6 = r14.f33078c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
            ym.e$a r0 = r14.f33082g
            r0.a(r14)
        L_0x00b4:
            return r1
        L_0x00b5:
            r14.f33077b = r8
            long r2 = r2 + r4
            r14.f33078c = r2
            ym.e$a r0 = r14.f33082g     // Catch:{ InterruptedException -> 0x00c5 }
            r0.c(r14, r4)     // Catch:{ InterruptedException -> 0x00c5 }
        L_0x00bf:
            r14.f33077b = r9
            goto L_0x0037
        L_0x00c3:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c5:
            r14.f()     // Catch:{ all -> 0x00c3 }
            goto L_0x00bf
        L_0x00c9:
            r14.f33077b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ym.e.d():ym.a");
    }

    public final void f() {
        for (int size = this.f33079d.size() - 1; size >= 0; size--) {
            ((d) this.f33079d.get(size)).b();
        }
        for (int size2 = this.f33080e.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) this.f33080e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f33080e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f33082g;
    }

    public final void h(d dVar) {
        l.f(dVar, "taskQueue");
        if (!vm.b.f32404h || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    vm.b.a(this.f33080e, dVar);
                } else {
                    this.f33080e.remove(dVar);
                }
            }
            if (this.f33077b) {
                this.f33082g.a(this);
            } else {
                this.f33082g.execute(this.f33081f);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final d i() {
        int i10;
        synchronized (this) {
            i10 = this.f33076a;
            this.f33076a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new d(this, sb2.toString());
    }
}
