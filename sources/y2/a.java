package y2;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f18476a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f18477b;

    /* renamed from: c  reason: collision with root package name */
    private final e f18478c;

    /* renamed from: d  reason: collision with root package name */
    private final f f18479d;

    a(Integer num, Object obj, e eVar, f fVar) {
        this.f18476a = num;
        if (obj != null) {
            this.f18477b = obj;
            if (eVar != null) {
                this.f18478c = eVar;
                this.f18479d = fVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return this.f18476a;
    }

    public Object b() {
        return this.f18477b;
    }

    public e c() {
        return this.f18478c;
    }

    public f d() {
        return this.f18479d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f18476a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f18477b.equals(dVar.b()) && this.f18478c.equals(dVar.c())) {
                f fVar = this.f18479d;
                f d10 = dVar.d();
                if (fVar == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (fVar.equals(d10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f18476a;
        int i10 = 0;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f18477b.hashCode()) * 1000003) ^ this.f18478c.hashCode()) * 1000003;
        f fVar = this.f18479d;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Event{code=" + this.f18476a + ", payload=" + this.f18477b + ", priority=" + this.f18478c + ", productData=" + this.f18479d + "}";
    }
}
