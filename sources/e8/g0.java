package e8;

import a8.b;
import a8.v;
import g8.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class g0 {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f10735j = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static HashMap f10736k;

    /* renamed from: a  reason: collision with root package name */
    protected f f10737a = new f();

    /* renamed from: b  reason: collision with root package name */
    protected c2 f10738b;

    /* renamed from: c  reason: collision with root package name */
    protected m0 f10739c;

    /* renamed from: d  reason: collision with root package name */
    protected a f10740d = new a();

    /* renamed from: e  reason: collision with root package name */
    protected ArrayList f10741e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    protected ArrayList f10742f;

    /* renamed from: g  reason: collision with root package name */
    protected int f10743g = 10;

    /* renamed from: h  reason: collision with root package name */
    private int f10744h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10745i = false;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        p f10746a;

        /* renamed from: b  reason: collision with root package name */
        k f10747b;

        /* renamed from: c  reason: collision with root package name */
        float f10748c;

        /* renamed from: d  reason: collision with root package name */
        protected float f10749d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        protected float f10750e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        protected float f10751f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        protected float f10752g = 100.0f;

        /* renamed from: h  reason: collision with root package name */
        protected float f10753h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        protected float f10754i = 0.0f;

        a() {
        }

        a(a aVar) {
            this.f10746a = aVar.f10746a;
            k kVar = aVar.f10747b;
            this.f10748c = aVar.f10748c;
            this.f10749d = aVar.f10749d;
            this.f10750e = aVar.f10750e;
            this.f10751f = aVar.f10751f;
            this.f10752g = aVar.f10752g;
            this.f10753h = aVar.f10753h;
            this.f10754i = aVar.f10754i;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f10736k = hashMap;
        hashMap.put(c1.f10301i0, "/BPC ");
        f10736k.put(c1.f10228c1, "/CS ");
        f10736k.put(c1.K1, "/D ");
        f10736k.put(c1.L1, "/DP ");
        f10736k.put(c1.f10242d3, "/F ");
        f10736k.put(c1.f10292h4, "/H ");
        f10736k.put(c1.E4, "/IM ");
        f10736k.put(c1.N4, "/Intent ");
        f10736k.put(c1.O4, "/I ");
        f10736k.put(c1.f10325jb, "/W ");
    }

    public g0(c2 c2Var) {
        if (c2Var != null) {
            this.f10738b = c2Var;
            this.f10739c = c2Var.J();
        }
    }

    private void a(float f10, float f11, float f12, float f13) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        } else if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        this.f10737a.g(f10).e(' ').g(f11).e(' ').g(f12).e(' ').g(f13);
    }

    private void b(float f10, float f11, float f12) {
        d.a(this.f10738b, 3, (Object) null);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        } else if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        this.f10737a.g(f10).e(' ').g(f11).e(' ').g(f12);
    }

    private void c0(String str) {
        p pVar = this.f10740d.f10746a;
        if (pVar != null) {
            k(pVar.a(str), this.f10737a);
            return;
        }
        throw new NullPointerException(b8.a.b("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
    }

    private boolean h(b bVar, b bVar2) {
        if (bVar == null && bVar2 == null) {
            return true;
        }
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar instanceof n ? bVar.equals(bVar2) : bVar2.equals(bVar);
    }

    static void k(byte[] bArr, f fVar) {
        String str;
        fVar.B(40);
        for (byte b10 : bArr) {
            if (b10 == 12) {
                str = "\\f";
            } else if (b10 == 13) {
                str = "\\r";
            } else if (b10 == 40 || b10 == 41 || b10 == 92) {
                fVar.B(92).B(b10);
            } else {
                switch (b10) {
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    default:
                        fVar.B(b10);
                        continue;
                }
            }
            fVar.n(str);
        }
        fVar.n(")");
    }

    static byte[] l(byte[] bArr) {
        f fVar = new f();
        k(bArr, fVar);
        return fVar.Z();
    }

    public void A(v vVar) {
        float p10 = vVar.p();
        float m10 = vVar.m();
        float s10 = vVar.s();
        float w10 = vVar.w();
        b b10 = vVar.b();
        if (b10 != null) {
            I();
            M(b10);
            z(p10, m10, s10 - p10, w10 - m10);
            m();
            G();
        }
        if (vVar.B()) {
            if (vVar.C()) {
                f0(vVar);
                return;
            }
            if (vVar.h() != -1.0f) {
                S(vVar.h());
            }
            b c10 = vVar.c();
            if (c10 != null) {
                N(c10);
            }
            if (vVar.A(15)) {
                z(p10, m10, s10 - p10, w10 - m10);
            } else {
                if (vVar.A(8)) {
                    x(s10, m10);
                    v(s10, w10);
                }
                if (vVar.A(4)) {
                    x(p10, m10);
                    v(p10, w10);
                }
                if (vVar.A(2)) {
                    x(p10, m10);
                    v(s10, m10);
                }
                if (vVar.A(1)) {
                    x(p10, w10);
                    v(s10, w10);
                }
            }
            e0();
            if (c10 != null) {
                F();
            }
        }
    }

    public void B() {
        C(true);
    }

    public void C(boolean z10) {
        this.f10737a.R();
        if (z10) {
            H();
        }
        this.f10740d = new a();
    }

    public void D() {
        this.f10737a.n("0 G").B(this.f10743g);
    }

    public void E() {
        this.f10737a.n("0 g").B(this.f10743g);
    }

    public void F() {
        this.f10737a.n("0 G").B(this.f10743g);
    }

    public void G() {
        this.f10737a.n("Q").B(this.f10743g);
        int size = this.f10741e.size() - 1;
        if (size >= 0) {
            this.f10740d = (a) this.f10741e.get(size);
            this.f10741e.remove(size);
            return;
        }
        throw new c8.a(b8.a.b("unbalanced.save.restore.state.operators", new Object[0]));
    }

    public void H() {
        if (this.f10744h != 0) {
            throw new c8.a(b8.a.b("unbalanced.marked.content.operators", new Object[0]));
        } else if (!this.f10745i) {
            ArrayList arrayList = this.f10742f;
            if (arrayList != null && !arrayList.isEmpty()) {
                throw new c8.a(b8.a.b("unbalanced.layer.operators", new Object[0]));
            } else if (!this.f10741e.isEmpty()) {
                throw new c8.a(b8.a.b("unbalanced.save.restore.state.operators", new Object[0]));
            }
        } else {
            throw new c8.a(b8.a.b("unbalanced.begin.end.text.operators", new Object[0]));
        }
    }

    public void I() {
        this.f10737a.n("q").B(this.f10743g);
        this.f10741e.add(new a(this.f10740d));
    }

    public void J(float f10, float f11, float f12, float f13) {
        a(f10, f11, f12, f13);
        this.f10737a.n(" k").B(this.f10743g);
    }

    public void K(float f10, float f11, float f12, float f13) {
        a(f10, f11, f12, f13);
        this.f10737a.n(" K").B(this.f10743g);
    }

    public void L(float f10) {
        this.f10740d.f10753h = f10;
        this.f10737a.g(f10).n(" Tc").B(this.f10743g);
    }

    public void M(b bVar) {
        d.a(this.f10738b, 1, bVar);
        int g10 = n.g(bVar);
        if (g10 == 1) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 == 2) {
            j jVar = (j) bVar;
            J(jVar.j(), jVar.k(), jVar.l(), jVar.i());
        } else if (g10 == 3) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 == 4) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 != 5) {
            T(bVar.d(), bVar.b(), bVar.a());
        } else {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        }
    }

    public void N(b bVar) {
        d.a(this.f10738b, 1, bVar);
        int g10 = n.g(bVar);
        if (g10 == 1) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 == 2) {
            j jVar = (j) bVar;
            K(jVar.j(), jVar.k(), jVar.l(), jVar.i());
        } else if (g10 == 3) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 == 4) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        } else if (g10 != 5) {
            U(bVar.d(), bVar.b(), bVar.a());
        } else {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        }
    }

    public void O(c cVar, float f10) {
        f();
        if (f10 >= 1.0E-4f || f10 <= -1.0E-4f) {
            a aVar = this.f10740d;
            aVar.f10748c = f10;
            aVar.f10746a = this.f10738b.m(cVar);
            this.f10737a.o(q().b(this.f10740d.f10746a.b(), this.f10740d.f10746a.c()).b()).e(' ').g(f10).n(" Tf").B(this.f10743g);
            return;
        }
        throw new IllegalArgumentException(b8.a.b("font.size.too.small.1", String.valueOf(f10)));
    }

    public void P(float f10) {
        this.f10737a.g(f10).n(" g").B(this.f10743g);
    }

    public void Q(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f10737a.h(i10).n(" J").B(this.f10743g);
        }
    }

    public void R(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f10737a.h(i10).n(" j").B(this.f10743g);
        }
    }

    public void S(float f10) {
        this.f10737a.g(f10).n(" w").B(this.f10743g);
    }

    public void T(int i10, int i11, int i12) {
        b(((float) (i10 & 255)) / 255.0f, ((float) (i11 & 255)) / 255.0f, ((float) (i12 & 255)) / 255.0f);
        this.f10737a.n(" rg").B(this.f10743g);
    }

    public void U(int i10, int i11, int i12) {
        b(((float) (i10 & 255)) / 255.0f, ((float) (i11 & 255)) / 255.0f, ((float) (i12 & 255)) / 255.0f);
        this.f10737a.n(" RG").B(this.f10743g);
    }

    public void V(float f10, float f11) {
        W(1.0f, 0.0f, 0.0f, 1.0f, f10, f11);
    }

    public void W(float f10, float f11, float f12, float f13, float f14, float f15) {
        a aVar = this.f10740d;
        aVar.f10749d = f14;
        aVar.f10750e = f15;
        this.f10737a.g(f10).e(' ').g(f11).B(32).g(f12).B(32).g(f13).B(32).g(f14).B(32).g(f15).n(" Tm").B(this.f10743g);
    }

    public void X(int i10) {
        this.f10737a.h(i10).n(" Tr").B(this.f10743g);
    }

    public void Y(float f10) {
        this.f10737a.g(f10).n(" Ts").B(this.f10743g);
    }

    public void Z(float f10) {
        this.f10740d.f10754i = f10;
        this.f10737a.g(f10).n(" Tw").B(this.f10743g);
    }

    public void a0(b2 b2Var) {
        if (this.f10740d.f10746a != null) {
            this.f10737a.n("[");
            Iterator it = b2Var.c().iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        c0((String) next);
                    } else {
                        if (z10) {
                            this.f10737a.e(' ');
                        } else {
                            z10 = true;
                        }
                        this.f10737a.g(((Float) next).floatValue());
                    }
                }
                this.f10737a.n("]TJ").B(this.f10743g);
                return;
            }
        }
        throw new NullPointerException(b8.a.b("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
    }

    public void b0(String str) {
        c0(str);
        this.f10737a.n("Tj").B(this.f10743g);
    }

    public void c(g0 g0Var) {
        c2 c2Var = g0Var.f10738b;
        if (c2Var == null || this.f10738b == c2Var) {
            this.f10737a.l(g0Var.f10737a);
            return;
        }
        throw new RuntimeException(b8.a.b("inconsistent.writers.are.you.mixing.two.documents", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    public void d(a0 a0Var) {
        this.f10738b.j(a0Var);
    }

    /* access modifiers changed from: package-private */
    public int d0() {
        return this.f10737a.Y();
    }

    public void e() {
        if (!this.f10745i) {
            this.f10745i = true;
            a aVar = this.f10740d;
            aVar.f10749d = 0.0f;
            aVar.f10750e = 0.0f;
            this.f10737a.n("BT").B(this.f10743g);
            return;
        }
        throw new c8.a(b8.a.b("unbalanced.begin.end.text.operators", new Object[0]));
    }

    public void e0() {
        this.f10737a.n("S").B(this.f10743g);
    }

    /* access modifiers changed from: protected */
    public void f() {
        if (this.f10738b == null) {
            throw new NullPointerException(b8.a.b("the.writer.in.pdfcontentbyte.is.null", new Object[0]));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f0(a8.v r25) {
        /*
            r24 = this;
            r0 = r24
            float r1 = r25.w()
            float r2 = r25.m()
            float r3 = r25.s()
            float r4 = r25.p()
            float r5 = r25.l()
            float r6 = r25.i()
            float r7 = r25.k()
            float r8 = r25.j()
            a8.b r9 = r25.g()
            a8.b r10 = r25.d()
            a8.b r11 = r25.f()
            a8.b r12 = r25.e()
            r24.I()
            r13 = 0
            r0.Q(r13)
            r0.R(r13)
            r14 = 0
            int r15 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r16 = 1073741824(0x40000000, float:2.0)
            r17 = 1
            r18 = 0
            if (r15 <= 0) goto L_0x0065
            r0.S(r5)
            if (r9 != 0) goto L_0x0050
            r24.F()
            goto L_0x0053
        L_0x0050:
            r0.N(r9)
        L_0x0053:
            float r15 = r5 / r16
            float r15 = r1 - r15
            r0.x(r4, r15)
            r0.v(r3, r15)
            r24.e0()
            r15 = r5
            r13 = r9
            r19 = r17
            goto L_0x006a
        L_0x0065:
            r19 = r13
            r15 = r14
            r13 = r18
        L_0x006a:
            int r20 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r20 <= 0) goto L_0x0098
            int r20 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r20 == 0) goto L_0x0076
            r0.S(r6)
            r15 = r6
        L_0x0076:
            if (r19 == 0) goto L_0x007e
            boolean r20 = r0.h(r13, r10)
            if (r20 != 0) goto L_0x008a
        L_0x007e:
            if (r10 != 0) goto L_0x0084
            r24.F()
            goto L_0x0087
        L_0x0084:
            r0.N(r10)
        L_0x0087:
            r13 = r10
            r19 = r17
        L_0x008a:
            float r20 = r6 / r16
            float r14 = r2 + r20
            r0.x(r3, r14)
            r0.v(r4, r14)
            r24.e0()
            r14 = 0
        L_0x0098:
            int r20 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r20 <= 0) goto L_0x0122
            int r14 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x00a4
            r0.S(r7)
            r15 = r7
        L_0x00a4:
            if (r19 == 0) goto L_0x00ac
            boolean r14 = r0.h(r13, r11)
            if (r14 != 0) goto L_0x00b8
        L_0x00ac:
            if (r11 != 0) goto L_0x00b2
            r24.F()
            goto L_0x00b5
        L_0x00b2:
            r0.N(r11)
        L_0x00b5:
            r13 = r11
            r19 = r17
        L_0x00b8:
            boolean r14 = r0.h(r9, r11)
            boolean r20 = r0.h(r10, r11)
            float r21 = r7 / r16
            r22 = r13
            float r13 = r3 - r21
            if (r14 == 0) goto L_0x00cc
            r23 = r15
            r15 = r1
            goto L_0x00d2
        L_0x00cc:
            float r21 = r1 - r5
            r23 = r15
            r15 = r21
        L_0x00d2:
            r0.x(r13, r15)
            if (r20 == 0) goto L_0x00d9
            r15 = r2
            goto L_0x00db
        L_0x00d9:
            float r15 = r2 + r6
        L_0x00db:
            r0.v(r13, r15)
            r24.e0()
            if (r14 == 0) goto L_0x00f0
            if (r20 != 0) goto L_0x00e6
            goto L_0x00f0
        L_0x00e6:
            r11 = r18
            r13 = r22
            r15 = r23
        L_0x00ec:
            r3 = 0
            r17 = 0
            goto L_0x0125
        L_0x00f0:
            if (r11 != 0) goto L_0x00f6
            r24.E()
            goto L_0x00f9
        L_0x00f6:
            r0.M(r11)
        L_0x00f9:
            if (r14 != 0) goto L_0x010b
            r0.x(r3, r1)
            float r13 = r1 - r5
            r0.v(r3, r13)
            float r14 = r3 - r7
            r0.v(r14, r13)
            r24.m()
        L_0x010b:
            if (r20 != 0) goto L_0x011c
            r0.x(r3, r2)
            float r13 = r2 + r6
            r0.v(r3, r13)
            float r3 = r3 - r7
            r0.v(r3, r13)
            r24.m()
        L_0x011c:
            r13 = r22
            r15 = r23
            r3 = 0
            goto L_0x0125
        L_0x0122:
            r11 = r18
            goto L_0x00ec
        L_0x0125:
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0197
            int r3 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0130
            r0.S(r8)
        L_0x0130:
            if (r19 == 0) goto L_0x0138
            boolean r3 = r0.h(r13, r12)
            if (r3 != 0) goto L_0x0141
        L_0x0138:
            if (r12 != 0) goto L_0x013e
            r24.F()
            goto L_0x0141
        L_0x013e:
            r0.N(r12)
        L_0x0141:
            boolean r3 = r0.h(r9, r12)
            boolean r7 = r0.h(r10, r12)
            float r9 = r8 / r16
            float r9 = r9 + r4
            if (r3 == 0) goto L_0x0150
            r10 = r1
            goto L_0x0152
        L_0x0150:
            float r10 = r1 - r5
        L_0x0152:
            r0.x(r9, r10)
            if (r7 == 0) goto L_0x0159
            r10 = r2
            goto L_0x015b
        L_0x0159:
            float r10 = r2 + r6
        L_0x015b:
            r0.v(r9, r10)
            r24.e0()
            if (r3 == 0) goto L_0x0165
            if (r7 != 0) goto L_0x0197
        L_0x0165:
            if (r17 == 0) goto L_0x016d
            boolean r9 = r0.h(r11, r12)
            if (r9 != 0) goto L_0x0176
        L_0x016d:
            if (r12 != 0) goto L_0x0173
            r24.E()
            goto L_0x0176
        L_0x0173:
            r0.M(r12)
        L_0x0176:
            if (r3 != 0) goto L_0x0187
            r0.x(r4, r1)
            float r1 = r1 - r5
            r0.v(r4, r1)
            float r3 = r4 + r8
            r0.v(r3, r1)
            r24.m()
        L_0x0187:
            if (r7 != 0) goto L_0x0197
            r0.x(r4, r2)
            float r2 = r2 + r6
            r0.v(r4, r2)
            float r4 = r4 + r8
            r0.v(r4, r2)
            r24.m()
        L_0x0197:
            r24.G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g0.f0(a8.v):void");
    }

    public void g() {
        this.f10737a.n("W").B(this.f10743g);
    }

    public void i(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f10737a.g(f10).e(' ').g(f11).e(' ').g(f12).e(' ');
        this.f10737a.g(f13).e(' ').g(f14).e(' ').g(f15).n(" cm").B(this.f10743g);
    }

    public void j() {
        if (this.f10745i) {
            this.f10745i = false;
            this.f10737a.n("ET").B(this.f10743g);
            return;
        }
        throw new c8.a(b8.a.b("unbalanced.begin.end.text.operators", new Object[0]));
    }

    public void m() {
        this.f10737a.n("f").B(this.f10743g);
    }

    public float n() {
        return this.f10740d.f10753h;
    }

    public g0 o() {
        return new g0(this.f10738b);
    }

    public f p() {
        return this.f10737a;
    }

    /* access modifiers changed from: package-private */
    public x q() {
        return this.f10739c.I();
    }

    public m0 r() {
        return this.f10739c;
    }

    public c2 s() {
        return this.f10738b;
    }

    public float t() {
        return this.f10740d.f10749d;
    }

    public String toString() {
        return this.f10737a.toString();
    }

    public float u() {
        return this.f10740d.f10750e;
    }

    public void v(float f10, float f11) {
        this.f10737a.g(f10).e(' ').g(f11).n(" l").B(this.f10743g);
    }

    public void w(float f10, float f11) {
        a aVar = this.f10740d;
        aVar.f10749d += f10;
        aVar.f10750e += f11;
        this.f10737a.g(f10).e(' ').g(f11).n(" Td").B(this.f10743g);
    }

    public void x(float f10, float f11) {
        this.f10737a.g(f10).e(' ').g(f11).n(" m").B(this.f10743g);
    }

    public void y() {
        this.f10737a.n("n").B(this.f10743g);
    }

    public void z(float f10, float f11, float f12, float f13) {
        this.f10737a.g(f10).e(' ').g(f11).e(' ').g(f12).e(' ').g(f13).n(" re").B(this.f10743g);
    }
}
