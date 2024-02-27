package ep;

import dp.m;
import dp.r;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

class e2 implements z2 {

    /* renamed from: a  reason: collision with root package name */
    private m3 f23154a;

    /* renamed from: b  reason: collision with root package name */
    private j f23155b;

    /* renamed from: c  reason: collision with root package name */
    private l3 f23156c;

    /* renamed from: d  reason: collision with root package name */
    private n3 f23157d;

    /* renamed from: e  reason: collision with root package name */
    private d0 f23158e;

    public e2(d0 d0Var, n3 n3Var) {
        this.f23155b = new j(d0Var, n3Var);
        this.f23154a = new m3(this, d0Var, n3Var);
        this.f23157d = n3Var;
        this.f23158e = d0Var;
        u(d0Var);
    }

    private void q(d0 d0Var) {
        Class type = d0Var.getType();
        if (this.f23156c == null) {
            this.f23156c = this.f23154a.b(type);
        }
        this.f23154a = null;
    }

    private void r(d0 d0Var) {
        Iterator it = this.f23157d.e(d0Var.getType(), d0Var.f()).iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            Annotation a10 = tVar.a();
            if (a10 != null) {
                this.f23154a.j(tVar, a10);
            }
        }
    }

    private void s(d0 d0Var) {
        Iterator it = this.f23157d.j(d0Var.getType(), d0Var.f()).iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            Annotation a10 = tVar.a();
            if (a10 != null) {
                this.f23154a.j(tVar, a10);
            }
        }
    }

    private void t(d0 d0Var) {
        this.f23154a.a(d0Var.getType());
    }

    private void u(d0 d0Var) {
        t(d0Var);
        r(d0Var);
        s(d0Var);
        v(d0Var);
        q(d0Var);
    }

    private void v(d0 d0Var) {
        Class type = d0Var.getType();
        this.f23154a.c(type);
        this.f23154a.o(type);
    }

    public boolean a() {
        return this.f23158e.a();
    }

    public h1 b() {
        return this.f23156c.a();
    }

    public boolean c() {
        return this.f23156c.f();
    }

    public c3 d() {
        return this.f23156c.c();
    }

    public r e() {
        return this.f23156c.b();
    }

    public g3 f() {
        return this.f23155b.o();
    }

    public c1 g() {
        return this.f23155b.m();
    }

    public String getName() {
        return this.f23158e.getName();
    }

    public m getOrder() {
        return this.f23155b.i();
    }

    public j1 getText() {
        return this.f23156c.d();
    }

    public Class getType() {
        return this.f23158e.getType();
    }

    public j1 getVersion() {
        return this.f23156c.e();
    }

    public c1 h() {
        return this.f23155b.k();
    }

    public c1 i() {
        return this.f23155b.l();
    }

    public boolean isEmpty() {
        return this.f23155b.n() == null;
    }

    public a0 j() {
        return this.f23155b.g();
    }

    public h k(w wVar) {
        return new h(this, wVar);
    }

    public c1 l() {
        return this.f23155b.q();
    }

    public j2 m() {
        return this.f23155b.j();
    }

    public List n() {
        return this.f23155b.p();
    }

    public c1 o() {
        return this.f23155b.f();
    }

    public c1 p() {
        return this.f23155b.e();
    }
}
