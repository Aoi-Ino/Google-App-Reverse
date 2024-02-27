package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.e0;
import f6.f0;
import f6.y;
import g6.w;
import y5.h;
import y5.n;
import y5.r;

public class i extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(e0 e0Var) {
            String N = e0Var.O().N();
            return n.a(N).b(N);
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public e0 a(f0 f0Var) {
            return (e0) e0.Q().x(f0Var).z(i.this.j()).k();
        }

        /* renamed from: f */
        public f0 c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return f0.O(hVar, p.b());
        }

        /* renamed from: g */
        public void d(f0 f0Var) {
        }
    }

    i() {
        super(e0.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new i(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public h.a e() {
        return new b(f0.class);
    }

    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public e0 g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return e0.R(hVar, p.b());
    }

    /* renamed from: m */
    public void i(e0 e0Var) {
        w.c(e0Var.P(), j());
    }
}
