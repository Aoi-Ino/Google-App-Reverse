package uo;

import ap.a;
import fo.e;
import fo.g;
import java.security.PublicKey;
import qn.o1;

public class b implements PublicKey {

    /* renamed from: e  reason: collision with root package name */
    private short[][] f32247e;

    /* renamed from: f  reason: collision with root package name */
    private short[][] f32248f;

    /* renamed from: g  reason: collision with root package name */
    private short[] f32249g;

    /* renamed from: h  reason: collision with root package name */
    private int f32250h;

    public b(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f32250h = i10;
        this.f32247e = sArr;
        this.f32248f = sArr2;
        this.f32249g = sArr3;
    }

    public short[][] a() {
        return this.f32247e;
    }

    public short[] b() {
        return a.e(this.f32249g);
    }

    public short[][] c() {
        short[][] sArr = new short[this.f32248f.length][];
        int i10 = 0;
        while (true) {
            short[][] sArr2 = this.f32248f;
            if (i10 == sArr2.length) {
                return sArr;
            }
            sArr[i10] = a.e(sArr2[i10]);
            i10++;
        }
    }

    public int d() {
        return this.f32250h;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32250h == bVar.d() && lo.a.j(this.f32247e, bVar.a()) && lo.a.j(this.f32248f, bVar.c()) && lo.a.i(this.f32249g, bVar.b());
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public byte[] getEncoded() {
        return wo.a.a(new wn.a(e.f23616a, o1.f30967f), new g(this.f32250h, this.f32247e, this.f32248f, this.f32249g));
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f32250h * 37) + a.o(this.f32247e)) * 37) + a.o(this.f32248f)) * 37) + a.n(this.f32249g);
    }

    public b(yo.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }
}
