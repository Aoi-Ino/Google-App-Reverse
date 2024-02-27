package bp;

import java.io.IOException;
import java.io.OutputStream;

public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f20029a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    protected byte f20030b = 61;

    /* renamed from: c  reason: collision with root package name */
    protected final byte[] f20031c = new byte[128];

    public b() {
        g();
    }

    private int d(OutputStream outputStream, char c10, char c11, char c12, char c13) {
        byte b10 = this.f20030b;
        if (c12 == b10) {
            if (c13 == b10) {
                byte[] bArr = this.f20031c;
                byte b11 = bArr[c10];
                byte b12 = bArr[c11];
                if ((b11 | b12) >= 0) {
                    outputStream.write((b11 << 2) | (b12 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c13 == b10) {
            byte[] bArr2 = this.f20031c;
            byte b13 = bArr2[c10];
            byte b14 = bArr2[c11];
            byte b15 = bArr2[c12];
            if ((b13 | b14 | b15) >= 0) {
                outputStream.write((b13 << 2) | (b14 >> 4));
                outputStream.write((b14 << 4) | (b15 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else {
            byte[] bArr3 = this.f20031c;
            byte b16 = bArr3[c10];
            byte b17 = bArr3[c11];
            byte b18 = bArr3[c12];
            byte b19 = bArr3[c13];
            if ((b16 | b17 | b18 | b19) >= 0) {
                outputStream.write((b16 << 2) | (b17 >> 4));
                outputStream.write((b17 << 4) | (b18 >> 2));
                outputStream.write((b18 << 6) | b19);
                return 3;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
    }

    private boolean f(char c10) {
        return c10 == 10 || c10 == 13 || c10 == 9 || c10 == ' ';
    }

    private int h(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && f((char) bArr[i10])) {
            i10++;
        }
        return i10;
    }

    public int a(int i10) {
        return ((i10 + 2) / 3) * 4;
    }

    public int b(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        if (i11 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(54, i12);
            outputStream.write(bArr2, 0, e(bArr, i10, min, bArr2, 0));
            i10 += min;
            i12 -= min;
        }
        return ((i11 + 2) / 3) * 4;
    }

    public int c(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        byte[] bArr2 = bArr;
        int i12 = i10;
        OutputStream outputStream2 = outputStream;
        byte[] bArr3 = new byte[54];
        int i13 = i12 + i11;
        while (i13 > i12 && f((char) bArr2[i13 - 1])) {
            i13--;
        }
        if (i13 == 0) {
            return 0;
        }
        int i14 = i13;
        int i15 = 0;
        while (i14 > i12 && i15 != 4) {
            if (!f((char) bArr2[i14 - 1])) {
                i15++;
            }
            i14--;
        }
        int h10 = h(bArr2, i12, i14);
        int i16 = 0;
        int i17 = 0;
        while (h10 < i14) {
            int i18 = h10 + 1;
            byte b10 = this.f20031c[bArr2[h10]];
            int h11 = h(bArr2, i18, i14);
            int i19 = h11 + 1;
            byte b11 = this.f20031c[bArr2[h11]];
            int h12 = h(bArr2, i19, i14);
            int i20 = h12 + 1;
            byte b12 = this.f20031c[bArr2[h12]];
            int h13 = h(bArr2, i20, i14);
            int i21 = h13 + 1;
            byte b13 = this.f20031c[bArr2[h13]];
            if ((b10 | b11 | b12 | b13) >= 0) {
                bArr3[i16] = (byte) ((b10 << 2) | (b11 >> 4));
                int i22 = i16 + 2;
                bArr3[i16 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
                i16 += 3;
                bArr3[i22] = (byte) ((b12 << 6) | b13);
                if (i16 == 54) {
                    outputStream2.write(bArr3);
                    i16 = 0;
                }
                i17 += 3;
                h10 = h(bArr2, i21, i14);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        if (i16 > 0) {
            outputStream2.write(bArr3, 0, i16);
        }
        int h14 = h(bArr2, h10, i13);
        int h15 = h(bArr2, h14 + 1, i13);
        int h16 = h(bArr2, h15 + 1, i13);
        return i17 + d(outputStream, (char) bArr2[h14], (char) bArr2[h15], (char) bArr2[h16], (char) bArr2[h(bArr2, h16 + 1, i13)]);
    }

    public int e(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = (i10 + i11) - 2;
        int i14 = i10;
        int i15 = i12;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            int i16 = i14 + 2;
            byte b11 = bArr[i14 + 1] & 255;
            i14 += 3;
            byte b12 = bArr[i16];
            byte[] bArr3 = this.f20029a;
            bArr2[i15] = bArr3[(b10 >>> 2) & 63];
            bArr2[i15 + 1] = bArr3[((b10 << 4) | (b11 >>> 4)) & 63];
            int i17 = i15 + 3;
            bArr2[i15 + 2] = bArr3[((b11 << 2) | ((b12 & 255) >>> 6)) & 63];
            i15 += 4;
            bArr2[i17] = bArr3[b12 & 63];
        }
        int i18 = i11 - (i14 - i10);
        if (i18 == 1) {
            byte b13 = bArr[i14] & 255;
            byte[] bArr4 = this.f20029a;
            bArr2[i15] = bArr4[(b13 >>> 2) & 63];
            bArr2[i15 + 1] = bArr4[(b13 << 4) & 63];
            int i19 = i15 + 3;
            byte b14 = this.f20030b;
            bArr2[i15 + 2] = b14;
            i15 += 4;
            bArr2[i19] = b14;
        } else if (i18 == 2) {
            int i20 = i14 + 1;
            byte b15 = bArr[i14] & 255;
            byte b16 = bArr[i20] & 255;
            byte[] bArr5 = this.f20029a;
            bArr2[i15] = bArr5[(b15 >>> 2) & 63];
            bArr2[i15 + 1] = bArr5[((b15 << 4) | (b16 >>> 4)) & 63];
            int i21 = i15 + 3;
            bArr2[i15 + 2] = bArr5[(b16 << 2) & 63];
            i15 += 4;
            bArr2[i21] = this.f20030b;
        }
        return i15 - i12;
    }

    /* access modifiers changed from: protected */
    public void g() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f20031c;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.f20029a;
            if (i10 < bArr2.length) {
                this.f20031c[bArr2[i10]] = (byte) i10;
                i10++;
            } else {
                return;
            }
        }
    }
}
