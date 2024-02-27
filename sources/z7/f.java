package z7;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;

public class f {

    /* renamed from: j  reason: collision with root package name */
    public static final f f18917j = new f(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final f f18918k = new f(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final f f18919l = new f(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final f f18920m = new f(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    double f18921a;

    /* renamed from: b  reason: collision with root package name */
    double f18922b;

    /* renamed from: c  reason: collision with root package name */
    double f18923c;

    /* renamed from: d  reason: collision with root package name */
    double f18924d;

    /* renamed from: e  reason: collision with root package name */
    double f18925e;

    /* renamed from: f  reason: collision with root package name */
    double f18926f;

    /* renamed from: g  reason: collision with root package name */
    double f18927g;

    /* renamed from: h  reason: collision with root package name */
    double f18928h;

    /* renamed from: i  reason: collision with root package name */
    double f18929i;

    public f(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f18921a = d14;
        this.f18922b = d15;
        this.f18923c = d16;
        this.f18924d = d10;
        this.f18925e = d11;
        this.f18926f = d12;
        this.f18927g = d13;
        this.f18928h = d17;
        this.f18929i = d18;
    }

    public static f a(ByteBuffer byteBuffer) {
        return b(c.d(byteBuffer), c.d(byteBuffer), c.c(byteBuffer), c.d(byteBuffer), c.d(byteBuffer), c.c(byteBuffer), c.d(byteBuffer), c.d(byteBuffer), c.c(byteBuffer));
    }

    public static f b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return new f(d10, d11, d13, d14, d12, d15, d18, d16, d17);
    }

    public void c(ByteBuffer byteBuffer) {
        d.b(byteBuffer, this.f18924d);
        d.b(byteBuffer, this.f18925e);
        d.a(byteBuffer, this.f18921a);
        d.b(byteBuffer, this.f18926f);
        d.b(byteBuffer, this.f18927g);
        d.a(byteBuffer, this.f18922b);
        d.b(byteBuffer, this.f18928h);
        d.b(byteBuffer, this.f18929i);
        d.a(byteBuffer, this.f18923c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(fVar.f18924d, this.f18924d) == 0 && Double.compare(fVar.f18925e, this.f18925e) == 0 && Double.compare(fVar.f18926f, this.f18926f) == 0 && Double.compare(fVar.f18927g, this.f18927g) == 0 && Double.compare(fVar.f18928h, this.f18928h) == 0 && Double.compare(fVar.f18929i, this.f18929i) == 0 && Double.compare(fVar.f18921a, this.f18921a) == 0 && Double.compare(fVar.f18922b, this.f18922b) == 0 && Double.compare(fVar.f18923c, this.f18923c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18921a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18922b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f18923c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f18924d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f18925e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f18926f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f18927g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f18928h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f18929i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public String toString() {
        if (equals(f18917j)) {
            return "Rotate 0°";
        }
        if (equals(f18918k)) {
            return "Rotate 90°";
        }
        if (equals(f18919l)) {
            return "Rotate 180°";
        }
        if (equals(f18920m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f18921a + ", v=" + this.f18922b + ", w=" + this.f18923c + ", a=" + this.f18924d + ", b=" + this.f18925e + ", c=" + this.f18926f + ", d=" + this.f18927g + ", tx=" + this.f18928h + ", ty=" + this.f18929i + '}';
    }
}
