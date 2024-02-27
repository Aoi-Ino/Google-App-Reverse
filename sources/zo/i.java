package zo;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private b f33342a;

    /* renamed from: b  reason: collision with root package name */
    private int f33343b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f33344c;

    public i(b bVar, int i10) {
        this.f33342a = bVar;
        this.f33343b = i10;
        int[] iArr = new int[(i10 + 1)];
        this.f33344c = iArr;
        iArr[i10] = 1;
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f33342a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        int length = this.f33344c.length;
        do {
            this.f33343b = length - 1;
            length = this.f33343b;
            if (length < 0 || this.f33344c[length] != 0) {
            }
            this.f33343b = length - 1;
            length = this.f33343b;
            return;
        } while (this.f33344c[length] != 0);
    }

    private static int i(int[] iArr) {
        int c10 = c(iArr);
        if (c10 == -1) {
            return 0;
        }
        return iArr[c10];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int c10 = c(iArr);
        if (c10 != c(iArr2)) {
            return false;
        }
        for (int i10 = 0; i10 <= c10; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int c10 = c(iArr2);
        if (c10 != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f10 = this.f33342a.f(i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c10 <= c(iArr3)) {
                iArr3 = a(o(p(iArr2, c(iArr3) - c10), this.f33342a.h(i(iArr3), f10)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] o(int[] iArr, int i10) {
        int c10 = c(iArr);
        if (c10 == -1 || i10 == 0) {
            return new int[1];
        }
        if (i10 == 1) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[(c10 + 1)];
        while (c10 >= 0) {
            iArr2[c10] = this.f33342a.h(iArr[c10], i10);
            c10--;
        }
        return iArr2;
    }

    private static int[] p(int[] iArr, int i10) {
        int c10 = c(iArr);
        if (c10 == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[(c10 + i10 + 1)];
        System.arraycopy(iArr, 0, iArr2, i10, c10 + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int c10 = c(iArr);
        if (c10 == -1) {
            return new int[1];
        }
        int i10 = c10 + 1;
        if (iArr.length == i10) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void b(i iVar) {
        this.f33344c = a(this.f33344c, iVar.f33344c);
        d();
    }

    public int e(int i10) {
        int[] iArr = this.f33344c;
        int i11 = this.f33343b;
        int i12 = iArr[i11];
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            i12 = this.f33342a.h(i12, i10) ^ this.f33344c[i13];
        }
        return i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            return this.f33342a.equals(iVar.f33342a) && this.f33343b == iVar.f33343b && j(this.f33344c, iVar.f33344c);
        }
    }

    public int f(int i10) {
        if (i10 < 0 || i10 > this.f33343b) {
            return 0;
        }
        return this.f33344c[i10];
    }

    public int g() {
        int[] iArr = this.f33344c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i10 = 8;
        int i11 = 1;
        while (this.f33342a.d() > i10) {
            i11++;
            i10 += 8;
        }
        byte[] bArr = new byte[(this.f33344c.length * i11)];
        int i12 = 0;
        for (int i13 = 0; i13 < this.f33344c.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (this.f33344c[i13] >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.f33342a.hashCode();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f33344c;
            if (i10 >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i10];
            i10++;
        }
    }

    public i k(i iVar) {
        return new i(this.f33342a, l(this.f33344c, iVar.f33344c));
    }

    public void m(int i10) {
        if (this.f33342a.g(i10)) {
            this.f33344c = o(this.f33344c, i10);
            d();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public i n(int i10) {
        if (this.f33342a.g(i10)) {
            return new i(this.f33342a, o(this.f33344c, i10));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public String toString() {
        String str = " Polynomial over " + this.f33342a.toString() + ": \n";
        for (int i10 = 0; i10 < this.f33344c.length; i10++) {
            str = str + this.f33342a.b(this.f33344c[i10]) + "Y^" + i10 + "+";
        }
        return str + ";";
    }

    public i(b bVar, byte[] bArr) {
        this.f33342a = bVar;
        int i10 = 8;
        int i11 = 1;
        while (bVar.d() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 == 0) {
            this.f33344c = new int[(bArr.length / i11)];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr = this.f33344c;
                if (i12 < iArr.length) {
                    int i14 = 0;
                    while (i14 < i10) {
                        int[] iArr2 = this.f33344c;
                        iArr2[i12] = ((bArr[i13] & 255) << i14) ^ iArr2[i12];
                        i14 += 8;
                        i13++;
                    }
                    if (this.f33342a.g(this.f33344c[i12])) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    d();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public i(b bVar, int[] iArr) {
        this.f33342a = bVar;
        this.f33344c = q(iArr);
        d();
    }

    public i(i iVar) {
        this.f33342a = iVar.f33342a;
        this.f33343b = iVar.f33343b;
        this.f33344c = d.a(iVar.f33344c);
    }
}
