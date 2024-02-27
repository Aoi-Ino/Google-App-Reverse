package qn;

public class i2 extends c0 {

    /* renamed from: g  reason: collision with root package name */
    private int f30934g = -1;

    public i2() {
    }

    private int s0() {
        if (this.f30934g < 0) {
            int i10 = 0;
            for (f n10 : this.f30887e) {
                i10 += n10.n().h0().T(true);
            }
            this.f30934g = i10;
        }
        return this.f30934g;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 48);
        h2 e10 = xVar.e();
        int length = this.f30887e.length;
        int i10 = 0;
        if (this.f30934g >= 0 || length > 16) {
            xVar.k(s0());
            while (i10 < length) {
                e10.u(this.f30887e[i10].n(), true);
                i10++;
            }
            return;
        }
        z[] zVarArr = new z[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            z h02 = this.f30887e[i12].n().h0();
            zVarArr[i12] = h02;
            i11 += h02.T(true);
        }
        this.f30934g = i11;
        xVar.k(i11);
        while (i10 < length) {
            e10.u(zVarArr[i10], true);
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, s0());
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public c n0() {
        return new d2(s0.o0(i0()), false);
    }

    /* access modifiers changed from: package-private */
    public j o0() {
        return new f2(this);
    }

    /* access modifiers changed from: package-private */
    public v p0() {
        return new q1(v0.m0(j0()));
    }

    /* access modifiers changed from: package-private */
    public d0 q0() {
        return new k2(false, r0());
    }

    public i2(f fVar) {
        super(fVar);
    }

    public i2(g gVar) {
        super(gVar);
    }

    i2(f[] fVarArr, boolean z10) {
        super(fVarArr, z10);
    }
}
