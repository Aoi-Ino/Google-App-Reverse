package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.n;
import f6.o;
import f6.y;
import g6.u;
import g6.w;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import y5.h;
import y5.r;

public final class g extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(n nVar) {
            return new a6.a(nVar.O().i0());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public n a(o oVar) {
            return (n) n.Q().x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(oVar.M()))).z(g.this.k()).k();
        }

        /* renamed from: f */
        public o c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return o.N(hVar, p.b());
        }

        /* renamed from: g */
        public void d(o oVar) {
            w.a(oVar.M());
        }
    }

    g() {
        super(n.class, new a(y5.a.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z10) {
        if (j()) {
            r.q(new g(), z10);
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public h.a e() {
        return new b(o.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public n g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return n.R(hVar, p.b());
    }

    /* renamed from: n */
    public void i(n nVar) {
        w.c(nVar.P(), k());
        w.a(nVar.O().size());
    }
}
