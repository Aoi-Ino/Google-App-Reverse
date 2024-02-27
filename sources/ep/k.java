package ep;

import dp.r;

class k implements b3 {

    /* renamed from: a  reason: collision with root package name */
    private final h1 f23270a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f23271b;

    /* renamed from: c  reason: collision with root package name */
    private final c3 f23272c;

    /* renamed from: d  reason: collision with root package name */
    private final r f23273d;

    /* renamed from: e  reason: collision with root package name */
    private final h f23274e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f23275f;

    /* renamed from: g  reason: collision with root package name */
    private final j1 f23276g;

    /* renamed from: h  reason: collision with root package name */
    private final Class f23277h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f23278i;

    public k(z2 z2Var, w wVar) {
        this.f23274e = z2Var.k(wVar);
        this.f23270a = z2Var.b();
        this.f23273d = z2Var.e();
        this.f23271b = z2Var.j();
        this.f23278i = z2Var.c();
        this.f23275f = z2Var.getVersion();
        this.f23272c = z2Var.d();
        this.f23276g = z2Var.getText();
        this.f23277h = z2Var.getType();
    }

    public h a() {
        return this.f23274e;
    }

    public h1 b() {
        return this.f23270a;
    }

    public boolean c() {
        return this.f23278i;
    }

    public c3 d() {
        return this.f23272c;
    }

    public r e() {
        return this.f23273d;
    }

    public j1 getVersion() {
        return this.f23275f;
    }

    public String toString() {
        return String.format("schema for %s", new Object[]{this.f23277h});
    }
}
