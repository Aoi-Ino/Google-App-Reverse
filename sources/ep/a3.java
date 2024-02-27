package ep;

import jp.a;
import jp.b;

class a3 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23114a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final n3 f23115b;

    public a3(n3 n3Var) {
        this.f23115b = n3Var;
    }

    public z2 a(Class cls) {
        z2 e2Var;
        z2 z2Var = (z2) this.f23114a.b(cls);
        if (z2Var == null) {
            d0 c10 = this.f23115b.c(cls);
            if (this.f23115b.q(cls)) {
                e2Var = new s2(c10);
            } else {
                e2Var = new e2(c10, this.f23115b);
                if (e2Var.c() && !this.f23115b.p(cls)) {
                    e2Var = new c0(c10, this.f23115b);
                }
            }
            z2Var = e2Var;
            this.f23114a.a(cls, z2Var);
        }
        return z2Var;
    }
}
