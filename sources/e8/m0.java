package e8;

import a8.f;
import a8.g;
import a8.h;
import a8.j;
import a8.k;
import a8.n;
import a8.p;
import a8.q;
import a8.r;
import a8.t;
import a8.u;
import a8.v;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class m0 extends f {

    /* renamed from: h0  reason: collision with root package name */
    protected static final DecimalFormat f10902h0 = new DecimalFormat("0000000000000000");
    protected int A;
    protected byte[] B = null;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected boolean G = true;
    protected z0 H = null;
    protected ArrayList I = new ArrayList();
    protected int J = -1;
    protected b K = new b();
    protected d L = new d();
    protected j1 M;
    protected j1 N;
    protected g8.c O = new g8.c();
    protected TreeMap P = new TreeMap();
    protected HashMap Q = new HashMap();
    protected HashMap R = new HashMap();
    protected String S;
    protected z T;
    protected l0 U;
    g8.a V;
    protected int W;
    protected v X = null;
    protected HashMap Y = new HashMap();
    protected HashMap Z = new HashMap();

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10903a0 = true;

    /* renamed from: b0  reason: collision with root package name */
    protected int f10904b0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    protected l0 f10905c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    protected x0 f10906d0;

    /* renamed from: e0  reason: collision with root package name */
    protected x f10907e0;

    /* renamed from: f0  reason: collision with root package name */
    protected boolean f10908f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    protected float f10909g0 = -1.0f;

    /* renamed from: r  reason: collision with root package name */
    protected c2 f10910r;

    /* renamed from: s  reason: collision with root package name */
    protected g0 f10911s;

    /* renamed from: t  reason: collision with root package name */
    protected g0 f10912t;

    /* renamed from: u  reason: collision with root package name */
    protected float f10913u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    protected int f10914v = 0;

    /* renamed from: w  reason: collision with root package name */
    protected float f10915w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    protected boolean f10916x = false;

    /* renamed from: y  reason: collision with root package name */
    protected int f10917y = 0;

    /* renamed from: z  reason: collision with root package name */
    protected z f10918z = null;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public z f10919a;

        /* renamed from: b  reason: collision with root package name */
        public x0 f10920b;

        /* renamed from: c  reason: collision with root package name */
        public k0 f10921c;

        public a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f10923a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        float f10924b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        float f10925c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        float f10926d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        float f10927e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        float f10928f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        float f10929g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        float f10930h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        float f10931i = 0.0f;
    }

    static class c extends l0 {

        /* renamed from: n  reason: collision with root package name */
        c2 f10932n;

        c(x0 x0Var, c2 c2Var) {
            super(l0.f10898m);
            this.f10932n = c2Var;
            r(c1.Z6, x0Var);
        }

        /* access modifiers changed from: package-private */
        public void v(TreeMap treeMap, HashMap hashMap, HashMap hashMap2, c2 c2Var) {
            if (!treeMap.isEmpty() || !hashMap.isEmpty() || !hashMap2.isEmpty()) {
                try {
                    l0 l0Var = new l0();
                    if (!treeMap.isEmpty()) {
                        b0 b0Var = new b0();
                        for (Map.Entry entry : treeMap.entrySet()) {
                            String str = (String) entry.getKey();
                            a aVar = (a) entry.getValue();
                            if (aVar.f10921c != null) {
                                x0 x0Var = aVar.f10920b;
                                b0Var.m(new y1(str, (String) null));
                                b0Var.m(x0Var);
                            }
                        }
                        if (b0Var.t() > 0) {
                            l0 l0Var2 = new l0();
                            l0Var2.r(c1.f10209a6, b0Var);
                            l0Var.r(c1.W1, c2Var.n(l0Var2).a());
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        l0Var.r(c1.U4, c2Var.n(d1.a(hashMap, c2Var)).a());
                    }
                    if (!hashMap2.isEmpty()) {
                        l0Var.r(c1.C2, c2Var.n(d1.a(hashMap2, c2Var)).a());
                    }
                    if (l0Var.u() > 0) {
                        r(c1.f10209a6, c2Var.n(l0Var).a());
                    }
                } catch (IOException e10) {
                    throw new j(e10);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(l0 l0Var) {
            try {
                r(c1.f10326k, this.f10932n.n(l0Var).a());
            } catch (Exception e10) {
                throw new j(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public void x(z zVar) {
            r(c1.E6, zVar);
        }
    }

    public static class d extends l0 {
        d() {
            z();
            w();
        }

        /* access modifiers changed from: package-private */
        public void A(String str) {
            r(c1.f10466u9, new y1(str, "UnicodeBig"));
        }

        /* access modifiers changed from: package-private */
        public void B(String str) {
            r(c1.U9, new y1(str, "UnicodeBig"));
        }

        /* access modifiers changed from: package-private */
        public void C(String str, String str2) {
            if (!str.equals("Producer") && !str.equals("CreationDate")) {
                r(new c1(str), new y1(str2, "UnicodeBig"));
            }
        }

        /* access modifiers changed from: package-private */
        public void v(String str) {
            r(c1.V, new y1(str, "UnicodeBig"));
        }

        /* access modifiers changed from: package-private */
        public void w() {
            j0 j0Var = new j0();
            r(c1.f10484w1, j0Var);
            r(c1.R5, j0Var);
        }

        /* access modifiers changed from: package-private */
        public void x(String str) {
            r(c1.f10497x1, new y1(str, "UnicodeBig"));
        }

        /* access modifiers changed from: package-private */
        public void y(String str) {
            r(c1.f10208a5, new y1(str, "UnicodeBig"));
        }

        /* access modifiers changed from: package-private */
        public void z() {
            r(c1.M7, new y1(f.o()));
        }
    }

    public m0() {
        i();
        g();
    }

    /* access modifiers changed from: protected */
    public void A() {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        z0 z0Var = this.H;
        if (z0Var != null && z0Var.w() > 0) {
            if (this.f10915w + this.H.l() + this.f10913u > M() - J()) {
                z0 z0Var2 = this.H;
                this.H = null;
                d();
                this.H = z0Var2;
            }
            this.f10915w += this.H.l();
            this.I.add(this.H);
            this.f10903a0 = false;
        }
        float f10 = this.f10909g0;
        if (f10 > -1.0f && this.f10915w > f10) {
            this.f10909g0 = -1.0f;
            b bVar = this.K;
            bVar.f10929g = 0.0f;
            bVar.f10926d = 0.0f;
        }
        this.H = new z0(K(), L(), this.f10914v, this.f10913u);
    }

    /* access modifiers changed from: protected */
    public void B() {
        try {
            int i10 = this.J;
            if (i10 == 11 || i10 == 10) {
                R();
                D();
            }
        } catch (g e10) {
            throw new j(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C(n1 n1Var, float f10) {
        if (!n1Var.G()) {
            n1Var.U(((L() - K()) * n1Var.B()) / 100.0f);
        }
        B();
        float z10 = n1Var.z();
        float f11 = 0.0f;
        if (this.f10915w > 0.0f) {
            f11 = n1Var.c0();
        }
        return z10 + f11 <= ((M() - this.f10915w) - J()) - f10;
    }

    /* access modifiers changed from: protected */
    public float D() {
        if (this.I == null) {
            return 0.0f;
        }
        z0 z0Var = this.H;
        if (z0Var != null && z0Var.w() > 0) {
            this.I.add(this.H);
            this.H = new z0(K(), L(), this.f10914v, this.f10913u);
        }
        if (this.I.isEmpty()) {
            return 0.0f;
        }
        Object[] objArr = new Object[2];
        objArr[1] = new Float(0.0f);
        Iterator it = this.I.iterator();
        s0 s0Var = null;
        float f10 = 0.0f;
        while (it.hasNext()) {
            z0 z0Var2 = (z0) it.next();
            float m10 = z0Var2.m() - K();
            b bVar = this.K;
            float f11 = m10 + bVar.f10923a + bVar.f10925c + bVar.f10924b;
            this.f10911s.w(f11, -z0Var2.l());
            if (z0Var2.r() != null) {
                l.L(this.f10912t, 0, new u(z0Var2.r()), this.f10911s.t() - z0Var2.q(), this.f10911s.u(), 0.0f);
            }
            objArr[0] = s0Var;
            X(z0Var2, this.f10911s, this.f10912t, objArr, this.f10910r.M());
            s0Var = (s0) objArr[0];
            f10 += z0Var2.l();
            this.f10911s.w(-f11, 0.0f);
        }
        this.I = new ArrayList();
        return f10;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (r5 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e8.m0.c E(e8.x0 r5) {
        /*
            r4 = this;
            e8.m0$c r0 = new e8.m0$c
            e8.c2 r1 = r4.f10910r
            r0.<init>(r5, r1)
            e8.j1 r5 = r4.M
            java.util.ArrayList r5 = r5.w()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0025
            e8.c1 r5 = e8.c1.Y6
            e8.c1 r1 = e8.c1.Ja
            r0.r(r5, r1)
            e8.c1 r5 = e8.c1.O6
            e8.j1 r1 = r4.M
            e8.x0 r1 = r1.x()
            r0.r(r5, r1)
        L_0x0025:
            e8.c2 r5 = r4.f10910r
            g8.b r5 = r5.L()
            r5.a(r0)
            g8.c r5 = r4.O
            r5.a(r0)
            java.util.TreeMap r5 = r4.P
            java.util.HashMap r1 = r4.F()
            java.util.HashMap r2 = r4.R
            e8.c2 r3 = r4.f10910r
            r0.v(r5, r1, r2, r3)
            java.lang.String r5 = r4.S
            if (r5 == 0) goto L_0x004c
            e8.z r5 = r4.H(r5)
        L_0x0048:
            r0.x(r5)
            goto L_0x0051
        L_0x004c:
            e8.z r5 = r4.T
            if (r5 == 0) goto L_0x0051
            goto L_0x0048
        L_0x0051:
            e8.l0 r5 = r4.U
            if (r5 == 0) goto L_0x0058
            r0.w(r5)
        L_0x0058:
            g8.a r5 = r4.V
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x007d
            e8.c1 r5 = e8.c1.f10365n     // Catch:{ IOException -> 0x0076 }
            e8.c2 r1 = r4.f10910r     // Catch:{ IOException -> 0x0076 }
            g8.a r2 = r4.V     // Catch:{ IOException -> 0x0076 }
            e8.y r2 = r2.e()     // Catch:{ IOException -> 0x0076 }
            e8.w0 r1 = r1.n(r2)     // Catch:{ IOException -> 0x0076 }
            e8.x0 r1 = r1.a()     // Catch:{ IOException -> 0x0076 }
            r0.r(r5, r1)     // Catch:{ IOException -> 0x0076 }
            goto L_0x007d
        L_0x0076:
            r5 = move-exception
            a8.j r0 = new a8.j
            r0.<init>(r5)
            throw r0
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.m0.E(e8.x0):e8.m0$c");
    }

    /* access modifiers changed from: package-private */
    public HashMap F() {
        return this.Q;
    }

    /* access modifiers changed from: package-private */
    public d G() {
        return this.L;
    }

    /* access modifiers changed from: package-private */
    public z H(String str) {
        a aVar = (a) this.P.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        z zVar = aVar.f10919a;
        if (zVar != null) {
            return zVar;
        }
        if (aVar.f10920b == null) {
            aVar.f10920b = this.f10910r.K();
        }
        z zVar2 = new z(aVar.f10920b);
        aVar.f10919a = zVar2;
        this.P.put(str, aVar);
        return zVar2;
    }

    /* access modifiers changed from: package-private */
    public x I() {
        return this.f10907e0;
    }

    /* access modifiers changed from: package-private */
    public float J() {
        return l(this.K.f10931i);
    }

    /* access modifiers changed from: protected */
    public float K() {
        b bVar = this.K;
        return q(bVar.f10923a + bVar.f10925c + bVar.f10926d + bVar.f10924b);
    }

    /* access modifiers changed from: protected */
    public float L() {
        b bVar = this.K;
        return r(bVar.f10927e + bVar.f10928f + bVar.f10929g);
    }

    /* access modifiers changed from: protected */
    public float M() {
        return t(this.K.f10930h);
    }

    /* access modifiers changed from: protected */
    public void N() {
        this.f280n++;
        this.V.h();
        this.f10907e0 = new x();
        this.f10910r.U();
        this.f10912t = new g0(this.f10910r);
        this.W = 0;
        V();
        this.f10909g0 = -1.0f;
        b bVar = this.K;
        bVar.f10929g = 0.0f;
        bVar.f10926d = 0.0f;
        bVar.f10931i = 0.0f;
        bVar.f10930h = 0.0f;
        this.f10915w = 0.0f;
        this.Y = new HashMap(this.Z);
        if (!(this.f270d.b() == null && !this.f270d.B() && this.f270d.c() == null)) {
            b(this.f270d);
        }
        float f10 = this.f10913u;
        int i10 = this.f10914v;
        this.f10903a0 = true;
        this.f10913u = f10;
        this.f10914v = i10;
        A();
        this.f10910r.H();
        this.G = false;
    }

    /* access modifiers changed from: package-private */
    public boolean O() {
        c2 c2Var = this.f10910r;
        return c2Var == null || (c2Var.y().d0() == 0 && this.f10910r.z().d0() == 0 && (this.f10903a0 || this.f10910r.g()));
    }

    /* access modifiers changed from: package-private */
    public boolean P(String str, k0 k0Var) {
        a aVar = (a) this.P.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        if (aVar.f10921c != null) {
            return false;
        }
        aVar.f10921c = k0Var;
        this.P.put(str, aVar);
        if (k0Var.v()) {
            return true;
        }
        k0Var.u(this.f10910r.v());
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Q(String str, float f10, float f11, float f12, float f13) {
        this.V.c(new a0(this.f10910r, f10, f11, f12, f13, H(str)));
    }

    /* access modifiers changed from: protected */
    public void R() {
        this.J = -1;
        A();
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.I.add(this.H);
            this.f10915w += this.H.l();
        }
        this.H = new z0(K(), L(), this.f10914v, this.f10913u);
    }

    /* access modifiers changed from: package-private */
    public void S(j1 j1Var) {
        j1Var.B(this.f10910r.K());
        if (j1Var.z() != null) {
            j1Var.r(c1.f10246d7, j1Var.z().x());
        }
        ArrayList w10 = j1Var.w();
        int size = w10.size();
        for (int i10 = 0; i10 < size; i10++) {
            S((j1) w10.get(i10));
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                ((j1) w10.get(i11)).r(c1.C7, ((j1) w10.get(i11 - 1)).x());
            }
            if (i11 < size - 1) {
                ((j1) w10.get(i11)).r(c1.f10281g6, ((j1) w10.get(i11 + 1)).x());
            }
        }
        if (size > 0) {
            j1Var.r(c1.f10254e3, ((j1) w10.get(0)).x());
            j1Var.r(c1.f10280g5, ((j1) w10.get(size - 1)).x());
        }
        for (int i12 = 0; i12 < size; i12++) {
            j1 j1Var2 = (j1) w10.get(i12);
            this.f10910r.o(j1Var2, j1Var2.x());
        }
    }

    /* access modifiers changed from: package-private */
    public void T(String str, int i10, float f10, float f11, float f12, float f13) {
        v(new a0(this.f10910r, f10, f11, f12, f13, new z(str, i10)));
    }

    /* access modifiers changed from: package-private */
    public void U(String str, String str2, float f10, float f11, float f12, float f13) {
        this.V.c(new a0(this.f10910r, f10, f11, f12, f13, new z(str, str2)));
    }

    /* access modifiers changed from: protected */
    public void V() {
        float f10;
        this.f270d = this.X;
        if (!this.f275i || (m() & 1) != 0) {
            this.f271e = this.C;
            this.f272f = this.D;
        } else {
            this.f272f = this.C;
            this.f271e = this.D;
        }
        if (!this.f276j || (m() & 1) != 0) {
            this.f273g = this.E;
            f10 = this.F;
        } else {
            this.f273g = this.F;
            f10 = this.E;
        }
        this.f274h = f10;
        g0 g0Var = new g0(this.f10910r);
        this.f10911s = g0Var;
        g0Var.B();
        this.f10911s.e();
        this.A = this.f10911s.d0();
        this.f10911s.w(p(), s());
    }

    /* access modifiers changed from: package-private */
    public void W(j1 j1Var) {
        int v10;
        ArrayList w10 = j1Var.w();
        j1 z10 = j1Var.z();
        if (!w10.isEmpty()) {
            for (int i10 = 0; i10 < w10.size(); i10++) {
                W((j1) w10.get(i10));
            }
            if (z10 == null) {
                return;
            }
            if (j1Var.y()) {
                v10 = j1Var.v() + z10.v();
            } else {
                z10.A(z10.v() + 1);
                j1Var.A(-j1Var.v());
                return;
            }
        } else if (z10 != null) {
            v10 = z10.v();
        } else {
            return;
        }
        z10.A(v10 + 1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x057d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06a0  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x06e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float X(e8.z0 r57, e8.g0 r58, e8.g0 r59, java.lang.Object[] r60, float r61) {
        /*
            r56 = this;
            r7 = r56
            r8 = r57
            r9 = r58
            r10 = r59
            r11 = 0
            r0 = r60[r11]
            e8.s0 r0 = (e8.s0) r0
            r12 = 1
            r1 = r60[r12]
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r2 = r58.t()
            float r3 = r57.i()
            float r2 = r2 + r3
            int r13 = r57.s()
            int r3 = r57.g()
            boolean r4 = r57.k()
            if (r4 == 0) goto L_0x0033
            if (r13 != 0) goto L_0x0031
            if (r3 <= r12) goto L_0x0033
        L_0x0031:
            r14 = r12
            goto L_0x0034
        L_0x0033:
            r14 = r11
        L_0x0034:
            int r4 = r57.j()
            r15 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r4 <= 0) goto L_0x004c
            float r3 = r57.x()
            float r4 = (float) r4
            float r3 = r3 / r4
            r11 = r1
            r17 = r2
            r4 = r6
        L_0x0047:
            r5 = r4
            r18 = r5
            goto L_0x00e6
        L_0x004c:
            if (r14 == 0) goto L_0x00d1
            if (r4 != 0) goto L_0x00d1
            boolean r4 = r57.n()
            if (r4 == 0) goto L_0x007f
            float r4 = r57.x()
            float r5 = (float) r13
            float r5 = r5 * r61
            float r11 = (float) r3
            float r5 = r5 + r11
            float r5 = r5 - r15
            float r5 = r5 * r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x007f
            boolean r3 = r57.o()
            if (r3 == 0) goto L_0x0073
            float r3 = r57.x()
            float r3 = r3 - r5
            r9.w(r3, r6)
        L_0x0073:
            float r3 = r61 * r1
            r5 = r1
            r11 = r5
            r17 = r2
            r4 = r3
            r3 = r6
            r18 = r3
            goto L_0x00e6
        L_0x007f:
            float r1 = r57.x()
            int r4 = r57.w()
            int r4 = r4 - r12
            e8.e0 r4 = r8.d(r4)
            if (r4 == 0) goto L_0x00be
            java.lang.String r5 = r4.toString()
            int r11 = r5.length()
            if (r11 <= 0) goto L_0x00be
            int r11 = r5.length()
            int r11 = r11 - r12
            char r5 = r5.charAt(r11)
            java.lang.String r11 = ".,;:'"
            int r11 = r11.indexOf(r5)
            if (r11 < 0) goto L_0x00be
            e8.s0 r4 = r4.c()
            float r4 = r4.g(r5)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            float r4 = r4 * r5
            float r4 = r4 + r1
            float r1 = r4 - r1
            r55 = r4
            r4 = r1
            r1 = r55
            goto L_0x00bf
        L_0x00be:
            r4 = r6
        L_0x00bf:
            float r5 = (float) r13
            float r5 = r5 * r61
            float r3 = (float) r3
            float r5 = r5 + r3
            float r5 = r5 - r15
            float r1 = r1 / r5
            float r3 = r61 * r1
            r5 = r1
            r11 = r5
            r17 = r2
            r18 = r4
            r4 = r3
            r3 = r6
            goto L_0x00e6
        L_0x00d1:
            int r3 = r8.f11090d
            if (r3 == 0) goto L_0x00e0
            r4 = -1
            if (r3 != r4) goto L_0x00d9
            goto L_0x00e0
        L_0x00d9:
            r11 = r1
            r17 = r2
            r3 = r6
            r4 = r3
            goto L_0x0047
        L_0x00e0:
            float r3 = r57.x()
            float r2 = r2 - r3
            goto L_0x00d9
        L_0x00e6:
            int r2 = r57.f()
            float r19 = r58.t()
            float r1 = r58.u()
            java.util.Iterator r20 = r57.p()
            r21 = 2143289344(0x7fc00000, float:NaN)
            r25 = r6
            r24 = r19
            r22 = r21
            r15 = 0
            r23 = 0
        L_0x0101:
            boolean r26 = r20.hasNext()
            if (r26 == 0) goto L_0x0701
            java.lang.Object r26 = r20.next()
            r6 = r26
            e8.e0 r6 = (e8.e0) r6
            a8.b r12 = r6.b()
            e8.s0 r28 = r6.c()
            r61 = r11
            float r11 = r28.e()
            e8.s0 r28 = r6.c()
            r29 = r0
            e8.c r0 = r28.b()
            r28 = r3
            r3 = 1
            float r30 = r0.l(r3, r11)
            e8.s0 r0 = r6.c()
            e8.c r0 = r0.b()
            r3 = 3
            float r31 = r0.l(r3, r11)
            java.lang.String r0 = "HSCALE"
            java.lang.String r3 = "SKEW"
            r33 = r13
            java.lang.String r13 = "CHAR_SPACING"
            r34 = r12
            r35 = 0
            if (r15 > r2) goto L_0x04f7
            if (r14 == 0) goto L_0x0150
            float r36 = r6.j(r5, r4)
            goto L_0x0154
        L_0x0150:
            float r36 = r6.B()
        L_0x0154:
            boolean r37 = r6.r()
            if (r37 == 0) goto L_0x04d5
            int r12 = r15 + 1
            e8.e0 r12 = r8.d(r12)
            boolean r38 = r6.p()
            if (r38 == 0) goto L_0x0184
            java.lang.String r0 = "SEPARATOR"
            java.lang.Object r0 = r6.d(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r1 = r0[r1]
            android.support.v4.media.session.b.a(r1)
            r1 = 1
            r0 = r0[r1]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0183
            r57.i()
            throw r35
        L_0x0183:
            throw r35
        L_0x0184:
            boolean r38 = r6.s()
            if (r38 == 0) goto L_0x01bb
            r38 = r0
            java.lang.String r0 = "TAB"
            java.lang.Object r0 = r6.d(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r16 = 0
            r25 = r0[r16]
            android.support.v4.media.session.b.a(r25)
            r25 = 1
            r39 = r0[r25]
            java.lang.Float r39 = (java.lang.Float) r39
            float r25 = r39.floatValue()
            r32 = 3
            r0 = r0[r32]
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r25 = r25 + r0
            int r0 = (r25 > r24 ? 1 : (r25 == r24 ? 0 : -1))
            if (r0 > 0) goto L_0x01ba
            r46 = r2
            r0 = r25
            goto L_0x01c3
        L_0x01ba:
            throw r35
        L_0x01bb:
            r38 = r0
            r46 = r2
            r0 = r24
            r24 = r25
        L_0x01c3:
            java.lang.String r2 = "BACKGROUND"
            boolean r25 = r6.k(r2)
            if (r25 == 0) goto L_0x022d
            if (r12 == 0) goto L_0x01d6
            boolean r25 = r12.k(r2)
            if (r25 == 0) goto L_0x01d6
            r25 = 0
            goto L_0x01d8
        L_0x01d6:
            r25 = r61
        L_0x01d8:
            if (r12 != 0) goto L_0x01dc
            float r25 = r25 + r18
        L_0x01dc:
            java.lang.Object r2 = r6.d(r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r16 = 0
            r39 = r2[r16]
            r47 = r3
            r3 = r39
            a8.b r3 = (a8.b) r3
            r10.M(r3)
            r3 = 1
            r2 = r2[r3]
            float[] r2 = (float[]) r2
            r26 = r2[r16]
            r48 = r4
            float r4 = r0 - r26
            float r26 = r1 + r31
            r39 = r2[r3]
            float r26 = r26 - r39
            float r39 = r6.h()
            float r3 = r26 + r39
            float r25 = r36 - r25
            r26 = r2[r16]
            float r25 = r25 + r26
            r26 = 2
            r39 = r2[r26]
            r49 = r5
            float r5 = r25 + r39
            float r25 = r30 - r31
            r26 = 1
            r39 = r2[r26]
            float r25 = r25 + r39
            r32 = 3
            r2 = r2[r32]
            float r2 = r25 + r2
            r10.z(r4, r3, r5, r2)
            r59.m()
            r5 = 0
            r10.P(r5)
            goto L_0x0234
        L_0x022d:
            r47 = r3
            r48 = r4
            r49 = r5
            r5 = 0
        L_0x0234:
            java.lang.String r2 = "UNDERLINE"
            boolean r3 = r6.k(r2)
            if (r3 == 0) goto L_0x02be
            if (r12 == 0) goto L_0x0246
            boolean r3 = r12.k(r2)
            if (r3 == 0) goto L_0x0246
            r3 = r5
            goto L_0x0248
        L_0x0246:
            r3 = r61
        L_0x0248:
            if (r12 != 0) goto L_0x024c
            float r3 = r3 + r18
        L_0x024c:
            java.lang.Object r2 = r6.d(r2)
            java.lang.Object[][] r2 = (java.lang.Object[][]) r2
            r4 = 0
        L_0x0253:
            int r5 = r2.length
            if (r4 >= r5) goto L_0x02b6
            r5 = r2[r4]
            r16 = 0
            r25 = r5[r16]
            a8.b r25 = (a8.b) r25
            r26 = 1
            r5 = r5[r26]
            float[] r5 = (float[]) r5
            r39 = r2
            if (r25 != 0) goto L_0x026b
            r2 = r34
            goto L_0x026d
        L_0x026b:
            r2 = r25
        L_0x026d:
            if (r2 == 0) goto L_0x0272
            r10.N(r2)
        L_0x0272:
            r25 = r5[r16]
            r40 = r5[r26]
            float r40 = r40 * r11
            float r8 = r25 + r40
            r10.S(r8)
            r8 = 2
            r25 = r5[r8]
            r8 = 3
            r32 = r5[r8]
            float r32 = r32 * r11
            float r25 = r25 + r32
            r32 = 4
            r5 = r5[r32]
            int r5 = (int) r5
            if (r5 == 0) goto L_0x0291
            r10.Q(r5)
        L_0x0291:
            float r8 = r1 + r25
            r10.x(r0, r8)
            float r25 = r0 + r36
            r50 = r14
            float r14 = r25 - r3
            r10.v(r14, r8)
            r59.e0()
            if (r2 == 0) goto L_0x02a7
            r59.D()
        L_0x02a7:
            if (r5 == 0) goto L_0x02ad
            r2 = 0
            r10.Q(r2)
        L_0x02ad:
            int r4 = r4 + 1
            r8 = r57
            r2 = r39
            r14 = r50
            goto L_0x0253
        L_0x02b6:
            r50 = r14
            r2 = 1065353216(0x3f800000, float:1.0)
            r10.S(r2)
            goto L_0x02c0
        L_0x02be:
            r50 = r14
        L_0x02c0:
            java.lang.String r2 = "ACTION"
            boolean r3 = r6.k(r2)
            if (r3 == 0) goto L_0x0304
            if (r12 == 0) goto L_0x02d2
            boolean r3 = r12.k(r2)
            if (r3 == 0) goto L_0x02d2
            r3 = 0
            goto L_0x02d4
        L_0x02d2:
            r3 = r61
        L_0x02d4:
            if (r12 != 0) goto L_0x02d8
            float r3 = r3 + r18
        L_0x02d8:
            e8.a0 r4 = new e8.a0
            e8.c2 r5 = r7.f10910r
            float r8 = r1 + r31
            float r14 = r6.h()
            float r42 = r8 + r14
            float r8 = r0 + r36
            float r43 = r8 - r3
            float r3 = r1 + r30
            float r8 = r6.h()
            float r44 = r3 + r8
            java.lang.Object r2 = r6.d(r2)
            r45 = r2
            e8.z r45 = (e8.z) r45
            r39 = r4
            r40 = r5
            r41 = r0
            r39.<init>(r40, r41, r42, r43, r44, r45)
            r9.d(r4)
        L_0x0304:
            java.lang.String r2 = "REMOTEGOTO"
            boolean r3 = r6.k(r2)
            if (r3 == 0) goto L_0x03b4
            if (r12 == 0) goto L_0x0316
            boolean r3 = r12.k(r2)
            if (r3 == 0) goto L_0x0316
            r3 = 0
            goto L_0x0318
        L_0x0316:
            r3 = r61
        L_0x0318:
            if (r12 != 0) goto L_0x031c
            float r3 = r3 + r18
        L_0x031c:
            java.lang.Object r2 = r6.d(r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            r5 = r2[r4]
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            r2 = r2[r5]
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L_0x0372
            java.lang.String r2 = (java.lang.String) r2
            float r5 = r1 + r31
            float r8 = r6.h()
            float r5 = r5 + r8
            float r8 = r0 + r36
            float r8 = r8 - r3
            float r3 = r1 + r30
            float r14 = r6.h()
            float r14 = r14 + r3
            r25 = r0
            r3 = r29
            r10 = r38
            r0 = r56
            r29 = r15
            r15 = r1
            r1 = r4
            r38 = r46
            r51 = r3
            r32 = r13
            r4 = r28
            r13 = r47
            r28 = 3
            r3 = r25
            r53 = r4
            r52 = r48
            r4 = r5
            r54 = r49
            r27 = 0
            r5 = r8
            r8 = r27
            r27 = r6
            r6 = r14
            r0.U(r1, r2, r3, r4, r5, r6)
            r14 = r25
            goto L_0x03cd
        L_0x0372:
            r25 = r0
            r27 = r6
            r32 = r13
            r53 = r28
            r51 = r29
            r10 = r38
            r38 = r46
            r13 = r47
            r52 = r48
            r54 = r49
            r8 = 0
            r28 = 3
            r29 = r15
            r15 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            float r1 = r15 + r31
            float r0 = r27.h()
            float r5 = r1 + r0
            r14 = r25
            float r0 = r14 + r36
            float r6 = r0 - r3
            float r1 = r15 + r30
            float r0 = r27.h()
            float r25 = r1 + r0
            r0 = r56
            r1 = r4
            r3 = r14
            r4 = r5
            r5 = r6
            r6 = r25
            r0.T(r1, r2, r3, r4, r5, r6)
            goto L_0x03cd
        L_0x03b4:
            r14 = r0
            r27 = r6
            r32 = r13
            r53 = r28
            r51 = r29
            r10 = r38
            r38 = r46
            r13 = r47
            r52 = r48
            r54 = r49
            r8 = 0
            r28 = 3
            r29 = r15
            r15 = r1
        L_0x03cd:
            java.lang.String r0 = "LOCALGOTO"
            r6 = r27
            boolean r1 = r6.k(r0)
            if (r1 == 0) goto L_0x03fc
            if (r12 == 0) goto L_0x03e1
            boolean r1 = r12.k(r0)
            if (r1 == 0) goto L_0x03e1
            r1 = r8
            goto L_0x03e3
        L_0x03e1:
            r1 = r61
        L_0x03e3:
            if (r12 != 0) goto L_0x03e7
            float r1 = r1 + r18
        L_0x03e7:
            java.lang.Object r0 = r6.d(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            float r0 = r14 + r36
            float r4 = r0 - r1
            float r5 = r15 + r11
            r0 = r56
            r1 = r2
            r2 = r14
            r3 = r15
            r0.Q(r1, r2, r3, r4, r5)
        L_0x03fc:
            java.lang.String r0 = "LOCALDESTINATION"
            boolean r1 = r6.k(r0)
            if (r1 == 0) goto L_0x041b
            if (r12 == 0) goto L_0x040a
            boolean r1 = r12.k(r0)
        L_0x040a:
            java.lang.Object r0 = r6.d(r0)
            java.lang.String r0 = (java.lang.String) r0
            e8.k0 r1 = new e8.k0
            float r2 = r15 + r11
            r3 = 0
            r1.<init>(r3, r14, r2, r8)
            r7.P(r0, r1)
        L_0x041b:
            java.lang.String r0 = "GENERICTAG"
            boolean r1 = r6.k(r0)
            if (r1 == 0) goto L_0x0442
            if (r12 == 0) goto L_0x042d
            boolean r0 = r12.k(r0)
            if (r0 == 0) goto L_0x042d
            r0 = r8
            goto L_0x042f
        L_0x042d:
            r0 = r61
        L_0x042f:
            if (r12 != 0) goto L_0x0433
            float r0 = r0 + r18
        L_0x0433:
            a8.v r1 = new a8.v
            float r2 = r14 + r36
            float r2 = r2 - r0
            float r0 = r15 + r11
            r1.<init>(r14, r15, r2, r0)
            e8.c2 r0 = r7.f10910r
            r0.H()
        L_0x0442:
            java.lang.String r0 = "PDFANNOTATION"
            boolean r1 = r6.k(r0)
            if (r1 == 0) goto L_0x0478
            if (r12 == 0) goto L_0x0454
            boolean r1 = r12.k(r0)
            if (r1 == 0) goto L_0x0454
            r1 = r8
            goto L_0x0456
        L_0x0454:
            r1 = r61
        L_0x0456:
            if (r12 != 0) goto L_0x045a
            float r1 = r1 + r18
        L_0x045a:
            java.lang.Object r0 = r6.d(r0)
            e8.a0 r0 = (e8.a0) r0
            e8.a0 r0 = e8.t0.I(r0)
            e8.c1 r2 = e8.c1.f10223b8
            e8.t1 r3 = new e8.t1
            float r4 = r15 + r31
            float r5 = r14 + r36
            float r5 = r5 - r1
            float r1 = r15 + r30
            r3.<init>(r14, r4, r5, r1)
            r0.r(r2, r3)
            r9.d(r0)
        L_0x0478:
            java.lang.Object r0 = r6.d(r13)
            float[] r0 = (float[]) r0
            java.lang.Object r1 = r6.d(r10)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r0 != 0) goto L_0x048f
            if (r1 == 0) goto L_0x0489
            goto L_0x048f
        L_0x0489:
            r12 = r6
            r0 = r32
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04b3
        L_0x048f:
            if (r0 == 0) goto L_0x049a
            r2 = 0
            r3 = r0[r2]
            r2 = 1
            r0 = r0[r2]
            r2 = r3
            r3 = r0
            goto L_0x049c
        L_0x049a:
            r2 = r8
            r3 = r2
        L_0x049c:
            if (r1 == 0) goto L_0x04a4
            float r0 = r1.floatValue()
            r11 = r0
            goto L_0x04a6
        L_0x04a4:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x04a6:
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r58
            r1 = r11
            r5 = r14
            r12 = r6
            r6 = r15
            r0.W(r1, r2, r3, r4, r5, r6)
            r0 = r32
        L_0x04b3:
            boolean r1 = r12.k(r0)
            if (r1 == 0) goto L_0x04c6
            java.lang.Object r1 = r12.d(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.L(r1)
        L_0x04c6:
            boolean r1 = r12.n()
            if (r1 != 0) goto L_0x04d1
            r25 = r24
            r24 = r14
            goto L_0x04ed
        L_0x04d1:
            r12.f()
            throw r35
        L_0x04d5:
            r10 = r0
            r38 = r2
            r52 = r4
            r54 = r5
            r12 = r6
            r0 = r13
            r50 = r14
            r53 = r28
            r51 = r29
            r8 = 0
            r28 = 3
            r13 = r3
            r29 = r15
            r15 = r1
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x04ed:
            float r24 = r24 + r36
            int r1 = r29 + 1
            r29 = r1
            r2 = r11
            r1 = r24
            goto L_0x0511
        L_0x04f7:
            r10 = r0
            r38 = r2
            r52 = r4
            r54 = r5
            r12 = r6
            r0 = r13
            r50 = r14
            r53 = r28
            r51 = r29
            r8 = 0
            r28 = 3
            r13 = r3
            r29 = r15
            r15 = r1
            r1 = r24
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0511:
            e8.s0 r3 = r12.c()
            r4 = r51
            int r3 = r3.compareTo(r4)
            if (r3 == 0) goto L_0x052d
            e8.s0 r3 = r12.c()
            e8.c r4 = r3.b()
            float r5 = r3.e()
            r9.O(r4, r5)
            goto L_0x052e
        L_0x052d:
            r3 = r4
        L_0x052e:
            java.lang.String r4 = "TEXTRENDERMODE"
            java.lang.Object r4 = r12.d(r4)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.String r5 = "SUBSUPSCRIPT"
            java.lang.Object r5 = r12.d(r5)
            java.lang.Float r5 = (java.lang.Float) r5
            r6 = 0
            if (r4 == 0) goto L_0x0557
            r11 = r4[r6]
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r6 = r11.intValue()
            r6 = r6 & 3
            if (r6 == 0) goto L_0x0550
            r9.X(r6)
        L_0x0550:
            r11 = 1
            if (r6 == r11) goto L_0x055a
            r14 = 2
            if (r6 != r14) goto L_0x0557
            goto L_0x055a
        L_0x0557:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x057b
        L_0x055a:
            r14 = r4[r11]
            java.lang.Float r14 = (java.lang.Float) r14
            float r11 = r14.floatValue()
            r14 = 1065353216(0x3f800000, float:1.0)
            int r24 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r24 == 0) goto L_0x056b
            r9.S(r11)
        L_0x056b:
            r14 = 2
            r4 = r4[r14]
            a8.b r4 = (a8.b) r4
            if (r4 != 0) goto L_0x0574
            r4 = r34
        L_0x0574:
            if (r4 == 0) goto L_0x0579
            r9.N(r4)
        L_0x0579:
            r35 = r4
        L_0x057b:
            if (r5 == 0) goto L_0x0582
            float r4 = r5.floatValue()
            goto L_0x0583
        L_0x0582:
            r4 = r8
        L_0x0583:
            r5 = r34
            if (r34 == 0) goto L_0x058a
            r9.M(r5)
        L_0x058a:
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x0591
            r9.Y(r4)
        L_0x0591:
            boolean r4 = r12.n()
            if (r4 == 0) goto L_0x05a7
            r32 = r0
            r24 = r1
            r28 = r3
            r31 = r15
            r3 = r52
            r7 = r54
            r23 = 1
            goto L_0x069e
        L_0x05a7:
            boolean r4 = r12.m()
            r24 = 1148846080(0x447a0000, float:1000.0)
            if (r4 == 0) goto L_0x05ca
            e8.b2 r4 = new e8.b2
            r4.<init>()
            r28 = r3
            r8 = r53
            float r3 = -r8
            float r3 = r3 * r24
            e8.s0 r7 = r12.f10619c
            float r7 = r7.e()
            float r3 = r3 / r7
            float r3 = r3 / r2
            r4.a(r3)
            r9.a0(r4)
            goto L_0x05eb
        L_0x05ca:
            r28 = r3
            r8 = r53
            boolean r3 = r12.s()
            if (r3 == 0) goto L_0x05f9
            e8.b2 r3 = new e8.b2
            r3.<init>()
            float r4 = r25 - r1
            float r4 = r4 * r24
            e8.s0 r7 = r12.f10619c
            float r7 = r7.e()
            float r4 = r4 / r7
            float r4 = r4 / r2
            r3.a(r4)
            r9.a0(r3)
        L_0x05eb:
            r32 = r0
            r24 = r1
            r53 = r8
            r31 = r15
            r3 = r52
            r7 = r54
            goto L_0x069e
        L_0x05f9:
            if (r50 == 0) goto L_0x0674
            if (r33 <= 0) goto L_0x0674
            boolean r3 = r12.q()
            if (r3 == 0) goto L_0x0674
            int r3 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r3 == 0) goto L_0x061e
            r3 = r52
            float r4 = r3 / r2
            r9.Z(r4)
            r7 = r54
            float r4 = r7 / r2
            float r22 = r58.n()
            float r4 = r4 + r22
            r9.L(r4)
            r22 = r2
            goto L_0x0622
        L_0x061e:
            r3 = r52
            r7 = r54
        L_0x0622:
            java.lang.String r4 = r12.toString()
            r53 = r8
            r8 = 32
            r32 = r0
            int r0 = r4.indexOf(r8)
            if (r0 >= 0) goto L_0x063a
            r9.b0(r4)
            r24 = r1
            r31 = r15
            goto L_0x069e
        L_0x063a:
            float r8 = -r3
            float r8 = r8 * r24
            r24 = r1
            e8.s0 r1 = r12.f10619c
            float r1 = r1.e()
            float r8 = r8 / r1
            float r8 = r8 / r2
            e8.b2 r1 = new e8.b2
            r31 = r15
            r2 = 0
            java.lang.String r15 = r4.substring(r2, r0)
            r1.<init>(r15)
        L_0x0653:
            int r2 = r0 + 1
            r15 = 32
            int r2 = r4.indexOf(r15, r2)
            r1.a(r8)
            if (r2 < 0) goto L_0x0669
            java.lang.String r0 = r4.substring(r0, r2)
            r1.b(r0)
            r0 = r2
            goto L_0x0653
        L_0x0669:
            java.lang.String r0 = r4.substring(r0)
            r1.b(r0)
            r9.a0(r1)
            goto L_0x069e
        L_0x0674:
            r32 = r0
            r24 = r1
            r53 = r8
            r31 = r15
            r3 = r52
            r7 = r54
            if (r50 == 0) goto L_0x0697
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x0697
            float r4 = r3 / r2
            r9.Z(r4)
            float r0 = r7 / r2
            float r1 = r58.n()
            float r0 = r0 + r1
            r9.L(r0)
            r22 = r2
        L_0x0697:
            java.lang.String r0 = r12.toString()
            r9.b0(r0)
        L_0x069e:
            if (r14 == 0) goto L_0x06a4
            r0 = 0
            r9.Y(r0)
        L_0x06a4:
            if (r5 == 0) goto L_0x06a9
            r58.E()
        L_0x06a9:
            if (r6 == 0) goto L_0x06af
            r0 = 0
            r9.X(r0)
        L_0x06af:
            if (r35 == 0) goto L_0x06b4
            r58.F()
        L_0x06b4:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x06bd
            r9.S(r0)
        L_0x06bd:
            boolean r1 = r12.k(r13)
            if (r1 != 0) goto L_0x06c9
            boolean r1 = r12.k(r10)
            if (r1 == 0) goto L_0x06ce
        L_0x06c9:
            r2 = r24
            r1 = r31
            goto L_0x06d5
        L_0x06ce:
            r2 = r24
            r1 = r31
            r4 = r32
            goto L_0x06dc
        L_0x06d5:
            r9.V(r2, r1)
            r4 = r32
            r23 = 1
        L_0x06dc:
            boolean r4 = r12.k(r4)
            if (r4 == 0) goto L_0x06e5
            r9.L(r7)
        L_0x06e5:
            r8 = r57
            r10 = r59
            r11 = r61
            r24 = r2
            r4 = r3
            r5 = r7
            r0 = r28
            r15 = r29
            r13 = r33
            r2 = r38
            r14 = r50
            r3 = r53
            r6 = 0
            r12 = 1
            r7 = r56
            goto L_0x0101
        L_0x0701:
            r4 = r0
            r61 = r11
            r50 = r14
            r0 = 0
            if (r50 == 0) goto L_0x0717
            r9.Z(r0)
            r9.L(r0)
            boolean r1 = r57.n()
            if (r1 == 0) goto L_0x0717
            r6 = r0
            goto L_0x0719
        L_0x0717:
            r6 = r61
        L_0x0719:
            if (r23 == 0) goto L_0x0724
            float r1 = r58.t()
            float r1 = r19 - r1
            r9.w(r1, r0)
        L_0x0724:
            r0 = 0
            r60[r0] = r4
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r6)
            r1 = 1
            r60[r1] = r0
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.m0.X(e8.z0, e8.g0, e8.g0, java.lang.Object[], float):float");
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        if (this.M.w().size() != 0) {
            S(this.M);
            c2 c2Var = this.f10910r;
            j1 j1Var = this.M;
            c2Var.o(j1Var, j1Var.x());
        }
    }

    public void a() {
        if (!this.f268b) {
            super.a();
            this.f10910r.a();
            j1 j1Var = new j1(this.f10910r);
            this.M = j1Var;
            this.N = j1Var;
        }
        try {
            N();
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public boolean b(h hVar) {
        int i10;
        c2 c2Var = this.f10910r;
        if (c2Var != null && c2Var.g()) {
            return false;
        }
        try {
            int F2 = hVar.F();
            if (F2 == 23) {
                n1 n1Var = (n1) hVar;
                if (n1Var.Z() > n1Var.m()) {
                    B();
                    D();
                    w(n1Var);
                    this.f10903a0 = false;
                    R();
                }
            } else if (F2 == 40) {
                B();
                D();
                android.support.v4.media.session.b.a(hVar);
                this.f10910r.y();
                M();
                throw null;
            } else if (F2 == 50) {
                android.support.v4.media.session.b.a(hVar);
                throw null;
            } else if (F2 != 55) {
                if (F2 == 29) {
                    if (this.H == null) {
                        A();
                    }
                    a8.a aVar = (a8.a) hVar;
                    v vVar = new v(0.0f, 0.0f);
                    if (this.H != null) {
                        vVar = new v(aVar.e(L() - this.H.x()), aVar.l((M() - this.f10915w) - 20.0f), aVar.j((L() - this.H.x()) + 20.0f), aVar.g(M() - this.f10915w));
                    }
                    this.V.c(g8.a.d(this.f10910r, aVar, vVar));
                } else if (F2 != 30) {
                    switch (F2) {
                        case 0:
                            this.L.C(((r) hVar).b(), ((r) hVar).a());
                            break;
                        case 1:
                            this.L.B(((r) hVar).a());
                            break;
                        case 2:
                            this.L.A(((r) hVar).a());
                            break;
                        case 3:
                            this.L.y(((r) hVar).a());
                            break;
                        case 4:
                            this.L.v(((r) hVar).a());
                            break;
                        case 5:
                            this.L.z();
                            break;
                        case 6:
                            this.L.w();
                            break;
                        case 7:
                            this.L.x(((r) hVar).a());
                            break;
                        default:
                            switch (F2) {
                                case 10:
                                    if (this.H == null) {
                                        A();
                                    }
                                    e0 e0Var = new e0((a8.c) hVar, this.f10918z);
                                    while (true) {
                                        e0 a10 = this.H.a(e0Var);
                                        if (a10 == null) {
                                            this.f10903a0 = false;
                                            if (e0Var.k("NEWPAGE")) {
                                                d();
                                                break;
                                            }
                                        } else {
                                            A();
                                            a10.y();
                                            e0Var = a10;
                                        }
                                    }
                                    break;
                                case 11:
                                    this.f10917y++;
                                    this.f10913u = ((u) hVar).n0();
                                    hVar.r(this);
                                    i10 = this.f10917y;
                                    break;
                                case 12:
                                    this.f10917y++;
                                    t tVar = (t) hVar;
                                    x(tVar.y0(), this.f10913u, tVar.l0());
                                    this.f10914v = tVar.q0();
                                    this.f10913u = tVar.z0();
                                    A();
                                    if (this.f10915w + this.H.l() + this.f10913u > M() - J()) {
                                        d();
                                    }
                                    this.K.f10923a += tVar.t0();
                                    this.K.f10927e += tVar.u0();
                                    A();
                                    this.f10910r.H();
                                    if (tVar.v0()) {
                                        A();
                                        n1 n1Var2 = new n1(1);
                                        n1Var2.V(100.0f);
                                        k1 k1Var = new k1();
                                        k1Var.M(tVar);
                                        k1Var.E(0);
                                        k1Var.q0(0.0f);
                                        n1Var2.a(k1Var);
                                        this.K.f10923a -= tVar.t0();
                                        this.K.f10927e -= tVar.u0();
                                        b(n1Var2);
                                        this.K.f10923a += tVar.t0();
                                        this.K.f10927e += tVar.u0();
                                    } else {
                                        this.H.u(tVar.s0());
                                        hVar.r(this);
                                        A();
                                        x(tVar.x0(), tVar.z0(), tVar.l0());
                                    }
                                    this.f10914v = 0;
                                    this.K.f10923a -= tVar.t0();
                                    this.K.f10927e -= tVar.u0();
                                    A();
                                    i10 = this.f10917y;
                                    break;
                                case 13:
                                case 16:
                                    android.support.v4.media.session.b.a(hVar);
                                    this.f10910r.H();
                                    throw null;
                                case 14:
                                    p pVar = (p) hVar;
                                    if (pVar.e()) {
                                        pVar.f();
                                    }
                                    this.K.f10925c += pVar.b();
                                    this.K.f10927e += pVar.c();
                                    hVar.r(this);
                                    this.K.f10925c -= pVar.b();
                                    this.K.f10927e -= pVar.c();
                                    A();
                                    break;
                                case 15:
                                    this.f10917y++;
                                    q qVar = (q) hVar;
                                    x(qVar.y0(), this.f10913u, qVar.l0());
                                    this.f10914v = qVar.q0();
                                    this.K.f10925c += qVar.t0();
                                    this.K.f10927e += qVar.u0();
                                    this.f10913u = qVar.z0();
                                    A();
                                    this.H.v(qVar);
                                    hVar.r(this);
                                    x(qVar.x0(), qVar.z0(), qVar.l0());
                                    if (this.H.k()) {
                                        this.H.t();
                                    }
                                    A();
                                    this.K.f10925c -= qVar.t0();
                                    this.K.f10927e -= qVar.u0();
                                    i10 = this.f10917y;
                                    break;
                                case 17:
                                    this.f10917y++;
                                    android.support.v4.media.session.b.a(hVar);
                                    throw null;
                                default:
                                    switch (F2) {
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                            android.support.v4.media.session.b.a(hVar);
                                            u((n) null);
                                            break;
                                        default:
                                            return false;
                                    }
                            }
                            this.f10917y = i10 - 1;
                            break;
                    }
                } else {
                    this.f10912t.A((v) hVar);
                }
                this.f10903a0 = false;
            } else {
                android.support.v4.media.session.b.a(hVar);
                K();
                J();
                L();
                M();
                M();
                throw null;
            }
            this.J = hVar.F();
            return true;
        } catch (Exception e10) {
            throw new g(e10);
        }
    }

    public boolean c(v vVar) {
        c2 c2Var = this.f10910r;
        if (c2Var != null && c2Var.g()) {
            return false;
        }
        this.X = new v(vVar);
        return true;
    }

    public void close() {
        if (!this.f269c) {
            try {
                d();
                if (!this.V.f()) {
                    this.f10910r.H();
                    super.close();
                    this.f10910r.k(this.P);
                    z();
                    Y();
                    this.f10910r.close();
                    return;
                }
                throw new RuntimeException(b8.a.b("not.all.annotations.could.be.added.to.the.document.the.document.doesn.t.have.enough.pages", new Object[0]));
            } catch (Exception e10) {
                throw j.a(e10);
            }
        }
    }

    public boolean d() {
        this.J = -1;
        if (O()) {
            V();
            return false;
        } else if (!this.f268b || this.f269c) {
            throw new RuntimeException(b8.a.b("the.document.is.not.open", new Object[0]));
        } else {
            this.f10910r.H();
            super.d();
            b bVar = this.K;
            bVar.f10926d = 0.0f;
            bVar.f10929g = 0.0f;
            try {
                D();
                int u10 = this.f270d.u();
                if (this.f10910r.R()) {
                    if (this.Y.containsKey("art")) {
                        if (this.Y.containsKey("trim")) {
                            throw new d2(b8.a.b("only.one.of.artbox.or.trimbox.can.exist.in.the.page", new Object[0]));
                        }
                    }
                    if (!this.Y.containsKey("art") && !this.Y.containsKey("trim")) {
                        if (this.Y.containsKey("crop")) {
                            HashMap hashMap = this.Y;
                            hashMap.put("trim", hashMap.get("crop"));
                        } else {
                            HashMap hashMap2 = this.Y;
                            v vVar = this.f270d;
                            hashMap2.put("trim", new t1(vVar, vVar.u()));
                        }
                    }
                }
                this.f10907e0.a(this.f10910r.x());
                if (this.f10910r.S()) {
                    l0 l0Var = new l0();
                    l0Var.r(c1.B1, c1.Y1);
                    this.f10907e0.a(l0Var);
                }
                p1 p1Var = new p1(new t1(this.f270d, u10), this.Y, this.f10907e0.c(), u10);
                p1Var.r(c1.E9, this.f10910r.O());
                if (this.B != null) {
                    x1 x1Var = new x1(this.B);
                    c1 c1Var = c1.f10454ta;
                    c1 c1Var2 = c1.M5;
                    x1Var.r(c1Var, c1Var2);
                    x1Var.r(c1.f10492w9, c1.f10507xb);
                    this.f10910r.A();
                    p1Var.r(c1Var2, this.f10910r.n(x1Var).a());
                }
                int i10 = this.f10904b0;
                if (i10 > 0) {
                    p1Var.r(c1.f10394p2, new f1(i10));
                    this.f10904b0 = 0;
                }
                l0 l0Var2 = this.f10905c0;
                if (l0Var2 != null) {
                    p1Var.r(c1.f10326k, this.f10910r.n(l0Var2).a());
                    this.f10905c0 = null;
                }
                x0 x0Var = this.f10906d0;
                if (x0Var != null) {
                    p1Var.r(c1.L9, x0Var);
                    this.f10906d0 = null;
                }
                if (this.f10910r.P() > 0.0f) {
                    p1Var.r(c1.Ma, new f1(this.f10910r.P()));
                }
                if (this.V.f()) {
                    b0 i11 = this.V.i(this.f10910r, this.f270d);
                    if (i11.t() != 0) {
                        p1Var.r(c1.I, i11);
                    }
                }
                if (this.f10910r.T()) {
                    p1Var.r(c1.f10414q9, new f1(this.f10910r.w() - 1));
                }
                if (this.f10911s.d0() > this.A) {
                    this.f10911s.j();
                } else {
                    this.f10911s = null;
                }
                this.f10910r.h(p1Var, new h0(this.f10910r.z(), this.f10912t, this.f10911s, this.f10910r.y(), this.f270d));
                N();
                return true;
            } catch (g e10) {
                throw new j(e10);
            } catch (IOException e11) {
                throw new j(e11);
            }
        }
    }

    public boolean e(float f10, float f11, float f12, float f13) {
        c2 c2Var = this.f10910r;
        if (c2Var != null && c2Var.g()) {
            return false;
        }
        this.C = f10;
        this.D = f11;
        this.E = f12;
        this.F = f13;
        return true;
    }

    /* access modifiers changed from: protected */
    public void u(n nVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void v(a0 a0Var) {
        this.f10903a0 = false;
        this.V.a(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void w(n1 n1Var) {
        l lVar = new l(this.f10910r.y());
        if (n1Var.o() && !C(n1Var, 0.0f) && this.f10915w > 0.0f) {
            d();
        }
        if (this.f10915w > 0.0f) {
            t tVar = new t();
            tVar.F0(0.0f);
            lVar.a(tVar);
        }
        lVar.a(n1Var);
        boolean E2 = n1Var.E();
        n1Var.P(true);
        int i10 = 0;
        while (true) {
            lVar.E(K(), J(), L(), M() - this.f10915w);
            if ((lVar.o() & 1) != 0) {
                this.f10911s.w(0.0f, (lVar.n() - M()) + this.f10915w);
                this.f10915w = M() - lVar.n();
                n1Var.P(E2);
                return;
            }
            i10 = M() - this.f10915w == lVar.n() ? i10 + 1 : 0;
            if (i10 != 3) {
                d();
            } else {
                throw new g(b8.a.b("infinite.table.loop", new Object[0]));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x(float f10, float f11, k kVar) {
        if (f10 != 0.0f && !this.f10903a0 && this.f10915w + this.H.l() + this.f10913u <= M() - J()) {
            this.f10913u = f10;
            A();
            if (kVar.n() || kVar.m()) {
                k kVar2 = new k(kVar);
                kVar2.o(kVar2.k() & -13);
                kVar = kVar2;
            }
            new a8.c(" ", kVar).r(this);
            A();
            this.f10913u = f11;
        }
    }

    public void y(c2 c2Var) {
        if (this.f10910r == null) {
            this.f10910r = c2Var;
            this.V = new g8.a(c2Var);
            return;
        }
        throw new g(b8.a.b("you.can.only.add.a.writer.to.a.pdfdocument.once", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.M.w().size() != 0) {
            W(this.M);
        }
    }
}
