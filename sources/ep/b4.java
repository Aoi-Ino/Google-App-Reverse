package ep;

import gp.f;
import hp.g0;
import hp.j0;
import hp.o;
import java.lang.annotation.Annotation;

class b4 implements j1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f23129a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f23130b;

    private static class a implements u2 {

        /* renamed from: a  reason: collision with root package name */
        private final x f23131a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f23132b;

        /* renamed from: c  reason: collision with root package name */
        private final j1 f23133c;

        public a(x xVar, j1 j1Var, Object obj) {
            this.f23131a = xVar;
            this.f23132b = obj;
            this.f23133c = j1Var;
        }

        public Object a(o oVar, Object obj) {
            j0 position = oVar.getPosition();
            String name = oVar.getName();
            x xVar = this.f23131a;
            if (xVar instanceof u2) {
                return ((u2) xVar).a(oVar, obj);
            }
            throw new n2("Element '%s' is already used with %s at %s", name, this.f23133c, position);
        }

        public Object b(o oVar) {
            return a(oVar, this.f23132b);
        }

        public void c(g0 g0Var, Object obj) {
            c(g0Var, obj);
        }
    }

    public b4(j1 j1Var, Object obj) {
        this.f23130b = j1Var;
        this.f23129a = obj;
    }

    public Annotation a() {
        return this.f23130b.a();
    }

    public String b() {
        return this.f23130b.b();
    }

    public Object c() {
        return this.f23129a;
    }

    public w0 d() {
        return this.f23130b.d();
    }

    public boolean e() {
        return this.f23130b.e();
    }

    public String f() {
        return this.f23130b.f();
    }

    public boolean g() {
        return this.f23130b.g();
    }

    public Object getKey() {
        return this.f23130b.getKey();
    }

    public String getName() {
        return this.f23130b.getName();
    }

    public Class getType() {
        return this.f23130b.getType();
    }

    public boolean h() {
        return this.f23130b.h();
    }

    public f i() {
        return this.f23130b.i();
    }

    public a0 j() {
        return this.f23130b.j();
    }

    public Object k(w wVar) {
        return this.f23130b.k(wVar);
    }

    public x l(w wVar) {
        x l10 = this.f23130b.l(wVar);
        return l10 instanceof a ? l10 : new a(l10, this.f23130b, this.f23129a);
    }

    public String[] m() {
        return this.f23130b.m();
    }

    public String[] n() {
        return this.f23130b.n();
    }

    public j1 o(Class cls) {
        return this;
    }

    public boolean p() {
        return this.f23130b.p();
    }

    public t q() {
        return this.f23130b.q();
    }

    public f r(Class cls) {
        return this.f23130b.r(cls);
    }

    public boolean s() {
        return this.f23130b.s();
    }

    public String t() {
        return this.f23130b.t();
    }

    public String toString() {
        return this.f23130b.toString();
    }

    public boolean u() {
        return this.f23130b.u();
    }

    public boolean v() {
        return this.f23130b.v();
    }

    public boolean w() {
        return this.f23130b.w();
    }
}
