package s7;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f16060a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f16061b;

    b(a aVar, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f16060a = aVar;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f16061b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f16061b = aVar.d().f16061b;
            return;
        }
        int[] iArr2 = new int[(length - i10)];
        this.f16061b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.f16060a.equals(bVar.f16060a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        } else if (f()) {
            return bVar;
        } else {
            if (bVar.f()) {
                return this;
            }
            int[] iArr = this.f16061b;
            int[] iArr2 = bVar.f16061b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new b(this.f16060a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public b[] b(b bVar) {
        if (!this.f16060a.equals(bVar.f16060a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        } else if (!bVar.f()) {
            b d10 = this.f16060a.d();
            int e10 = this.f16060a.e(bVar.c(bVar.e()));
            b bVar2 = this;
            while (bVar2.e() >= bVar.e() && !bVar2.f()) {
                int e11 = bVar2.e() - bVar.e();
                int g10 = this.f16060a.g(bVar2.c(bVar2.e()), e10);
                b h10 = bVar.h(e11, g10);
                d10 = d10.a(this.f16060a.b(e11, g10));
                bVar2 = bVar2.a(h10);
            }
            return new b[]{d10, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        int[] iArr = this.f16061b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* access modifiers changed from: package-private */
    public int[] d() {
        return this.f16061b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f16061b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f16061b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public b g(b bVar) {
        if (!this.f16060a.equals(bVar.f16060a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        } else if (f() || bVar.f()) {
            return this.f16060a.d();
        } else {
            int[] iArr = this.f16061b;
            int length = iArr.length;
            int[] iArr2 = bVar.f16061b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = a.a(iArr3[i13], this.f16060a.g(i11, iArr2[i12]));
                }
            }
            return new b(this.f16060a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f16060a.d();
        } else {
            int length = this.f16061b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f16060a.g(this.f16061b[i12], i11);
            }
            return new b(this.f16060a, iArr);
        }
    }

    public String toString() {
        char c10;
        StringBuffer stringBuffer = new StringBuffer(e() * 8);
        for (int e10 = e(); e10 >= 0; e10--) {
            int c11 = c(e10);
            if (c11 != 0) {
                if (c11 < 0) {
                    stringBuffer.append(" - ");
                    c11 = -c11;
                } else if (stringBuffer.length() > 0) {
                    stringBuffer.append(" + ");
                }
                if (e10 == 0 || c11 != 1) {
                    int f10 = this.f16060a.f(c11);
                    if (f10 == 0) {
                        c10 = '1';
                    } else if (f10 == 1) {
                        c10 = 'a';
                    } else {
                        stringBuffer.append("a^");
                        stringBuffer.append(f10);
                    }
                    stringBuffer.append(c10);
                }
                if (e10 != 0) {
                    if (e10 == 1) {
                        stringBuffer.append('x');
                    } else {
                        stringBuffer.append("x^");
                        stringBuffer.append(e10);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
