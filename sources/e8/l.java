package e8;

import a8.c;
import a8.h;
import a8.u;
import b8.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class l {
    private float A;
    private boolean B = false;
    private int C = 0;
    protected float D;
    protected boolean E = false;
    protected l F;
    protected LinkedList G;
    protected int H = 0;
    private boolean I;
    protected u J;
    private boolean K = false;
    private float L;
    private boolean M = true;

    /* renamed from: a  reason: collision with root package name */
    protected int f10868a = 0;

    /* renamed from: b  reason: collision with root package name */
    protected float f10869b;

    /* renamed from: c  reason: collision with root package name */
    protected float f10870c;

    /* renamed from: d  reason: collision with root package name */
    protected float f10871d;

    /* renamed from: e  reason: collision with root package name */
    protected float f10872e;

    /* renamed from: f  reason: collision with root package name */
    protected int f10873f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected ArrayList f10874g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f10875h;

    /* renamed from: i  reason: collision with root package name */
    protected d f10876i;

    /* renamed from: j  reason: collision with root package name */
    protected float f10877j;

    /* renamed from: k  reason: collision with root package name */
    protected float f10878k;

    /* renamed from: l  reason: collision with root package name */
    protected float f10879l = 16.0f;

    /* renamed from: m  reason: collision with root package name */
    protected float f10880m = 16.0f;

    /* renamed from: n  reason: collision with root package name */
    protected float f10881n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    protected g0 f10882o;

    /* renamed from: p  reason: collision with root package name */
    protected g0[] f10883p;

    /* renamed from: q  reason: collision with root package name */
    protected int f10884q;

    /* renamed from: r  reason: collision with root package name */
    protected float f10885r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    protected float f10886s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    protected float f10887t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    protected float f10888u = 0.0f;

    /* renamed from: v  reason: collision with root package name */
    protected float f10889v = -1.0f;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f10890w = false;

    /* renamed from: x  reason: collision with root package name */
    private float f10891x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10892y = true;

    /* renamed from: z  reason: collision with root package name */
    private int f10893z;

    public l(g0 g0Var) {
        this.f10882o = g0Var;
    }

    public static void L(g0 g0Var, int i10, u uVar, float f10, float f11, float f12) {
        M(g0Var, i10, uVar, f10, f11, f12, 1, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r1 == 2) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void M(e8.g0 r18, int r19, a8.u r20, float r21, float r22, float r23, int r24, int r25) {
        /*
            r0 = r19
            r1 = r23
            r7 = r24
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x0011
            r2 = 1
            if (r0 == r2) goto L_0x0011
            if (r0 == r9) goto L_0x0011
            r15 = r8
            goto L_0x0012
        L_0x0011:
            r15 = r0
        L_0x0012:
            r18.I()
            e8.l r14 = new e8.l
            r13 = r18
            r14.<init>(r13)
            r0 = 1184645120(0x469c4000, float:20000.0)
            r2 = 0
            if (r15 == 0) goto L_0x002c
            r3 = -962838528(0xffffffffc69c4000, float:-20000.0)
            if (r15 == r9) goto L_0x002a
            r10 = r0
        L_0x0028:
            r11 = r3
            goto L_0x002e
        L_0x002a:
            r10 = r2
            goto L_0x0028
        L_0x002c:
            r10 = r0
            r11 = r2
        L_0x002e:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0043
            float r11 = r11 + r21
            float r0 = r22 + r12
            float r10 = r10 + r21
            float r1 = r22 + r16
            r16 = r1
            r1 = r10
        L_0x0041:
            r12 = r11
            goto L_0x0068
        L_0x0043:
            double r0 = (double) r1
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 / r2
            double r2 = java.lang.Math.cos(r0)
            float r4 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            float r2 = (float) r0
            float r3 = -r2
            r0 = r18
            r1 = r4
            r5 = r21
            r6 = r22
            r0.i(r1, r2, r3, r4, r5, r6)
            r1 = r10
            r0 = r12
            goto L_0x0041
        L_0x0068:
            r2 = 1073741824(0x40000000, float:2.0)
            r10 = r14
            r11 = r20
            r13 = r0
            r0 = r14
            r14 = r1
            r1 = r15
            r15 = r16
            r16 = r2
            r17 = r1
            r10.G(r11, r12, r13, r14, r15, r16, r17)
            r2 = 3
            if (r7 != r2) goto L_0x0084
            if (r1 != 0) goto L_0x0081
            r8 = r9
            goto L_0x0085
        L_0x0081:
            if (r1 != r9) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r8 = r1
        L_0x0085:
            r0.t(r8)
            r1 = r25
            r0.u(r1)
            r0.D(r7)
            r0.o()     // Catch:{ g -> 0x0097 }
            r18.G()
            return
        L_0x0097:
            r0 = move-exception
            r1 = r0
            a8.j r0 = new a8.j
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.l.M(e8.g0, int, a8.u, float, float, float, int, int):void");
    }

    private void c() {
        if (this.f10876i == null && this.J != null) {
            this.f10876i = new d();
            Iterator it = this.J.e0().iterator();
            while (it.hasNext()) {
                this.f10876i.a(new e0((c) it.next(), (z) null));
            }
            this.J = null;
        }
    }

    public static l d(l lVar) {
        l lVar2 = new l((g0) null);
        lVar2.s(lVar);
        return lVar2;
    }

    public void A(float f10) {
        this.f10880m = f10;
        this.f10881n = 0.0f;
    }

    public void B(float f10, float f11) {
        this.f10880m = f10;
        this.f10881n = f11;
    }

    public void C(float f10) {
        this.f10887t = f10;
        this.f10892y = true;
    }

    public void D(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new RuntimeException(a.a("invalid.run.direction.1", i10));
        }
        this.f10868a = i10;
    }

    public void E(float f10, float f11, float f12, float f13) {
        this.f10871d = Math.min(f10, f12);
        this.f10869b = Math.max(f11, f13);
        this.f10870c = Math.min(f11, f13);
        float max = Math.max(f10, f12);
        this.f10872e = max;
        this.f10877j = this.f10869b;
        float f14 = max - this.f10871d;
        this.f10889v = f14;
        if (f14 < 0.0f) {
            this.f10889v = 0.0f;
        }
        this.f10890w = true;
    }

    public void F(float f10, float f11, float f12, float f13, float f14, int i10) {
        A(f14);
        this.f10873f = i10;
        E(f10, f11, f12, f13);
    }

    public void G(u uVar, float f10, float f11, float f12, float f13, float f14, int i10) {
        b(uVar);
        F(f10, f11, f12, f13, f14, i10);
    }

    /* access modifiers changed from: protected */
    public void H(l lVar) {
        this.f10869b = lVar.f10869b;
        this.f10870c = lVar.f10870c;
        this.f10873f = lVar.f10873f;
        this.f10874g = null;
        if (lVar.f10874g != null) {
            this.f10874g = new ArrayList(lVar.f10874g);
        }
        this.f10875h = null;
        if (lVar.f10875h != null) {
            this.f10875h = new ArrayList(lVar.f10875h);
        }
        this.f10877j = lVar.f10877j;
        this.f10879l = lVar.f10879l;
        this.f10880m = lVar.f10880m;
        this.f10881n = lVar.f10881n;
        this.f10882o = lVar.f10882o;
        this.f10883p = lVar.f10883p;
        this.f10884q = lVar.f10884q;
        this.f10885r = lVar.f10885r;
        this.f10886s = lVar.f10886s;
        this.f10887t = lVar.f10887t;
        this.f10888u = lVar.f10888u;
        this.f10889v = lVar.f10889v;
        this.f10890w = lVar.f10890w;
        this.f10891x = lVar.f10891x;
        this.f10892y = lVar.f10892y;
        this.f10893z = lVar.f10893z;
        this.C = lVar.C;
        this.f10868a = lVar.f10868a;
        this.D = lVar.D;
        this.E = lVar.E;
        this.I = lVar.I;
        if (lVar.E) {
            LinkedList linkedList = new LinkedList(lVar.G);
            this.G = linkedList;
            if (this.I) {
                this.G.set(0, new n1((n1) linkedList.getFirst()));
            }
            l lVar2 = lVar.F;
            if (lVar2 != null) {
                this.F = d(lVar2);
            }
        }
        this.H = lVar.H;
        this.A = lVar.A;
        this.f10871d = lVar.f10871d;
        this.f10872e = lVar.f10872e;
        this.B = lVar.B;
        this.J = lVar.J;
        this.K = lVar.K;
        this.L = lVar.L;
        this.M = lVar.M;
    }

    public void I(float f10) {
        this.f10891x = f10;
    }

    public void J(u uVar) {
        this.f10876i = null;
        this.E = false;
        this.F = null;
        this.G = null;
        this.H = 0;
        this.I = false;
        this.J = uVar;
    }

    public void K(boolean z10) {
        this.K = z10;
    }

    public void N(float f10) {
        if (f10 > this.L) {
            this.L = f10;
        }
    }

    public boolean O() {
        return this.E && !this.G.isEmpty() && ((h) this.G.getFirst()).F() == 55;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(a8.h r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r3.F()
            r1 = 10
            if (r0 != r1) goto L_0x0014
            a8.t r0 = new a8.t
            a8.c r3 = (a8.c) r3
            r0.<init>((a8.c) r3)
        L_0x0012:
            r3 = r0
            goto L_0x0024
        L_0x0014:
            int r0 = r3.F()
            r1 = 11
            if (r0 != r1) goto L_0x0024
            a8.t r0 = new a8.t
            a8.u r3 = (a8.u) r3
            r0.<init>((a8.u) r3)
            goto L_0x0012
        L_0x0024:
            int r0 = r3.F()
            r1 = 12
            if (r0 == r1) goto L_0x0054
            int r0 = r3.F()
            r1 = 14
            if (r0 == r1) goto L_0x0054
            int r0 = r3.F()
            r1 = 23
            if (r0 == r1) goto L_0x0054
            int r0 = r3.F()
            r1 = 55
            if (r0 != r1) goto L_0x0045
            goto L_0x0054
        L_0x0045:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "element.not.allowed"
            java.lang.String r0 = b8.a.b(r1, r0)
            r3.<init>(r0)
            throw r3
        L_0x0054:
            boolean r0 = r2.E
            if (r0 != 0) goto L_0x0067
            r0 = 1
            r2.E = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.G = r0
            r0 = 0
            r2.f10876i = r0
            r2.J = r0
        L_0x0067:
            java.util.LinkedList r0 = r2.G
            r0.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.l.a(a8.h):void");
    }

    public void b(u uVar) {
        if (uVar != null && !this.E) {
            c();
            if (this.f10876i == null) {
                this.J = uVar;
                return;
            }
            Iterator it = uVar.e0().iterator();
            while (it.hasNext()) {
                this.f10876i.a(new e0((c) it.next(), (z) null));
            }
        }
    }

    /* access modifiers changed from: protected */
    public float[] e() {
        float f10 = f(this.f10874g);
        int i10 = this.f10884q;
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        float f11 = f(this.f10875h);
        if (this.f10884q == 2) {
            return null;
        }
        return new float[]{f10, f11};
    }

    /* access modifiers changed from: protected */
    public float f(ArrayList arrayList) {
        this.f10884q = 0;
        float f10 = this.f10877j;
        if (f10 < this.f10870c || f10 > this.f10869b) {
            this.f10884q = 1;
            return 0.0f;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            float[] fArr = (float[]) arrayList.get(i10);
            float f11 = this.f10877j;
            if (f11 >= fArr[0] && f11 <= fArr[1]) {
                return (fArr[2] * f11) + fArr[3];
            }
        }
        this.f10884q = 2;
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float[] g() {
        do {
            float[] e10 = e();
            int i10 = this.f10884q;
            if (i10 == 1) {
                return null;
            }
            this.f10877j -= this.f10879l;
            if (i10 != 2) {
                float[] e11 = e();
                int i11 = this.f10884q;
                if (i11 == 1) {
                    return null;
                }
                if (i11 == 2) {
                    this.f10877j -= this.f10879l;
                } else {
                    float f10 = e10[0];
                    if (f10 < e11[1]) {
                        float f11 = e11[0];
                        float f12 = e10[1];
                        if (f11 < f12) {
                            return new float[]{f10, f12, e11[0], e11[1]};
                        }
                    }
                }
            }
        } while (this.f10879l != 0.0f);
        return null;
    }

    public int h() {
        return this.f10873f;
    }

    public float i() {
        return this.D;
    }

    public float j() {
        return this.L;
    }

    public float k() {
        return this.f10885r;
    }

    public float l() {
        return this.f10878k;
    }

    public int m() {
        return this.f10868a;
    }

    public float n() {
        return this.f10877j;
    }

    public int o() {
        return p(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0143, code lost:
        r0.f10876i.n();
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x000b
            int r1 = r23.q(r24)
            return r1
        L_0x000b:
            r23.c()
            e8.d r1 = r0.f10876i
            r2 = 1
            if (r1 != 0) goto L_0x0014
            return r2
        L_0x0014:
            r1 = 0
            r0.D = r1
            r3 = 0
            r0.f10893z = r3
            r0.f10878k = r1
            float r4 = r0.f10891x
            r5 = 2
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12[r2] = r6
            r6 = 2143289344(0x7fc00000, float:NaN)
            r0.A = r6
            int r6 = r0.f10868a
            if (r6 == 0) goto L_0x0033
            r19 = r6
            goto L_0x0035
        L_0x0033:
            r19 = r2
        L_0x0035:
            e8.g0 r6 = r0.f10882o
            r7 = 0
            if (r6 == 0) goto L_0x004a
            e8.m0 r8 = r6.r()
            e8.g0 r9 = r0.f10882o
            e8.g0 r9 = r9.o()
            r20 = r6
            r21 = r8
            r11 = r9
            goto L_0x0051
        L_0x004a:
            if (r24 == 0) goto L_0x0209
            r11 = r7
            r20 = r11
            r21 = r20
        L_0x0051:
            if (r24 != 0) goto L_0x0068
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0060
            e8.c2 r4 = r11.s()
            float r4 = r4.M()
            goto L_0x0068
        L_0x0060:
            r6 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0068
            r4 = r6
        L_0x0068:
            boolean r6 = r0.f10890w
            if (r6 != 0) goto L_0x0094
            e8.d r6 = r0.f10876i
            java.util.ArrayList r6 = r6.f10590h
            java.util.Iterator r6 = r6.iterator()
            r8 = r1
        L_0x0075:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x008c
            java.lang.Object r9 = r6.next()
            e8.e0 r9 = (e8.e0) r9
            e8.s0 r9 = r9.f10619c
            float r9 = r9.e()
            float r8 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x008c:
            float r6 = r0.f10880m
            float r9 = r0.f10881n
            float r8 = r8 * r9
            float r6 = r6 + r8
            r0.f10879l = r6
        L_0x0094:
            r6 = r3
        L_0x0095:
            boolean r8 = r0.f10892y
            if (r8 == 0) goto L_0x009c
            float r8 = r0.f10885r
            goto L_0x009e
        L_0x009c:
            float r8 = r0.f10886s
        L_0x009e:
            boolean r9 = r0.f10890w
            r10 = 3
            if (r9 == 0) goto L_0x014a
            float r9 = r0.f10889v
            float r13 = r0.f10887t
            float r13 = r13 + r8
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x00ba
            e8.d r1 = r0.f10876i
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x00b7
            r2 = r10
            goto L_0x01a9
        L_0x00b7:
            r2 = r5
            goto L_0x01a9
        L_0x00ba:
            e8.d r9 = r0.f10876i
            boolean r9 = r9.i()
            if (r9 == 0) goto L_0x00c4
            goto L_0x01a9
        L_0x00c4:
            e8.d r13 = r0.f10876i
            float r14 = r0.f10871d
            float r9 = r0.f10889v
            float r9 = r9 - r8
            float r10 = r0.f10887t
            float r15 = r9 - r10
            int r9 = r0.f10873f
            int r10 = r0.C
            r16 = r9
            r17 = r19
            r18 = r10
            e8.z0 r9 = r13.l(r14, r15, r16, r17, r18)
            if (r9 != 0) goto L_0x00e1
            goto L_0x01a9
        L_0x00e1:
            float[] r10 = r9.h()
            boolean r13 = r23.r()
            if (r13 == 0) goto L_0x00fa
            float r13 = r0.A
            boolean r13 = java.lang.Float.isNaN(r13)
            if (r13 == 0) goto L_0x00fa
            float r10 = r9.c()
        L_0x00f7:
            r0.f10879l = r10
            goto L_0x0109
        L_0x00fa:
            float r13 = r0.f10880m
            r14 = r10[r3]
            float r15 = r0.f10881n
            float r14 = r14 * r15
            float r13 = r13 + r14
            r10 = r10[r2]
            float r10 = java.lang.Math.max(r13, r10)
            goto L_0x00f7
        L_0x0109:
            float r10 = r0.f10877j
            float r13 = r0.f10869b
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0143
            float r13 = r0.f10879l
            float r14 = r10 - r13
            float r15 = r0.f10870c
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x011c
            goto L_0x0143
        L_0x011c:
            float r10 = r10 - r13
            r0.f10877j = r10
            if (r24 != 0) goto L_0x0127
            if (r6 != 0) goto L_0x0127
            r11.e()
            r6 = r2
        L_0x0127:
            float r10 = r0.A
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L_0x0133
            float r10 = r0.f10877j
            r0.A = r10
        L_0x0133:
            float r10 = r0.f10889v
            float r13 = r9.x()
            float r10 = r10 - r13
            r0.N(r10)
            float r10 = r0.f10871d
            r13 = r6
            r14 = r9
            goto L_0x01b8
        L_0x0143:
            e8.d r1 = r0.f10876i
            r1.n()
            goto L_0x00b7
        L_0x014a:
            float r9 = r0.f10877j
            float r13 = r0.f10879l
            float r9 = r9 - r13
            float[] r13 = r23.g()
            if (r13 != 0) goto L_0x0163
            e8.d r1 = r0.f10876i
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x015f
            r2 = r10
            goto L_0x0160
        L_0x015f:
            r2 = r5
        L_0x0160:
            r0.f10877j = r9
            goto L_0x01a9
        L_0x0163:
            e8.d r14 = r0.f10876i
            boolean r14 = r14.i()
            if (r14 == 0) goto L_0x016c
            goto L_0x0160
        L_0x016c:
            r14 = r13[r3]
            r15 = r13[r5]
            float r22 = java.lang.Math.max(r14, r15)
            r14 = r13[r2]
            r10 = r13[r10]
            float r10 = java.lang.Math.min(r14, r10)
            float r10 = r10 - r22
            float r13 = r0.f10887t
            float r13 = r13 + r8
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x0187
            goto L_0x0095
        L_0x0187:
            if (r24 != 0) goto L_0x018f
            if (r6 != 0) goto L_0x018f
            r11.e()
            r6 = r2
        L_0x018f:
            e8.d r13 = r0.f10876i
            float r10 = r10 - r8
            float r14 = r0.f10887t
            float r15 = r10 - r14
            int r10 = r0.f10873f
            int r14 = r0.C
            r18 = r14
            r14 = r22
            r16 = r10
            r17 = r19
            e8.z0 r10 = r13.l(r14, r15, r16, r17, r18)
            if (r10 != 0) goto L_0x01b4
            goto L_0x0160
        L_0x01a9:
            if (r6 == 0) goto L_0x01b3
            r11.j()
            e8.g0 r1 = r0.f10882o
            r1.c(r11)
        L_0x01b3:
            return r2
        L_0x01b4:
            r13 = r6
            r14 = r10
            r10 = r22
        L_0x01b8:
            if (r24 != 0) goto L_0x01e4
            r12[r3] = r7
            boolean r6 = r14.o()
            if (r6 == 0) goto L_0x01c4
            float r8 = r0.f10887t
        L_0x01c4:
            float r10 = r10 + r8
            float r6 = r14.m()
            float r10 = r10 + r6
            float r6 = r0.f10877j
            r11.V(r10, r6)
            r6 = r21
            r7 = r14
            r8 = r11
            r9 = r20
            r10 = r12
            r15 = r11
            r11 = r4
            float r6 = r6.X(r7, r8, r9, r10, r11)
            r0.f10878k = r6
            r6 = r12[r3]
            e8.s0 r6 = (e8.s0) r6
            r7 = r6
            goto L_0x01e5
        L_0x01e4:
            r15 = r11
        L_0x01e5:
            boolean r6 = r14.n()
            r0.f10892y = r6
            float r6 = r0.f10877j
            boolean r8 = r14.n()
            if (r8 == 0) goto L_0x01f6
            float r8 = r0.f10888u
            goto L_0x01f7
        L_0x01f6:
            r8 = r1
        L_0x01f7:
            float r6 = r6 - r8
            r0.f10877j = r6
            int r6 = r0.f10893z
            int r6 = r6 + r2
            r0.f10893z = r6
            float r6 = r14.e()
            r0.D = r6
            r6 = r13
            r11 = r15
            goto L_0x0095
        L_0x0209:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "columntext.go.with.simulate.eq.eq.false.and.text.eq.eq.null"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = b8.a.b(r2, r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.l.p(boolean):int");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x056f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int q(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            boolean r1 = r0.f10890w
            r2 = 0
            if (r1 == 0) goto L_0x059c
            r0.f10893z = r2
            r1 = 0
            r0.D = r1
            boolean r3 = r0.M
        L_0x000e:
            java.util.LinkedList r4 = r0.G
            boolean r4 = r4.isEmpty()
            r5 = 1
            if (r4 == 0) goto L_0x0018
            return r5
        L_0x0018:
            java.util.LinkedList r4 = r0.G
            java.lang.Object r4 = r4.getFirst()
            a8.h r4 = (a8.h) r4
            int r6 = r4.F()
            r7 = 12
            r8 = 0
            r9 = 2
            if (r6 != r7) goto L_0x0142
            a8.t r4 = (a8.t) r4
            r6 = r2
            r7 = r6
        L_0x002e:
            if (r6 >= r9) goto L_0x0115
            float r7 = r0.f10877j
            e8.l r10 = r0.F
            if (r10 != 0) goto L_0x00a3
            e8.l r10 = new e8.l
            e8.g0 r11 = r0.f10882o
            r10.<init>(r11)
            r0.F = r10
            int r11 = r4.q0()
            r10.t(r11)
            e8.l r10 = r0.F
            float r11 = r4.t0()
            float r12 = r4.s0()
            float r11 = r11 + r12
            r10.z(r11)
            e8.l r10 = r0.F
            float r11 = r4.r0()
            r10.w(r11)
            e8.l r10 = r0.F
            float r11 = r4.t0()
            r10.y(r11)
            e8.l r10 = r0.F
            float r11 = r4.u0()
            r10.C(r11)
            e8.l r10 = r0.F
            float r11 = r4.n0()
            float r12 = r4.w0()
            r10.B(r11, r12)
            e8.l r10 = r0.F
            int r11 = r0.f10868a
            r10.D(r11)
            e8.l r10 = r0.F
            int r11 = r0.C
            r10.u(r11)
            e8.l r10 = r0.F
            float r11 = r0.f10891x
            r10.I(r11)
            e8.l r10 = r0.F
            r10.b(r4)
            if (r3 != 0) goto L_0x00a1
            float r10 = r0.f10877j
            float r11 = r4.y0()
            float r10 = r10 - r11
            r0.f10877j = r10
        L_0x00a1:
            r10 = r5
            goto L_0x00a4
        L_0x00a3:
            r10 = r2
        L_0x00a4:
            e8.l r11 = r0.F
            if (r3 == 0) goto L_0x00ab
            boolean r12 = r0.K
            goto L_0x00ac
        L_0x00ab:
            r12 = r2
        L_0x00ac:
            r11.K(r12)
            e8.l r11 = r0.F
            float r12 = r0.f10871d
            r11.f10871d = r12
            float r12 = r0.f10872e
            r11.f10872e = r12
            float r12 = r0.f10877j
            r11.f10877j = r12
            float r12 = r0.f10889v
            r11.f10889v = r12
            boolean r12 = r0.f10890w
            r11.f10890w = r12
            float r12 = r0.f10870c
            r11.f10870c = r12
            float r12 = r0.f10869b
            r11.f10869b = r12
            boolean r11 = r4.v0()
            if (r11 == 0) goto L_0x00d9
            if (r10 == 0) goto L_0x00d9
            if (r3 != 0) goto L_0x00d9
            r10 = r5
            goto L_0x00da
        L_0x00d9:
            r10 = r2
        L_0x00da:
            e8.l r11 = r0.F
            if (r23 != 0) goto L_0x00e5
            if (r10 == 0) goto L_0x00e3
            if (r6 != 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r12 = r2
            goto L_0x00e6
        L_0x00e5:
            r12 = r5
        L_0x00e6:
            int r11 = r11.p(r12)
            e8.l r12 = r0.F
            float r12 = r12.l()
            r0.f10878k = r12
            e8.l r12 = r0.F
            float r12 = r12.L
            r0.N(r12)
            r12 = r11 & 1
            if (r12 != 0) goto L_0x0104
            if (r10 == 0) goto L_0x0104
            r0.F = r8
            r0.f10877j = r7
            return r9
        L_0x0104:
            if (r23 != 0) goto L_0x0114
            if (r10 != 0) goto L_0x0109
            goto L_0x0114
        L_0x0109:
            if (r6 != 0) goto L_0x010f
            r0.F = r8
            r0.f10877j = r7
        L_0x010f:
            int r6 = r6 + 1
            r7 = r11
            goto L_0x002e
        L_0x0114:
            r7 = r11
        L_0x0115:
            e8.l r3 = r0.F
            float r5 = r3.f10877j
            r0.f10877j = r5
            int r5 = r0.f10893z
            int r6 = r3.f10893z
            int r5 = r5 + r6
            r0.f10893z = r5
            float r3 = r3.D
            r0.D = r3
            r3 = r7 & 1
            if (r3 == 0) goto L_0x013a
            r0.F = r8
            java.util.LinkedList r3 = r0.G
            r3.removeFirst()
            float r3 = r0.f10877j
            float r4 = r4.x0()
            float r3 = r3 - r4
            r0.f10877j = r3
        L_0x013a:
            r3 = r7 & 2
            if (r3 == 0) goto L_0x013f
            return r9
        L_0x013f:
            r3 = r2
            goto L_0x0459
        L_0x0142:
            int r6 = r4.F()
            r7 = 14
            if (r6 != r7) goto L_0x031f
            a8.p r4 = (a8.p) r4
            java.util.ArrayList r6 = r4.d()
            float r7 = r4.b()
            java.util.Stack r10 = new java.util.Stack
            r10.<init>()
            r11 = r2
            r12 = r11
        L_0x015b:
            int r13 = r6.size()
            if (r11 >= r13) goto L_0x01c9
            java.lang.Object r13 = r6.get(r11)
            boolean r14 = r13 instanceof a8.q
            if (r14 == 0) goto L_0x0173
            int r14 = r0.H
            if (r12 != r14) goto L_0x0170
            a8.q r13 = (a8.q) r13
            goto L_0x01ca
        L_0x0170:
            int r12 = r12 + 1
            goto L_0x0196
        L_0x0173:
            boolean r14 = r13 instanceof a8.p
            if (r14 == 0) goto L_0x0196
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6, r11}
            r10.push(r4)
            a8.p r13 = (a8.p) r13
            java.util.ArrayList r4 = r13.d()
            float r6 = r13.b()
            float r7 = r7 + r6
            r11 = -1
            r6 = r4
            r4 = r13
            goto L_0x01c7
        L_0x0196:
            int r13 = r6.size()
            int r13 = r13 - r5
            if (r11 != r13) goto L_0x01c7
            boolean r13 = r10.isEmpty()
            if (r13 != 0) goto L_0x01c7
            java.lang.Object r4 = r10.pop()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r6 = r4[r2]
            a8.p r6 = (a8.p) r6
            java.util.ArrayList r7 = r6.d()
            r11 = r4[r5]
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r4 = r4[r9]
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r21 = r7
            r7 = r4
            r4 = r6
            r6 = r21
        L_0x01c7:
            int r11 = r11 + r5
            goto L_0x015b
        L_0x01c9:
            r13 = r8
        L_0x01ca:
            r6 = r2
            r10 = r6
        L_0x01cc:
            if (r6 >= r9) goto L_0x02c4
            float r10 = r0.f10877j
            e8.l r11 = r0.F
            if (r11 != 0) goto L_0x025d
            if (r13 != 0) goto L_0x01df
            r0.H = r2
        L_0x01d8:
            java.util.LinkedList r4 = r0.G
            r4.removeFirst()
            goto L_0x0459
        L_0x01df:
            e8.l r11 = new e8.l
            e8.g0 r12 = r0.f10882o
            r11.<init>(r12)
            r0.F = r11
            if (r3 == 0) goto L_0x01ed
            boolean r12 = r0.K
            goto L_0x01ee
        L_0x01ed:
            r12 = r2
        L_0x01ee:
            r11.K(r12)
            e8.l r11 = r0.F
            int r12 = r13.q0()
            r11.t(r12)
            e8.l r11 = r0.F
            float r12 = r13.t0()
            float r12 = r12 + r7
            float r14 = r13.s0()
            float r12 = r12 + r14
            r11.z(r12)
            e8.l r11 = r0.F
            float r12 = r13.r0()
            r11.w(r12)
            e8.l r11 = r0.F
            float r12 = r11.k()
            r11.y(r12)
            e8.l r11 = r0.F
            float r12 = r13.u0()
            float r14 = r4.c()
            float r12 = r12 + r14
            r11.C(r12)
            e8.l r11 = r0.F
            float r12 = r13.n0()
            float r14 = r13.w0()
            r11.B(r12, r14)
            e8.l r11 = r0.F
            int r12 = r0.f10868a
            r11.D(r12)
            e8.l r11 = r0.F
            int r12 = r0.C
            r11.u(r12)
            e8.l r11 = r0.F
            float r12 = r0.f10891x
            r11.I(r12)
            e8.l r11 = r0.F
            r11.b(r13)
            if (r3 != 0) goto L_0x025b
            float r11 = r0.f10877j
            float r12 = r13.y0()
            float r11 = r11 - r12
            r0.f10877j = r11
        L_0x025b:
            r11 = r5
            goto L_0x025e
        L_0x025d:
            r11 = r2
        L_0x025e:
            e8.l r12 = r0.F
            float r14 = r0.f10871d
            r12.f10871d = r14
            float r14 = r0.f10872e
            r12.f10872e = r14
            float r14 = r0.f10877j
            r12.f10877j = r14
            float r14 = r0.f10889v
            r12.f10889v = r14
            boolean r14 = r0.f10890w
            r12.f10890w = r14
            float r14 = r0.f10870c
            r12.f10870c = r14
            float r14 = r0.f10869b
            r12.f10869b = r14
            boolean r12 = r13.v0()
            if (r12 == 0) goto L_0x0288
            if (r11 == 0) goto L_0x0288
            if (r3 != 0) goto L_0x0288
            r11 = r5
            goto L_0x0289
        L_0x0288:
            r11 = r2
        L_0x0289:
            e8.l r12 = r0.F
            if (r23 != 0) goto L_0x0294
            if (r11 == 0) goto L_0x0292
            if (r6 != 0) goto L_0x0292
            goto L_0x0294
        L_0x0292:
            r14 = r2
            goto L_0x0295
        L_0x0294:
            r14 = r5
        L_0x0295:
            int r12 = r12.p(r14)
            e8.l r14 = r0.F
            float r14 = r14.l()
            r0.f10878k = r14
            e8.l r14 = r0.F
            float r14 = r14.L
            r0.N(r14)
            r14 = r12 & 1
            if (r14 != 0) goto L_0x02b3
            if (r11 == 0) goto L_0x02b3
            r0.F = r8
            r0.f10877j = r10
            return r9
        L_0x02b3:
            if (r23 != 0) goto L_0x02c3
            if (r11 != 0) goto L_0x02b8
            goto L_0x02c3
        L_0x02b8:
            if (r6 != 0) goto L_0x02be
            r0.F = r8
            r0.f10877j = r10
        L_0x02be:
            int r6 = r6 + 1
            r10 = r12
            goto L_0x01cc
        L_0x02c3:
            r10 = r12
        L_0x02c4:
            e8.l r3 = r0.F
            float r4 = r3.f10877j
            r0.f10877j = r4
            int r4 = r0.f10893z
            int r6 = r3.f10893z
            int r4 = r4 + r6
            r0.f10893z = r4
            float r4 = r3.D
            r0.D = r4
            float r3 = r3.A
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L_0x0306
            e8.l r3 = r0.F
            boolean r3 = r3.B
            if (r3 != 0) goto L_0x0306
            if (r23 != 0) goto L_0x0302
            e8.g0 r14 = r0.f10882o
            r15 = 0
            a8.u r3 = new a8.u
            a8.c r4 = r13.L0()
            r3.<init>((a8.c) r4)
            e8.l r4 = r0.F
            float r6 = r4.f10871d
            float r17 = r6 + r7
            float r4 = r4.A
            r19 = 0
            r16 = r3
            r18 = r4
            L(r14, r15, r16, r17, r18, r19)
        L_0x0302:
            e8.l r3 = r0.F
            r3.B = r5
        L_0x0306:
            r3 = r10 & 1
            if (r3 == 0) goto L_0x031a
            r0.F = r8
            int r3 = r0.H
            int r3 = r3 + r5
            r0.H = r3
            float r3 = r0.f10877j
            float r4 = r13.x0()
            float r3 = r3 - r4
            r0.f10877j = r3
        L_0x031a:
            r3 = r10 & 2
            if (r3 == 0) goto L_0x013f
            return r9
        L_0x031f:
            int r6 = r4.F()
            r7 = 23
            if (r6 != r7) goto L_0x0586
            float r6 = r0.f10877j
            float r7 = r0.f10870c
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0335
            float r7 = r0.f10869b
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0338
        L_0x0335:
            r1 = r9
            goto L_0x0585
        L_0x0338:
            e8.n1 r4 = (e8.n1) r4
            int r6 = r4.Z()
            int r7 = r4.m()
            if (r6 > r7) goto L_0x0346
        L_0x0344:
            goto L_0x01d8
        L_0x0346:
            float r6 = r0.f10877j
            if (r3 != 0) goto L_0x0353
            int r7 = r0.H
            if (r7 != 0) goto L_0x0353
            float r7 = r4.c0()
            float r6 = r6 - r7
        L_0x0353:
            r14 = r6
            float r6 = r0.f10870c
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0360
            float r6 = r0.f10869b
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0363
        L_0x0360:
            r1 = r9
            goto L_0x0585
        L_0x0363:
            r0.f10879l = r1
            float r6 = r0.f10871d
            boolean r7 = r4.G()
            if (r7 == 0) goto L_0x0375
            float r7 = r4.A()
            r0.N(r7)
            goto L_0x0382
        L_0x0375:
            float r7 = r0.f10889v
            float r10 = r4.B()
            float r7 = r7 * r10
            r10 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r10
            r4.U(r7)
        L_0x0382:
            int r10 = r4.m()
            int r11 = r4.k()
            if (r11 <= r10) goto L_0x038d
            r11 = r10
        L_0x038d:
            int r12 = r10 - r11
            float r13 = r4.l()
            float r16 = r4.j()
            if (r3 != 0) goto L_0x03a6
            boolean r15 = r4.H()
            if (r15 == 0) goto L_0x03a6
            int r15 = r0.H
            if (r15 > r10) goto L_0x03a6
            r17 = r5
            goto L_0x03a8
        L_0x03a6:
            r17 = r2
        L_0x03a8:
            if (r17 != 0) goto L_0x03bc
            float r13 = r14 - r13
            float r15 = r0.f10870c
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 < 0) goto L_0x03b8
            float r15 = r0.f10869b
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 <= 0) goto L_0x03bd
        L_0x03b8:
            if (r3 == 0) goto L_0x03bb
            goto L_0x0344
        L_0x03bb:
            return r9
        L_0x03bc:
            r13 = r14
        L_0x03bd:
            int r15 = r0.H
            if (r15 >= r10) goto L_0x03c3
            r0.H = r10
        L_0x03c3:
            boolean r15 = r4.Y()
            if (r15 != 0) goto L_0x03cb
            float r13 = r13 - r16
        L_0x03cb:
            int r15 = r0.H
        L_0x03cd:
            int r1 = r4.Z()
            if (r15 >= r1) goto L_0x03e5
            float r1 = r4.s(r15)
            float r1 = r13 - r1
            float r9 = r0.f10870c
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x03e0
            goto L_0x03e5
        L_0x03e0:
            int r15 = r15 + 1
            r13 = r1
            r9 = 2
            goto L_0x03cd
        L_0x03e5:
            boolean r1 = r4.Y()
            if (r1 != 0) goto L_0x03ed
            float r13 = r13 + r16
        L_0x03ed:
            int r1 = r4.Z()
            if (r15 >= r1) goto L_0x046f
            boolean r1 = r4.K()
            if (r1 == 0) goto L_0x0446
            boolean r1 = r4.J()
            if (r1 == 0) goto L_0x0405
            int r1 = r0.H
            if (r15 != r1) goto L_0x0446
            if (r3 == 0) goto L_0x0446
        L_0x0405:
            boolean r1 = r0.I
            if (r1 != 0) goto L_0x0424
            r0.I = r5
            e8.n1 r1 = new e8.n1
            r1.<init>((e8.n1) r4)
            java.util.LinkedList r3 = r0.G
            r3.set(r2, r1)
            java.util.ArrayList r3 = r1.u()
        L_0x0419:
            int r4 = r0.H
            if (r10 >= r4) goto L_0x0423
            r3.set(r10, r8)
            int r10 = r10 + 1
            goto L_0x0419
        L_0x0423:
            r4 = r1
        L_0x0424:
            float r1 = r0.f10870c
            float r1 = r13 - r1
            e8.m1 r3 = r4.q(r15)
            e8.m1 r1 = r3.k(r4, r15, r1)
            if (r1 != 0) goto L_0x0438
            int r1 = r0.H
            if (r15 != r1) goto L_0x0443
            r1 = 2
            return r1
        L_0x0438:
            float r13 = r0.f10870c
            java.util.ArrayList r3 = r4.u()
            int r15 = r15 + 1
            r3.add(r15, r1)
        L_0x0443:
            r3 = r15
            r1 = 2
            goto L_0x0480
        L_0x0446:
            boolean r1 = r4.K()
            if (r1 != 0) goto L_0x045c
            int r1 = r0.H
            if (r15 != r1) goto L_0x045c
            if (r3 == 0) goto L_0x045c
            java.util.LinkedList r1 = r0.G
            r1.removeFirst()
            r0.I = r2
        L_0x0459:
            r1 = 0
            goto L_0x000e
        L_0x045c:
            int r1 = r0.H
            if (r15 != r1) goto L_0x046f
            if (r3 != 0) goto L_0x046f
            boolean r1 = r4.K()
            if (r1 == 0) goto L_0x0471
            boolean r1 = r4.J()
            if (r1 == 0) goto L_0x046f
            goto L_0x0471
        L_0x046f:
            r1 = 2
            goto L_0x047f
        L_0x0471:
            int r1 = r4.k()
            if (r1 == 0) goto L_0x047d
            boolean r1 = r4.Y()
            if (r1 == 0) goto L_0x046f
        L_0x047d:
            r1 = 2
            return r1
        L_0x047f:
            r3 = r15
        L_0x0480:
            if (r23 != 0) goto L_0x0526
            int r9 = r4.n()
            if (r9 == 0) goto L_0x0496
            if (r9 == r1) goto L_0x0492
            float r1 = r0.f10889v
            float r1 = r1 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r7
        L_0x0490:
            float r6 = r6 + r1
            goto L_0x0496
        L_0x0492:
            float r1 = r0.f10889v
            float r1 = r1 - r7
            goto L_0x0490
        L_0x0496:
            e8.n1 r10 = e8.n1.X(r4)
            java.util.ArrayList r1 = r10.u()
            if (r17 != 0) goto L_0x04aa
            if (r12 <= 0) goto L_0x04aa
            java.util.ArrayList r7 = r4.w(r2, r12)
            r1.addAll(r7)
            goto L_0x04ad
        L_0x04aa:
            r10.O(r11)
        L_0x04ad:
            int r7 = r0.H
            java.util.ArrayList r7 = r4.w(r7, r3)
            r1.addAll(r7)
            boolean r7 = r4.I()
            r7 = r7 ^ r5
            int r9 = r4.Z()
            if (r3 >= r9) goto L_0x04c7
            r10.M(r5)
            r7 = r5
            r9 = r7
            goto L_0x04c8
        L_0x04c7:
            r9 = r2
        L_0x04c8:
            r15 = r2
        L_0x04c9:
            if (r15 >= r11) goto L_0x04e0
            boolean r20 = r10.Y()
            if (r20 == 0) goto L_0x04e0
            if (r7 == 0) goto L_0x04e0
            int r8 = r15 + r12
            e8.m1 r8 = r4.q(r8)
            r1.add(r8)
            int r15 = r15 + 1
            r8 = 0
            goto L_0x04c9
        L_0x04e0:
            int r8 = r1.size()
            int r8 = r8 - r5
            if (r7 == 0) goto L_0x04e8
            int r8 = r8 - r11
        L_0x04e8:
            java.lang.Object r1 = r1.get(r8)
            e8.m1 r1 = (e8.m1) r1
            boolean r5 = r4.D(r9)
            if (r5 == 0) goto L_0x0503
            float r5 = r1.c()
            float r7 = r0.f10870c
            float r13 = r13 - r7
            float r13 = r13 + r5
            r1.i(r13)
            float r13 = r0.f10870c
            r7 = r13
            goto L_0x0505
        L_0x0503:
            r7 = r13
            r5 = 0
        L_0x0505:
            if (r9 == 0) goto L_0x050a
            r4.y()
        L_0x050a:
            e8.g0[] r15 = r0.f10883p
            r11 = 0
            r12 = -1
            if (r15 == 0) goto L_0x0515
            r13 = r6
            r10.f0(r11, r12, r13, r14, r15)
            goto L_0x051b
        L_0x0515:
            e8.g0 r15 = r0.f10882o
            r13 = r6
            r10.d0(r11, r12, r13, r14, r15)
        L_0x051b:
            boolean r6 = r4.D(r9)
            if (r6 == 0) goto L_0x0524
            r1.i(r5)
        L_0x0524:
            r13 = r7
            goto L_0x0535
        L_0x0526:
            boolean r1 = r4.C()
            if (r1 == 0) goto L_0x0535
            float r1 = r0.f10870c
            r5 = -830472192(0xffffffffce800000, float:-1.07374182E9)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0535
            r13 = r1
        L_0x0535:
            r0.f10877j = r13
            if (r17 != 0) goto L_0x0545
            boolean r1 = r4.Y()
            if (r1 != 0) goto L_0x0545
            float r1 = r0.f10877j
            float r1 = r1 + r16
            r0.f10877j = r1
        L_0x0545:
            int r1 = r4.Z()
            if (r3 < r1) goto L_0x056f
            float r1 = r0.f10877j
            float r3 = r4.b0()
            float r1 = r1 - r3
            float r3 = r0.f10870c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x055b
            r0.f10877j = r3
            goto L_0x0564
        L_0x055b:
            float r1 = r0.f10877j
            float r3 = r4.b0()
            float r1 = r1 - r3
            r0.f10877j = r1
        L_0x0564:
            java.util.LinkedList r1 = r0.G
            r1.removeFirst()
            r0.I = r2
            r0.H = r2
            goto L_0x013f
        L_0x056f:
            boolean r1 = r0.I
            if (r1 == 0) goto L_0x0582
            java.util.ArrayList r1 = r4.u()
            int r2 = r0.H
        L_0x0579:
            if (r2 >= r3) goto L_0x0582
            r4 = 0
            r1.set(r2, r4)
            int r2 = r2 + 1
            goto L_0x0579
        L_0x0582:
            r0.H = r3
            r1 = 2
        L_0x0585:
            return r1
        L_0x0586:
            int r1 = r4.F()
            r5 = 55
            if (r1 != r5) goto L_0x0590
            if (r23 == 0) goto L_0x0597
        L_0x0590:
            java.util.LinkedList r1 = r0.G
            r1.removeFirst()
            goto L_0x0459
        L_0x0597:
            android.support.v4.media.session.b.a(r4)
            r1 = 0
            throw r1
        L_0x059c:
            a8.g r1 = new a8.g
            java.lang.String r3 = "irregular.columns.are.not.supported.in.composite.mode"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = b8.a.b(r3, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.l.q(boolean):int");
    }

    public boolean r() {
        return this.K;
    }

    public l s(l lVar) {
        H(lVar);
        if (lVar.f10876i != null) {
            this.f10876i = new d(lVar.f10876i);
        }
        return this;
    }

    public void t(int i10) {
        this.f10873f = i10;
    }

    public void u(int i10) {
        this.C = i10;
    }

    public void v(g0[] g0VarArr) {
        this.f10883p = g0VarArr;
        this.f10882o = g0VarArr[3];
        l lVar = this.F;
        if (lVar != null) {
            lVar.v(g0VarArr);
        }
    }

    public void w(float f10) {
        this.f10888u = f10;
    }

    public void x(float f10) {
        this.L = f10;
    }

    public void y(float f10) {
        this.f10886s = f10;
        this.f10892y = true;
    }

    public void z(float f10) {
        this.f10885r = f10;
        this.f10892y = true;
    }
}
