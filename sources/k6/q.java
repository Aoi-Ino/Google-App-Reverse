package k6;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f13005a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13006b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13007c;

    private q(Class cls, int i10, int i11) {
        this(d0.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class cls) {
        return new q(cls, 0, 0);
    }

    public static q h(Class cls) {
        return new q(cls, 0, 1);
    }

    public static q i(Class cls) {
        return new q(cls, 1, 0);
    }

    public static q j(d0 d0Var) {
        return new q(d0Var, 1, 0);
    }

    public static q k(Class cls) {
        return new q(cls, 1, 1);
    }

    public static q l(Class cls) {
        return new q(cls, 2, 0);
    }

    public d0 b() {
        return this.f13005a;
    }

    public boolean c() {
        return this.f13007c == 2;
    }

    public boolean d() {
        return this.f13007c == 0;
    }

    public boolean e() {
        return this.f13006b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13005a.equals(qVar.f13005a) && this.f13006b == qVar.f13006b && this.f13007c == qVar.f13007c;
    }

    public boolean f() {
        return this.f13006b == 2;
    }

    public int hashCode() {
        return ((((this.f13005a.hashCode() ^ 1000003) * 1000003) ^ this.f13006b) * 1000003) ^ this.f13007c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f13005a);
        sb2.append(", type=");
        int i10 = this.f13006b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f13007c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(d0 d0Var, int i10, int i11) {
        this.f13005a = (d0) c0.c(d0Var, "Null dependency anInterface.");
        this.f13006b = i10;
        this.f13007c = i11;
    }
}
