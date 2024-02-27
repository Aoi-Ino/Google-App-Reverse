package qn;

public final class t extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30990f = new a(t.class, 7);

    /* renamed from: e  reason: collision with root package name */
    private final m f30991e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return new t((m) m.f30956f.c(c0Var));
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return new t((m) m.f30956f.d(q1Var));
        }
    }

    public t(m mVar) {
        if (mVar != null) {
            this.f30991e = mVar;
            return;
        }
        throw new NullPointerException("'baseGraphicString' cannot be null");
    }

    static t i0(byte[] bArr) {
        return new t(m.i0(bArr));
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.s(z10, 7);
        this.f30991e.B(xVar, false);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return this.f30991e.T(z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        m mVar = (m) this.f30991e.g0();
        return mVar == this.f30991e ? this : new t(mVar);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        m mVar = (m) this.f30991e.h0();
        return mVar == this.f30991e ? this : new t(mVar);
    }

    public int hashCode() {
        return ~this.f30991e.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof t)) {
            return false;
        }
        return this.f30991e.y(((t) zVar).f30991e);
    }
}
