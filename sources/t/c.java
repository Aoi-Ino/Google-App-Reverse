package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.e;
import s.f;

public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList f16155k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private int f16156l;

    public c(e eVar, int i10) {
        super(eVar);
        this.f16224f = i10;
        q();
    }

    private void q() {
        e eVar;
        e eVar2 = this.f16220b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.L(this.f16224f);
        } while (eVar2 != null);
        this.f16220b = eVar;
        this.f16155k.add(eVar.N(this.f16224f));
        e J = eVar.J(this.f16224f);
        while (J != null) {
            this.f16155k.add(J.N(this.f16224f));
            J = J.J(this.f16224f);
        }
        Iterator it = this.f16155k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i10 = this.f16224f;
            if (i10 == 0) {
                pVar.f16220b.f15683c = this;
            } else if (i10 == 1) {
                pVar.f16220b.f15685d = this;
            }
        }
        if (this.f16224f == 0 && ((f) this.f16220b.K()).P1() && this.f16155k.size() > 1) {
            ArrayList arrayList = this.f16155k;
            this.f16220b = ((p) arrayList.get(arrayList.size() - 1)).f16220b;
        }
        this.f16156l = this.f16224f == 0 ? this.f16220b.z() : this.f16220b.S();
    }

    private e r() {
        for (int i10 = 0; i10 < this.f16155k.size(); i10++) {
            p pVar = (p) this.f16155k.get(i10);
            if (pVar.f16220b.V() != 8) {
                return pVar.f16220b;
            }
        }
        return null;
    }

    private e s() {
        for (int size = this.f16155k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f16155k.get(size);
            if (pVar.f16220b.V() != 8) {
                return pVar.f16220b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(t.d r27) {
        /*
            r26 = this;
            r0 = r26
            t.f r1 = r0.f16226h
            boolean r1 = r1.f16175j
            if (r1 == 0) goto L_0x03f2
            t.f r1 = r0.f16227i
            boolean r1 = r1.f16175j
            if (r1 != 0) goto L_0x0010
            goto L_0x03f2
        L_0x0010:
            s.e r1 = r0.f16220b
            s.e r1 = r1.K()
            boolean r2 = r1 instanceof s.f
            if (r2 == 0) goto L_0x0021
            s.f r1 = (s.f) r1
            boolean r1 = r1.P1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            t.f r2 = r0.f16227i
            int r2 = r2.f16172g
            t.f r4 = r0.f16226h
            int r4 = r4.f16172g
            int r2 = r2 - r4
            java.util.ArrayList r4 = r0.f16155k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList r8 = r0.f16155k
            java.lang.Object r8 = r8.get(r5)
            t.p r8 = (t.p) r8
            s.e r8 = r8.f16220b
            int r8 = r8.V()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList r10 = r0.f16155k
            java.lang.Object r10 = r10.get(r9)
            t.p r10 = (t.p) r10
            s.e r10 = r10.f16220b
            int r10 = r10.V()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList r3 = r0.f16155k
            java.lang.Object r3 = r3.get(r13)
            t.p r3 = (t.p) r3
            s.e r11 = r3.f16220b
            int r11 = r11.V()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            t.f r11 = r3.f16226h
            int r11 = r11.f16171f
            int r14 = r14 + r11
        L_0x008e:
            t.g r11 = r3.f16223e
            int r7 = r11.f16172g
            s.e$b r10 = r3.f16222d
            s.e$b r12 = s.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f16224f
            if (r11 != 0) goto L_0x00ac
            s.e r12 = r3.f16220b
            t.l r12 = r12.f15687e
            t.g r12 = r12.f16223e
            boolean r12 = r12.f16175j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            s.e r11 = r3.f16220b
            t.n r11 = r11.f15689f
            t.g r11 = r11.f16223e
            boolean r11 = r11.f16175j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f16219a
            if (r7 != r12) goto L_0x00cc
            if (r9 != 0) goto L_0x00cc
            int r7 = r11.f16187m
            int r15 = r15 + 1
        L_0x00ca:
            r10 = 1
            goto L_0x00d5
        L_0x00cc:
            boolean r7 = r11.f16175j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
            goto L_0x00ca
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            s.e r7 = r3.f16220b
            float[] r7 = r7.D0
            int r10 = r0.f16224f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            t.f r3 = r3.f16227i
            int r3 = r3.f16171f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            t.f r7 = r0.f16226h
            int r7 = r7.f16172g
            if (r1 == 0) goto L_0x0118
            t.f r7 = r0.f16227i
            int r7 = r7.f16172g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x0129
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0128
            int r7 = r7 + r10
            goto L_0x0129
        L_0x0128:
            int r7 = r7 - r10
        L_0x0129:
            if (r15 <= 0) goto L_0x021d
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0135:
            if (r12 >= r4) goto L_0x01d1
            java.util.ArrayList r9 = r0.f16155k
            java.lang.Object r9 = r9.get(r12)
            t.p r9 = (t.p) r9
            r19 = r11
            s.e r11 = r9.f16220b
            int r11 = r11.V()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0157
        L_0x014d:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
            goto L_0x01bf
        L_0x0157:
            s.e$b r11 = r9.f16222d
            s.e$b r14 = s.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x014d
            t.g r11 = r9.f16223e
            boolean r14 = r11.f16175j
            if (r14 != 0) goto L_0x014d
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x017a
            s.e r14 = r9.f16220b
            float[] r14 = r14.D0
            r21 = r7
            int r7 = r0.f16224f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017e
        L_0x017a:
            r21 = r7
            r7 = r19
        L_0x017e:
            int r14 = r0.f16224f
            if (r14 != 0) goto L_0x018d
            s.e r14 = r9.f16220b
            r22 = r10
            int r10 = r14.A
            int r14 = r14.f15729z
            r23 = r1
            goto L_0x019c
        L_0x018d:
            r22 = r10
            s.e r10 = r9.f16220b
            int r14 = r10.D
            int r10 = r10.C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019c:
            int r1 = r9.f16219a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01aa
            int r1 = r11.f16187m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01ab
        L_0x01aa:
            r1 = r7
        L_0x01ab:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b5
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b5:
            if (r1 == r7) goto L_0x01ba
            int r13 = r13 + 1
            r7 = r1
        L_0x01ba:
            t.g r1 = r9.f16223e
            r1.d(r7)
        L_0x01bf:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0135
        L_0x01d1:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x020e
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01de:
            if (r1 >= r4) goto L_0x0210
            java.util.ArrayList r3 = r0.f16155k
            java.lang.Object r3 = r3.get(r1)
            t.p r3 = (t.p) r3
            s.e r7 = r3.f16220b
            int r7 = r7.V()
            r9 = 8
            if (r7 != r9) goto L_0x01f3
            goto L_0x020b
        L_0x01f3:
            if (r1 <= 0) goto L_0x01fc
            if (r1 < r5) goto L_0x01fc
            t.f r7 = r3.f16226h
            int r7 = r7.f16171f
            int r14 = r14 + r7
        L_0x01fc:
            t.g r7 = r3.f16223e
            int r7 = r7.f16172g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x020b
            if (r1 >= r6) goto L_0x020b
            t.f r3 = r3.f16227i
            int r3 = r3.f16171f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x020b:
            int r1 = r1 + 1
            goto L_0x01de
        L_0x020e:
            r14 = r20
        L_0x0210:
            int r1 = r0.f16156l
            r3 = 2
            if (r1 != r3) goto L_0x021b
            if (r13 != 0) goto L_0x021b
            r1 = 0
            r0.f16156l = r1
            goto L_0x0227
        L_0x021b:
            r1 = 0
            goto L_0x0227
        L_0x021d:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0227:
            if (r14 <= r2) goto L_0x022b
            r0.f16156l = r3
        L_0x022b:
            if (r24 <= 0) goto L_0x0233
            if (r15 != 0) goto L_0x0233
            if (r5 != r6) goto L_0x0233
            r0.f16156l = r3
        L_0x0233:
            int r3 = r0.f16156l
            r7 = 1
            r9 = r24
            if (r3 != r7) goto L_0x02c9
            if (r9 <= r7) goto L_0x0241
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0248
        L_0x0241:
            if (r9 != r7) goto L_0x0247
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0248
        L_0x0247:
            r2 = r1
        L_0x0248:
            if (r15 <= 0) goto L_0x024b
            r2 = r1
        L_0x024b:
            r3 = r1
            r7 = r21
        L_0x024e:
            if (r3 >= r4) goto L_0x03f2
            if (r23 == 0) goto L_0x0257
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0258
        L_0x0257:
            r1 = r3
        L_0x0258:
            java.util.ArrayList r9 = r0.f16155k
            java.lang.Object r1 = r9.get(r1)
            t.p r1 = (t.p) r1
            s.e r9 = r1.f16220b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x0275
            t.f r9 = r1.f16226h
            r9.d(r7)
            t.f r1 = r1.f16227i
            r1.d(r7)
            goto L_0x02c6
        L_0x0275:
            if (r3 <= 0) goto L_0x027c
            if (r23 == 0) goto L_0x027b
            int r7 = r7 - r2
            goto L_0x027c
        L_0x027b:
            int r7 = r7 + r2
        L_0x027c:
            if (r3 <= 0) goto L_0x0289
            if (r3 < r5) goto L_0x0289
            t.f r9 = r1.f16226h
            int r9 = r9.f16171f
            if (r23 == 0) goto L_0x0288
            int r7 = r7 - r9
            goto L_0x0289
        L_0x0288:
            int r7 = r7 + r9
        L_0x0289:
            if (r23 == 0) goto L_0x0291
            t.f r9 = r1.f16227i
        L_0x028d:
            r9.d(r7)
            goto L_0x0294
        L_0x0291:
            t.f r9 = r1.f16226h
            goto L_0x028d
        L_0x0294:
            t.g r9 = r1.f16223e
            int r10 = r9.f16172g
            s.e$b r11 = r1.f16222d
            s.e$b r12 = s.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02a5
            int r11 = r1.f16219a
            r12 = 1
            if (r11 != r12) goto L_0x02a5
            int r10 = r9.f16187m
        L_0x02a5:
            if (r23 == 0) goto L_0x02a9
            int r7 = r7 - r10
            goto L_0x02aa
        L_0x02a9:
            int r7 = r7 + r10
        L_0x02aa:
            if (r23 == 0) goto L_0x02b3
            t.f r9 = r1.f16226h
        L_0x02ae:
            r9.d(r7)
            r9 = 1
            goto L_0x02b6
        L_0x02b3:
            t.f r9 = r1.f16227i
            goto L_0x02ae
        L_0x02b6:
            r1.f16225g = r9
            if (r3 >= r8) goto L_0x02c6
            if (r3 >= r6) goto L_0x02c6
            t.f r1 = r1.f16227i
            int r1 = r1.f16171f
            int r1 = -r1
            if (r23 == 0) goto L_0x02c5
            int r7 = r7 - r1
            goto L_0x02c6
        L_0x02c5:
            int r7 = r7 + r1
        L_0x02c6:
            int r3 = r3 + 1
            goto L_0x024e
        L_0x02c9:
            if (r3 != 0) goto L_0x0350
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02d3
            r2 = r1
        L_0x02d3:
            r3 = r1
            r7 = r21
        L_0x02d6:
            if (r3 >= r4) goto L_0x03f2
            if (r23 == 0) goto L_0x02df
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02e0
        L_0x02df:
            r1 = r3
        L_0x02e0:
            java.util.ArrayList r9 = r0.f16155k
            java.lang.Object r1 = r9.get(r1)
            t.p r1 = (t.p) r1
            s.e r9 = r1.f16220b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x02fd
            t.f r9 = r1.f16226h
            r9.d(r7)
            t.f r1 = r1.f16227i
            r1.d(r7)
            goto L_0x034d
        L_0x02fd:
            if (r23 == 0) goto L_0x0301
            int r7 = r7 - r2
            goto L_0x0302
        L_0x0301:
            int r7 = r7 + r2
        L_0x0302:
            if (r3 <= 0) goto L_0x030f
            if (r3 < r5) goto L_0x030f
            t.f r9 = r1.f16226h
            int r9 = r9.f16171f
            if (r23 == 0) goto L_0x030e
            int r7 = r7 - r9
            goto L_0x030f
        L_0x030e:
            int r7 = r7 + r9
        L_0x030f:
            if (r23 == 0) goto L_0x0317
            t.f r9 = r1.f16227i
        L_0x0313:
            r9.d(r7)
            goto L_0x031a
        L_0x0317:
            t.f r9 = r1.f16226h
            goto L_0x0313
        L_0x031a:
            t.g r9 = r1.f16223e
            int r10 = r9.f16172g
            s.e$b r11 = r1.f16222d
            s.e$b r12 = s.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x032f
            int r11 = r1.f16219a
            r12 = 1
            if (r11 != r12) goto L_0x032f
            int r9 = r9.f16187m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x032f:
            if (r23 == 0) goto L_0x0333
            int r7 = r7 - r10
            goto L_0x0334
        L_0x0333:
            int r7 = r7 + r10
        L_0x0334:
            if (r23 == 0) goto L_0x033c
            t.f r9 = r1.f16226h
        L_0x0338:
            r9.d(r7)
            goto L_0x033f
        L_0x033c:
            t.f r9 = r1.f16227i
            goto L_0x0338
        L_0x033f:
            if (r3 >= r8) goto L_0x034d
            if (r3 >= r6) goto L_0x034d
            t.f r1 = r1.f16227i
            int r1 = r1.f16171f
            int r1 = -r1
            if (r23 == 0) goto L_0x034c
            int r7 = r7 - r1
            goto L_0x034d
        L_0x034c:
            int r7 = r7 + r1
        L_0x034d:
            int r3 = r3 + 1
            goto L_0x02d6
        L_0x0350:
            r7 = 2
            if (r3 != r7) goto L_0x03f2
            int r3 = r0.f16224f
            if (r3 != 0) goto L_0x035e
            s.e r3 = r0.f16220b
            float r3 = r3.y()
            goto L_0x0364
        L_0x035e:
            s.e r3 = r0.f16220b
            float r3 = r3.R()
        L_0x0364:
            if (r23 == 0) goto L_0x036a
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x036a:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0375
            if (r15 <= 0) goto L_0x0376
        L_0x0375:
            r2 = r1
        L_0x0376:
            if (r23 == 0) goto L_0x037b
            int r7 = r21 - r2
            goto L_0x037d
        L_0x037b:
            int r7 = r21 + r2
        L_0x037d:
            r3 = r1
        L_0x037e:
            if (r3 >= r4) goto L_0x03f2
            if (r23 == 0) goto L_0x0387
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0388
        L_0x0387:
            r1 = r3
        L_0x0388:
            java.util.ArrayList r2 = r0.f16155k
            java.lang.Object r1 = r2.get(r1)
            t.p r1 = (t.p) r1
            s.e r2 = r1.f16220b
            int r2 = r2.V()
            r9 = 8
            if (r2 != r9) goto L_0x03a6
            t.f r2 = r1.f16226h
            r2.d(r7)
            t.f r1 = r1.f16227i
            r1.d(r7)
            r12 = 1
            goto L_0x03ef
        L_0x03a6:
            if (r3 <= 0) goto L_0x03b3
            if (r3 < r5) goto L_0x03b3
            t.f r2 = r1.f16226h
            int r2 = r2.f16171f
            if (r23 == 0) goto L_0x03b2
            int r7 = r7 - r2
            goto L_0x03b3
        L_0x03b2:
            int r7 = r7 + r2
        L_0x03b3:
            if (r23 == 0) goto L_0x03bb
            t.f r2 = r1.f16227i
        L_0x03b7:
            r2.d(r7)
            goto L_0x03be
        L_0x03bb:
            t.f r2 = r1.f16226h
            goto L_0x03b7
        L_0x03be:
            t.g r2 = r1.f16223e
            int r10 = r2.f16172g
            s.e$b r11 = r1.f16222d
            s.e$b r12 = s.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03d0
            int r11 = r1.f16219a
            r12 = 1
            if (r11 != r12) goto L_0x03d1
            int r10 = r2.f16187m
            goto L_0x03d1
        L_0x03d0:
            r12 = 1
        L_0x03d1:
            if (r23 == 0) goto L_0x03d5
            int r7 = r7 - r10
            goto L_0x03d6
        L_0x03d5:
            int r7 = r7 + r10
        L_0x03d6:
            if (r23 == 0) goto L_0x03de
            t.f r2 = r1.f16226h
        L_0x03da:
            r2.d(r7)
            goto L_0x03e1
        L_0x03de:
            t.f r2 = r1.f16227i
            goto L_0x03da
        L_0x03e1:
            if (r3 >= r8) goto L_0x03ef
            if (r3 >= r6) goto L_0x03ef
            t.f r1 = r1.f16227i
            int r1 = r1.f16171f
            int r1 = -r1
            if (r23 == 0) goto L_0x03ee
            int r7 = r7 - r1
            goto L_0x03ef
        L_0x03ee:
            int r7 = r7 + r1
        L_0x03ef:
            int r3 = r3 + 1
            goto L_0x037e
        L_0x03f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.a(t.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f16155k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            t.p r1 = (t.p) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList r0 = r5.f16155k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList r2 = r5.f16155k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            t.p r2 = (t.p) r2
            s.e r2 = r2.f16220b
            java.util.ArrayList r4 = r5.f16155k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            t.p r0 = (t.p) r0
            s.e r0 = r0.f16220b
            int r4 = r5.f16224f
            if (r4 != 0) goto L_0x0070
            s.d r1 = r2.O
            s.d r0 = r0.Q
            t.f r2 = r5.i(r1, r3)
            int r1 = r1.f()
            s.e r4 = r5.r()
            if (r4 == 0) goto L_0x0052
            s.d r1 = r4.O
            int r1 = r1.f()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            t.f r4 = r5.f16226h
            r5.b(r4, r2, r1)
        L_0x0059:
            t.f r1 = r5.i(r0, r3)
            int r0 = r0.f()
            s.e r2 = r5.s()
            if (r2 == 0) goto L_0x006d
            s.d r0 = r2.Q
            int r0 = r0.f()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            s.d r2 = r2.P
            s.d r0 = r0.R
            t.f r3 = r5.i(r2, r1)
            int r2 = r2.f()
            s.e r4 = r5.r()
            if (r4 == 0) goto L_0x0088
            s.d r2 = r4.P
            int r2 = r2.f()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            t.f r4 = r5.f16226h
            r5.b(r4, r3, r2)
        L_0x008f:
            t.f r1 = r5.i(r0, r1)
            int r0 = r0.f()
            s.e r2 = r5.s()
            if (r2 == 0) goto L_0x00a3
            s.d r0 = r2.R
            int r0 = r0.f()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            t.f r2 = r5.f16227i
            int r0 = -r0
            r5.b(r2, r1, r0)
        L_0x00ab:
            t.f r0 = r5.f16226h
            r0.f16166a = r5
            t.f r0 = r5.f16227i
            r0.f16166a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.d():void");
    }

    public void e() {
        for (int i10 = 0; i10 < this.f16155k.size(); i10++) {
            ((p) this.f16155k.get(i10)).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16221c = null;
        Iterator it = this.f16155k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    public long j() {
        int size = this.f16155k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.f16155k.get(i10);
            j10 = j10 + ((long) pVar.f16226h.f16171f) + pVar.j() + ((long) pVar.f16227i.f16171f);
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f16155k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f16155k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f16224f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f16155k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append((p) it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
