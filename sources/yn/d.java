package yn;

public class d extends a {

    /* renamed from: d  reason: collision with root package name */
    private int f33110d;

    /* renamed from: e  reason: collision with root package name */
    private int f33111e;

    /* renamed from: f  reason: collision with root package name */
    private int f33112f;

    /* renamed from: g  reason: collision with root package name */
    private int f33113g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f33114h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    private int f33115i;

    public d() {
        k();
    }

    private int l(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int m(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private int n(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int o(int i10, int i11, int i12) {
        return (i10 | (~i12)) ^ i11;
    }

    private int p(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private void q(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public int a(byte[] bArr, int i10) {
        g();
        q(this.f33110d, bArr, i10);
        q(this.f33111e, bArr, i10 + 4);
        q(this.f33112f, bArr, i10 + 8);
        q(this.f33113g, bArr, i10 + 12);
        k();
        return 16;
    }

    public String b() {
        return "MD5";
    }

    public int c() {
        return 16;
    }

    /* access modifiers changed from: protected */
    public void h() {
        int i10 = this.f33110d;
        int i11 = this.f33111e;
        int i12 = this.f33112f;
        int i13 = this.f33113g;
        int p10 = p(((i10 + l(i11, i12, i13)) + this.f33114h[0]) - 680876936, 7) + i11;
        int p11 = p(((i13 + l(p10, i11, i12)) + this.f33114h[1]) - 389564586, 12) + p10;
        int p12 = p(i12 + l(p11, p10, i11) + this.f33114h[2] + 606105819, 17) + p11;
        int p13 = p(((i11 + l(p12, p11, p10)) + this.f33114h[3]) - 1044525330, 22) + p12;
        int p14 = p(((p10 + l(p13, p12, p11)) + this.f33114h[4]) - 176418897, 7) + p13;
        int p15 = p(p11 + l(p14, p13, p12) + this.f33114h[5] + 1200080426, 12) + p14;
        int p16 = p(((p12 + l(p15, p14, p13)) + this.f33114h[6]) - 1473231341, 17) + p15;
        int p17 = p(((p13 + l(p16, p15, p14)) + this.f33114h[7]) - 45705983, 22) + p16;
        int p18 = p(p14 + l(p17, p16, p15) + this.f33114h[8] + 1770035416, 7) + p17;
        int p19 = p(((p15 + l(p18, p17, p16)) + this.f33114h[9]) - 1958414417, 12) + p18;
        int p20 = p(((p16 + l(p19, p18, p17)) + this.f33114h[10]) - 42063, 17) + p19;
        int p21 = p(((p17 + l(p20, p19, p18)) + this.f33114h[11]) - 1990404162, 22) + p20;
        int p22 = p(p18 + l(p21, p20, p19) + this.f33114h[12] + 1804603682, 7) + p21;
        int p23 = p(((p19 + l(p22, p21, p20)) + this.f33114h[13]) - 40341101, 12) + p22;
        int p24 = p(((p20 + l(p23, p22, p21)) + this.f33114h[14]) - 1502002290, 17) + p23;
        int p25 = p(p21 + l(p24, p23, p22) + this.f33114h[15] + 1236535329, 22) + p24;
        int p26 = p(((p22 + m(p25, p24, p23)) + this.f33114h[1]) - 165796510, 5) + p25;
        int p27 = p(((p23 + m(p26, p25, p24)) + this.f33114h[6]) - 1069501632, 9) + p26;
        int p28 = p(p24 + m(p27, p26, p25) + this.f33114h[11] + 643717713, 14) + p27;
        int p29 = p(((p25 + m(p28, p27, p26)) + this.f33114h[0]) - 373897302, 20) + p28;
        int p30 = p(((p26 + m(p29, p28, p27)) + this.f33114h[5]) - 701558691, 5) + p29;
        int p31 = p(p27 + m(p30, p29, p28) + this.f33114h[10] + 38016083, 9) + p30;
        int p32 = p(((p28 + m(p31, p30, p29)) + this.f33114h[15]) - 660478335, 14) + p31;
        int p33 = p(((p29 + m(p32, p31, p30)) + this.f33114h[4]) - 405537848, 20) + p32;
        int p34 = p(p30 + m(p33, p32, p31) + this.f33114h[9] + 568446438, 5) + p33;
        int p35 = p(((p31 + m(p34, p33, p32)) + this.f33114h[14]) - 1019803690, 9) + p34;
        int p36 = p(((p32 + m(p35, p34, p33)) + this.f33114h[3]) - 187363961, 14) + p35;
        int p37 = p(p33 + m(p36, p35, p34) + this.f33114h[8] + 1163531501, 20) + p36;
        int p38 = p(((p34 + m(p37, p36, p35)) + this.f33114h[13]) - 1444681467, 5) + p37;
        int p39 = p(((p35 + m(p38, p37, p36)) + this.f33114h[2]) - 51403784, 9) + p38;
        int p40 = p(p36 + m(p39, p38, p37) + this.f33114h[7] + 1735328473, 14) + p39;
        int p41 = p(((p37 + m(p40, p39, p38)) + this.f33114h[12]) - 1926607734, 20) + p40;
        int p42 = p(((p38 + n(p41, p40, p39)) + this.f33114h[5]) - 378558, 4) + p41;
        int p43 = p(((p39 + n(p42, p41, p40)) + this.f33114h[8]) - 2022574463, 11) + p42;
        int p44 = p(p40 + n(p43, p42, p41) + this.f33114h[11] + 1839030562, 16) + p43;
        int p45 = p(((p41 + n(p44, p43, p42)) + this.f33114h[14]) - 35309556, 23) + p44;
        int p46 = p(((p42 + n(p45, p44, p43)) + this.f33114h[1]) - 1530992060, 4) + p45;
        int p47 = p(p43 + n(p46, p45, p44) + this.f33114h[4] + 1272893353, 11) + p46;
        int p48 = p(((p44 + n(p47, p46, p45)) + this.f33114h[7]) - 155497632, 16) + p47;
        int p49 = p(((p45 + n(p48, p47, p46)) + this.f33114h[10]) - 1094730640, 23) + p48;
        int p50 = p(p46 + n(p49, p48, p47) + this.f33114h[13] + 681279174, 4) + p49;
        int p51 = p(((p47 + n(p50, p49, p48)) + this.f33114h[0]) - 358537222, 11) + p50;
        int p52 = p(((p48 + n(p51, p50, p49)) + this.f33114h[3]) - 722521979, 16) + p51;
        int p53 = p(p49 + n(p52, p51, p50) + this.f33114h[6] + 76029189, 23) + p52;
        int p54 = p(((p50 + n(p53, p52, p51)) + this.f33114h[9]) - 640364487, 4) + p53;
        int p55 = p(((p51 + n(p54, p53, p52)) + this.f33114h[12]) - 421815835, 11) + p54;
        int p56 = p(p52 + n(p55, p54, p53) + this.f33114h[15] + 530742520, 16) + p55;
        int p57 = p(((p53 + n(p56, p55, p54)) + this.f33114h[2]) - 995338651, 23) + p56;
        int p58 = p(((p54 + o(p57, p56, p55)) + this.f33114h[0]) - 198630844, 6) + p57;
        int p59 = p(p55 + o(p58, p57, p56) + this.f33114h[7] + 1126891415, 10) + p58;
        int p60 = p(((p56 + o(p59, p58, p57)) + this.f33114h[14]) - 1416354905, 15) + p59;
        int p61 = p(((p57 + o(p60, p59, p58)) + this.f33114h[5]) - 57434055, 21) + p60;
        int p62 = p(p58 + o(p61, p60, p59) + this.f33114h[12] + 1700485571, 6) + p61;
        int p63 = p(((p59 + o(p62, p61, p60)) + this.f33114h[3]) - 1894986606, 10) + p62;
        int p64 = p(((p60 + o(p63, p62, p61)) + this.f33114h[10]) - 1051523, 15) + p63;
        int p65 = p(((p61 + o(p64, p63, p62)) + this.f33114h[1]) - 2054922799, 21) + p64;
        int p66 = p(p62 + o(p65, p64, p63) + this.f33114h[8] + 1873313359, 6) + p65;
        int p67 = p(((p63 + o(p66, p65, p64)) + this.f33114h[15]) - 30611744, 10) + p66;
        int p68 = p(((p64 + o(p67, p66, p65)) + this.f33114h[6]) - 1560198380, 15) + p67;
        int p69 = p(p65 + o(p68, p67, p66) + this.f33114h[13] + 1309151649, 21) + p68;
        int p70 = p(((p66 + o(p69, p68, p67)) + this.f33114h[4]) - 145523070, 6) + p69;
        int p71 = p(((p67 + o(p70, p69, p68)) + this.f33114h[11]) - 1120210379, 10) + p70;
        int p72 = p(p68 + o(p71, p70, p69) + this.f33114h[2] + 718787259, 15) + p71;
        this.f33110d += p70;
        this.f33111e += p(((p69 + o(p72, p71, p70)) + this.f33114h[9]) - 343485551, 21) + p72;
        this.f33112f += p72;
        this.f33113g += p71;
        this.f33115i = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f33114h;
            if (i14 != iArr.length) {
                iArr[i14] = 0;
                i14++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i(long j10) {
        if (this.f33115i > 14) {
            h();
        }
        int[] iArr = this.f33114h;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    /* access modifiers changed from: protected */
    public void j(byte[] bArr, int i10) {
        int[] iArr = this.f33114h;
        int i11 = this.f33115i;
        int i12 = i11 + 1;
        this.f33115i = i12;
        iArr[i11] = ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        if (i12 == 16) {
            h();
        }
    }

    public void k() {
        super.k();
        this.f33110d = 1732584193;
        this.f33111e = -271733879;
        this.f33112f = -1732584194;
        this.f33113g = 271733878;
        this.f33115i = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f33114h;
            if (i10 != iArr.length) {
                iArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
