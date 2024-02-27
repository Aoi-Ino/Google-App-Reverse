package z5;

import com.google.crypto.tink.shaded.protobuf.p;
import f6.i;
import f6.j;
import f6.y;
import g6.u;
import g6.w;
import java.security.GeneralSecurityException;
import y5.h;
import y5.r;

public final class e extends h {

    class a extends h.b {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public y5.a a(i iVar) {
            return new g6.b(iVar.P().i0(), iVar.Q().N());
        }
    }

    class b extends h.a {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public i a(j jVar) {
            return (i) i.S().x(com.google.crypto.tink.shaded.protobuf.h.s(u.c(jVar.M()))).z(jVar.N()).A(e.this.j()).k();
        }

        /* renamed from: f */
        public j c(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return j.O(hVar, p.b());
        }

        /* renamed from: g */
        public void d(j jVar) {
            w.a(jVar.M());
            if (jVar.N().N() != 12 && jVar.N().N() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    e() {
        super(i.class, new a(y5.a.class));
    }

    public static void l(boolean z10) {
        r.q(new e(), z10);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public h.a e() {
        return new b(j.class);
    }

    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public i g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return i.T(hVar, p.b());
    }

    /* renamed from: m */
    public void i(i iVar) {
        w.c(iVar.R(), j());
        w.a(iVar.P().size());
        if (iVar.Q().N() != 12 && iVar.Q().N() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
