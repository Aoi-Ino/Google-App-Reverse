package qn;

public class x1 extends h0 {
    x1(int i10, int i11, int i12, f fVar) {
        super(i10, i11, i12, fVar);
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        z g02 = this.f30931h.n().g0();
        boolean s02 = s0();
        if (z10) {
            int i10 = this.f30929f;
            if (s02 || g02.E()) {
                i10 |= 32;
            }
            xVar.t(true, i10, this.f30930g);
        }
        if (s02) {
            xVar.k(g02.T(true));
        }
        g02.B(xVar.d(), s02);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return s0() || this.f30931h.n().g0().E();
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        z g02 = this.f30931h.n().g0();
        boolean s02 = s0();
        int T = g02.T(s02);
        if (s02) {
            T += x.f(T);
        }
        return T + (z10 ? x.h(this.f30930g) : 0);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public c0 t0(z zVar) {
        return new u1((f) zVar);
    }

    public x1(boolean z10, int i10, f fVar) {
        super(z10, i10, fVar);
    }
}
