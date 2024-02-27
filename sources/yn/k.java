package yn;

import xn.b;

public class k extends b implements b {
    public k(int i10) {
        super(r(i10));
    }

    private static int r(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHAKE");
    }

    public int a(byte[] bArr, int i10) {
        return f(bArr, i10, c());
    }

    public String b() {
        return "SHAKE" + this.f33093e;
    }

    public int c() {
        return this.f33093e / 4;
    }

    public int f(byte[] bArr, int i10, int i11) {
        int s10 = s(bArr, i10, i11);
        p();
        return s10;
    }

    public int s(byte[] bArr, int i10, int i11) {
        if (!this.f33094f) {
            l(15, 4);
        }
        q(bArr, i10, ((long) i11) * 8);
        return i11;
    }
}
