package d6;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.c;
import f6.y;
import g6.r;
import g6.t;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
import y5.o;

public final class a extends h {

    /* renamed from: d6.a$a  reason: collision with other inner class name */
    class C0131a extends h.b {
        C0131a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(f6.a aVar) {
            return new t(new r(aVar.P().i0()), aVar.Q().N());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f6.a a(f6.b bVar) {
            return (f6.a) f6.a.S().A(0).x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(bVar.M()))).z(bVar.N()).k();
        }

        /* renamed from: f */
        public f6.b c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return f6.b.O(hVar, p.b());
        }

        /* renamed from: g */
        public void d(f6.b bVar) {
            a.p(bVar.N());
            a.q(bVar.M());
        }
    }

    a() {
        super(f6.a.class, new C0131a(o.class));
    }

    public static void n(boolean z10) {
        y5.r.q(new a(), z10);
    }

    /* access modifiers changed from: private */
    public static void p(c cVar) {
        if (cVar.N() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.N() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void q(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public h.a e() {
        return new b(f6.b.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public f6.a g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return f6.a.T(hVar, p.b());
    }

    /* renamed from: o */
    public void i(f6.a aVar) {
        w.c(aVar.R(), l());
        q(aVar.P().size());
        p(aVar.Q());
    }
}
