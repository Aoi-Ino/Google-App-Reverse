package s;

import java.util.ArrayList;
import p.d;
import s.e;

public class g extends l {
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public int f15754a1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: b1  reason: collision with root package name */
    public int f15755b1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: c1  reason: collision with root package name */
    public int f15756c1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: d1  reason: collision with root package name */
    public int f15757d1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e1  reason: collision with root package name */
    public int f15758e1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: f1  reason: collision with root package name */
    public int f15759f1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public float f15760g1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public float f15761h1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: i1  reason: collision with root package name */
    public float f15762i1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: j1  reason: collision with root package name */
    public float f15763j1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public float f15764k1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public float f15765l1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: m1  reason: collision with root package name */
    public int f15766m1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: n1  reason: collision with root package name */
    public int f15767n1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public int f15768o1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public int f15769p1 = 2;

    /* renamed from: q1  reason: collision with root package name */
    private int f15770q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    private int f15771r1 = -1;

    /* renamed from: s1  reason: collision with root package name */
    private int f15772s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    private ArrayList f15773t1 = new ArrayList();

    /* renamed from: u1  reason: collision with root package name */
    private e[] f15774u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private e[] f15775v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    private int[] f15776w1 = null;
    /* access modifiers changed from: private */

    /* renamed from: x1  reason: collision with root package name */
    public e[] f15777x1;
    /* access modifiers changed from: private */

    /* renamed from: y1  reason: collision with root package name */
    public int f15778y1 = 0;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private int f15779a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public e f15780b = null;

        /* renamed from: c  reason: collision with root package name */
        int f15781c = 0;

        /* renamed from: d  reason: collision with root package name */
        private d f15782d;

        /* renamed from: e  reason: collision with root package name */
        private d f15783e;

        /* renamed from: f  reason: collision with root package name */
        private d f15784f;

        /* renamed from: g  reason: collision with root package name */
        private d f15785g;

        /* renamed from: h  reason: collision with root package name */
        private int f15786h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f15787i = 0;

        /* renamed from: j  reason: collision with root package name */
        private int f15788j = 0;

        /* renamed from: k  reason: collision with root package name */
        private int f15789k = 0;

        /* renamed from: l  reason: collision with root package name */
        private int f15790l = 0;

        /* renamed from: m  reason: collision with root package name */
        private int f15791m = 0;

        /* renamed from: n  reason: collision with root package name */
        private int f15792n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f15793o = 0;

        /* renamed from: p  reason: collision with root package name */
        private int f15794p = 0;

        /* renamed from: q  reason: collision with root package name */
        private int f15795q = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f15779a = i10;
            this.f15782d = dVar;
            this.f15783e = dVar2;
            this.f15784f = dVar3;
            this.f15785g = dVar4;
            this.f15786h = g.this.z1();
            this.f15787i = g.this.B1();
            this.f15788j = g.this.A1();
            this.f15789k = g.this.y1();
            this.f15795q = i11;
        }

        private void h() {
            this.f15790l = 0;
            this.f15791m = 0;
            this.f15780b = null;
            this.f15781c = 0;
            int i10 = this.f15793o;
            int i11 = 0;
            while (i11 < i10 && this.f15792n + i11 < g.this.f15778y1) {
                e eVar = g.this.f15777x1[this.f15792n + i11];
                if (this.f15779a == 0) {
                    int W = eVar.W();
                    int P1 = g.this.f15766m1;
                    if (eVar.V() == 8) {
                        P1 = 0;
                    }
                    this.f15790l += W + P1;
                    int c22 = g.this.k2(eVar, this.f15795q);
                    if (this.f15780b == null || this.f15781c < c22) {
                        this.f15780b = eVar;
                        this.f15781c = c22;
                        this.f15791m = c22;
                    }
                } else {
                    int b22 = g.this.l2(eVar, this.f15795q);
                    int c23 = g.this.k2(eVar, this.f15795q);
                    int Q1 = g.this.f15767n1;
                    if (eVar.V() == 8) {
                        Q1 = 0;
                    }
                    this.f15791m += c23 + Q1;
                    if (this.f15780b == null || this.f15781c < b22) {
                        this.f15780b = eVar;
                        this.f15781c = b22;
                        this.f15790l = b22;
                    }
                }
                i11++;
            }
        }

        public void b(e eVar) {
            int i10 = 0;
            if (this.f15779a == 0) {
                int b22 = g.this.l2(eVar, this.f15795q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f15794p++;
                    b22 = 0;
                }
                int P1 = g.this.f15766m1;
                if (eVar.V() != 8) {
                    i10 = P1;
                }
                this.f15790l += b22 + i10;
                int c22 = g.this.k2(eVar, this.f15795q);
                if (this.f15780b == null || this.f15781c < c22) {
                    this.f15780b = eVar;
                    this.f15781c = c22;
                    this.f15791m = c22;
                }
            } else {
                int b23 = g.this.l2(eVar, this.f15795q);
                int c23 = g.this.k2(eVar, this.f15795q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f15794p++;
                    c23 = 0;
                }
                int Q1 = g.this.f15767n1;
                if (eVar.V() != 8) {
                    i10 = Q1;
                }
                this.f15791m += c23 + i10;
                if (this.f15780b == null || this.f15781c < b23) {
                    this.f15780b = eVar;
                    this.f15781c = b23;
                    this.f15790l = b23;
                }
            }
            this.f15793o++;
        }

        public void c() {
            this.f15781c = 0;
            this.f15780b = null;
            this.f15790l = 0;
            this.f15791m = 0;
            this.f15792n = 0;
            this.f15793o = 0;
            this.f15794p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x0263  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f15793o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f15792n
                int r4 = r4 + r3
                s.g r5 = s.g.this
                int r5 = r5.f15778y1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                s.g r4 = s.g.this
                s.e[] r4 = r4.f15777x1
                int r5 = r0.f15792n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.u0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0354
                s.e r3 = r0.f15780b
                if (r3 != 0) goto L_0x002f
                goto L_0x0354
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f15792n
                int r10 = r10 + r9
                s.g r11 = s.g.this
                int r11 = r11.f15778y1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                s.g r10 = s.g.this
                s.e[] r10 = r10.f15777x1
                int r11 = r0.f15792n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.V()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                int r6 = r0.f15779a
                r9 = 0
                if (r6 != 0) goto L_0x01fe
                s.e r6 = r0.f15780b
                s.g r10 = s.g.this
                int r10 = r10.f15755b1
                r6.e1(r10)
                int r10 = r0.f15787i
                if (r18 <= 0) goto L_0x0084
                s.g r11 = s.g.this
                int r11 = r11.f15767n1
                int r10 = r10 + r11
            L_0x0084:
                s.d r11 = r6.P
                s.d r12 = r0.f15783e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0096
                s.d r10 = r6.R
                s.d r11 = r0.f15785g
                int r12 = r0.f15789k
                r10.a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                s.d r10 = r0.f15783e
                s.e r10 = r10.f15662d
                s.d r10 = r10.R
                s.d r11 = r6.P
                r10.a(r11, r2)
            L_0x00a3:
                s.g r10 = s.g.this
                int r10 = r10.f15769p1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r6.Z()
                if (r10 != 0) goto L_0x00dd
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f15792n
                int r13 = r13 + r12
                s.g r14 = s.g.this
                int r14 = r14.f15778y1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                s.g r13 = s.g.this
                s.e[] r13 = r13.f15777x1
                int r14 = r0.f15792n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.Z()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r6
            L_0x00de:
                r10 = r2
            L_0x00df:
                if (r10 >= r1) goto L_0x0354
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f15792n
                int r14 = r14 + r13
                s.g r15 = s.g.this
                int r15 = r15.f15778y1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0354
            L_0x00f5:
                s.g r14 = s.g.this
                s.e[] r14 = r14.f15777x1
                int r15 = r0.f15792n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r9
                r9 = r11
                goto L_0x01f8
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                s.d r15 = r14.O
                s.d r11 = r0.f15782d
                int r3 = r0.f15786h
                r14.k(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                s.g r3 = s.g.this
                int r3 = r3.f15754a1
                r11 = 1065353216(0x3f800000, float:1.0)
                s.g r13 = s.g.this
                float r13 = r13.f15760g1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f15792n
                if (r15 != 0) goto L_0x0149
                s.g r15 = s.g.this
                int r15 = r15.f15756c1
                if (r15 == r5) goto L_0x0149
                s.g r3 = s.g.this
                int r3 = r3.f15756c1
                if (r17 == 0) goto L_0x0142
                s.g r13 = s.g.this
                float r13 = r13.f15762i1
            L_0x013f:
                float r11 = r11 - r13
            L_0x0140:
                r13 = r11
                goto L_0x0169
            L_0x0142:
                s.g r11 = s.g.this
                float r11 = r11.f15762i1
                goto L_0x0140
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                s.g r15 = s.g.this
                int r15 = r15.f15758e1
                if (r15 == r5) goto L_0x0169
                s.g r3 = s.g.this
                int r3 = r3.f15758e1
                if (r17 == 0) goto L_0x0162
                s.g r13 = s.g.this
                float r13 = r13.f15764k1
                goto L_0x013f
            L_0x0162:
                s.g r11 = s.g.this
                float r11 = r11.f15764k1
                goto L_0x0140
            L_0x0169:
                r14.N0(r3)
                r14.M0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                s.d r3 = r14.Q
                s.d r11 = r0.f15784f
                int r13 = r0.f15788j
                r14.k(r3, r11, r13)
            L_0x017c:
                if (r9 == 0) goto L_0x01a7
                s.d r3 = r14.O
                s.d r11 = r9.Q
                s.g r13 = s.g.this
                int r13 = r13.f15766m1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0194
                s.d r3 = r14.O
                int r11 = r0.f15786h
                r3.u(r11)
            L_0x0194:
                s.d r3 = r9.Q
                s.d r11 = r14.O
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                s.d r3 = r9.Q
                int r9 = r0.f15788j
                r3.u(r9)
            L_0x01a7:
                if (r14 == r6) goto L_0x01f7
                s.g r3 = s.g.this
                int r3 = r3.f15769p1
                r9 = 3
                if (r3 != r9) goto L_0x01c8
                boolean r3 = r12.Z()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.Z()
                if (r3 == 0) goto L_0x01c8
                s.d r3 = r14.S
                s.d r11 = r12.S
            L_0x01c4:
                r3.a(r11, r2)
                goto L_0x01f8
            L_0x01c8:
                s.g r3 = s.g.this
                int r3 = r3.f15769p1
                if (r3 == 0) goto L_0x01f2
                r11 = 1
                if (r3 == r11) goto L_0x01ed
                s.d r3 = r14.P
                if (r4 == 0) goto L_0x01e8
                s.d r11 = r0.f15783e
                int r13 = r0.f15787i
                r3.a(r11, r13)
                s.d r3 = r14.R
                s.d r11 = r0.f15785g
                int r13 = r0.f15789k
                r3.a(r11, r13)
                goto L_0x01f8
            L_0x01e8:
                s.d r11 = r6.P
                r3.a(r11, r2)
            L_0x01ed:
                s.d r3 = r14.R
                s.d r11 = r6.R
                goto L_0x01c4
            L_0x01f2:
                s.d r3 = r14.P
                s.d r11 = r6.P
                goto L_0x01c4
            L_0x01f7:
                r9 = 3
            L_0x01f8:
                int r10 = r10 + 1
                r11 = r9
                r9 = r14
                goto L_0x00df
            L_0x01fe:
                s.e r3 = r0.f15780b
                s.g r6 = s.g.this
                int r6 = r6.f15754a1
                r3.N0(r6)
                int r6 = r0.f15786h
                if (r18 <= 0) goto L_0x0214
                s.g r10 = s.g.this
                int r10 = r10.f15766m1
                int r6 = r6 + r10
            L_0x0214:
                if (r17 == 0) goto L_0x0236
                s.d r10 = r3.Q
                s.d r11 = r0.f15784f
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0228
                s.d r6 = r3.O
                s.d r10 = r0.f15782d
                int r11 = r0.f15788j
                r6.a(r10, r11)
            L_0x0228:
                if (r18 <= 0) goto L_0x0253
                s.d r6 = r0.f15784f
                s.e r6 = r6.f15662d
                s.d r6 = r6.O
                s.d r10 = r3.Q
            L_0x0232:
                r6.a(r10, r2)
                goto L_0x0253
            L_0x0236:
                s.d r10 = r3.O
                s.d r11 = r0.f15782d
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0248
                s.d r6 = r3.Q
                s.d r10 = r0.f15784f
                int r11 = r0.f15788j
                r6.a(r10, r11)
            L_0x0248:
                if (r18 <= 0) goto L_0x0253
                s.d r6 = r0.f15782d
                s.e r6 = r6.f15662d
                s.d r6 = r6.Q
                s.d r10 = r3.O
                goto L_0x0232
            L_0x0253:
                r6 = r2
            L_0x0254:
                if (r6 >= r1) goto L_0x0354
                int r10 = r0.f15792n
                int r10 = r10 + r6
                s.g r11 = s.g.this
                int r11 = r11.f15778y1
                if (r10 < r11) goto L_0x0263
                goto L_0x0354
            L_0x0263:
                s.g r10 = s.g.this
                s.e[] r10 = r10.f15777x1
                int r11 = r0.f15792n
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0273
                r12 = 1
                goto L_0x0350
            L_0x0273:
                if (r6 != 0) goto L_0x02bf
                s.d r11 = r10.P
                s.d r12 = r0.f15783e
                int r13 = r0.f15787i
                r10.k(r11, r12, r13)
                s.g r11 = s.g.this
                int r11 = r11.f15755b1
                s.g r12 = s.g.this
                float r12 = r12.f15761h1
                int r13 = r0.f15792n
                if (r13 != 0) goto L_0x02a3
                s.g r13 = s.g.this
                int r13 = r13.f15757d1
                if (r13 == r5) goto L_0x02a3
                s.g r11 = s.g.this
                int r11 = r11.f15757d1
                s.g r12 = s.g.this
                float r12 = r12.f15763j1
                goto L_0x02b9
            L_0x02a3:
                if (r19 == 0) goto L_0x02b9
                s.g r13 = s.g.this
                int r13 = r13.f15759f1
                if (r13 == r5) goto L_0x02b9
                s.g r11 = s.g.this
                int r11 = r11.f15759f1
                s.g r12 = s.g.this
                float r12 = r12.f15765l1
            L_0x02b9:
                r10.e1(r11)
                r10.d1(r12)
            L_0x02bf:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x02cc
                s.d r11 = r10.R
                s.d r12 = r0.f15785g
                int r13 = r0.f15789k
                r10.k(r11, r12, r13)
            L_0x02cc:
                if (r9 == 0) goto L_0x02f7
                s.d r11 = r10.P
                s.d r12 = r9.R
                s.g r13 = s.g.this
                int r13 = r13.f15767n1
                r11.a(r12, r13)
                if (r6 != r7) goto L_0x02e4
                s.d r11 = r10.P
                int r12 = r0.f15787i
                r11.u(r12)
            L_0x02e4:
                s.d r11 = r9.R
                s.d r12 = r10.P
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x02f7
                s.d r9 = r9.R
                int r11 = r0.f15789k
                r9.u(r11)
            L_0x02f7:
                if (r10 == r3) goto L_0x031e
                r9 = 2
                s.g r11 = s.g.this
                int r11 = r11.f15768o1
                if (r17 == 0) goto L_0x0320
                if (r11 == 0) goto L_0x0311
                r12 = 1
                if (r11 == r12) goto L_0x0319
                if (r11 == r9) goto L_0x030a
                goto L_0x031e
            L_0x030a:
                s.d r9 = r10.O
                s.d r11 = r3.O
                r9.a(r11, r2)
            L_0x0311:
                s.d r9 = r10.Q
                s.d r11 = r3.Q
            L_0x0315:
                r9.a(r11, r2)
                goto L_0x031e
            L_0x0319:
                s.d r9 = r10.O
                s.d r11 = r3.O
                goto L_0x0315
            L_0x031e:
                r12 = 1
                goto L_0x034f
            L_0x0320:
                r12 = 1
                if (r11 == 0) goto L_0x034a
                if (r11 == r12) goto L_0x0342
                if (r11 == r9) goto L_0x0328
                goto L_0x034f
            L_0x0328:
                s.d r9 = r10.O
                if (r4 == 0) goto L_0x033d
                s.d r11 = r0.f15782d
                int r13 = r0.f15786h
                r9.a(r11, r13)
                s.d r9 = r10.Q
                s.d r11 = r0.f15784f
                int r13 = r0.f15788j
                r9.a(r11, r13)
                goto L_0x034f
            L_0x033d:
                s.d r11 = r3.O
                r9.a(r11, r2)
            L_0x0342:
                s.d r9 = r10.Q
                s.d r11 = r3.Q
            L_0x0346:
                r9.a(r11, r2)
                goto L_0x034f
            L_0x034a:
                s.d r9 = r10.O
                s.d r11 = r3.O
                goto L_0x0346
            L_0x034f:
                r9 = r10
            L_0x0350:
                int r6 = r6 + 1
                goto L_0x0254
            L_0x0354:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s.g.a.d(boolean, int, boolean):void");
        }

        public int e() {
            return this.f15779a == 1 ? this.f15791m - g.this.f15767n1 : this.f15791m;
        }

        public int f() {
            return this.f15779a == 0 ? this.f15790l - g.this.f15766m1 : this.f15790l;
        }

        public void g(int i10) {
            g gVar;
            e.b A;
            int W;
            e.b bVar;
            int i11;
            int i12 = this.f15794p;
            if (i12 != 0) {
                int i13 = this.f15793o;
                int i14 = i10 / i12;
                int i15 = 0;
                while (i15 < i13 && this.f15792n + i15 < g.this.f15778y1) {
                    e eVar = g.this.f15777x1[this.f15792n + i15];
                    if (this.f15779a == 0) {
                        if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f15723w == 0) {
                            gVar = g.this;
                            A = e.b.FIXED;
                            bVar = eVar.T();
                            i11 = eVar.x();
                            W = i14;
                        }
                        i15++;
                    } else {
                        if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f15725x == 0) {
                            gVar = g.this;
                            A = eVar.A();
                            W = eVar.W();
                            bVar = e.b.FIXED;
                            i11 = i14;
                        }
                        i15++;
                    }
                    gVar.D1(eVar, A, W, bVar, i11);
                    i15++;
                }
                h();
            }
        }

        public void i(int i10) {
            this.f15792n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f15779a = i10;
            this.f15782d = dVar;
            this.f15783e = dVar2;
            this.f15784f = dVar3;
            this.f15785g = dVar4;
            this.f15786h = i11;
            this.f15787i = i12;
            this.f15788j = i13;
            this.f15789k = i14;
            this.f15795q = i15;
        }
    }

    private void j2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.f15776w1 != null && this.f15775v1 != null && this.f15774u1 != null) {
            for (int i11 = 0; i11 < this.f15778y1; i11++) {
                this.f15777x1[i11].u0();
            }
            int[] iArr = this.f15776w1;
            int i12 = iArr[0];
            int i13 = iArr[1];
            float f11 = this.f15760g1;
            e eVar2 = null;
            int i14 = 0;
            while (i14 < i12) {
                if (z10) {
                    i10 = (i12 - i14) - 1;
                    f10 = 1.0f - this.f15760g1;
                } else {
                    f10 = f11;
                    i10 = i14;
                }
                e eVar3 = this.f15775v1[i10];
                if (!(eVar3 == null || eVar3.V() == 8)) {
                    if (i14 == 0) {
                        eVar3.k(eVar3.O, this.O, z1());
                        eVar3.N0(this.f15754a1);
                        eVar3.M0(f10);
                    }
                    if (i14 == i12 - 1) {
                        eVar3.k(eVar3.Q, this.Q, A1());
                    }
                    if (i14 > 0 && eVar2 != null) {
                        eVar3.k(eVar3.O, eVar2.Q, this.f15766m1);
                        eVar2.k(eVar2.Q, eVar3.O, 0);
                    }
                    eVar2 = eVar3;
                }
                i14++;
                f11 = f10;
            }
            for (int i15 = 0; i15 < i13; i15++) {
                e eVar4 = this.f15774u1[i15];
                if (!(eVar4 == null || eVar4.V() == 8)) {
                    if (i15 == 0) {
                        eVar4.k(eVar4.P, this.P, B1());
                        eVar4.e1(this.f15755b1);
                        eVar4.d1(this.f15761h1);
                    }
                    if (i15 == i13 - 1) {
                        eVar4.k(eVar4.R, this.R, y1());
                    }
                    if (i15 > 0 && eVar2 != null) {
                        eVar4.k(eVar4.P, eVar2.R, this.f15767n1);
                        eVar2.k(eVar2.R, eVar4.P, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * i12) + i16;
                    if (this.f15772s1 == 1) {
                        i18 = (i16 * i13) + i17;
                    }
                    e[] eVarArr = this.f15777x1;
                    if (!(i18 >= eVarArr.length || (eVar = eVarArr[i18]) == null || eVar.V() == 8)) {
                        e eVar5 = this.f15775v1[i16];
                        e eVar6 = this.f15774u1[i17];
                        if (eVar != eVar5) {
                            eVar.k(eVar.O, eVar5.O, 0);
                            eVar.k(eVar.Q, eVar5.Q, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.k(eVar.P, eVar6.P, 0);
                            eVar.k(eVar.R, eVar6.R, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int k2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f15725x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * ((float) i10));
                if (i12 != eVar.x()) {
                    eVar.Y0(true);
                    D1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.x();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.W()) * eVar.f15686d0) + 0.5f);
                }
            }
        }
        return eVar.x();
    }

    /* access modifiers changed from: private */
    public final int l2(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f15723w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * ((float) i10));
                if (i12 != eVar.W()) {
                    eVar.Y0(true);
                    D1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.W();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.x()) * eVar.f15686d0) + 0.5f);
                }
            }
        }
        return eVar.W();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005c  */
    private void m2(s.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            int r1 = r10.f15771r1
            if (r13 != 0) goto L_0x0026
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.f15766m1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.l2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0045
        L_0x0026:
            if (r1 > 0) goto L_0x0044
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002b:
            if (r2 >= r12) goto L_0x0044
            if (r2 <= 0) goto L_0x0032
            int r4 = r10.f15767n1
            int r3 = r3 + r4
        L_0x0032:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            int r4 = r10.k2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0044:
            r2 = r0
        L_0x0045:
            int[] r3 = r10.f15776w1
            if (r3 != 0) goto L_0x004e
            r3 = 2
            int[] r3 = new int[r3]
            r10.f15776w1 = r3
        L_0x004e:
            r3 = 1
            if (r1 != 0) goto L_0x0053
            if (r13 == r3) goto L_0x0057
        L_0x0053:
            if (r2 != 0) goto L_0x0059
            if (r13 != 0) goto L_0x0059
        L_0x0057:
            r4 = r3
            goto L_0x005a
        L_0x0059:
            r4 = r0
        L_0x005a:
            if (r4 != 0) goto L_0x011b
            if (r13 != 0) goto L_0x0068
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0071
        L_0x0068:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0071:
            s.e[] r5 = r10.f15775v1
            r6 = 0
            if (r5 == 0) goto L_0x007e
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0082
        L_0x007e:
            s.e[] r5 = new s.e[r2]
            r10.f15775v1 = r5
        L_0x0082:
            s.e[] r5 = r10.f15774u1
            if (r5 == 0) goto L_0x008e
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0092
        L_0x008e:
            s.e[] r5 = new s.e[r1]
            r10.f15774u1 = r5
        L_0x0092:
            r5 = r0
        L_0x0093:
            if (r5 >= r2) goto L_0x00d7
            r6 = r0
        L_0x0096:
            if (r6 >= r1) goto L_0x00d4
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a0
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a0:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a4
            goto L_0x00d1
        L_0x00a4:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00a9
            goto L_0x00d1
        L_0x00a9:
            int r8 = r10.l2(r7, r14)
            s.e[] r9 = r10.f15775v1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00b9
            int r9 = r9.W()
            if (r9 >= r8) goto L_0x00bd
        L_0x00b9:
            s.e[] r8 = r10.f15775v1
            r8[r5] = r7
        L_0x00bd:
            int r8 = r10.k2(r7, r14)
            s.e[] r9 = r10.f15774u1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cd
            int r9 = r9.x()
            if (r9 >= r8) goto L_0x00d1
        L_0x00cd:
            s.e[] r8 = r10.f15774u1
            r8[r6] = r7
        L_0x00d1:
            int r6 = r6 + 1
            goto L_0x0096
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x00d7:
            r5 = r0
            r6 = r5
        L_0x00d9:
            if (r5 >= r2) goto L_0x00ee
            s.e[] r7 = r10.f15775v1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00eb
            if (r5 <= 0) goto L_0x00e6
            int r8 = r10.f15766m1
            int r6 = r6 + r8
        L_0x00e6:
            int r7 = r10.l2(r7, r14)
            int r6 = r6 + r7
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00d9
        L_0x00ee:
            r5 = r0
            r7 = r5
        L_0x00f0:
            if (r5 >= r1) goto L_0x0105
            s.e[] r8 = r10.f15774u1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0102
            if (r5 <= 0) goto L_0x00fd
            int r9 = r10.f15767n1
            int r7 = r7 + r9
        L_0x00fd:
            int r8 = r10.k2(r8, r14)
            int r7 = r7 + r8
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x0105:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0113
            if (r6 <= r14) goto L_0x0057
            if (r2 <= r3) goto L_0x0057
            int r2 = r2 + -1
            goto L_0x005a
        L_0x0113:
            if (r7 <= r14) goto L_0x0057
            if (r1 <= r3) goto L_0x0057
            int r1 = r1 + -1
            goto L_0x005a
        L_0x011b:
            int[] r11 = r10.f15776w1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.m2(s.e[], int, int, int, int[]):void");
    }

    private void n2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        d dVar;
        int i13;
        int i14;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        if (i19 != 0) {
            this.f15773t1.clear();
            a aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
            this.f15773t1.add(aVar);
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            if (i11 == 0) {
                while (i23 < i19) {
                    e eVar = eVarArr[i23];
                    int l22 = l2(eVar, i20);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i21++;
                    }
                    int i24 = i21;
                    boolean z10 = (i22 == i20 || (this.f15766m1 + i22) + l22 > i20) && aVar.f15780b != null;
                    if ((!z10 && i23 > 0 && (i18 = this.f15771r1) > 0 && i23 % i18 == 0) || z10) {
                        aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
                        aVar.i(i23);
                        this.f15773t1.add(aVar);
                    } else if (i23 > 0) {
                        i22 += this.f15766m1 + l22;
                        aVar.b(eVar);
                        i23++;
                        i21 = i24;
                    }
                    i22 = l22;
                    aVar.b(eVar);
                    i23++;
                    i21 = i24;
                }
            } else {
                while (i23 < i19) {
                    e eVar2 = eVarArr[i23];
                    int k22 = k2(eVar2, i20);
                    if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                        i21++;
                    }
                    int i25 = i21;
                    boolean z11 = (i22 == i20 || (this.f15767n1 + i22) + k22 > i20) && aVar.f15780b != null;
                    if ((!z11 && i23 > 0 && (i17 = this.f15771r1) > 0 && i23 % i17 == 0) || z11) {
                        aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
                        aVar.i(i23);
                        this.f15773t1.add(aVar);
                    } else if (i23 > 0) {
                        i16 = i22 + this.f15767n1 + k22;
                        aVar.b(eVar2);
                        i23++;
                        i21 = i25;
                    }
                    i16 = k22;
                    aVar.b(eVar2);
                    i23++;
                    i21 = i25;
                }
            }
            int size = this.f15773t1.size();
            d dVar3 = this.O;
            d dVar4 = this.P;
            d dVar5 = this.Q;
            d dVar6 = this.R;
            int z12 = z1();
            int B1 = B1();
            int A1 = A1();
            int y12 = y1();
            e.b A = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z13 = A == bVar || T() == bVar;
            if (i21 > 0 && z13) {
                for (int i26 = 0; i26 < size; i26++) {
                    a aVar2 = (a) this.f15773t1.get(i26);
                    aVar2.g(i20 - (i11 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i27 = B1;
            int i28 = A1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = z12;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i33 = y12;
            while (i31 < size) {
                a aVar3 = (a) this.f15773t1.get(i31);
                if (i11 == 0) {
                    if (i31 < size - 1) {
                        dVar2 = ((a) this.f15773t1.get(i31 + 1)).f15780b.P;
                        i15 = 0;
                    } else {
                        dVar2 = this.R;
                        i15 = y1();
                    }
                    d dVar9 = aVar3.f15780b.R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i34 = i29;
                    d dVar12 = dVar7;
                    int i35 = i30;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i13 = i31;
                    aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i32, i27, i28, i15, i12);
                    int max = Math.max(i35, aVar3.f());
                    i29 = i34 + aVar3.e();
                    if (i13 > 0) {
                        i29 += this.f15767n1;
                    }
                    dVar8 = dVar11;
                    i30 = max;
                    i27 = 0;
                    dVar7 = dVar9;
                    dVar = dVar14;
                    int i36 = i15;
                    dVar6 = dVar2;
                    i33 = i36;
                } else {
                    d dVar15 = dVar8;
                    int i37 = i29;
                    int i38 = i30;
                    i13 = i31;
                    if (i13 < size - 1) {
                        dVar = ((a) this.f15773t1.get(i13 + 1)).f15780b.O;
                        i14 = 0;
                    } else {
                        dVar = this.Q;
                        i14 = A1();
                    }
                    d dVar16 = aVar3.f15780b.Q;
                    aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i32, i27, i14, i33, i12);
                    i30 = i38 + aVar3.f();
                    int max2 = Math.max(i37, aVar3.e());
                    if (i13 > 0) {
                        i30 += this.f15766m1;
                    }
                    i29 = max2;
                    i32 = 0;
                    i28 = i14;
                    dVar8 = dVar16;
                }
                i31 = i13 + 1;
                int i39 = i12;
                dVar5 = dVar;
            }
            iArr[0] = i30;
            iArr[1] = i29;
        }
    }

    private void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        d dVar;
        int i13;
        int i14;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        if (i19 != 0) {
            this.f15773t1.clear();
            a aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
            this.f15773t1.add(aVar);
            int i21 = 0;
            int i22 = 0;
            if (i11 == 0) {
                int i23 = 0;
                int i24 = 0;
                while (i24 < i19) {
                    int i25 = i21 + 1;
                    e eVar = eVarArr[i24];
                    int l22 = l2(eVar, i20);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i22++;
                    }
                    int i26 = i22;
                    boolean z10 = (i23 == i20 || (this.f15766m1 + i23) + l22 > i20) && aVar.f15780b != null;
                    if ((z10 || i24 <= 0 || (i18 = this.f15771r1) <= 0 || i25 <= i18) && !z10) {
                        i23 = i24 > 0 ? i23 + this.f15766m1 + l22 : l22;
                        i21 = 0;
                    } else {
                        aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
                        aVar.i(i24);
                        this.f15773t1.add(aVar);
                        i21 = i25;
                        i23 = l22;
                    }
                    aVar.b(eVar);
                    i24++;
                    i22 = i26;
                }
            } else {
                int i27 = 0;
                while (i27 < i19) {
                    e eVar2 = eVarArr[i27];
                    int k22 = k2(eVar2, i20);
                    if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                        i22++;
                    }
                    int i28 = i22;
                    boolean z11 = (i21 == i20 || (this.f15767n1 + i21) + k22 > i20) && aVar.f15780b != null;
                    if ((!z11 && i27 > 0 && (i17 = this.f15771r1) > 0 && i17 < 0) || z11) {
                        aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
                        aVar.i(i27);
                        this.f15773t1.add(aVar);
                    } else if (i27 > 0) {
                        i16 = i21 + this.f15767n1 + k22;
                        aVar.b(eVar2);
                        i27++;
                        i22 = i28;
                    }
                    i16 = k22;
                    aVar.b(eVar2);
                    i27++;
                    i22 = i28;
                }
            }
            int size = this.f15773t1.size();
            d dVar3 = this.O;
            d dVar4 = this.P;
            d dVar5 = this.Q;
            d dVar6 = this.R;
            int z12 = z1();
            int B1 = B1();
            int A1 = A1();
            int y12 = y1();
            e.b A = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z13 = A == bVar || T() == bVar;
            if (i22 > 0 && z13) {
                for (int i29 = 0; i29 < size; i29++) {
                    a aVar2 = (a) this.f15773t1.get(i29);
                    aVar2.g(i20 - (i11 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i30 = B1;
            int i31 = A1;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = z12;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i36 = y12;
            while (i34 < size) {
                a aVar3 = (a) this.f15773t1.get(i34);
                if (i11 == 0) {
                    if (i34 < size - 1) {
                        dVar2 = ((a) this.f15773t1.get(i34 + 1)).f15780b.P;
                        i15 = 0;
                    } else {
                        dVar2 = this.R;
                        i15 = y1();
                    }
                    d dVar9 = aVar3.f15780b.R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i37 = i32;
                    d dVar12 = dVar7;
                    int i38 = i33;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i13 = i34;
                    aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i35, i30, i31, i15, i12);
                    int max = Math.max(i38, aVar3.f());
                    i32 = i37 + aVar3.e();
                    if (i13 > 0) {
                        i32 += this.f15767n1;
                    }
                    dVar8 = dVar11;
                    i33 = max;
                    i30 = 0;
                    dVar7 = dVar9;
                    dVar = dVar14;
                    int i39 = i15;
                    dVar6 = dVar2;
                    i36 = i39;
                } else {
                    d dVar15 = dVar8;
                    int i40 = i32;
                    int i41 = i33;
                    i13 = i34;
                    if (i13 < size - 1) {
                        dVar = ((a) this.f15773t1.get(i13 + 1)).f15780b.O;
                        i14 = 0;
                    } else {
                        dVar = this.Q;
                        i14 = A1();
                    }
                    d dVar16 = aVar3.f15780b.Q;
                    aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i35, i30, i14, i36, i12);
                    i33 = i41 + aVar3.f();
                    int max2 = Math.max(i40, aVar3.e());
                    if (i13 > 0) {
                        i33 += this.f15766m1;
                    }
                    i32 = max2;
                    i35 = 0;
                    i31 = i14;
                    dVar8 = dVar16;
                }
                i34 = i13 + 1;
                int i42 = i12;
                dVar5 = dVar;
            }
            iArr[0] = i33;
            iArr[1] = i32;
        }
    }

    private void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        int i13 = i10;
        if (i13 != 0) {
            if (this.f15773t1.size() == 0) {
                aVar = new a(i11, this.O, this.P, this.Q, this.R, i12);
                this.f15773t1.add(aVar);
            } else {
                a aVar2 = (a) this.f15773t1.get(0);
                aVar2.c();
                aVar = aVar2;
                aVar.j(i11, this.O, this.P, this.Q, this.R, z1(), B1(), A1(), y1(), i12);
            }
            for (int i14 = 0; i14 < i13; i14++) {
                aVar.b(eVarArr[i14]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    public void A2(float f10) {
        this.f15765l1 = f10;
    }

    public void B2(int i10) {
        this.f15759f1 = i10;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.f15755b1 == -1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6.f15755b1 == -1) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.M0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.E1()
            if (r0 != 0) goto L_0x001c
            r6.H1(r11, r11)
            r6.G1(r11)
            return
        L_0x001c:
            int r12 = r18.z1()
            int r13 = r18.A1()
            int r14 = r18.B1()
            int r15 = r18.y1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f15772s1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f15754a1
            if (r2 != r1) goto L_0x0045
            r6.f15754a1 = r11
        L_0x0045:
            int r2 = r6.f15755b1
            if (r2 != r1) goto L_0x0057
        L_0x0049:
            r6.f15755b1 = r11
            goto L_0x0057
        L_0x004c:
            int r2 = r6.f15754a1
            if (r2 != r1) goto L_0x0052
            r6.f15754a1 = r11
        L_0x0052:
            int r2 = r6.f15755b1
            if (r2 != r1) goto L_0x0057
            goto L_0x0049
        L_0x0057:
            s.e[] r1 = r6.L0
            r2 = r11
            r3 = r2
        L_0x005b:
            int r11 = r6.M0
            r0 = 8
            if (r2 >= r11) goto L_0x0071
            s.e[] r11 = r6.L0
            r11 = r11[r2]
            int r11 = r11.V()
            if (r11 != r0) goto L_0x006d
            int r3 = r3 + 1
        L_0x006d:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005b
        L_0x0071:
            if (r3 <= 0) goto L_0x0090
            int r11 = r11 - r3
            s.e[] r1 = new s.e[r11]
            r2 = 0
            r3 = 0
        L_0x0078:
            int r11 = r6.M0
            if (r2 >= r11) goto L_0x008e
            s.e[] r11 = r6.L0
            r11 = r11[r2]
            int r4 = r11.V()
            if (r4 == r0) goto L_0x008a
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008a:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0078
        L_0x008e:
            r2 = r3
            goto L_0x0091
        L_0x0090:
            r2 = r11
        L_0x0091:
            r6.f15777x1 = r1
            r6.f15778y1 = r2
            int r0 = r6.f15770q1
            if (r0 == 0) goto L_0x00ce
            r4 = 1
            if (r0 == r4) goto L_0x00c1
            r3 = 2
            if (r0 == r3) goto L_0x00b4
            r3 = 3
            if (r0 == r3) goto L_0x00a7
            r11 = r4
            r17 = r5
        L_0x00a5:
            r0 = 0
            goto L_0x00db
        L_0x00a7:
            int r3 = r6.f15772s1
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.o2(r1, r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00b4:
            r11 = r4
            r17 = r5
            int r3 = r6.f15772s1
            r0 = r18
            r4 = r16
            r0.m2(r1, r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00c1:
            r11 = r4
            r17 = r5
            int r3 = r6.f15772s1
            r0 = r18
            r4 = r16
            r0.n2(r1, r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00ce:
            r17 = r5
            r11 = 1
            int r3 = r6.f15772s1
            r0 = r18
            r4 = r16
            r0.p2(r1, r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00db:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00eb
            r1 = r8
            goto L_0x00f6
        L_0x00eb:
            if (r7 != r3) goto L_0x00f2
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f6
        L_0x00f2:
            if (r7 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r1 = r0
        L_0x00f6:
            if (r9 != r4) goto L_0x00fa
            r2 = r10
            goto L_0x0105
        L_0x00fa:
            if (r9 != r3) goto L_0x0101
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0105
        L_0x0101:
            if (r9 != 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r2 = r0
        L_0x0105:
            r6.H1(r1, r2)
            r6.k1(r1)
            r6.L0(r2)
            int r1 = r6.M0
            if (r1 <= 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r11 = r0
        L_0x0114:
            r6.G1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.C1(int, int, int, int):void");
    }

    public void C2(int i10) {
        this.f15771r1 = i10;
    }

    public void D2(int i10) {
        this.f15772s1 = i10;
    }

    public void E2(int i10) {
        this.f15769p1 = i10;
    }

    public void F2(float f10) {
        this.f15761h1 = f10;
    }

    public void G2(int i10) {
        this.f15767n1 = i10;
    }

    public void H2(int i10) {
        this.f15755b1 = i10;
    }

    public void I2(int i10) {
        this.f15770q1 = i10;
    }

    public void g(d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).P1();
        int i10 = this.f15770q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f15773t1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f15773t1.get(i11)).d(z11, i11, i11 == size + -1);
                    i11++;
                }
            } else if (i10 == 2) {
                j2(z11);
            } else if (i10 == 3) {
                int size2 = this.f15773t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.f15773t1.get(i12)).d(z11, i12, i12 == size2 + -1);
                    i12++;
                }
            }
        } else if (this.f15773t1.size() > 0) {
            ((a) this.f15773t1.get(0)).d(z11, 0, true);
        }
        G1(false);
    }

    public void q2(float f10) {
        this.f15762i1 = f10;
    }

    public void r2(int i10) {
        this.f15756c1 = i10;
    }

    public void s2(float f10) {
        this.f15763j1 = f10;
    }

    public void t2(int i10) {
        this.f15757d1 = i10;
    }

    public void u2(int i10) {
        this.f15768o1 = i10;
    }

    public void v2(float f10) {
        this.f15760g1 = f10;
    }

    public void w2(int i10) {
        this.f15766m1 = i10;
    }

    public void x2(int i10) {
        this.f15754a1 = i10;
    }

    public void y2(float f10) {
        this.f15764k1 = f10;
    }

    public void z2(int i10) {
        this.f15758e1 = i10;
    }
}
