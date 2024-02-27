package qn;

public abstract class q extends z {

    /* renamed from: e  reason: collision with root package name */
    static final m0 f30977e = new a(q.class, 5);

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return q.i0(q1Var.l0());
        }
    }

    q() {
    }

    static q i0(byte[] bArr) {
        if (bArr.length == 0) {
            return o1.f30967f;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        return zVar instanceof q;
    }
}
