package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.o1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f7112c = Logger.getLogger(k.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7113d = n1.C();

    /* renamed from: a  reason: collision with root package name */
    l f7114a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7115b;

    private static class b extends k {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f7116e;

        /* renamed from: f  reason: collision with root package name */
        private final int f7117f;

        /* renamed from: g  reason: collision with root package name */
        private final int f7118g;

        /* renamed from: h  reason: collision with root package name */
        private int f7119h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f7116e = bArr;
                    this.f7117f = i10;
                    this.f7119h = i10;
                    this.f7118g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void C0(int i10, String str) {
            D0(i10, 2);
            M0(str);
        }

        public final void D0(int i10, int i11) {
            F0(p1.c(i10, i11));
        }

        public final void E0(int i10, int i11) {
            D0(i10, 0);
            F0(i11);
        }

        public final void F0(int i10) {
            if (!k.f7113d || d.c() || W() < 5) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f7116e;
                    int i11 = this.f7119h;
                    this.f7119h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7116e;
                    int i12 = this.f7119h;
                    this.f7119h = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), 1}), e10);
                }
            } else if ((i10 & -128) == 0) {
                byte[] bArr3 = this.f7116e;
                int i13 = this.f7119h;
                this.f7119h = i13 + 1;
                n1.H(bArr3, (long) i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f7116e;
                int i14 = this.f7119h;
                this.f7119h = i14 + 1;
                n1.H(bArr4, (long) i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & -128) == 0) {
                    byte[] bArr5 = this.f7116e;
                    int i16 = this.f7119h;
                    this.f7119h = i16 + 1;
                    n1.H(bArr5, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f7116e;
                int i17 = this.f7119h;
                this.f7119h = i17 + 1;
                n1.H(bArr6, (long) i17, (byte) (i15 | 128));
                int i18 = i10 >>> 14;
                if ((i18 & -128) == 0) {
                    byte[] bArr7 = this.f7116e;
                    int i19 = this.f7119h;
                    this.f7119h = i19 + 1;
                    n1.H(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f7116e;
                int i20 = this.f7119h;
                this.f7119h = i20 + 1;
                n1.H(bArr8, (long) i20, (byte) (i18 | 128));
                int i21 = i10 >>> 21;
                if ((i21 & -128) == 0) {
                    byte[] bArr9 = this.f7116e;
                    int i22 = this.f7119h;
                    this.f7119h = i22 + 1;
                    n1.H(bArr9, (long) i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f7116e;
                int i23 = this.f7119h;
                this.f7119h = i23 + 1;
                n1.H(bArr10, (long) i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f7116e;
                int i24 = this.f7119h;
                this.f7119h = i24 + 1;
                n1.H(bArr11, (long) i24, (byte) (i10 >>> 28));
            }
        }

        public final void G0(int i10, long j10) {
            D0(i10, 0);
            H0(j10);
        }

        public final void H0(long j10) {
            if (!k.f7113d || W() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f7116e;
                    int i10 = this.f7119h;
                    this.f7119h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f7116e;
                    int i11 = this.f7119h;
                    this.f7119h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f7116e;
                    int i12 = this.f7119h;
                    this.f7119h = i12 + 1;
                    n1.H(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f7116e;
                int i13 = this.f7119h;
                this.f7119h = i13 + 1;
                n1.H(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void I0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f7116e, this.f7119h, i11);
                this.f7119h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), Integer.valueOf(i11)}), e10);
            }
        }

        public final void J0(h hVar) {
            F0(hVar.size());
            hVar.q0(this);
        }

        public final void K0(int i10, o0 o0Var) {
            D0(i10, 2);
            L0(o0Var);
        }

        public final void L0(o0 o0Var) {
            F0(o0Var.a());
            o0Var.e(this);
        }

        public final void M0(String str) {
            int f10;
            int i10 = this.f7119h;
            try {
                int N = k.N(str.length() * 3);
                int N2 = k.N(str.length());
                if (N2 == N) {
                    int i11 = i10 + N2;
                    this.f7119h = i11;
                    f10 = o1.f(str, this.f7116e, i11, W());
                    this.f7119h = i10;
                    F0((f10 - i10) - N2);
                } else {
                    F0(o1.g(str));
                    f10 = o1.f(str, this.f7116e, this.f7119h, W());
                }
                this.f7119h = f10;
            } catch (o1.d e10) {
                this.f7119h = i10;
                S(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        public final int W() {
            return this.f7118g - this.f7119h;
        }

        public final void X(byte b10) {
            try {
                byte[] bArr = this.f7116e;
                int i10 = this.f7119h;
                this.f7119h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), 1}), e10);
            }
        }

        public final void Y(int i10, boolean z10) {
            D0(i10, 0);
            X(z10 ? (byte) 1 : 0);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            I0(bArr, i10, i11);
        }

        public final void a0(int i10, h hVar) {
            D0(i10, 2);
            J0(hVar);
        }

        public final void f0(int i10, int i11) {
            D0(i10, 5);
            g0(i11);
        }

        public final void g0(int i10) {
            try {
                byte[] bArr = this.f7116e;
                int i11 = this.f7119h;
                bArr[i11] = (byte) (i10 & 255);
                bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
                bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
                this.f7119h = i11 + 4;
                bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), 1}), e10);
            }
        }

        public final void h0(int i10, long j10) {
            D0(i10, 1);
            i0(j10);
        }

        public final void i0(long j10) {
            try {
                byte[] bArr = this.f7116e;
                int i10 = this.f7119h;
                bArr[i10] = (byte) (((int) j10) & 255);
                bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
                bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
                bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
                bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
                bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
                bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
                this.f7119h = i10 + 8;
                bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f7119h), Integer.valueOf(this.f7118g), 1}), e10);
            }
        }

        public final void n0(int i10, int i11) {
            D0(i10, 0);
            o0(i11);
        }

        public final void o0(int i10) {
            if (i10 >= 0) {
                F0(i10);
            } else {
                H0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void r0(int i10, o0 o0Var, d1 d1Var) {
            D0(i10, 2);
            F0(((a) o0Var).i(d1Var));
            d1Var.c(o0Var, this.f7114a);
        }

        public final void s0(int i10, o0 o0Var) {
            D0(1, 3);
            E0(2, i10);
            K0(3, o0Var);
            D0(1, 4);
        }

        public final void t0(int i10, h hVar) {
            D0(1, 3);
            E0(2, i10);
            a0(3, hVar);
            D0(1, 4);
        }
    }

    public static class c extends IOException {
        c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    private k() {
    }

    public static int A(int i10, h hVar) {
        return (L(1) * 2) + M(2, i10) + f(3, hVar);
    }

    public static int B(int i10, int i11) {
        return L(i10) + C(i11);
    }

    public static int C(int i10) {
        return 4;
    }

    public static int D(int i10, long j10) {
        return L(i10) + E(j10);
    }

    public static int E(long j10) {
        return 8;
    }

    public static int F(int i10, int i11) {
        return L(i10) + G(i11);
    }

    public static int G(int i10) {
        return N(Q(i10));
    }

    public static int H(int i10, long j10) {
        return L(i10) + I(j10);
    }

    public static int I(long j10) {
        return P(R(j10));
    }

    public static int J(int i10, String str) {
        return L(i10) + K(str);
    }

    public static int K(String str) {
        int i10;
        try {
            i10 = o1.g(str);
        } catch (o1.d unused) {
            i10 = str.getBytes(z.f7292a).length;
        }
        return x(i10);
    }

    public static int L(int i10) {
        return N(p1.c(i10, 0));
    }

    public static int M(int i10, int i11) {
        return L(i10) + N(i11);
    }

    public static int N(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int O(int i10, long j10) {
        return L(i10) + P(j10);
    }

    public static int P(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int Q(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long R(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static k U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static k V(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int d(int i10, boolean z10) {
        return L(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(int i10, h hVar) {
        return L(i10) + g(hVar);
    }

    public static int g(h hVar) {
        return x(hVar.size());
    }

    public static int h(int i10, double d10) {
        return L(i10) + i(d10);
    }

    public static int i(double d10) {
        return 8;
    }

    public static int j(int i10, int i11) {
        return L(i10) + k(i11);
    }

    public static int k(int i10) {
        return u(i10);
    }

    public static int l(int i10, int i11) {
        return L(i10) + m(i11);
    }

    public static int m(int i10) {
        return 4;
    }

    public static int n(int i10, long j10) {
        return L(i10) + o(j10);
    }

    public static int o(long j10) {
        return 8;
    }

    public static int p(int i10, float f10) {
        return L(i10) + q(f10);
    }

    public static int q(float f10) {
        return 4;
    }

    static int r(int i10, o0 o0Var, d1 d1Var) {
        return (L(i10) * 2) + s(o0Var, d1Var);
    }

    static int s(o0 o0Var, d1 d1Var) {
        return ((a) o0Var).i(d1Var);
    }

    public static int t(int i10, int i11) {
        return L(i10) + u(i11);
    }

    public static int u(int i10) {
        if (i10 >= 0) {
            return N(i10);
        }
        return 10;
    }

    public static int v(int i10, long j10) {
        return L(i10) + w(j10);
    }

    public static int w(long j10) {
        return P(j10);
    }

    static int x(int i10) {
        return N(i10) + i10;
    }

    static int y(int i10, o0 o0Var, d1 d1Var) {
        return L(i10) + z(o0Var, d1Var);
    }

    static int z(o0 o0Var, d1 d1Var) {
        return x(((a) o0Var).i(d1Var));
    }

    public final void A0(int i10, long j10) {
        G0(i10, R(j10));
    }

    public final void B0(long j10) {
        H0(R(j10));
    }

    public abstract void C0(int i10, String str);

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public abstract void G0(int i10, long j10);

    public abstract void H0(long j10);

    /* access modifiers changed from: package-private */
    public final void S(String str, o1.d dVar) {
        f7112c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(z.f7292a);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        } catch (c e11) {
            throw e11;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean T() {
        return this.f7115b;
    }

    public abstract int W();

    public abstract void X(byte b10);

    public abstract void Y(int i10, boolean z10);

    public final void Z(boolean z10) {
        X(z10 ? (byte) 1 : 0);
    }

    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, h hVar);

    public final void b0(int i10, double d10) {
        h0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d10) {
        i0(Double.doubleToRawLongBits(d10));
    }

    public final void d0(int i10, int i11) {
        n0(i10, i11);
    }

    public final void e0(int i10) {
        o0(i10);
    }

    public abstract void f0(int i10, int i11);

    public abstract void g0(int i10);

    public abstract void h0(int i10, long j10);

    public abstract void i0(long j10);

    public final void j0(int i10, float f10) {
        f0(i10, Float.floatToRawIntBits(f10));
    }

    public final void k0(float f10) {
        g0(Float.floatToRawIntBits(f10));
    }

    /* access modifiers changed from: package-private */
    public final void l0(int i10, o0 o0Var, d1 d1Var) {
        D0(i10, 3);
        m0(o0Var, d1Var);
        D0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    public final void m0(o0 o0Var, d1 d1Var) {
        d1Var.c(o0Var, this.f7114a);
    }

    public abstract void n0(int i10, int i11);

    public abstract void o0(int i10);

    public final void p0(int i10, long j10) {
        G0(i10, j10);
    }

    public final void q0(long j10) {
        H0(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void r0(int i10, o0 o0Var, d1 d1Var);

    public abstract void s0(int i10, o0 o0Var);

    public abstract void t0(int i10, h hVar);

    public final void u0(int i10, int i11) {
        f0(i10, i11);
    }

    public final void v0(int i10) {
        g0(i10);
    }

    public final void w0(int i10, long j10) {
        h0(i10, j10);
    }

    public final void x0(long j10) {
        i0(j10);
    }

    public final void y0(int i10, int i11) {
        E0(i10, Q(i11));
    }

    public final void z0(int i10) {
        F0(Q(i10));
    }
}
