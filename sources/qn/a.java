package qn;

public abstract class a extends z implements p2 {

    /* renamed from: e  reason: collision with root package name */
    final h0 f30874e;

    a(h0 h0Var) {
        i0(h0Var.q0());
        this.f30874e = h0Var;
    }

    private static int i0(int i10) {
        if (64 == i10) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        this.f30874e.B(xVar, z10);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f30874e.E();
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return this.f30874e.T(z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new f1((h0) this.f30874e.g0());
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new c2((h0) this.f30874e.h0());
    }

    public int hashCode() {
        return this.f30874e.hashCode();
    }

    public final z r() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        h0 h0Var;
        if (zVar instanceof a) {
            h0Var = ((a) zVar).f30874e;
        } else if (!(zVar instanceof h0)) {
            return false;
        } else {
            h0Var = (h0) zVar;
        }
        return this.f30874e.Y(h0Var);
    }
}
