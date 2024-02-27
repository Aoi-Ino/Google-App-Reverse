package ko;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f24770a;

    /* renamed from: b  reason: collision with root package name */
    private int f24771b;

    /* renamed from: c  reason: collision with root package name */
    private int f24772c;

    /* renamed from: d  reason: collision with root package name */
    private short[][][] f24773d;

    /* renamed from: e  reason: collision with root package name */
    private short[][][] f24774e;

    /* renamed from: f  reason: collision with root package name */
    private short[][] f24775f;

    /* renamed from: g  reason: collision with root package name */
    private short[] f24776g;

    public a(byte b10, byte b11, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b12 = b10 & 255;
        this.f24770a = b12;
        byte b13 = b11 & 255;
        this.f24771b = b13;
        this.f24772c = b13 - b12;
        this.f24773d = sArr;
        this.f24774e = sArr2;
        this.f24775f = sArr3;
        this.f24776g = sArr4;
    }

    public short[][][] a() {
        return this.f24773d;
    }

    public short[][][] b() {
        return this.f24774e;
    }

    public short[] c() {
        return this.f24776g;
    }

    public short[][] d() {
        return this.f24775f;
    }

    public int e() {
        return this.f24772c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24770a == aVar.f() && this.f24771b == aVar.g() && this.f24772c == aVar.e() && lo.a.k(this.f24773d, aVar.a()) && lo.a.k(this.f24774e, aVar.b()) && lo.a.j(this.f24775f, aVar.d()) && lo.a.i(this.f24776g, aVar.c());
    }

    public int f() {
        return this.f24770a;
    }

    public int g() {
        return this.f24771b;
    }

    public int hashCode() {
        return (((((((((((this.f24770a * 37) + this.f24771b) * 37) + this.f24772c) * 37) + ap.a.p(this.f24773d)) * 37) + ap.a.p(this.f24774e)) * 37) + ap.a.o(this.f24775f)) * 37) + ap.a.n(this.f24776g);
    }
}
