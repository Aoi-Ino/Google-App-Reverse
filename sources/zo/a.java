package zo;

import java.lang.reflect.Array;

public class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private int[][] f33328c;

    /* renamed from: d  reason: collision with root package name */
    private int f33329d;

    public a(int i10, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length == ((i10 + 31) >> 5)) {
            this.f33340b = i10;
            this.f33339a = iArr.length;
            this.f33329d = iArr2.length;
            int i11 = i10 & 31;
            int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
            for (int i13 = 0; i13 < this.f33339a; i13++) {
                int[] iArr3 = iArr[i13];
                int i14 = this.f33329d - 1;
                iArr3[i14] = iArr3[i14] & i12;
            }
            this.f33328c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public byte[] c() {
        int i10 = this.f33339a;
        int i11 = 8;
        byte[] bArr = new byte[((((this.f33340b + 7) >>> 3) * i10) + 8)];
        f.a(i10, bArr, 0);
        f.a(this.f33340b, bArr, 4);
        int i12 = this.f33340b;
        int i13 = i12 >>> 5;
        int i14 = i12 & 31;
        for (int i15 = 0; i15 < this.f33339a; i15++) {
            int i16 = 0;
            while (i16 < i13) {
                f.a(this.f33328c[i15][i16], bArr, i11);
                i16++;
                i11 += 4;
            }
            int i17 = 0;
            while (i17 < i14) {
                bArr[i11] = (byte) ((this.f33328c[i15][i13] >>> i17) & 255);
                i17 += 8;
                i11++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f33339a != aVar.f33339a || this.f33340b != aVar.f33340b || this.f33329d != aVar.f33329d) {
            return false;
        }
        for (int i10 = 0; i10 < this.f33339a; i10++) {
            if (!d.b(this.f33328c[i10], aVar.f33328c[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = (((this.f33339a * 31) + this.f33340b) * 31) + this.f33329d;
        for (int i11 = 0; i11 < this.f33339a; i11++) {
            i10 = (i10 * 31) + ap.a.m(this.f33328c[i11]);
        }
        return i10;
    }

    public String toString() {
        int i10 = this.f33340b & 31;
        int i11 = this.f33329d;
        if (i10 != 0) {
            i11--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < this.f33339a; i12++) {
            stringBuffer.append(i12 + ": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f33328c[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i16 = this.f33328c[i12][this.f33329d - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public a(a aVar) {
        this.f33340b = aVar.a();
        this.f33339a = aVar.b();
        this.f33329d = aVar.f33329d;
        this.f33328c = new int[aVar.f33328c.length][];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.f33328c;
            if (i10 < iArr.length) {
                iArr[i10] = d.a(aVar.f33328c[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public a(byte[] bArr) {
        if (bArr.length >= 9) {
            this.f33339a = f.e(bArr, 0);
            int e10 = f.e(bArr, 4);
            this.f33340b = e10;
            int i10 = this.f33339a;
            int i11 = ((e10 + 7) >>> 3) * i10;
            if (i10 > 0) {
                int i12 = 8;
                if (i11 == bArr.length - 8) {
                    int i13 = (e10 + 31) >>> 5;
                    this.f33329d = i13;
                    this.f33328c = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i10, i13});
                    int i14 = this.f33340b;
                    int i15 = i14 >> 5;
                    int i16 = i14 & 31;
                    for (int i17 = 0; i17 < this.f33339a; i17++) {
                        int i18 = 0;
                        while (i18 < i15) {
                            this.f33328c[i17][i18] = f.e(bArr, i12);
                            i18++;
                            i12 += 4;
                        }
                        int i19 = 0;
                        while (i19 < i16) {
                            int[] iArr = this.f33328c[i17];
                            iArr[i15] = ((bArr[i12] & 255) << i19) ^ iArr[i15];
                            i19 += 8;
                            i12++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
