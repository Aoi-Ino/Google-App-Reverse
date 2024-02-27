package qn;

public class v1 extends d0 {

    /* renamed from: h  reason: collision with root package name */
    private int f31012h = -1;

    v1(boolean z10, f[] fVarArr) {
        super(n0(z10), fVarArr);
    }

    private static boolean n0(boolean z10) {
        if (z10) {
            return z10;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int o0() {
        if (this.f31012h < 0) {
            int i10 = 0;
            for (f n10 : this.f30894e) {
                i10 += n10.n().g0().T(true);
            }
            this.f31012h = i10;
        }
        return this.f31012h;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 49);
        s1 d10 = xVar.d();
        int length = this.f30894e.length;
        int i10 = 0;
        if (this.f31012h >= 0 || length > 16) {
            xVar.k(o0());
            while (i10 < length) {
                this.f30894e[i10].n().g0().B(d10, true);
                i10++;
            }
            return;
        }
        z[] zVarArr = new z[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            z g02 = this.f30894e[i12].n().g0();
            zVarArr[i12] = g02;
            i11 += g02.T(true);
        }
        this.f31012h = i11;
        xVar.k(i11);
        while (i10 < length) {
            zVarArr[i10].B(d10, true);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, o0());
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return this.f30895f ? this : super.g0();
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }
}
