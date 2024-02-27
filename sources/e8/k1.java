package e8;

import a8.g;
import a8.h;
import a8.j;
import a8.n;
import a8.u;
import a8.v;

public class k1 extends v {
    private float A;
    private float B;
    private float C;
    private float D;
    private boolean E;
    private n1 F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    protected u K;
    private int L;

    /* renamed from: w  reason: collision with root package name */
    private l f10859w;

    /* renamed from: x  reason: collision with root package name */
    private int f10860x;

    /* renamed from: y  reason: collision with root package name */
    private float f10861y;

    /* renamed from: z  reason: collision with root package name */
    private float f10862z;

    public k1() {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        l lVar = new l((g0) null);
        this.f10859w = lVar;
        this.f10860x = 4;
        this.f10861y = 2.0f;
        this.f10862z = 2.0f;
        this.A = 2.0f;
        this.B = 2.0f;
        this.C = 0.0f;
        this.E = false;
        this.G = 1;
        this.H = 1;
        this.J = false;
        this.f369m = 0.5f;
        this.f367k = 15;
        lVar.B(0.0f, 1.0f);
    }

    public void M(h hVar) {
        if (this.F != null) {
            this.F = null;
            this.f10859w.J((u) null);
        }
        this.f10859w.a(hVar);
    }

    /* access modifiers changed from: package-private */
    public void N(float f10) {
        float s10 = s() - U();
        float p10 = p() + S();
        float V = (f10 - V()) - R();
        if (u() == 90 || u() == 270) {
            this.f10859w.E(0.0f, p10, V + 0.001f, s10);
        } else {
            this.f10859w.E(p10, V + 0.001f, s10, 0.0f);
        }
        try {
            this.f10859w.p(true);
        } catch (g unused) {
        }
    }

    public l1 O() {
        return null;
    }

    public int P() {
        return this.G;
    }

    public l Q() {
        return this.f10859w;
    }

    public float R() {
        if (!j0()) {
            return this.B;
        }
        return this.B + (i() / (C() ? 1.0f : 2.0f));
    }

    public float S() {
        if (!j0()) {
            return this.f10861y;
        }
        return this.f10861y + (j() / (C() ? 1.0f : 2.0f));
    }

    public float U() {
        if (!j0()) {
            return this.f10862z;
        }
        return this.f10862z + (k() / (C() ? 1.0f : 2.0f));
    }

    public float V() {
        if (!j0()) {
            return this.A;
        }
        return this.A + (l() / (C() ? 1.0f : 2.0f));
    }

    public float W() {
        return this.C;
    }

    public int X() {
        return this.f10859w.h();
    }

    public n Z() {
        return null;
    }

    public float a0() {
        float f10;
        float f11;
        float f12;
        float n10;
        float R;
        boolean z10 = u() == 90 || u() == 270;
        Z();
        if (!z10 || !g0()) {
            l d10 = l.d(Q());
            float f13 = 20000.0f;
            if (z10) {
                f12 = s() - U();
                f11 = p() + S();
                f10 = 0.0f;
            } else {
                if (!i0()) {
                    f13 = s() - U();
                }
                f12 = w() - V();
                f10 = S() + p();
                f11 = g0() ? (w() + R()) - W() : -1.07374182E9f;
            }
            m1.g(d10, f10, f11, f13, f12);
            try {
                d10.p(true);
                if (z10) {
                    n10 = (w() - V()) - R();
                    R = d10.j();
                } else {
                    n10 = d10.n();
                    if (k0()) {
                        n10 += d10.i();
                    }
                    R = R();
                }
            } catch (g e10) {
                throw new j(e10);
            }
        } else {
            n10 = w();
            R = W();
        }
        H(n10 - R);
        float o10 = o();
        if (g0()) {
            return W();
        }
        return (!h0() || o10 >= b0()) ? o10 : b0();
    }

    public float b0() {
        return this.D;
    }

    public int c0() {
        return this.H;
    }

    public int d0() {
        return this.f10859w.m();
    }

    public int f0() {
        return this.f10860x;
    }

    public boolean g0() {
        return W() > 0.0f;
    }

    public boolean h0() {
        return b0() > 0.0f;
    }

    public boolean i0() {
        return this.E;
    }

    public boolean j0() {
        return this.J;
    }

    public boolean k0() {
        return this.I;
    }

    public void l0(int i10) {
        this.G = i10;
    }

    public void m0(l lVar) {
        this.f10859w = lVar;
    }

    public void n0(float f10) {
        this.C = f10;
        this.D = 0.0f;
    }

    public void o0(int i10) {
        this.f10859w.t(i10);
    }

    public void p0(float f10) {
        this.D = f10;
        this.C = 0.0f;
    }

    public void q0(float f10) {
        this.B = f10;
        this.A = f10;
        this.f10861y = f10;
        this.f10862z = f10;
    }

    public void r0(u uVar) {
        this.F = null;
        l lVar = this.f10859w;
        this.K = uVar;
        lVar.J(uVar);
    }

    public void s0(int i10) {
        this.H = i10;
    }

    public void t0(int i10) {
        this.f10859w.D(i10);
    }

    public int u() {
        return this.L;
    }

    public void u0(int i10) {
        n1 n1Var = this.F;
        if (n1Var != null) {
            n1Var.N(i10 == 4);
        }
        this.f10860x = i10;
    }

    public k1(u uVar) {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        l lVar = new l((g0) null);
        this.f10859w = lVar;
        this.f10860x = 4;
        this.f10861y = 2.0f;
        this.f10862z = 2.0f;
        this.A = 2.0f;
        this.B = 2.0f;
        this.C = 0.0f;
        this.E = false;
        this.G = 1;
        this.H = 1;
        this.J = false;
        this.f369m = 0.5f;
        this.f367k = 15;
        this.K = uVar;
        lVar.b(uVar);
        this.f10859w.B(0.0f, 1.0f);
    }

    public k1(k1 k1Var) {
        super(k1Var.f361e, k1Var.f362f, k1Var.f363g, k1Var.f364h);
        this.f10859w = new l((g0) null);
        this.f10860x = 4;
        this.f10861y = 2.0f;
        this.f10862z = 2.0f;
        this.A = 2.0f;
        this.B = 2.0f;
        this.C = 0.0f;
        this.E = false;
        this.G = 1;
        this.H = 1;
        this.J = false;
        a(k1Var);
        this.f10860x = k1Var.f10860x;
        this.f10861y = k1Var.f10861y;
        this.f10862z = k1Var.f10862z;
        this.A = k1Var.A;
        this.B = k1Var.B;
        this.K = k1Var.K;
        this.C = k1Var.C;
        this.D = k1Var.D;
        this.E = k1Var.E;
        this.G = k1Var.G;
        this.H = k1Var.H;
        n1 n1Var = k1Var.F;
        if (n1Var != null) {
            this.F = new n1(n1Var);
        }
        n.M((n) null);
        this.I = k1Var.I;
        this.f10859w = l.d(k1Var.f10859w);
        this.J = k1Var.J;
        this.L = k1Var.L;
    }

    public k1(n1 n1Var) {
        this(n1Var, (k1) null);
    }

    public k1(n1 n1Var, k1 k1Var) {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        l lVar = new l((g0) null);
        this.f10859w = lVar;
        this.f10860x = 4;
        this.f10861y = 2.0f;
        this.f10862z = 2.0f;
        this.A = 2.0f;
        this.B = 2.0f;
        this.C = 0.0f;
        this.E = false;
        this.G = 1;
        this.H = 1;
        this.J = false;
        this.f369m = 0.5f;
        this.f367k = 15;
        lVar.B(0.0f, 1.0f);
        this.F = n1Var;
        n1Var.V(100.0f);
        n1Var.N(true);
        this.f10859w.a(n1Var);
        if (k1Var != null) {
            a(k1Var);
            this.f10860x = k1Var.f10860x;
            this.f10861y = k1Var.f10861y;
            this.f10862z = k1Var.f10862z;
            this.A = k1Var.A;
            this.B = k1Var.B;
            this.G = k1Var.G;
            this.H = k1Var.H;
            this.I = k1Var.I;
            this.J = k1Var.J;
            this.L = k1Var.L;
            return;
        }
        q0(0.0f);
    }
}
