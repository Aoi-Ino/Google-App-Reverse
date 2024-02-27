package qn;

public class b1 extends h0 {
    b1(int i10, int i11, int i12, f fVar) {
        super(i10, i11, i12, fVar);
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        z n10 = this.f30931h.n();
        boolean s02 = s0();
        if (z10) {
            int i10 = this.f30929f;
            if (s02 || n10.E()) {
                i10 |= 32;
            }
            xVar.t(true, i10, this.f30930g);
        }
        if (s02) {
            xVar.i(128);
            n10.B(xVar, true);
            xVar.i(0);
            xVar.i(0);
            return;
        }
        n10.B(xVar, false);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return s0() || this.f30931h.n().E();
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        z n10 = this.f30931h.n();
        boolean s02 = s0();
        int T = n10.T(s02);
        if (s02) {
            T += 3;
        }
        return T + (z10 ? x.h(this.f30930g) : 0);
    }

    /* access modifiers changed from: package-private */
    public c0 t0(z zVar) {
        return new x0((f) zVar);
    }
}
