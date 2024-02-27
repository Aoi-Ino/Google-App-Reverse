package zm;

import cm.l;
import dn.j;
import in.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import pl.x;
import um.b0;
import um.d0;
import um.f;
import um.g;
import um.p;
import um.r;
import um.v;
import um.z;

public final class e implements um.e {

    /* renamed from: e  reason: collision with root package name */
    private final h f33257e;

    /* renamed from: f  reason: collision with root package name */
    private final r f33258f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final c f33259g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f33260h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private Object f33261i;

    /* renamed from: j  reason: collision with root package name */
    private d f33262j;

    /* renamed from: k  reason: collision with root package name */
    private f f33263k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f33264l;

    /* renamed from: m  reason: collision with root package name */
    private c f33265m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f33266n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f33267o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33268p = true;

    /* renamed from: q  reason: collision with root package name */
    private volatile boolean f33269q;

    /* renamed from: r  reason: collision with root package name */
    private volatile c f33270r;

    /* renamed from: s  reason: collision with root package name */
    private volatile f f33271s;

    /* renamed from: t  reason: collision with root package name */
    private final z f33272t;

    /* renamed from: u  reason: collision with root package name */
    private final b0 f33273u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f33274v;

    public final class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private volatile AtomicInteger f33275e = new AtomicInteger(0);

        /* renamed from: f  reason: collision with root package name */
        private final f f33276f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f33277g;

        public a(e eVar, f fVar) {
            l.f(fVar, "responseCallback");
            this.f33277g = eVar;
            this.f33276f = fVar;
        }

        public final void a(ExecutorService executorService) {
            l.f(executorService, "executorService");
            p m10 = this.f33277g.j().m();
            if (!vm.b.f32404h || !Thread.holdsLock(m10)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f33277g.w(interruptedIOException);
                    this.f33276f.onFailure(this.f33277g, interruptedIOException);
                    this.f33277g.j().m().g(this);
                } catch (Throwable th2) {
                    this.f33277g.j().m().g(this);
                    throw th2;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                l.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(m10);
                throw new AssertionError(sb2.toString());
            }
        }

        public final e b() {
            return this.f33277g;
        }

        public final AtomicInteger c() {
            return this.f33275e;
        }

        public final String d() {
            return this.f33277g.r().j().i();
        }

        public final void e(a aVar) {
            l.f(aVar, "other");
            this.f33275e = aVar.f33275e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[Catch:{ all -> 0x0087, all -> 0x004e }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[Catch:{ all -> 0x0087, all -> 0x004e }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae A[Catch:{ all -> 0x0087, all -> 0x004e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                zm.e r1 = r7.f33277g
                java.lang.String r1 = r1.x()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                cm.l.e(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                zm.e r0 = r7.f33277g     // Catch:{ all -> 0x004e }
                zm.e$c r0 = r0.f33259g     // Catch:{ all -> 0x004e }
                r0.r()     // Catch:{ all -> 0x004e }
                r0 = 0
                zm.e r3 = r7.f33277g     // Catch:{ IOException -> 0x005a, all -> 0x0055 }
                um.d0 r0 = r3.t()     // Catch:{ IOException -> 0x005a, all -> 0x0055 }
                r3 = 1
                um.f r4 = r7.f33276f     // Catch:{ IOException -> 0x0053, all -> 0x0051 }
                zm.e r5 = r7.f33277g     // Catch:{ IOException -> 0x0053, all -> 0x0051 }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x0053, all -> 0x0051 }
                zm.e r0 = r7.f33277g     // Catch:{ all -> 0x004e }
                um.z r0 = r0.j()     // Catch:{ all -> 0x004e }
                um.p r0 = r0.m()     // Catch:{ all -> 0x004e }
            L_0x0049:
                r0.g(r7)     // Catch:{ all -> 0x004e }
                goto L_0x00c0
            L_0x004e:
                r0 = move-exception
                goto L_0x00d2
            L_0x0051:
                r0 = move-exception
                goto L_0x005f
            L_0x0053:
                r0 = move-exception
                goto L_0x008a
            L_0x0055:
                r3 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x005f
            L_0x005a:
                r3 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x008a
            L_0x005f:
                zm.e r4 = r7.f33277g     // Catch:{ all -> 0x0087 }
                r4.cancel()     // Catch:{ all -> 0x0087 }
                if (r3 != 0) goto L_0x0089
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0087 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
                r4.<init>()     // Catch:{ all -> 0x0087 }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x0087 }
                r4.append(r0)     // Catch:{ all -> 0x0087 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0087 }
                r3.<init>(r4)     // Catch:{ all -> 0x0087 }
                pl.b.a(r3, r0)     // Catch:{ all -> 0x0087 }
                um.f r4 = r7.f33276f     // Catch:{ all -> 0x0087 }
                zm.e r5 = r7.f33277g     // Catch:{ all -> 0x0087 }
                r4.onFailure(r5, r3)     // Catch:{ all -> 0x0087 }
                goto L_0x0089
            L_0x0087:
                r0 = move-exception
                goto L_0x00c4
            L_0x0089:
                throw r0     // Catch:{ all -> 0x0087 }
            L_0x008a:
                if (r3 == 0) goto L_0x00ae
                dn.j$a r3 = dn.j.f22941c     // Catch:{ all -> 0x0087 }
                dn.j r3 = r3.g()     // Catch:{ all -> 0x0087 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
                r4.<init>()     // Catch:{ all -> 0x0087 }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x0087 }
                zm.e r5 = r7.f33277g     // Catch:{ all -> 0x0087 }
                java.lang.String r5 = r5.I()     // Catch:{ all -> 0x0087 }
                r4.append(r5)     // Catch:{ all -> 0x0087 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0087 }
                r5 = 4
                r3.j(r4, r5, r0)     // Catch:{ all -> 0x0087 }
                goto L_0x00b5
            L_0x00ae:
                um.f r3 = r7.f33276f     // Catch:{ all -> 0x0087 }
                zm.e r4 = r7.f33277g     // Catch:{ all -> 0x0087 }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x0087 }
            L_0x00b5:
                zm.e r0 = r7.f33277g     // Catch:{ all -> 0x004e }
                um.z r0 = r0.j()     // Catch:{ all -> 0x004e }
                um.p r0 = r0.m()     // Catch:{ all -> 0x004e }
                goto L_0x0049
            L_0x00c0:
                r1.setName(r2)
                return
            L_0x00c4:
                zm.e r3 = r7.f33277g     // Catch:{ all -> 0x004e }
                um.z r3 = r3.j()     // Catch:{ all -> 0x004e }
                um.p r3 = r3.m()     // Catch:{ all -> 0x004e }
                r3.g(r7)     // Catch:{ all -> 0x004e }
                throw r0     // Catch:{ all -> 0x004e }
            L_0x00d2:
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zm.e.a.run():void");
        }
    }

    public static final class b extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        private final Object f33278a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            l.f(eVar, "referent");
            this.f33278a = obj;
        }

        public final Object a() {
            return this.f33278a;
        }
    }

    public static final class c extends d {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f33279m;

        c(e eVar) {
            this.f33279m = eVar;
        }

        /* access modifiers changed from: protected */
        public void x() {
            this.f33279m.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z10) {
        l.f(zVar, "client");
        l.f(b0Var, "originalRequest");
        this.f33272t = zVar;
        this.f33273u = b0Var;
        this.f33274v = z10;
        this.f33257e = zVar.i().a();
        this.f33258f = zVar.q().a(this);
        c cVar = new c(this);
        cVar.g((long) zVar.f(), TimeUnit.MILLISECONDS);
        x xVar = x.f30437a;
        this.f33259g = cVar;
    }

    private final IOException G(IOException iOException) {
        if (this.f33264l || !this.f33259g.s()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String I() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "canceled " : "");
        sb2.append(this.f33274v ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
    }

    private final IOException d(IOException iOException) {
        Socket z10;
        boolean z11 = vm.b.f32404h;
        if (!z11 || !Thread.holdsLock(this)) {
            f fVar = this.f33263k;
            if (fVar != null) {
                if (!z11 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        z10 = z();
                    }
                    if (this.f33263k == null) {
                        if (z10 != null) {
                            vm.b.k(z10);
                        }
                        this.f33258f.k(this, fVar);
                    } else {
                        if (!(z10 == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    l.e(currentThread, "Thread.currentThread()");
                    sb2.append(currentThread.getName());
                    sb2.append(" MUST NOT hold lock on ");
                    sb2.append(fVar);
                    throw new AssertionError(sb2.toString());
                }
            }
            IOException G = G(iOException);
            if (iOException != null) {
                r rVar = this.f33258f;
                l.c(G);
                rVar.d(this, G);
            } else {
                this.f33258f.c(this);
            }
            return G;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        l.e(currentThread2, "Thread.currentThread()");
        sb3.append(currentThread2.getName());
        sb3.append(" MUST NOT hold lock on ");
        sb3.append(this);
        throw new AssertionError(sb3.toString());
    }

    private final void e() {
        this.f33261i = j.f22941c.g().h("response.body().close()");
        this.f33258f.e(this);
    }

    private final um.a g(v vVar) {
        g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.j()) {
            sSLSocketFactory = this.f33272t.K();
            hostnameVerifier = this.f33272t.v();
            gVar = this.f33272t.g();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new um.a(vVar.i(), vVar.n(), this.f33272t.p(), this.f33272t.J(), sSLSocketFactory, hostnameVerifier, gVar, this.f33272t.D(), this.f33272t.C(), this.f33272t.A(), this.f33272t.j(), this.f33272t.F());
    }

    public final boolean A() {
        d dVar = this.f33262j;
        l.c(dVar);
        return dVar.e();
    }

    public final void C(f fVar) {
        this.f33271s = fVar;
    }

    /* renamed from: D */
    public d timeout() {
        return this.f33259g;
    }

    public final void F() {
        if (!this.f33264l) {
            this.f33264l = true;
            this.f33259g.s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void c(f fVar) {
        l.f(fVar, "connection");
        if (!vm.b.f32404h || Thread.holdsLock(fVar)) {
            if (this.f33263k == null) {
                this.f33263k = fVar;
                fVar.o().add(new b(this, this.f33261i));
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
        sb2.append(fVar);
        throw new AssertionError(sb2.toString());
    }

    public void cancel() {
        if (!this.f33269q) {
            this.f33269q = true;
            c cVar = this.f33270r;
            if (cVar != null) {
                cVar.b();
            }
            f fVar = this.f33271s;
            if (fVar != null) {
                fVar.e();
            }
            this.f33258f.f(this);
        }
    }

    public d0 execute() {
        if (this.f33260h.compareAndSet(false, true)) {
            this.f33259g.r();
            e();
            try {
                this.f33272t.m().c(this);
                return t();
            } finally {
                this.f33272t.m().h(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: f */
    public e clone() {
        return new e(this.f33272t, this.f33273u, this.f33274v);
    }

    public final void h(b0 b0Var, boolean z10) {
        l.f(b0Var, "request");
        if (this.f33265m == null) {
            synchronized (this) {
                if (!(!this.f33267o)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f33266n) {
                    x xVar = x.f30437a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z10) {
                this.f33262j = new d(this.f33257e, g(b0Var.j()), this, this.f33258f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void i(boolean z10) {
        c cVar;
        synchronized (this) {
            if (this.f33268p) {
                x xVar = x.f30437a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.f33270r) != null) {
            cVar.d();
        }
        this.f33265m = null;
    }

    public boolean isCanceled() {
        return this.f33269q;
    }

    public final z j() {
        return this.f33272t;
    }

    public final f k() {
        return this.f33263k;
    }

    public final r m() {
        return this.f33258f;
    }

    public final boolean p() {
        return this.f33274v;
    }

    public final c q() {
        return this.f33265m;
    }

    public final b0 r() {
        return this.f33273u;
    }

    public b0 request() {
        return this.f33273u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final um.d0 t() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            um.z r0 = r12.f33272t
            java.util.List r0 = r0.w()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean unused = ql.v.v(r2, r0)
            an.j r0 = new an.j
            um.z r1 = r12.f33272t
            r0.<init>(r1)
            r2.add(r0)
            an.a r0 = new an.a
            um.z r1 = r12.f33272t
            um.n r1 = r1.k()
            r0.<init>(r1)
            r2.add(r0)
            xm.a r0 = new xm.a
            um.z r1 = r12.f33272t
            r1.e()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            zm.a r0 = zm.a.f33225a
            r2.add(r0)
            boolean r0 = r12.f33274v
            if (r0 != 0) goto L_0x004a
            um.z r0 = r12.f33272t
            java.util.List r0 = r0.x()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean unused = ql.v.v(r2, r0)
        L_0x004a:
            an.b r0 = new an.b
            boolean r1 = r12.f33274v
            r0.<init>(r1)
            r2.add(r0)
            an.g r10 = new an.g
            r3 = 0
            r4 = 0
            um.b0 r5 = r12.f33273u
            um.z r0 = r12.f33272t
            int r6 = r0.h()
            um.z r0 = r12.f33272t
            int r7 = r0.G()
            um.z r0 = r12.f33272t
            int r8 = r0.M()
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            um.b0 r1 = r12.f33273u     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            um.d0 r1 = r10.a(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            boolean r2 = r12.isCanceled()     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            if (r2 != 0) goto L_0x0082
            r12.w(r9)
            return r1
        L_0x0082:
            vm.b.j(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            throw r1     // Catch:{ IOException -> 0x008f, all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x00a5
        L_0x008f:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.w(r0)     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x00a4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x00a5
        L_0x00a4:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x00a5:
            if (r0 != 0) goto L_0x00aa
            r12.w(r9)
        L_0x00aa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.e.t():um.d0");
    }

    public final c u(an.g gVar) {
        l.f(gVar, "chain");
        synchronized (this) {
            if (!this.f33268p) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f33267o)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f33266n) {
                x xVar = x.f30437a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = this.f33262j;
        l.c(dVar);
        c cVar = new c(this, this.f33258f, dVar, dVar.a(this.f33272t, gVar));
        this.f33265m = cVar;
        this.f33270r = cVar;
        synchronized (this) {
            this.f33266n = true;
            this.f33267o = true;
        }
        if (!this.f33269q) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003e A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException v(zm.c r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            cm.l.f(r3, r0)
            zm.c r0 = r2.f33270r
            boolean r3 = cm.l.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f33266n     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005a
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f33267o     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f33266n = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f33267o = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f33266n     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f33267o     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f33267o     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f33268p     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r3
        L_0x0040:
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            pl.x r4 = pl.x.f30437a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0052
            r3 = 0
            r2.f33270r = r3
            zm.f r3 = r2.f33263k
            if (r3 == 0) goto L_0x0052
            r3.t()
        L_0x0052:
            if (r0 == 0) goto L_0x0059
            java.io.IOException r3 = r2.d(r6)
            return r3
        L_0x0059:
            return r6
        L_0x005a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.e.v(zm.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException w(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f33268p) {
                    this.f33268p = false;
                    if (!this.f33266n && !this.f33267o) {
                        z10 = true;
                    }
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? d(iOException) : iOException;
    }

    public final String x() {
        return this.f33273u.j().p();
    }

    public void y(f fVar) {
        l.f(fVar, "responseCallback");
        if (this.f33260h.compareAndSet(false, true)) {
            e();
            this.f33272t.m().b(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final Socket z() {
        f fVar = this.f33263k;
        l.c(fVar);
        if (!vm.b.f32404h || Thread.holdsLock(fVar)) {
            List o10 = fVar.o();
            Iterator it = o10.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (l.a((e) ((Reference) it.next()).get(), this)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                z10 = true;
            }
            if (z10) {
                o10.remove(i10);
                this.f33263k = null;
                if (o10.isEmpty()) {
                    fVar.C(System.nanoTime());
                    if (this.f33257e.c(fVar)) {
                        return fVar.E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
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
