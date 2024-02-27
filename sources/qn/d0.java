package qn;

import ap.a;
import java.io.IOException;
import java.util.Iterator;

public abstract class d0 extends z implements Iterable {

    /* renamed from: g  reason: collision with root package name */
    static final m0 f30893g = new a(d0.class, 17);

    /* renamed from: e  reason: collision with root package name */
    protected final f[] f30894e;

    /* renamed from: f  reason: collision with root package name */
    protected final boolean f30895f;

    static class a extends m0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* access modifiers changed from: package-private */
        public z c(c0 c0Var) {
            return c0Var.q0();
        }
    }

    protected d0() {
        this.f30894e = g.f30916d;
        this.f30895f = true;
    }

    private static byte[] i0(f fVar) {
        try {
            return fVar.n().v("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static d0 j0(h0 h0Var, boolean z10) {
        return (d0) f30893g.e(h0Var, z10);
    }

    private static boolean k0(byte[] bArr, byte[] bArr2) {
        byte b10 = bArr[0] & -33;
        byte b11 = bArr2[0] & -33;
        if (b10 != b11) {
            return b10 < b11;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i10 = 1; i10 < min; i10++) {
            byte b12 = bArr[i10];
            byte b13 = bArr2[i10];
            if (b12 != b13) {
                return (b12 & 255) < (b13 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void l0(f[] fVarArr) {
        int i10;
        int length = fVarArr.length;
        if (length >= 2) {
            f fVar = fVarArr[0];
            f fVar2 = fVarArr[1];
            byte[] i02 = i0(fVar);
            byte[] i03 = i0(fVar2);
            if (k0(i03, i02)) {
                f fVar3 = fVar2;
                fVar2 = fVar;
                fVar = fVar3;
                byte[] bArr = i03;
                i03 = i02;
                i02 = bArr;
            }
            for (int i11 = 2; i11 < length; i11++) {
                f fVar4 = fVarArr[i11];
                byte[] i04 = i0(fVar4);
                if (k0(i03, i04)) {
                    fVarArr[i11 - 2] = fVar;
                    fVar = fVar2;
                    i02 = i03;
                    fVar2 = fVar4;
                    i03 = i04;
                } else if (k0(i02, i04)) {
                    fVarArr[i11 - 2] = fVar;
                    fVar = fVar4;
                    i02 = i04;
                } else {
                    int i12 = i11 - 1;
                    while (true) {
                        i10 = i12 - 1;
                        if (i10 <= 0) {
                            break;
                        }
                        f fVar5 = fVarArr[i12 - 2];
                        if (k0(i0(fVar5), i04)) {
                            break;
                        }
                        fVarArr[i10] = fVar5;
                        i12 = i10;
                    }
                    fVarArr[i10] = fVar4;
                }
            }
            fVarArr[length - 2] = fVar;
            fVarArr[length - 1] = fVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        f[] fVarArr;
        if (this.f30895f) {
            fVarArr = this.f30894e;
        } else {
            fVarArr = (f[]) this.f30894e.clone();
            l0(fVarArr);
        }
        return new v1(true, fVarArr);
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return new k2(this.f30895f, this.f30894e);
    }

    public int hashCode() {
        int length = this.f30894e.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 += this.f30894e[length].n().hashCode();
        }
    }

    public Iterator iterator() {
        return new a.C0259a(m0());
    }

    public f[] m0() {
        return g.b(this.f30894e);
    }

    public int size() {
        return this.f30894e.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f30894e[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y(z zVar) {
        if (!(zVar instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) zVar;
        int size = size();
        if (d0Var.size() != size) {
            return false;
        }
        v1 v1Var = (v1) g0();
        v1 v1Var2 = (v1) d0Var.g0();
        for (int i10 = 0; i10 < size; i10++) {
            z n10 = v1Var.f30894e[i10].n();
            z n11 = v1Var2.f30894e[i10].n();
            if (n10 != n11 && !n10.y(n11)) {
                return false;
            }
        }
        return true;
    }

    protected d0(g gVar, boolean z10) {
        f[] fVarArr;
        if (gVar != null) {
            if (!z10 || gVar.f() < 2) {
                fVarArr = gVar.g();
            } else {
                fVarArr = gVar.c();
                l0(fVarArr);
            }
            this.f30894e = fVarArr;
            this.f30895f = z10 || fVarArr.length < 2;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    d0(boolean z10, f[] fVarArr) {
        this.f30894e = fVarArr;
        this.f30895f = z10 || fVarArr.length < 2;
    }
}
