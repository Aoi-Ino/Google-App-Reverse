package y5;

import f6.c0;
import f6.d0;
import f6.i0;
import f6.y;
import f6.z;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f18533a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return (d0.c) d0.c.R().C(cVar.Q().R()).A(cVar.T()).z(cVar.S()).x(cVar.R()).k();
    }

    public static d0 b(c0 c0Var) {
        d0.b z10 = d0.R().z(c0Var.T());
        for (c0.c a10 : c0Var.S()) {
            z10.x(a(a10));
        }
        return (d0) z10.k();
    }

    public static void c(c0.c cVar) {
        if (!cVar.U()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.R())}));
        } else if (cVar.S() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.R())}));
        } else if (cVar.T() == z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.R())}));
        }
    }

    public static void d(c0 c0Var) {
        int T = c0Var.T();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (c0.c cVar : c0Var.S()) {
            if (cVar.T() == z.ENABLED) {
                c(cVar);
                if (cVar.R() == T) {
                    if (!z10) {
                        z10 = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (cVar.Q().Q() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
