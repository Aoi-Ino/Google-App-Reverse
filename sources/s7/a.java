package s7;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16054e = new a(285);

    /* renamed from: f  reason: collision with root package name */
    public static final a f16055f = new a(301);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f16056a = new int[256];

    /* renamed from: b  reason: collision with root package name */
    private final int[] f16057b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    private final b f16058c;

    /* renamed from: d  reason: collision with root package name */
    private final b f16059d;

    private a(int i10) {
        int i11 = 1;
        for (int i12 = 0; i12 < 256; i12++) {
            this.f16056a[i12] = i11;
            i11 <<= 1;
            if (i11 >= 256) {
                i11 ^= i10;
            }
        }
        for (int i13 = 0; i13 < 255; i13++) {
            this.f16057b[this.f16056a[i13]] = i13;
        }
        this.f16058c = new b(this, new int[]{0});
        this.f16059d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f16058c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f16056a[i10];
    }

    /* access modifiers changed from: package-private */
    public b d() {
        return this.f16058c;
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        if (i10 != 0) {
            return this.f16056a[255 - this.f16057b[i10]];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        if (i10 != 0) {
            return this.f16057b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int g(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return i11;
        }
        if (i11 == 1) {
            return i10;
        }
        int[] iArr = this.f16056a;
        int[] iArr2 = this.f16057b;
        return iArr[(iArr2[i10] + iArr2[i11]) % 255];
    }
}
