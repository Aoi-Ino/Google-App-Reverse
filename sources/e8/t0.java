package e8;

import a8.v;
import java.util.ArrayList;
import java.util.Iterator;

public class t0 extends a0 {
    public static final c1 O;
    public static final c1 P = c1.W;
    public static final c1 Q = c1.F8;
    public static final c1 R = c1.S5;
    public static final c1 S;
    public static final c1 T = c1.T6;
    static c1[] U = {c1.f10473v3, c1.f10520yb, c1.f10228c1, c1.f10308i7};
    protected t0 M;
    protected ArrayList N;

    static {
        c1 c1Var = c1.f10300i;
        O = c1Var;
        S = c1Var;
    }

    protected t0(c2 c2Var) {
        super(c2Var, (v) null);
        this.f10170q = true;
        this.f10171r = false;
    }

    static void G(l0 l0Var, l0 l0Var2) {
        H(l0Var, l0Var2, (w1) null);
    }

    static void H(l0 l0Var, l0 l0Var2, w1 w1Var) {
        int i10 = 0;
        while (true) {
            c1[] c1VarArr = U;
            if (i10 < c1VarArr.length) {
                c1 c1Var = c1VarArr[i10];
                l0 n10 = l0Var2.n(c1Var);
                if (n10 != null) {
                    l0 l0Var3 = (l0) s1.b(l0Var.m(c1Var), l0Var);
                    if (l0Var3 == null) {
                        l0Var3 = new l0();
                    }
                    l0Var3.q(n10);
                    l0Var.r(c1Var, l0Var3);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static a0 I(a0 a0Var) {
        t0 t0Var;
        if (a0Var.A()) {
            t0 t0Var2 = new t0(a0Var.f10167n);
            t0 t0Var3 = (t0) a0Var;
            t0Var2.M = t0Var3.M;
            t0Var2.N = t0Var3.N;
            t0Var = t0Var2;
        } else {
            t0Var = new a0(a0Var.f10167n, (v) null);
        }
        t0Var.p(a0Var);
        t0Var.f10170q = a0Var.f10170q;
        t0Var.f10171r = a0Var.f10171r;
        t0Var.f10169p = a0Var.f10169p;
        return t0Var;
    }

    public void D() {
        this.f10172s = true;
        t0 t0Var = this.M;
        if (t0Var != null) {
            r(c1.f10246d7, t0Var.w());
        }
        if (this.N != null) {
            b0 b0Var = new b0();
            for (int i10 = 0; i10 < this.N.size(); i10++) {
                b0Var.m(((t0) this.N.get(i10)).w());
            }
            r(c1.f10220b5, b0Var);
        }
        if (this.f10169p != null) {
            l0 l0Var = new l0();
            Iterator it = this.f10169p.iterator();
            while (it.hasNext()) {
                G(l0Var, (l0) ((a2) it.next()).i0());
            }
            r(c1.f10368n2, l0Var);
        }
    }

    public ArrayList E() {
        return this.N;
    }

    public t0 F() {
        return this.M;
    }
}
