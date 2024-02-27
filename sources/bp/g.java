package bp;

import java.io.IOException;
import java.io.OutputStream;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f20035a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    protected final byte[] f20036b = new byte[128];

    public g() {
        f();
    }

    private static boolean e(char c10) {
        return c10 == 10 || c10 == 13 || c10 == 9 || c10 == ' ';
    }

    public int a(int i10) {
        return i10 * 2;
    }

    public int b(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        if (i11 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(36, i12);
            outputStream.write(bArr2, 0, d(bArr, i10, min, bArr2, 0));
            i10 += min;
            i12 -= min;
        }
        return i11 * 2;
    }

    public int c(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        byte[] bArr2 = new byte[36];
        int i12 = i11 + i10;
        while (i12 > i10 && e((char) bArr[i12 - 1])) {
            i12--;
        }
        int i13 = 0;
        int i14 = 0;
        while (i10 < i12) {
            while (i10 < i12 && e((char) bArr[i10])) {
                i10++;
            }
            int i15 = i10 + 1;
            byte b10 = this.f20036b[bArr[i10]];
            while (i15 < i12 && e((char) bArr[i15])) {
                i15++;
            }
            int i16 = i15 + 1;
            byte b11 = this.f20036b[bArr[i15]];
            if ((b10 | b11) >= 0) {
                int i17 = i13 + 1;
                bArr2[i13] = (byte) ((b10 << 4) | b11);
                if (i17 == 36) {
                    outputStream.write(bArr2);
                    i13 = 0;
                } else {
                    i13 = i17;
                }
                i14++;
                i10 = i16;
            } else {
                throw new IOException("invalid characters encountered in Hex data");
            }
        }
        if (i13 > 0) {
            outputStream.write(bArr2, 0, i13);
        }
        return i14;
    }

    public int d(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i11 + i10;
        int i14 = i12;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            int i16 = i14 + 1;
            byte[] bArr3 = this.f20035a;
            bArr2[i14] = bArr3[(b10 & 255) >>> 4];
            i14 += 2;
            bArr2[i16] = bArr3[b10 & 15];
            i10 = i15;
        }
        return i14 - i12;
    }

    /* access modifiers changed from: protected */
    public void f() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f20036b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.f20035a;
            if (i10 < bArr2.length) {
                this.f20036b[bArr2[i10]] = (byte) i10;
                i10++;
            } else {
                byte[] bArr3 = this.f20036b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
