package qn;

import java.io.OutputStream;

public class x {

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f31014a;

    x(OutputStream outputStream) {
        this.f31014a = outputStream;
    }

    public static x a(OutputStream outputStream) {
        return new x(outputStream);
    }

    public static x b(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new s1(outputStream);
        }
        return str.equals("DL") ? new h2(outputStream) : new x(outputStream);
    }

    static int f(int i10) {
        if (i10 < 128) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 8;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    static int g(boolean z10, int i10) {
        return (z10 ? 1 : 0) + f(i10) + i10;
    }

    static int h(int i10) {
        if (i10 < 31) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 7;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
    }

    /* access modifiers changed from: package-private */
    public s1 d() {
        return new s1(this.f31014a);
    }

    /* access modifiers changed from: package-private */
    public h2 e() {
        return new h2(this.f31014a);
    }

    /* access modifiers changed from: package-private */
    public final void i(int i10) {
        this.f31014a.write(i10);
    }

    /* access modifiers changed from: package-private */
    public final void j(byte[] bArr, int i10, int i11) {
        this.f31014a.write(bArr, i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10) {
        if (i10 < 128) {
            i(i10);
            return;
        }
        int i11 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i12 = i11 - 1;
            bArr[i12] = (byte) i10;
            i10 >>>= 8;
            if (i10 == 0) {
                int i13 = i11 - 2;
                bArr[i13] = (byte) ((5 - i12) | 128);
                j(bArr, i13, 6 - i12);
                return;
            }
            i11 = i12;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(f[] fVarArr) {
        for (f n10 : fVarArr) {
            n10.n().B(this, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z10, int i10, byte b10) {
        s(z10, i10);
        k(1);
        i(b10);
    }

    /* access modifiers changed from: package-private */
    public final void n(boolean z10, int i10, byte b10, byte[] bArr, int i11, int i12) {
        s(z10, i10);
        k(i12 + 1);
        i(b10);
        j(bArr, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public final void o(boolean z10, int i10, byte[] bArr) {
        s(z10, i10);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public final void p(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        s(z10, i10);
        k(i12);
        j(bArr, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public final void q(boolean z10, int i10, byte[] bArr, int i11, int i12, byte b10) {
        s(z10, i10);
        k(i12 + 1);
        j(bArr, i11, i12);
        i(b10);
    }

    /* access modifiers changed from: package-private */
    public final void r(boolean z10, int i10, f[] fVarArr) {
        s(z10, i10);
        i(128);
        l(fVarArr);
        i(0);
        i(0);
    }

    /* access modifiers changed from: package-private */
    public final void s(boolean z10, int i10) {
        if (z10) {
            i(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(boolean z10, int i10, int i11) {
        if (z10) {
            if (i11 < 31) {
                i(i10 | i11);
                return;
            }
            byte[] bArr = new byte[6];
            int i12 = 5;
            bArr[5] = (byte) (i11 & 127);
            while (i11 > 127) {
                i11 >>>= 7;
                i12--;
                bArr[i12] = (byte) ((i11 & 127) | 128);
            }
            int i13 = i12 - 1;
            bArr[i13] = (byte) (31 | i10);
            j(bArr, i13, 6 - i13);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(z zVar, boolean z10) {
        zVar.B(this, z10);
    }

    /* access modifiers changed from: package-private */
    public void v(z[] zVarArr) {
        for (z B : zVarArr) {
            B.B(this, true);
        }
    }
}
