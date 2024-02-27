package yn;

import ap.f;
import xn.a;

public abstract class c implements a {

    /* renamed from: o  reason: collision with root package name */
    static final long[] f33095o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f33096a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f33097b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f33098c;

    /* renamed from: d  reason: collision with root package name */
    private long f33099d;

    /* renamed from: e  reason: collision with root package name */
    protected long f33100e;

    /* renamed from: f  reason: collision with root package name */
    protected long f33101f;

    /* renamed from: g  reason: collision with root package name */
    protected long f33102g;

    /* renamed from: h  reason: collision with root package name */
    protected long f33103h;

    /* renamed from: i  reason: collision with root package name */
    protected long f33104i;

    /* renamed from: j  reason: collision with root package name */
    protected long f33105j;

    /* renamed from: k  reason: collision with root package name */
    protected long f33106k;

    /* renamed from: l  reason: collision with root package name */
    protected long f33107l;

    /* renamed from: m  reason: collision with root package name */
    private long[] f33108m = new long[80];

    /* renamed from: n  reason: collision with root package name */
    private int f33109n;

    protected c() {
        r();
    }

    private long g(long j10, long j11, long j12) {
        return ((~j10) & j12) ^ (j11 & j10);
    }

    private long h(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    private long i(long j10) {
        return (j10 >>> 7) ^ (((j10 << 63) | (j10 >>> 1)) ^ ((j10 << 56) | (j10 >>> 8)));
    }

    private long j(long j10) {
        return (j10 >>> 6) ^ (((j10 << 45) | (j10 >>> 19)) ^ ((j10 << 3) | (j10 >>> 61)));
    }

    private long k(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    private long l(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    private void m() {
        long j10 = this.f33098c;
        if (j10 > 2305843009213693951L) {
            this.f33099d += j10 >>> 61;
            this.f33098c = j10 & 2305843009213693951L;
        }
    }

    public void d(byte[] bArr, int i10, int i11) {
        while (this.f33097b != 0 && i11 > 0) {
            e(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > this.f33096a.length) {
            q(bArr, i10);
            byte[] bArr2 = this.f33096a;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f33098c += (long) bArr2.length;
        }
        while (i11 > 0) {
            e(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public void e(byte b10) {
        byte[] bArr = this.f33096a;
        int i10 = this.f33097b;
        int i11 = i10 + 1;
        this.f33097b = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            q(bArr, 0);
            this.f33097b = 0;
        }
        this.f33098c++;
    }

    public void n() {
        m();
        long j10 = this.f33098c << 3;
        long j11 = this.f33099d;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            e(b10);
            if (this.f33097b != 0) {
                b10 = 0;
            } else {
                p(j10, j11);
                o();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o() {
        m();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f33108m;
            long j10 = j(jArr[i10 - 2]);
            long[] jArr2 = this.f33108m;
            jArr[i10] = j10 + jArr2[i10 - 7] + i(jArr2[i10 - 15]) + this.f33108m[i10 - 16];
        }
        long j11 = this.f33100e;
        long j12 = this.f33101f;
        long j13 = this.f33102g;
        long j14 = this.f33103h;
        long j15 = this.f33104i;
        long j16 = this.f33105j;
        long j17 = this.f33106k;
        long j18 = j16;
        long j19 = j14;
        int i11 = 0;
        long j20 = j12;
        long j21 = j13;
        long j22 = j15;
        int i12 = 0;
        long j23 = this.f33107l;
        long j24 = j17;
        long j25 = j11;
        long j26 = j24;
        while (i12 < 10) {
            int i13 = i12;
            long j27 = j22;
            long[] jArr3 = f33095o;
            int i14 = i11 + 1;
            long l10 = j23 + l(j22) + g(j22, j18, j26) + jArr3[i11] + this.f33108m[i11];
            long k10 = l10 + k(j25) + h(j25, j20, j21);
            long j28 = j19 + l10;
            long j29 = j28;
            int i15 = i11 + 2;
            long l11 = j26 + l(j28) + g(j28, j27, j18) + jArr3[i14] + this.f33108m[i14];
            long j30 = k10;
            long j31 = j21 + l11;
            long k11 = l11 + k(k10) + h(k10, j25, j20);
            long l12 = l(j31);
            long j32 = j31;
            long j33 = k11;
            int i16 = i11 + 3;
            long g10 = j18 + l12 + g(j31, j29, j27) + jArr3[i15] + this.f33108m[i15];
            long j34 = j20 + g10;
            long k12 = g10 + k(j33) + h(j33, j30, j25);
            long l13 = l(j34);
            long j35 = j34;
            long j36 = k12;
            int i17 = i11 + 4;
            long g11 = j27 + l13 + g(j34, j32, j29) + jArr3[i16] + this.f33108m[i16];
            long j37 = j25 + g11;
            long k13 = g11 + k(j36) + h(j36, j33, j30);
            long l14 = l(j37);
            long j38 = j37;
            long j39 = k13;
            int i18 = i11 + 5;
            long g12 = j29 + l14 + g(j37, j35, j32) + jArr3[i17] + this.f33108m[i17];
            long j40 = j36;
            long j41 = j36;
            long j42 = j30 + g12;
            long k14 = g12 + k(j39) + h(j39, j40, j33);
            long l15 = l(j42);
            long j43 = j42;
            long j44 = k14;
            int i19 = i11 + 6;
            long g13 = j32 + l15 + g(j42, j38, j35) + jArr3[i18] + this.f33108m[i18];
            long j45 = j33 + g13;
            long k15 = g13 + k(j44) + h(j44, j39, j41);
            long l16 = l(j45);
            j26 = j45;
            long j46 = k15;
            int i20 = i11 + 7;
            long g14 = j35 + l16 + g(j45, j43, j38) + jArr3[i19] + this.f33108m[i19];
            long j47 = j41 + g14;
            long j48 = j44;
            long j49 = j44;
            long j50 = j47;
            long k16 = g14 + k(j46) + h(j46, j48, j39);
            long l17 = l(j50);
            j18 = j50;
            j20 = k16;
            i11 += 8;
            long g15 = j38 + l17 + g(j50, j26, j43) + jArr3[i20] + this.f33108m[i20];
            long k17 = g15 + k(j20) + h(j20, j46, j49);
            i12 = i13 + 1;
            j22 = j39 + g15;
            j21 = j46;
            j23 = j43;
            j19 = j49;
            j25 = k17;
        }
        this.f33100e += j25;
        this.f33101f += j20;
        this.f33102g += j21;
        this.f33103h += j19;
        this.f33104i += j22;
        this.f33105j += j18;
        this.f33106k += j26;
        this.f33107l += j23;
        this.f33109n = 0;
        for (int i21 = 0; i21 < 16; i21++) {
            this.f33108m[i21] = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void p(long j10, long j11) {
        if (this.f33109n > 14) {
            o();
        }
        long[] jArr = this.f33108m;
        jArr[14] = j11;
        jArr[15] = j10;
    }

    /* access modifiers changed from: protected */
    public void q(byte[] bArr, int i10) {
        this.f33108m[this.f33109n] = f.b(bArr, i10);
        int i11 = this.f33109n + 1;
        this.f33109n = i11;
        if (i11 == 16) {
            o();
        }
    }

    public void r() {
        this.f33098c = 0;
        this.f33099d = 0;
        int i10 = 0;
        this.f33097b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f33096a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f33109n = 0;
        while (true) {
            long[] jArr = this.f33108m;
            if (i10 != jArr.length) {
                jArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
