package t;

import java.util.ArrayList;
import p.d;
import s.d;
import s.e;
import s.f;
import s.h;
import s.i;
import s.k;
import s.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f16139a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f16140b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f16141c;

    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f16142k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f16143l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f16144m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f16145a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f16146b;

        /* renamed from: c  reason: collision with root package name */
        public int f16147c;

        /* renamed from: d  reason: collision with root package name */
        public int f16148d;

        /* renamed from: e  reason: collision with root package name */
        public int f16149e;

        /* renamed from: f  reason: collision with root package name */
        public int f16150f;

        /* renamed from: g  reason: collision with root package name */
        public int f16151g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16152h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16153i;

        /* renamed from: j  reason: collision with root package name */
        public int f16154j;
    }

    /* renamed from: t.b$b  reason: collision with other inner class name */
    public interface C0215b {
        void a();

        void b(e eVar, a aVar);
    }

    public b(f fVar) {
        this.f16141c = fVar;
    }

    private boolean a(C0215b bVar, e eVar, int i10) {
        this.f16140b.f16145a = eVar.A();
        this.f16140b.f16146b = eVar.T();
        this.f16140b.f16147c = eVar.W();
        this.f16140b.f16148d = eVar.x();
        a aVar = this.f16140b;
        aVar.f16153i = false;
        aVar.f16154j = i10;
        e.b bVar2 = aVar.f16145a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f16146b == bVar3;
        boolean z12 = z10 && eVar.f15686d0 > 0.0f;
        boolean z13 = z11 && eVar.f15686d0 > 0.0f;
        if (z12 && eVar.f15727y[0] == 4) {
            aVar.f16145a = e.b.FIXED;
        }
        if (z13 && eVar.f15727y[1] == 4) {
            aVar.f16146b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.k1(this.f16140b.f16149e);
        eVar.L0(this.f16140b.f16150f);
        eVar.K0(this.f16140b.f16152h);
        eVar.A0(this.f16140b.f16151g);
        a aVar2 = this.f16140b;
        aVar2.f16154j = a.f16142k;
        return aVar2.f16153i;
    }

    private void b(f fVar) {
        l lVar;
        n nVar;
        int size = fVar.L0.size();
        boolean T1 = fVar.T1(64);
        C0215b I1 = fVar.I1();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) fVar.L0.get(i10);
            if (!(eVar instanceof h) && !(eVar instanceof s.a) && !eVar.l0() && (!T1 || (lVar = eVar.f15687e) == null || (nVar = eVar.f15689f) == null || !lVar.f16223e.f16175j || !nVar.f16223e.f16175j)) {
                e.b u10 = eVar.u(0);
                boolean z10 = true;
                e.b u11 = eVar.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z11 = u10 == bVar && eVar.f15723w != 1 && u11 == bVar && eVar.f15725x != 1;
                if (!z11 && fVar.T1(1) && !(eVar instanceof l)) {
                    if (u10 == bVar && eVar.f15723w == 0 && u11 != bVar && !eVar.i0()) {
                        z11 = true;
                    }
                    if (u11 != bVar || eVar.f15725x != 0 || u10 == bVar || eVar.i0()) {
                        z10 = z11;
                    }
                    if ((u10 != bVar && u11 != bVar) || eVar.f15686d0 <= 0.0f) {
                        z11 = z10;
                    }
                }
                if (!z11) {
                    a(I1, eVar, a.f16142k);
                }
            }
        }
        I1.a();
    }

    private void c(f fVar, String str, int i10, int i11, int i12) {
        int I = fVar.I();
        int H = fVar.H();
        fVar.a1(0);
        fVar.Z0(0);
        fVar.k1(i11);
        fVar.L0(i12);
        fVar.a1(I);
        fVar.Z0(H);
        this.f16141c.X1(i10);
        this.f16141c.s1();
    }

    public long d(f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        f fVar2;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        b bVar = this;
        f fVar3 = fVar;
        int i23 = i10;
        int i24 = i13;
        int i25 = i15;
        C0215b I1 = fVar.I1();
        int size = fVar3.L0.size();
        int W = fVar.W();
        int x10 = fVar.x();
        boolean b10 = k.b(i23, 128);
        boolean z13 = b10 || k.b(i23, 64);
        if (z13) {
            int i26 = 0;
            while (true) {
                if (i26 >= size) {
                    break;
                }
                e eVar = (e) fVar3.L0.get(i26);
                e.b A = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (A == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((!eVar.i0() || !z14) && ((!eVar.k0() || !z14) && !(eVar instanceof l) && !eVar.i0() && !eVar.k0())) {
                    i26++;
                }
            }
            z13 = false;
        }
        if (z13) {
            boolean z15 = d.f14515r;
        }
        boolean z16 = z13 & ((i24 == 1073741824 && i25 == 1073741824) || b10);
        int i27 = 2;
        if (z16) {
            int min = Math.min(fVar.G(), i14);
            int min2 = Math.min(fVar.F(), i16);
            if (i24 == 1073741824 && fVar.W() != min) {
                fVar3.k1(min);
                fVar.M1();
            }
            if (i25 == 1073741824 && fVar.x() != min2) {
                fVar3.L0(min2);
                fVar.M1();
            }
            if (i24 == 1073741824 && i25 == 1073741824) {
                z10 = fVar3.F1(b10);
                i19 = 2;
            } else {
                boolean G1 = fVar3.G1(b10);
                if (i24 == 1073741824) {
                    G1 &= fVar3.H1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i25 == 1073741824) {
                    z10 = fVar3.H1(b10, 1) & G1;
                    i19++;
                } else {
                    z10 = G1;
                }
            }
            if (z10) {
                fVar3.p1(i24 == 1073741824, i25 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0;
        }
        int J1 = fVar.J1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f16139a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, W, x10);
        }
        if (size2 > 0) {
            e.b A2 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = A2 == bVar3;
            boolean z18 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.f16141c.I());
            int max2 = Math.max(fVar.x(), bVar.f16141c.H());
            int i28 = 0;
            boolean z19 = false;
            while (i28 < size2) {
                e eVar2 = (e) bVar.f16139a.get(i28);
                if (!(eVar2 instanceof l)) {
                    i22 = J1;
                } else {
                    int W2 = eVar2.W();
                    int x11 = eVar2.x();
                    i22 = J1;
                    boolean a10 = bVar.a(I1, eVar2, a.f16143l) | z19;
                    int W3 = eVar2.W();
                    boolean z20 = a10;
                    int x12 = eVar2.x();
                    if (W3 != W2) {
                        eVar2.k1(W3);
                        if (z17 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.b.RIGHT).f());
                        }
                        z12 = true;
                    } else {
                        z12 = z20;
                    }
                    if (x12 != x11) {
                        eVar2.L0(x12);
                        if (z18 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.b.BOTTOM).f());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((l) eVar2).F1();
                }
                i28++;
                f fVar4 = fVar;
                J1 = i22;
                i27 = 2;
            }
            int i29 = J1;
            int i30 = i27;
            int i31 = 0;
            while (i31 < i30) {
                int i32 = 0;
                while (i32 < size2) {
                    e eVar3 = (e) bVar.f16139a.get(i32);
                    if ((!(eVar3 instanceof i) || (eVar3 instanceof l)) && !(eVar3 instanceof h) && eVar3.V() != 8 && ((!z16 || !eVar3.f15687e.f16223e.f16175j || !eVar3.f15689f.f16223e.f16175j) && !(eVar3 instanceof l))) {
                        int W4 = eVar3.W();
                        int x13 = eVar3.x();
                        z11 = z16;
                        int p10 = eVar3.p();
                        int i33 = a.f16143l;
                        i21 = size2;
                        if (i31 == 1) {
                            i33 = a.f16144m;
                        }
                        boolean a11 = bVar.a(I1, eVar3, i33) | z19;
                        int W5 = eVar3.W();
                        int x14 = eVar3.x();
                        if (W5 != W4) {
                            eVar3.k1(W5);
                            if (z17 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.b.RIGHT).f());
                            }
                            a11 = true;
                        }
                        if (x14 != x13) {
                            eVar3.L0(x14);
                            if (z18 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.b.BOTTOM).f());
                            }
                            a11 = true;
                        }
                        z19 = (!eVar3.Z() || p10 == eVar3.p()) ? a11 : true;
                    } else {
                        z11 = z16;
                        i21 = size2;
                    }
                    i32++;
                    bVar = this;
                    z16 = z11;
                    size2 = i21;
                }
                boolean z21 = z16;
                int i34 = size2;
                if (!z19) {
                    break;
                }
                i31++;
                c(fVar, "intermediate pass", i31, W, x10);
                bVar = this;
                z16 = z21;
                size2 = i34;
                i30 = 2;
                z19 = false;
            }
            fVar2 = fVar;
            i20 = i29;
        } else {
            fVar2 = fVar;
            i20 = J1;
        }
        fVar2.W1(i20);
        return 0;
    }

    public void e(f fVar) {
        this.f16139a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) fVar.L0.get(i10);
            e.b A = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A == bVar || eVar.T() == bVar) {
                this.f16139a.add(eVar);
            }
        }
        fVar.M1();
    }
}
