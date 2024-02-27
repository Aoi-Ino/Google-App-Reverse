package y2;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f18480a;

    b(Integer num) {
        this.f18480a = num;
    }

    public Integer a() {
        return this.f18480a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f18480a;
        Integer a10 = ((f) obj).a();
        if (num == null) {
            return a10 == null;
        }
        return num.equals(a10);
    }

    public int hashCode() {
        Integer num = this.f18480a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f18480a + "}";
    }
}
