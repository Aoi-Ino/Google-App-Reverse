package jo;

import zn.a;

public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    private int f24669f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f24670g;

    public b(int i10, byte[] bArr) {
        super(false);
        if (bArr.length == c.c(i10)) {
            this.f24669f = i10;
            this.f24670g = ap.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return ap.a.d(this.f24670g);
    }

    public int b() {
        return this.f24669f;
    }
}
