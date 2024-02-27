package qn;

import ap.h;

public class l1 extends l {
    public l1(byte[] bArr) {
        super(bArr);
    }

    private byte[] n0() {
        byte[] bArr = this.f30951e;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!k0()) {
            byte[] bArr2 = this.f30951e;
            byte[] bArr3 = new byte[(bArr2.length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(h.d("0000Z"), 0, bArr3, this.f30951e.length - 1, 5);
            return bArr3;
        } else if (!l0()) {
            byte[] bArr4 = this.f30951e;
            byte[] bArr5 = new byte[(bArr4.length + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(h.d("00Z"), 0, bArr5, this.f30951e.length - 1, 3);
            return bArr5;
        } else if (!j0()) {
            return this.f30951e;
        } else {
            int length = this.f30951e.length - 2;
            while (length > 0 && this.f30951e[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.f30951e;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[(length + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length + 2)];
            int i10 = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i10);
            bArr8[i10] = 90;
            return bArr8;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 24, n0());
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, n0().length);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }
}
