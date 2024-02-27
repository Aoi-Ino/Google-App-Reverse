package qn;

public class h extends z {

    /* renamed from: g  reason: collision with root package name */
    static final m0 f30924g = new a(h.class, 10);

    /* renamed from: h  reason: collision with root package name */
    private static final h[] f30925h = new h[12];

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f30926e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30927f;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return h.i0(q1Var.l0(), false);
        }
    }

    h(byte[] bArr, boolean z10) {
        if (p.p0(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f30926e = z10 ? ap.a.d(bArr) : bArr;
            this.f30927f = p.s0(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    static h i0(byte[] bArr, boolean z10) {
        if (bArr.length > 1) {
            return new h(bArr, z10);
        }
        if (bArr.length != 0) {
            byte b10 = bArr[0] & 255;
            h[] hVarArr = f30925h;
            if (b10 >= hVarArr.length) {
                return new h(bArr, z10);
            }
            h hVar = hVarArr[b10];
            if (hVar != null) {
                return hVar;
            }
            h hVar2 = new h(bArr, z10);
            hVarArr[b10] = hVar2;
            return hVar2;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 10, this.f30926e);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, this.f30926e.length);
    }

    public int hashCode() {
        return ap.a.j(this.f30926e);
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof h)) {
            return false;
        }
        return ap.a.a(this.f30926e, ((h) zVar).f30926e);
    }
}
