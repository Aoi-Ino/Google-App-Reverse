package yn;

import ap.f;

public class e extends a {

    /* renamed from: d  reason: collision with root package name */
    private int f33116d;

    /* renamed from: e  reason: collision with root package name */
    private int f33117e;

    /* renamed from: f  reason: collision with root package name */
    private int f33118f;

    /* renamed from: g  reason: collision with root package name */
    private int f33119g;

    /* renamed from: h  reason: collision with root package name */
    private int f33120h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f33121i = new int[80];

    /* renamed from: j  reason: collision with root package name */
    private int f33122j;

    public e() {
        k();
    }

    private int l(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int m(int i10, int i11, int i12) {
        return (i10 & i12) | (i10 & i11) | (i11 & i12);
    }

    private int n(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    public int a(byte[] bArr, int i10) {
        g();
        f.c(this.f33116d, bArr, i10);
        f.c(this.f33117e, bArr, i10 + 4);
        f.c(this.f33118f, bArr, i10 + 8);
        f.c(this.f33119g, bArr, i10 + 12);
        f.c(this.f33120h, bArr, i10 + 16);
        k();
        return 20;
    }

    public String b() {
        return "SHA-1";
    }

    public int c() {
        return 20;
    }

    /* access modifiers changed from: protected */
    public void h() {
        for (int i10 = 16; i10 < 80; i10++) {
            int[] iArr = this.f33121i;
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = this.f33116d;
        int i13 = this.f33117e;
        int i14 = this.f33118f;
        int i15 = this.f33119g;
        int i16 = this.f33120h;
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            int l10 = i16 + ((i12 << 5) | (i12 >>> 27)) + l(i13, i14, i15) + this.f33121i[i17] + 1518500249;
            int i19 = (i13 >>> 2) | (i13 << 30);
            int l11 = i15 + ((l10 << 5) | (l10 >>> 27)) + l(i12, i19, i14) + this.f33121i[i17 + 1] + 1518500249;
            int i20 = (i12 >>> 2) | (i12 << 30);
            int l12 = i14 + ((l11 << 5) | (l11 >>> 27)) + l(l10, i20, i19) + this.f33121i[i17 + 2] + 1518500249;
            i16 = (l10 >>> 2) | (l10 << 30);
            int i21 = i17 + 4;
            i13 = i19 + ((l12 << 5) | (l12 >>> 27)) + l(l11, i16, i20) + this.f33121i[i17 + 3] + 1518500249;
            i15 = (l11 >>> 2) | (l11 << 30);
            i17 += 5;
            i12 = i20 + ((i13 << 5) | (i13 >>> 27)) + l(l12, i15, i16) + this.f33121i[i21] + 1518500249;
            i14 = (l12 >>> 2) | (l12 << 30);
        }
        for (int i22 = 0; i22 < 4; i22++) {
            int n10 = i16 + ((i12 << 5) | (i12 >>> 27)) + n(i13, i14, i15) + this.f33121i[i17] + 1859775393;
            int i23 = (i13 >>> 2) | (i13 << 30);
            int n11 = i15 + ((n10 << 5) | (n10 >>> 27)) + n(i12, i23, i14) + this.f33121i[i17 + 1] + 1859775393;
            int i24 = (i12 >>> 2) | (i12 << 30);
            int n12 = i14 + ((n11 << 5) | (n11 >>> 27)) + n(n10, i24, i23) + this.f33121i[i17 + 2] + 1859775393;
            i16 = (n10 >>> 2) | (n10 << 30);
            int i25 = i17 + 4;
            i13 = i23 + ((n12 << 5) | (n12 >>> 27)) + n(n11, i16, i24) + this.f33121i[i17 + 3] + 1859775393;
            i15 = (n11 >>> 2) | (n11 << 30);
            i17 += 5;
            i12 = i24 + ((i13 << 5) | (i13 >>> 27)) + n(n12, i15, i16) + this.f33121i[i25] + 1859775393;
            i14 = (n12 >>> 2) | (n12 << 30);
        }
        for (int i26 = 0; i26 < 4; i26++) {
            int m10 = i16 + (((((i12 << 5) | (i12 >>> 27)) + m(i13, i14, i15)) + this.f33121i[i17]) - 1894007588);
            int i27 = (i13 >>> 2) | (i13 << 30);
            int m11 = i15 + (((((m10 << 5) | (m10 >>> 27)) + m(i12, i27, i14)) + this.f33121i[i17 + 1]) - 1894007588);
            int i28 = (i12 >>> 2) | (i12 << 30);
            int m12 = i14 + (((((m11 << 5) | (m11 >>> 27)) + m(m10, i28, i27)) + this.f33121i[i17 + 2]) - 1894007588);
            i16 = (m10 >>> 2) | (m10 << 30);
            int i29 = i17 + 4;
            i13 = i27 + (((((m12 << 5) | (m12 >>> 27)) + m(m11, i16, i28)) + this.f33121i[i17 + 3]) - 1894007588);
            i15 = (m11 >>> 2) | (m11 << 30);
            i17 += 5;
            i12 = i28 + (((((i13 << 5) | (i13 >>> 27)) + m(m12, i15, i16)) + this.f33121i[i29]) - 1894007588);
            i14 = (m12 >>> 2) | (m12 << 30);
        }
        for (int i30 = 0; i30 <= 3; i30++) {
            int n13 = i16 + (((((i12 << 5) | (i12 >>> 27)) + n(i13, i14, i15)) + this.f33121i[i17]) - 899497514);
            int i31 = (i13 >>> 2) | (i13 << 30);
            int n14 = i15 + (((((n13 << 5) | (n13 >>> 27)) + n(i12, i31, i14)) + this.f33121i[i17 + 1]) - 899497514);
            int i32 = (i12 >>> 2) | (i12 << 30);
            int n15 = i14 + (((((n14 << 5) | (n14 >>> 27)) + n(n13, i32, i31)) + this.f33121i[i17 + 2]) - 899497514);
            i16 = (n13 >>> 2) | (n13 << 30);
            int i33 = i17 + 4;
            i13 = i31 + (((((n15 << 5) | (n15 >>> 27)) + n(n14, i16, i32)) + this.f33121i[i17 + 3]) - 899497514);
            i15 = (n14 >>> 2) | (n14 << 30);
            i17 += 5;
            i12 = i32 + (((((i13 << 5) | (i13 >>> 27)) + n(n15, i15, i16)) + this.f33121i[i33]) - 899497514);
            i14 = (n15 >>> 2) | (n15 << 30);
        }
        this.f33116d += i12;
        this.f33117e += i13;
        this.f33118f += i14;
        this.f33119g += i15;
        this.f33120h += i16;
        this.f33122j = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            this.f33121i[i34] = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void i(long j10) {
        if (this.f33122j > 14) {
            h();
        }
        int[] iArr = this.f33121i;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    /* access modifiers changed from: protected */
    public void j(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int[] iArr = this.f33121i;
        int i12 = this.f33122j;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f33122j = i13;
        if (i13 == 16) {
            h();
        }
    }

    public void k() {
        super.k();
        this.f33116d = 1732584193;
        this.f33117e = -271733879;
        this.f33118f = -1732584194;
        this.f33119g = 271733878;
        this.f33120h = -1009589776;
        this.f33122j = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f33121i;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
