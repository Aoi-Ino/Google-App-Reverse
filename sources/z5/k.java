package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.g0;
import f6.h0;
import f6.y;
import g6.w;
import y5.h;
import y5.n;
import y5.r;

public class k extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(g0 g0Var) {
            String O = g0Var.O().O();
            return new j(g0Var.O().N(), n.a(O).b(O));
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public g0 a(h0 h0Var) {
            return (g0) g0.Q().x(h0Var).z(k.this.j()).k();
        }

        /* renamed from: f */
        public h0 c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return h0.P(hVar, p.b());
        }

        /* renamed from: g */
        public void d(h0 h0Var) {
        }
    }

    k() {
        super(g0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new k(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public h.a e() {
        return new b(h0.class);
    }

    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public g0 g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return g0.R(hVar, p.b());
    }

    /* renamed from: m */
    public void i(g0 g0Var) {
        w.c(g0Var.P(), j());
    }
}
