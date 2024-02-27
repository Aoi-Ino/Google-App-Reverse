package hp;

class e0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private h0 f24231a = new h0(this);

    /* renamed from: b  reason: collision with root package name */
    private b0 f24232b;

    /* renamed from: c  reason: collision with root package name */
    private i0 f24233c;

    /* renamed from: d  reason: collision with root package name */
    private String f24234d;

    /* renamed from: e  reason: collision with root package name */
    private String f24235e;

    /* renamed from: f  reason: collision with root package name */
    private String f24236f;

    /* renamed from: g  reason: collision with root package name */
    private s f24237g = s.INHERIT;

    public e0(b0 b0Var, i0 i0Var) {
        this.f24232b = b0Var;
        this.f24233c = i0Var;
    }

    public y c() {
        return this.f24231a;
    }

    public void commit() {
        if (!this.f24233c.isEmpty()) {
            this.f24233c.r().commit();
            return;
        }
        throw new w("No root node");
    }

    public void d(String str) {
        this.f24234d = str;
    }

    public t e() {
        return null;
    }

    public String f() {
        return this.f24235e;
    }

    public void g(boolean z10) {
        this.f24237g = z10 ? s.DATA : s.ESCAPE;
    }

    public String getName() {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public String getValue() {
        return this.f24236f;
    }

    public String h(boolean z10) {
        return null;
    }

    public void i(String str) {
        this.f24236f = str;
    }

    public g0 j(String str, String str2) {
        return this.f24231a.P(str, str2);
    }

    public g0 k(String str) {
        return this.f24232b.e(this, str);
    }

    public s m() {
        return this.f24237g;
    }
}
