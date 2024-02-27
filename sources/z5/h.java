package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.r;
import f6.s;
import f6.y;
import g6.j;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;

public class h extends y5.h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(r rVar) {
            return new j(rVar.O().i0());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public r a(s sVar) {
            return (r) r.Q().z(h.this.j()).x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(32))).k();
        }

        /* renamed from: f */
        public s c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return s.M(hVar, p.b());
        }

        /* renamed from: g */
        public void d(s sVar) {
        }
    }

    h() {
        super(r.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        y5.r.q(new h(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public h.a e() {
        return new b(s.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public r g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return r.R(hVar, p.b());
    }

    /* renamed from: m */
    public void i(r rVar) {
        w.c(rVar.P(), j());
        if (rVar.O().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
