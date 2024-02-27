package qn;

abstract class m0 extends i0 {

    /* renamed from: b  reason: collision with root package name */
    final g0 f30958b;

    m0(Class cls, int i10) {
        super(cls);
        this.f30958b = g0.a(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final z a(z zVar) {
        if (this.f30933a.isInstance(zVar)) {
            return zVar;
        }
        throw new IllegalStateException("unexpected object: " + zVar.getClass().getName());
    }

    /* access modifiers changed from: package-private */
    public final z b(byte[] bArr) {
        return a(z.e0(bArr));
    }

    /* access modifiers changed from: package-private */
    public z c(c0 c0Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* access modifiers changed from: package-private */
    public z d(q1 q1Var) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    /* access modifiers changed from: package-private */
    public final z e(h0 h0Var, boolean z10) {
        if (128 == h0Var.q0()) {
            return a(h0Var.m0(z10, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}
