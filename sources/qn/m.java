package qn;

public abstract class m extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30956f = new a(m.class, 25);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30957e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return m.i0(q1Var.l0());
        }
    }

    m(byte[] bArr, boolean z10) {
        if (bArr != null) {
            this.f30957e = z10 ? ap.a.d(bArr) : bArr;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    static m i0(byte[] bArr) {
        return new m1(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 25, this.f30957e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30957e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30957e);
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof m)) {
            return false;
        }
        return ap.a.a(this.f30957e, ((m) zVar).f30957e);
    }
}
