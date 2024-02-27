package in;

import cm.g;
import cm.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import pl.x;

public class d extends b0 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final long f24452i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final long f24453j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static d f24454k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f24455l = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private boolean f24456f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f24457g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f24458h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d i10 = d.f24454k; i10 != null; i10 = i10.f24457g) {
                    if (i10.f24457g == dVar) {
                        i10.f24457g = dVar.f24457g;
                        dVar.f24457g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ all -> 0x001a }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0078 A[Catch:{ all -> 0x001a }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[EDGE_INSN: B:36:0x0068->B:24:0x0068 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(in.d r6, long r7, boolean r9) {
            /*
                r5 = this;
                java.lang.Class<in.d> r0 = in.d.class
                monitor-enter(r0)
                in.d r1 = in.d.f24454k     // Catch:{ all -> 0x001a }
                if (r1 != 0) goto L_0x001c
                in.d r1 = new in.d     // Catch:{ all -> 0x001a }
                r1.<init>()     // Catch:{ all -> 0x001a }
                in.d.f24454k = r1     // Catch:{ all -> 0x001a }
                in.d$b r1 = new in.d$b     // Catch:{ all -> 0x001a }
                r1.<init>()     // Catch:{ all -> 0x001a }
                r1.start()     // Catch:{ all -> 0x001a }
                goto L_0x001c
            L_0x001a:
                r6 = move-exception
                goto L_0x0087
            L_0x001c:
                long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x001a }
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                if (r9 == 0) goto L_0x0036
                long r3 = r6.c()     // Catch:{ all -> 0x001a }
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x001a }
            L_0x0031:
                long r7 = r7 + r1
                r6.f24458h = r7     // Catch:{ all -> 0x001a }
                goto L_0x0042
            L_0x0036:
                if (r3 == 0) goto L_0x0039
                goto L_0x0031
            L_0x0039:
                if (r9 == 0) goto L_0x0081
                long r7 = r6.c()     // Catch:{ all -> 0x001a }
                r6.f24458h = r7     // Catch:{ all -> 0x001a }
            L_0x0042:
                long r7 = r6.u(r1)     // Catch:{ all -> 0x001a }
                in.d r9 = in.d.f24454k     // Catch:{ all -> 0x001a }
            L_0x004a:
                cm.l.c(r9)     // Catch:{ all -> 0x001a }
                in.d r3 = r9.f24457g     // Catch:{ all -> 0x001a }
                if (r3 == 0) goto L_0x0068
                in.d r3 = r9.f24457g     // Catch:{ all -> 0x001a }
                cm.l.c(r3)     // Catch:{ all -> 0x001a }
                long r3 = r3.u(r1)     // Catch:{ all -> 0x001a }
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L_0x0063
                goto L_0x0068
            L_0x0063:
                in.d r9 = r9.f24457g     // Catch:{ all -> 0x001a }
                goto L_0x004a
            L_0x0068:
                in.d r7 = r9.f24457g     // Catch:{ all -> 0x001a }
                r6.f24457g = r7     // Catch:{ all -> 0x001a }
                r9.f24457g = r6     // Catch:{ all -> 0x001a }
                in.d r6 = in.d.f24454k     // Catch:{ all -> 0x001a }
                if (r9 != r6) goto L_0x007d
                java.lang.Class<in.d> r6 = in.d.class
                r6.notify()     // Catch:{ all -> 0x001a }
            L_0x007d:
                pl.x r6 = pl.x.f30437a     // Catch:{ all -> 0x001a }
                monitor-exit(r0)
                return
            L_0x0081:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x001a }
                r6.<init>()     // Catch:{ all -> 0x001a }
                throw r6     // Catch:{ all -> 0x001a }
            L_0x0087:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: in.d.a.e(in.d, long, boolean):void");
        }

        public final d c() {
            d i10 = d.f24454k;
            l.c(i10);
            d l10 = i10.f24457g;
            Class<d> cls = d.class;
            long nanoTime = System.nanoTime();
            if (l10 == null) {
                cls.wait(d.f24452i);
                d i11 = d.f24454k;
                l.c(i11);
                if (i11.f24457g != null || System.nanoTime() - nanoTime < d.f24453j) {
                    return null;
                }
                return d.f24454k;
            }
            long n10 = l10.u(nanoTime);
            if (n10 > 0) {
                long j10 = n10 / 1000000;
                cls.wait(j10, (int) (n10 - (1000000 * j10)));
                return null;
            }
            d i12 = d.f24454k;
            l.c(i12);
            i12.f24457g = l10.f24457g;
            l10.f24457g = null;
            return l10;
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
            r1.x();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<in.d> r0 = in.d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                in.d$a r1 = in.d.f24455l     // Catch:{ all -> 0x0015 }
                in.d r1 = r1.c()     // Catch:{ all -> 0x0015 }
                in.d r2 = in.d.f24454k     // Catch:{ all -> 0x0015 }
                if (r1 != r2) goto L_0x0017
                r1 = 0
                in.d.f24454k = r1     // Catch:{ all -> 0x0015 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                r1 = move-exception
                goto L_0x0020
            L_0x0017:
                pl.x r2 = pl.x.f30437a     // Catch:{ all -> 0x0015 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.x()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0020:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: in.d.b.run():void");
        }
    }

    public static final class c implements y {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f24459e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y f24460f;

        c(d dVar, y yVar) {
            this.f24459e = dVar;
            this.f24460f = yVar;
        }

        public void b0(e eVar, long j10) {
            l.f(eVar, "source");
            c.b(eVar.H0(), 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    v vVar = eVar.f24463e;
                    while (true) {
                        l.c(vVar);
                        if (j11 >= ((long) 65536)) {
                            break;
                        }
                        j11 += (long) (vVar.f24501c - vVar.f24500b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        }
                        vVar = vVar.f24504f;
                    }
                    d dVar = this.f24459e;
                    dVar.r();
                    try {
                        this.f24460f.b0(eVar, j11);
                        x xVar = x.f30437a;
                        if (!dVar.s()) {
                            j10 -= j11;
                        } else {
                            throw dVar.m((IOException) null);
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (dVar.s()) {
                            e = dVar.m(e);
                        }
                        throw e;
                    } finally {
                        dVar.s();
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: c */
        public d timeout() {
            return this.f24459e;
        }

        public void close() {
            d dVar = this.f24459e;
            dVar.r();
            try {
                this.f24460f.close();
                x xVar = x.f30437a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                dVar.s();
            }
        }

        public void flush() {
            d dVar = this.f24459e;
            dVar.r();
            try {
                this.f24460f.flush();
                x xVar = x.f30437a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f24460f + ')';
        }
    }

    /* renamed from: in.d$d  reason: collision with other inner class name */
    public static final class C0310d implements a0 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f24461e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a0 f24462f;

        C0310d(d dVar, a0 a0Var) {
            this.f24461e = dVar;
            this.f24462f = a0Var;
        }

        /* renamed from: c */
        public d timeout() {
            return this.f24461e;
        }

        public void close() {
            d dVar = this.f24461e;
            dVar.r();
            try {
                this.f24462f.close();
                x xVar = x.f30437a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                dVar.s();
            }
        }

        public long read(e eVar, long j10) {
            l.f(eVar, "sink");
            d dVar = this.f24461e;
            dVar.r();
            try {
                long read = this.f24462f.read(eVar, j10);
                if (!dVar.s()) {
                    return read;
                }
                throw dVar.m((IOException) null);
            } catch (IOException e10) {
                e = e10;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f24462f + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f24452i = millis;
        f24453j = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long u(long j10) {
        return this.f24458h - j10;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!this.f24456f) {
            long h10 = h();
            boolean e10 = e();
            if (h10 != 0 || e10) {
                this.f24456f = true;
                f24455l.e(this, h10, e10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean s() {
        if (!this.f24456f) {
            return false;
        }
        this.f24456f = false;
        return f24455l.d(this);
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y v(y yVar) {
        l.f(yVar, "sink");
        return new c(this, yVar);
    }

    public final a0 w(a0 a0Var) {
        l.f(a0Var, "source");
        return new C0310d(this, a0Var);
    }

    /* access modifiers changed from: protected */
    public void x() {
    }
}
