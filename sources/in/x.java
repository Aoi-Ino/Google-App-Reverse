package in;

import cm.l;
import java.security.MessageDigest;
import jn.c;

public final class x extends h {

    /* renamed from: j  reason: collision with root package name */
    private final transient byte[][] f24511j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int[] f24512k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(byte[][] bArr, int[] iArr) {
        super(h.f24467h.e());
        l.f(bArr, "segments");
        l.f(iArr, "directory");
        this.f24511j = bArr;
        this.f24512k = iArr;
    }

    private final h y() {
        return new h(x());
    }

    public String a() {
        return y().a();
    }

    public h c(String str) {
        l.f(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = w().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = v()[length + i10];
            int i13 = v()[i10];
            instance.update(w()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = instance.digest();
        l.e(digest, "digest.digest()");
        return new h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.q() == q() && l(0, hVar, 0, q())) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        return v()[w().length - 1];
    }

    public int hashCode() {
        int f10 = f();
        if (f10 != 0) {
            return f10;
        }
        int length = w().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = v()[length + i10];
            int i14 = v()[i10];
            byte[] bArr = w()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        n(i11);
        return i11;
    }

    public String i() {
        return y().i();
    }

    public byte[] j() {
        return x();
    }

    public byte k(int i10) {
        c.b((long) v()[w().length - 1], (long) i10, 1);
        int b10 = c.b(this, i10);
        return w()[b10][(i10 - (b10 == 0 ? 0 : v()[b10 - 1])) + v()[w().length + b10]];
    }

    public boolean l(int i10, h hVar, int i11, int i12) {
        l.f(hVar, "other");
        if (i10 < 0 || i10 > q() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : v()[b10 - 1];
            int i15 = v()[w().length + b10];
            int min = Math.min(i13, (v()[b10] - i14) + i14) - i10;
            if (!hVar.m(i11, w()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        l.f(bArr, "other");
        if (i10 < 0 || i10 > q() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : v()[b10 - 1];
            int i15 = v()[w().length + b10];
            int min = Math.min(i13, (v()[b10] - i14) + i14) - i10;
            if (!c.a(w()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public h s() {
        return y().s();
    }

    public String toString() {
        return y().toString();
    }

    public void u(e eVar, int i10, int i11) {
        l.f(eVar, "buffer");
        int i12 = i11 + i10;
        int b10 = c.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : v()[b10 - 1];
            int i14 = v()[w().length + b10];
            int min = Math.min(i12, (v()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            v vVar = new v(w()[b10], i15, i15 + min, true, false);
            v vVar2 = eVar.f24463e;
            if (vVar2 == null) {
                vVar.f24505g = vVar;
                vVar.f24504f = vVar;
                eVar.f24463e = vVar;
            } else {
                l.c(vVar2);
                v vVar3 = vVar2.f24505g;
                l.c(vVar3);
                vVar3.c(vVar);
            }
            i10 += min;
            b10++;
        }
        eVar.G0(eVar.H0() + ((long) q()));
    }

    public final int[] v() {
        return this.f24512k;
    }

    public final byte[][] w() {
        return this.f24511j;
    }

    public byte[] x() {
        byte[] bArr = new byte[q()];
        int length = w().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = v()[length + i10];
            int i14 = v()[i10];
            int i15 = i14 - i11;
            byte[] unused = l.d(w()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }
}
