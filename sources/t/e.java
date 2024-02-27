package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.e;
import s.f;
import s.h;
import s.j;
import t.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private f f16157a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16158b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16159c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f16160d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f16161e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f16162f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private b.C0215b f16163g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f16164h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList f16165i = new ArrayList();

    public e(f fVar) {
        this.f16157a = fVar;
        this.f16160d = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: t.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: t.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(t.f r9, int r10, int r11, t.f r12, java.util.ArrayList r13, t.m r14) {
        /*
            r8 = this;
            t.p r9 = r9.f16169d
            t.m r0 = r9.f16221c
            if (r0 != 0) goto L_0x0107
            s.f r0 = r8.f16157a
            t.l r1 = r0.f15687e
            if (r9 == r1) goto L_0x0107
            t.n r0 = r0.f15689f
            if (r9 != r0) goto L_0x0012
            goto L_0x0107
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            t.m r14 = new t.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f16221c = r14
            r14.a(r9)
            t.f r11 = r9.f16226h
            java.util.List r11 = r11.f16176k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            t.d r0 = (t.d) r0
            boolean r1 = r0 instanceof t.f
            if (r1 == 0) goto L_0x0029
            r1 = r0
            t.f r1 = (t.f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            t.f r11 = r9.f16227i
            java.util.List r11 = r11.f16176k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            t.d r0 = (t.d) r0
            boolean r1 = r0 instanceof t.f
            if (r1 == 0) goto L_0x004e
            r1 = r0
            t.f r1 = (t.f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof t.n
            if (r0 == 0) goto L_0x009a
            r0 = r9
            t.n r0 = (t.n) r0
            t.f r0 = r0.f16201k
            java.util.List r0 = r0.f16176k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            t.d r0 = (t.d) r0
            boolean r1 = r0 instanceof t.f
            if (r1 == 0) goto L_0x007d
            r1 = r0
            t.f r1 = (t.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            t.f r0 = r9.f16226h
            java.util.List r0 = r0.f16177l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            t.f r1 = (t.f) r1
            if (r1 != r12) goto L_0x00b3
            r14.f16195b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            t.f r0 = r9.f16227i
            java.util.List r0 = r0.f16177l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            t.f r1 = (t.f) r1
            if (r1 != r12) goto L_0x00d6
            r14.f16195b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0107
            boolean r11 = r9 instanceof t.n
            if (r11 == 0) goto L_0x0107
            t.n r9 = (t.n) r9
            t.f r9 = r9.f16201k
            java.util.List r9 = r9.f16177l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r9.next()
            r1 = r11
            t.f r1 = (t.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00f0
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.a(t.f, int, int, t.f, java.util.ArrayList, t.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e5, code lost:
        r4 = r0.Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f15725x == 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(s.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0259
            java.lang.Object r2 = r1.next()
            s.e r2 = (s.e) r2
            s.e$b[] r4 = r2.Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.V()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f15679a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f15723w = r7
        L_0x0036:
            float r6 = r2.E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f15725x = r7
        L_0x0042:
            float r6 = r2.v()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0077
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            s.e$b r9 = s.e.b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            s.e$b r9 = s.e.b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f15723w = r8
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            s.e$b r9 = s.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            s.e$b r9 = s.e.b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f15725x = r8
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f15723w
            if (r6 != 0) goto L_0x0072
            r2.f15723w = r8
        L_0x0072:
            int r6 = r2.f15725x
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r9 = r2.f15723w
            if (r9 != r10) goto L_0x008d
            s.d r9 = r2.O
            s.d r9 = r9.f15664f
            if (r9 == 0) goto L_0x008b
            s.d r9 = r2.Q
            s.d r9 = r9.f15664f
            if (r9 != 0) goto L_0x008d
        L_0x008b:
            s.e$b r5 = s.e.b.WRAP_CONTENT
        L_0x008d:
            r9 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f15725x
            if (r5 != r10) goto L_0x00a2
            s.d r5 = r2.P
            s.d r5 = r5.f15664f
            if (r5 == 0) goto L_0x00a0
            s.d r5 = r2.R
            s.d r5 = r5.f15664f
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            s.e$b r4 = s.e.b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            t.l r4 = r2.f15687e
            r4.f16222d = r9
            int r5 = r2.f15723w
            r4.f16219a = r5
            t.n r4 = r2.f15689f
            r4.f16222d = r12
            int r13 = r2.f15725x
            r4.f16219a = r13
            s.e$b r4 = s.e.b.MATCH_PARENT
            if (r9 == r4) goto L_0x00bf
            s.e$b r14 = s.e.b.FIXED
            if (r9 == r14) goto L_0x00bf
            s.e$b r14 = s.e.b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x021e
            s.e$b r14 = s.e.b.FIXED
            if (r12 == r14) goto L_0x021e
            s.e$b r14 = s.e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x021e
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0159
            s.e$b r15 = s.e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            s.e$b r11 = s.e.b.FIXED
            if (r12 != r11) goto L_0x0159
        L_0x00d7:
            if (r5 != r8) goto L_0x0110
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.x()
            float r3 = (float) r9
            float r4 = r2.f15686d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00ef:
            s.e$b r8 = s.e.b.FIXED
        L_0x00f1:
            r4 = r16
            r5 = r2
            r6 = r8
        L_0x00f5:
            r4.l(r5, r6, r7, r8, r9)
            t.l r3 = r2.f15687e
            t.g r3 = r3.f16223e
            int r4 = r2.W()
            r3.d(r4)
            t.n r3 = r2.f15689f
            t.g r3 = r3.f16223e
            int r4 = r2.x()
            r3.d(r4)
            goto L_0x0024
        L_0x0110:
            if (r5 != r10) goto L_0x0128
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            t.l r3 = r2.f15687e
            t.g r3 = r3.f16223e
            int r2 = r2.W()
        L_0x0124:
            r3.f16187m = r2
            goto L_0x0008
        L_0x0128:
            if (r5 != r7) goto L_0x0148
            s.e$b[] r11 = r0.Z
            r11 = r11[r3]
            s.e$b r15 = s.e.b.FIXED
            if (r11 == r15) goto L_0x0134
            if (r11 != r4) goto L_0x0159
        L_0x0134:
            float r3 = r2.B
            int r4 = r17.W()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.x()
        L_0x0142:
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0146:
            r8 = r12
            goto L_0x00f5
        L_0x0148:
            s.d[] r11 = r2.W
            r7 = r11[r3]
            s.d r7 = r7.f15664f
            if (r7 == 0) goto L_0x0156
            r7 = r11[r10]
            s.d r7 = r7.f15664f
            if (r7 != 0) goto L_0x0159
        L_0x0156:
            r7 = 0
            r9 = 0
            goto L_0x0142
        L_0x0159:
            if (r12 != r6) goto L_0x01d7
            s.e$b r11 = s.e.b.WRAP_CONTENT
            if (r9 == r11) goto L_0x0163
            s.e$b r7 = s.e.b.FIXED
            if (r9 != r7) goto L_0x01d7
        L_0x0163:
            if (r13 != r8) goto L_0x0188
            if (r9 != r11) goto L_0x0171
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x0171:
            int r7 = r2.W()
            float r3 = r2.f15686d0
            int r4 = r2.w()
            r5 = -1
            if (r4 != r5) goto L_0x0182
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0182:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00ef
        L_0x0188:
            if (r13 != r10) goto L_0x019e
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
        L_0x0195:
            t.n r3 = r2.f15689f
            t.g r3 = r3.f16223e
            int r2 = r2.x()
            goto L_0x0124
        L_0x019e:
            r7 = 2
            if (r13 != r7) goto L_0x01c0
            s.e$b[] r7 = r0.Z
            r7 = r7[r10]
            s.e$b r8 = s.e.b.FIXED
            if (r7 == r8) goto L_0x01ab
            if (r7 != r4) goto L_0x01d7
        L_0x01ab:
            float r3 = r2.E
            int r7 = r2.W()
            int r4 = r17.x()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            goto L_0x00f5
        L_0x01c0:
            s.d[] r4 = r2.W
            r7 = 2
            r15 = r4[r7]
            s.d r7 = r15.f15664f
            if (r7 == 0) goto L_0x01cf
            r4 = r4[r8]
            s.d r4 = r4.f15664f
            if (r4 != 0) goto L_0x01d7
        L_0x01cf:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0146
        L_0x01d7:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x0207
            if (r13 != r10) goto L_0x01e0
            goto L_0x0207
        L_0x01e0:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            s.e$b[] r4 = r0.Z
            r3 = r4[r3]
            s.e$b r8 = s.e.b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.B
            float r4 = r2.E
            int r5 = r17.W()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.x()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f1
        L_0x0207:
            s.e$b r8 = s.e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            t.l r3 = r2.f15687e
            t.g r3 = r3.f16223e
            int r4 = r2.W()
            r3.f16187m = r4
            goto L_0x0195
        L_0x021e:
            int r3 = r2.W()
            if (r9 != r4) goto L_0x0237
            int r3 = r17.W()
            s.d r5 = r2.O
            int r5 = r5.f15665g
            int r3 = r3 - r5
            s.d r5 = r2.Q
            int r5 = r5.f15665g
            int r3 = r3 - r5
            s.e$b r5 = s.e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0239
        L_0x0237:
            r7 = r3
            r6 = r9
        L_0x0239:
            int r3 = r2.x()
            if (r12 != r4) goto L_0x0252
            int r3 = r17.x()
            s.d r4 = r2.P
            int r4 = r4.f15665g
            int r3 = r3 - r4
            s.d r4 = r2.R
            int r4 = r4.f15665g
            int r3 = r3 - r4
            s.e$b r4 = s.e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0254
        L_0x0252:
            r9 = r3
            r8 = r12
        L_0x0254:
            r4 = r16
            r5 = r2
            goto L_0x00f5
        L_0x0259:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.b(s.f):boolean");
    }

    private int e(f fVar, int i10) {
        int size = this.f16165i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, ((m) this.f16165i.get(i11)).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f16226h.f16176k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f16227i, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f16226h, i10, 0, pVar.f16227i, arrayList, (m) null);
            }
        }
        for (d dVar2 : pVar.f16227i.f16176k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f16226h, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f16227i, i10, 1, pVar.f16226h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((n) pVar).f16201k.f16176k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    private void l(s.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f16164h;
        aVar.f16145a = bVar;
        aVar.f16146b = bVar2;
        aVar.f16147c = i10;
        aVar.f16148d = i11;
        this.f16163g.b(eVar, aVar);
        eVar.k1(this.f16164h.f16149e);
        eVar.L0(this.f16164h.f16150f);
        eVar.K0(this.f16164h.f16152h);
        eVar.A0(this.f16164h.f16151g);
    }

    public void c() {
        d(this.f16161e);
        this.f16165i.clear();
        m.f16193h = 0;
        i(this.f16157a.f15687e, 0, this.f16165i);
        i(this.f16157a.f15689f, 1, this.f16165i);
        this.f16158b = false;
    }

    public void d(ArrayList arrayList) {
        Object kVar;
        arrayList.clear();
        this.f16160d.f15687e.f();
        this.f16160d.f15689f.f();
        arrayList.add(this.f16160d.f15687e);
        arrayList.add(this.f16160d.f15689f);
        Iterator it = this.f16160d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.e eVar = (s.e) it.next();
            if (eVar instanceof h) {
                kVar = new j(eVar);
            } else {
                if (eVar.i0()) {
                    if (eVar.f15683c == null) {
                        eVar.f15683c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f15683c);
                } else {
                    arrayList.add(eVar.f15687e);
                }
                if (eVar.k0()) {
                    if (eVar.f15685d == null) {
                        eVar.f15685d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f15685d);
                } else {
                    arrayList.add(eVar.f15689f);
                }
                if (eVar instanceof j) {
                    kVar = new k(eVar);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f16220b != this.f16160d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f16158b || this.f16159c) {
            Iterator it = this.f16157a.L0.iterator();
            while (it.hasNext()) {
                s.e eVar = (s.e) it.next();
                eVar.n();
                eVar.f15679a = false;
                eVar.f15687e.r();
                eVar.f15689f.q();
            }
            this.f16157a.n();
            f fVar = this.f16157a;
            fVar.f15679a = false;
            fVar.f15687e.r();
            this.f16157a.f15689f.q();
            this.f16159c = false;
        }
        if (b(this.f16160d)) {
            return false;
        }
        this.f16157a.m1(0);
        this.f16157a.n1(0);
        e.b u10 = this.f16157a.u(0);
        e.b u11 = this.f16157a.u(1);
        if (this.f16158b) {
            c();
        }
        int X = this.f16157a.X();
        int Y = this.f16157a.Y();
        this.f16157a.f15687e.f16226h.d(X);
        this.f16157a.f15689f.f16226h.d(Y);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u10 == bVar || u11 == bVar) {
            if (z13) {
                Iterator it2 = this.f16161e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((p) it2.next()).m()) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z13 && u10 == e.b.WRAP_CONTENT) {
                this.f16157a.P0(e.b.FIXED);
                f fVar2 = this.f16157a;
                fVar2.k1(e(fVar2, 0));
                f fVar3 = this.f16157a;
                fVar3.f15687e.f16223e.d(fVar3.W());
            }
            if (z13 && u11 == e.b.WRAP_CONTENT) {
                this.f16157a.g1(e.b.FIXED);
                f fVar4 = this.f16157a;
                fVar4.L0(e(fVar4, 1));
                f fVar5 = this.f16157a;
                fVar5.f15689f.f16223e.d(fVar5.x());
            }
        }
        f fVar6 = this.f16157a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W = fVar6.W() + X;
            this.f16157a.f15687e.f16227i.d(W);
            this.f16157a.f15687e.f16223e.d(W - X);
            m();
            f fVar7 = this.f16157a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x10 = fVar7.x() + Y;
                this.f16157a.f15689f.f16227i.d(x10);
                this.f16157a.f15689f.f16223e.d(x10 - Y);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator it3 = this.f16161e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f16220b != this.f16157a || pVar.f16225g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f16161e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            p pVar2 = (p) it4.next();
            if ((z11 || pVar2.f16220b != this.f16157a) && (!pVar2.f16226h.f16175j || ((!pVar2.f16227i.f16175j && !(pVar2 instanceof j)) || (!pVar2.f16223e.f16175j && !(pVar2 instanceof c) && !(pVar2 instanceof j))))) {
                z12 = false;
            }
        }
        z12 = false;
        this.f16157a.P0(u10);
        this.f16157a.g1(u11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f16158b) {
            Iterator it = this.f16157a.L0.iterator();
            while (it.hasNext()) {
                s.e eVar = (s.e) it.next();
                eVar.n();
                eVar.f15679a = false;
                l lVar = eVar.f15687e;
                lVar.f16223e.f16175j = false;
                lVar.f16225g = false;
                lVar.r();
                n nVar = eVar.f15689f;
                nVar.f16223e.f16175j = false;
                nVar.f16225g = false;
                nVar.q();
            }
            this.f16157a.n();
            f fVar = this.f16157a;
            fVar.f15679a = false;
            l lVar2 = fVar.f15687e;
            lVar2.f16223e.f16175j = false;
            lVar2.f16225g = false;
            lVar2.r();
            n nVar2 = this.f16157a.f15689f;
            nVar2.f16223e.f16175j = false;
            nVar2.f16225g = false;
            nVar2.q();
            c();
        }
        if (b(this.f16160d)) {
            return false;
        }
        this.f16157a.m1(0);
        this.f16157a.n1(0);
        this.f16157a.f15687e.f16226h.d(0);
        this.f16157a.f15689f.f16226h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013c A[EDGE_INSN: B:78:0x013c->B:64:0x013c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            s.f r1 = r9.f16157a
            r2 = 0
            s.e$b r1 = r1.u(r2)
            s.f r3 = r9.f16157a
            s.e$b r3 = r3.u(r0)
            s.f r4 = r9.f16157a
            int r4 = r4.X()
            s.f r5 = r9.f16157a
            int r5 = r5.Y()
            if (r10 == 0) goto L_0x0087
            s.e$b r6 = s.e.b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0087
        L_0x0023:
            java.util.ArrayList r6 = r9.f16161e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            t.p r7 = (t.p) r7
            int r8 = r7.f16224f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0087
            s.e$b r10 = s.e.b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0087
            s.f r10 = r9.f16157a
            s.e$b r6 = s.e.b.FIXED
            r10.P0(r6)
            s.f r10 = r9.f16157a
            int r6 = r9.e(r10, r2)
            r10.k1(r6)
            s.f r10 = r9.f16157a
            t.l r6 = r10.f15687e
            t.g r6 = r6.f16223e
            int r10 = r10.W()
        L_0x0062:
            r6.d(r10)
            goto L_0x0087
        L_0x0066:
            if (r10 == 0) goto L_0x0087
            s.e$b r10 = s.e.b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0087
            s.f r10 = r9.f16157a
            s.e$b r6 = s.e.b.FIXED
            r10.g1(r6)
            s.f r10 = r9.f16157a
            int r6 = r9.e(r10, r0)
            r10.L0(r6)
            s.f r10 = r9.f16157a
            t.n r6 = r10.f15689f
            t.g r6 = r6.f16223e
            int r10 = r10.x()
            goto L_0x0062
        L_0x0087:
            s.f r10 = r9.f16157a
            if (r11 != 0) goto L_0x00b1
            s.e$b[] r5 = r10.Z
            r5 = r5[r2]
            s.e$b r6 = s.e.b.FIXED
            if (r5 == r6) goto L_0x0097
            s.e$b r6 = s.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00be
        L_0x0097:
            int r10 = r10.W()
            int r10 = r10 + r4
            s.f r5 = r9.f16157a
            t.l r5 = r5.f15687e
            t.f r5 = r5.f16227i
            r5.d(r10)
            s.f r5 = r9.f16157a
            t.l r5 = r5.f15687e
            t.g r5 = r5.f16223e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00af:
            r10 = r0
            goto L_0x00d9
        L_0x00b1:
            s.e$b[] r4 = r10.Z
            r4 = r4[r0]
            s.e$b r6 = s.e.b.FIXED
            if (r4 == r6) goto L_0x00c0
            s.e$b r6 = s.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r10 = r2
            goto L_0x00d9
        L_0x00c0:
            int r10 = r10.x()
            int r10 = r10 + r5
            s.f r4 = r9.f16157a
            t.n r4 = r4.f15689f
            t.f r4 = r4.f16227i
            r4.d(r10)
            s.f r4 = r9.f16157a
            t.n r4 = r4.f15689f
            t.g r4 = r4.f16223e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00af
        L_0x00d9:
            r9.m()
            java.util.ArrayList r4 = r9.f16161e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0102
            java.lang.Object r5 = r4.next()
            t.p r5 = (t.p) r5
            int r6 = r5.f16224f
            if (r6 == r11) goto L_0x00f3
            goto L_0x00e2
        L_0x00f3:
            s.e r6 = r5.f16220b
            s.f r7 = r9.f16157a
            if (r6 != r7) goto L_0x00fe
            boolean r6 = r5.f16225g
            if (r6 != 0) goto L_0x00fe
            goto L_0x00e2
        L_0x00fe:
            r5.e()
            goto L_0x00e2
        L_0x0102:
            java.util.ArrayList r4 = r9.f16161e
            java.util.Iterator r4 = r4.iterator()
        L_0x0108:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013c
            java.lang.Object r5 = r4.next()
            t.p r5 = (t.p) r5
            int r6 = r5.f16224f
            if (r6 == r11) goto L_0x0119
            goto L_0x0108
        L_0x0119:
            if (r10 != 0) goto L_0x0122
            s.e r6 = r5.f16220b
            s.f r7 = r9.f16157a
            if (r6 != r7) goto L_0x0122
            goto L_0x0108
        L_0x0122:
            t.f r6 = r5.f16226h
            boolean r6 = r6.f16175j
            if (r6 != 0) goto L_0x012a
        L_0x0128:
            r0 = r2
            goto L_0x013c
        L_0x012a:
            t.f r6 = r5.f16227i
            boolean r6 = r6.f16175j
            if (r6 != 0) goto L_0x0131
            goto L_0x0128
        L_0x0131:
            boolean r6 = r5 instanceof t.c
            if (r6 != 0) goto L_0x0108
            t.g r5 = r5.f16223e
            boolean r5 = r5.f16175j
            if (r5 != 0) goto L_0x0108
            goto L_0x0128
        L_0x013c:
            s.f r10 = r9.f16157a
            r10.P0(r1)
            s.f r10 = r9.f16157a
            r10.g1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.h(boolean, int):boolean");
    }

    public void j() {
        this.f16158b = true;
    }

    public void k() {
        this.f16159c = true;
    }

    public void m() {
        g gVar;
        g gVar2;
        int W;
        g gVar3;
        int W2;
        Iterator it = this.f16157a.L0.iterator();
        while (it.hasNext()) {
            s.e eVar = (s.e) it.next();
            if (!eVar.f15679a) {
                e.b[] bVarArr = eVar.Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = eVar.f15723w;
                int i11 = eVar.f15725x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar4 = eVar.f15687e.f16223e;
                boolean z12 = gVar4.f16175j;
                g gVar5 = eVar.f15689f.f16223e;
                boolean z13 = gVar5.f16175j;
                if (!z12 || !z13) {
                    if (!z12 || !z10) {
                        if (z13 && z11) {
                            l(eVar, bVar3, gVar4.f16172g, e.b.FIXED, gVar5.f16172g);
                            if (bVar == e.b.MATCH_CONSTRAINT) {
                                gVar3 = eVar.f15687e.f16223e;
                                W2 = eVar.W();
                            } else {
                                gVar2 = eVar.f15687e.f16223e;
                                W = eVar.W();
                                gVar2.d(W);
                            }
                        }
                        if (eVar.f15679a && (gVar = eVar.f15689f.f16202l) != null) {
                            gVar.d(eVar.p());
                        }
                    } else {
                        l(eVar, e.b.FIXED, gVar4.f16172g, bVar3, gVar5.f16172g);
                        if (bVar2 == e.b.MATCH_CONSTRAINT) {
                            gVar3 = eVar.f15689f.f16223e;
                            W2 = eVar.x();
                        } else {
                            gVar2 = eVar.f15689f.f16223e;
                            W = eVar.x();
                            gVar2.d(W);
                        }
                    }
                    gVar3.f16187m = W2;
                    gVar.d(eVar.p());
                } else {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar4.f16172g, bVar4, gVar5.f16172g);
                }
                eVar.f15679a = true;
                gVar.d(eVar.p());
            }
        }
    }

    public void n(b.C0215b bVar) {
        this.f16163g = bVar;
    }
}
