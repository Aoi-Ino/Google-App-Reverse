package qn;

public class e extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30902f = new a(e.class, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final e f30903g = new e((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public static final e f30904h = new e((byte) -1);

    /* renamed from: e  reason: collision with root package name */
    private final byte f30905e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return e.i0(q1Var.l0());
        }
    }

    private e(byte b10) {
        this.f30905e = b10;
    }

    static e i0(byte[] bArr) {
        if (bArr.length == 1) {
            byte b10 = bArr[0];
            if (b10 != -1) {
                return b10 != 0 ? new e(b10) : f30903g;
            }
            return f30904h;
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.m(z10, 1, this.f30905e);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, 1);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return j0() ? f30904h : f30903g;
    }

    public int hashCode() {
        return j0() ? 1 : 0;
    }

    public boolean j0() {
        return this.f30905e != 0;
    }

    public String toString() {
        return j0() ? "TRUE" : "FALSE";
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        return (zVar instanceof e) && j0() == ((e) zVar).j0();
    }
}
