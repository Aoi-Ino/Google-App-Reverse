package qn;

public class z0 extends d0 {
    public z0() {
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.r(z10, 49, this.f30894e);
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        int i10 = z10 ? 4 : 3;
        for (f n10 : this.f30894e) {
            i10 += n10.n().T(true);
        }
        return i10;
    }

    public z0(g gVar) {
        super(gVar, false);
    }

    z0(boolean z10, f[] fVarArr) {
        super(z10, fVarArr);
    }
}
