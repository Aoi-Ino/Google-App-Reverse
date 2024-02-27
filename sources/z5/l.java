package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.k0;
import f6.l0;
import f6.y;
import g6.u;
import g6.w;
import g6.y;
import java.security.GeneralSecurityException;
import y5.h;
import y5.r;

public class l extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(k0 k0Var) {
            return new y(k0Var.O().i0());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public k0 a(l0 l0Var) {
            return (k0) k0.Q().z(l.this.j()).x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(32))).k();
        }

        /* renamed from: f */
        public l0 c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return l0.M(hVar, p.b());
        }

        /* renamed from: g */
        public void d(l0 l0Var) {
        }
    }

    l() {
        super(k0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new l(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public h.a e() {
        return new b(l0.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k0 g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return k0.R(hVar, p.b());
    }

    /* renamed from: m */
    public void i(k0 k0Var) {
        w.c(k0Var.P(), j());
        if (k0Var.O().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
