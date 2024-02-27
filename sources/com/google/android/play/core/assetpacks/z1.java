package com.google.android.play.core.assetpacks;

import q5.d;
import t5.a;

final class z1 {

    /* renamed from: e  reason: collision with root package name */
    private static final a f7019e = new a("ExtractorTaskFinder");

    /* renamed from: a  reason: collision with root package name */
    private final w1 f7020a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f7021b;

    /* renamed from: c  reason: collision with root package name */
    private final o0 f7022c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7023d;

    z1(w1 w1Var, e0 e0Var, o0 o0Var, d dVar) {
        this.f7020a = w1Var;
        this.f7021b = e0Var;
        this.f7022c = o0Var;
        this.f7023d = dVar;
    }

    private final boolean b(t1 t1Var, u1 u1Var) {
        e0 e0Var = this.f7021b;
        s1 s1Var = t1Var.f6891c;
        return new b3(e0Var, s1Var.f6878a, t1Var.f6890b, s1Var.f6879b, u1Var.f6907a).m();
    }

    private static boolean c(u1 u1Var) {
        int i10 = u1Var.f6912f;
        return i10 == 1 || i10 == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.play.core.assetpacks.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.e3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.e3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.google.android.play.core.assetpacks.t2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.t2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: com.google.android.play.core.assetpacks.w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: com.google.android.play.core.assetpacks.w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: com.google.android.play.core.assetpacks.t2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: com.google.android.play.core.assetpacks.e3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: com.google.android.play.core.assetpacks.h2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: com.google.android.play.core.assetpacks.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: com.google.android.play.core.assetpacks.w2} */
    /* JADX WARNING: type inference failed for: r0v45, types: [com.google.android.play.core.assetpacks.y1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        f7019e.a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f6889a), r7.f6891c.f6878a);
        r11 = r7.f6889a;
        r8 = r7.f6891c;
        r10 = new com.google.android.play.core.assetpacks.k2(r11, r8.f6878a, r7.f6890b, r8.f6879b, r8.f6880c);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.y1 a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.w1 r0 = r1.f7020a     // Catch:{ all -> 0x0034 }
            r0.h()     // Catch:{ all -> 0x0034 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.w1 r0 = r1.f7020a     // Catch:{ all -> 0x0034 }
            java.util.Map r0 = r0.f()     // Catch:{ all -> 0x0034 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0034 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r3 = (com.google.android.play.core.assetpacks.t1) r3     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r4 = r3.f6891c     // Catch:{ all -> 0x0034 }
            int r4 = r4.f6881d     // Catch:{ all -> 0x0034 }
            boolean r4 = com.google.android.play.core.assetpacks.d0.b(r4)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x001a
        L_0x0034:
            r0 = move-exception
            goto L_0x03f4
        L_0x0037:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0034 }
            r3 = 0
            if (r0 == 0) goto L_0x0044
        L_0x003e:
            com.google.android.play.core.assetpacks.w1 r0 = r1.f7020a
            r0.j()
            return r3
        L_0x0044:
            q5.d r0 = r1.f7023d     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "assetOnlyUpdates"
            boolean r0 = r0.a(r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r5 = 2
            r6 = 0
            if (r0 == 0) goto L_0x00ba
            com.google.android.play.core.assetpacks.e0 r0 = r1.f7021b     // Catch:{ all -> 0x0034 }
            java.util.Map r0 = r0.F()     // Catch:{ all -> 0x0034 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x005b:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0034 }
            if (r8 == 0) goto L_0x00b0
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r8 = (com.google.android.play.core.assetpacks.t1) r8     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r8.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0034 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0034 }
            if (r9 == 0) goto L_0x005b
            com.google.android.play.core.assetpacks.s1 r10 = r8.f6891c     // Catch:{ all -> 0x0034 }
            long r10 = r10.f6879b     // Catch:{ all -> 0x0034 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0034 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x005b
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0034 }
            int r9 = r8.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0034 }
            r7[r6] = r9     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r8.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            r7[r4] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.a(r9, r7)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.w2 r0 = new com.google.android.play.core.assetpacks.w2     // Catch:{ all -> 0x0034 }
            int r11 = r8.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r7 = r8.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r12 = r7.f6878a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r7 = r1.f7021b     // Catch:{ all -> 0x0034 }
            int r13 = r7.p(r12)     // Catch:{ all -> 0x0034 }
            int r14 = r8.f6890b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r7 = r8.f6891c     // Catch:{ all -> 0x0034 }
            long r7 = r7.f6879b     // Catch:{ all -> 0x0034 }
            r10 = r0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0034 }
            goto L_0x00b1
        L_0x00b0:
            r0 = r3
        L_0x00b1:
            if (r0 != 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.play.core.assetpacks.w1 r2 = r1.f7020a
            r2.j()
            return r0
        L_0x00ba:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x00be:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x012d
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r7 = (com.google.android.play.core.assetpacks.t1) r7     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r8 = r1.f7021b     // Catch:{ IOException -> 0x010e }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ IOException -> 0x010e }
            java.lang.String r10 = r9.f6878a     // Catch:{ IOException -> 0x010e }
            int r11 = r7.f6890b     // Catch:{ IOException -> 0x010e }
            long r12 = r9.f6879b     // Catch:{ IOException -> 0x010e }
            int r8 = r8.q(r10, r11, r12)     // Catch:{ IOException -> 0x010e }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ IOException -> 0x010e }
            java.util.List r9 = r9.f6883f     // Catch:{ IOException -> 0x010e }
            int r9 = r9.size()     // Catch:{ IOException -> 0x010e }
            if (r8 != r9) goto L_0x00be
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0034 }
            int r9 = r7.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0034 }
            r8[r6] = r9     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            r8[r4] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.a(r9, r8)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.k2 r0 = new com.google.android.play.core.assetpacks.k2     // Catch:{ all -> 0x0034 }
            int r11 = r7.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r8 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r12 = r8.f6878a     // Catch:{ all -> 0x0034 }
            int r13 = r7.f6890b     // Catch:{ all -> 0x0034 }
            long r14 = r8.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = r8.f6880c     // Catch:{ all -> 0x0034 }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x0034 }
            goto L_0x012e
        L_0x010e:
            r0 = move-exception
            com.google.android.play.core.assetpacks.d1 r2 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0034 }
            int r5 = r7.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0034 }
            r3[r6] = r5     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r5 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.f6878a     // Catch:{ all -> 0x0034 }
            r3[r4] = r5     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0034 }
            int r4 = r7.f6889a     // Catch:{ all -> 0x0034 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0034 }
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x012d:
            r0 = r3
        L_0x012e:
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0134:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            r8 = 3
            if (r7 == 0) goto L_0x01b5
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r7 = (com.google.android.play.core.assetpacks.t1) r7     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ all -> 0x0034 }
            int r10 = r9.f6881d     // Catch:{ all -> 0x0034 }
            boolean r10 = com.google.android.play.core.assetpacks.d0.b(r10)     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x0134
            java.util.List r9 = r9.f6883f     // Catch:{ all -> 0x0034 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0151:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x0134
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.u1 r10 = (com.google.android.play.core.assetpacks.u1) r10     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r11 = r1.f7021b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r12 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r13 = r12.f6878a     // Catch:{ all -> 0x0034 }
            int r14 = r7.f6890b     // Catch:{ all -> 0x0034 }
            long r3 = r12.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = r10.f6907a     // Catch:{ all -> 0x0034 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r3
            java.io.File r3 = r11.D(r12, r13, r14, r16)     // Catch:{ all -> 0x0034 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x01b2
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x0034 }
            int r4 = r7.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0034 }
            r3[r6] = r4     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r4 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r4.f6878a     // Catch:{ all -> 0x0034 }
            r9 = 1
            r3[r9] = r4     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r10.f6907a     // Catch:{ all -> 0x0034 }
            r3[r5] = r4     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "Found merge task for session %s with pack %s and slice %s."
            r0.a(r4, r3)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.h2 r0 = new com.google.android.play.core.assetpacks.h2     // Catch:{ all -> 0x0034 }
            int r3 = r7.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r4 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r4.f6878a     // Catch:{ all -> 0x0034 }
            int r7 = r7.f6890b     // Catch:{ all -> 0x0034 }
            long r11 = r4.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r10.f6907a     // Catch:{ all -> 0x0034 }
            r18 = r0
            r19 = r3
            r20 = r9
            r21 = r7
            r22 = r11
            r24 = r4
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0034 }
            goto L_0x01b6
        L_0x01b2:
            r3 = 0
            r4 = 1
            goto L_0x0151
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x01bc:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r3 = (com.google.android.play.core.assetpacks.t1) r3     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r4 = r3.f6891c     // Catch:{ all -> 0x0034 }
            int r7 = r4.f6881d     // Catch:{ all -> 0x0034 }
            boolean r7 = com.google.android.play.core.assetpacks.d0.b(r7)     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x01bc
            java.util.List r4 = r4.f6883f     // Catch:{ all -> 0x0034 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0034 }
        L_0x01d8:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0034 }
            if (r7 == 0) goto L_0x01bc
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.u1 r7 = (com.google.android.play.core.assetpacks.u1) r7     // Catch:{ all -> 0x0034 }
            boolean r9 = r1.b(r3, r7)     // Catch:{ all -> 0x0034 }
            if (r9 == 0) goto L_0x01d8
            com.google.android.play.core.assetpacks.e0 r10 = r1.f7021b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r3.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r11 = r9.f6878a     // Catch:{ all -> 0x0034 }
            int r12 = r3.f6890b     // Catch:{ all -> 0x0034 }
            long r13 = r9.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = r7.f6907a     // Catch:{ all -> 0x0034 }
            java.io.File r9 = r10.C(r11, r12, r13, r15)     // Catch:{ all -> 0x0034 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0034 }
            if (r9 == 0) goto L_0x01d8
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x0034 }
            int r9 = r3.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0034 }
            r4[r6] = r9     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r3.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            r10 = 1
            r4[r10] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r7.f6907a     // Catch:{ all -> 0x0034 }
            r4[r5] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.a(r9, r4)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e3 r0 = new com.google.android.play.core.assetpacks.e3     // Catch:{ all -> 0x0034 }
            int r4 = r3.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r3.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r10 = r9.f6878a     // Catch:{ all -> 0x0034 }
            int r3 = r3.f6890b     // Catch:{ all -> 0x0034 }
            long r11 = r9.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r7.f6907a     // Catch:{ all -> 0x0034 }
            java.lang.String r13 = r7.f6908b     // Catch:{ all -> 0x0034 }
            long r14 = r7.f6909c     // Catch:{ all -> 0x0034 }
            r18 = r0
            r19 = r4
            r20 = r10
            r21 = r3
            r22 = r11
            r24 = r9
            r25 = r13
            r26 = r14
            r18.<init>(r19, r20, r21, r22, r24, r25, r26)     // Catch:{ all -> 0x0034 }
            goto L_0x0243
        L_0x0242:
            r0 = 0
        L_0x0243:
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0249:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0034 }
            r4 = 4
            if (r0 == 0) goto L_0x0334
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0034 }
            r7 = r0
            com.google.android.play.core.assetpacks.t1 r7 = (com.google.android.play.core.assetpacks.t1) r7     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r0 = r7.f6891c     // Catch:{ all -> 0x0034 }
            int r9 = r0.f6881d     // Catch:{ all -> 0x0034 }
            boolean r9 = com.google.android.play.core.assetpacks.d0.b(r9)     // Catch:{ all -> 0x0034 }
            if (r9 == 0) goto L_0x0249
            java.util.List r0 = r0.f6883f     // Catch:{ all -> 0x0034 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0267:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0034 }
            r10 = r0
            com.google.android.play.core.assetpacks.u1 r10 = (com.google.android.play.core.assetpacks.u1) r10     // Catch:{ all -> 0x0034 }
            boolean r0 = c(r10)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0267
            com.google.android.play.core.assetpacks.b3 r0 = new com.google.android.play.core.assetpacks.b3     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r11 = r1.f7021b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r12 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r13 = r12.f6878a     // Catch:{ all -> 0x0034 }
            int r14 = r7.f6890b     // Catch:{ all -> 0x0034 }
            r16 = r9
            long r8 = r12.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r12 = r10.f6907a     // Catch:{ all -> 0x0034 }
            r18 = r0
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r8
            r24 = r12
            r18.<init>(r19, r20, r21, r22, r24)     // Catch:{ all -> 0x0034 }
            int r0 = r0.a()     // Catch:{ IOException -> 0x029e }
            goto L_0x02ac
        L_0x029e:
            r0 = move-exception
            r8 = r0
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.b(r9, r8)     // Catch:{ all -> 0x0034 }
            r0 = r6
        L_0x02ac:
            r8 = -1
            if (r0 == r8) goto L_0x032f
            java.util.List r8 = r10.f6910d     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.q1 r8 = (com.google.android.play.core.assetpacks.q1) r8     // Catch:{ all -> 0x0034 }
            boolean r8 = r8.f6856a     // Catch:{ all -> 0x0034 }
            if (r8 == 0) goto L_0x032f
            t5.a r3 = f7019e     // Catch:{ all -> 0x0034 }
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0034 }
            int r9 = r10.f6911e     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0034 }
            r8[r6] = r9     // Catch:{ all -> 0x0034 }
            int r9 = r7.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0034 }
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            r8[r5] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r10.f6907a     // Catch:{ all -> 0x0034 }
            r11 = 3
            r8[r11] = r9     // Catch:{ all -> 0x0034 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0034 }
            r8[r4] = r9     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.a(r9, r8)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.o0 r3 = r1.f7022c     // Catch:{ all -> 0x0034 }
            int r8 = r7.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6878a     // Catch:{ all -> 0x0034 }
            java.lang.String r11 = r10.f6907a     // Catch:{ all -> 0x0034 }
            java.io.InputStream r32 = r3.a(r8, r9, r11, r0)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.x0 r3 = new com.google.android.play.core.assetpacks.x0     // Catch:{ all -> 0x0034 }
            int r8 = r7.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r9 = r7.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r11 = r9.f6878a     // Catch:{ all -> 0x0034 }
            int r12 = r7.f6890b     // Catch:{ all -> 0x0034 }
            long r13 = r9.f6879b     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r9.f6880c     // Catch:{ all -> 0x0034 }
            java.lang.String r15 = r10.f6907a     // Catch:{ all -> 0x0034 }
            int r5 = r10.f6911e     // Catch:{ all -> 0x0034 }
            java.util.List r10 = r10.f6910d     // Catch:{ all -> 0x0034 }
            int r28 = r10.size()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r7 = r7.f6891c     // Catch:{ all -> 0x0034 }
            r16 = r5
            long r4 = r7.f6882e     // Catch:{ all -> 0x0034 }
            int r7 = r7.f6881d     // Catch:{ all -> 0x0034 }
            r18 = r3
            r19 = r8
            r20 = r11
            r21 = r12
            r22 = r13
            r24 = r9
            r25 = r15
            r26 = r16
            r27 = r0
            r29 = r4
            r31 = r7
            r18.<init>(r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0034 }
            goto L_0x0335
        L_0x032f:
            r9 = r16
            r8 = 3
            goto L_0x0267
        L_0x0334:
            r3 = 0
        L_0x0335:
            if (r3 != 0) goto L_0x003e
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0034 }
        L_0x033b:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x03e8
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t1 r2 = (com.google.android.play.core.assetpacks.t1) r2     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r3 = r2.f6891c     // Catch:{ all -> 0x0034 }
            int r4 = r3.f6881d     // Catch:{ all -> 0x0034 }
            boolean r4 = com.google.android.play.core.assetpacks.d0.b(r4)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x033b
            java.util.List r3 = r3.f6883f     // Catch:{ all -> 0x0034 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0357:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x033b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.u1 r4 = (com.google.android.play.core.assetpacks.u1) r4     // Catch:{ all -> 0x0034 }
            boolean r5 = c(r4)     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x0357
            java.util.List r5 = r4.f6910d     // Catch:{ all -> 0x0034 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.q1 r5 = (com.google.android.play.core.assetpacks.q1) r5     // Catch:{ all -> 0x0034 }
            boolean r5 = r5.f6856a     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x0357
            boolean r5 = r1.b(r2, r4)     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0357
            t5.a r0 = f7019e     // Catch:{ all -> 0x0034 }
            r5 = 4
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0034 }
            int r5 = r4.f6912f     // Catch:{ all -> 0x0034 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0034 }
            r3[r6] = r5     // Catch:{ all -> 0x0034 }
            int r5 = r2.f6889a     // Catch:{ all -> 0x0034 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0034 }
            r7 = 1
            r3[r7] = r5     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r5 = r2.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.f6878a     // Catch:{ all -> 0x0034 }
            r8 = 2
            r3[r8] = r5     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r4.f6907a     // Catch:{ all -> 0x0034 }
            r9 = 3
            r3[r9] = r5     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.a(r5, r3)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.o0 r0 = r1.f7022c     // Catch:{ all -> 0x0034 }
            int r3 = r2.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r5 = r2.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.f6878a     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = r4.f6907a     // Catch:{ all -> 0x0034 }
            java.io.InputStream r30 = r0.a(r3, r5, r7, r6)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.t2 r0 = new com.google.android.play.core.assetpacks.t2     // Catch:{ all -> 0x0034 }
            int r3 = r2.f6889a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r5 = r2.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r5.f6878a     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r6 = r1.f7021b     // Catch:{ all -> 0x0034 }
            int r20 = r6.p(r5)     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.e0 r6 = r1.f7021b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r7 = r2.f6891c     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = r7.f6878a     // Catch:{ all -> 0x0034 }
            long r21 = r6.r(r7)     // Catch:{ all -> 0x0034 }
            int r6 = r2.f6890b     // Catch:{ all -> 0x0034 }
            com.google.android.play.core.assetpacks.s1 r2 = r2.f6891c     // Catch:{ all -> 0x0034 }
            long r7 = r2.f6879b     // Catch:{ all -> 0x0034 }
            int r2 = r4.f6912f     // Catch:{ all -> 0x0034 }
            java.lang.String r9 = r4.f6907a     // Catch:{ all -> 0x0034 }
            long r10 = r4.f6909c     // Catch:{ all -> 0x0034 }
            r17 = r0
            r18 = r3
            r19 = r5
            r23 = r6
            r24 = r7
            r26 = r2
            r27 = r9
            r28 = r10
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x0034 }
            goto L_0x03e9
        L_0x03e8:
            r0 = 0
        L_0x03e9:
            if (r0 == 0) goto L_0x03ed
            goto L_0x00b4
        L_0x03ed:
            com.google.android.play.core.assetpacks.w1 r0 = r1.f7020a
            r0.j()
            r2 = 0
            return r2
        L_0x03f4:
            com.google.android.play.core.assetpacks.w1 r2 = r1.f7020a
            r2.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.z1.a():com.google.android.play.core.assetpacks.y1");
    }
}
