package um;

import an.e;
import cm.l;
import java.io.Closeable;
import java.util.List;
import um.u;
import zm.c;

public final class d0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private d f31946e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f31947f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f31948g;

    /* renamed from: h  reason: collision with root package name */
    private final String f31949h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31950i;

    /* renamed from: j  reason: collision with root package name */
    private final t f31951j;

    /* renamed from: k  reason: collision with root package name */
    private final u f31952k;

    /* renamed from: l  reason: collision with root package name */
    private final e0 f31953l;

    /* renamed from: m  reason: collision with root package name */
    private final d0 f31954m;

    /* renamed from: n  reason: collision with root package name */
    private final d0 f31955n;

    /* renamed from: o  reason: collision with root package name */
    private final d0 f31956o;

    /* renamed from: p  reason: collision with root package name */
    private final long f31957p;

    /* renamed from: q  reason: collision with root package name */
    private final long f31958q;

    /* renamed from: r  reason: collision with root package name */
    private final c f31959r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private b0 f31960a;

        /* renamed from: b  reason: collision with root package name */
        private a0 f31961b;

        /* renamed from: c  reason: collision with root package name */
        private int f31962c;

        /* renamed from: d  reason: collision with root package name */
        private String f31963d;

        /* renamed from: e  reason: collision with root package name */
        private t f31964e;

        /* renamed from: f  reason: collision with root package name */
        private u.a f31965f;

        /* renamed from: g  reason: collision with root package name */
        private e0 f31966g;

        /* renamed from: h  reason: collision with root package name */
        private d0 f31967h;

        /* renamed from: i  reason: collision with root package name */
        private d0 f31968i;

        /* renamed from: j  reason: collision with root package name */
        private d0 f31969j;

        /* renamed from: k  reason: collision with root package name */
        private long f31970k;

        /* renamed from: l  reason: collision with root package name */
        private long f31971l;

        /* renamed from: m  reason: collision with root package name */
        private c f31972m;

        public a() {
            this.f31962c = -1;
            this.f31965f = new u.a();
        }

        private final void e(d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.c() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void f(String str, d0 d0Var) {
            if (d0Var != null) {
                boolean z10 = false;
                if (d0Var.c() == null) {
                    if (d0Var.H() == null) {
                        if (d0Var.f() == null) {
                            if (d0Var.X() == null) {
                                z10 = true;
                            }
                            if (!z10) {
                                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException((str + ".body != null").toString());
            }
        }

        public a a(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            this.f31965f.a(str, str2);
            return this;
        }

        public a b(e0 e0Var) {
            this.f31966g = e0Var;
            return this;
        }

        public d0 c() {
            int i10 = this.f31962c;
            if (i10 >= 0) {
                b0 b0Var = this.f31960a;
                if (b0Var != null) {
                    a0 a0Var = this.f31961b;
                    if (a0Var != null) {
                        String str = this.f31963d;
                        if (str != null) {
                            return new d0(b0Var, a0Var, str, i10, this.f31964e, this.f31965f.e(), this.f31966g, this.f31967h, this.f31968i, this.f31969j, this.f31970k, this.f31971l, this.f31972m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.f31962c).toString());
        }

        public a d(d0 d0Var) {
            f("cacheResponse", d0Var);
            this.f31968i = d0Var;
            return this;
        }

        public a g(int i10) {
            this.f31962c = i10;
            return this;
        }

        public final int h() {
            return this.f31962c;
        }

        public a i(t tVar) {
            this.f31964e = tVar;
            return this;
        }

        public a j(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "value");
            this.f31965f.h(str, str2);
            return this;
        }

        public a k(u uVar) {
            l.f(uVar, "headers");
            this.f31965f = uVar.o();
            return this;
        }

        public final void l(c cVar) {
            l.f(cVar, "deferredTrailers");
            this.f31972m = cVar;
        }

        public a m(String str) {
            l.f(str, "message");
            this.f31963d = str;
            return this;
        }

        public a n(d0 d0Var) {
            f("networkResponse", d0Var);
            this.f31967h = d0Var;
            return this;
        }

        public a o(d0 d0Var) {
            e(d0Var);
            this.f31969j = d0Var;
            return this;
        }

        public a p(a0 a0Var) {
            l.f(a0Var, "protocol");
            this.f31961b = a0Var;
            return this;
        }

        public a q(long j10) {
            this.f31971l = j10;
            return this;
        }

        public a r(b0 b0Var) {
            l.f(b0Var, "request");
            this.f31960a = b0Var;
            return this;
        }

        public a s(long j10) {
            this.f31970k = j10;
            return this;
        }

        public a(d0 d0Var) {
            l.f(d0Var, "response");
            this.f31962c = -1;
            this.f31960a = d0Var.c0();
            this.f31961b = d0Var.Y();
            this.f31962c = d0Var.h();
            this.f31963d = d0Var.E();
            this.f31964e = d0Var.n();
            this.f31965f = d0Var.y().o();
            this.f31966g = d0Var.c();
            this.f31967h = d0Var.H();
            this.f31968i = d0Var.f();
            this.f31969j = d0Var.X();
            this.f31970k = d0Var.i0();
            this.f31971l = d0Var.Z();
            this.f31972m = d0Var.l();
        }
    }

    public d0(b0 b0Var, a0 a0Var, String str, int i10, t tVar, u uVar, e0 e0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, c cVar) {
        l.f(b0Var, "request");
        l.f(a0Var, "protocol");
        l.f(str, "message");
        l.f(uVar, "headers");
        this.f31947f = b0Var;
        this.f31948g = a0Var;
        this.f31949h = str;
        this.f31950i = i10;
        this.f31951j = tVar;
        this.f31952k = uVar;
        this.f31953l = e0Var;
        this.f31954m = d0Var;
        this.f31955n = d0Var2;
        this.f31956o = d0Var3;
        this.f31957p = j10;
        this.f31958q = j11;
        this.f31959r = cVar;
    }

    public static /* synthetic */ String s(d0 d0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d0Var.o(str, str2);
    }

    public final boolean B() {
        int i10 = this.f31950i;
        return 200 <= i10 && 299 >= i10;
    }

    public final String E() {
        return this.f31949h;
    }

    public final d0 H() {
        return this.f31954m;
    }

    public final a R() {
        return new a(this);
    }

    public final d0 X() {
        return this.f31956o;
    }

    public final a0 Y() {
        return this.f31948g;
    }

    public final long Z() {
        return this.f31958q;
    }

    public final e0 c() {
        return this.f31953l;
    }

    public final b0 c0() {
        return this.f31947f;
    }

    public void close() {
        e0 e0Var = this.f31953l;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final d e() {
        d dVar = this.f31946e;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f31924p.b(this.f31952k);
        this.f31946e = b10;
        return b10;
    }

    public final d0 f() {
        return this.f31955n;
    }

    public final List g() {
        String str;
        u uVar = this.f31952k;
        int i10 = this.f31950i;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return q.i();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(uVar, str);
    }

    public final int h() {
        return this.f31950i;
    }

    public final long i0() {
        return this.f31957p;
    }

    public final c l() {
        return this.f31959r;
    }

    public final t n() {
        return this.f31951j;
    }

    public final String o(String str, String str2) {
        l.f(str, "name");
        String l10 = this.f31952k.l(str);
        return l10 != null ? l10 : str2;
    }

    public String toString() {
        return "Response{protocol=" + this.f31948g + ", code=" + this.f31950i + ", message=" + this.f31949h + ", url=" + this.f31947f.j() + '}';
    }

    public final u y() {
        return this.f31952k;
    }
}
