package z5;

import f6.d;
import f6.e;
import f6.f;
import f6.v;
import f6.y;
import g6.l;
import g6.p;
import g6.w;
import y5.h;
import y5.o;
import y5.r;

public final class c extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(d dVar) {
            return new l((p) new d().d(dVar.P(), p.class), (o) new d6.b().d(dVar.Q(), o.class), dVar.Q().R().O());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public d a(e eVar) {
            return (d) d.S().x((f) new d().e().a(eVar.M())).z((v) new d6.b().e().a(eVar.N())).A(c.this.j()).k();
        }

        /* renamed from: f */
        public e c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return e.O(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(e eVar) {
            new d().e().d(eVar.M());
            new d6.b().e().d(eVar.N());
            w.a(eVar.M().N());
        }
    }

    c() {
        super(d.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new c(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public h.a e() {
        return new b(e.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public d g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return d.T(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: m */
    public void i(d dVar) {
        w.c(dVar.R(), j());
        new d().i(dVar.P());
        new d6.b().i(dVar.Q());
    }
}
