package b6;

import f6.p;
import f6.q;
import f6.y;
import g6.u;
import g6.w;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import y5.d;
import y5.g;
import y5.h;
import y5.r;

public final class a extends h {

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    class C0083a extends h.b {
        C0083a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(p pVar) {
            return new g6.d(pVar.O().i0());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public p a(q qVar) {
            return (p) p.Q().x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(qVar.N()))).z(a.this.l()).k();
        }

        /* renamed from: f */
        public q c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return q.P(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(q qVar) {
            if (qVar.N() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.N() + ". Valid keys must have 64 bytes.");
            }
        }
    }

    a() {
        super(p.class, new C0083a(d.class));
    }

    public static final g j() {
        return k(64, g.b.TINK);
    }

    private static g k(int i10, g.b bVar) {
        return g.a(new a().c(), ((q) q.O().x(i10).k()).d(), bVar);
    }

    public static void n(boolean z10) {
        r.q(new a(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public h.a e() {
        return new b(q.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public p g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return p.R(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: o */
    public void i(p pVar) {
        w.c(pVar.P(), l());
        if (pVar.O().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + pVar.O().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
