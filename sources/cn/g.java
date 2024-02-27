package cn;

import an.d;
import an.e;
import an.i;
import an.k;
import cm.l;
import in.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import um.a0;
import um.b0;
import um.d0;
import um.u;
import um.z;
import vm.b;
import zm.f;

public final class g implements d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List f20391g = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List f20392h = b.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: i  reason: collision with root package name */
    public static final a f20393i = new a((cm.g) null);

    /* renamed from: a  reason: collision with root package name */
    private volatile i f20394a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f20395b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f20396c;

    /* renamed from: d  reason: collision with root package name */
    private final f f20397d;

    /* renamed from: e  reason: collision with root package name */
    private final an.g f20398e;

    /* renamed from: f  reason: collision with root package name */
    private final f f20399f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }

        public final List a(b0 b0Var) {
            l.f(b0Var, "request");
            u e10 = b0Var.e();
            ArrayList arrayList = new ArrayList(e10.size() + 4);
            arrayList.add(new c(c.f20257f, b0Var.g()));
            arrayList.add(new c(c.f20258g, i.f19408a.c(b0Var.j())));
            String d10 = b0Var.d("Host");
            if (d10 != null) {
                arrayList.add(new c(c.f20260i, d10));
            }
            arrayList.add(new c(c.f20259h, b0Var.j().r()));
            int size = e10.size();
            int i10 = 0;
            while (i10 < size) {
                String n10 = e10.n(i10);
                Locale locale = Locale.US;
                l.e(locale, "Locale.US");
                if (n10 != null) {
                    String lowerCase = n10.toLowerCase(locale);
                    l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!g.f20391g.contains(lowerCase) || (l.a(lowerCase, "te") && l.a(e10.s(i10), "trailers"))) {
                        arrayList.add(new c(lowerCase, e10.s(i10)));
                    }
                    i10++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return arrayList;
        }

        public final d0.a b(u uVar, a0 a0Var) {
            l.f(uVar, "headerBlock");
            l.f(a0Var, "protocol");
            u.a aVar = new u.a();
            int size = uVar.size();
            k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String n10 = uVar.n(i10);
                String s10 = uVar.s(i10);
                if (l.a(n10, ":status")) {
                    k.a aVar2 = k.f19411d;
                    kVar = aVar2.a("HTTP/1.1 " + s10);
                } else if (!g.f20392h.contains(n10)) {
                    aVar.d(n10, s10);
                }
            }
            if (kVar != null) {
                return new d0.a().p(a0Var).g(kVar.f19413b).m(kVar.f19414c).k(aVar.e());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public g(z zVar, f fVar, an.g gVar, f fVar2) {
        l.f(zVar, "client");
        l.f(fVar, "connection");
        l.f(gVar, "chain");
        l.f(fVar2, "http2Connection");
        this.f20397d = fVar;
        this.f20398e = gVar;
        this.f20399f = fVar2;
        List A = zVar.A();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        this.f20395b = !A.contains(a0Var) ? a0.HTTP_2 : a0Var;
    }

    public void a(b0 b0Var) {
        l.f(b0Var, "request");
        if (this.f20394a == null) {
            this.f20394a = this.f20399f.M0(f20393i.a(b0Var), b0Var.a() != null);
            if (!this.f20396c) {
                i iVar = this.f20394a;
                l.c(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.v().g((long) this.f20398e.h(), timeUnit);
                i iVar2 = this.f20394a;
                l.c(iVar2);
                iVar2.E().g((long) this.f20398e.j(), timeUnit);
                return;
            }
            i iVar3 = this.f20394a;
            l.c(iVar3);
            iVar3.f(b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public long b(d0 d0Var) {
        l.f(d0Var, "response");
        if (!e.b(d0Var)) {
            return 0;
        }
        return b.s(d0Var);
    }

    public void c() {
        i iVar = this.f20394a;
        l.c(iVar);
        iVar.n().close();
    }

    public void cancel() {
        this.f20396c = true;
        i iVar = this.f20394a;
        if (iVar != null) {
            iVar.f(b.CANCEL);
        }
    }

    public void d() {
        this.f20399f.flush();
    }

    public y e(b0 b0Var, long j10) {
        l.f(b0Var, "request");
        i iVar = this.f20394a;
        l.c(iVar);
        return iVar.n();
    }

    public in.a0 f(d0 d0Var) {
        l.f(d0Var, "response");
        i iVar = this.f20394a;
        l.c(iVar);
        return iVar.p();
    }

    public d0.a g(boolean z10) {
        i iVar = this.f20394a;
        l.c(iVar);
        d0.a b10 = f20393i.b(iVar.C(), this.f20395b);
        if (!z10 || b10.h() != 100) {
            return b10;
        }
        return null;
    }

    public f h() {
        return this.f20397d;
    }
}
