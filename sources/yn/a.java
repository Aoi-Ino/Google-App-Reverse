package yn;

public abstract class a implements xn.a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f33085a = new byte[4];

    /* renamed from: b  reason: collision with root package name */
    private int f33086b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f33087c;

    protected a() {
    }

    public void d(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int max = Math.max(0, i11);
        if (this.f33086b != 0) {
            int i13 = 0;
            while (true) {
                if (i13 >= max) {
                    i12 = i13;
                    break;
                }
                byte[] bArr2 = this.f33085a;
                int i14 = this.f33086b;
                int i15 = i14 + 1;
                this.f33086b = i15;
                int i16 = i13 + 1;
                bArr2[i14] = bArr[i13 + i10];
                if (i15 == 4) {
                    j(bArr2, 0);
                    this.f33086b = 0;
                    i12 = i16;
                    break;
                }
                i13 = i16;
            }
        }
        int i17 = ((max - i12) & -4) + i12;
        while (i12 < i17) {
            j(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < max) {
            byte[] bArr3 = this.f33085a;
            int i18 = this.f33086b;
            this.f33086b = i18 + 1;
            bArr3[i18] = bArr[i12 + i10];
            i12++;
        }
        this.f33087c += (long) max;
    }

    public void e(byte b10) {
        byte[] bArr = this.f33085a;
        int i10 = this.f33086b;
        int i11 = i10 + 1;
        this.f33086b = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            j(bArr, 0);
            this.f33086b = 0;
        }
        this.f33087c++;
    }

    public void g() {
        long j10 = this.f33087c << 3;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            e(b10);
            if (this.f33086b != 0) {
                b10 = 0;
            } else {
                i(j10);
                h();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    /* access modifiers changed from: protected */
    public abstract void i(long j10);

    /* access modifiers changed from: protected */
    public abstract void j(byte[] bArr, int i10);

    public void k() {
        this.f33087c = 0;
        this.f33086b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f33085a;
            if (i10 < bArr.length) {
                bArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }
}
