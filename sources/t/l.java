package t;

import java.util.List;
import s.d;
import s.e;
import s.i;
import t.f;
import t.p;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f16191k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16192a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                t.p$b[] r0 = t.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16192a = r0
                t.p$b r1 = t.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16192a     // Catch:{ NoSuchFieldError -> 0x001d }
                t.p$b r1 = t.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16192a     // Catch:{ NoSuchFieldError -> 0x0028 }
                t.p$b r1 = t.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f16226h.f16170e = f.a.LEFT;
        this.f16227i.f16170e = f.a.RIGHT;
        this.f16224f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029a, code lost:
        if (r14 != 1) goto L_0x02ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(t.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = t.l.a.f16192a
            t.p$b r1 = r8.f16228j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            s.e r0 = r8.f16220b
            s.d r1 = r0.O
            s.d r0 = r0.Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            t.g r0 = r8.f16223e
            boolean r0 = r0.f16175j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02ea
            s.e$b r0 = r8.f16222d
            s.e$b r3 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02ea
            s.e r0 = r8.f16220b
            int r3 = r0.f15723w
            if (r3 == r1) goto L_0x02d0
            if (r3 == r2) goto L_0x0046
            goto L_0x02ea
        L_0x0046:
            int r1 = r0.f15725x
            r3 = -1
            if (r1 == 0) goto L_0x0081
            if (r1 != r2) goto L_0x004e
            goto L_0x0081
        L_0x004e:
            int r0 = r0.w()
            if (r0 == r3) goto L_0x005a
            if (r0 == 0) goto L_0x006b
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x007a
        L_0x005a:
            s.e r0 = r8.f16220b
            t.n r1 = r0.f15689f
            t.g r1 = r1.f16223e
            int r1 = r1.f16172g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 * r0
        L_0x0068:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x007a
        L_0x006b:
            s.e r0 = r8.f16220b
            t.n r1 = r0.f15689f
            t.g r1 = r1.f16223e
            int r1 = r1.f16172g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 / r0
            goto L_0x0068
        L_0x007a:
            t.g r1 = r8.f16223e
            r1.d(r0)
            goto L_0x02ea
        L_0x0081:
            t.n r1 = r0.f15689f
            t.f r12 = r1.f16226h
            t.f r13 = r1.f16227i
            s.d r1 = r0.O
            s.d r1 = r1.f15664f
            if (r1 == 0) goto L_0x008f
            r1 = r9
            goto L_0x0090
        L_0x008f:
            r1 = r10
        L_0x0090:
            s.d r2 = r0.P
            s.d r2 = r2.f15664f
            if (r2 == 0) goto L_0x0098
            r2 = r9
            goto L_0x0099
        L_0x0098:
            r2 = r10
        L_0x0099:
            s.d r4 = r0.Q
            s.d r4 = r4.f15664f
            if (r4 == 0) goto L_0x00a1
            r4 = r9
            goto L_0x00a2
        L_0x00a1:
            r4 = r10
        L_0x00a2:
            s.d r5 = r0.R
            s.d r5 = r5.f15664f
            if (r5 == 0) goto L_0x00aa
            r5 = r9
            goto L_0x00ab
        L_0x00aa:
            r5 = r10
        L_0x00ab:
            int r14 = r0.w()
            if (r1 == 0) goto L_0x01f2
            if (r2 == 0) goto L_0x01f2
            if (r4 == 0) goto L_0x01f2
            if (r5 == 0) goto L_0x01f2
            s.e r0 = r8.f16220b
            float r15 = r0.v()
            boolean r0 = r12.f16175j
            if (r0 == 0) goto L_0x0120
            boolean r0 = r13.f16175j
            if (r0 == 0) goto L_0x0120
            t.f r0 = r8.f16226h
            boolean r1 = r0.f16168c
            if (r1 == 0) goto L_0x011f
            t.f r1 = r8.f16227i
            boolean r1 = r1.f16168c
            if (r1 != 0) goto L_0x00d2
            goto L_0x011f
        L_0x00d2:
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            t.f r1 = r8.f16226h
            int r1 = r1.f16171f
            int r2 = r0 + r1
            t.f r0 = r8.f16227i
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            t.f r1 = r8.f16227i
            int r1 = r1.f16171f
            int r3 = r0 - r1
            int r0 = r12.f16172g
            int r1 = r12.f16171f
            int r4 = r0 + r1
            int r0 = r13.f16172g
            int r1 = r13.f16171f
            int r5 = r0 - r1
            int[] r1 = f16191k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t.g r0 = r8.f16223e
            int[] r1 = f16191k
            r1 = r1[r10]
            r0.d(r1)
            s.e r0 = r8.f16220b
            t.n r0 = r0.f15689f
            t.g r0 = r0.f16223e
            int[] r1 = f16191k
            r1 = r1[r9]
            r0.d(r1)
        L_0x011f:
            return
        L_0x0120:
            t.f r0 = r8.f16226h
            boolean r1 = r0.f16175j
            if (r1 == 0) goto L_0x017d
            t.f r1 = r8.f16227i
            boolean r2 = r1.f16175j
            if (r2 == 0) goto L_0x017d
            boolean r2 = r12.f16168c
            if (r2 == 0) goto L_0x017c
            boolean r2 = r13.f16168c
            if (r2 != 0) goto L_0x0135
            goto L_0x017c
        L_0x0135:
            int r2 = r0.f16172g
            int r0 = r0.f16171f
            int r2 = r2 + r0
            int r0 = r1.f16172g
            int r1 = r1.f16171f
            int r3 = r0 - r1
            java.util.List r0 = r12.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            int r1 = r12.f16171f
            int r4 = r0 + r1
            java.util.List r0 = r13.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            int r1 = r13.f16171f
            int r5 = r0 - r1
            int[] r1 = f16191k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t.g r0 = r8.f16223e
            int[] r1 = f16191k
            r1 = r1[r10]
            r0.d(r1)
            s.e r0 = r8.f16220b
            t.n r0 = r0.f15689f
            t.g r0 = r0.f16223e
            int[] r1 = f16191k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x017d
        L_0x017c:
            return
        L_0x017d:
            t.f r0 = r8.f16226h
            boolean r1 = r0.f16168c
            if (r1 == 0) goto L_0x01f1
            t.f r1 = r8.f16227i
            boolean r1 = r1.f16168c
            if (r1 == 0) goto L_0x01f1
            boolean r1 = r12.f16168c
            if (r1 == 0) goto L_0x01f1
            boolean r1 = r13.f16168c
            if (r1 != 0) goto L_0x0192
            goto L_0x01f1
        L_0x0192:
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            t.f r1 = r8.f16226h
            int r1 = r1.f16171f
            int r2 = r0 + r1
            t.f r0 = r8.f16227i
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            t.f r1 = r8.f16227i
            int r1 = r1.f16171f
            int r3 = r0 - r1
            java.util.List r0 = r12.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            int r1 = r12.f16171f
            int r4 = r0 + r1
            java.util.List r0 = r13.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            int r0 = r0.f16172g
            int r1 = r13.f16171f
            int r5 = r0 - r1
            int[] r1 = f16191k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            t.g r0 = r8.f16223e
            int[] r1 = f16191k
            r1 = r1[r10]
            r0.d(r1)
            s.e r0 = r8.f16220b
            t.n r0 = r0.f15689f
            t.g r0 = r0.f16223e
            int[] r1 = f16191k
            r1 = r1[r9]
        L_0x01ec:
            r0.d(r1)
            goto L_0x02ea
        L_0x01f1:
            return
        L_0x01f2:
            if (r1 == 0) goto L_0x0269
            if (r4 == 0) goto L_0x0269
            t.f r0 = r8.f16226h
            boolean r0 = r0.f16168c
            if (r0 == 0) goto L_0x0268
            t.f r0 = r8.f16227i
            boolean r0 = r0.f16168c
            if (r0 != 0) goto L_0x0203
            goto L_0x0268
        L_0x0203:
            s.e r0 = r8.f16220b
            float r0 = r0.v()
            t.f r1 = r8.f16226h
            java.util.List r1 = r1.f16177l
            java.lang.Object r1 = r1.get(r10)
            t.f r1 = (t.f) r1
            int r1 = r1.f16172g
            t.f r2 = r8.f16226h
            int r2 = r2.f16171f
            int r1 = r1 + r2
            t.f r2 = r8.f16227i
            java.util.List r2 = r2.f16177l
            java.lang.Object r2 = r2.get(r10)
            t.f r2 = (t.f) r2
            int r2 = r2.f16172g
            t.f r4 = r8.f16227i
            int r4 = r4.f16171f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0256
            if (r14 == 0) goto L_0x0256
            if (r14 == r9) goto L_0x0233
            goto L_0x02ea
        L_0x0233:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0246
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x0244:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0246:
            t.g r0 = r8.f16223e
            r0.d(r1)
            s.e r0 = r8.f16220b
            t.n r0 = r0.f15689f
            t.g r0 = r0.f16223e
            r0.d(r3)
            goto L_0x02ea
        L_0x0256:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0246
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x0244
        L_0x0268:
            return
        L_0x0269:
            if (r2 == 0) goto L_0x02ea
            if (r5 == 0) goto L_0x02ea
            boolean r0 = r12.f16168c
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r13.f16168c
            if (r0 != 0) goto L_0x0276
            goto L_0x02cf
        L_0x0276:
            s.e r0 = r8.f16220b
            float r0 = r0.v()
            java.util.List r1 = r12.f16177l
            java.lang.Object r1 = r1.get(r10)
            t.f r1 = (t.f) r1
            int r1 = r1.f16172g
            int r2 = r12.f16171f
            int r1 = r1 + r2
            java.util.List r2 = r13.f16177l
            java.lang.Object r2 = r2.get(r10)
            t.f r2 = (t.f) r2
            int r2 = r2.f16172g
            int r4 = r13.f16171f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02bd
            if (r14 == 0) goto L_0x029d
            if (r14 == r9) goto L_0x02bd
            goto L_0x02ea
        L_0x029d:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02b0
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x02ae:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02b0:
            t.g r0 = r8.f16223e
            r0.d(r3)
            s.e r0 = r8.f16220b
            t.n r0 = r0.f15689f
            t.g r0 = r0.f16223e
            goto L_0x01ec
        L_0x02bd:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02b0
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x02ae
        L_0x02cf:
            return
        L_0x02d0:
            s.e r0 = r0.K()
            if (r0 == 0) goto L_0x02ea
            t.l r0 = r0.f15687e
            t.g r0 = r0.f16223e
            boolean r1 = r0.f16175j
            if (r1 == 0) goto L_0x02ea
            s.e r1 = r8.f16220b
            float r1 = r1.B
            int r0 = r0.f16172g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x007a
        L_0x02ea:
            t.f r0 = r8.f16226h
            boolean r1 = r0.f16168c
            if (r1 == 0) goto L_0x040a
            t.f r1 = r8.f16227i
            boolean r2 = r1.f16168c
            if (r2 != 0) goto L_0x02f8
            goto L_0x040a
        L_0x02f8:
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0307
            boolean r0 = r1.f16175j
            if (r0 == 0) goto L_0x0307
            t.g r0 = r8.f16223e
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0307
            return
        L_0x0307:
            t.g r0 = r8.f16223e
            boolean r0 = r0.f16175j
            if (r0 != 0) goto L_0x0351
            s.e$b r0 = r8.f16222d
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0351
            s.e r0 = r8.f16220b
            int r1 = r0.f15723w
            if (r1 != 0) goto L_0x0351
            boolean r0 = r0.i0()
            if (r0 != 0) goto L_0x0351
            t.f r0 = r8.f16226h
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            t.f r1 = r8.f16227i
            java.util.List r1 = r1.f16177l
            java.lang.Object r1 = r1.get(r10)
            t.f r1 = (t.f) r1
            int r0 = r0.f16172g
            t.f r2 = r8.f16226h
            int r3 = r2.f16171f
            int r0 = r0 + r3
            int r1 = r1.f16172g
            t.f r3 = r8.f16227i
            int r3 = r3.f16171f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            t.f r0 = r8.f16227i
            r0.d(r1)
            t.g r0 = r8.f16223e
            r0.d(r3)
            return
        L_0x0351:
            t.g r0 = r8.f16223e
            boolean r0 = r0.f16175j
            if (r0 != 0) goto L_0x03b5
            s.e$b r0 = r8.f16222d
            s.e$b r1 = s.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03b5
            int r0 = r8.f16219a
            if (r0 != r9) goto L_0x03b5
            t.f r0 = r8.f16226h
            java.util.List r0 = r0.f16177l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b5
            t.f r0 = r8.f16227i
            java.util.List r0 = r0.f16177l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03b5
            t.f r0 = r8.f16226h
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            t.f r1 = r8.f16227i
            java.util.List r1 = r1.f16177l
            java.lang.Object r1 = r1.get(r10)
            t.f r1 = (t.f) r1
            int r0 = r0.f16172g
            t.f r2 = r8.f16226h
            int r2 = r2.f16171f
            int r0 = r0 + r2
            int r1 = r1.f16172g
            t.f r2 = r8.f16227i
            int r2 = r2.f16171f
            int r1 = r1 + r2
            int r1 = r1 - r0
            t.g r0 = r8.f16223e
            int r0 = r0.f16187m
            int r0 = java.lang.Math.min(r1, r0)
            s.e r1 = r8.f16220b
            int r2 = r1.A
            int r1 = r1.f15729z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03b0
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03b0:
            t.g r1 = r8.f16223e
            r1.d(r0)
        L_0x03b5:
            t.g r0 = r8.f16223e
            boolean r0 = r0.f16175j
            if (r0 != 0) goto L_0x03bc
            return
        L_0x03bc:
            t.f r0 = r8.f16226h
            java.util.List r0 = r0.f16177l
            java.lang.Object r0 = r0.get(r10)
            t.f r0 = (t.f) r0
            t.f r1 = r8.f16227i
            java.util.List r1 = r1.f16177l
            java.lang.Object r1 = r1.get(r10)
            t.f r1 = (t.f) r1
            int r2 = r0.f16172g
            t.f r3 = r8.f16226h
            int r3 = r3.f16171f
            int r2 = r2 + r3
            int r3 = r1.f16172g
            t.f r4 = r8.f16227i
            int r4 = r4.f16171f
            int r3 = r3 + r4
            s.e r4 = r8.f16220b
            float r4 = r4.y()
            if (r0 != r1) goto L_0x03eb
            int r2 = r0.f16172g
            int r3 = r1.f16172g
            r4 = r11
        L_0x03eb:
            int r3 = r3 - r2
            t.g r0 = r8.f16223e
            int r0 = r0.f16172g
            int r3 = r3 - r0
            t.f r0 = r8.f16226h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            t.f r0 = r8.f16227i
            t.f r1 = r8.f16226h
            int r1 = r1.f16172g
            t.g r2 = r8.f16223e
            int r2 = r2.f16172g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x040a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.l.a(t.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i10;
        f fVar;
        f fVar2;
        f fVar3;
        d dVar;
        List list;
        Object obj;
        f fVar4;
        int i11;
        f fVar5;
        f fVar6;
        int i12;
        f fVar7;
        f fVar8;
        e K;
        e K2;
        e eVar = this.f16220b;
        if (eVar.f15679a) {
            this.f16223e.d(eVar.W());
        }
        if (!this.f16223e.f16175j) {
            e.b A = this.f16220b.A();
            this.f16222d = A;
            if (A != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (A == bVar && (K2 = this.f16220b.K()) != null && (K2.A() == e.b.FIXED || K2.A() == bVar)) {
                    int W = (K2.W() - this.f16220b.O.f()) - this.f16220b.Q.f();
                    b(this.f16226h, K2.f15687e.f16226h, this.f16220b.O.f());
                    b(this.f16227i, K2.f15687e.f16227i, -this.f16220b.Q.f());
                    this.f16223e.d(W);
                    return;
                } else if (this.f16222d == e.b.FIXED) {
                    this.f16223e.d(this.f16220b.W());
                }
            }
        } else {
            e.b bVar2 = this.f16222d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (K = this.f16220b.K()) != null && (K.A() == e.b.FIXED || K.A() == bVar3)) {
                b(this.f16226h, K.f15687e.f16226h, this.f16220b.O.f());
                b(this.f16227i, K.f15687e.f16227i, -this.f16220b.Q.f());
                return;
            }
        }
        g gVar = this.f16223e;
        if (gVar.f16175j) {
            e eVar2 = this.f16220b;
            if (eVar2.f15679a) {
                d[] dVarArr = eVar2.W;
                d dVar2 = dVarArr[0];
                d dVar3 = dVar2.f15664f;
                if (dVar3 == null || dVarArr[1].f15664f == null) {
                    if (dVar3 != null) {
                        fVar8 = h(dVar2);
                        if (fVar8 != null) {
                            fVar7 = this.f16226h;
                            i12 = this.f16220b.W[0].f();
                        } else {
                            return;
                        }
                    } else {
                        d dVar4 = dVarArr[1];
                        if (dVar4.f15664f != null) {
                            f h10 = h(dVar4);
                            if (h10 != null) {
                                b(this.f16227i, h10, -this.f16220b.W[1].f());
                                fVar6 = this.f16226h;
                                fVar5 = this.f16227i;
                                i11 = -this.f16223e.f16172g;
                                b(fVar6, fVar5, i11);
                                return;
                            }
                            return;
                        } else if (!(eVar2 instanceof i) && eVar2.K() != null && this.f16220b.o(d.b.CENTER).f15664f == null) {
                            fVar8 = this.f16220b.K().f15687e.f16226h;
                            fVar7 = this.f16226h;
                            i12 = this.f16220b.X();
                        } else {
                            return;
                        }
                    }
                    b(fVar7, fVar8, i12);
                    fVar6 = this.f16227i;
                    fVar5 = this.f16226h;
                    i11 = this.f16223e.f16172g;
                    b(fVar6, fVar5, i11);
                    return;
                } else if (eVar2.i0()) {
                    this.f16226h.f16171f = this.f16220b.W[0].f();
                    fVar3 = this.f16227i;
                    dVar = this.f16220b.W[1];
                    fVar3.f16171f = -dVar.f();
                } else {
                    f h11 = h(this.f16220b.W[0]);
                    if (h11 != null) {
                        b(this.f16226h, h11, this.f16220b.W[0].f());
                    }
                    f h12 = h(this.f16220b.W[1]);
                    if (h12 != null) {
                        b(this.f16227i, h12, -this.f16220b.W[1].f());
                    }
                    this.f16226h.f16167b = true;
                    this.f16227i.f16167b = true;
                    return;
                }
            }
        }
        if (this.f16222d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f16220b;
            int i13 = eVar3.f15723w;
            if (i13 == 2) {
                e K3 = eVar3.K();
                if (K3 != null) {
                    g gVar2 = K3.f15689f.f16223e;
                    this.f16223e.f16177l.add(gVar2);
                    gVar2.f16176k.add(this.f16223e);
                    g gVar3 = this.f16223e;
                    gVar3.f16167b = true;
                    gVar3.f16176k.add(this.f16226h);
                    list = this.f16223e.f16176k;
                    obj = this.f16227i;
                }
            } else if (i13 == 3) {
                if (eVar3.f15725x == 3) {
                    this.f16226h.f16166a = this;
                    this.f16227i.f16166a = this;
                    n nVar = eVar3.f15689f;
                    nVar.f16226h.f16166a = this;
                    nVar.f16227i.f16166a = this;
                    gVar.f16166a = this;
                    if (eVar3.k0()) {
                        this.f16223e.f16177l.add(this.f16220b.f15689f.f16223e);
                        this.f16220b.f15689f.f16223e.f16176k.add(this.f16223e);
                        n nVar2 = this.f16220b.f15689f;
                        nVar2.f16223e.f16166a = this;
                        this.f16223e.f16177l.add(nVar2.f16226h);
                        this.f16223e.f16177l.add(this.f16220b.f15689f.f16227i);
                        this.f16220b.f15689f.f16226h.f16176k.add(this.f16223e);
                        list = this.f16220b.f15689f.f16227i.f16176k;
                    } else if (this.f16220b.i0()) {
                        this.f16220b.f15689f.f16223e.f16177l.add(this.f16223e);
                        list = this.f16223e.f16176k;
                        obj = this.f16220b.f15689f.f16223e;
                    } else {
                        fVar4 = this.f16220b.f15689f.f16223e;
                        list = fVar4.f16177l;
                    }
                } else {
                    g gVar4 = eVar3.f15689f.f16223e;
                    gVar.f16177l.add(gVar4);
                    gVar4.f16176k.add(this.f16223e);
                    this.f16220b.f15689f.f16226h.f16176k.add(this.f16223e);
                    this.f16220b.f15689f.f16227i.f16176k.add(this.f16223e);
                    g gVar5 = this.f16223e;
                    gVar5.f16167b = true;
                    gVar5.f16176k.add(this.f16226h);
                    this.f16223e.f16176k.add(this.f16227i);
                    this.f16226h.f16177l.add(this.f16223e);
                    fVar4 = this.f16227i;
                    list = fVar4.f16177l;
                }
                obj = this.f16223e;
            }
            list.add(obj);
        }
        e eVar4 = this.f16220b;
        d[] dVarArr2 = eVar4.W;
        d dVar5 = dVarArr2[0];
        d dVar6 = dVar5.f15664f;
        if (dVar6 == null || dVarArr2[1].f15664f == null) {
            if (dVar6 != null) {
                fVar2 = h(dVar5);
                if (fVar2 != null) {
                    fVar = this.f16226h;
                    i10 = this.f16220b.W[0].f();
                } else {
                    return;
                }
            } else {
                d dVar7 = dVarArr2[1];
                if (dVar7.f15664f != null) {
                    f h13 = h(dVar7);
                    if (h13 != null) {
                        b(this.f16227i, h13, -this.f16220b.W[1].f());
                        c(this.f16226h, this.f16227i, -1, this.f16223e);
                        return;
                    }
                    return;
                } else if (!(eVar4 instanceof i) && eVar4.K() != null) {
                    fVar2 = this.f16220b.K().f15687e.f16226h;
                    fVar = this.f16226h;
                    i10 = this.f16220b.X();
                } else {
                    return;
                }
            }
            b(fVar, fVar2, i10);
            c(this.f16227i, this.f16226h, 1, this.f16223e);
        } else if (eVar4.i0()) {
            this.f16226h.f16171f = this.f16220b.W[0].f();
            fVar3 = this.f16227i;
            dVar = this.f16220b.W[1];
            fVar3.f16171f = -dVar.f();
        } else {
            f h14 = h(this.f16220b.W[0]);
            f h15 = h(this.f16220b.W[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f16228j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f16226h;
        if (fVar.f16175j) {
            this.f16220b.m1(fVar.f16172g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16221c = null;
        this.f16226h.c();
        this.f16227i.c();
        this.f16223e.c();
        this.f16225g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f16222d != e.b.MATCH_CONSTRAINT || this.f16220b.f15723w == 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f16225g = false;
        this.f16226h.c();
        this.f16226h.f16175j = false;
        this.f16227i.c();
        this.f16227i.f16175j = false;
        this.f16223e.f16175j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f16220b.t();
    }
}
