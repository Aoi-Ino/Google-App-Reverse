package qn;

import ap.h;

public abstract class k extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30945f = new a(k.class, 27);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30946e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return k.i0(q1Var.l0());
        }
    }

    k(byte[] bArr, boolean z10) {
        this.f30946e = z10 ? ap.a.d(bArr) : bArr;
    }

    static k i0(byte[] bArr) {
        return new k1(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 27, this.f30946e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30946e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30946e);
    }

    public final String j0() {
        return h.b(this.f30946e);
    }

    public String toString() {
        return j0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof k)) {
            return false;
        }
        return ap.a.a(this.f30946e, ((k) zVar).f30946e);
    }
}
