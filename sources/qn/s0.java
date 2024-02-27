package qn;

public class s0 extends c {

    /* renamed from: h  reason: collision with root package name */
    private final int f30987h;

    /* renamed from: i  reason: collision with root package name */
    private final c[] f30988i;

    public s0(byte[] bArr, int i10) {
        this(bArr, i10, 1000);
    }

    static byte[] o0(c[] cVarArr) {
        if (r0 == 0) {
            return new byte[]{0};
        } else if (r0 == 1) {
            return cVarArr[0].f30885e;
        } else {
            int i10 = r0 - 1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                byte[] bArr = cVarArr[i11].f30885e;
                if (bArr[0] == 0) {
                    i12 += bArr.length - 1;
                    i11++;
                } else {
                    throw new IllegalArgumentException("only the last nested bitstring can have padding");
                }
            }
            byte[] bArr2 = cVarArr[i10].f30885e;
            byte b10 = bArr2[0];
            byte[] bArr3 = new byte[(i12 + bArr2.length)];
            bArr3[0] = b10;
            int i13 = 1;
            for (c cVar : cVarArr) {
                byte[] bArr4 = cVar.f30885e;
                int length = bArr4.length - 1;
                System.arraycopy(bArr4, 1, bArr3, i13, length);
                i13 += length;
            }
            return bArr3;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        if (!E()) {
            byte[] bArr = this.f30885e;
            d2.p0(xVar, z10, bArr, 0, bArr.length);
            return;
        }
        xVar.s(z10, 35);
        xVar.i(128);
        c[] cVarArr = this.f30988i;
        if (cVarArr != null) {
            xVar.v(cVarArr);
        } else {
            byte[] bArr2 = this.f30885e;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length = bArr2.length;
                int i10 = length - 1;
                int i11 = this.f30987h - 1;
                while (i10 > i11) {
                    d2.o0(xVar, true, (byte) 0, this.f30885e, length - i10, i11);
                    i10 -= i11;
                }
                d2.o0(xVar, true, b10, this.f30885e, length - i10, i10);
            }
        }
        xVar.i(0);
        xVar.i(0);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f30988i != null || this.f30885e.length > this.f30987h;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        if (!E()) {
            return d2.q0(z10, this.f30885e.length);
        }
        int i10 = z10 ? 4 : 3;
        if (this.f30988i != null) {
            int i11 = 0;
            while (true) {
                c[] cVarArr = this.f30988i;
                if (i11 >= cVarArr.length) {
                    return i10;
                }
                i10 += cVarArr[i11].T(true);
                i11++;
            }
        } else {
            byte[] bArr = this.f30885e;
            if (bArr.length < 2) {
                return i10;
            }
            int i12 = this.f30987h;
            int length = (bArr.length - 2) / (i12 - 1);
            return i10 + (d2.q0(true, i12) * length) + d2.q0(true, this.f30885e.length - (length * (this.f30987h - 1)));
        }
    }

    public s0(byte[] bArr, int i10, int i11) {
        super(bArr, i10);
        this.f30988i = null;
        this.f30987h = i11;
    }

    public s0(c[] cVarArr) {
        this(cVarArr, 1000);
    }

    public s0(c[] cVarArr, int i10) {
        super(o0(cVarArr), false);
        this.f30988i = cVarArr;
        this.f30987h = i10;
    }
}
