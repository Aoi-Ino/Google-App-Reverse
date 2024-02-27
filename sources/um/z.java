package um;

import cm.g;
import cm.l;
import gn.c;
import gn.d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import um.e;
import um.r;
import zm.i;

public class z implements Cloneable, e.a {
    /* access modifiers changed from: private */
    public static final List H = vm.b.t(a0.HTTP_2, a0.HTTP_1_1);
    /* access modifiers changed from: private */
    public static final List I = vm.b.t(l.f32076h, l.f32078j);
    public static final b J = new b((g) null);
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final long F;
    private final i G;

    /* renamed from: e  reason: collision with root package name */
    private final p f32181e;

    /* renamed from: f  reason: collision with root package name */
    private final k f32182f;

    /* renamed from: g  reason: collision with root package name */
    private final List f32183g;

    /* renamed from: h  reason: collision with root package name */
    private final List f32184h;

    /* renamed from: i  reason: collision with root package name */
    private final r.c f32185i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f32186j;

    /* renamed from: k  reason: collision with root package name */
    private final b f32187k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f32188l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f32189m;

    /* renamed from: n  reason: collision with root package name */
    private final n f32190n;

    /* renamed from: o  reason: collision with root package name */
    private final q f32191o;

    /* renamed from: p  reason: collision with root package name */
    private final Proxy f32192p;

    /* renamed from: q  reason: collision with root package name */
    private final ProxySelector f32193q;

    /* renamed from: r  reason: collision with root package name */
    private final b f32194r;

    /* renamed from: s  reason: collision with root package name */
    private final SocketFactory f32195s;

    /* renamed from: t  reason: collision with root package name */
    private final SSLSocketFactory f32196t;

    /* renamed from: u  reason: collision with root package name */
    private final X509TrustManager f32197u;

    /* renamed from: v  reason: collision with root package name */
    private final List f32198v;

    /* renamed from: w  reason: collision with root package name */
    private final List f32199w;

    /* renamed from: x  reason: collision with root package name */
    private final HostnameVerifier f32200x;

    /* renamed from: y  reason: collision with root package name */
    private final g f32201y;

    /* renamed from: z  reason: collision with root package name */
    private final c f32202z;

    public static final class a {
        private int A;
        private long B;
        private i C;

        /* renamed from: a  reason: collision with root package name */
        private p f32203a = new p();

        /* renamed from: b  reason: collision with root package name */
        private k f32204b = new k();

        /* renamed from: c  reason: collision with root package name */
        private final List f32205c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f32206d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private r.c f32207e = vm.b.e(r.f32114a);

        /* renamed from: f  reason: collision with root package name */
        private boolean f32208f = true;

        /* renamed from: g  reason: collision with root package name */
        private b f32209g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f32210h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f32211i;

        /* renamed from: j  reason: collision with root package name */
        private n f32212j;

        /* renamed from: k  reason: collision with root package name */
        private q f32213k;

        /* renamed from: l  reason: collision with root package name */
        private Proxy f32214l;

        /* renamed from: m  reason: collision with root package name */
        private ProxySelector f32215m;

        /* renamed from: n  reason: collision with root package name */
        private b f32216n;

        /* renamed from: o  reason: collision with root package name */
        private SocketFactory f32217o;

        /* renamed from: p  reason: collision with root package name */
        private SSLSocketFactory f32218p;

        /* renamed from: q  reason: collision with root package name */
        private X509TrustManager f32219q;

        /* renamed from: r  reason: collision with root package name */
        private List f32220r;

        /* renamed from: s  reason: collision with root package name */
        private List f32221s;

        /* renamed from: t  reason: collision with root package name */
        private HostnameVerifier f32222t;

        /* renamed from: u  reason: collision with root package name */
        private g f32223u;

        /* renamed from: v  reason: collision with root package name */
        private c f32224v;

        /* renamed from: w  reason: collision with root package name */
        private int f32225w;

        /* renamed from: x  reason: collision with root package name */
        private int f32226x;

        /* renamed from: y  reason: collision with root package name */
        private int f32227y;

        /* renamed from: z  reason: collision with root package name */
        private int f32228z;

        public a() {
            b bVar = b.f31900a;
            this.f32209g = bVar;
            this.f32210h = true;
            this.f32211i = true;
            this.f32212j = n.f32102a;
            this.f32213k = q.f32112a;
            this.f32216n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            l.e(socketFactory, "SocketFactory.getDefault()");
            this.f32217o = socketFactory;
            b bVar2 = z.J;
            this.f32220r = bVar2.a();
            this.f32221s = bVar2.b();
            this.f32222t = d.f23997a;
            this.f32223u = g.f31983c;
            this.f32226x = 10000;
            this.f32227y = 10000;
            this.f32228z = 10000;
            this.B = 1024;
        }

        public final ProxySelector A() {
            return this.f32215m;
        }

        public final int B() {
            return this.f32227y;
        }

        public final boolean C() {
            return this.f32208f;
        }

        public final i D() {
            return this.C;
        }

        public final SocketFactory E() {
            return this.f32217o;
        }

        public final SSLSocketFactory F() {
            return this.f32218p;
        }

        public final int G() {
            return this.f32228z;
        }

        public final X509TrustManager H() {
            return this.f32219q;
        }

        public final a I(HostnameVerifier hostnameVerifier) {
            l.f(hostnameVerifier, "hostnameVerifier");
            if (!l.a(hostnameVerifier, this.f32222t)) {
                this.C = null;
            }
            this.f32222t = hostnameVerifier;
            return this;
        }

        public final a J(long j10, TimeUnit timeUnit) {
            l.f(timeUnit, "unit");
            this.f32227y = vm.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final a K(boolean z10) {
            this.f32208f = z10;
            return this;
        }

        public final a L(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            l.f(sSLSocketFactory, "sslSocketFactory");
            l.f(x509TrustManager, "trustManager");
            if ((!l.a(sSLSocketFactory, this.f32218p)) || (!l.a(x509TrustManager, this.f32219q))) {
                this.C = null;
            }
            this.f32218p = sSLSocketFactory;
            this.f32224v = c.f23996a.a(x509TrustManager);
            this.f32219q = x509TrustManager;
            return this;
        }

        public final a M(long j10, TimeUnit timeUnit) {
            l.f(timeUnit, "unit");
            this.f32228z = vm.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final a a(w wVar) {
            l.f(wVar, "interceptor");
            this.f32205c.add(wVar);
            return this;
        }

        public final a b(w wVar) {
            l.f(wVar, "interceptor");
            this.f32206d.add(wVar);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(long j10, TimeUnit timeUnit) {
            l.f(timeUnit, "unit");
            this.f32226x = vm.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final b e() {
            return this.f32209g;
        }

        public final c f() {
            return null;
        }

        public final int g() {
            return this.f32225w;
        }

        public final c h() {
            return this.f32224v;
        }

        public final g i() {
            return this.f32223u;
        }

        public final int j() {
            return this.f32226x;
        }

        public final k k() {
            return this.f32204b;
        }

        public final List l() {
            return this.f32220r;
        }

        public final n m() {
            return this.f32212j;
        }

        public final p n() {
            return this.f32203a;
        }

        public final q o() {
            return this.f32213k;
        }

        public final r.c p() {
            return this.f32207e;
        }

        public final boolean q() {
            return this.f32210h;
        }

        public final boolean r() {
            return this.f32211i;
        }

        public final HostnameVerifier s() {
            return this.f32222t;
        }

        public final List t() {
            return this.f32205c;
        }

        public final long u() {
            return this.B;
        }

        public final List v() {
            return this.f32206d;
        }

        public final int w() {
            return this.A;
        }

        public final List x() {
            return this.f32221s;
        }

        public final Proxy y() {
            return this.f32214l;
        }

        public final b z() {
            return this.f32216n;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final List a() {
            return z.I;
        }

        public final List b() {
            return z.H;
        }
    }

    public z() {
        this(new a());
    }

    private final void L() {
        List list = this.f32183g;
        if (list != null) {
            boolean z10 = true;
            if (!list.contains((Object) null)) {
                List list2 = this.f32184h;
                if (list2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                } else if (!list2.contains((Object) null)) {
                    Iterable<l> iterable = this.f32198v;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (l f10 : iterable) {
                            if (f10.f()) {
                                if (this.f32196t == null) {
                                    throw new IllegalStateException("sslSocketFactory == null".toString());
                                } else if (this.f32202z == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                                } else if (this.f32197u == null) {
                                    throw new IllegalStateException("x509TrustManager == null".toString());
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                    if (this.f32196t == null) {
                        if (this.f32202z == null) {
                            if (this.f32197u != null) {
                                z10 = false;
                            }
                            if (!z10) {
                                throw new IllegalStateException("Check failed.".toString());
                            } else if (!l.a(this.f32201y, g.f31983c)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException(("Null network interceptor: " + this.f32184h).toString());
                }
            } else {
                throw new IllegalStateException(("Null interceptor: " + this.f32183g).toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
    }

    public final List A() {
        return this.f32199w;
    }

    public final Proxy C() {
        return this.f32192p;
    }

    public final b D() {
        return this.f32194r;
    }

    public final ProxySelector F() {
        return this.f32193q;
    }

    public final int G() {
        return this.C;
    }

    public final boolean I() {
        return this.f32186j;
    }

    public final SocketFactory J() {
        return this.f32195s;
    }

    public final SSLSocketFactory K() {
        SSLSocketFactory sSLSocketFactory = this.f32196t;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int M() {
        return this.D;
    }

    public e a(b0 b0Var) {
        l.f(b0Var, "request");
        return new zm.e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final b d() {
        return this.f32187k;
    }

    public final c e() {
        return null;
    }

    public final int f() {
        return this.A;
    }

    public final g g() {
        return this.f32201y;
    }

    public final int h() {
        return this.B;
    }

    public final k i() {
        return this.f32182f;
    }

    public final List j() {
        return this.f32198v;
    }

    public final n k() {
        return this.f32190n;
    }

    public final p m() {
        return this.f32181e;
    }

    public final q p() {
        return this.f32191o;
    }

    public final r.c q() {
        return this.f32185i;
    }

    public final boolean r() {
        return this.f32188l;
    }

    public final boolean t() {
        return this.f32189m;
    }

    public final i u() {
        return this.G;
    }

    public final HostnameVerifier v() {
        return this.f32200x;
    }

    public final List w() {
        return this.f32183g;
    }

    public final List x() {
        return this.f32184h;
    }

    public final int z() {
        return this.E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006f, code lost:
        if (r0 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(um.z.a r4) {
        /*
            r3 = this;
            java.lang.String r0 = "builder"
            cm.l.f(r4, r0)
            r3.<init>()
            um.p r0 = r4.n()
            r3.f32181e = r0
            um.k r0 = r4.k()
            r3.f32182f = r0
            java.util.List r0 = r4.t()
            java.util.List r0 = vm.b.O(r0)
            r3.f32183g = r0
            java.util.List r0 = r4.v()
            java.util.List r0 = vm.b.O(r0)
            r3.f32184h = r0
            um.r$c r0 = r4.p()
            r3.f32185i = r0
            boolean r0 = r4.C()
            r3.f32186j = r0
            um.b r0 = r4.e()
            r3.f32187k = r0
            boolean r0 = r4.q()
            r3.f32188l = r0
            boolean r0 = r4.r()
            r3.f32189m = r0
            um.n r0 = r4.m()
            r3.f32190n = r0
            r4.f()
            um.q r0 = r4.o()
            r3.f32191o = r0
            java.net.Proxy r0 = r4.y()
            r3.f32192p = r0
            java.net.Proxy r0 = r4.y()
            if (r0 == 0) goto L_0x0064
        L_0x0061:
            fn.a r0 = fn.a.f23595a
            goto L_0x0071
        L_0x0064:
            java.net.ProxySelector r0 = r4.A()
            if (r0 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x006f:
            if (r0 == 0) goto L_0x0061
        L_0x0071:
            r3.f32193q = r0
            um.b r0 = r4.z()
            r3.f32194r = r0
            javax.net.SocketFactory r0 = r4.E()
            r3.f32195s = r0
            java.util.List r0 = r4.l()
            r3.f32198v = r0
            java.util.List r1 = r4.x()
            r3.f32199w = r1
            javax.net.ssl.HostnameVerifier r1 = r4.s()
            r3.f32200x = r1
            int r1 = r4.g()
            r3.A = r1
            int r1 = r4.j()
            r3.B = r1
            int r1 = r4.B()
            r3.C = r1
            int r1 = r4.G()
            r3.D = r1
            int r1 = r4.w()
            r3.E = r1
            long r1 = r4.u()
            r3.F = r1
            zm.i r1 = r4.D()
            if (r1 == 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            zm.i r1 = new zm.i
            r1.<init>()
        L_0x00c1:
            r3.G = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00d3
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00d3
            goto L_0x013a
        L_0x00d3:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x013a
            java.lang.Object r1 = r0.next()
            um.l r1 = (um.l) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x00d7
            javax.net.ssl.SSLSocketFactory r0 = r4.F()
            if (r0 == 0) goto L_0x0115
            javax.net.ssl.SSLSocketFactory r0 = r4.F()
            r3.f32196t = r0
            gn.c r0 = r4.h()
            cm.l.c(r0)
            r3.f32202z = r0
            javax.net.ssl.X509TrustManager r1 = r4.H()
            cm.l.c(r1)
            r3.f32197u = r1
        L_0x0107:
            um.g r4 = r4.i()
            cm.l.c(r0)
            um.g r4 = r4.e(r0)
        L_0x0112:
            r3.f32201y = r4
            goto L_0x0144
        L_0x0115:
            dn.j$a r0 = dn.j.f22941c
            dn.j r1 = r0.g()
            javax.net.ssl.X509TrustManager r1 = r1.o()
            r3.f32197u = r1
            dn.j r0 = r0.g()
            cm.l.c(r1)
            javax.net.ssl.SSLSocketFactory r0 = r0.n(r1)
            r3.f32196t = r0
            gn.c$a r0 = gn.c.f23996a
            cm.l.c(r1)
            gn.c r0 = r0.a(r1)
            r3.f32202z = r0
            goto L_0x0107
        L_0x013a:
            r4 = 0
            r3.f32196t = r4
            r3.f32202z = r4
            r3.f32197u = r4
            um.g r4 = um.g.f31983c
            goto L_0x0112
        L_0x0144:
            r3.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um.z.<init>(um.z$a):void");
    }
}
