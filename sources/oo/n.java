package oo;

final class n {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f30274a;

    protected n(m mVar, byte[][] bArr) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        } else if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        } else if (a0.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        } else if (bArr.length == mVar.a()) {
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10].length == mVar.c()) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("wrong publicKey format");
                }
            }
            this.f30274a = a0.d(bArr);
        } else {
            throw new IllegalArgumentException("wrong publicKey size");
        }
    }

    /* access modifiers changed from: protected */
    public byte[][] a() {
        return a0.d(this.f30274a);
    }
}
