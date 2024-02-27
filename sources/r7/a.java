package r7;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f15607a;

    /* renamed from: b  reason: collision with root package name */
    private int f15608b;

    public a() {
        this.f15607a = null;
        this.f15608b = 0;
    }

    public int a(int i10) {
        return this.f15607a[i10] & 255;
    }

    public void b(int i10, int i11) {
        this.f15607a[i10] = (byte) i11;
    }

    public void c(byte[] bArr, int i10, int i11) {
        this.f15607a = new byte[i11];
        this.f15608b = i11;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f15607a[i12] = bArr[i10 + i12];
        }
    }

    public int d() {
        return this.f15608b;
    }

    public a(int i10) {
        this.f15607a = new byte[i10];
        this.f15608b = i10;
    }
}
