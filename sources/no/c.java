package no;

import fo.j;
import fo.n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import oo.r;
import oo.t;
import oo.x;
import oo.z;
import qn.u;
import qn.v;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static Map f29971a;

    private static class b extends g {
        private b() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            byte[] l02 = v.j0(bVar.F()).l0();
            if (ap.f.a(l02, 0) == 1) {
                return go.i.a(ap.a.g(l02, 4, l02.length));
            }
            if (l02.length == 64) {
                l02 = ap.a.g(l02, 4, l02.length);
            }
            return go.d.a(l02);
        }
    }

    /* renamed from: no.c$c  reason: collision with other inner class name */
    private static class C0327c extends g {
        private C0327c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            fo.b E = fo.b.E(bVar.F());
            return new ho.c(E.F(), E.H(), E.B(), e.c(E.y().y()));
        }
    }

    private static class d extends g {
        private d() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            return new io.b(bVar.E().j0());
        }
    }

    private static class e extends g {
        private e() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            return new jo.b(e.e(bVar.y()), bVar.E().m0());
        }
    }

    private static class f extends g {
        private f() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            return new mo.c(bVar.E().j0(), e.g(fo.h.y(bVar.y().E())));
        }
    }

    private static abstract class g {
        private g() {
        }

        /* access modifiers changed from: package-private */
        public abstract zn.a a(wn.b bVar, Object obj);
    }

    private static class h extends g {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            z.b f10;
            fo.i B = fo.i.B(bVar.y().E());
            if (B != null) {
                u y10 = B.E().y();
                n y11 = n.y(bVar.F());
                f10 = new z.b(new x(B.y(), e.b(y10))).g(y11.B()).h(y11.E());
            } else {
                byte[] l02 = v.j0(bVar.F()).l0();
                f10 = new z.b(x.k(ap.f.a(l02, 0))).f(l02);
            }
            return f10.e();
        }
    }

    private static class i extends g {
        private i() {
            super();
        }

        /* access modifiers changed from: package-private */
        public zn.a a(wn.b bVar, Object obj) {
            t.b f10;
            j B = j.B(bVar.y().E());
            if (B != null) {
                u y10 = B.F().y();
                n y11 = n.y(bVar.F());
                f10 = new t.b(new r(B.y(), B.E(), e.b(y10))).g(y11.B()).h(y11.E());
            } else {
                byte[] l02 = v.j0(bVar.F()).l0();
                f10 = new t.b(r.i(ap.f.a(l02, 0))).f(l02);
            }
            return f10.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f29971a = hashMap;
        hashMap.put(fo.e.X, new e());
        f29971a.put(fo.e.Y, new e());
        f29971a.put(fo.e.f23633r, new f());
        f29971a.put(fo.e.f23637v, new d());
        f29971a.put(fo.e.f23638w, new h());
        f29971a.put(fo.e.F, new i());
        f29971a.put(sn.a.f31326a, new h());
        f29971a.put(sn.a.f31327b, new i());
        f29971a.put(vn.a.I0, new b());
        f29971a.put(fo.e.f23629n, new C0327c());
    }

    public static zn.a a(wn.b bVar) {
        return b(bVar, (Object) null);
    }

    public static zn.a b(wn.b bVar, Object obj) {
        wn.a y10 = bVar.y();
        g gVar = (g) f29971a.get(y10.y());
        if (gVar != null) {
            return gVar.a(bVar, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + y10.y());
    }
}
