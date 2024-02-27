package s;

import java.util.ArrayList;
import p.d;

public abstract class b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: p.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: p.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: p.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: p.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: p.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [p.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r7 == 2) goto L_0x0033;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x039e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(s.f r37, p.d r38, int r39, int r40, s.c r41) {
        /*
            r0 = r37
            r9 = r38
            r10 = r39
            r1 = r41
            s.e r11 = r1.f15637a
            s.e r12 = r1.f15639c
            s.e r13 = r1.f15638b
            s.e r14 = r1.f15640d
            s.e r2 = r1.f15641e
            float r3 = r1.f15647k
            s.e$b[] r4 = r0.Z
            r4 = r4[r10]
            s.e$b r5 = s.e.b.WRAP_CONTENT
            r15 = 1
            if (r4 != r5) goto L_0x001f
            r4 = r15
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x003d
            int r7 = r2.f15730z0
            if (r7 != 0) goto L_0x0029
            r8 = r15
            goto L_0x002a
        L_0x0029:
            r8 = 0
        L_0x002a:
            if (r7 != r15) goto L_0x002f
            r16 = r15
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r7 != r5) goto L_0x0035
        L_0x0033:
            r5 = r15
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r17 = r16
            r7 = 0
            r16 = r8
            r8 = r11
            goto L_0x004e
        L_0x003d:
            int r7 = r2.A0
            if (r7 != 0) goto L_0x0043
            r8 = r15
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            if (r7 != r15) goto L_0x0049
            r16 = r15
            goto L_0x004b
        L_0x0049:
            r16 = 0
        L_0x004b:
            if (r7 != r5) goto L_0x0035
            goto L_0x0033
        L_0x004e:
            r21 = 0
            if (r7 != 0) goto L_0x012b
            s.d[] r6 = r8.W
            r6 = r6[r40]
            if (r5 == 0) goto L_0x005b
            r19 = 1
            goto L_0x005d
        L_0x005b:
            r19 = 4
        L_0x005d:
            int r23 = r6.f()
            s.e$b[] r15 = r8.Z
            r15 = r15[r10]
            r25 = r3
            s.e$b r3 = s.e.b.MATCH_CONSTRAINT
            if (r15 != r3) goto L_0x0075
            int[] r15 = r8.f15727y
            r15 = r15[r10]
            if (r15 != 0) goto L_0x0075
            r26 = r7
            r15 = 1
            goto L_0x0078
        L_0x0075:
            r26 = r7
            r15 = 0
        L_0x0078:
            s.d r7 = r6.f15664f
            if (r7 == 0) goto L_0x0084
            if (r8 == r11) goto L_0x0084
            int r7 = r7.f()
            int r23 = r23 + r7
        L_0x0084:
            r7 = r23
            if (r5 == 0) goto L_0x0091
            if (r8 == r11) goto L_0x0091
            if (r8 == r13) goto L_0x0091
            r23 = r2
            r19 = 8
            goto L_0x0093
        L_0x0091:
            r23 = r2
        L_0x0093:
            s.d r2 = r6.f15664f
            r27 = r11
            if (r2 == 0) goto L_0x00ca
            if (r8 != r13) goto L_0x00a4
            p.i r11 = r6.f15667i
            p.i r2 = r2.f15667i
            r1 = 6
            r9.h(r11, r2, r7, r1)
            goto L_0x00ad
        L_0x00a4:
            p.i r1 = r6.f15667i
            p.i r2 = r2.f15667i
            r11 = 8
            r9.h(r1, r2, r7, r11)
        L_0x00ad:
            if (r15 == 0) goto L_0x00b3
            if (r5 != 0) goto L_0x00b3
            r19 = 5
        L_0x00b3:
            if (r8 != r13) goto L_0x00bf
            if (r5 == 0) goto L_0x00bf
            boolean r1 = r8.h0(r10)
            if (r1 == 0) goto L_0x00bf
            r1 = 5
            goto L_0x00c1
        L_0x00bf:
            r1 = r19
        L_0x00c1:
            p.i r2 = r6.f15667i
            s.d r6 = r6.f15664f
            p.i r6 = r6.f15667i
            r9.e(r2, r6, r7, r1)
        L_0x00ca:
            if (r4 == 0) goto L_0x00fe
            int r1 = r8.V()
            r2 = 8
            if (r1 == r2) goto L_0x00ec
            s.e$b[] r1 = r8.Z
            r1 = r1[r10]
            if (r1 != r3) goto L_0x00ec
            s.d[] r1 = r8.W
            int r2 = r40 + 1
            r2 = r1[r2]
            p.i r2 = r2.f15667i
            r1 = r1[r40]
            p.i r1 = r1.f15667i
            r3 = 0
            r6 = 5
            r9.h(r2, r1, r3, r6)
            goto L_0x00ed
        L_0x00ec:
            r3 = 0
        L_0x00ed:
            s.d[] r1 = r8.W
            r1 = r1[r40]
            p.i r1 = r1.f15667i
            s.d[] r2 = r0.W
            r2 = r2[r40]
            p.i r2 = r2.f15667i
            r6 = 8
            r9.h(r1, r2, r3, r6)
        L_0x00fe:
            s.d[] r1 = r8.W
            int r2 = r40 + 1
            r1 = r1[r2]
            s.d r1 = r1.f15664f
            if (r1 == 0) goto L_0x0119
            s.e r1 = r1.f15662d
            s.d[] r2 = r1.W
            r2 = r2[r40]
            s.d r2 = r2.f15664f
            if (r2 == 0) goto L_0x0119
            s.e r2 = r2.f15662d
            if (r2 == r8) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r21 = r1
        L_0x0119:
            if (r21 == 0) goto L_0x0120
            r8 = r21
            r7 = r26
            goto L_0x0121
        L_0x0120:
            r7 = 1
        L_0x0121:
            r1 = r41
            r2 = r23
            r3 = r25
            r11 = r27
            goto L_0x004e
        L_0x012b:
            r23 = r2
            r25 = r3
            r27 = r11
            if (r14 == 0) goto L_0x018f
            s.d[] r1 = r12.W
            int r2 = r40 + 1
            r1 = r1[r2]
            s.d r1 = r1.f15664f
            if (r1 == 0) goto L_0x018f
            s.d[] r1 = r14.W
            r1 = r1[r2]
            s.e$b[] r3 = r14.Z
            r3 = r3[r10]
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x0165
            int[] r3 = r14.f15727y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0165
            if (r5 != 0) goto L_0x0165
            s.d r3 = r1.f15664f
            s.e r6 = r3.f15662d
            if (r6 != r0) goto L_0x0165
            p.i r6 = r1.f15667i
            p.i r3 = r3.f15667i
            int r7 = r1.f()
            int r7 = -r7
            r8 = 5
            r9.e(r6, r3, r7, r8)
            goto L_0x017b
        L_0x0165:
            r8 = 5
            if (r5 == 0) goto L_0x017b
            s.d r3 = r1.f15664f
            s.e r6 = r3.f15662d
            if (r6 != r0) goto L_0x017b
            p.i r6 = r1.f15667i
            p.i r3 = r3.f15667i
            int r7 = r1.f()
            int r7 = -r7
            r11 = 4
            r9.e(r6, r3, r7, r11)
        L_0x017b:
            p.i r3 = r1.f15667i
            s.d[] r6 = r12.W
            r2 = r6[r2]
            s.d r2 = r2.f15664f
            p.i r2 = r2.f15667i
            int r1 = r1.f()
            int r1 = -r1
            r6 = 6
            r9.j(r3, r2, r1, r6)
            goto L_0x0190
        L_0x018f:
            r8 = 5
        L_0x0190:
            if (r4 == 0) goto L_0x01a9
            s.d[] r0 = r0.W
            int r1 = r40 + 1
            r0 = r0[r1]
            p.i r0 = r0.f15667i
            s.d[] r2 = r12.W
            r1 = r2[r1]
            p.i r2 = r1.f15667i
            int r1 = r1.f()
            r3 = 8
            r9.h(r0, r2, r1, r3)
        L_0x01a9:
            r0 = r41
            java.util.ArrayList r1 = r0.f15644h
            if (r1 == 0) goto L_0x025a
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x025a
            boolean r3 = r0.f15654r
            if (r3 == 0) goto L_0x01c2
            boolean r3 = r0.f15656t
            if (r3 != 0) goto L_0x01c2
            int r3 = r0.f15646j
            float r3 = (float) r3
            goto L_0x01c4
        L_0x01c2:
            r3 = r25
        L_0x01c4:
            r4 = 0
            r29 = r4
            r7 = r21
            r6 = 0
        L_0x01ca:
            if (r6 >= r2) goto L_0x025a
            java.lang.Object r11 = r1.get(r6)
            s.e r11 = (s.e) r11
            float[] r15 = r11.D0
            r15 = r15[r10]
            int r20 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r20 >= 0) goto L_0x01f6
            boolean r15 = r0.f15656t
            if (r15 == 0) goto L_0x01f1
            s.d[] r11 = r11.W
            int r15 = r40 + 1
            r15 = r11[r15]
            p.i r15 = r15.f15667i
            r11 = r11[r40]
            p.i r11 = r11.f15667i
            r4 = 4
            r8 = 0
            r9.e(r15, r11, r8, r4)
            r4 = r8
            goto L_0x020e
        L_0x01f1:
            r4 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x01f4:
            r8 = 0
            goto L_0x01f8
        L_0x01f6:
            r4 = 4
            goto L_0x01f4
        L_0x01f8:
            int r19 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r19 != 0) goto L_0x0213
            s.d[] r11 = r11.W
            int r15 = r40 + 1
            r15 = r11[r15]
            p.i r15 = r15.f15667i
            r11 = r11[r40]
            p.i r11 = r11.f15667i
            r4 = 0
            r8 = 8
            r9.e(r15, r11, r4, r8)
        L_0x020e:
            r25 = r1
            r18 = r2
            goto L_0x0250
        L_0x0213:
            r4 = 0
            if (r7 == 0) goto L_0x0249
            s.d[] r7 = r7.W
            r8 = r7[r40]
            p.i r8 = r8.f15667i
            int r18 = r40 + 1
            r7 = r7[r18]
            p.i r7 = r7.f15667i
            s.d[] r4 = r11.W
            r25 = r1
            r1 = r4[r40]
            p.i r1 = r1.f15667i
            r4 = r4[r18]
            p.i r4 = r4.f15667i
            r18 = r2
            p.b r2 = r38.r()
            r28 = r2
            r30 = r3
            r31 = r15
            r32 = r8
            r33 = r7
            r34 = r1
            r35 = r4
            r28.l(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r2)
            goto L_0x024d
        L_0x0249:
            r25 = r1
            r18 = r2
        L_0x024d:
            r7 = r11
            r29 = r15
        L_0x0250:
            int r6 = r6 + 1
            r2 = r18
            r1 = r25
            r4 = 0
            r8 = 5
            goto L_0x01ca
        L_0x025a:
            if (r13 == 0) goto L_0x0263
            if (r13 == r14) goto L_0x0260
            if (r5 == 0) goto L_0x0263
        L_0x0260:
            r11 = r27
            goto L_0x0266
        L_0x0263:
            r11 = r27
            goto L_0x02b6
        L_0x0266:
            s.d[] r0 = r11.W
            r0 = r0[r40]
            s.d[] r1 = r12.W
            int r2 = r40 + 1
            r1 = r1[r2]
            s.d r0 = r0.f15664f
            if (r0 == 0) goto L_0x0278
            p.i r0 = r0.f15667i
            r3 = r0
            goto L_0x027a
        L_0x0278:
            r3 = r21
        L_0x027a:
            s.d r0 = r1.f15664f
            if (r0 == 0) goto L_0x0282
            p.i r0 = r0.f15667i
            r5 = r0
            goto L_0x0284
        L_0x0282:
            r5 = r21
        L_0x0284:
            s.d[] r0 = r13.W
            r0 = r0[r40]
            if (r14 == 0) goto L_0x028e
            s.d[] r1 = r14.W
            r1 = r1[r2]
        L_0x028e:
            if (r3 == 0) goto L_0x04d2
            if (r5 == 0) goto L_0x04d2
            r2 = r23
            if (r10 != 0) goto L_0x029a
            float r2 = r2.f15708o0
        L_0x0298:
            r4 = r2
            goto L_0x029d
        L_0x029a:
            float r2 = r2.f15710p0
            goto L_0x0298
        L_0x029d:
            int r6 = r0.f()
            int r7 = r1.f()
            p.i r2 = r0.f15667i
            p.i r8 = r1.f15667i
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04d2
        L_0x02b6:
            if (r16 == 0) goto L_0x03a3
            if (r13 == 0) goto L_0x03a3
            int r1 = r0.f15646j
            if (r1 <= 0) goto L_0x02c5
            int r0 = r0.f15645i
            if (r0 != r1) goto L_0x02c5
            r24 = 1
            goto L_0x02c7
        L_0x02c5:
            r24 = 0
        L_0x02c7:
            r8 = r13
            r15 = r8
        L_0x02c9:
            if (r15 == 0) goto L_0x04d2
            s.e[] r0 = r15.F0
            r0 = r0[r10]
            r7 = r0
        L_0x02d0:
            if (r7 == 0) goto L_0x02df
            int r0 = r7.V()
            r6 = 8
            if (r0 != r6) goto L_0x02e1
            s.e[] r0 = r7.F0
            r7 = r0[r10]
            goto L_0x02d0
        L_0x02df:
            r6 = 8
        L_0x02e1:
            if (r7 != 0) goto L_0x02ee
            if (r15 != r14) goto L_0x02e6
            goto L_0x02ee
        L_0x02e6:
            r22 = r7
        L_0x02e8:
            r18 = r8
            r20 = 5
            goto L_0x0393
        L_0x02ee:
            s.d[] r0 = r15.W
            r0 = r0[r40]
            p.i r1 = r0.f15667i
            s.d r2 = r0.f15664f
            if (r2 == 0) goto L_0x02fb
            p.i r2 = r2.f15667i
            goto L_0x02fd
        L_0x02fb:
            r2 = r21
        L_0x02fd:
            if (r8 == r15) goto L_0x0308
            s.d[] r2 = r8.W
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x0305:
            p.i r2 = r2.f15667i
            goto L_0x0315
        L_0x0308:
            if (r15 != r13) goto L_0x0315
            s.d[] r2 = r11.W
            r2 = r2[r40]
            s.d r2 = r2.f15664f
            if (r2 == 0) goto L_0x0313
            goto L_0x0305
        L_0x0313:
            r2 = r21
        L_0x0315:
            int r0 = r0.f()
            s.d[] r3 = r15.W
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.f()
            if (r7 == 0) goto L_0x032e
            s.d[] r5 = r7.W
            r5 = r5[r40]
        L_0x0329:
            p.i r6 = r5.f15667i
            r37 = r7
            goto L_0x033b
        L_0x032e:
            s.d[] r5 = r12.W
            r5 = r5[r4]
            s.d r5 = r5.f15664f
            if (r5 == 0) goto L_0x0337
            goto L_0x0329
        L_0x0337:
            r37 = r7
            r6 = r21
        L_0x033b:
            s.d[] r7 = r15.W
            r7 = r7[r4]
            p.i r7 = r7.f15667i
            if (r5 == 0) goto L_0x0348
            int r5 = r5.f()
            int r3 = r3 + r5
        L_0x0348:
            s.d[] r5 = r8.W
            r5 = r5[r4]
            int r5 = r5.f()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x038f
            if (r2 == 0) goto L_0x038f
            if (r6 == 0) goto L_0x038f
            if (r7 == 0) goto L_0x038f
            if (r15 != r13) goto L_0x0363
            s.d[] r0 = r13.W
            r0 = r0[r40]
            int r0 = r0.f()
        L_0x0363:
            r5 = r0
            if (r15 != r14) goto L_0x0371
            s.d[] r0 = r14.W
            r0 = r0[r4]
            int r0 = r0.f()
            r18 = r0
            goto L_0x0373
        L_0x0371:
            r18 = r3
        L_0x0373:
            if (r24 == 0) goto L_0x0378
            r19 = 8
            goto L_0x037a
        L_0x0378:
            r19 = 5
        L_0x037a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r20 = 5
            r6 = r7
            r22 = r37
            r7 = r18
            r18 = r8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0393
        L_0x038f:
            r22 = r37
            goto L_0x02e8
        L_0x0393:
            int r0 = r15.V()
            r8 = 8
            if (r0 == r8) goto L_0x039c
            goto L_0x039e
        L_0x039c:
            r15 = r18
        L_0x039e:
            r8 = r15
            r15 = r22
            goto L_0x02c9
        L_0x03a3:
            r8 = 8
            if (r17 == 0) goto L_0x04d2
            if (r13 == 0) goto L_0x04d2
            int r1 = r0.f15646j
            if (r1 <= 0) goto L_0x03b4
            int r0 = r0.f15645i
            if (r0 != r1) goto L_0x03b4
            r24 = 1
            goto L_0x03b6
        L_0x03b4:
            r24 = 0
        L_0x03b6:
            r7 = r13
            r15 = r7
        L_0x03b8:
            if (r15 == 0) goto L_0x047a
            s.e[] r0 = r15.F0
            r0 = r0[r10]
        L_0x03be:
            if (r0 == 0) goto L_0x03cb
            int r1 = r0.V()
            if (r1 != r8) goto L_0x03cb
            s.e[] r0 = r0.F0
            r0 = r0[r10]
            goto L_0x03be
        L_0x03cb:
            if (r15 == r13) goto L_0x0465
            if (r15 == r14) goto L_0x0465
            if (r0 == 0) goto L_0x0465
            if (r0 != r14) goto L_0x03d6
            r6 = r21
            goto L_0x03d7
        L_0x03d6:
            r6 = r0
        L_0x03d7:
            s.d[] r0 = r15.W
            r0 = r0[r40]
            p.i r1 = r0.f15667i
            s.d r2 = r0.f15664f
            if (r2 == 0) goto L_0x03e3
            p.i r2 = r2.f15667i
        L_0x03e3:
            s.d[] r2 = r7.W
            int r3 = r40 + 1
            r2 = r2[r3]
            p.i r2 = r2.f15667i
            int r0 = r0.f()
            s.d[] r4 = r15.W
            r4 = r4[r3]
            int r4 = r4.f()
            if (r6 == 0) goto L_0x0410
            s.d[] r5 = r6.W
            r5 = r5[r40]
            p.i r8 = r5.f15667i
            r37 = r6
            s.d r6 = r5.f15664f
            if (r6 == 0) goto L_0x0408
            p.i r6 = r6.f15667i
            goto L_0x040a
        L_0x0408:
            r6 = r21
        L_0x040a:
            r36 = r8
            r8 = r6
            r6 = r36
            goto L_0x0423
        L_0x0410:
            r37 = r6
            s.d[] r5 = r14.W
            r5 = r5[r40]
            if (r5 == 0) goto L_0x041b
            p.i r6 = r5.f15667i
            goto L_0x041d
        L_0x041b:
            r6 = r21
        L_0x041d:
            s.d[] r8 = r15.W
            r8 = r8[r3]
            p.i r8 = r8.f15667i
        L_0x0423:
            if (r5 == 0) goto L_0x042a
            int r5 = r5.f()
            int r4 = r4 + r5
        L_0x042a:
            r18 = r4
            s.d[] r4 = r7.W
            r3 = r4[r3]
            int r3 = r3.f()
            int r3 = r3 + r0
            if (r24 == 0) goto L_0x043a
            r20 = 8
            goto L_0x043c
        L_0x043a:
            r20 = 4
        L_0x043c:
            if (r1 == 0) goto L_0x045a
            if (r2 == 0) goto L_0x045a
            if (r6 == 0) goto L_0x045a
            if (r8 == 0) goto L_0x045a
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r19 = 4
            r5 = r6
            r22 = r37
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r20
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0462
        L_0x045a:
            r22 = r37
            r23 = r7
            r10 = 8
            r19 = 4
        L_0x0462:
            r0 = r22
            goto L_0x046a
        L_0x0465:
            r23 = r7
            r10 = r8
            r19 = 4
        L_0x046a:
            int r1 = r15.V()
            if (r1 == r10) goto L_0x0472
            r7 = r15
            goto L_0x0474
        L_0x0472:
            r7 = r23
        L_0x0474:
            r15 = r0
            r8 = r10
            r10 = r39
            goto L_0x03b8
        L_0x047a:
            s.d[] r0 = r13.W
            r0 = r0[r40]
            s.d[] r1 = r11.W
            r1 = r1[r40]
            s.d r1 = r1.f15664f
            s.d[] r2 = r14.W
            int r3 = r40 + 1
            r10 = r2[r3]
            s.d[] r2 = r12.W
            r2 = r2[r3]
            s.d r11 = r2.f15664f
            r15 = 5
            if (r1 == 0) goto L_0x04c2
            if (r13 == r14) goto L_0x04a1
            p.i r2 = r0.f15667i
            p.i r1 = r1.f15667i
            int r0 = r0.f()
            r9.e(r2, r1, r0, r15)
            goto L_0x04c2
        L_0x04a1:
            if (r11 == 0) goto L_0x04c2
            p.i r2 = r0.f15667i
            p.i r3 = r1.f15667i
            int r4 = r0.f()
            r5 = 1056964608(0x3f000000, float:0.5)
            p.i r6 = r10.f15667i
            p.i r7 = r11.f15667i
            int r8 = r10.f()
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04c2:
            if (r11 == 0) goto L_0x04d2
            if (r13 == r14) goto L_0x04d2
            p.i r0 = r10.f15667i
            p.i r1 = r11.f15667i
            int r2 = r10.f()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04d2:
            if (r16 != 0) goto L_0x04d6
            if (r17 == 0) goto L_0x0530
        L_0x04d6:
            if (r13 == 0) goto L_0x0530
            if (r13 == r14) goto L_0x0530
            s.d[] r0 = r13.W
            r1 = r0[r40]
            if (r14 != 0) goto L_0x04e1
            r14 = r13
        L_0x04e1:
            s.d[] r2 = r14.W
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            s.d r4 = r1.f15664f
            if (r4 == 0) goto L_0x04ef
            p.i r4 = r4.f15667i
            goto L_0x04f1
        L_0x04ef:
            r4 = r21
        L_0x04f1:
            s.d r5 = r2.f15664f
            if (r5 == 0) goto L_0x04f8
            p.i r5 = r5.f15667i
            goto L_0x04fa
        L_0x04f8:
            r5 = r21
        L_0x04fa:
            if (r12 == r14) goto L_0x050a
            s.d[] r5 = r12.W
            r5 = r5[r3]
            s.d r5 = r5.f15664f
            if (r5 == 0) goto L_0x0508
            p.i r5 = r5.f15667i
            r21 = r5
        L_0x0508:
            r5 = r21
        L_0x050a:
            if (r13 != r14) goto L_0x050e
            r2 = r0[r3]
        L_0x050e:
            if (r4 == 0) goto L_0x0530
            if (r5 == 0) goto L_0x0530
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.f()
            s.d[] r0 = r14.W
            r0 = r0[r3]
            int r8 = r0.f()
            p.i r1 = r1.f15667i
            p.i r10 = r2.f15667i
            r11 = 5
            r0 = r38
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0530:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.a(s.f, p.d, int, int, s.c):void");
    }

    public static void b(f fVar, d dVar, ArrayList arrayList, int i10) {
        int i11;
        c[] cVarArr;
        int i12;
        if (i10 == 0) {
            i12 = fVar.W0;
            cVarArr = fVar.Z0;
            i11 = 0;
        } else {
            i12 = fVar.X0;
            cVarArr = fVar.Y0;
            i11 = 2;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            c cVar = cVarArr[i13];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f15637a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
