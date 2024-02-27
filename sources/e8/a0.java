package e8;

import a8.v;
import java.util.HashSet;

public class a0 extends l0 {
    public static final c1 A = c1.U7;
    public static final c1 B;
    public static final c1 C = c1.f10472v2;
    public static final c1 D = c1.f10455tb;
    public static final c1 E;
    public static final c1 F = c1.f10506xa;
    public static final c1 G = c1.f10460u3;
    public static final c1 H = c1.f10327k0;
    public static final c1 I = c1.Z4;
    public static final c1 J = c1.R2;
    public static final c1 K = c1.Oa;
    public static final c1 L = c1.f10496x0;

    /* renamed from: u  reason: collision with root package name */
    public static final c1 f10161u;

    /* renamed from: v  reason: collision with root package name */
    public static final c1 f10162v = c1.f10474v4;

    /* renamed from: w  reason: collision with root package name */
    public static final c1 f10163w = c1.f10411q6;

    /* renamed from: x  reason: collision with root package name */
    public static final c1 f10164x = c1.T6;

    /* renamed from: y  reason: collision with root package name */
    public static final c1 f10165y = c1.B9;

    /* renamed from: z  reason: collision with root package name */
    public static final c1 f10166z;

    /* renamed from: n  reason: collision with root package name */
    protected c2 f10167n;

    /* renamed from: o  reason: collision with root package name */
    protected x0 f10168o;

    /* renamed from: p  reason: collision with root package name */
    protected HashSet f10169p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f10170q = false;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f10171r = true;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f10172s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f10173t = -1;

    static {
        c1 c1Var = c1.S5;
        f10161u = c1Var;
        f10166z = c1Var;
        c1 c1Var2 = c1.E1;
        B = c1Var2;
        E = c1Var2;
    }

    public a0(c2 c2Var, float f10, float f11, float f12, float f13, z zVar) {
        this.f10167n = c2Var;
        r(c1.f10492w9, c1.f10436s5);
        r(c1.f10223b8, new t1(f10, f11, f12, f13));
        r(c1.f10300i, zVar);
        r(c1.f10418r0, new d0(0.0f, 0.0f, 0.0f));
        r(c1.f10496x0, new f0(0, 0, 255));
    }

    public static a0 v(c2 c2Var, v vVar, String str, r0 r0Var, String str2, boolean z10) {
        a0 a0Var = new a0(c2Var, vVar);
        a0Var.r(c1.f10492w9, c1.I8);
        a0Var.r(c1.R2, new f1(4));
        a0Var.r(c1.f10454ta, c1.H);
        a0Var.C();
        x0 a10 = c2Var.n(z.v(str, r0Var, str2, a0Var.w())).a();
        if (z10) {
            l0 l0Var = new l0();
            l0Var.r(new c1("PV"), a10);
            a0Var.r(c1.f10326k, l0Var);
        }
        a0Var.r(c1.f10300i, a10);
        return a0Var;
    }

    public boolean A() {
        return this.f10170q;
    }

    public boolean B() {
        return this.f10172s;
    }

    public void C() {
        r(c1.T6, this.f10167n.v());
    }

    public void D() {
        this.f10172s = true;
    }

    public x0 w() {
        if (this.f10168o == null) {
            this.f10168o = this.f10167n.K();
        }
        return this.f10168o;
    }

    public int x() {
        return this.f10173t;
    }

    public HashSet y() {
        return this.f10169p;
    }

    public boolean z() {
        return this.f10171r;
    }

    public a0(c2 c2Var, float f10, float f11, float f12, float f13, y1 y1Var, y1 y1Var2) {
        this.f10167n = c2Var;
        r(c1.f10492w9, c1.H9);
        r(c1.B9, y1Var);
        r(c1.f10223b8, new t1(f10, f11, f12, f13));
        r(c1.f10393p1, y1Var2);
    }

    public a0(c2 c2Var, v vVar) {
        this.f10167n = c2Var;
        if (vVar != null) {
            r(c1.f10223b8, new t1(vVar));
        }
    }
}
