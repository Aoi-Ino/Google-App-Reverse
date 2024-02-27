package xm;

import cm.g;
import cm.l;
import um.a0;
import um.b0;
import um.c;
import um.d0;
import um.e;
import um.e0;
import um.r;
import um.u;
import um.w;
import xm.b;

public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final C0383a f32800a = new C0383a((g) null);

    /* renamed from: xm.a$a  reason: collision with other inner class name */
    public static final class C0383a {
        private C0383a() {
        }

        public /* synthetic */ C0383a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String n10 = uVar.n(i10);
                String s10 = uVar.s(i10);
                if ((!p.o("Warning", n10, true) || !p.A(s10, "1", false, 2, (Object) null)) && (d(n10) || !e(n10) || uVar2.l(n10) == null)) {
                    aVar.d(n10, s10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String n11 = uVar2.n(i11);
                if (!d(n11) && e(n11)) {
                    aVar.d(n11, uVar2.s(i11));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            return p.o("Content-Length", str, true) || p.o("Content-Encoding", str, true) || p.o("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return !p.o("Connection", str, true) && !p.o("Keep-Alive", str, true) && !p.o("Proxy-Authenticate", str, true) && !p.o("Proxy-Authorization", str, true) && !p.o("TE", str, true) && !p.o("Trailers", str, true) && !p.o("Transfer-Encoding", str, true) && !p.o("Upgrade", str, true);
        }

        /* access modifiers changed from: private */
        public final d0 f(d0 d0Var) {
            return (d0Var != null ? d0Var.c() : null) != null ? d0Var.R().b((e0) null).c() : d0Var;
        }
    }

    public a(c cVar) {
    }

    public d0 a(w.a aVar) {
        r rVar;
        l.f(aVar, "chain");
        e call = aVar.call();
        b b10 = new b.C0384b(System.currentTimeMillis(), aVar.request(), (d0) null).b();
        b0 b11 = b10.b();
        d0 a10 = b10.a();
        zm.e eVar = (zm.e) (!(call instanceof zm.e) ? null : call);
        if (eVar == null || (rVar = eVar.m()) == null) {
            rVar = r.f32114a;
        }
        if (b11 == null && a10 == null) {
            d0 c10 = new d0.a().r(aVar.request()).p(a0.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(vm.b.f32399c).s(-1).q(System.currentTimeMillis()).c();
            rVar.z(call, c10);
            return c10;
        } else if (b11 == null) {
            l.c(a10);
            d0 c11 = a10.R().d(f32800a.f(a10)).c();
            rVar.b(call, c11);
            return c11;
        } else {
            if (a10 != null) {
                rVar.a(call, a10);
            }
            d0 a11 = aVar.a(b11);
            if (a10 != null) {
                if (a11 == null || a11.h() != 304) {
                    e0 c12 = a10.c();
                    if (c12 != null) {
                        vm.b.j(c12);
                    }
                } else {
                    d0.a R = a10.R();
                    C0383a aVar2 = f32800a;
                    R.k(aVar2.c(a10.y(), a11.y())).s(a11.i0()).q(a11.Z()).d(aVar2.f(a10)).n(aVar2.f(a11)).c();
                    e0 c13 = a11.c();
                    l.c(c13);
                    c13.close();
                    l.c((Object) null);
                    throw null;
                }
            }
            l.c(a11);
            d0.a R2 = a11.R();
            C0383a aVar3 = f32800a;
            return R2.d(aVar3.f(a10)).n(aVar3.f(a11)).c();
        }
    }
}
