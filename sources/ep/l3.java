package ep;

import dp.r;

class l3 {

    /* renamed from: a  reason: collision with root package name */
    private final h1 f23314a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f23315b;

    /* renamed from: c  reason: collision with root package name */
    private final j1 f23316c;

    /* renamed from: d  reason: collision with root package name */
    private final w1 f23317d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23318e;

    public l3(h1 h1Var, w1 w1Var, j1 j1Var, j1 j1Var2, boolean z10) {
        this.f23318e = z10;
        this.f23314a = h1Var;
        this.f23315b = j1Var;
        this.f23317d = w1Var;
        this.f23316c = j1Var2;
    }

    public h1 a() {
        return this.f23314a;
    }

    public r b() {
        j1 j1Var = this.f23315b;
        if (j1Var != null) {
            return (r) j1Var.q().b(r.class);
        }
        return null;
    }

    public c3 c() {
        return new a2(this.f23317d);
    }

    public j1 d() {
        return this.f23316c;
    }

    public j1 e() {
        return this.f23315b;
    }

    public boolean f() {
        return this.f23318e;
    }
}
