package v7;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f17357a = 0;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f17358b = new byte[32];

    private void d(int i10) {
        int i11 = this.f17357a >> 3;
        byte[] bArr = this.f17358b;
        if (i11 == bArr.length) {
            byte[] bArr2 = new byte[(bArr.length << 1)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f17358b = bArr2;
        }
        byte[] bArr3 = this.f17358b;
        int i12 = this.f17357a;
        bArr3[i12 >> 3] = (byte) i10;
        this.f17357a = i12 + 8;
    }

    public void a(int i10) {
        if (i10 == 0 || i10 == 1) {
            int i11 = this.f17357a & 7;
            if (i11 == 0) {
                d(0);
                this.f17357a -= 8;
            }
            byte[] bArr = this.f17358b;
            int i12 = this.f17357a;
            int i13 = i12 >> 3;
            bArr[i13] = (byte) ((i10 << (7 - i11)) | bArr[i13]);
            this.f17357a = i12 + 1;
            return;
        }
        throw new IllegalArgumentException("Bad bit");
    }

    public void b(a aVar) {
        int g10 = aVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            a(aVar.e(i10));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        while (i11 > 0) {
            if ((this.f17357a & 7) != 0 || i11 < 8) {
                a((i10 >> (i11 - 1)) & 1);
                i11--;
            } else {
                d((i10 >> (i11 - 8)) & 255);
                i11 -= 8;
            }
        }
    }

    public int e(int i10) {
        if (i10 >= 0 && i10 < this.f17357a) {
            return ((this.f17358b[i10 >> 3] & 255) >> (7 - (i10 & 7))) & 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bad index: ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public byte[] f() {
        return this.f17358b;
    }

    public int g() {
        return this.f17357a;
    }

    public int h() {
        return (this.f17357a + 7) >> 3;
    }

    public void i(a aVar) {
        if (this.f17357a == aVar.g()) {
            int i10 = (this.f17357a + 7) >> 3;
            for (int i11 = 0; i11 < i10; i11++) {
                byte[] bArr = this.f17358b;
                bArr[i11] = (byte) (bArr[i11] ^ aVar.f17358b[i11]);
            }
            return;
        }
        throw new IllegalArgumentException("BitVector sizes don't match");
    }

    public String toString() {
        char c10;
        StringBuffer stringBuffer = new StringBuffer(this.f17357a);
        for (int i10 = 0; i10 < this.f17357a; i10++) {
            if (e(i10) == 0) {
                c10 = '0';
            } else if (e(i10) == 1) {
                c10 = '1';
            } else {
                throw new IllegalArgumentException("Byte isn't 0 or 1");
            }
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }
}
