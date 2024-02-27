package t;

import java.util.ArrayList;
import s.a;
import s.e;
import s.f;
import t.b;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f16188a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f16189b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f16190c = 0;

    private static boolean a(int i10, e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A = eVar.A();
        e.b T = eVar.T();
        f fVar = eVar.K() != null ? (f) eVar.K() : null;
        if (fVar != null) {
            e.b A2 = fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b T2 = fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = A == bVar5 || eVar.n0() || A == e.b.WRAP_CONTENT || (A == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f15723w == 0 && eVar.f15686d0 == 0.0f && eVar.a0(0)) || (A == bVar2 && eVar.f15723w == 1 && eVar.d0(0, eVar.W()));
        boolean z11 = T == bVar5 || eVar.o0() || T == e.b.WRAP_CONTENT || (T == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f15725x == 0 && eVar.f15686d0 == 0.0f && eVar.a0(1)) || (T == bVar && eVar.f15725x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.f15686d0 <= 0.0f || (!z10 && !z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.Q.f15664f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.O.f15664f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(int r16, s.e r17, t.b.C0215b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.g0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f16189b
            r4 = 1
            int r3 = r3 + r4
            f16189b = r3
            boolean r3 = r0 instanceof s.f
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.m0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = a(r3, r0)
            if (r5 == 0) goto L_0x002f
            t.b$a r5 = new t.b$a
            r5.<init>()
            int r6 = t.b.a.f16142k
            s.f.S1(r3, r0, r1, r5, r6)
        L_0x002f:
            s.d$b r3 = s.d.b.LEFT
            s.d r3 = r0.o(r3)
            s.d$b r5 = s.d.b.RIGHT
            s.d r5 = r0.o(r5)
            int r6 = r3.e()
            int r7 = r5.e()
            java.util.HashSet r8 = r3.d()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x012e
            boolean r8 = r3.n()
            if (r8 == 0) goto L_0x012e
            java.util.HashSet r3 = r3.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012e
            java.lang.Object r8 = r3.next()
            s.d r8 = (s.d) r8
            s.e r12 = r8.f15662d
            int r13 = r16 + 1
            boolean r14 = a(r13, r12)
            boolean r15 = r12.m0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            t.b$a r15 = new t.b$a
            r15.<init>()
            int r11 = t.b.a.f16142k
            s.f.S1(r13, r12, r1, r15, r11)
        L_0x0080:
            s.d r11 = r12.O
            if (r8 != r11) goto L_0x0090
            s.d r11 = r12.Q
            s.d r11 = r11.f15664f
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            s.d r11 = r12.Q
            if (r8 != r11) goto L_0x00a2
            s.d r11 = r12.O
            s.d r11 = r11.f15664f
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = r4
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            s.e$b r15 = r12.A()
            s.e$b r4 = s.e.b.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            s.e$b r8 = r12.A()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.A
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f15729z
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.V()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f15723w
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.v()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.i0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.l0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.i0()
            if (r4 != 0) goto L_0x00ec
            e(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.m0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            s.d r4 = r12.O
            if (r8 != r4) goto L_0x010a
            s.d r14 = r12.Q
            s.d r14 = r14.f15664f
            if (r14 != 0) goto L_0x010a
            int r4 = r4.f()
            int r4 = r4 + r6
            int r8 = r12.W()
            int r8 = r8 + r4
            r12.F0(r4, r8)
        L_0x0106:
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            s.d r14 = r12.Q
            if (r8 != r14) goto L_0x0122
            s.d r4 = r4.f15664f
            if (r4 != 0) goto L_0x0122
            int r4 = r14.f()
            int r4 = r6 - r4
            int r8 = r12.W()
            int r8 = r4 - r8
            r12.F0(r8, r4)
            goto L_0x0106
        L_0x0122:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.i0()
            if (r4 != 0) goto L_0x00ec
            d(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x012e:
            boolean r3 = r0 instanceof s.h
            if (r3 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r3 = r5.d()
            if (r3 == 0) goto L_0x021e
            boolean r3 = r5.n()
            if (r3 == 0) goto L_0x021e
            java.util.HashSet r3 = r5.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x0147:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021e
            java.lang.Object r4 = r3.next()
            s.d r4 = (s.d) r4
            s.e r5 = r4.f15662d
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = a(r8, r5)
            boolean r12 = r5.m0()
            if (r12 == 0) goto L_0x016e
            if (r11 == 0) goto L_0x016e
            t.b$a r12 = new t.b$a
            r12.<init>()
            int r13 = t.b.a.f16142k
            s.f.S1(r8, r5, r1, r12, r13)
        L_0x016e:
            s.d r12 = r5.O
            if (r4 != r12) goto L_0x017e
            s.d r12 = r5.Q
            s.d r12 = r12.f15664f
            if (r12 == 0) goto L_0x017e
            boolean r12 = r12.n()
            if (r12 != 0) goto L_0x018e
        L_0x017e:
            s.d r12 = r5.Q
            if (r4 != r12) goto L_0x0190
            s.d r12 = r5.O
            s.d r12 = r12.f15664f
            if (r12 == 0) goto L_0x0190
            boolean r12 = r12.n()
            if (r12 == 0) goto L_0x0190
        L_0x018e:
            r12 = r6
            goto L_0x0191
        L_0x0190:
            r12 = 0
        L_0x0191:
            s.e$b r13 = r5.A()
            s.e$b r14 = s.e.b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d5
            if (r11 == 0) goto L_0x019c
            goto L_0x01d5
        L_0x019c:
            s.e$b r4 = r5.A()
            if (r4 != r14) goto L_0x0147
            int r4 = r5.A
            if (r4 < 0) goto L_0x0147
            int r4 = r5.f15729z
            if (r4 < 0) goto L_0x0147
            int r4 = r5.V()
            if (r4 == r10) goto L_0x01bc
            int r4 = r5.f15723w
            if (r4 != 0) goto L_0x0147
            float r4 = r5.v()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bc:
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.l0()
            if (r4 != 0) goto L_0x0147
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x0147
            e(r8, r0, r1, r5, r2)
            goto L_0x0147
        L_0x01d5:
            boolean r11 = r5.m0()
            if (r11 == 0) goto L_0x01dd
            goto L_0x0147
        L_0x01dd:
            s.d r11 = r5.O
            if (r4 != r11) goto L_0x01f9
            s.d r13 = r5.Q
            s.d r13 = r13.f15664f
            if (r13 != 0) goto L_0x01f9
            int r4 = r11.f()
            int r4 = r4 + r7
            int r11 = r5.W()
            int r11 = r11 + r4
            r5.F0(r4, r11)
        L_0x01f4:
            b(r8, r5, r1, r2)
            goto L_0x0147
        L_0x01f9:
            s.d r13 = r5.Q
            if (r4 != r13) goto L_0x0211
            s.d r4 = r11.f15664f
            if (r4 != 0) goto L_0x0211
            int r4 = r13.f()
            int r4 = r7 - r4
            int r11 = r5.W()
            int r11 = r4 - r11
            r5.F0(r11, r4)
            goto L_0x01f4
        L_0x0211:
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.i0()
            if (r4 != 0) goto L_0x0147
            d(r8, r1, r5, r2)
            goto L_0x0147
        L_0x021e:
            r17.q0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h.b(int, s.e, t.b$b, boolean):void");
    }

    private static void c(int i10, a aVar, b.C0215b bVar, int i11, boolean z10) {
        if (aVar.t1()) {
            int i12 = i10 + 1;
            if (i11 == 0) {
                b(i12, aVar, bVar, z10);
            } else {
                i(i12, aVar, bVar);
            }
        }
    }

    private static void d(int i10, b.C0215b bVar, e eVar, boolean z10) {
        float y10 = eVar.y();
        int e10 = eVar.O.f15664f.e();
        int e11 = eVar.Q.f15664f.e();
        int f10 = eVar.O.f() + e10;
        int f11 = e11 - eVar.Q.f();
        if (e10 == e11) {
            y10 = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int W = eVar.W();
        int i11 = (e11 - e10) - W;
        if (e10 > e11) {
            i11 = (e10 - e11) - W;
        }
        int i12 = ((int) (i11 > 0 ? (y10 * ((float) i11)) + 0.5f : y10 * ((float) i11))) + e10;
        int i13 = i12 + W;
        if (e10 > e11) {
            i13 = i12 - W;
        }
        eVar.F0(i12, i13);
        b(i10 + 1, eVar, bVar, z10);
    }

    private static void e(int i10, e eVar, b.C0215b bVar, e eVar2, boolean z10) {
        float y10 = eVar2.y();
        int e10 = eVar2.O.f15664f.e() + eVar2.O.f();
        int e11 = eVar2.Q.f15664f.e() - eVar2.Q.f();
        if (e11 >= e10) {
            int W = eVar2.W();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f15723w;
                if (i11 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.K();
                    }
                    W = (int) (eVar2.y() * 0.5f * ((float) eVar.W()));
                } else if (i11 == 0) {
                    W = e11 - e10;
                }
                W = Math.max(eVar2.f15729z, W);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    W = Math.min(i12, W);
                }
            }
            int i13 = e10 + ((int) ((y10 * ((float) ((e11 - e10) - W))) + 0.5f));
            eVar2.F0(i13, W + i13);
            b(i10 + 1, eVar2, bVar, z10);
        }
    }

    private static void f(int i10, b.C0215b bVar, e eVar) {
        float R = eVar.R();
        int e10 = eVar.P.f15664f.e();
        int e11 = eVar.R.f15664f.e();
        int f10 = eVar.P.f() + e10;
        int f11 = e11 - eVar.R.f();
        if (e10 == e11) {
            R = 0.5f;
        } else {
            e10 = f10;
            e11 = f11;
        }
        int x10 = eVar.x();
        int i11 = (e11 - e10) - x10;
        if (e10 > e11) {
            i11 = (e10 - e11) - x10;
        }
        int i12 = (int) (i11 > 0 ? (R * ((float) i11)) + 0.5f : R * ((float) i11));
        int i13 = e10 + i12;
        int i14 = i13 + x10;
        if (e10 > e11) {
            i13 = e10 - i12;
            i14 = i13 - x10;
        }
        eVar.I0(i13, i14);
        i(i10 + 1, eVar, bVar);
    }

    private static void g(int i10, e eVar, b.C0215b bVar, e eVar2) {
        float R = eVar2.R();
        int e10 = eVar2.P.f15664f.e() + eVar2.P.f();
        int e11 = eVar2.R.f15664f.e() - eVar2.R.f();
        if (e11 >= e10) {
            int x10 = eVar2.x();
            if (eVar2.V() != 8) {
                int i11 = eVar2.f15725x;
                if (i11 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.K();
                    }
                    x10 = (int) (R * 0.5f * ((float) eVar.x()));
                } else if (i11 == 0) {
                    x10 = e11 - e10;
                }
                x10 = Math.max(eVar2.C, x10);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    x10 = Math.min(i12, x10);
                }
            }
            int i13 = e10 + ((int) ((R * ((float) ((e11 - e10) - x10))) + 0.5f));
            eVar2.I0(i13, x10 + i13);
            i(i10 + 1, eVar2, bVar);
        }
    }

    public static void h(f fVar, b.C0215b bVar) {
        int v12;
        int v13;
        e.b A = fVar.A();
        e.b T = fVar.T();
        f16189b = 0;
        f16190c = 0;
        fVar.v0();
        ArrayList r12 = fVar.r1();
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) r12.get(i10)).v0();
        }
        boolean P1 = fVar.P1();
        if (A == e.b.FIXED) {
            fVar.F0(0, fVar.W());
        } else {
            fVar.G0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) r12.get(i11);
            if (eVar instanceof s.h) {
                s.h hVar = (s.h) eVar;
                if (hVar.s1() == 1) {
                    if (hVar.t1() != -1) {
                        v13 = hVar.t1();
                    } else if (hVar.u1() == -1 || !fVar.n0()) {
                        if (fVar.n0()) {
                            v13 = (int) ((hVar.v1() * ((float) fVar.W())) + 0.5f);
                        }
                        z10 = true;
                    } else {
                        v13 = fVar.W() - hVar.u1();
                    }
                    hVar.w1(v13);
                    z10 = true;
                }
            } else if ((eVar instanceof a) && ((a) eVar).x1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = (e) r12.get(i12);
                if (eVar2 instanceof s.h) {
                    s.h hVar2 = (s.h) eVar2;
                    if (hVar2.s1() == 1) {
                        b(0, hVar2, bVar, P1);
                    }
                }
            }
        }
        b(0, fVar, bVar, P1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                e eVar3 = (e) r12.get(i13);
                if (eVar3 instanceof a) {
                    a aVar = (a) eVar3;
                    if (aVar.x1() == 0) {
                        c(0, aVar, bVar, 0, P1);
                    }
                }
            }
        }
        if (T == e.b.FIXED) {
            fVar.I0(0, fVar.x());
        } else {
            fVar.H0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = (e) r12.get(i14);
            if (eVar4 instanceof s.h) {
                s.h hVar3 = (s.h) eVar4;
                if (hVar3.s1() == 0) {
                    if (hVar3.t1() != -1) {
                        v12 = hVar3.t1();
                    } else if (hVar3.u1() == -1 || !fVar.o0()) {
                        if (fVar.o0()) {
                            v12 = (int) ((hVar3.v1() * ((float) fVar.x())) + 0.5f);
                        }
                        z12 = true;
                    } else {
                        v12 = fVar.x() - hVar3.u1();
                    }
                    hVar3.w1(v12);
                    z12 = true;
                }
            } else if ((eVar4 instanceof a) && ((a) eVar4).x1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar5 = (e) r12.get(i15);
                if (eVar5 instanceof s.h) {
                    s.h hVar4 = (s.h) eVar5;
                    if (hVar4.s1() == 0) {
                        i(1, hVar4, bVar);
                    }
                }
            }
        }
        i(0, fVar, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                e eVar6 = (e) r12.get(i16);
                if (eVar6 instanceof a) {
                    a aVar2 = (a) eVar6;
                    if (aVar2.x1() == 1) {
                        c(0, aVar2, bVar, 1, P1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            e eVar7 = (e) r12.get(i17);
            if (eVar7.m0() && a(0, eVar7)) {
                f.S1(0, eVar7, bVar, f16188a, b.a.f16142k);
                if (!(eVar7 instanceof s.h)) {
                    b(0, eVar7, bVar, P1);
                } else if (((s.h) eVar7).s1() != 0) {
                    b(0, eVar7, bVar, P1);
                }
                i(0, eVar7, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.R.f15664f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.P.f15664f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void i(int r16, s.e r17, t.b.C0215b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.p0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f16190c
            r3 = 1
            int r2 = r2 + r3
            f16190c = r2
            boolean r2 = r0 instanceof s.f
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.m0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = a(r2, r0)
            if (r4 == 0) goto L_0x002d
            t.b$a r4 = new t.b$a
            r4.<init>()
            int r5 = t.b.a.f16142k
            s.f.S1(r2, r0, r1, r4, r5)
        L_0x002d:
            s.d$b r2 = s.d.b.TOP
            s.d r2 = r0.o(r2)
            s.d$b r4 = s.d.b.BOTTOM
            s.d r4 = r0.o(r4)
            int r5 = r2.e()
            int r6 = r4.e()
            java.util.HashSet r7 = r2.d()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x012e
            boolean r7 = r2.n()
            if (r7 == 0) goto L_0x012e
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012e
            java.lang.Object r7 = r2.next()
            s.d r7 = (s.d) r7
            s.e r11 = r7.f15662d
            int r12 = r16 + 1
            boolean r13 = a(r12, r11)
            boolean r14 = r11.m0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            t.b$a r14 = new t.b$a
            r14.<init>()
            int r15 = t.b.a.f16142k
            s.f.S1(r12, r11, r1, r14, r15)
        L_0x007e:
            s.d r14 = r11.P
            if (r7 != r14) goto L_0x008e
            s.d r14 = r11.R
            s.d r14 = r14.f15664f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.n()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            s.d r14 = r11.R
            if (r7 != r14) goto L_0x00a0
            s.d r14 = r11.P
            s.d r14 = r14.f15664f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.n()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = r3
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            s.e$b r15 = r11.T()
            s.e$b r10 = s.e.b.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            s.e$b r7 = r11.T()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.V()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f15725x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.v()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.k0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.l0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.k0()
            if (r7 != 0) goto L_0x0058
            g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.m0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            s.d r10 = r11.P
            if (r7 != r10) goto L_0x0109
            s.d r13 = r11.R
            s.d r13 = r13.f15664f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.f()
            int r7 = r7 + r5
            int r10 = r11.x()
            int r10 = r10 + r7
            r11.I0(r7, r10)
        L_0x0104:
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            s.d r13 = r11.R
            if (r7 != r13) goto L_0x0121
            s.d r7 = r10.f15664f
            if (r7 != 0) goto L_0x0121
            int r7 = r13.f()
            int r7 = r5 - r7
            int r10 = r11.x()
            int r10 = r7 - r10
            r11.I0(r10, r7)
            goto L_0x0104
        L_0x0121:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.k0()
            if (r7 != 0) goto L_0x0058
            f(r12, r1, r11)
            goto L_0x0058
        L_0x012e:
            boolean r2 = r0 instanceof s.h
            if (r2 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r2 = r4.d()
            if (r2 == 0) goto L_0x021d
            boolean r2 = r4.n()
            if (r2 == 0) goto L_0x021d
            java.util.HashSet r2 = r4.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0147:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r2.next()
            s.d r4 = (s.d) r4
            s.e r5 = r4.f15662d
            int r7 = r16 + 1
            boolean r10 = a(r7, r5)
            boolean r11 = r5.m0()
            if (r11 == 0) goto L_0x016d
            if (r10 == 0) goto L_0x016d
            t.b$a r11 = new t.b$a
            r11.<init>()
            int r12 = t.b.a.f16142k
            s.f.S1(r7, r5, r1, r11, r12)
        L_0x016d:
            s.d r11 = r5.P
            if (r4 != r11) goto L_0x017d
            s.d r11 = r5.R
            s.d r11 = r11.f15664f
            if (r11 == 0) goto L_0x017d
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x018d
        L_0x017d:
            s.d r11 = r5.R
            if (r4 != r11) goto L_0x018f
            s.d r11 = r5.P
            s.d r11 = r11.f15664f
            if (r11 == 0) goto L_0x018f
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x018f
        L_0x018d:
            r11 = r3
            goto L_0x0190
        L_0x018f:
            r11 = 0
        L_0x0190:
            s.e$b r12 = r5.T()
            s.e$b r13 = s.e.b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d4
            if (r10 == 0) goto L_0x019b
            goto L_0x01d4
        L_0x019b:
            s.e$b r4 = r5.T()
            if (r4 != r13) goto L_0x0147
            int r4 = r5.D
            if (r4 < 0) goto L_0x0147
            int r4 = r5.C
            if (r4 < 0) goto L_0x0147
            int r4 = r5.V()
            if (r4 == r9) goto L_0x01bb
            int r4 = r5.f15725x
            if (r4 != 0) goto L_0x0147
            float r4 = r5.v()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bb:
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.l0()
            if (r4 != 0) goto L_0x0147
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x0147
            g(r7, r0, r1, r5)
            goto L_0x0147
        L_0x01d4:
            boolean r10 = r5.m0()
            if (r10 == 0) goto L_0x01dc
            goto L_0x0147
        L_0x01dc:
            s.d r10 = r5.P
            if (r4 != r10) goto L_0x01f8
            s.d r12 = r5.R
            s.d r12 = r12.f15664f
            if (r12 != 0) goto L_0x01f8
            int r4 = r10.f()
            int r4 = r4 + r6
            int r10 = r5.x()
            int r10 = r10 + r4
            r5.I0(r4, r10)
        L_0x01f3:
            i(r7, r5, r1)
            goto L_0x0147
        L_0x01f8:
            s.d r12 = r5.R
            if (r4 != r12) goto L_0x0210
            s.d r4 = r10.f15664f
            if (r4 != 0) goto L_0x0210
            int r4 = r12.f()
            int r4 = r6 - r4
            int r10 = r5.x()
            int r10 = r4 - r10
            r5.I0(r10, r4)
            goto L_0x01f3
        L_0x0210:
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.k0()
            if (r4 != 0) goto L_0x0147
            f(r7, r1, r5)
            goto L_0x0147
        L_0x021d:
            s.d$b r2 = s.d.b.BASELINE
            s.d r2 = r0.o(r2)
            java.util.HashSet r4 = r2.d()
            if (r4 == 0) goto L_0x0282
            boolean r4 = r2.n()
            if (r4 == 0) goto L_0x0282
            int r4 = r2.e()
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x023b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0282
            java.lang.Object r5 = r2.next()
            s.d r5 = (s.d) r5
            s.e r6 = r5.f15662d
            int r7 = r16 + 1
            boolean r8 = a(r7, r6)
            boolean r9 = r6.m0()
            if (r9 == 0) goto L_0x0261
            if (r8 == 0) goto L_0x0261
            t.b$a r9 = new t.b$a
            r9.<init>()
            int r10 = t.b.a.f16142k
            s.f.S1(r7, r6, r1, r9, r10)
        L_0x0261:
            s.e$b r9 = r6.T()
            s.e$b r10 = s.e.b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x026b
            if (r8 == 0) goto L_0x023b
        L_0x026b:
            boolean r8 = r6.m0()
            if (r8 == 0) goto L_0x0272
            goto L_0x023b
        L_0x0272:
            s.d r8 = r6.S
            if (r5 != r8) goto L_0x023b
            int r5 = r5.f()
            int r5 = r5 + r4
            r6.E0(r5)
            i(r7, r6, r1)
            goto L_0x023b
        L_0x0282:
            r17.r0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h.i(int, s.e, t.b$b):void");
    }
}
