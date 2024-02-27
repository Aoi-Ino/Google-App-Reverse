package zm;

import cm.g;
import cm.l;
import cm.m;
import cn.f;
import cn.i;
import cn.n;
import gn.d;
import in.o;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import um.a0;
import um.b0;
import um.c0;
import um.d0;
import um.f0;
import um.j;
import um.r;
import um.t;
import um.v;
import um.z;
import ym.e;

public final class f extends f.d implements j {

    /* renamed from: t  reason: collision with root package name */
    public static final a f33280t = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private Socket f33281c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f33282d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public t f33283e;

    /* renamed from: f  reason: collision with root package name */
    private a0 f33284f;

    /* renamed from: g  reason: collision with root package name */
    private cn.f f33285g;

    /* renamed from: h  reason: collision with root package name */
    private in.g f33286h;

    /* renamed from: i  reason: collision with root package name */
    private in.f f33287i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f33288j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33289k;

    /* renamed from: l  reason: collision with root package name */
    private int f33290l;

    /* renamed from: m  reason: collision with root package name */
    private int f33291m;

    /* renamed from: n  reason: collision with root package name */
    private int f33292n;

    /* renamed from: o  reason: collision with root package name */
    private int f33293o = 1;

    /* renamed from: p  reason: collision with root package name */
    private final List f33294p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private long f33295q = Long.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    private final h f33296r;

    /* renamed from: s  reason: collision with root package name */
    private final f0 f33297s;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static final class b extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ um.g f33298e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f33299f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ um.a f33300g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(um.g gVar, t tVar, um.a aVar) {
            super(0);
            this.f33298e = gVar;
            this.f33299f = tVar;
            this.f33300g = aVar;
        }

        /* renamed from: b */
        public final List a() {
            gn.c d10 = this.f33298e.d();
            l.c(d10);
            return d10.a(this.f33299f.d(), this.f33300g.l().i());
        }
    }

    static final class c extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f33301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.f33301e = fVar;
        }

        /* renamed from: b */
        public final List a() {
            t d10 = this.f33301e.f33283e;
            l.c(d10);
            Iterable<Certificate> d11 = d10.d();
            ArrayList arrayList = new ArrayList(r.s(d11, 10));
            for (Certificate certificate : d11) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
    }

    public f(h hVar, f0 f0Var) {
        l.f(hVar, "connectionPool");
        l.f(f0Var, "route");
        this.f33296r = hVar;
        this.f33297s = f0Var;
    }

    private final boolean B(List list) {
        Iterable<f0> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (f0 f0Var : iterable) {
            Proxy.Type type = f0Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f33297s.b().type() == type2 && l.a(this.f33297s.d(), f0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i10) {
        Socket socket = this.f33282d;
        l.c(socket);
        in.g gVar = this.f33286h;
        l.c(gVar);
        in.f fVar = this.f33287i;
        l.c(fVar);
        socket.setSoTimeout(0);
        cn.f a10 = new f.b(true, e.f33073h).m(socket, this.f33297s.a().l().i(), gVar, fVar).k(this).l(i10).a();
        this.f33285g = a10;
        this.f33293o = cn.f.H.a().d();
        cn.f.Y0(a10, false, (e) null, 3, (Object) null);
    }

    private final boolean G(v vVar) {
        t tVar;
        if (!vm.b.f32404h || Thread.holdsLock(this)) {
            v l10 = this.f33297s.a().l();
            if (vVar.n() != l10.n()) {
                return false;
            }
            if (l.a(vVar.i(), l10.i())) {
                return true;
            }
            if (this.f33289k || (tVar = this.f33283e) == null) {
                return false;
            }
            l.c(tVar);
            return f(vVar, tVar);
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

    private final boolean f(v vVar, t tVar) {
        List d10 = tVar.d();
        if (!d10.isEmpty()) {
            d dVar = d.f23997a;
            String i10 = vVar.i();
            Object obj = d10.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } else if (dVar.e(i10, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final void i(int i10, int i11, um.e eVar, r rVar) {
        Socket socket;
        int i12;
        Proxy b10 = this.f33297s.b();
        um.a a10 = this.f33297s.a();
        Proxy.Type type = b10.type();
        if (type != null && ((i12 = g.f33302a[type.ordinal()]) == 1 || i12 == 2)) {
            socket = a10.j().createSocket();
            l.c(socket);
        } else {
            socket = new Socket(b10);
        }
        this.f33281c = socket;
        rVar.i(eVar, this.f33297s.d(), b10);
        socket.setSoTimeout(i11);
        try {
            dn.j.f22941c.g().f(socket, this.f33297s.d(), i10);
            try {
                this.f33286h = o.b(o.h(socket));
                this.f33287i = o.a(o.e(socket));
            } catch (NullPointerException e10) {
                if (l.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f33297s.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(zm.b r11) {
        /*
            r10 = this;
            um.f0 r0 = r10.f33297s
            um.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            cm.l.c(r1)     // Catch:{ all -> 0x017c }
            java.net.Socket r3 = r10.f33281c     // Catch:{ all -> 0x017c }
            um.v r4 = r0.l()     // Catch:{ all -> 0x017c }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x017c }
            um.v r5 = r0.l()     // Catch:{ all -> 0x017c }
            int r5 = r5.n()     // Catch:{ all -> 0x017c }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x017c }
            if (r1 == 0) goto L_0x017e
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x017c }
            um.l r11 = r11.a(r1)     // Catch:{ all -> 0x0049 }
            boolean r3 = r11.h()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x004d
            dn.j$a r3 = dn.j.f22941c     // Catch:{ all -> 0x0049 }
            dn.j r3 = r3.g()     // Catch:{ all -> 0x0049 }
            um.v r4 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0049 }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x0049 }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r11 = move-exception
            r2 = r1
            goto L_0x0186
        L_0x004d:
            r1.startHandshake()     // Catch:{ all -> 0x0049 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0049 }
            um.t$a r4 = um.t.f32123e     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "sslSocketSession"
            cm.l.e(r3, r5)     // Catch:{ all -> 0x0049 }
            um.t r4 = r4.a(r3)     // Catch:{ all -> 0x0049 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x0049 }
            cm.l.c(r5)     // Catch:{ all -> 0x0049 }
            um.v r7 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x0049 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0110
            java.util.List r11 = r4.d()     // Catch:{ all -> 0x0049 }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0049 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0049 }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00ec
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0049 }
            if (r11 != 0) goto L_0x0091
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x0049 }
            throw r11     // Catch:{ all -> 0x0049 }
        L_0x0091:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0049 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            um.v r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            um.g$b r0 = um.g.f31984d     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "cert.subjectDN"
            cm.l.e(r0, r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            gn.d r0 = gn.d.f23997a     // Catch:{ all -> 0x0049 }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x0049 }
            r4.append(r11)     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = km.i.h(r11, r2, r6, r2)     // Catch:{ all -> 0x0049 }
            r3.<init>(r11)     // Catch:{ all -> 0x0049 }
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x00ec:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r2.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0049 }
            um.v r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            r2.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0049 }
            r11.<init>(r0)     // Catch:{ all -> 0x0049 }
            throw r11     // Catch:{ all -> 0x0049 }
        L_0x0110:
            um.g r3 = r0.a()     // Catch:{ all -> 0x0049 }
            cm.l.c(r3)     // Catch:{ all -> 0x0049 }
            um.t r5 = new um.t     // Catch:{ all -> 0x0049 }
            um.g0 r6 = r4.e()     // Catch:{ all -> 0x0049 }
            um.i r7 = r4.a()     // Catch:{ all -> 0x0049 }
            java.util.List r8 = r4.c()     // Catch:{ all -> 0x0049 }
            zm.f$b r9 = new zm.f$b     // Catch:{ all -> 0x0049 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0049 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0049 }
            r10.f33283e = r5     // Catch:{ all -> 0x0049 }
            um.v r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            zm.f$c r4 = new zm.f$c     // Catch:{ all -> 0x0049 }
            r4.<init>(r10)     // Catch:{ all -> 0x0049 }
            r3.b(r0, r4)     // Catch:{ all -> 0x0049 }
            boolean r11 = r11.h()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x014f
            dn.j$a r11 = dn.j.f22941c     // Catch:{ all -> 0x0049 }
            dn.j r11 = r11.g()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r11.g(r1)     // Catch:{ all -> 0x0049 }
        L_0x014f:
            r10.f33282d = r1     // Catch:{ all -> 0x0049 }
            in.a0 r11 = in.o.h(r1)     // Catch:{ all -> 0x0049 }
            in.g r11 = in.o.b(r11)     // Catch:{ all -> 0x0049 }
            r10.f33286h = r11     // Catch:{ all -> 0x0049 }
            in.y r11 = in.o.e(r1)     // Catch:{ all -> 0x0049 }
            in.f r11 = in.o.a(r11)     // Catch:{ all -> 0x0049 }
            r10.f33287i = r11     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x016e
            um.a0$a r11 = um.a0.f31898m     // Catch:{ all -> 0x0049 }
            um.a0 r11 = r11.a(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x0170
        L_0x016e:
            um.a0 r11 = um.a0.HTTP_1_1     // Catch:{ all -> 0x0049 }
        L_0x0170:
            r10.f33284f = r11     // Catch:{ all -> 0x0049 }
            dn.j$a r11 = dn.j.f22941c
            dn.j r11 = r11.g()
            r11.b(r1)
            return
        L_0x017c:
            r11 = move-exception
            goto L_0x0186
        L_0x017e:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x017c }
            throw r11     // Catch:{ all -> 0x017c }
        L_0x0186:
            if (r2 == 0) goto L_0x0191
            dn.j$a r0 = dn.j.f22941c
            dn.j r0 = r0.g()
            r0.b(r2)
        L_0x0191:
            if (r2 == 0) goto L_0x0196
            vm.b.k(r2)
        L_0x0196:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.f.j(zm.b):void");
    }

    private final void k(int i10, int i11, int i12, um.e eVar, r rVar) {
        b0 m10 = m();
        v j10 = m10.j();
        int i13 = 0;
        while (i13 < 21) {
            i(i10, i11, eVar, rVar);
            m10 = l(i11, i12, m10, j10);
            if (m10 != null) {
                Socket socket = this.f33281c;
                if (socket != null) {
                    vm.b.k(socket);
                }
                this.f33281c = null;
                this.f33287i = null;
                this.f33286h = null;
                rVar.g(eVar, this.f33297s.d(), this.f33297s.b(), (a0) null);
                i13++;
            } else {
                return;
            }
        }
    }

    private final b0 l(int i10, int i11, b0 b0Var, v vVar) {
        String str = "CONNECT " + vm.b.M(vVar, true) + " HTTP/1.1";
        while (true) {
            in.g gVar = this.f33286h;
            l.c(gVar);
            in.f fVar = this.f33287i;
            l.c(fVar);
            bn.b bVar = new bn.b((z) null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.timeout().g((long) i10, timeUnit);
            fVar.timeout().g((long) i11, timeUnit);
            bVar.A(b0Var.e(), str);
            bVar.c();
            d0.a g10 = bVar.g(false);
            l.c(g10);
            d0 c10 = g10.r(b0Var).c();
            bVar.z(c10);
            int h10 = c10.h();
            if (h10 != 200) {
                if (h10 == 407) {
                    b0 a10 = this.f33297s.a().h().a(this.f33297s, c10);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (p.o("close", d0.s(c10, "Connection", (String) null, 2, (Object) null), true)) {
                        return a10;
                    } else {
                        b0Var = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c10.h());
                }
            } else if (gVar.d().P() && fVar.d().P()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final b0 m() {
        b0 b10 = new b0.a().i(this.f33297s.a().l()).e("CONNECT", (c0) null).c("Host", vm.b.M(this.f33297s.a().l(), true)).c("Proxy-Connection", "Keep-Alive").c("User-Agent", "okhttp/4.9.2").b();
        b0 a10 = this.f33297s.a().h().a(this.f33297s, new d0.a().r(b10).p(a0.HTTP_1_1).g(407).m("Preemptive Authenticate").b(vm.b.f32399c).s(-1).q(-1).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 != null ? a10 : b10;
    }

    private final void n(b bVar, int i10, um.e eVar, r rVar) {
        if (this.f33297s.a().k() == null) {
            List f10 = this.f33297s.a().f();
            a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(a0Var)) {
                this.f33282d = this.f33281c;
                this.f33284f = a0Var;
                F(i10);
                return;
            }
            this.f33282d = this.f33281c;
            this.f33284f = a0.HTTP_1_1;
            return;
        }
        rVar.B(eVar);
        j(bVar);
        rVar.A(eVar, this.f33283e);
        if (this.f33284f == a0.HTTP_2) {
            F(i10);
        }
    }

    public f0 A() {
        return this.f33297s;
    }

    public final void C(long j10) {
        this.f33295q = j10;
    }

    public final void D(boolean z10) {
        this.f33288j = z10;
    }

    public Socket E() {
        Socket socket = this.f33282d;
        l.c(socket);
        return socket;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        int i10;
        try {
            l.f(eVar, "call");
            if (iOException instanceof n) {
                if (((n) iOException).f20460e == cn.b.REFUSED_STREAM) {
                    int i11 = this.f33292n + 1;
                    this.f33292n = i11;
                    if (i11 > 1) {
                        this.f33288j = true;
                        i10 = this.f33290l;
                    }
                } else if (((n) iOException).f20460e != cn.b.CANCEL || !eVar.isCanceled()) {
                    this.f33288j = true;
                    i10 = this.f33290l;
                }
            } else if (!w() || (iOException instanceof cn.a)) {
                this.f33288j = true;
                if (this.f33291m == 0) {
                    if (iOException != null) {
                        h(eVar.j(), this.f33297s, iOException);
                    }
                    i10 = this.f33290l;
                }
            }
            this.f33290l = i10 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public a0 a() {
        a0 a0Var = this.f33284f;
        l.c(a0Var);
        return a0Var;
    }

    public synchronized void b(cn.f fVar, cn.m mVar) {
        l.f(fVar, "connection");
        l.f(mVar, "settings");
        this.f33293o = mVar.d();
    }

    public void c(i iVar) {
        l.f(iVar, "stream");
        iVar.d(cn.b.REFUSED_STREAM, (IOException) null);
    }

    public final void e() {
        Socket socket = this.f33281c;
        if (socket != null) {
            vm.b.k(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, um.e r22, um.r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            cm.l.f(r8, r0)
            java.lang.String r0 = "eventListener"
            cm.l.f(r9, r0)
            um.a0 r0 = r7.f33284f
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = r10
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015c
            um.f0 r0 = r7.f33297s
            um.a r0 = r0.a()
            java.util.List r0 = r0.b()
            zm.b r11 = new zm.b
            r11.<init>(r0)
            um.f0 r1 = r7.f33297s
            um.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0086
            um.l r1 = um.l.f32078j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            um.f0 r0 = r7.f33297s
            um.a r0 = r0.a()
            um.v r0 = r0.l()
            java.lang.String r0 = r0.i()
            dn.j$a r1 = dn.j.f22941c
            dn.j r1 = r1.g()
            boolean r1 = r1.i(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            zm.j r1 = new zm.j
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            zm.j r0 = new zm.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            um.f0 r0 = r7.f33297s
            um.a r0 = r0.a()
            java.util.List r0 = r0.f()
            um.a0 r1 = um.a0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014f
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            um.f0 r0 = r7.f33297s     // Catch:{ IOException -> 0x00bd }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00bd }
            if (r0 == 0) goto L_0x00c5
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00bd }
            java.net.Socket r0 = r7.f33281c     // Catch:{ IOException -> 0x00bd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00e1
        L_0x00b6:
            r14 = r17
            r15 = r18
        L_0x00ba:
            r6 = r20
            goto L_0x00cd
        L_0x00bd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x00c2:
            r6 = r20
            goto L_0x0106
        L_0x00c5:
            r14 = r17
            r15 = r18
            r7.i(r14, r15, r8, r9)     // Catch:{ IOException -> 0x0104 }
            goto L_0x00ba
        L_0x00cd:
            r7.n(r11, r6, r8, r9)     // Catch:{ IOException -> 0x0102 }
            um.f0 r0 = r7.f33297s     // Catch:{ IOException -> 0x0102 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x0102 }
            um.f0 r1 = r7.f33297s     // Catch:{ IOException -> 0x0102 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x0102 }
            um.a0 r2 = r7.f33284f     // Catch:{ IOException -> 0x0102 }
            r9.g(r8, r0, r1, r2)     // Catch:{ IOException -> 0x0102 }
        L_0x00e1:
            um.f0 r0 = r7.f33297s
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00fb
            java.net.Socket r0 = r7.f33281c
            if (r0 == 0) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            zm.j r0 = new zm.j
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00fb:
            long r0 = java.lang.System.nanoTime()
            r7.f33295q = r0
            return
        L_0x0102:
            r0 = move-exception
            goto L_0x0106
        L_0x0104:
            r0 = move-exception
            goto L_0x00c2
        L_0x0106:
            java.net.Socket r1 = r7.f33282d
            if (r1 == 0) goto L_0x010d
            vm.b.k(r1)
        L_0x010d:
            java.net.Socket r1 = r7.f33281c
            if (r1 == 0) goto L_0x0114
            vm.b.k(r1)
        L_0x0114:
            r7.f33282d = r12
            r7.f33281c = r12
            r7.f33286h = r12
            r7.f33287i = r12
            r7.f33283e = r12
            r7.f33284f = r12
            r7.f33285g = r12
            r7.f33293o = r10
            um.f0 r1 = r7.f33297s
            java.net.InetSocketAddress r3 = r1.d()
            um.f0 r1 = r7.f33297s
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.h(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x0141
            zm.j r13 = new zm.j
            r13.<init>(r0)
            goto L_0x0144
        L_0x0141:
            r13.a(r0)
        L_0x0144:
            if (r21 == 0) goto L_0x014e
            boolean r0 = r11.b(r0)
            if (r0 == 0) goto L_0x014e
            goto L_0x009a
        L_0x014e:
            throw r13
        L_0x014f:
            zm.j r0 = new zm.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.f.g(int, int, int, int, boolean, um.e, um.r):void");
    }

    public final void h(z zVar, f0 f0Var, IOException iOException) {
        l.f(zVar, "client");
        l.f(f0Var, "failedRoute");
        l.f(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            um.a a10 = f0Var.a();
            a10.i().connectFailed(a10.l().s(), f0Var.b().address(), iOException);
        }
        zVar.u().b(f0Var);
    }

    public final List o() {
        return this.f33294p;
    }

    public final long p() {
        return this.f33295q;
    }

    public final boolean q() {
        return this.f33288j;
    }

    public final int r() {
        return this.f33290l;
    }

    public t s() {
        return this.f33283e;
    }

    public final synchronized void t() {
        this.f33291m++;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f33297s.a().l().i());
        sb2.append(':');
        sb2.append(this.f33297s.a().l().n());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f33297s.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f33297s.d());
        sb2.append(" cipherSuite=");
        t tVar = this.f33283e;
        if (tVar == null || (obj = tVar.a()) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f33284f);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(um.a aVar, List list) {
        l.f(aVar, "address");
        if (vm.b.f32404h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f33294p.size() >= this.f33293o || this.f33288j || !this.f33297s.a().d(aVar)) {
            return false;
        } else {
            if (l.a(aVar.l().i(), A().a().l().i())) {
                return true;
            }
            if (this.f33285g == null || list == null || !B(list) || aVar.e() != d.f23997a || !G(aVar.l())) {
                return false;
            }
            try {
                um.g a10 = aVar.a();
                l.c(a10);
                String i10 = aVar.l().i();
                t s10 = s();
                l.c(s10);
                a10.a(i10, s10.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean v(boolean z10) {
        long j10;
        if (!vm.b.f32404h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f33281c;
            l.c(socket);
            Socket socket2 = this.f33282d;
            l.c(socket2);
            in.g gVar = this.f33286h;
            l.c(gVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            cn.f fVar = this.f33285g;
            if (fVar != null) {
                return fVar.K0(nanoTime);
            }
            synchronized (this) {
                j10 = nanoTime - this.f33295q;
            }
            if (j10 < 10000000000L || !z10) {
                return true;
            }
            return vm.b.C(socket2, gVar);
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

    public final boolean w() {
        return this.f33285g != null;
    }

    public final an.d x(z zVar, an.g gVar) {
        l.f(zVar, "client");
        l.f(gVar, "chain");
        Socket socket = this.f33282d;
        l.c(socket);
        in.g gVar2 = this.f33286h;
        l.c(gVar2);
        in.f fVar = this.f33287i;
        l.c(fVar);
        cn.f fVar2 = this.f33285g;
        if (fVar2 != null) {
            return new cn.g(zVar, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.timeout().g((long) gVar.h(), timeUnit);
        fVar.timeout().g((long) gVar.j(), timeUnit);
        return new bn.b(zVar, this, gVar2, fVar);
    }

    public final synchronized void y() {
        this.f33289k = true;
    }

    public final synchronized void z() {
        this.f33288j = true;
    }
}
