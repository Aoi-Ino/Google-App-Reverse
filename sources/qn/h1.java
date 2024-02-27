package qn;

public class h1 extends c {
    public h1(f fVar) {
        super(fVar.n().v("DER"), 0);
    }

    public static h1 o0(c cVar) {
        return (h1) cVar.g0();
    }

    static h1 p0(v vVar) {
        return new h1(vVar.l0(), true);
    }

    public static h1 q0(Object obj) {
        if (obj == null || (obj instanceof h1)) {
            return (h1) obj;
        }
        if (obj instanceof c) {
            return o0((c) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return o0((c) z.e0((byte[]) obj));
            } catch (Exception e10) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static h1 r0(h0 h0Var, boolean z10) {
        z p02 = h0Var.p0();
        return (z10 || (p02 instanceof h1)) ? q0(p02) : p0(v.j0(p02));
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        byte[] bArr = this.f30885e;
        int length = bArr.length - 1;
        byte b10 = bArr[length];
        byte b11 = (byte) ((255 << (bArr[0] & 255)) & b10);
        if (b10 == b11) {
            xVar.o(z10, 3, bArr);
        } else {
            xVar.q(z10, 3, bArr, 0, length, b11);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, this.f30885e.length);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }

    public h1(byte[] bArr) {
        this(bArr, 0);
    }

    public h1(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    h1(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }
}
