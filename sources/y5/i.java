package y5;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import f6.c0;
import f6.d0;
import f6.t;
import java.security.GeneralSecurityException;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f18513a;

    private i(c0 c0Var) {
        this.f18513a = c0Var;
    }

    public static void a(t tVar) {
        if (tVar == null || tVar.O().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(c0 c0Var) {
        if (c0Var == null || c0Var.R() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t tVar, a aVar) {
        try {
            c0 V = c0.V(aVar.b(tVar.O().i0(), new byte[0]), p.b());
            b(V);
            return V;
        } catch (a0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(c0 c0Var, a aVar) {
        byte[] a10 = aVar.a(c0Var.d(), new byte[0]);
        try {
            if (c0.V(aVar.b(a10, new byte[0]), p.b()).equals(c0Var)) {
                return (t) t.P().x(h.s(a10)).z(s.b(c0Var)).k();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (a0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final i e(c0 c0Var) {
        b(c0Var);
        return new i(c0Var);
    }

    private Object i(Class cls, Class cls2) {
        return r.t(r.k(this, cls2), cls);
    }

    public static final i j(k kVar, a aVar) {
        t a10 = kVar.a();
        a(a10);
        return new i(c(a10, aVar));
    }

    /* access modifiers changed from: package-private */
    public c0 f() {
        return this.f18513a;
    }

    public d0 g() {
        return s.b(this.f18513a);
    }

    public Object h(Class cls) {
        Class e10 = r.e(cls);
        if (e10 != null) {
            return i(cls, e10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(l lVar, a aVar) {
        lVar.a(d(this.f18513a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
