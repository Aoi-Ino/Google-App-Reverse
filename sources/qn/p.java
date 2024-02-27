package qn;

import ap.g;
import java.math.BigInteger;

public class p extends z {

    /* renamed from: g  reason: collision with root package name */
    static final m0 f30972g = new a(p.class, 2);

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f30973e;

    /* renamed from: f  reason: collision with root package name */
    private final int f30974f;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return p.i0(q1Var.l0());
        }
    }

    public p(long j10) {
        this.f30973e = BigInteger.valueOf(j10).toByteArray();
        this.f30974f = 0;
    }

    static p i0(byte[] bArr) {
        return new p(bArr, false);
    }

    public static p j0(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (p) f30972g.b((byte[]) obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static p k0(h0 h0Var, boolean z10) {
        return (p) f30972g.e(h0Var, z10);
    }

    static int n0(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int max = Math.max(i10, length - 4);
        byte b10 = i11 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return b10;
            }
            b10 = (b10 << 8) | (bArr[max] & 255);
        }
    }

    static boolean p0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !g.b("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    static long q0(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int max = Math.max(i10, length - 8);
        long j10 = (long) (i11 & bArr[max]);
        while (true) {
            max++;
            if (max >= length) {
                return j10;
            }
            j10 = (j10 << 8) | ((long) (bArr[max] & 255));
        }
    }

    static int s0(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        xVar.o(z10, 2, this.f30973e);
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        return x.g(z10, this.f30973e.length);
    }

    public int hashCode() {
        return ap.a.j(this.f30973e);
    }

    public BigInteger l0() {
        return new BigInteger(this.f30973e);
    }

    public boolean m0(int i10) {
        byte[] bArr = this.f30973e;
        int length = bArr.length;
        int i11 = this.f30974f;
        return length - i11 <= 4 && n0(bArr, i11, -1) == i10;
    }

    public int o0() {
        byte[] bArr = this.f30973e;
        int length = bArr.length;
        int i10 = this.f30974f;
        if (length - i10 <= 4) {
            return n0(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long r0() {
        byte[] bArr = this.f30973e;
        int length = bArr.length;
        int i10 = this.f30974f;
        if (length - i10 <= 8) {
            return q0(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return l0().toString();
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof p)) {
            return false;
        }
        return ap.a.a(this.f30973e, ((p) zVar).f30973e);
    }

    public p(BigInteger bigInteger) {
        this.f30973e = bigInteger.toByteArray();
        this.f30974f = 0;
    }

    p(byte[] bArr, boolean z10) {
        if (!p0(bArr)) {
            this.f30973e = z10 ? ap.a.d(bArr) : bArr;
            this.f30974f = s0(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }
}
