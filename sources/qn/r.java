package qn;

import ap.h;

public abstract class r extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30982f = new a(r.class, 18);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30983e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return r.i0(q1Var.l0());
        }
    }

    r(byte[] bArr, boolean z10) {
        this.f30983e = z10 ? ap.a.d(bArr) : bArr;
    }

    static r i0(byte[] bArr) {
        return new p1(bArr, false);
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 18, this.f30983e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30983e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30983e);
    }

    public final String j0() {
        return h.b(this.f30983e);
    }

    public String toString() {
        return j0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof r)) {
            return false;
        }
        return ap.a.a(this.f30983e, ((r) zVar).f30983e);
    }
}
