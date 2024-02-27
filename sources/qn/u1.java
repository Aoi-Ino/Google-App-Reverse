package qn;

public class u1 extends c0 {

    /* renamed from: g  reason: collision with root package name */
    private int f31004g = -1;

    public u1(f fVar) {
        super(fVar);
    }

    private int s0() {
        if (this.f31004g < 0) {
            int i10 = 0;
            for (f n10 : this.f30887e) {
                i10 += n10.n().g0().T(true);
            }
            this.f31004g = i10;
        }
        return this.f31004g;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 48);
        s1 d10 = xVar.d();
        int length = this.f30887e.length;
        int i10 = 0;
        if (this.f31004g >= 0 || length > 16) {
            xVar.k(s0());
            while (i10 < length) {
                this.f30887e[i10].n().g0().B(d10, true);
                i10++;
            }
            return;
        }
        z[] zVarArr = new z[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            z g02 = this.f30887e[i12].n().g0();
            zVarArr[i12] = g02;
            i11 += g02.T(true);
        }
        this.f31004g = i11;
        xVar.k(i11);
        while (i10 < length) {
            zVarArr[i10].B(d10, true);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, s0());
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
    public c n0() {
        return new h1(s0.o0(i0()), false);
    }

    /* access modifiers changed from: package-private */
    public j o0() {
        return new i1(this);
    }

    /* access modifiers changed from: package-private */
    public v p0() {
        return new q1(v0.m0(j0()));
    }

    /* access modifiers changed from: package-private */
    public d0 q0() {
        return new k2(false, r0());
    }

    public u1(g gVar) {
        super(gVar);
    }

    u1(f[] fVarArr, boolean z10) {
        super(fVarArr, z10);
    }
}
