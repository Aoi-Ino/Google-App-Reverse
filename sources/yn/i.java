package yn;

public class i extends b {
    public i(int i10) {
        super(r(i10));
    }

    private static int r(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHA-3");
    }

    public int a(byte[] bArr, int i10) {
        l(2, 2);
        return super.a(bArr, i10);
    }

    public String b() {
        return "SHA3-" + this.f33093e;
    }
}
