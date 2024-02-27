package qn;

import ap.h;

public abstract class p0 extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30975f = new a(p0.class, 26);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30976e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return p0.i0(q1Var.l0());
        }
    }

    p0(byte[] bArr, boolean z10) {
        this.f30976e = z10 ? ap.a.d(bArr) : bArr;
    }

    static p0 i0(byte[] bArr) {
        return new b2(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 26, this.f30976e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30976e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30976e);
    }

    public final String j0() {
        return h.b(this.f30976e);
    }

    public String toString() {
        return j0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof p0)) {
            return false;
        }
        return ap.a.a(this.f30976e, ((p0) zVar).f30976e);
    }
}
