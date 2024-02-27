package zo;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f33330a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f33331b;

    public b(byte[] bArr) {
        if (bArr.length == 4) {
            int d10 = f.d(bArr);
            this.f33331b = d10;
            if (j.c(d10)) {
                this.f33330a = j.a(this.f33331b);
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    private static String i(int i10) {
        if (i10 == 0) {
            return "0";
        }
        String str = ((byte) (i10 & 1)) == 1 ? "1" : "";
        int i11 = i10 >>> 1;
        int i12 = 1;
        while (i11 != 0) {
            if (((byte) (i11 & 1)) == 1) {
                str = str + "+x^" + i12;
            }
            i11 >>>= 1;
            i12++;
        }
        return str;
    }

    public int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public String b(int i10) {
        StringBuilder sb2;
        String str;
        String str2 = "";
        for (int i11 = 0; i11 < this.f33330a; i11++) {
            if ((((byte) i10) & 1) == 0) {
                sb2 = new StringBuilder();
                str = "0";
            } else {
                sb2 = new StringBuilder();
                str = "1";
            }
            sb2.append(str);
            sb2.append(str2);
            str2 = sb2.toString();
            i10 >>>= 1;
        }
        return str2;
    }

    public int c(int i10, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i11 < 0) {
            i10 = f(i10);
            i11 = -i11;
        }
        int i12 = 1;
        while (i11 != 0) {
            if ((i11 & 1) == 1) {
                i12 = h(i12, i10);
            }
            i10 = h(i10, i10);
            i11 >>>= 1;
        }
        return i12;
    }

    public int d() {
        return this.f33330a;
    }

    public byte[] e() {
        return f.c(this.f33331b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            return this.f33330a == bVar.f33330a && this.f33331b == bVar.f33331b;
        }
    }

    public int f(int i10) {
        return c(i10, (1 << this.f33330a) - 2);
    }

    public boolean g(int i10) {
        int i11 = this.f33330a;
        return i11 == 31 ? i10 >= 0 : i10 >= 0 && i10 < (1 << i11);
    }

    public int h(int i10, int i11) {
        return j.d(i10, i11, this.f33331b);
    }

    public int hashCode() {
        return this.f33331b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f33330a + ") = GF(2)[X]/<" + i(this.f33331b) + "> ";
    }
}
