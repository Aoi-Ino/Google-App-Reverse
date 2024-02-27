package qn;

public abstract class b extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30878f = new a(b.class, 30);

    /* renamed from: e  reason: collision with root package name */
    final char[] f30879e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return b.i0(q1Var.l0());
        }
    }

    b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if ((length & 1) == 0) {
                int i10 = length / 2;
                char[] cArr = new char[i10];
                for (int i11 = 0; i11 != i10; i11++) {
                    int i12 = i11 * 2;
                    cArr[i11] = (char) ((bArr[i12 + 1] & 255) | (bArr[i12] << 8));
                }
                this.f30879e = cArr;
                return;
            }
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        throw new NullPointerException("'string' cannot be null");
    }

    static b i0(byte[] bArr) {
        return new g1(bArr);
    }

    static b j0(char[] cArr) {
        return new g1(cArr);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        int length = this.f30879e.length;
        xVar.s(z10, 30);
        xVar.k(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & -4;
        int i11 = 0;
        while (i11 < i10) {
            char[] cArr = this.f30879e;
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> 8);
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> 8);
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> 8);
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> 8);
            bArr[7] = (byte) c13;
            xVar.j(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = this.f30879e[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> 8);
                i12 += 2;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            xVar.j(bArr, 0, i12);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30879e.length * 2);
    }

    public final int hashCode() {
        return ap.a.l(this.f30879e);
    }

    public final String k0() {
        return new String(this.f30879e);
    }

    public String toString() {
        return k0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof b)) {
            return false;
        }
        return ap.a.b(this.f30879e, ((b) zVar).f30879e);
    }

    b(char[] cArr) {
        if (cArr != null) {
            this.f30879e = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }
}
