package qn;

public abstract class l0 extends z {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30952f = new a(l0.class, 28);

    /* renamed from: g  reason: collision with root package name */
    private static final char[] f30953g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30954e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return l0.i0(q1Var.l0());
        }
    }

    l0(byte[] bArr, boolean z10) {
        this.f30954e = z10 ? ap.a.d(bArr) : bArr;
    }

    static l0 i0(byte[] bArr) {
        return new z1(bArr, false);
    }

    private static void j0(StringBuffer stringBuffer, int i10) {
        char[] cArr = f30953g;
        stringBuffer.append(cArr[(i10 >>> 4) & 15]);
        stringBuffer.append(cArr[i10 & 15]);
    }

    private static void k0(StringBuffer stringBuffer, int i10) {
        int i11;
        if (i10 < 128) {
            j0(stringBuffer, i10);
            return;
        }
        byte[] bArr = new byte[5];
        int i12 = 5;
        while (true) {
            i11 = i12 - 1;
            bArr[i11] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                break;
            }
            i12 = i11;
        }
        int i13 = i12 - 2;
        bArr[i13] = (byte) ((5 - i11) | 128);
        while (true) {
            int i14 = i13 + 1;
            j0(stringBuffer, bArr[i13]);
            if (i14 < 5) {
                i13 = i14;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void B(x xVar, boolean z10) {
        xVar.o(z10, 28, this.f30954e);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int T(boolean z10) {
        return x.g(z10, this.f30954e.length);
    }

    public final int hashCode() {
        return ap.a.j(this.f30954e);
    }

    public final String l0() {
        StringBuffer stringBuffer = new StringBuffer(((x.f(r0) + r0) * 2) + 3);
        stringBuffer.append("#1C");
        k0(stringBuffer, r0);
        for (byte j02 : this.f30954e) {
            j0(stringBuffer, j02);
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return l0();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(z zVar) {
        if (!(zVar instanceof l0)) {
            return false;
        }
        return ap.a.a(this.f30954e, ((l0) zVar).f30954e);
    }
}
