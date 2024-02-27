package androidx.core.content.res;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f2304a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2305b;

    /* renamed from: c  reason: collision with root package name */
    private final float f2306c;

    /* renamed from: d  reason: collision with root package name */
    private final float f2307d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2308e;

    /* renamed from: f  reason: collision with root package name */
    private final float f2309f;

    /* renamed from: g  reason: collision with root package name */
    private final float f2310g;

    /* renamed from: h  reason: collision with root package name */
    private final float f2311h;

    /* renamed from: i  reason: collision with root package name */
    private final float f2312i;

    a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f2304a = f10;
        this.f2305b = f11;
        this.f2306c = f12;
        this.f2307d = f13;
        this.f2308e = f14;
        this.f2309f = f15;
        this.f2310g = f16;
        this.f2311h = f17;
        this.f2312i = f18;
    }

    private static a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        a aVar = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int p10 = e(f17, f11, f10).p();
            float b10 = b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f14 = abs;
                    f16 = a10;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            } else if (b10 < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return aVar;
    }

    static a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, l.f2349k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i10, l lVar, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr2;
        b.f(i10, fArr3);
        float[][] fArr4 = b.f2313a;
        float f10 = fArr3[0];
        float[] fArr5 = fArr4[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = (fArr5[0] * f10) + (fArr5[1] * f11) + (fArr5[2] * f12);
        float[] fArr6 = fArr4[1];
        float f14 = (fArr6[0] * f10) + (fArr6[1] * f11) + (fArr6[2] * f12);
        float[] fArr7 = fArr4[2];
        float f15 = lVar.i()[0] * f13;
        float f16 = lVar.i()[1] * f14;
        float f17 = lVar.i()[2] * ((f10 * fArr7[0]) + (f11 * fArr7[1]) + (f12 * fArr7[2]));
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f15))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f18 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d10)) / 11.0f;
        float f19 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = (((signum * 20.0f) + f20) + (21.0f * signum3)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f19, (double) f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = (3.1415927f * atan2) / 180.0f;
        float f24 = f21;
        float f25 = f19;
        float pow4 = ((float) Math.pow((double) ((f22 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float b10 = (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f) * lVar.d();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f18 * f18) + (f25 * f25))))) / (f24 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        float d11 = lVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d11) + 1.0f))) * 43.85965f;
        double d12 = (double) f23;
        float cos = ((float) Math.cos(d12)) * log;
        float sin = log * ((float) Math.sin(d12));
        fArr3[0] = atan2;
        fArr3[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b10;
            fArr[2] = d11;
            fArr[3] = sqrt2;
            fArr[4] = f26;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, l.f2349k);
    }

    private static a f(float f10, float f11, float f12, l lVar) {
        float f13 = f10;
        double d10 = ((double) f13) / 100.0d;
        float b10 = (4.0f / lVar.b()) * ((float) Math.sqrt(d10)) * (lVar.a() + 4.0f) * lVar.d();
        float d11 = f11 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float log = ((float) Math.log((((double) d11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f13, b10, d11, sqrt, f14, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, l.f2349k);
    }

    static int n(float f10, float f11, float f12, l lVar) {
        if (((double) f11) < 1.0d || ((double) Math.round(f12)) <= 0.0d || ((double) Math.round(f12)) >= 100.0d) {
            return b.a(f12);
        }
        float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        a aVar = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            a b10 = b(min, f14, f12);
            if (!z10) {
                if (b10 == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    aVar = b10;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else if (b10 != null) {
                return b10.o(lVar);
            } else {
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return aVar == null ? b.a(f12) : aVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l10 * l10) + (g10 * g10) + (h10 * h10))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f2311h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f2312i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f2305b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f2304a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f2306c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f2310g;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float pow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (double) ((j() * 3.1415927f) / 180.0f);
        float a10 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f10 = a10 / lVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f11 = (((0.305f + f10) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f15) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))))), 2.380952380952381d));
        float signum2 = Math.signum(f16) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
        float signum3 = Math.signum(f17) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
        float f18 = signum / lVar.i()[0];
        float f19 = signum2 / lVar.i()[1];
        float f20 = signum3 / lVar.i()[2];
        float[][] fArr = b.f2314b;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f20);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b((double) f21, (double) ((fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f20)), (double) ((f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.f2349k);
    }
}
