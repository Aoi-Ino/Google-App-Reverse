package zm;

import cm.g;
import cm.l;
import dn.j;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import pl.x;
import ym.d;
import ym.e;
import zm.e;

public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f33303f = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f33304a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33305b;

    /* renamed from: c  reason: collision with root package name */
    private final b f33306c = new b(this, vm.b.f32405i + " ConnectionPool");

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue f33307d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    private final int f33308e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b extends ym.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f33309e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, String str) {
            super(str, false, 2, (g) null);
            this.f33309e = hVar;
        }

        public long f() {
            return this.f33309e.b(System.nanoTime());
        }
    }

    public h(e eVar, int i10, long j10, TimeUnit timeUnit) {
        l.f(eVar, "taskRunner");
        l.f(timeUnit, "timeUnit");
        this.f33308e = i10;
        this.f33304a = timeUnit.toNanos(j10);
        this.f33305b = eVar.i();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
        }
    }

    private final int d(f fVar, long j10) {
        if (!vm.b.f32404h || Thread.holdsLock(fVar)) {
            List o10 = fVar.o();
            int i10 = 0;
            while (i10 < o10.size()) {
                Reference reference = (Reference) o10.get(i10);
                if (reference.get() != null) {
                    i10++;
                } else {
                    j.f22941c.g().l("A connection to " + fVar.A().a().l() + " was leaked. " + "Did you forget to close a response body?", ((e.b) reference).a());
                    o10.remove(i10);
                    fVar.D(true);
                    if (o10.isEmpty()) {
                        fVar.C(j10 - this.f33304a);
                        return 0;
                    }
                }
            }
            return o10.size();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    public final boolean a(um.a aVar, e eVar, List list, boolean z10) {
        l.f(aVar, "address");
        l.f(eVar, "call");
        Iterator it = this.f33307d.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            l.e(fVar, "connection");
            synchronized (fVar) {
                if (z10) {
                    try {
                        if (!fVar.w()) {
                            x xVar = x.f30437a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fVar.u(aVar, list)) {
                    eVar.c(fVar);
                    return true;
                }
                x xVar2 = x.f30437a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        vm.b.k(r3.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r10.f33307d.isEmpty() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        r10.f33305b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue r0 = r10.f33307d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0041
            java.lang.Object r6 = r0.next()
            zm.f r6 = (zm.f) r6
            java.lang.String r7 = "connection"
            cm.l.e(r6, r7)
            monitor-enter(r6)
            int r7 = r10.d(r6, r11)     // Catch:{ all -> 0x0039 }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.p()     // Catch:{ all -> 0x0039 }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x003b
            pl.x r3 = pl.x.f30437a     // Catch:{ all -> 0x0039 }
            r3 = r6
            r4 = r7
            goto L_0x003d
        L_0x0039:
            r11 = move-exception
            goto L_0x003f
        L_0x003b:
            pl.x r7 = pl.x.f30437a     // Catch:{ all -> 0x0039 }
        L_0x003d:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003f:
            monitor-exit(r6)
            throw r11
        L_0x0041:
            long r6 = r10.f33304a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            int r0 = r10.f33308e
            if (r1 <= r0) goto L_0x004c
            goto L_0x0056
        L_0x004c:
            if (r1 <= 0) goto L_0x0050
            long r6 = r6 - r4
            return r6
        L_0x0050:
            if (r2 <= 0) goto L_0x0053
            return r6
        L_0x0053:
            r11 = -1
            return r11
        L_0x0056:
            cm.l.c(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.o()     // Catch:{ all -> 0x0095 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0095 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0095 }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x006c
            monitor-exit(r3)
            return r6
        L_0x006c:
            long r8 = r3.p()     // Catch:{ all -> 0x0095 }
            long r8 = r8 + r4
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0077
            monitor-exit(r3)
            return r6
        L_0x0077:
            r3.D(r1)     // Catch:{ all -> 0x0095 }
            java.util.concurrent.ConcurrentLinkedQueue r11 = r10.f33307d     // Catch:{ all -> 0x0095 }
            r11.remove(r3)     // Catch:{ all -> 0x0095 }
            monitor-exit(r3)
            java.net.Socket r11 = r3.E()
            vm.b.k(r11)
            java.util.concurrent.ConcurrentLinkedQueue r11 = r10.f33307d
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0094
            ym.d r11 = r10.f33305b
            r11.a()
        L_0x0094:
            return r6
        L_0x0095:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.h.b(long):long");
    }

    public final boolean c(f fVar) {
        l.f(fVar, "connection");
        if (vm.b.f32404h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        } else if (fVar.q() || this.f33308e == 0) {
            fVar.D(true);
            this.f33307d.remove(fVar);
            if (this.f33307d.isEmpty()) {
                this.f33305b.a();
            }
            return true;
        } else {
            d.j(this.f33305b, this.f33306c, 0, 2, (Object) null);
            return false;
        }
    }

    public final void e(f fVar) {
        l.f(fVar, "connection");
        if (!vm.b.f32404h || Thread.holdsLock(fVar)) {
            this.f33307d.add(fVar);
            d.j(this.f33305b, this.f33306c, 0, 2, (Object) null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }
}
