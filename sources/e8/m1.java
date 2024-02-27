package e8;

import a8.b;
import a8.g;
import a8.j;
import a8.u;
import a8.v;

public class m1 {

    /* renamed from: a  reason: collision with root package name */
    protected k1[] f10933a;

    /* renamed from: b  reason: collision with root package name */
    protected float[] f10934b;

    /* renamed from: c  reason: collision with root package name */
    protected float[] f10935c;

    /* renamed from: d  reason: collision with root package name */
    protected float f10936d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f10937e = false;

    /* renamed from: f  reason: collision with root package name */
    private int[] f10938f;

    public m1(m1 m1Var) {
        this.f10936d = m1Var.f10936d;
        this.f10937e = m1Var.f10937e;
        this.f10933a = new k1[m1Var.f10933a.length];
        int i10 = 0;
        while (true) {
            k1[] k1VarArr = this.f10933a;
            if (i10 < k1VarArr.length) {
                k1 k1Var = m1Var.f10933a[i10];
                if (k1Var != null) {
                    k1VarArr[i10] = new k1(k1Var);
                }
                i10++;
            } else {
                float[] fArr = new float[k1VarArr.length];
                this.f10934b = fArr;
                System.arraycopy(m1Var.f10934b, 0, fArr, 0, k1VarArr.length);
                d();
                return;
            }
        }
    }

    public static float g(l lVar, float f10, float f11, float f12, float f13) {
        if (f10 > f12) {
            f12 = f10;
        }
        if (f11 > f13) {
            f13 = f11;
        }
        lVar.E(f10, f11, f12, f13);
        return f13;
    }

    public float a() {
        this.f10936d = 0.0f;
        int i10 = 0;
        while (true) {
            k1[] k1VarArr = this.f10933a;
            if (i10 < k1VarArr.length) {
                k1 k1Var = k1VarArr[i10];
                if (k1Var != null) {
                    float a02 = k1Var.a0();
                    if (a02 > this.f10936d && k1Var.c0() == 1) {
                        this.f10936d = a02;
                    }
                }
                i10++;
            } else {
                this.f10937e = true;
                return this.f10936d;
            }
        }
    }

    public k1[] b() {
        return this.f10933a;
    }

    public float c() {
        return this.f10937e ? this.f10936d : a();
    }

    public void d() {
        this.f10935c = new float[this.f10933a.length];
        int i10 = 0;
        while (true) {
            float[] fArr = this.f10935c;
            if (i10 < fArr.length) {
                fArr[i10] = 0.0f;
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e(g0[] g0VarArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            f p10 = g0VarArr[i10].p();
            int Y = p10.Y();
            g0VarArr[i10].G();
            int[] iArr = this.f10938f;
            int i11 = i10 * 2;
            if (Y == iArr[i11 + 1]) {
                p10.X(iArr[i11]);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f(g0[] g0VarArr, float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f10938f == null) {
            this.f10938f = new int[8];
        }
        for (int i10 = 0; i10 < 4; i10++) {
            f p10 = g0VarArr[i10].p();
            int i11 = i10 * 2;
            this.f10938f[i11] = p10.Y();
            g0VarArr[i10].I();
            g0VarArr[i10].i(f10, f11, f12, f13, f14, f15);
            this.f10938f[i11 + 1] = p10.Y();
        }
    }

    public void h(int i10, float f10) {
        if (i10 >= 0 && i10 < this.f10933a.length) {
            this.f10935c[i10] = f10;
        }
    }

    public void i(float f10) {
        this.f10936d = f10;
    }

    public boolean j(float[] fArr) {
        int length = fArr.length;
        k1[] k1VarArr = this.f10933a;
        int i10 = 0;
        if (length != k1VarArr.length) {
            return false;
        }
        System.arraycopy(fArr, 0, this.f10934b, 0, k1VarArr.length);
        this.f10937e = false;
        float f10 = 0.0f;
        while (i10 < fArr.length) {
            k1 k1Var = this.f10933a[i10];
            if (k1Var == null) {
                f10 += fArr[i10];
            } else {
                k1Var.I(f10);
                int P = k1Var.P() + i10;
                while (i10 < P) {
                    f10 += fArr[i10];
                    i10++;
                }
                i10--;
                k1Var.J(f10);
                k1Var.L(0.0f);
            }
            i10++;
        }
        return true;
    }

    public m1 k(n1 n1Var, int i10, float f10) {
        float g10;
        boolean z10;
        n1 n1Var2 = n1Var;
        int i11 = i10;
        float f11 = f10;
        k1[] k1VarArr = this.f10933a;
        k1[] k1VarArr2 = new k1[k1VarArr.length];
        float[] fArr = new float[k1VarArr.length];
        float[] fArr2 = new float[k1VarArr.length];
        int i12 = 0;
        boolean z11 = true;
        while (true) {
            k1[] k1VarArr3 = this.f10933a;
            if (i12 >= k1VarArr3.length) {
                break;
            }
            k1 k1Var = k1VarArr3[i12];
            if (k1Var != null) {
                fArr[i12] = k1Var.W();
                fArr2[i12] = k1Var.b0();
                k1Var.Z();
                k1 k1Var2 = new k1(k1Var);
                l d10 = l.d(k1Var.Q());
                float p10 = k1Var.p() + k1Var.S();
                float w10 = (k1Var.w() + k1Var.R()) - f11;
                float s10 = k1Var.s() - k1Var.U();
                float w11 = k1Var.w() - k1Var.V();
                int u10 = k1Var.u();
                if (u10 == 90 || u10 == 270) {
                    g10 = g(d10, w10, p10, w11, s10);
                } else {
                    float f12 = w10 + 1.0E-5f;
                    if (k1Var.i0()) {
                        s10 = 20000.0f;
                    }
                    g10 = g(d10, p10, f12, s10, w11);
                }
                try {
                    int p11 = d10.p(true);
                    boolean z12 = d10.n() == g10;
                    if (z12) {
                        k1Var2.m0(l.d(k1Var.Q()));
                        d10.x(0.0f);
                        z10 = true;
                    } else {
                        z10 = true;
                        if ((p11 & 1) == 0) {
                            k1Var2.m0(d10);
                            d10.x(0.0f);
                        } else {
                            k1Var2.r0((u) null);
                        }
                    }
                    z11 = (!z11 || !z12) ? false : z10;
                    k1VarArr2[i12] = k1Var2;
                    k1Var.n0(f11);
                } catch (g e10) {
                    throw new j(e10);
                }
            } else if (n1Var2.L(i11, i12)) {
                float s11 = n1Var.s(i10) + f11;
                int i13 = i11;
                while (true) {
                    i13--;
                    if (!n1Var2.L(i13, i12)) {
                        break;
                    }
                    s11 += n1Var2.s(i13);
                }
                m1 q10 = n1Var2.q(i13);
                if (!(q10 == null || q10.b()[i12] == null)) {
                    k1 k1Var3 = new k1(q10.b()[i12]);
                    k1VarArr2[i12] = k1Var3;
                    k1Var3.N(s11);
                    k1VarArr2[i12].s0((q10.b()[i12].c0() - i11) + i13);
                    z11 = false;
                }
            }
            i12++;
            n1Var2 = n1Var;
            i11 = i10;
        }
        if (z11) {
            int i14 = 0;
            while (true) {
                k1[] k1VarArr4 = this.f10933a;
                if (i14 >= k1VarArr4.length) {
                    return null;
                }
                k1 k1Var4 = k1VarArr4[i14];
                if (k1Var4 != null) {
                    float f13 = fArr[i14];
                    if (f13 > 0.0f) {
                        k1Var4.n0(f13);
                    } else {
                        k1Var4.p0(fArr2[i14]);
                    }
                }
                i14++;
            }
        } else {
            a();
            m1 m1Var = new m1(k1VarArr2);
            m1Var.f10934b = (float[]) this.f10934b.clone();
            m1Var.a();
            return m1Var;
        }
    }

    public void l(float f10, float f11, float f12, k1 k1Var, g0[] g0VarArr) {
        b b10 = k1Var.b();
        if (b10 != null || k1Var.B()) {
            float s10 = k1Var.s() + f10;
            float w10 = k1Var.w() + f11;
            float p10 = k1Var.p() + f10;
            float f13 = w10 - f12;
            if (b10 != null) {
                g0 g0Var = g0VarArr[1];
                g0Var.M(b10);
                g0Var.z(p10, f13, s10 - p10, w10 - f13);
                g0Var.m();
            }
            if (k1Var.B()) {
                v vVar = new v(p10, f13, s10, w10);
                vVar.a(k1Var);
                vVar.D((b) null);
                g0VarArr[2].A(vVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0186, code lost:
        if (r13.u() == r15) goto L_0x0188;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(int r18, int r19, float r20, float r21, e8.g0[] r22) {
        /*
            r17 = this;
            r9 = r17
            r0 = r19
            r10 = r22
            boolean r1 = r9.f10937e
            if (r1 != 0) goto L_0x000d
            r17.a()
        L_0x000d:
            if (r0 >= 0) goto L_0x0013
            e8.k1[] r0 = r9.f10933a
            int r0 = r0.length
            goto L_0x001a
        L_0x0013:
            e8.k1[] r1 = r9.f10933a
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
        L_0x001a:
            r1 = 0
            if (r18 >= 0) goto L_0x001f
            r2 = r1
            goto L_0x0021
        L_0x001f:
            r2 = r18
        L_0x0021:
            if (r2 < r0) goto L_0x0024
            return
        L_0x0024:
            r3 = r2
            r2 = r20
        L_0x0027:
            if (r3 < 0) goto L_0x003c
            e8.k1[] r4 = r9.f10933a
            r4 = r4[r3]
            if (r4 == 0) goto L_0x0030
            goto L_0x003c
        L_0x0030:
            if (r3 <= 0) goto L_0x0039
            float[] r4 = r9.f10934b
            int r5 = r3 + -1
            r4 = r4[r5]
            float r2 = r2 - r4
        L_0x0039:
            int r3 = r3 + -1
            goto L_0x0027
        L_0x003c:
            if (r3 >= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            e8.k1[] r3 = r9.f10933a
            r3 = r3[r1]
            if (r3 == 0) goto L_0x004b
            float r3 = r3.p()
            float r2 = r2 - r3
        L_0x004b:
            r11 = r2
            r12 = r1
        L_0x004d:
            if (r12 >= r0) goto L_0x02db
            e8.k1[] r1 = r9.f10933a
            r13 = r1[r12]
            if (r13 != 0) goto L_0x0057
            goto L_0x02cf
        L_0x0057:
            float r1 = r9.f10936d
            float[] r2 = r9.f10935c
            r2 = r2[r12]
            float r7 = r1 + r2
            r1 = r17
            r2 = r11
            r3 = r21
            r4 = r7
            r5 = r13
            r6 = r22
            r1.l(r2, r3, r4, r5, r6)
            r13.Z()
            float r1 = r13.w()
            float r1 = r1 + r21
            float r2 = r13.V()
            float r1 = r1 - r2
            float r2 = r13.o()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 6
            r5 = 5
            if (r2 > 0) goto L_0x00ad
            int r2 = r13.f0()
            if (r2 == r5) goto L_0x00a0
            if (r2 == r4) goto L_0x008e
            goto L_0x00ad
        L_0x008e:
            float r1 = r13.w()
            float r1 = r1 + r21
            float r1 = r1 - r7
            float r2 = r13.o()
        L_0x0099:
            float r1 = r1 + r2
            float r2 = r13.V()
            float r1 = r1 - r2
            goto L_0x00ad
        L_0x00a0:
            float r1 = r13.w()
            float r1 = r1 + r21
            float r2 = r13.o()
            float r2 = r2 - r7
            float r2 = r2 / r3
            goto L_0x0099
        L_0x00ad:
            int r2 = r13.u()
            r6 = 981668463(0x3a83126f, float:0.001)
            r8 = 90
            r14 = 1
            r15 = 0
            if (r2 == r8) goto L_0x01a1
            int r2 = r13.u()
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x00c4
            goto L_0x01a1
        L_0x00c4:
            float r2 = r13.W()
            float r3 = r13.s()
            float r3 = r3 + r11
            float r4 = r13.U()
            float r3 = r3 - r4
            float r4 = r13.p()
            float r4 = r4 + r11
            float r5 = r13.S()
            float r4 = r4 + r5
            boolean r5 = r13.i0()
            r8 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x0108
            int r5 = r13.X()
            if (r5 == r14) goto L_0x0103
            r14 = 2
            r16 = 1184645120(0x469c4000, float:20000.0)
            if (r5 == r14) goto L_0x00fc
            int r5 = r13.u()
            if (r5 != r8) goto L_0x00f9
        L_0x00f6:
            float r4 = r4 - r16
            goto L_0x0108
        L_0x00f9:
            float r3 = r3 + r16
            goto L_0x0108
        L_0x00fc:
            int r5 = r13.u()
            if (r5 != r8) goto L_0x00f6
            goto L_0x00f9
        L_0x0103:
            r5 = 1176256512(0x461c4000, float:10000.0)
            float r3 = r3 + r5
            float r4 = r4 - r5
        L_0x0108:
            e8.l r5 = r13.Q()
            e8.l r14 = e8.l.d(r5)
            r14.v(r10)
            float r5 = r13.V()
            float r5 = r7 - r5
            float r16 = r13.R()
            float r5 = r5 - r16
            float r5 = r1 - r5
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0144
            float r2 = r13.o()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0144
            float r1 = r13.w()
            float r1 = r1 + r21
            float r2 = r13.V()
            float r1 = r1 - r2
            float r2 = r13.w()
            float r2 = r2 + r21
            float r2 = r2 - r7
            float r5 = r13.R()
            float r5 = r5 + r2
        L_0x0144:
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x014e
            boolean r2 = r14.O()
            if (r2 == 0) goto L_0x02cc
        L_0x014e:
            int r2 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x02cc
            float r5 = r5 - r6
            r14.E(r4, r5, r3, r1)
            int r1 = r13.u()
            if (r1 != r8) goto L_0x017e
            float r15 = r4 + r3
            float r1 = r21 + r21
            float r1 = r1 - r7
            float r2 = r13.R()
            float r1 = r1 + r2
            float r2 = r13.V()
            float r16 = r1 - r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r17
            r2 = r22
            r7 = r15
            r15 = r8
            r8 = r16
            r1.f(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x017e:
            r15 = r8
        L_0x017f:
            r14.o()     // Catch:{ g -> 0x018f }
            int r1 = r13.u()
            if (r1 != r15) goto L_0x02cc
        L_0x0188:
            r9.e(r10)
            goto L_0x02cc
        L_0x018d:
            r0 = move-exception
            goto L_0x0197
        L_0x018f:
            r0 = move-exception
            r1 = r0
            a8.j r0 = new a8.j     // Catch:{ all -> 0x018d }
            r0.<init>(r1)     // Catch:{ all -> 0x018d }
            throw r0     // Catch:{ all -> 0x018d }
        L_0x0197:
            int r1 = r13.u()
            if (r1 != r15) goto L_0x01a0
            r9.e(r10)
        L_0x01a0:
            throw r0
        L_0x01a1:
            float r1 = r13.V()
            float r1 = r7 - r1
            float r2 = r13.R()
            float r1 = r1 - r2
            float r2 = r13.z()
            float r3 = r13.S()
            float r2 = r2 - r3
            float r3 = r13.U()
            float r2 = r2 - r3
            e8.l r3 = r13.Q()
            e8.l r3 = e8.l.d(r3)
            r3.v(r10)
            float r6 = r6 + r1
            float r4 = -r2
            r3.E(r15, r15, r6, r4)
            r3.p(r14)     // Catch:{ g -> 0x02d3 }
            float r4 = r3.n()
            float r4 = -r4
            int r6 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x01da
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x01db
        L_0x01da:
            r4 = r15
        L_0x01db:
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x02cc
            boolean r2 = r13.k0()
            if (r2 == 0) goto L_0x01ea
            float r2 = r3.i()
            float r4 = r4 - r2
        L_0x01ea:
            e8.l r2 = r13.Q()
            e8.l r14 = e8.l.d(r2)
            r14.v(r10)
            r2 = 994352038(0x3b449ba6, float:0.003)
            float r1 = r1 + r2
            r2 = -1153131610(0xffffffffbb449ba6, float:-0.003)
            r3 = -1165815185(0xffffffffba83126f, float:-0.001)
            r14.E(r2, r3, r1, r4)
            int r1 = r13.u()
            if (r1 != r8) goto L_0x0262
            float r1 = r13.w()
            float r1 = r1 + r21
            float r1 = r1 - r7
            float r2 = r13.R()
            float r8 = r1 + r2
            int r1 = r13.f0()
            if (r1 == r5) goto L_0x023b
            r2 = 6
            if (r1 == r2) goto L_0x022b
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.S()
            float r1 = r1 + r2
            float r1 = r1 + r4
        L_0x0229:
            r7 = r1
            goto L_0x0254
        L_0x022b:
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.z()
            float r1 = r1 + r2
            float r2 = r13.U()
            float r1 = r1 - r2
            goto L_0x0229
        L_0x023b:
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.z()
            float r3 = r13.S()
            float r2 = r2 + r3
            float r3 = r13.U()
            float r2 = r2 - r3
            float r2 = r2 + r4
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 + r2
            goto L_0x0229
        L_0x0254:
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 0
            r1 = r17
            r2 = r22
            r1.f(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x02b9
        L_0x0262:
            float r1 = r13.w()
            float r1 = r1 + r21
            float r2 = r13.V()
            float r8 = r1 - r2
            int r1 = r13.f0()
            if (r1 == r5) goto L_0x0294
            r2 = 6
            if (r1 == r2) goto L_0x0289
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.z()
            float r1 = r1 + r2
            float r2 = r13.U()
            float r1 = r1 - r2
            float r1 = r1 - r4
        L_0x0287:
            r7 = r1
            goto L_0x02ac
        L_0x0289:
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.S()
        L_0x0292:
            float r1 = r1 + r2
            goto L_0x0287
        L_0x0294:
            float r1 = r13.p()
            float r1 = r1 + r11
            float r2 = r13.z()
            float r3 = r13.S()
            float r2 = r2 + r3
            float r3 = r13.U()
            float r2 = r2 - r3
            float r2 = r2 - r4
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            goto L_0x0292
        L_0x02ac:
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r1 = r17
            r2 = r22
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L_0x02b9:
            r14.o()     // Catch:{ g -> 0x02c0 }
            goto L_0x0188
        L_0x02be:
            r0 = move-exception
            goto L_0x02c8
        L_0x02c0:
            r0 = move-exception
            r1 = r0
            a8.j r0 = new a8.j     // Catch:{ all -> 0x02be }
            r0.<init>(r1)     // Catch:{ all -> 0x02be }
            throw r0     // Catch:{ all -> 0x02be }
        L_0x02c8:
            r9.e(r10)
            throw r0
        L_0x02cc:
            r13.O()
        L_0x02cf:
            int r12 = r12 + 1
            goto L_0x004d
        L_0x02d3:
            r0 = move-exception
            r1 = r0
            a8.j r0 = new a8.j
            r0.<init>(r1)
            throw r0
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.m1.m(int, int, float, float, e8.g0[]):void");
    }

    public m1(k1[] k1VarArr) {
        this.f10933a = k1VarArr;
        this.f10934b = new float[k1VarArr.length];
        d();
    }
}
