package qn;

import ap.h;

public abstract class n extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30959f = new a(n.class, 22);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30960e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return n.i0(q1Var.l0());
        }
    }

    n(byte[] bArr, boolean z10) {
        this.f30960e = z10 ? ap.a.d(bArr) : bArr;
    }

    static n i0(byte[] bArr) {
        return new n1(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 22, this.f30960e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30960e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30960e);
    }

    public final String j0() {
        return h.b(this.f30960e);
    }

    public String toString() {
        return j0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof n)) {
            return false;
        }
        return ap.a.a(this.f30960e, ((n) zVar).f30960e);
    }
}
