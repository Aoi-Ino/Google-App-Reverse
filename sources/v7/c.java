package v7;

import r7.b;

public abstract class c {
    public static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z10) {
        int d10 = z10 ? bVar.d() : bVar.f();
        int f10 = z10 ? bVar.f() : bVar.d();
        byte[][] c10 = bVar.c();
        byte b10 = -1;
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < f10; i13++) {
                byte b11 = z10 ? c10[i11][i13] : c10[i13][i11];
                if (b11 == b10) {
                    i12++;
                    if (i12 == 5) {
                        i10 += 3;
                    } else if (i12 > 5) {
                        i10++;
                    }
                } else {
                    b10 = b11;
                    i12 = 1;
                }
            }
        }
        return i10;
    }

    public static int c(b bVar) {
        byte[][] c10 = bVar.c();
        int f10 = bVar.f();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10 - 1; i11++) {
            int i12 = 0;
            while (i12 < f10 - 1) {
                byte[] bArr = c10[i11];
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = c10[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10 += 3;
                    }
                }
                i12 = i13;
            }
        }
        return i10;
    }

    public static int d(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        byte[][] c10 = bVar.c();
        int f10 = bVar.f();
        int d10 = bVar.d();
        int i14 = 0;
        for (int i15 = 0; i15 < d10; i15++) {
            for (int i16 = 0; i16 < f10; i16++) {
                int i17 = i16 + 6;
                if (i17 < f10) {
                    byte[] bArr = c10[i15];
                    if (bArr[i16] == 1 && bArr[i16 + 1] == 0 && bArr[i16 + 2] == 1 && bArr[i16 + 3] == 1 && bArr[i16 + 4] == 1 && bArr[i16 + 5] == 0 && bArr[i17] == 1 && (((i12 = i16 + 10) < f10 && bArr[i16 + 7] == 0 && bArr[i16 + 8] == 0 && bArr[i16 + 9] == 0 && bArr[i12] == 0) || (i16 - 4 >= 0 && bArr[i16 - 1] == 0 && bArr[i16 - 2] == 0 && bArr[i16 - 3] == 0 && bArr[i13] == 0))) {
                        i14 += 40;
                    }
                }
                int i18 = i15 + 6;
                if (i18 < d10 && c10[i15][i16] == 1 && c10[i15 + 1][i16] == 0 && c10[i15 + 2][i16] == 1 && c10[i15 + 3][i16] == 1 && c10[i15 + 4][i16] == 1 && c10[i15 + 5][i16] == 0 && c10[i18][i16] == 1 && (((i10 = i15 + 10) < d10 && c10[i15 + 7][i16] == 0 && c10[i15 + 8][i16] == 0 && c10[i15 + 9][i16] == 0 && c10[i10][i16] == 0) || (i15 - 4 >= 0 && c10[i15 - 1][i16] == 0 && c10[i15 - 2][i16] == 0 && c10[i15 - 3][i16] == 0 && c10[i11][i16] == 0))) {
                    i14 += 40;
                }
            }
        }
        return i14;
    }

    public static int e(b bVar) {
        byte[][] c10 = bVar.c();
        int f10 = bVar.f();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            for (int i12 = 0; i12 < f10; i12++) {
                if (c10[i11][i12] == 1) {
                    i10++;
                }
            }
        }
        return (Math.abs((int) (((((double) i10) / ((double) (bVar.d() * bVar.f()))) * 100.0d) - 50.0d)) / 5) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r1 != 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r1 = r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r1 = r1 & 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(int r1, int r2, int r3) {
        /*
            boolean r0 = v7.e.j(r1)
            if (r0 == 0) goto L_0x004f
            r0 = 1
            switch(r1) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003e;
                case 4: goto L_0x0039;
                case 5: goto L_0x0032;
                case 6: goto L_0x002b;
                case 7: goto L_0x0021;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r0 = "Invalid mask pattern: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0021:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
        L_0x0028:
            int r1 = r1 + r2
        L_0x0029:
            r1 = r1 & r0
            goto L_0x004a
        L_0x002b:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x0029
        L_0x0032:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x004a
        L_0x0039:
            int r1 = r3 >>> 1
            int r2 = r2 / 3
            goto L_0x0028
        L_0x003e:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x004a
        L_0x0042:
            int r1 = r2 % 3
            goto L_0x004a
        L_0x0045:
            r1 = r3 & 1
            goto L_0x004a
        L_0x0048:
            int r3 = r3 + r2
            goto L_0x0045
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            return r0
        L_0x004f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid mask pattern"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.c.f(int, int, int):boolean");
    }
}
