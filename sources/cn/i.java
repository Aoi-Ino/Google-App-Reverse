package cn;

import cm.g;
import cm.l;
import in.a0;
import in.b0;
import in.e;
import in.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import pl.x;
import um.u;

public final class i {

    /* renamed from: o  reason: collision with root package name */
    public static final a f20412o = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private long f20413a;

    /* renamed from: b  reason: collision with root package name */
    private long f20414b;

    /* renamed from: c  reason: collision with root package name */
    private long f20415c;

    /* renamed from: d  reason: collision with root package name */
    private long f20416d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f20417e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20418f;

    /* renamed from: g  reason: collision with root package name */
    private final c f20419g;

    /* renamed from: h  reason: collision with root package name */
    private final b f20420h;

    /* renamed from: i  reason: collision with root package name */
    private final d f20421i = new d();

    /* renamed from: j  reason: collision with root package name */
    private final d f20422j = new d();

    /* renamed from: k  reason: collision with root package name */
    private b f20423k;

    /* renamed from: l  reason: collision with root package name */
    private IOException f20424l;

    /* renamed from: m  reason: collision with root package name */
    private final int f20425m;

    /* renamed from: n  reason: collision with root package name */
    private final f f20426n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final class b implements y {

        /* renamed from: e  reason: collision with root package name */
        private final e f20427e = new e();

        /* renamed from: f  reason: collision with root package name */
        private u f20428f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f20429g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f20430h;

        public b(boolean z10) {
            this.f20430h = z10;
        }

        private final void c(boolean z10) {
            long min;
            boolean z11;
            synchronized (i.this) {
                try {
                    i.this.s().r();
                    while (i.this.r() >= i.this.q() && !this.f20430h && !this.f20429g && i.this.h() == null) {
                        i.this.D();
                    }
                    i.this.s().y();
                    i.this.c();
                    min = Math.min(i.this.q() - i.this.r(), this.f20427e.H0());
                    i iVar = i.this;
                    iVar.B(iVar.r() + min);
                    z11 = z10 && min == this.f20427e.H0() && i.this.h() == null;
                    x xVar = x.f30437a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i.this.s().r();
            try {
                i.this.g().a1(i.this.j(), z11, this.f20427e, min);
            } finally {
                i.this.s().y();
            }
        }

        public void b0(e eVar, long j10) {
            l.f(eVar, "source");
            i iVar = i.this;
            if (!vm.b.f32404h || !Thread.holdsLock(iVar)) {
                this.f20427e.b0(eVar, j10);
                while (this.f20427e.H0() >= 16384) {
                    c(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f20431i.o().f20430h != false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f20427e.H0() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f20428f == null) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
            if (r10.f20427e.H0() <= 0) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
            c(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
            r0 = r10.f20431i.g();
            r2 = r10.f20431i.j();
            r4 = r10.f20428f;
            cm.l.c(r4);
            r0.b1(r2, r1, vm.b.K(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
            if (r0 == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
            if (r10.f20427e.H0() <= 0) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
            c(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
            if (r1 == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
            r10.f20431i.g().a1(r10.f20431i.j(), true, (in.e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
            r0 = r10.f20431i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r10.f20429g = true;
            r1 = pl.x.f30437a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
            r10.f20431i.g().flush();
            r10.f20431i.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                cn.i r0 = cn.i.this
                boolean r1 = vm.b.f32404h
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                cm.l.e(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                cn.i r0 = cn.i.this
                monitor-enter(r0)
                boolean r1 = r10.f20429g     // Catch:{ all -> 0x00d5 }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                cn.i r1 = cn.i.this     // Catch:{ all -> 0x00d5 }
                cn.b r1 = r1.h()     // Catch:{ all -> 0x00d5 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = r3
                goto L_0x004f
            L_0x004e:
                r1 = r2
            L_0x004f:
                pl.x r4 = pl.x.f30437a     // Catch:{ all -> 0x00d5 }
                monitor-exit(r0)
                cn.i r0 = cn.i.this
                cn.i$b r0 = r0.o()
                boolean r0 = r0.f20430h
                if (r0 != 0) goto L_0x00bb
                in.e r0 = r10.f20427e
                long r4 = r0.H0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = r3
                goto L_0x006b
            L_0x006a:
                r0 = r2
            L_0x006b:
                um.u r4 = r10.f20428f
                if (r4 == 0) goto L_0x0096
            L_0x006f:
                in.e r0 = r10.f20427e
                long r4 = r0.H0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x007d
                r10.c(r2)
                goto L_0x006f
            L_0x007d:
                cn.i r0 = cn.i.this
                cn.f r0 = r0.g()
                cn.i r2 = cn.i.this
                int r2 = r2.j()
                um.u r4 = r10.f20428f
                cm.l.c(r4)
                java.util.List r4 = vm.b.K(r4)
                r0.b1(r2, r1, r4)
                goto L_0x00bb
            L_0x0096:
                if (r0 == 0) goto L_0x00a6
            L_0x0098:
                in.e r0 = r10.f20427e
                long r0 = r0.H0()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00bb
                r10.c(r3)
                goto L_0x0098
            L_0x00a6:
                if (r1 == 0) goto L_0x00bb
                cn.i r0 = cn.i.this
                cn.f r4 = r0.g()
                cn.i r0 = cn.i.this
                int r5 = r0.j()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.a1(r5, r6, r7, r8)
            L_0x00bb:
                cn.i r0 = cn.i.this
                monitor-enter(r0)
                r10.f20429g = r3     // Catch:{ all -> 0x00d2 }
                pl.x r1 = pl.x.f30437a     // Catch:{ all -> 0x00d2 }
                monitor-exit(r0)
                cn.i r0 = cn.i.this
                cn.f r0 = r0.g()
                r0.flush()
                cn.i r0 = cn.i.this
                r0.b()
                return
            L_0x00d2:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00d5:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.i.b.close():void");
        }

        public final boolean e() {
            return this.f20429g;
        }

        public final boolean f() {
            return this.f20430h;
        }

        public void flush() {
            i iVar = i.this;
            if (!vm.b.f32404h || !Thread.holdsLock(iVar)) {
                synchronized (i.this) {
                    i.this.c();
                    x xVar = x.f30437a;
                }
                while (this.f20427e.H0() > 0) {
                    c(false);
                    i.this.g().flush();
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public b0 timeout() {
            return i.this.s();
        }
    }

    public final class c implements a0 {

        /* renamed from: e  reason: collision with root package name */
        private final e f20432e = new e();

        /* renamed from: f  reason: collision with root package name */
        private final e f20433f = new e();

        /* renamed from: g  reason: collision with root package name */
        private u f20434g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f20435h;

        /* renamed from: i  reason: collision with root package name */
        private final long f20436i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f20437j;

        public c(long j10, boolean z10) {
            this.f20436i = j10;
            this.f20437j = z10;
        }

        private final void l(long j10) {
            i iVar = i.this;
            if (!vm.b.f32404h || !Thread.holdsLock(iVar)) {
                i.this.g().Z0(j10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final boolean c() {
            return this.f20435h;
        }

        public void close() {
            long H0;
            synchronized (i.this) {
                this.f20435h = true;
                H0 = this.f20433f.H0();
                this.f20433f.c();
                i iVar = i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    x xVar = x.f30437a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (H0 > 0) {
                l(H0);
            }
            i.this.b();
        }

        public final boolean e() {
            return this.f20437j;
        }

        public final void f(in.g gVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            l.f(gVar, "source");
            i iVar = i.this;
            if (!vm.b.f32404h || !Thread.holdsLock(iVar)) {
                while (j10 > 0) {
                    synchronized (i.this) {
                        z10 = this.f20437j;
                        z11 = false;
                        z12 = this.f20433f.H0() + j10 > this.f20436i;
                        x xVar = x.f30437a;
                    }
                    if (z12) {
                        gVar.skip(j10);
                        i.this.f(b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z10) {
                        gVar.skip(j10);
                        return;
                    } else {
                        long read = gVar.read(this.f20432e, j10);
                        if (read != -1) {
                            j10 -= read;
                            synchronized (i.this) {
                                try {
                                    if (this.f20435h) {
                                        j11 = this.f20432e.H0();
                                        this.f20432e.c();
                                    } else {
                                        if (this.f20433f.H0() == 0) {
                                            z11 = true;
                                        }
                                        this.f20433f.q0(this.f20432e);
                                        if (z11) {
                                            i iVar2 = i.this;
                                            if (iVar2 != null) {
                                                iVar2.notifyAll();
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                            }
                                        }
                                        j11 = 0;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (j11 > 0) {
                                l(j11);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(iVar);
            throw new AssertionError(sb2.toString());
        }

        public final void g(boolean z10) {
            this.f20437j = z10;
        }

        public final void h(u uVar) {
            this.f20434g = uVar;
        }

        /* JADX INFO: finally extract failed */
        public long read(e eVar, long j10) {
            Throwable th2;
            long j11;
            boolean z10;
            e eVar2 = eVar;
            long j12 = j10;
            l.f(eVar2, "sink");
            long j13 = 0;
            if (j12 >= 0) {
                while (true) {
                    synchronized (i.this) {
                        i.this.m().r();
                        try {
                            if (i.this.h() != null) {
                                th2 = i.this.i();
                                if (th2 == null) {
                                    b h10 = i.this.h();
                                    l.c(h10);
                                    th2 = new n(h10);
                                }
                            } else {
                                th2 = null;
                            }
                            if (!this.f20435h) {
                                if (this.f20433f.H0() > j13) {
                                    e eVar3 = this.f20433f;
                                    j11 = eVar3.read(eVar2, Math.min(j12, eVar3.H0()));
                                    i iVar = i.this;
                                    iVar.A(iVar.l() + j11);
                                    long l10 = i.this.l() - i.this.k();
                                    if (th2 == null && l10 >= ((long) (i.this.g().E0().c() / 2))) {
                                        i.this.g().f1(i.this.j(), l10);
                                        i iVar2 = i.this;
                                        iVar2.z(iVar2.l());
                                    }
                                } else if (this.f20437j || th2 != null) {
                                    j11 = -1;
                                } else {
                                    i.this.D();
                                    j11 = -1;
                                    z10 = true;
                                    i.this.m().y();
                                    x xVar = x.f30437a;
                                }
                                z10 = false;
                                i.this.m().y();
                                x xVar2 = x.f30437a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th3) {
                            i.this.m().y();
                            throw th3;
                        }
                    }
                    if (z10) {
                        j13 = 0;
                    } else if (j11 != -1) {
                        l(j11);
                        return j11;
                    } else if (th2 == null) {
                        return -1;
                    } else {
                        l.c(th2);
                        throw th2;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
            }
        }

        public b0 timeout() {
            return i.this.m();
        }
    }

    public final class d extends in.d {
        public d() {
        }

        /* access modifiers changed from: protected */
        public IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void x() {
            i.this.f(b.CANCEL);
            i.this.g().T0();
        }

        public final void y() {
            if (s()) {
                throw t((IOException) null);
            }
        }
    }

    public i(int i10, f fVar, boolean z10, boolean z11, u uVar) {
        l.f(fVar, "connection");
        this.f20425m = i10;
        this.f20426n = fVar;
        this.f20416d = (long) fVar.F0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f20417e = arrayDeque;
        this.f20419g = new c((long) fVar.E0().c(), z11);
        this.f20420h = new b(z10);
        if (uVar != null) {
            if (!t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean e(b bVar, IOException iOException) {
        if (!vm.b.f32404h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f20423k != null) {
                    return false;
                }
                if (this.f20419g.e() && this.f20420h.f()) {
                    return false;
                }
                this.f20423k = bVar;
                this.f20424l = iOException;
                notifyAll();
                x xVar = x.f30437a;
                this.f20426n.S0(this.f20425m);
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void A(long j10) {
        this.f20413a = j10;
    }

    public final void B(long j10) {
        this.f20415c = j10;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized u C() {
        Object removeFirst;
        this.f20421i.r();
        while (this.f20417e.isEmpty() && this.f20423k == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.f20421i.y();
                throw th2;
            }
        }
        this.f20421i.y();
        if (!this.f20417e.isEmpty()) {
            removeFirst = this.f20417e.removeFirst();
            l.e(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th3 = this.f20424l;
            if (th3 == null) {
                b bVar = this.f20423k;
                l.c(bVar);
                th3 = new n(bVar);
            }
            throw th3;
        }
        return (u) removeFirst;
    }

    public final void D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final b0 E() {
        return this.f20422j;
    }

    public final void a(long j10) {
        this.f20416d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (!vm.b.f32404h || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (!this.f20419g.e() && this.f20419g.c()) {
                        if (!this.f20420h.f()) {
                            if (this.f20420h.e()) {
                            }
                        }
                        z10 = true;
                        u10 = u();
                        x xVar = x.f30437a;
                    }
                    z10 = false;
                    u10 = u();
                    x xVar2 = x.f30437a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                d(b.CANCEL, (IOException) null);
            } else if (!u10) {
                this.f20426n.S0(this.f20425m);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    public final void c() {
        if (this.f20420h.e()) {
            throw new IOException("stream closed");
        } else if (this.f20420h.f()) {
            throw new IOException("stream finished");
        } else if (this.f20423k != null) {
            Throwable th2 = this.f20424l;
            if (th2 == null) {
                b bVar = this.f20423k;
                l.c(bVar);
                th2 = new n(bVar);
            }
            throw th2;
        }
    }

    public final void d(b bVar, IOException iOException) {
        l.f(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f20426n.d1(this.f20425m, bVar);
        }
    }

    public final void f(b bVar) {
        l.f(bVar, "errorCode");
        if (e(bVar, (IOException) null)) {
            this.f20426n.e1(this.f20425m, bVar);
        }
    }

    public final f g() {
        return this.f20426n;
    }

    public final synchronized b h() {
        return this.f20423k;
    }

    public final IOException i() {
        return this.f20424l;
    }

    public final int j() {
        return this.f20425m;
    }

    public final long k() {
        return this.f20414b;
    }

    public final long l() {
        return this.f20413a;
    }

    public final d m() {
        return this.f20421i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0013 A[Catch:{ all -> 0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final in.y n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20418f     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0010
            boolean r0 = r2.t()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            r0 = 0
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            goto L_0x0025
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0019
            pl.x r0 = pl.x.f30437a     // Catch:{ all -> 0x000e }
            monitor-exit(r2)
            cn.i$b r0 = r2.f20420h
            return r0
        L_0x0019:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x000e }
            r1.<init>(r0)     // Catch:{ all -> 0x000e }
            throw r1     // Catch:{ all -> 0x000e }
        L_0x0025:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.i.n():in.y");
    }

    public final b o() {
        return this.f20420h;
    }

    public final c p() {
        return this.f20419g;
    }

    public final long q() {
        return this.f20416d;
    }

    public final long r() {
        return this.f20415c;
    }

    public final d s() {
        return this.f20422j;
    }

    public final boolean t() {
        return this.f20426n.s0() == ((this.f20425m & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean u() {
        /*
            r2 = this;
            monitor-enter(r2)
            cn.b r0 = r2.f20423k     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            cn.i$c r0 = r2.f20419g     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x001b
            cn.i$c r0 = r2.f20419g     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0019:
            r0 = move-exception
            goto L_0x0034
        L_0x001b:
            cn.i$b r0 = r2.f20420h     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.f()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002b
            cn.i$b r0 = r2.f20420h     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r2.f20418f     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r2)
            return r1
        L_0x0031:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.i.u():boolean");
    }

    public final b0 v() {
        return this.f20421i;
    }

    public final void w(in.g gVar, int i10) {
        l.f(gVar, "source");
        if (!vm.b.f32404h || !Thread.holdsLock(this)) {
            this.f20419g.f(gVar, (long) i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A[Catch:{ all -> 0x004b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(um.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            cm.l.f(r3, r0)
            boolean r0 = vm.b.f32404h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            cm.l.e(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f20418f     // Catch:{ all -> 0x004b }
            r1 = 1
            if (r0 == 0) goto L_0x004d
            if (r4 != 0) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            cn.i$c r0 = r2.f20419g     // Catch:{ all -> 0x004b }
            r0.h(r3)     // Catch:{ all -> 0x004b }
            goto L_0x0054
        L_0x004b:
            r3 = move-exception
            goto L_0x006f
        L_0x004d:
            r2.f20418f = r1     // Catch:{ all -> 0x004b }
            java.util.ArrayDeque r0 = r2.f20417e     // Catch:{ all -> 0x004b }
            r0.add(r3)     // Catch:{ all -> 0x004b }
        L_0x0054:
            if (r4 == 0) goto L_0x005b
            cn.i$c r3 = r2.f20419g     // Catch:{ all -> 0x004b }
            r3.g(r1)     // Catch:{ all -> 0x004b }
        L_0x005b:
            boolean r3 = r2.u()     // Catch:{ all -> 0x004b }
            r2.notifyAll()     // Catch:{ all -> 0x004b }
            pl.x r4 = pl.x.f30437a     // Catch:{ all -> 0x004b }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006e
            cn.f r3 = r2.f20426n
            int r4 = r2.f20425m
            r3.S0(r4)
        L_0x006e:
            return
        L_0x006f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.i.x(um.u, boolean):void");
    }

    public final synchronized void y(b bVar) {
        l.f(bVar, "errorCode");
        if (this.f20423k == null) {
            this.f20423k = bVar;
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f20414b = j10;
    }
}
