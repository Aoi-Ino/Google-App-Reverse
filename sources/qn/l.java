package qn;

public class l extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30950f = new a(l.class, 24);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30951e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return l.i0(q1Var.l0());
        }
    }

    l(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f30951e = bArr;
            if (!m0(0) || !m0(1) || !m0(2) || !m0(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    static l i0(byte[] bArr) {
        return new l(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m0(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f30951e
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.l.m0(int):boolean");
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 24, this.f30951e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, this.f30951e.length);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new l1(this.f30951e);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new l1(this.f30951e);
    }

    public int hashCode() {
        return ap.a.j(this.f30951e);
    }

    /* access modifiers changed from: protected */
    public boolean j0() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f30951e;
            if (i10 == bArr.length) {
                return false;
            }
            if (bArr[i10] == 46 && i10 == 14) {
                return true;
            }
            i10++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean k0() {
        return m0(10) && m0(11);
    }

    /* access modifiers changed from: protected */
    public boolean l0() {
        return m0(12) && m0(13);
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof l)) {
            return false;
        }
        return ap.a.a(this.f30951e, ((l) zVar).f30951e);
    }
}
