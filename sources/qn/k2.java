package qn;

public class k2 extends d0 {

    /* renamed from: h  reason: collision with root package name */
    private int f30949h = -1;

    public k2() {
    }

    private int n0() {
        if (this.f30949h < 0) {
            int i10 = 0;
            for (f n10 : this.f30894e) {
                i10 += n10.n().h0().T(true);
            }
            this.f30949h = i10;
        }
        return this.f30949h;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 49);
        h2 e10 = xVar.e();
        int length = this.f30894e.length;
        int i10 = 0;
        if (this.f30949h >= 0 || length > 16) {
            xVar.k(n0());
            while (i10 < length) {
                e10.u(this.f30894e[i10].n(), true);
                i10++;
            }
            return;
        }
        z[] zVarArr = new z[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            z h02 = this.f30894e[i12].n().h0();
            zVarArr[i12] = h02;
            i11 += h02.T(true);
        }
        this.f30949h = i11;
        xVar.k(i11);
        while (i10 < length) {
            e10.u(zVarArr[i10], true);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, n0());
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }

    public k2(g gVar) {
        super(gVar, false);
    }

    k2(boolean z10, f[] fVarArr) {
        super(z10, fVarArr);
    }
}
