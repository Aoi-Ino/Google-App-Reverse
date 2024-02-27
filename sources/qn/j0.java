package qn;

import ap.h;

public class j0 extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30941f = new a(j0.class, 23);

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30942e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return j0.i0(q1Var.l0());
        }
    }

    j0(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f30942e = bArr;
            if (!j0(0) || !j0(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    static j0 i0(byte[] bArr) {
        return new j0(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j0(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f30942e
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
        throw new UnsupportedOperationException("Method not decompiled: qn.j0.j0(int):boolean");
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 23, this.f30942e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, this.f30942e.length);
    }

    public int hashCode() {
        return ap.a.j(this.f30942e);
    }

    public String toString() {
        return h.b(this.f30942e);
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof j0)) {
            return false;
        }
        return ap.a.a(this.f30942e, ((j0) zVar).f30942e);
    }
}
