package qn;

import ap.h;

public abstract class k0 extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30947f = new a(k0.class, 12);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30948e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return k0.i0(q1Var.l0());
        }
    }

    k0(byte[] bArr, boolean z10) {
        this.f30948e = z10 ? ap.a.d(bArr) : bArr;
    }

    static k0 i0(byte[] bArr) {
        return new y1(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 12, this.f30948e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30948e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30948e);
    }

    public final String j0() {
        return h.c(this.f30948e);
    }

    public String toString() {
        return j0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof k0)) {
            return false;
        }
        return ap.a.a(this.f30948e, ((k0) zVar).f30948e);
    }
}
