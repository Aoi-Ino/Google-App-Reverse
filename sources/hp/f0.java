package hp;

class f0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private h0 f24238a = new h0(this);

    /* renamed from: b  reason: collision with root package name */
    private t f24239b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f24240c;

    /* renamed from: d  reason: collision with root package name */
    private g0 f24241d;

    /* renamed from: e  reason: collision with root package name */
    private String f24242e;

    /* renamed from: f  reason: collision with root package name */
    private String f24243f;

    /* renamed from: g  reason: collision with root package name */
    private String f24244g;

    /* renamed from: h  reason: collision with root package name */
    private String f24245h;

    /* renamed from: i  reason: collision with root package name */
    private s f24246i = s.INHERIT;

    public f0(g0 g0Var, b0 b0Var, String str) {
        this.f24239b = new k0(g0Var);
        this.f24240c = b0Var;
        this.f24241d = g0Var;
        this.f24245h = str;
    }

    public void commit() {
        this.f24240c.a(this);
    }

    public void d(String str) {
        this.f24242e = str;
    }

    public t e() {
        return this.f24239b;
    }

    public String f() {
        return this.f24243f;
    }

    public void g(boolean z10) {
        this.f24246i = z10 ? s.DATA : s.ESCAPE;
    }

    public String getName() {
        return this.f24245h;
    }

    public String getPrefix() {
        return h(true);
    }

    public String getValue() {
        return this.f24244g;
    }

    public String h(boolean z10) {
        String Z = this.f24239b.Z(this.f24242e);
        return (!z10 || Z != null) ? Z : this.f24241d.getPrefix();
    }

    public void i(String str) {
        this.f24244g = str;
    }

    public g0 j(String str, String str2) {
        return this.f24238a.P(str, str2);
    }

    public g0 k(String str) {
        return this.f24240c.e(this, str);
    }

    public s m() {
        return this.f24246i;
    }

    /* renamed from: o */
    public h0 c() {
        return this.f24238a;
    }

    public String toString() {
        return String.format("element %s", new Object[]{this.f24245h});
    }
}
