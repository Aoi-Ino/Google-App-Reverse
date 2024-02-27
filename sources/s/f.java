package s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p.d;
import p.i;
import s.e;
import t.b;
import t.e;

public class f extends m {
    b M0 = new b(this);
    public e N0 = new e(this);
    private int O0;
    protected b.C0215b P0 = null;
    private boolean Q0 = false;
    protected d R0 = new d();
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* renamed from: a1  reason: collision with root package name */
    public boolean f15738a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f15739b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f15740c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public int f15741d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public int f15742e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private int f15743f1 = 257;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f15744g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f15745h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f15746i1 = false;

    /* renamed from: j1  reason: collision with root package name */
    int f15747j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    private WeakReference f15748k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    private WeakReference f15749l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    private WeakReference f15750m1 = null;

    /* renamed from: n1  reason: collision with root package name */
    private WeakReference f15751n1 = null;

    /* renamed from: o1  reason: collision with root package name */
    HashSet f15752o1 = new HashSet();

    /* renamed from: p1  reason: collision with root package name */
    public b.a f15753p1 = new b.a();

    private void A1(d dVar, i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void B1(d dVar, i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void C1(e eVar) {
        int i10 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i10 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, P1());
        this.X0++;
    }

    public static boolean S1(int i10, e eVar, b.C0215b bVar, b.a aVar, int i11) {
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f16149e = 0;
            aVar.f16150f = 0;
            return false;
        }
        aVar.f16145a = eVar.A();
        aVar.f16146b = eVar.T();
        aVar.f16147c = eVar.W();
        aVar.f16148d = eVar.x();
        aVar.f16153i = false;
        aVar.f16154j = i11;
        e.b bVar2 = aVar.f16145a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f16146b == bVar3;
        boolean z12 = z10 && eVar.f15686d0 > 0.0f;
        boolean z13 = z11 && eVar.f15686d0 > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f15723w == 0 && !z12) {
            aVar.f16145a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f15725x == 0) {
                aVar.f16145a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f15725x == 0 && !z13) {
            aVar.f16146b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f15723w == 0) {
                aVar.f16146b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f16145a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.f16146b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f15727y[0] == 4) {
                aVar.f16145a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar4 = aVar.f16146b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f16148d;
                } else {
                    aVar.f16145a = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i13 = aVar.f16150f;
                }
                aVar.f16145a = bVar5;
                aVar.f16147c = (int) (eVar.v() * ((float) i13));
            }
        }
        if (z13) {
            if (eVar.f15727y[1] == 4) {
                aVar.f16146b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar6 = aVar.f16145a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f16147c;
                } else {
                    aVar.f16146b = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i12 = aVar.f16149e;
                }
                aVar.f16146b = bVar7;
                aVar.f16148d = eVar.w() == -1 ? (int) (((float) i12) / eVar.v()) : (int) (eVar.v() * ((float) i12));
            }
        }
        bVar.b(eVar, aVar);
        eVar.k1(aVar.f16149e);
        eVar.L0(aVar.f16150f);
        eVar.K0(aVar.f16152h);
        eVar.A0(aVar.f16151g);
        aVar.f16154j = b.a.f16142k;
        return aVar.f16153i;
    }

    private void U1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void x1(e eVar) {
        int i10 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i10 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, P1());
        this.W0++;
    }

    /* access modifiers changed from: package-private */
    public void D1(d dVar) {
        WeakReference weakReference = this.f15750m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f15750m1.get()).e()) {
            this.f15750m1 = new WeakReference(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void E1(d dVar) {
        WeakReference weakReference = this.f15748k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f15748k1.get()).e()) {
            this.f15748k1 = new WeakReference(dVar);
        }
    }

    public boolean F1(boolean z10) {
        return this.N0.f(z10);
    }

    public boolean G1(boolean z10) {
        return this.N0.g(z10);
    }

    public boolean H1(boolean z10, int i10) {
        return this.N0.h(z10, i10);
    }

    public b.C0215b I1() {
        return this.P0;
    }

    public int J1() {
        return this.f15743f1;
    }

    public d K1() {
        return this.R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.N0.j();
    }

    public void N1() {
        this.N0.k();
    }

    public void O(StringBuilder sb2) {
        sb2.append(this.f15707o + ":{\n");
        sb2.append("  actualWidth:" + this.f15682b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f15684c0);
        sb2.append("\n");
        Iterator it = r1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean O1() {
        return this.f15746i1;
    }

    public boolean P1() {
        return this.Q0;
    }

    public boolean Q1() {
        return this.f15745h1;
    }

    public long R1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17;
        this.S0 = i19;
        int i20 = i18;
        this.T0 = i20;
        return this.M0.d(this, i10, i19, i20, i11, i12, i13, i14, i15, i16);
    }

    public boolean T1(int i10) {
        return (this.f15743f1 & i10) == i10;
    }

    public void V1(b.C0215b bVar) {
        this.P0 = bVar;
        this.N0.n(bVar);
    }

    public void W1(int i10) {
        this.f15743f1 = i10;
        d.f14515r = T1(512);
    }

    public void X1(int i10) {
        this.O0 = i10;
    }

    public void Y1(boolean z10) {
        this.Q0 = z10;
    }

    public boolean Z1(d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean T1 = T1(64);
        q1(dVar, T1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.q1(dVar, T1);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void a2() {
        this.M0.e(this);
    }

    public void p1(boolean z10, boolean z11) {
        super.p1(z10, z11);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.L0.get(i10)).p1(z10, z11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x030e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f15690f0 = r2
            r1.f15692g0 = r2
            r1.f15745h1 = r2
            r1.f15746i1 = r2
            java.util.ArrayList r0 = r1.L0
            int r3 = r0.size()
            int r0 = r18.W()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.x()
            int r4 = java.lang.Math.max(r2, r4)
            s.e$b[] r5 = r1.Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.O0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f15743f1
            boolean r8 = s.k.b(r8, r6)
            if (r8 == 0) goto L_0x0084
            t.b$b r8 = r18.I1()
            t.h.h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList r9 = r1.L0
            java.lang.Object r9 = r9.get(r8)
            s.e r9 = (s.e) r9
            boolean r10 = r9.m0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof s.h
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof s.a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof s.l
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.l0()
            if (r10 != 0) goto L_0x0081
            s.e$b r10 = r9.u(r2)
            s.e$b r11 = r9.u(r6)
            s.e$b r12 = s.e.b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0075
            int r10 = r9.f15723w
            if (r10 == r6) goto L_0x0075
            if (r11 != r12) goto L_0x0075
            int r10 = r9.f15725x
            if (r10 == r6) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            t.b$a r10 = new t.b$a
            r10.<init>()
            t.b$b r11 = r1.P0
            int r12 = t.b.a.f16142k
            S1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            s.e$b r9 = s.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f15743f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = s.k.b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            t.b$b r10 = r18.I1()
            boolean r10 = t.i.c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.W()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.k1(r0)
            r1.f15745h1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.W()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.x()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.L0(r4)
            r1.f15746i1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.x()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.T1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.T1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            p.d r12 = r1.R0
            r12.f14530h = r2
            r12.f14531i = r2
            int r13 = r1.f15743f1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f14531i = r6
        L_0x00f2:
            java.util.ArrayList r11 = r1.L0
            s.e$b r12 = r18.A()
            s.e$b r13 = s.e.b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            s.e$b r12 = r18.T()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = r2
            goto L_0x0106
        L_0x0105:
            r12 = r6
        L_0x0106:
            r18.U1()
            r13 = r2
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList r14 = r1.L0
            java.lang.Object r14 = r14.get(r13)
            s.e r14 = (s.e) r14
            boolean r15 = r14 instanceof s.m
            if (r15 == 0) goto L_0x011d
            s.m r14 = (s.m) r14
            r14.s1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.T1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x0315
            int r15 = r0 + 1
            p.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r0.D()     // Catch:{ Exception -> 0x014d }
            r18.U1()     // Catch:{ Exception -> 0x014d }
            p.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r1.m(r0)     // Catch:{ Exception -> 0x014d }
            r0 = r2
        L_0x0139:
            if (r0 >= r3) goto L_0x0150
            java.util.ArrayList r6 = r1.L0     // Catch:{ Exception -> 0x014d }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x014d }
            s.e r6 = (s.e) r6     // Catch:{ Exception -> 0x014d }
            p.d r2 = r1.R0     // Catch:{ Exception -> 0x014d }
            r6.m(r2)     // Catch:{ Exception -> 0x014d }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            r0 = move-exception
            goto L_0x01db
        L_0x0150:
            p.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            boolean r14 = r1.w1(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.ref.WeakReference r0 = r1.f15748k1     // Catch:{ Exception -> 0x014d }
            r2 = 0
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0176
            java.lang.ref.WeakReference r0 = r1.f15748k1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            s.d r0 = (s.d) r0     // Catch:{ Exception -> 0x014d }
            p.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            s.d r8 = r1.P     // Catch:{ Exception -> 0x014d }
            p.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f15748k1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0176:
            java.lang.ref.WeakReference r0 = r1.f15750m1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.ref.WeakReference r0 = r1.f15750m1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            s.d r0 = (s.d) r0     // Catch:{ Exception -> 0x014d }
            p.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            s.d r8 = r1.R     // Catch:{ Exception -> 0x014d }
            p.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f15750m1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0195:
            java.lang.ref.WeakReference r0 = r1.f15749l1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r1.f15749l1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            s.d r0 = (s.d) r0     // Catch:{ Exception -> 0x014d }
            p.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            s.d r8 = r1.O     // Catch:{ Exception -> 0x014d }
            p.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f15749l1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01b4:
            java.lang.ref.WeakReference r0 = r1.f15751n1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.ref.WeakReference r0 = r1.f15751n1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            s.d r0 = (s.d) r0     // Catch:{ Exception -> 0x014d }
            p.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            s.d r8 = r1.Q     // Catch:{ Exception -> 0x014d }
            p.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f15751n1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01d3:
            if (r14 == 0) goto L_0x01f4
            p.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r0.z()     // Catch:{ Exception -> 0x014d }
            goto L_0x01f4
        L_0x01db:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f4:
            p.d r0 = r1.R0
            if (r14 == 0) goto L_0x01ff
            boolean[] r2 = s.k.f15798a
            boolean r0 = r1.Z1(r0, r2)
            goto L_0x0216
        L_0x01ff:
            r1.q1(r0, r10)
            r0 = 0
        L_0x0203:
            if (r0 >= r3) goto L_0x0215
            java.util.ArrayList r2 = r1.L0
            java.lang.Object r2 = r2.get(r0)
            s.e r2 = (s.e) r2
            p.d r6 = r1.R0
            r2.q1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0203
        L_0x0215:
            r0 = 0
        L_0x0216:
            r2 = 8
            if (r12 == 0) goto L_0x0287
            if (r15 >= r2) goto L_0x0287
            boolean[] r6 = s.k.f15798a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0287
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0226:
            if (r6 >= r3) goto L_0x0250
            java.util.ArrayList r2 = r1.L0
            java.lang.Object r2 = r2.get(r6)
            s.e r2 = (s.e) r2
            r16 = r0
            int r0 = r2.f15690f0
            int r17 = r2.W()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f15692g0
            int r2 = r2.x()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0226
        L_0x0250:
            r16 = r0
            int r0 = r1.f15704m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f15706n0
            int r2 = java.lang.Math.max(r2, r8)
            s.e$b r6 = s.e.b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0273
            int r8 = r18.W()
            if (r8 >= r0) goto L_0x0273
            r1.k1(r0)
            s.e$b[] r0 = r1.Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0273:
            if (r7 != r6) goto L_0x0289
            int r0 = r18.x()
            if (r0 >= r2) goto L_0x0289
            r1.L0(r2)
            s.e$b[] r0 = r1.Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0289
        L_0x0287:
            r16 = r0
        L_0x0289:
            int r0 = r1.f15704m0
            int r2 = r18.W()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.W()
            if (r0 <= r2) goto L_0x02a6
            r1.k1(r0)
            s.e$b[] r0 = r1.Z
            s.e$b r2 = s.e.b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a6:
            int r0 = r1.f15706n0
            int r2 = r18.x()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.x()
            if (r0 <= r2) goto L_0x02c4
            r1.L0(r0)
            s.e$b[] r0 = r1.Z
            s.e$b r2 = s.e.b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c6
        L_0x02c4:
            r6 = 1
            r2 = r13
        L_0x02c6:
            if (r2 != 0) goto L_0x0305
            s.e$b[] r0 = r1.Z
            r8 = 0
            r0 = r0[r8]
            s.e$b r13 = s.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e7
            if (r4 <= 0) goto L_0x02e7
            int r0 = r18.W()
            if (r0 <= r4) goto L_0x02e7
            r1.f15745h1 = r6
            s.e$b[] r0 = r1.Z
            s.e$b r2 = s.e.b.FIXED
            r0[r8] = r2
            r1.k1(r4)
            r2 = r6
            r16 = r2
        L_0x02e7:
            s.e$b[] r0 = r1.Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0305
            if (r9 <= 0) goto L_0x0305
            int r0 = r18.x()
            if (r0 <= r9) goto L_0x0305
            r1.f15746i1 = r6
            s.e$b[] r0 = r1.Z
            s.e$b r2 = s.e.b.FIXED
            r0[r6] = r2
            r1.L0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030a
        L_0x0305:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030a:
            if (r15 <= r0) goto L_0x030e
            r14 = 0
            goto L_0x030f
        L_0x030e:
            r14 = r2
        L_0x030f:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0315:
            r1.L0 = r11
            if (r13 == 0) goto L_0x0321
            s.e$b[] r0 = r1.Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0321:
            p.d r0 = r1.R0
            p.c r0 = r0.v()
            r1.w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.s1():void");
    }

    public void t0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f15744g1 = false;
        super.t0();
    }

    /* access modifiers changed from: package-private */
    public void v1(e eVar, int i10) {
        if (i10 == 0) {
            x1(eVar);
        } else if (i10 == 1) {
            C1(eVar);
        }
    }

    public boolean w1(d dVar) {
        boolean T1 = T1(64);
        g(dVar, T1);
        int size = this.L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.L0.get(i10);
            eVar.S0(0, false);
            eVar.S0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.L0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).y1();
                }
            }
        }
        this.f15752o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f15752o1.add(eVar3);
                } else {
                    eVar3.g(dVar, T1);
                }
            }
        }
        while (this.f15752o1.size() > 0) {
            int size2 = this.f15752o1.size();
            Iterator it = this.f15752o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.v1(this.f15752o1)) {
                    lVar.g(dVar, T1);
                    this.f15752o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f15752o1.size()) {
                Iterator it2 = this.f15752o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, T1);
                }
                this.f15752o1.clear();
            }
        }
        if (d.f14515r) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = (e) this.L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, dVar, eVar5);
                eVar5.g(dVar, T1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = (e) this.L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.P0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.g1(e.b.FIXED);
                    }
                    eVar6.g(dVar, T1);
                    if (bVar == bVar3) {
                        eVar6.P0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.g1(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, T1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, (ArrayList) null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, (ArrayList) null, 1);
        }
        return true;
    }

    public void y1(d dVar) {
        WeakReference weakReference = this.f15751n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f15751n1.get()).e()) {
            this.f15751n1 = new WeakReference(dVar);
        }
    }

    public void z1(d dVar) {
        WeakReference weakReference = this.f15749l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.f15749l1.get()).e()) {
            this.f15749l1 = new WeakReference(dVar);
        }
    }
}
