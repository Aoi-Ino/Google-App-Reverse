package zm;

import an.d;
import an.h;
import cm.l;
import in.a0;
import in.e;
import in.i;
import in.j;
import in.o;
import in.y;
import java.io.IOException;
import java.net.ProtocolException;
import um.b0;
import um.c0;
import um.d0;
import um.e0;
import um.r;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f33230a;

    /* renamed from: b  reason: collision with root package name */
    private final f f33231b;

    /* renamed from: c  reason: collision with root package name */
    private final e f33232c;

    /* renamed from: d  reason: collision with root package name */
    private final r f33233d;

    /* renamed from: e  reason: collision with root package name */
    private final d f33234e;

    /* renamed from: f  reason: collision with root package name */
    private final d f33235f;

    private final class a extends i {

        /* renamed from: f  reason: collision with root package name */
        private boolean f33236f;

        /* renamed from: g  reason: collision with root package name */
        private long f33237g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f33238h;

        /* renamed from: i  reason: collision with root package name */
        private final long f33239i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f33240j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, y yVar, long j10) {
            super(yVar);
            l.f(yVar, "delegate");
            this.f33240j = cVar;
            this.f33239i = j10;
        }

        private final IOException c(IOException iOException) {
            if (this.f33236f) {
                return iOException;
            }
            this.f33236f = true;
            return this.f33240j.a(this.f33237g, false, true, iOException);
        }

        public void b0(e eVar, long j10) {
            l.f(eVar, "source");
            if (!this.f33238h) {
                long j11 = this.f33239i;
                if (j11 == -1 || this.f33237g + j10 <= j11) {
                    try {
                        super.b0(eVar, j10);
                        this.f33237g += j10;
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f33239i + " bytes but received " + (this.f33237g + j10));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!this.f33238h) {
                this.f33238h = true;
                long j10 = this.f33239i;
                if (j10 == -1 || this.f33237g == j10) {
                    try {
                        super.close();
                        c((IOException) null);
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw c(e10);
            }
        }
    }

    public final class b extends j {

        /* renamed from: e  reason: collision with root package name */
        private long f33241e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f33242f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f33243g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f33244h;

        /* renamed from: i  reason: collision with root package name */
        private final long f33245i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f33246j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, a0 a0Var, long j10) {
            super(a0Var);
            l.f(a0Var, "delegate");
            this.f33246j = cVar;
            this.f33245i = j10;
            if (j10 == 0) {
                c((IOException) null);
            }
        }

        public final IOException c(IOException iOException) {
            if (this.f33243g) {
                return iOException;
            }
            this.f33243g = true;
            if (iOException == null && this.f33242f) {
                this.f33242f = false;
                this.f33246j.i().v(this.f33246j.g());
            }
            return this.f33246j.a(this.f33241e, true, false, iOException);
        }

        public void close() {
            if (!this.f33244h) {
                this.f33244h = true;
                try {
                    super.close();
                    c((IOException) null);
                } catch (IOException e10) {
                    throw c(e10);
                }
            }
        }

        public long read(e eVar, long j10) {
            l.f(eVar, "sink");
            if (!this.f33244h) {
                try {
                    long read = delegate().read(eVar, j10);
                    if (this.f33242f) {
                        this.f33242f = false;
                        this.f33246j.i().v(this.f33246j.g());
                    }
                    if (read == -1) {
                        c((IOException) null);
                        return -1;
                    }
                    long j11 = this.f33241e + read;
                    long j12 = this.f33245i;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f33245i + " bytes but received " + j11);
                        }
                    }
                    this.f33241e = j11;
                    if (j11 == j12) {
                        c((IOException) null);
                    }
                    return read;
                } catch (IOException e10) {
                    throw c(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public c(e eVar, r rVar, d dVar, d dVar2) {
        l.f(eVar, "call");
        l.f(rVar, "eventListener");
        l.f(dVar, "finder");
        l.f(dVar2, "codec");
        this.f33232c = eVar;
        this.f33233d = rVar;
        this.f33234e = dVar;
        this.f33235f = dVar2;
        this.f33231b = dVar2.h();
    }

    private final void s(IOException iOException) {
        this.f33234e.h(iOException);
        this.f33235f.h().H(this.f33232c, iOException);
    }

    public final IOException a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            s(iOException);
        }
        if (z11) {
            r rVar = this.f33233d;
            e eVar = this.f33232c;
            if (iOException != null) {
                rVar.r(eVar, iOException);
            } else {
                rVar.p(eVar, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f33233d.w(this.f33232c, iOException);
            } else {
                this.f33233d.u(this.f33232c, j10);
            }
        }
        return this.f33232c.v(this, z11, z10, iOException);
    }

    public final void b() {
        this.f33235f.cancel();
    }

    public final y c(b0 b0Var, boolean z10) {
        l.f(b0Var, "request");
        this.f33230a = z10;
        c0 a10 = b0Var.a();
        l.c(a10);
        long contentLength = a10.contentLength();
        this.f33233d.q(this.f33232c);
        return new a(this, this.f33235f.e(b0Var, contentLength), contentLength);
    }

    public final void d() {
        this.f33235f.cancel();
        this.f33232c.v(this, true, true, (IOException) null);
    }

    public final void e() {
        try {
            this.f33235f.c();
        } catch (IOException e10) {
            this.f33233d.r(this.f33232c, e10);
            s(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f33235f.d();
        } catch (IOException e10) {
            this.f33233d.r(this.f33232c, e10);
            s(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f33232c;
    }

    public final f h() {
        return this.f33231b;
    }

    public final r i() {
        return this.f33233d;
    }

    public final d j() {
        return this.f33234e;
    }

    public final boolean k() {
        return !l.a(this.f33234e.d().l().i(), this.f33231b.A().a().l().i());
    }

    public final boolean l() {
        return this.f33230a;
    }

    public final void m() {
        this.f33235f.h().z();
    }

    public final void n() {
        this.f33232c.v(this, true, false, (IOException) null);
    }

    public final e0 o(d0 d0Var) {
        l.f(d0Var, "response");
        try {
            String s10 = d0.s(d0Var, "Content-Type", (String) null, 2, (Object) null);
            long b10 = this.f33235f.b(d0Var);
            return new h(s10, b10, o.b(new b(this, this.f33235f.f(d0Var), b10)));
        } catch (IOException e10) {
            this.f33233d.w(this.f33232c, e10);
            s(e10);
            throw e10;
        }
    }

    public final d0.a p(boolean z10) {
        try {
            d0.a g10 = this.f33235f.g(z10);
            if (g10 != null) {
                g10.l(this);
            }
            return g10;
        } catch (IOException e10) {
            this.f33233d.w(this.f33232c, e10);
            s(e10);
            throw e10;
        }
    }

    public final void q(d0 d0Var) {
        l.f(d0Var, "response");
        this.f33233d.x(this.f33232c, d0Var);
    }

    public final void r() {
        this.f33233d.y(this.f33232c);
    }

    public final void t(b0 b0Var) {
        l.f(b0Var, "request");
        try {
            this.f33233d.t(this.f33232c);
            this.f33235f.a(b0Var);
            this.f33233d.s(this.f33232c, b0Var);
        } catch (IOException e10) {
            this.f33233d.r(this.f33232c, e10);
            s(e10);
            throw e10;
        }
    }
}
