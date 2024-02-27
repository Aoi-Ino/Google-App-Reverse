package qn;

public abstract class o0 extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30965f = new a(o0.class, 21);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30966e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return o0.i0(q1Var.l0());
        }
    }

    o0(byte[] bArr, boolean z10) {
        this.f30966e = z10 ? ap.a.d(bArr) : bArr;
    }

    static o0 i0(byte[] bArr) {
        return new a2(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 21, this.f30966e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30966e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30966e);
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof o0)) {
            return false;
        }
        return ap.a.a(this.f30966e, ((o0) zVar).f30966e);
    }
}
