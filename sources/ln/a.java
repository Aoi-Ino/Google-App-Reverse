package ln;

public class a extends b {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f25040o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f25041p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: q  reason: collision with root package name */
    private static final byte[] f25042q = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f25043j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f25044k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f25045l;

    /* renamed from: m  reason: collision with root package name */
    private final int f25046m;

    /* renamed from: n  reason: collision with root package name */
    private final int f25047n;

    public a(int i10, byte[] bArr, boolean z10) {
        this(i10, bArr, z10, b.f25048h);
    }

    public static byte[] n(byte[] bArr) {
        return o(bArr, false);
    }

    public static byte[] o(byte[] bArr, boolean z10) {
        return p(bArr, z10, false);
    }

    public static byte[] p(byte[] bArr, boolean z10, boolean z11) {
        return q(bArr, z10, z11, Integer.MAX_VALUE);
    }

    public static byte[] q(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z10 ? new a(z11) : new a(0, b.f25049i, z11);
        long j10 = aVar.j(bArr);
        if (j10 <= ((long) i10)) {
            return aVar.f(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + j10 + ") than the specified maximum size of " + i10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(byte[] r11, int r12, int r13, ln.b.a r14) {
        /*
            r10 = this;
            boolean r0 = r14.f25062f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r13 >= 0) goto L_0x00b7
            r14.f25062f = r1
            int r11 = r14.f25064h
            if (r11 != 0) goto L_0x0014
            int r11 = r10.f25054e
            if (r11 != 0) goto L_0x0014
            return
        L_0x0014:
            int r11 = r10.f25047n
            byte[] r11 = r10.h(r11, r14)
            int r12 = r14.f25060d
            int r13 = r14.f25064h
            if (r13 == 0) goto L_0x0099
            if (r13 == r1) goto L_0x006f
            r1 = 2
            if (r13 != r1) goto L_0x0056
            int r13 = r12 + 1
            byte[] r2 = r10.f25043j
            int r3 = r14.f25057a
            int r4 = r3 >> 10
            r4 = r4 & 63
            byte r4 = r2[r4]
            r11[r12] = r4
            int r4 = r12 + 2
            int r5 = r3 >> 4
            r5 = r5 & 63
            byte r5 = r2[r5]
            r11[r13] = r5
            int r13 = r12 + 3
            r14.f25060d = r13
            int r1 = r3 << 2
            r1 = r1 & 63
            byte r1 = r2[r1]
            r11[r4] = r1
            byte[] r1 = f25040o
            if (r2 != r1) goto L_0x0099
            int r1 = r12 + 4
            r14.f25060d = r1
            byte r1 = r10.f25051b
            r11[r13] = r1
            goto L_0x0099
        L_0x0056:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Impossible modulus "
            r12.append(r13)
            int r13 = r14.f25064h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x006f:
            int r13 = r12 + 1
            byte[] r1 = r10.f25043j
            int r2 = r14.f25057a
            int r3 = r2 >> 2
            r3 = r3 & 63
            byte r3 = r1[r3]
            r11[r12] = r3
            int r3 = r12 + 2
            r14.f25060d = r3
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r2 = r1[r2]
            r11[r13] = r2
            byte[] r13 = f25040o
            if (r1 != r13) goto L_0x0099
            int r13 = r12 + 3
            byte r1 = r10.f25051b
            r11[r3] = r1
            int r2 = r12 + 4
            r14.f25060d = r2
            r11[r13] = r1
        L_0x0099:
            int r13 = r14.f25063g
            int r1 = r14.f25060d
            int r12 = r1 - r12
            int r13 = r13 + r12
            r14.f25063g = r13
            int r12 = r10.f25054e
            if (r12 <= 0) goto L_0x0124
            if (r13 <= 0) goto L_0x0124
            byte[] r12 = r10.f25045l
            int r13 = r12.length
            java.lang.System.arraycopy(r12, r0, r11, r1, r13)
            int r11 = r14.f25060d
            byte[] r12 = r10.f25045l
            int r12 = r12.length
            int r11 = r11 + r12
            r14.f25060d = r11
            goto L_0x0124
        L_0x00b7:
            r2 = r0
        L_0x00b8:
            if (r2 >= r13) goto L_0x0124
            int r3 = r10.f25047n
            byte[] r3 = r10.h(r3, r14)
            int r4 = r14.f25064h
            int r4 = r4 + r1
            int r4 = r4 % 3
            r14.f25064h = r4
            int r5 = r12 + 1
            byte r12 = r11[r12]
            if (r12 >= 0) goto L_0x00cf
            int r12 = r12 + 256
        L_0x00cf:
            int r6 = r14.f25057a
            int r6 = r6 << 8
            int r6 = r6 + r12
            r14.f25057a = r6
            if (r4 != 0) goto L_0x0120
            int r12 = r14.f25060d
            int r4 = r12 + 1
            byte[] r7 = r10.f25043j
            int r8 = r6 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r12] = r8
            int r8 = r12 + 2
            int r9 = r6 >> 12
            r9 = r9 & 63
            byte r9 = r7[r9]
            r3[r4] = r9
            int r4 = r12 + 3
            int r9 = r6 >> 6
            r9 = r9 & 63
            byte r9 = r7[r9]
            r3[r8] = r9
            int r12 = r12 + 4
            r14.f25060d = r12
            r6 = r6 & 63
            byte r6 = r7[r6]
            r3[r4] = r6
            int r4 = r14.f25063g
            int r4 = r4 + 4
            r14.f25063g = r4
            int r6 = r10.f25054e
            if (r6 <= 0) goto L_0x0120
            if (r6 > r4) goto L_0x0120
            byte[] r4 = r10.f25045l
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r3, r12, r6)
            int r12 = r14.f25060d
            byte[] r3 = r10.f25045l
            int r3 = r3.length
            int r12 = r12 + r3
            r14.f25060d = r12
            r14.f25063g = r0
        L_0x0120:
            int r2 = r2 + 1
            r12 = r5
            goto L_0x00b8
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.a.e(byte[], int, int, ln.b$a):void");
    }

    /* access modifiers changed from: protected */
    public boolean k(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.f25044k;
            return b10 < bArr.length && bArr[b10] != -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int r9, byte[] r10, boolean r11, kn.a r12) {
        /*
            r8 = this;
            r1 = 3
            r2 = 4
            r7 = 0
            if (r10 != 0) goto L_0x0007
            r4 = r7
            goto L_0x0009
        L_0x0007:
            int r0 = r10.length
            r4 = r0
        L_0x0009:
            r5 = 61
            r0 = r8
            r3 = r9
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            byte[] r12 = f25042q
            r8.f25044k = r12
            r12 = 0
            r0 = 4
            if (r10 == 0) goto L_0x002f
            boolean r1 = r8.c(r10)
            if (r1 != 0) goto L_0x0034
            if (r9 <= 0) goto L_0x002f
            int r9 = r10.length
            int r9 = r9 + r0
            r8.f25047n = r9
            int r9 = r10.length
            byte[] r9 = new byte[r9]
            r8.f25045l = r9
            int r12 = r10.length
            java.lang.System.arraycopy(r10, r7, r9, r7, r12)
            goto L_0x0054
        L_0x002f:
            r8.f25047n = r0
            r8.f25045l = r12
            goto L_0x0054
        L_0x0034:
            java.lang.String r9 = ln.c.b(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "lineSeparator must not contain base64 characters: ["
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = "]"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0054:
            int r9 = r8.f25047n
            int r9 = r9 + -1
            r8.f25046m = r9
            if (r11 == 0) goto L_0x005f
            byte[] r9 = f25041p
            goto L_0x0061
        L_0x005f:
            byte[] r9 = f25040o
        L_0x0061:
            r8.f25043j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.a.<init>(int, byte[], boolean, kn.a):void");
    }

    public a(boolean z10) {
        this(76, b.f25049i, z10);
    }
}
