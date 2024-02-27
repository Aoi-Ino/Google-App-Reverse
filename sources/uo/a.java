package uo;

import java.security.PrivateKey;
import java.util.Arrays;

public class a implements PrivateKey {

    /* renamed from: e  reason: collision with root package name */
    private short[][] f32241e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f32242f;

    /* renamed from: g  reason: collision with root package name */
    private short[][] f32243g;

    /* renamed from: h  reason: collision with root package name */
    private short[] f32244h;

    /* renamed from: i  reason: collision with root package name */
    private ko.a[] f32245i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f32246j;

    public a(yo.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public short[] a() {
        return this.f32242f;
    }

    public short[] b() {
        return this.f32244h;
    }

    public short[][] c() {
        return this.f32241e;
    }

    public short[][] d() {
        return this.f32243g;
    }

    public ko.a[] e() {
        return this.f32245i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean z10 = lo.a.j(this.f32241e, aVar.c()) && lo.a.j(this.f32243g, aVar.d()) && lo.a.i(this.f32242f, aVar.a()) && lo.a.i(this.f32244h, aVar.b()) && Arrays.equals(this.f32246j, aVar.f());
        if (this.f32245i.length != aVar.e().length) {
            return false;
        }
        for (int length = this.f32245i.length - 1; length >= 0; length--) {
            z10 &= this.f32245i[length].equals(aVar.e()[length]);
        }
        return z10;
    }

    public int[] f() {
        return this.f32246j;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r8 = this;
            fo.f r7 = new fo.f
            short[][] r1 = r8.f32241e
            short[] r2 = r8.f32242f
            short[][] r3 = r8.f32243g
            short[] r4 = r8.f32244h
            int[] r5 = r8.f32246j
            ko.a[] r6 = r8.f32245i
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            wn.a r1 = new wn.a     // Catch:{ IOException -> 0x0025 }
            qn.u r2 = fo.e.f23616a     // Catch:{ IOException -> 0x0025 }
            qn.o1 r3 = qn.o1.f30967f     // Catch:{ IOException -> 0x0025 }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0025 }
            vn.b r2 = new vn.b     // Catch:{ IOException -> 0x0025 }
            r2.<init>(r1, r7)     // Catch:{ IOException -> 0x0025 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.a.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f32245i.length * 37) + ap.a.o(this.f32241e)) * 37) + ap.a.n(this.f32242f)) * 37) + ap.a.o(this.f32243g)) * 37) + ap.a.n(this.f32244h)) * 37) + ap.a.m(this.f32246j);
        for (int length2 = this.f32245i.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f32245i[length2].hashCode();
        }
        return length;
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, ko.a[] aVarArr) {
        this.f32241e = sArr;
        this.f32242f = sArr2;
        this.f32243g = sArr3;
        this.f32244h = sArr4;
        this.f32246j = iArr;
        this.f32245i = aVarArr;
    }
}
