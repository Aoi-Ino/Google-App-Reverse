package ep;

import dp.r;
import fp.b;
import gp.d;
import gp.f;
import gp.g;
import hp.g0;
import hp.o;
import hp.r0;
import hp.y;

class k3 implements w {

    /* renamed from: a  reason: collision with root package name */
    private p3 f23284a;

    /* renamed from: b  reason: collision with root package name */
    private d f23285b;

    /* renamed from: c  reason: collision with root package name */
    private n3 f23286c;

    /* renamed from: d  reason: collision with root package name */
    private d3 f23287d;

    /* renamed from: e  reason: collision with root package name */
    private b f23288e;

    public k3(d dVar, n3 n3Var, d3 d3Var) {
        q3 q3Var = new q3(this, n3Var);
        this.f23288e = q3Var;
        this.f23284a = new p3(q3Var);
        this.f23285b = dVar;
        this.f23286c = n3Var;
        this.f23287d = d3Var;
    }

    private z2 p(Class cls) {
        return this.f23286c.m(cls);
    }

    public boolean a() {
        return this.f23287d.b();
    }

    public g b(f fVar, o oVar) {
        y c10 = oVar.c();
        if (c10 != null) {
            return this.f23285b.a(fVar, c10, this.f23287d);
        }
        throw new n2("No attributes for %s", oVar);
    }

    public a0 c(Class cls) {
        return p(cls).j();
    }

    public e1 d(Class cls) {
        return this.f23286c.g(cls);
    }

    public Object e(Object obj) {
        return this.f23287d.get(obj);
    }

    public n3 f() {
        return this.f23286c;
    }

    public h g(Class cls) {
        return p(cls).k(this);
    }

    public String getProperty(String str) {
        return this.f23284a.d(str);
    }

    public Class h(f fVar, Object obj) {
        return obj != null ? obj.getClass() : fVar.getType();
    }

    public b3 i(Class cls) {
        z2 p10 = p(cls);
        if (p10 != null) {
            return new k(p10, this);
        }
        throw new n2("Invalid schema class %s", cls);
    }

    public String j(Class cls) {
        return this.f23286c.k(cls);
    }

    public d3 k() {
        return this.f23287d;
    }

    public r0 l() {
        return this.f23286c.n();
    }

    public boolean m(f fVar, Object obj, g0 g0Var) {
        y c10 = g0Var.c();
        if (c10 != null) {
            return this.f23285b.b(fVar, obj, c10, this.f23287d);
        }
        throw new n2("No attributes for %s", g0Var);
    }

    public r n(Class cls) {
        return p(cls).e();
    }

    public boolean o(Class cls) {
        return this.f23286c.q(cls);
    }
}
