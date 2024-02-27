package hp;

class c0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private t f24225a;

    /* renamed from: b  reason: collision with root package name */
    private g0 f24226b;

    /* renamed from: c  reason: collision with root package name */
    private String f24227c;

    /* renamed from: d  reason: collision with root package name */
    private String f24228d;

    /* renamed from: e  reason: collision with root package name */
    private String f24229e;

    public c0(g0 g0Var, String str, String str2) {
        this.f24225a = g0Var.e();
        this.f24226b = g0Var;
        this.f24229e = str2;
        this.f24228d = str;
    }

    public y c() {
        return new h0(this);
    }

    public void commit() {
    }

    public void d(String str) {
        this.f24227c = str;
    }

    public t e() {
        return this.f24225a;
    }

    public String f() {
        return null;
    }

    public void g(boolean z10) {
    }

    public String getName() {
        return this.f24228d;
    }

    public String getPrefix() {
        return this.f24225a.Z(this.f24227c);
    }

    public String getValue() {
        return this.f24229e;
    }

    public String h(boolean z10) {
        return this.f24225a.Z(this.f24227c);
    }

    public void i(String str) {
        this.f24229e = str;
    }

    public g0 j(String str, String str2) {
        return null;
    }

    public g0 k(String str) {
        return null;
    }

    public s m() {
        return s.INHERIT;
    }

    public String toString() {
        return String.format("attribute %s='%s'", new Object[]{this.f24228d, this.f24229e});
    }
}
