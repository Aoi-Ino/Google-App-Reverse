package e8;

import a8.g;
import a8.i;
import a8.o;
import a8.u;
import b8.a;
import java.util.ArrayList;

public class n1 implements o {
    private boolean A;
    protected boolean B;
    private int C;
    protected boolean D;

    /* renamed from: e  reason: collision with root package name */
    protected ArrayList f10940e;

    /* renamed from: f  reason: collision with root package name */
    protected float f10941f;

    /* renamed from: g  reason: collision with root package name */
    protected k1[] f10942g;

    /* renamed from: h  reason: collision with root package name */
    protected int f10943h;

    /* renamed from: i  reason: collision with root package name */
    protected k1 f10944i;

    /* renamed from: j  reason: collision with root package name */
    protected float f10945j;

    /* renamed from: k  reason: collision with root package name */
    protected float[] f10946k;

    /* renamed from: l  reason: collision with root package name */
    protected float[] f10947l;

    /* renamed from: m  reason: collision with root package name */
    protected int f10948m;

    /* renamed from: n  reason: collision with root package name */
    protected float f10949n;

    /* renamed from: o  reason: collision with root package name */
    private int f10950o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10951p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10952q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f10953r;

    /* renamed from: s  reason: collision with root package name */
    protected int f10954s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10955t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10956u;

    /* renamed from: v  reason: collision with root package name */
    protected float f10957v;

    /* renamed from: w  reason: collision with root package name */
    protected float f10958w;

    /* renamed from: x  reason: collision with root package name */
    private boolean[] f10959x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10960y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f10961z;

    protected n1() {
        this.f10940e = new ArrayList();
        this.f10941f = 0.0f;
        this.f10943h = 0;
        this.f10944i = new k1((u) null);
        this.f10945j = 0.0f;
        this.f10949n = 80.0f;
        this.f10950o = 1;
        this.f10951p = false;
        this.f10952q = false;
        this.f10953r = false;
        this.f10954s = 0;
        this.f10955t = false;
        this.f10956u = true;
        this.f10959x = new boolean[]{false, false};
        this.f10961z = true;
        this.B = true;
        this.D = true;
    }

    public static n1 X(n1 n1Var) {
        n1 n1Var2 = new n1();
        n1Var2.g(n1Var);
        return n1Var2;
    }

    private void a0() {
        int i10 = this.f10954s == 3 ? -1 : 1;
        while (L(this.f10940e.size(), this.f10943h)) {
            this.f10943h += i10;
        }
    }

    public static g0[] c(g0 g0Var) {
        return new g0[]{g0Var, g0Var.o(), g0Var.o(), g0Var.o()};
    }

    public static void i(g0[] g0VarArr) {
        g0 g0Var = g0VarArr[0];
        g0Var.I();
        g0Var.c(g0VarArr[1]);
        g0Var.G();
        g0Var.I();
        g0Var.Q(2);
        g0Var.F();
        g0Var.c(g0VarArr[2]);
        g0Var.G();
        g0Var.c(g0VarArr[3]);
    }

    public float A() {
        return this.f10945j;
    }

    public float B() {
        return this.f10949n;
    }

    public boolean C() {
        return this.f10959x[0];
    }

    public boolean D(boolean z10) {
        return z10 ? this.f10959x[0] : this.f10959x[1];
    }

    public boolean E() {
        return this.f10960y;
    }

    public int F() {
        return 23;
    }

    public boolean G() {
        return this.f10955t;
    }

    public boolean H() {
        return this.f10951p;
    }

    public boolean I() {
        return this.f10952q;
    }

    public boolean J() {
        return this.f10961z;
    }

    public boolean K() {
        return this.f10956u;
    }

    /* access modifiers changed from: package-private */
    public boolean L(int i10, int i11) {
        if (i11 >= p() || i11 < 0 || i10 == 0) {
            return false;
        }
        int i12 = i10 - 1;
        if (((m1) this.f10940e.get(i12)) == null) {
            return false;
        }
        do {
            k1 f10 = f(i12, i11);
            if (f10 != null || i12 <= 0) {
                int i13 = i10 - i12;
                if (f10.c0() == 1 && i13 > 1) {
                    int i14 = i11 - 1;
                    m1 m1Var = (m1) this.f10940e.get(i12 + 1);
                    i13--;
                    f10 = m1Var.b()[i14];
                    while (f10 == null && i14 > 0) {
                        i14--;
                        f10 = m1Var.b()[i14];
                    }
                }
                return f10 != null && f10.c0() > i13;
            }
            i12--;
        } while (((m1) this.f10940e.get(i12)) != null);
        return false;
    }

    public void M(boolean z10) {
        this.B = z10;
    }

    public void N(boolean z10) {
        boolean[] zArr = this.f10959x;
        zArr[0] = z10;
        zArr[1] = z10;
    }

    public void O(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f10948m = i10;
    }

    public void P(boolean z10) {
        this.f10960y = z10;
    }

    public void Q(boolean z10) {
        this.f10951p = z10;
    }

    public void R(float f10) {
        this.f10958w = f10;
    }

    public void S(float f10) {
        this.f10957v = f10;
    }

    public boolean T() {
        return true;
    }

    public void U(float f10) {
        if (this.f10945j != f10) {
            this.f10945j = f10;
            this.f10941f = 0.0f;
            e();
            d(true);
        }
    }

    public void V(float f10) {
        this.f10949n = f10;
    }

    public void W(float[] fArr) {
        if (fArr.length == p()) {
            float[] fArr2 = new float[fArr.length];
            this.f10946k = fArr2;
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f10947l = new float[fArr.length];
            this.f10941f = 0.0f;
            e();
            d(true);
            return;
        }
        throw new g(a.b("wrong.number.of.columns", new Object[0]));
    }

    public boolean Y() {
        return this.B;
    }

    public int Z() {
        return this.f10940e.size();
    }

    public void a(k1 k1Var) {
        boolean z10;
        int i10;
        k1[] k1VarArr;
        this.D = false;
        k1 k1Var2 = new k1(k1Var);
        int min = Math.min(Math.max(k1Var2.P(), 1), this.f10942g.length - this.f10943h);
        k1Var2.l0(min);
        if (min != 1) {
            this.f10953r = true;
        }
        if (k1Var2.d0() == 0) {
            k1Var2.t0(this.f10954s);
        }
        a0();
        int i11 = this.f10943h;
        k1[] k1VarArr2 = this.f10942g;
        if (i11 < k1VarArr2.length) {
            k1VarArr2[i11] = k1Var2;
            this.f10943h = i11 + min;
            z10 = true;
        } else {
            z10 = false;
        }
        a0();
        while (true) {
            i10 = this.f10943h;
            k1VarArr = this.f10942g;
            if (i10 < k1VarArr.length) {
                break;
            }
            int p10 = p();
            if (this.f10954s == 3) {
                k1[] k1VarArr3 = new k1[p10];
                int length = this.f10942g.length;
                int i12 = 0;
                while (true) {
                    k1[] k1VarArr4 = this.f10942g;
                    if (i12 >= k1VarArr4.length) {
                        break;
                    }
                    k1 k1Var3 = k1VarArr4[i12];
                    int P = k1Var3.P();
                    length -= P;
                    k1VarArr3[length] = k1Var3;
                    i12 = i12 + (P - 1) + 1;
                }
                this.f10942g = k1VarArr3;
            }
            m1 m1Var = new m1(this.f10942g);
            if (this.f10945j > 0.0f) {
                m1Var.j(this.f10947l);
                this.f10941f += m1Var.c();
            }
            this.f10940e.add(m1Var);
            this.f10942g = new k1[p10];
            this.f10943h = 0;
            a0();
            this.D = true;
        }
        if (!z10) {
            k1VarArr[i10] = k1Var2;
            this.f10943h = i10 + min;
        }
    }

    /* access modifiers changed from: protected */
    public m1 b(int i10, int i11) {
        m1 m1Var = new m1(q(i10));
        m1Var.d();
        k1[] b10 = m1Var.b();
        for (int i12 = 0; i12 < b10.length; i12++) {
            k1 k1Var = b10[i12];
            if (!(k1Var == null || k1Var.c0() == 1)) {
                int min = Math.min(i11, k1Var.c0() + i10);
                float f10 = 0.0f;
                for (int i13 = 1 + i10; i13 < min; i13++) {
                    f10 += s(i13);
                }
                m1Var.h(i12, f10);
            }
        }
        return m1Var;
    }

    public float b0() {
        return this.f10958w;
    }

    public float c0() {
        return this.f10957v;
    }

    public float d(boolean z10) {
        if (this.f10945j <= 0.0f) {
            return 0.0f;
        }
        this.f10941f = 0.0f;
        for (int i10 = 0; i10 < this.f10940e.size(); i10++) {
            this.f10941f += t(i10, z10);
        }
        return this.f10941f;
    }

    public float d0(int i10, int i11, float f10, float f11, g0 g0Var) {
        return g0(0, -1, i10, i11, f10, f11, g0Var);
    }

    /* access modifiers changed from: protected */
    public void e() {
        float f10 = 0.0f;
        if (this.f10945j > 0.0f) {
            int p10 = p();
            for (int i10 = 0; i10 < p10; i10++) {
                f10 += this.f10946k[i10];
            }
            for (int i11 = 0; i11 < p10; i11++) {
                this.f10947l[i11] = (this.f10945j * this.f10946k[i11]) / f10;
            }
        }
    }

    public ArrayList e0() {
        return new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public k1 f(int i10, int i11) {
        k1[] b10 = ((m1) this.f10940e.get(i10)).b();
        for (int i12 = 0; i12 < b10.length; i12++) {
            k1 k1Var = b10[i12];
            if (k1Var != null && i11 >= i12 && i11 < k1Var.P() + i12) {
                return b10[i12];
            }
        }
        return null;
    }

    public float f0(int i10, int i11, float f10, float f11, g0[] g0VarArr) {
        return h0(0, -1, i10, i11, f10, f11, g0VarArr);
    }

    /* access modifiers changed from: protected */
    public void g(n1 n1Var) {
        this.f10946k = new float[n1Var.p()];
        this.f10947l = new float[n1Var.p()];
        System.arraycopy(n1Var.f10946k, 0, this.f10946k, 0, p());
        System.arraycopy(n1Var.f10947l, 0, this.f10947l, 0, p());
        this.f10945j = n1Var.f10945j;
        this.f10941f = n1Var.f10941f;
        this.f10943h = 0;
        this.f10954s = n1Var.f10954s;
        this.f10944i = new k1(n1Var.f10944i);
        this.f10942g = new k1[n1Var.f10942g.length];
        this.f10953r = n1Var.f10953r;
        this.f10956u = n1Var.f10956u;
        this.f10958w = n1Var.f10958w;
        this.f10957v = n1Var.f10957v;
        this.f10948m = n1Var.f10948m;
        this.C = n1Var.C;
        this.f10955t = n1Var.f10955t;
        this.f10959x = n1Var.f10959x;
        this.f10960y = n1Var.f10960y;
        this.f10949n = n1Var.f10949n;
        this.f10961z = n1Var.f10961z;
        this.f10951p = n1Var.f10951p;
        this.f10952q = n1Var.f10952q;
        this.f10950o = n1Var.f10950o;
        this.A = n1Var.A;
        this.B = n1Var.B;
    }

    public float g0(int i10, int i11, int i12, int i13, float f10, float f11, g0 g0Var) {
        int i14 = i10;
        int i15 = i11;
        int p10 = p();
        boolean z10 = false;
        int min = i14 < 0 ? 0 : Math.min(i10, p10);
        int min2 = i15 < 0 ? p10 : Math.min(i15, p10);
        if (!(min == 0 && min2 == p10)) {
            z10 = true;
        }
        if (z10) {
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i16 = min;
            while (true) {
                if (i16 >= min2) {
                    break;
                }
                f13 += this.f10947l[i16];
                i16++;
            }
            g0Var.I();
            float f14 = min == 0 ? 10000.0f : 0.0f;
            if (min2 == p10) {
                f12 = 10000.0f;
            }
            g0Var.z(f10 - f14, -10000.0f, f13 + f14 + f12, 20000.0f);
            g0Var.g();
            g0Var.y();
        } else {
            g0 g0Var2 = g0Var;
        }
        g0[] c10 = c(g0Var);
        float h02 = h0(min, min2, i12, i13, f10, f11, c10);
        i(c10);
        if (z10) {
            g0Var.G();
        }
        return h02;
    }

    public void h() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f10948m; i10++) {
            arrayList.add(this.f10940e.get(i10));
        }
        this.f10940e = arrayList;
        this.f10941f = 0.0f;
        if (this.f10945j > 0.0f) {
            this.f10941f = l();
        }
    }

    public float h0(int i10, int i11, int i12, int i13, float f10, float f11, g0[] g0VarArr) {
        int i14 = 0;
        if (this.f10945j > 0.0f) {
            int size = this.f10940e.size();
            if (i12 < 0) {
                i12 = 0;
            }
            if (i13 >= 0) {
                size = Math.min(i13, size);
            }
            if (i12 >= size) {
                return f11;
            }
            int p10 = p();
            if (i10 >= 0) {
                i14 = Math.min(i10, p10);
            }
            if (i11 >= 0) {
                p10 = Math.min(i11, p10);
            }
            while (i12 < size) {
                m1 m1Var = (m1) this.f10940e.get(i12);
                if (m1Var != null) {
                    m1Var.m(i14, p10, f10, f11, g0VarArr);
                    f11 -= m1Var.c();
                }
                i12++;
            }
            return f11;
        }
        throw new RuntimeException(a.b("the.table.width.must.be.greater.than.zero", new Object[0]));
    }

    public float j() {
        int min = Math.min(this.f10940e.size(), this.f10948m);
        float f10 = 0.0f;
        for (int max = Math.max(0, this.f10948m - this.C); max < min; max++) {
            m1 m1Var = (m1) this.f10940e.get(max);
            if (m1Var != null) {
                f10 += m1Var.c();
            }
        }
        return f10;
    }

    public int k() {
        return this.C;
    }

    public float l() {
        int min = Math.min(this.f10940e.size(), this.f10948m);
        float f10 = 0.0f;
        for (int i10 = 0; i10 < min; i10++) {
            m1 m1Var = (m1) this.f10940e.get(i10);
            if (m1Var != null) {
                f10 += m1Var.c();
            }
        }
        return f10;
    }

    public int m() {
        return this.f10948m;
    }

    public int n() {
        return this.f10950o;
    }

    public boolean o() {
        return this.A;
    }

    public int p() {
        return this.f10946k.length;
    }

    public m1 q(int i10) {
        return (m1) this.f10940e.get(i10);
    }

    public boolean r(i iVar) {
        try {
            return iVar.b(this);
        } catch (g unused) {
            return false;
        }
    }

    public float s(int i10) {
        return t(i10, false);
    }

    public float t(int i10, boolean z10) {
        m1 m1Var;
        int i11;
        float f10;
        if (this.f10945j <= 0.0f || i10 < 0 || i10 >= this.f10940e.size() || (m1Var = (m1) this.f10940e.get(i10)) == null) {
            return 0.0f;
        }
        if (z10) {
            m1Var.j(this.f10947l);
        }
        float c10 = m1Var.c();
        for (int i12 = 0; i12 < this.f10946k.length; i12++) {
            if (L(i10, i12)) {
                int i13 = 1;
                while (true) {
                    i11 = i10 - i13;
                    if (!L(i11, i12)) {
                        break;
                    }
                    i13++;
                }
                k1 k1Var = ((m1) this.f10940e.get(i11)).b()[i12];
                if (k1Var == null || k1Var.c0() != i13 + 1) {
                    f10 = 0.0f;
                } else {
                    f10 = k1Var.a0();
                    while (i13 > 0) {
                        f10 -= s(i10 - i13);
                        i13--;
                    }
                }
                if (f10 > c10) {
                    c10 = f10;
                }
            }
        }
        m1Var.i(c10);
        return c10;
    }

    public ArrayList u() {
        return this.f10940e;
    }

    public void v() {
        h();
        Q(true);
    }

    public ArrayList w(int i10, int i11) {
        k1 k1Var;
        ArrayList arrayList = new ArrayList();
        if (i10 >= 0 && i11 <= Z()) {
            m1 b10 = b(i10, i11);
            int i12 = 0;
            while (i12 < p()) {
                int i13 = i10;
                while (true) {
                    int i14 = i13 - 1;
                    if (!L(i13, i12)) {
                        break;
                    }
                    m1 q10 = q(i14);
                    if (!(q10 == null || (k1Var = q10.b()[i12]) == null)) {
                        b10.b()[i12] = new k1(k1Var);
                        int min = Math.min(k1Var.c0() + i14, i11);
                        float f10 = 0.0f;
                        for (int i15 = i10 + 1; i15 < min; i15++) {
                            f10 += s(i15);
                        }
                        b10.h(i12, f10);
                        b10.b()[i12].N((x(i14, i12) - s(i10)) - f10);
                    }
                    i13 = i14;
                }
                k1 k1Var2 = b10.b()[i12];
                i12 = k1Var2 == null ? i12 + 1 : i12 + k1Var2.P();
            }
            while (true) {
                arrayList.add(b10);
                i10++;
                if (i10 >= i11) {
                    break;
                }
                b10 = b(i10, i11);
            }
        }
        return arrayList;
    }

    public float x(int i10, int i11) {
        m1 m1Var;
        float f10 = 0.0f;
        if (this.f10945j > 0.0f && i10 >= 0 && i10 < this.f10940e.size() && (m1Var = (m1) this.f10940e.get(i10)) != null && i11 < m1Var.b().length) {
            k1 k1Var = m1Var.b()[i11];
            if (k1Var == null) {
                return 0.0f;
            }
            for (int i12 = 0; i12 < k1Var.c0(); i12++) {
                f10 += s(i10 + i12);
            }
        }
        return f10;
    }

    public o1 y() {
        return null;
    }

    public float z() {
        return this.f10941f;
    }

    public n1(int i10) {
        this.f10940e = new ArrayList();
        this.f10941f = 0.0f;
        this.f10943h = 0;
        this.f10944i = new k1((u) null);
        this.f10945j = 0.0f;
        this.f10949n = 80.0f;
        this.f10950o = 1;
        this.f10951p = false;
        this.f10952q = false;
        this.f10953r = false;
        this.f10954s = 0;
        this.f10955t = false;
        this.f10956u = true;
        this.f10959x = new boolean[]{false, false};
        this.f10961z = true;
        this.B = true;
        this.D = true;
        if (i10 > 0) {
            this.f10946k = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f10946k[i11] = 1.0f;
            }
            this.f10947l = new float[this.f10946k.length];
            e();
            this.f10942g = new k1[this.f10947l.length];
            this.A = false;
            return;
        }
        throw new IllegalArgumentException(a.b("the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero", new Object[0]));
    }

    public n1(n1 n1Var) {
        k1 k1Var;
        this.f10940e = new ArrayList();
        this.f10941f = 0.0f;
        this.f10943h = 0;
        this.f10944i = new k1((u) null);
        this.f10945j = 0.0f;
        this.f10949n = 80.0f;
        this.f10950o = 1;
        this.f10951p = false;
        this.f10952q = false;
        this.f10953r = false;
        this.f10954s = 0;
        this.f10955t = false;
        this.f10956u = true;
        this.f10959x = new boolean[]{false, false};
        this.f10961z = true;
        this.B = true;
        this.D = true;
        g(n1Var);
        int i10 = 0;
        while (true) {
            k1[] k1VarArr = this.f10942g;
            if (i10 < k1VarArr.length && (k1Var = n1Var.f10942g[i10]) != null) {
                k1VarArr[i10] = new k1(k1Var);
                i10++;
            }
        }
        for (int i11 = 0; i11 < n1Var.f10940e.size(); i11++) {
            m1 m1Var = (m1) n1Var.f10940e.get(i11);
            if (m1Var != null) {
                m1Var = new m1(m1Var);
            }
            this.f10940e.add(m1Var);
        }
    }
}
