package z5;

import f6.f;
import f6.g;
import f6.y;
import g6.p;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;

public class d extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public p a(f fVar) {
            return new g6.a(fVar.Q().i0(), fVar.R().N());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f a(g gVar) {
            return (f) f.T().z(gVar.O()).x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(gVar.N()))).A(d.this.k()).k();
        }

        /* renamed from: f */
        public g c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return g.P(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(g gVar) {
            w.a(gVar.N());
            d.this.n(gVar.O());
        }
    }

    d() {
        super(f.class, new a(p.class));
    }

    /* access modifiers changed from: private */
    public void n(f6.h hVar) {
        if (hVar.N() < 12 || hVar.N() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public h.a e() {
        return new b(g.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public f g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return f.U(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: m */
    public void i(f fVar) {
        w.c(fVar.S(), k());
        w.a(fVar.Q().size());
        n(fVar.R());
    }
}
