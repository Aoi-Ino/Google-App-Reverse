package qn;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class c extends z implements d {

    /* renamed from: f  reason: collision with root package name */
    static final m0 f30883f = new a(c.class, 3);

    /* renamed from: g  reason: collision with root package name */
    private static final char[] f30884g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: e  reason: collision with root package name */
    final byte[] f30885e;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return c0Var.n0();
        }

        /* access modifiers changed from: package-private */
        public z d(q1 q1Var) {
            return c.i0(q1Var.l0());
        }
    }

    c(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        } else if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f30885e = ap.a.q(bArr, (byte) i10);
        }
    }

    static c i0(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            byte b10 = bArr[0] & 255;
            if (b10 > 0) {
                if (b10 > 7 || length < 2) {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
                byte b11 = bArr[length - 1];
                if (b11 != ((byte) ((255 << b10) & b11))) {
                    return new d2(bArr, false);
                }
            }
            return new h1(bArr, false);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public static c k0(Object obj) {
        if (obj == null || (obj instanceof c)) {
            return (c) obj;
        }
        if (obj instanceof f) {
            z n10 = ((f) obj).n();
            if (n10 instanceof c) {
                return (c) n10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (c) f30883f.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static c l0(h0 h0Var, boolean z10) {
        return (c) f30883f.e(h0Var, z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return new h1(this.f30885e, false);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new d2(this.f30885e, false);
    }

    public int hashCode() {
        byte[] bArr = this.f30885e;
        if (bArr.length < 2) {
            return 1;
        }
        int length = bArr.length - 1;
        int i10 = 255 << (bArr[0] & 255);
        return (ap.a.k(bArr, 0, length) * 257) ^ ((byte) (i10 & bArr[length]));
    }

    public byte[] j0() {
        byte[] bArr = this.f30885e;
        if (bArr.length == 1) {
            return v.f31008g;
        }
        byte[] g10 = ap.a.g(bArr, 1, bArr.length);
        int length = g10.length - 1;
        g10[length] = (byte) (((byte) (255 << (bArr[0] & 255))) & g10[length]);
        return g10;
    }

    public byte[] m0() {
        byte[] bArr = this.f30885e;
        if (bArr[0] == 0) {
            return ap.a.g(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String n0() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != encoded.length; i10++) {
                byte b10 = encoded[i10];
                char[] cArr = f30884g;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new y("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    public int o() {
        return this.f30885e[0] & 255;
    }

    public z r() {
        return n();
    }

    public InputStream s() {
        byte[] bArr = this.f30885e;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public String toString() {
        return n0();
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof c)) {
            return false;
        }
        byte[] bArr = this.f30885e;
        byte[] bArr2 = ((c) zVar).f30885e;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    c(byte[] bArr, boolean z10) {
        if (z10) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            } else if (bArr.length >= 1) {
                byte b10 = bArr[0] & 255;
                if (b10 > 0) {
                    if (bArr.length < 2) {
                        throw new IllegalArgumentException("zero length data with non-zero pad bits");
                    } else if (b10 > 7) {
                        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                    }
                }
            } else {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
        }
        this.f30885e = bArr;
    }
}
