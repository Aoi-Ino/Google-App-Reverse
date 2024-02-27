package e8;

import a8.j;
import android.support.v4.media.session.b;

public abstract class s1 {

    /* renamed from: a  reason: collision with root package name */
    static final c1[] f11019a = {c1.J5, c1.A8, c1.f10309i8, c1.f10523z1};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f11020b = o0.c("endstream", (String) null);

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f11021c = o0.c("endobj", (String) null);

    public static i1 a(i1 i1Var) {
        if (i1Var == null) {
            return null;
        }
        if (!i1Var.f()) {
            return i1Var;
        }
        try {
            b.a(i1Var);
            throw null;
        } catch (Exception e10) {
            throw new j(e10);
        }
    }

    public static i1 b(i1 i1Var, i1 i1Var2) {
        if (i1Var == null) {
            return null;
        }
        if (i1Var.f()) {
            return a(i1Var);
        }
        if (i1Var2 != null) {
            i1Var2.c();
        }
        return i1Var;
    }
}
