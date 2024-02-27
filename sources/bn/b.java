package bn;

import an.i;
import cm.l;
import in.a0;
import in.b0;
import in.k;
import in.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import org.json.HTTP;
import um.d0;
import um.n;
import um.u;
import um.v;
import um.z;

public final class b implements an.d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f20001h = new d((cm.g) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f20002a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f20003b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public u f20004c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final z f20005d;

    /* renamed from: e  reason: collision with root package name */
    private final zm.f f20006e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final in.g f20007f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final in.f f20008g;

    private abstract class a implements a0 {

        /* renamed from: e  reason: collision with root package name */
        private final k f20009e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20010f;

        public a() {
            this.f20009e = new k(b.this.f20007f.timeout());
        }

        /* access modifiers changed from: protected */
        public final boolean c() {
            return this.f20010f;
        }

        public final void e() {
            if (b.this.f20002a != 6) {
                if (b.this.f20002a == 5) {
                    b.this.r(this.f20009e);
                    b.this.f20002a = 6;
                    return;
                }
                throw new IllegalStateException("state: " + b.this.f20002a);
            }
        }

        /* access modifiers changed from: protected */
        public final void f(boolean z10) {
            this.f20010f = z10;
        }

        public long read(in.e eVar, long j10) {
            l.f(eVar, "sink");
            try {
                return b.this.f20007f.read(eVar, j10);
            } catch (IOException e10) {
                b.this.h().z();
                e();
                throw e10;
            }
        }

        public b0 timeout() {
            return this.f20009e;
        }
    }

    /* renamed from: bn.b$b  reason: collision with other inner class name */
    private final class C0265b implements y {

        /* renamed from: e  reason: collision with root package name */
        private final k f20012e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20013f;

        public C0265b() {
            this.f20012e = new k(b.this.f20008g.timeout());
        }

        public void b0(in.e eVar, long j10) {
            l.f(eVar, "source");
            if (!(!this.f20013f)) {
                throw new IllegalStateException("closed".toString());
            } else if (j10 != 0) {
                b.this.f20008g.q(j10);
                b.this.f20008g.r0(HTTP.CRLF);
                b.this.f20008g.b0(eVar, j10);
                b.this.f20008g.r0(HTTP.CRLF);
            }
        }

        public synchronized void close() {
            if (!this.f20013f) {
                this.f20013f = true;
                b.this.f20008g.r0("0\r\n\r\n");
                b.this.r(this.f20012e);
                b.this.f20002a = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f20013f) {
                b.this.f20008g.flush();
            }
        }

        public b0 timeout() {
            return this.f20012e;
        }
    }

    private final class c extends a {

        /* renamed from: h  reason: collision with root package name */
        private long f20015h = -1;

        /* renamed from: i  reason: collision with root package name */
        private boolean f20016i = true;

        /* renamed from: j  reason: collision with root package name */
        private final v f20017j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b f20018k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, v vVar) {
            super();
            l.f(vVar, "url");
            this.f20018k = bVar;
            this.f20017j = vVar;
        }

        private final void g() {
            if (this.f20015h != -1) {
                this.f20018k.f20007f.J();
            }
            try {
                this.f20015h = this.f20018k.f20007f.x0();
                String J = this.f20018k.f20007f.J();
                if (J != null) {
                    String obj = q.B0(J).toString();
                    if (this.f20015h < 0 || (obj.length() > 0 && !p.A(obj, ";", false, 2, (Object) null))) {
                        throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.f20015h + obj + '\"');
                    } else if (this.f20015h == 0) {
                        this.f20016i = false;
                        b bVar = this.f20018k;
                        bVar.f20004c = bVar.f20003b.a();
                        z j10 = this.f20018k.f20005d;
                        l.c(j10);
                        n k10 = j10.k();
                        v vVar = this.f20017j;
                        u o10 = this.f20018k.f20004c;
                        l.c(o10);
                        an.e.f(k10, vVar, o10);
                        e();
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        public void close() {
            if (!c()) {
                if (this.f20016i && !vm.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f20018k.h().z();
                    e();
                }
                f(true);
            }
        }

        public long read(in.e eVar, long j10) {
            l.f(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!(!c())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f20016i) {
                return -1;
            } else {
                long j11 = this.f20015h;
                if (j11 == 0 || j11 == -1) {
                    g();
                    if (!this.f20016i) {
                        return -1;
                    }
                }
                long read = super.read(eVar, Math.min(j10, this.f20015h));
                if (read != -1) {
                    this.f20015h -= read;
                    return read;
                }
                this.f20018k.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(cm.g gVar) {
            this();
        }
    }

    private final class e extends a {

        /* renamed from: h  reason: collision with root package name */
        private long f20019h;

        public e(long j10) {
            super();
            this.f20019h = j10;
            if (j10 == 0) {
                e();
            }
        }

        public void close() {
            if (!c()) {
                if (this.f20019h != 0 && !vm.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                    b.this.h().z();
                    e();
                }
                f(true);
            }
        }

        public long read(in.e eVar, long j10) {
            l.f(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!c()) {
                long j11 = this.f20019h;
                if (j11 == 0) {
                    return -1;
                }
                long read = super.read(eVar, Math.min(j11, j10));
                if (read != -1) {
                    long j12 = this.f20019h - read;
                    this.f20019h = j12;
                    if (j12 == 0) {
                        e();
                    }
                    return read;
                }
                b.this.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    private final class f implements y {

        /* renamed from: e  reason: collision with root package name */
        private final k f20021e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20022f;

        public f() {
            this.f20021e = new k(b.this.f20008g.timeout());
        }

        public void b0(in.e eVar, long j10) {
            l.f(eVar, "source");
            if (!this.f20022f) {
                vm.b.i(eVar.H0(), 0, j10);
                b.this.f20008g.b0(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (!this.f20022f) {
                this.f20022f = true;
                b.this.r(this.f20021e);
                b.this.f20002a = 3;
            }
        }

        public void flush() {
            if (!this.f20022f) {
                b.this.f20008g.flush();
            }
        }

        public b0 timeout() {
            return this.f20021e;
        }
    }

    private final class g extends a {

        /* renamed from: h  reason: collision with root package name */
        private boolean f20024h;

        public g() {
            super();
        }

        public void close() {
            if (!c()) {
                if (!this.f20024h) {
                    e();
                }
                f(true);
            }
        }

        public long read(in.e eVar, long j10) {
            l.f(eVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!(!c())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f20024h) {
                return -1;
            } else {
                long read = super.read(eVar, j10);
                if (read != -1) {
                    return read;
                }
                this.f20024h = true;
                e();
                return -1;
            }
        }
    }

    public b(z zVar, zm.f fVar, in.g gVar, in.f fVar2) {
        l.f(fVar, "connection");
        l.f(gVar, "source");
        l.f(fVar2, "sink");
        this.f20005d = zVar;
        this.f20006e = fVar;
        this.f20007f = gVar;
        this.f20008g = fVar2;
        this.f20003b = new a(gVar);
    }

    /* access modifiers changed from: private */
    public final void r(k kVar) {
        b0 i10 = kVar.i();
        kVar.j(b0.f24447d);
        i10.a();
        i10.b();
    }

    private final boolean s(um.b0 b0Var) {
        return p.o("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    private final boolean t(d0 d0Var) {
        return p.o("chunked", d0.s(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final y u() {
        boolean z10 = true;
        if (this.f20002a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f20002a = 2;
            return new C0265b();
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    private final a0 v(v vVar) {
        if (this.f20002a == 4) {
            this.f20002a = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    private final a0 w(long j10) {
        if (this.f20002a == 4) {
            this.f20002a = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    private final y x() {
        boolean z10 = true;
        if (this.f20002a != 1) {
            z10 = false;
        }
        if (z10) {
            this.f20002a = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    private final a0 y() {
        if (this.f20002a == 4) {
            this.f20002a = 5;
            h().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    public final void A(u uVar, String str) {
        l.f(uVar, "headers");
        l.f(str, "requestLine");
        if (this.f20002a == 0) {
            this.f20008g.r0(str).r0(HTTP.CRLF);
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20008g.r0(uVar.n(i10)).r0(": ").r0(uVar.s(i10)).r0(HTTP.CRLF);
            }
            this.f20008g.r0(HTTP.CRLF);
            this.f20002a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f20002a).toString());
    }

    public void a(um.b0 b0Var) {
        l.f(b0Var, "request");
        i iVar = i.f19408a;
        Proxy.Type type = h().A().b().type();
        l.e(type, "connection.route().proxy.type()");
        A(b0Var.e(), iVar.a(b0Var, type));
    }

    public long b(d0 d0Var) {
        l.f(d0Var, "response");
        if (!an.e.b(d0Var)) {
            return 0;
        }
        if (t(d0Var)) {
            return -1;
        }
        return vm.b.s(d0Var);
    }

    public void c() {
        this.f20008g.flush();
    }

    public void cancel() {
        h().e();
    }

    public void d() {
        this.f20008g.flush();
    }

    public y e(um.b0 b0Var, long j10) {
        l.f(b0Var, "request");
        if (b0Var.a() != null && b0Var.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(b0Var)) {
            return u();
        } else {
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public a0 f(d0 d0Var) {
        long s10;
        l.f(d0Var, "response");
        if (!an.e.b(d0Var)) {
            s10 = 0;
        } else if (t(d0Var)) {
            return v(d0Var.c0().j());
        } else {
            s10 = vm.b.s(d0Var);
            if (s10 == -1) {
                return y();
            }
        }
        return w(s10);
    }

    public d0.a g(boolean z10) {
        int i10 = this.f20002a;
        boolean z11 = true;
        if (!(i10 == 1 || i10 == 3)) {
            z11 = false;
        }
        if (z11) {
            try {
                an.k a10 = an.k.f19411d.a(this.f20003b.b());
                d0.a k10 = new d0.a().p(a10.f19412a).g(a10.f19413b).m(a10.f19414c).k(this.f20003b.a());
                if (z10 && a10.f19413b == 100) {
                    return null;
                }
                if (a10.f19413b == 100) {
                    this.f20002a = 3;
                    return k10;
                }
                this.f20002a = 4;
                return k10;
            } catch (EOFException e10) {
                String p10 = h().A().a().l().p();
                throw new IOException("unexpected end of stream on " + p10, e10);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f20002a).toString());
        }
    }

    public zm.f h() {
        return this.f20006e;
    }

    public final void z(d0 d0Var) {
        l.f(d0Var, "response");
        long s10 = vm.b.s(d0Var);
        if (s10 != -1) {
            a0 w10 = w(s10);
            vm.b.I(w10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w10.close();
        }
    }
}
