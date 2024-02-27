package e8;

public class j extends n {

    /* renamed from: p  reason: collision with root package name */
    float f10843p;

    /* renamed from: q  reason: collision with root package name */
    float f10844q;

    /* renamed from: r  reason: collision with root package name */
    float f10845r;

    /* renamed from: s  reason: collision with root package name */
    float f10846s;

    public j(float f10, float f11, float f12, float f13) {
        super(2, (1.0f - f10) - f13, (1.0f - f11) - f13, (1.0f - f12) - f13);
        this.f10843p = n.h(f10);
        this.f10844q = n.h(f11);
        this.f10845r = n.h(f12);
        this.f10846s = n.h(f13);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f10843p == jVar.f10843p && this.f10844q == jVar.f10844q && this.f10845r == jVar.f10845r && this.f10846s == jVar.f10846s;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.f10843p) ^ Float.floatToIntBits(this.f10844q)) ^ Float.floatToIntBits(this.f10845r)) ^ Float.floatToIntBits(this.f10846s);
    }

    public float i() {
        return this.f10846s;
    }

    public float j() {
        return this.f10843p;
    }

    public float k() {
        return this.f10844q;
    }

    public float l() {
        return this.f10845r;
    }

    public j(int i10, int i11, int i12, int i13) {
        this(((float) i10) / 255.0f, ((float) i11) / 255.0f, ((float) i12) / 255.0f, ((float) i13) / 255.0f);
    }
}
