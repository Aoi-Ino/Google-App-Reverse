package e8;

import a8.e;

class h0 extends x1 {
    static final byte[] A = e.f("0 1 -1 0 ");
    static final byte[] B = e.f("-1 0 0 -1 ");
    static final byte[] C = e.f("0 -1 1 0 ");
    static final byte[] D = e.f(" cm\n");

    /* renamed from: y  reason: collision with root package name */
    static final byte[] f10764y = e.f("q\n");

    /* renamed from: z  reason: collision with root package name */
    static final byte[] f10765z = e.f("Q\n");

    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.zip.DeflaterOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    h0(e8.g0 r8, e8.g0 r9, e8.g0 r10, e8.g0 r11, a8.v r12) {
        /*
            r7 = this;
            r7.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x002d }
            r0.<init>()     // Catch:{ Exception -> 0x002d }
            r7.f11070p = r0     // Catch:{ Exception -> 0x002d }
            boolean r1 = a8.f.f265p     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x0030
            r0 = 1
            r7.f11068n = r0     // Catch:{ Exception -> 0x002d }
            e8.c2 r0 = r10.s()     // Catch:{ Exception -> 0x002d }
            int r0 = r0.u()     // Catch:{ Exception -> 0x002d }
            r7.f11069o = r0     // Catch:{ Exception -> 0x002d }
            java.util.zip.Deflater r0 = new java.util.zip.Deflater     // Catch:{ Exception -> 0x002d }
            int r1 = r7.f11069o     // Catch:{ Exception -> 0x002d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002d }
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ Exception -> 0x002d }
            java.io.ByteArrayOutputStream r2 = r7.f11070p     // Catch:{ Exception -> 0x002d }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x002d }
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0031
        L_0x002d:
            r8 = move-exception
            goto L_0x0127
        L_0x0030:
            r1 = 0
        L_0x0031:
            int r2 = r12.u()     // Catch:{ Exception -> 0x002d }
            r3 = 90
            r4 = 48
            r5 = 32
            if (r2 == r3) goto L_0x0095
            r3 = 180(0xb4, float:2.52E-43)
            if (r2 == r3) goto L_0x0067
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto L_0x0046
            goto L_0x00b5
        L_0x0046:
            byte[] r2 = C     // Catch:{ Exception -> 0x002d }
            r0.write(r2)     // Catch:{ Exception -> 0x002d }
            r0.write(r4)     // Catch:{ Exception -> 0x002d }
            r0.write(r5)     // Catch:{ Exception -> 0x002d }
            float r12 = r12.s()     // Catch:{ Exception -> 0x002d }
            double r2 = (double) r12     // Catch:{ Exception -> 0x002d }
            java.lang.String r12 = e8.f.E(r2)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = a8.e.f(r12)     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = D     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x00b5
        L_0x0067:
            byte[] r2 = B     // Catch:{ Exception -> 0x002d }
            r0.write(r2)     // Catch:{ Exception -> 0x002d }
            float r2 = r12.s()     // Catch:{ Exception -> 0x002d }
            double r2 = (double) r2     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = e8.f.E(r2)     // Catch:{ Exception -> 0x002d }
            byte[] r2 = a8.e.f(r2)     // Catch:{ Exception -> 0x002d }
            r0.write(r2)     // Catch:{ Exception -> 0x002d }
            r0.write(r5)     // Catch:{ Exception -> 0x002d }
            float r12 = r12.w()     // Catch:{ Exception -> 0x002d }
            double r2 = (double) r12     // Catch:{ Exception -> 0x002d }
            java.lang.String r12 = e8.f.E(r2)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = a8.e.f(r12)     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = D     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x00b5
        L_0x0095:
            byte[] r2 = A     // Catch:{ Exception -> 0x002d }
            r0.write(r2)     // Catch:{ Exception -> 0x002d }
            float r12 = r12.w()     // Catch:{ Exception -> 0x002d }
            double r2 = (double) r12     // Catch:{ Exception -> 0x002d }
            java.lang.String r12 = e8.f.E(r2)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = a8.e.f(r12)     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            r0.write(r5)     // Catch:{ Exception -> 0x002d }
            r0.write(r4)     // Catch:{ Exception -> 0x002d }
            byte[] r12 = D     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
        L_0x00b5:
            int r12 = r8.d0()     // Catch:{ Exception -> 0x002d }
            if (r12 <= 0) goto L_0x00cc
            byte[] r12 = f10764y     // Catch:{ Exception -> 0x002d }
            r0.write(r12)     // Catch:{ Exception -> 0x002d }
            e8.f r8 = r8.p()     // Catch:{ Exception -> 0x002d }
            r8.c0(r0)     // Catch:{ Exception -> 0x002d }
            byte[] r8 = f10765z     // Catch:{ Exception -> 0x002d }
            r0.write(r8)     // Catch:{ Exception -> 0x002d }
        L_0x00cc:
            int r8 = r9.d0()     // Catch:{ Exception -> 0x002d }
            if (r8 <= 0) goto L_0x00e3
            byte[] r8 = f10764y     // Catch:{ Exception -> 0x002d }
            r0.write(r8)     // Catch:{ Exception -> 0x002d }
            e8.f r8 = r9.p()     // Catch:{ Exception -> 0x002d }
            r8.c0(r0)     // Catch:{ Exception -> 0x002d }
            byte[] r8 = f10765z     // Catch:{ Exception -> 0x002d }
            r0.write(r8)     // Catch:{ Exception -> 0x002d }
        L_0x00e3:
            if (r10 == 0) goto L_0x00f6
            byte[] r8 = f10764y     // Catch:{ Exception -> 0x002d }
            r0.write(r8)     // Catch:{ Exception -> 0x002d }
            e8.f r8 = r10.p()     // Catch:{ Exception -> 0x002d }
            r8.c0(r0)     // Catch:{ Exception -> 0x002d }
            byte[] r8 = f10765z     // Catch:{ Exception -> 0x002d }
            r0.write(r8)     // Catch:{ Exception -> 0x002d }
        L_0x00f6:
            int r8 = r11.d0()     // Catch:{ Exception -> 0x002d }
            if (r8 <= 0) goto L_0x0103
            e8.f r8 = r11.p()     // Catch:{ Exception -> 0x002d }
            r8.c0(r0)     // Catch:{ Exception -> 0x002d }
        L_0x0103:
            r0.close()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x010b
            r1.end()     // Catch:{ Exception -> 0x002d }
        L_0x010b:
            e8.c1 r8 = e8.c1.f10358m5
            e8.f1 r9 = new e8.f1
            java.io.ByteArrayOutputStream r10 = r7.f11070p
            int r10 = r10.size()
            r9.<init>((int) r10)
            r7.r(r8, r9)
            boolean r8 = r7.f11068n
            if (r8 == 0) goto L_0x0126
            e8.c1 r8 = e8.c1.f10242d3
            e8.c1 r9 = e8.c1.f10447t3
            r7.r(r8, r9)
        L_0x0126:
            return
        L_0x0127:
            e8.b r9 = new e8.b
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h0.<init>(e8.g0, e8.g0, e8.g0, e8.g0, a8.v):void");
    }
}
