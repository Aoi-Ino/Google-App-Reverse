package no;

import ap.f;
import fo.e;
import fo.h;
import fo.i;
import fo.j;
import fo.k;
import fo.m;
import java.io.IOException;
import oo.a0;
import oo.r;
import oo.s;
import oo.x;
import oo.y;
import qn.c;
import qn.u;
import qn.v;
import vn.b;

public abstract class a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 != length; i10++) {
            sArr[i10] = f.g(bArr, i10 * 2);
        }
        return sArr;
    }

    public static zn.a b(b bVar) {
        u y10 = bVar.E().y();
        if (y10.q0(rn.a.W)) {
            return new jo.a(e.e(bVar.E()), v.j0(bVar.T()).l0());
        } else if (y10.Y(rn.a.f31176s)) {
            return new mo.b(v.j0(bVar.T()).l0(), e.g(h.y(bVar.E().E())));
        } else {
            if (y10.Y(rn.a.f31161f0)) {
                return new io.a(a(v.j0(bVar.T()).l0()));
            }
            if (y10.Y(vn.a.I0)) {
                byte[] l02 = v.j0(bVar.T()).l0();
                c F = bVar.F();
                if (f.a(l02, 0) == 1) {
                    if (F == null) {
                        return go.h.e(ap.a.g(l02, 4, l02.length));
                    }
                    byte[] m02 = F.m0();
                    return go.h.f(ap.a.g(l02, 4, l02.length), ap.a.g(m02, 4, m02.length));
                } else if (F == null) {
                    return go.c.a(ap.a.g(l02, 4, l02.length));
                } else {
                    return go.c.b(ap.a.g(l02, 4, l02.length), F.m0());
                }
            } else if (y10.Y(rn.a.f31180w)) {
                i B = i.B(bVar.E().E());
                u y11 = B.E().y();
                m B2 = m.B(bVar.T());
                try {
                    y.b o10 = new y.b(new x(B.y(), e.b(y11))).l(B2.f()).q(B2.Y()).p(B2.T()).n(B2.F()).o(B2.H());
                    if (B2.e0() != 0) {
                        o10.m(B2.E());
                    }
                    if (B2.y() != null) {
                        o10.k(((oo.a) a0.f(B2.y(), oo.a.class)).h(y11));
                    }
                    return o10.j();
                } catch (ClassNotFoundException e10) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e10.getMessage());
                }
            } else if (y10.Y(e.F)) {
                j B3 = j.B(bVar.E().E());
                u y12 = B3.F().y();
                try {
                    k E = k.E(bVar.T());
                    s.b p10 = new s.b(new r(B3.y(), B3.E(), e.b(y12))).m(E.B()).r(E.e0()).q(E.Y()).o(E.H()).p(E.T());
                    if (E.g0() != 0) {
                        p10.n(E.F());
                    }
                    if (E.y() != null) {
                        p10.l(((oo.b) a0.f(E.y(), oo.b.class)).f(y12));
                    }
                    return p10.k();
                } catch (ClassNotFoundException e11) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e11.getMessage());
                }
            } else if (y10.Y(e.f23629n)) {
                fo.a F2 = fo.a.F(bVar.T());
                return new ho.b(F2.T(), F2.H(), F2.B(), F2.E(), F2.Y(), e.c(F2.y().y()));
            } else {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
        }
    }
}
