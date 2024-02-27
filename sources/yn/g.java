package yn;

import ap.f;

public class g extends a {

    /* renamed from: n  reason: collision with root package name */
    static final int[] f33134n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: d  reason: collision with root package name */
    private int f33135d;

    /* renamed from: e  reason: collision with root package name */
    private int f33136e;

    /* renamed from: f  reason: collision with root package name */
    private int f33137f;

    /* renamed from: g  reason: collision with root package name */
    private int f33138g;

    /* renamed from: h  reason: collision with root package name */
    private int f33139h;

    /* renamed from: i  reason: collision with root package name */
    private int f33140i;

    /* renamed from: j  reason: collision with root package name */
    private int f33141j;

    /* renamed from: k  reason: collision with root package name */
    private int f33142k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f33143l = new int[64];

    /* renamed from: m  reason: collision with root package name */
    private int f33144m;

    public g() {
        k();
    }

    private static int l(int i10, int i11, int i12) {
        return ((~i10) & i12) ^ (i11 & i10);
    }

    private static int m(int i10, int i11, int i12) {
        return ((i10 ^ i11) & i12) | (i10 & i11);
    }

    private static int n(int i10) {
        return ((i10 << 10) | (i10 >>> 22)) ^ (((i10 >>> 2) | (i10 << 30)) ^ ((i10 >>> 13) | (i10 << 19)));
    }

    private static int o(int i10) {
        return ((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)));
    }

    private static int p(int i10) {
        return (i10 >>> 3) ^ (((i10 >>> 7) | (i10 << 25)) ^ ((i10 >>> 18) | (i10 << 14)));
    }

    private static int q(int i10) {
        return (i10 >>> 10) ^ (((i10 >>> 17) | (i10 << 15)) ^ ((i10 >>> 19) | (i10 << 13)));
    }

    public int a(byte[] bArr, int i10) {
        g();
        f.c(this.f33135d, bArr, i10);
        f.c(this.f33136e, bArr, i10 + 4);
        f.c(this.f33137f, bArr, i10 + 8);
        f.c(this.f33138g, bArr, i10 + 12);
        f.c(this.f33139h, bArr, i10 + 16);
        f.c(this.f33140i, bArr, i10 + 20);
        f.c(this.f33141j, bArr, i10 + 24);
        f.c(this.f33142k, bArr, i10 + 28);
        k();
        return 32;
    }

    public String b() {
        return "SHA-256";
    }

    public int c() {
        return 32;
    }

    /* access modifiers changed from: protected */
    public void h() {
        for (int i10 = 16; i10 <= 63; i10++) {
            int[] iArr = this.f33143l;
            int q10 = q(iArr[i10 - 2]);
            int[] iArr2 = this.f33143l;
            iArr[i10] = q10 + iArr2[i10 - 7] + p(iArr2[i10 - 15]) + this.f33143l[i10 - 16];
        }
        int i11 = this.f33135d;
        int i12 = this.f33136e;
        int i13 = this.f33137f;
        int i14 = this.f33138g;
        int i15 = this.f33139h;
        int i16 = this.f33140i;
        int i17 = this.f33141j;
        int i18 = this.f33142k;
        int i19 = 0;
        for (int i20 = 0; i20 < 8; i20++) {
            int o10 = o(i15) + l(i15, i16, i17);
            int[] iArr3 = f33134n;
            int i21 = i18 + o10 + iArr3[i19] + this.f33143l[i19];
            int i22 = i14 + i21;
            int n10 = i21 + n(i11) + m(i11, i12, i13);
            int i23 = i19 + 1;
            int o11 = i17 + o(i22) + l(i22, i15, i16) + iArr3[i23] + this.f33143l[i23];
            int i24 = i13 + o11;
            int n11 = o11 + n(n10) + m(n10, i11, i12);
            int i25 = i19 + 2;
            int o12 = i16 + o(i24) + l(i24, i22, i15) + iArr3[i25] + this.f33143l[i25];
            int i26 = i12 + o12;
            int n12 = o12 + n(n11) + m(n11, n10, i11);
            int i27 = i19 + 3;
            int o13 = i15 + o(i26) + l(i26, i24, i22) + iArr3[i27] + this.f33143l[i27];
            int i28 = i11 + o13;
            int n13 = o13 + n(n12) + m(n12, n11, n10);
            int i29 = i19 + 4;
            int o14 = i22 + o(i28) + l(i28, i26, i24) + iArr3[i29] + this.f33143l[i29];
            i18 = n10 + o14;
            i14 = o14 + n(n13) + m(n13, n12, n11);
            int i30 = i19 + 5;
            int o15 = i24 + o(i18) + l(i18, i28, i26) + iArr3[i30] + this.f33143l[i30];
            i17 = n11 + o15;
            i13 = o15 + n(i14) + m(i14, n13, n12);
            int i31 = i19 + 6;
            int o16 = i26 + o(i17) + l(i17, i18, i28) + iArr3[i31] + this.f33143l[i31];
            i16 = n12 + o16;
            i12 = o16 + n(i13) + m(i13, i14, n13);
            int i32 = i19 + 7;
            int o17 = i28 + o(i16) + l(i16, i17, i18) + iArr3[i32] + this.f33143l[i32];
            i15 = n13 + o17;
            i11 = o17 + n(i12) + m(i12, i13, i14);
            i19 += 8;
        }
        this.f33135d += i11;
        this.f33136e += i12;
        this.f33137f += i13;
        this.f33138g += i14;
        this.f33139h += i15;
        this.f33140i += i16;
        this.f33141j += i17;
        this.f33142k += i18;
        this.f33144m = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            this.f33143l[i33] = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void i(long j10) {
        if (this.f33144m > 14) {
            h();
        }
        int[] iArr = this.f33143l;
        iArr[14] = (int) (j10 >>> 32);
        iArr[15] = (int) j10;
    }

    /* access modifiers changed from: protected */
    public void j(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        int[] iArr = this.f33143l;
        int i12 = this.f33144m;
        iArr[i12] = i11;
        int i13 = i12 + 1;
        this.f33144m = i13;
        if (i13 == 16) {
            h();
        }
    }

    public void k() {
        super.k();
        this.f33135d = 1779033703;
        this.f33136e = -1150833019;
        this.f33137f = 1013904242;
        this.f33138g = -1521486534;
        this.f33139h = 1359893119;
        this.f33140i = -1694144372;
        this.f33141j = 528734635;
        this.f33142k = 1541459225;
        this.f33144m = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f33143l;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
