package lm;

final class t0 implements f1 {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f25020e;

    public t0(boolean z10) {
        this.f25020e = z10;
    }

    public boolean c() {
        return this.f25020e;
    }

    public w1 f() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
