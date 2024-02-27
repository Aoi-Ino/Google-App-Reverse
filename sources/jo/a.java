package jo;

public final class a extends zn.a {

    /* renamed from: f  reason: collision with root package name */
    private int f24667f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f24668g;

    public a(int i10, byte[] bArr) {
        super(true);
        if (bArr.length == c.b(i10)) {
            this.f24667f = i10;
            this.f24668g = ap.a.d(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] a() {
        return ap.a.d(this.f24668g);
    }

    public int b() {
        return this.f24667f;
    }
}
