package ep;

import dp.r;
import gp.f;
import hp.g0;
import hp.j0;
import hp.o;
import hp.t;
import hp.y;
import java.util.Iterator;

class q implements x {

    /* renamed from: a  reason: collision with root package name */
    private final c2 f23372a;

    /* renamed from: b  reason: collision with root package name */
    private final q2 f23373b;

    /* renamed from: c  reason: collision with root package name */
    private final z f23374c;

    /* renamed from: d  reason: collision with root package name */
    private final x2 f23375d;

    /* renamed from: e  reason: collision with root package name */
    private final w f23376e;

    /* renamed from: f  reason: collision with root package name */
    private final f f23377f;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        protected final q f23378a;

        /* renamed from: b  reason: collision with root package name */
        protected final z f23379b;

        /* renamed from: c  reason: collision with root package name */
        protected final b3 f23380c;

        /* renamed from: d  reason: collision with root package name */
        protected final e1 f23381d;

        public b(q qVar, z zVar, b3 b3Var, e1 e1Var) {
            this.f23378a = qVar;
            this.f23379b = zVar;
            this.f23380c = b3Var;
            this.f23381d = e1Var;
        }

        public Object a(o oVar) {
            Object c10 = this.f23381d.c();
            c3 d10 = this.f23380c.d();
            this.f23381d.b(c10);
            this.f23378a.x(oVar, c10, this.f23380c);
            this.f23378a.t(oVar, c10, d10);
            this.f23378a.m(oVar, c10, d10);
            this.f23378a.o(oVar, c10, d10);
            this.f23379b.f0(c10);
            return c10;
        }
    }

    private class c extends b {
        private c(q qVar, z zVar, b3 b3Var, e1 e1Var) {
            super(qVar, zVar, b3Var, e1Var);
        }

        private Object b(o oVar) {
            Object a10 = this.f23380c.b().a(this.f23379b);
            this.f23381d.b(a10);
            this.f23379b.f0(a10);
            return a10;
        }

        public Object a(o oVar) {
            c3 d10 = this.f23380c.d();
            this.f23378a.x(oVar, (Object) null, this.f23380c);
            this.f23378a.t(oVar, (Object) null, d10);
            this.f23378a.m(oVar, (Object) null, d10);
            this.f23378a.o(oVar, (Object) null, d10);
            return b(oVar);
        }
    }

    public q(w wVar, f fVar) {
        this(wVar, fVar, (Class) null);
    }

    private void A(g0 g0Var, Object obj, j1 j1Var) {
        if (obj != null) {
            j1Var.j().a(g0Var.j(j1Var.getName(), this.f23372a.j(obj)));
        }
    }

    private void B(g0 g0Var, Object obj, c3 c3Var) {
        Iterator it = c3Var.c().iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            Object obj2 = j1Var.q().get(obj);
            Class h10 = this.f23376e.h(this.f23377f, obj);
            if (obj2 == null) {
                obj2 = j1Var.k(this.f23376e);
            }
            if (obj2 != null || !j1Var.e()) {
                A(g0Var, obj2, j1Var);
            } else {
                throw new c("Value for %s is null in %s", j1Var, h10);
            }
        }
    }

    private void C(g0 g0Var, Object obj, x xVar) {
        xVar.c(g0Var, obj);
    }

    private void D(g0 g0Var, Object obj, j1 j1Var) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            j1 o10 = j1Var.o(cls);
            String name = o10.getName();
            f r10 = j1Var.r(cls);
            g0 k10 = g0Var.k(name);
            if (!o10.u()) {
                F(k10, r10, o10);
            }
            if (o10.u() || !h(k10, obj, r10)) {
                x l10 = o10.l(this.f23376e);
                k10.g(o10.w());
                C(k10, obj, l10);
            }
        }
    }

    private void E(g0 g0Var, Object obj, c3 c3Var) {
        Iterator it = c3Var.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c3 A = c3Var.A(str);
            if (A != null) {
                H(g0Var.k(str), obj, A);
            } else {
                j1 e10 = c3Var.e(c3Var.V(str));
                Class h10 = this.f23376e.h(this.f23377f, obj);
                if (this.f23374c.m(e10) != null) {
                    continue;
                } else if (e10 != null) {
                    K(g0Var, obj, c3Var, e10);
                } else {
                    throw new i0("Element '%s' not defined in %s", str, h10);
                }
            }
        }
    }

    private void F(g0 g0Var, f fVar, j1 j1Var) {
        j1Var.j().b(g0Var, this.f23376e.c(fVar.getType()));
    }

    private Object G(Object obj) {
        if (obj == null) {
            return obj;
        }
        return this.f23376e.g(obj.getClass()).d(obj);
    }

    private void H(g0 g0Var, Object obj, c3 c3Var) {
        t e10 = g0Var.e();
        String prefix = c3Var.getPrefix();
        if (prefix != null) {
            String d02 = e10.d0(prefix);
            if (d02 != null) {
                g0Var.d(d02);
            } else {
                throw new i0("Namespace prefix '%s' in %s is not in scope", prefix, this.f23377f);
            }
        }
        B(g0Var, obj, c3Var);
        E(g0Var, obj, c3Var);
        J(g0Var, obj, c3Var);
    }

    private void I(g0 g0Var, Object obj, j1 j1Var) {
        if (obj != null && !j1Var.s()) {
            String j10 = this.f23372a.j(obj);
            g0Var.g(j1Var.w());
            g0Var.i(j10);
        }
    }

    private void J(g0 g0Var, Object obj, c3 c3Var) {
        j1 text = c3Var.getText();
        if (text != null) {
            Object obj2 = text.q().get(obj);
            Class h10 = this.f23376e.h(this.f23377f, obj);
            if (obj2 == null) {
                obj2 = text.k(this.f23376e);
            }
            if (obj2 != null || !text.e()) {
                I(g0Var, obj2, text);
                return;
            }
            throw new t3("Value for %s is null in %s", text, h10);
        }
    }

    private void K(g0 g0Var, Object obj, c3 c3Var, j1 j1Var) {
        Object obj2 = j1Var.q().get(obj);
        Class h10 = this.f23376e.h(this.f23377f, obj);
        if (obj2 != null || !j1Var.e()) {
            Object G = G(obj2);
            if (G != null) {
                D(g0Var, G, j1Var);
            }
            this.f23374c.X(j1Var, G);
            return;
        }
        throw new i0("Value for %s is null in %s", j1Var, h10);
    }

    private void L(g0 g0Var, Object obj, b3 b3Var) {
        r e10 = b3Var.e();
        j1 version = b3Var.getVersion();
        if (e10 != null) {
            Double valueOf = Double.valueOf(this.f23375d.b());
            Double valueOf2 = Double.valueOf(e10.revision());
            if (!this.f23375d.a(valueOf2, valueOf) || version.e()) {
                A(g0Var, valueOf2, version);
            }
        }
    }

    private boolean h(g0 g0Var, Object obj, f fVar) {
        return this.f23372a.g(fVar, obj, g0Var);
    }

    private b i(b3 b3Var, e1 e1Var) {
        if (b3Var.b().c()) {
            return new b(this, this.f23374c, b3Var, e1Var);
        }
        return new c(this, this.f23374c, b3Var, e1Var);
    }

    private Object j(o oVar, e1 e1Var, Class cls) {
        b3 i10 = this.f23376e.i(cls);
        h a10 = i10.a();
        Object a11 = i(i10, e1Var).a(oVar);
        a10.f(a11);
        a10.a(a11);
        e1Var.b(a11);
        return r(oVar, a11, a10);
    }

    private void k(o oVar, Object obj, b3 b3Var) {
        c3 d10 = b3Var.d();
        x(oVar, obj, b3Var);
        s(oVar, obj, d10);
    }

    private void l(o oVar, Object obj, c3 c3Var, n1 n1Var) {
        String a10 = c3Var.a(oVar.getName());
        j1 r10 = n1Var.r(a10);
        if (r10 == null) {
            j0 position = oVar.getPosition();
            Class h10 = this.f23376e.h(this.f23377f, obj);
            if (n1Var.F(this.f23376e) && this.f23375d.c()) {
                throw new c("Attribute '%s' does not have a match in %s at %s", a10, h10, position);
            }
            return;
        }
        p(oVar, obj, r10);
    }

    /* access modifiers changed from: private */
    public void m(o oVar, Object obj, c3 c3Var) {
        y<String> c10 = oVar.c();
        n1 c11 = c3Var.c();
        for (String a10 : c10) {
            o a11 = oVar.a(a10);
            if (a11 != null) {
                l(a11, obj, c3Var, c11);
            }
        }
        y(oVar, c11, obj);
    }

    private void n(o oVar, Object obj, c3 c3Var, n1 n1Var) {
        String V = c3Var.V(oVar.getName());
        j1 r10 = n1Var.r(V);
        if (r10 == null) {
            r10 = this.f23374c.p(V);
        }
        if (r10 == null) {
            j0 position = oVar.getPosition();
            Class h10 = this.f23376e.h(this.f23377f, obj);
            if (!n1Var.F(this.f23376e) || !this.f23375d.c()) {
                oVar.n();
                return;
            }
            throw new i0("Element '%s' does not have a match in %s at %s", V, h10, position);
        }
        u(oVar, obj, n1Var, r10);
    }

    /* access modifiers changed from: private */
    public void o(o oVar, Object obj, c3 c3Var) {
        n1 j10 = c3Var.j();
        while (true) {
            o l10 = oVar.l();
            if (l10 != null) {
                c3 A = c3Var.A(l10.getName());
                if (A != null) {
                    s(l10, obj, A);
                } else {
                    n(l10, obj, c3Var, j10);
                }
            } else {
                y(oVar, j10, obj);
                return;
            }
        }
    }

    private Object p(o oVar, Object obj, j1 j1Var) {
        Object v10 = v(oVar, obj, j1Var);
        if (v10 == null) {
            j0 position = oVar.getPosition();
            Class h10 = this.f23376e.h(this.f23377f, obj);
            if (j1Var.e() && this.f23375d.c()) {
                throw new a4("Empty value for %s in %s at %s", j1Var, h10, position);
            }
        } else if (v10 != j1Var.k(this.f23376e)) {
            this.f23374c.X(j1Var, v10);
        }
        return v10;
    }

    private Object q(o oVar, e1 e1Var) {
        Class type = e1Var.getType();
        Object d10 = this.f23373b.d(oVar, type);
        if (type != null) {
            e1Var.b(d10);
        }
        return d10;
    }

    private Object r(o oVar, Object obj, h hVar) {
        if (obj == null) {
            return obj;
        }
        j0 position = oVar.getPosition();
        Object e10 = hVar.e(obj);
        Class type = this.f23377f.getType();
        Class<?> cls = e10.getClass();
        if (type.isAssignableFrom(cls)) {
            return e10;
        }
        throw new i0("Type %s does not match %s at %s", cls, type, position);
    }

    private void s(o oVar, Object obj, c3 c3Var) {
        t(oVar, obj, c3Var);
        m(oVar, obj, c3Var);
        o(oVar, obj, c3Var);
    }

    /* access modifiers changed from: private */
    public void t(o oVar, Object obj, c3 c3Var) {
        j1 text = c3Var.getText();
        if (text != null) {
            p(oVar, obj, text);
        }
    }

    private void u(o oVar, Object obj, n1 n1Var, j1 j1Var) {
        Object p10 = p(oVar, obj, j1Var);
        for (String r10 : j1Var.m()) {
            n1Var.r(r10);
        }
        if (j1Var.u()) {
            this.f23374c.X(j1Var, p10);
        }
    }

    private Object v(o oVar, Object obj, j1 j1Var) {
        Object obj2;
        x l10 = j1Var.l(this.f23376e);
        if (j1Var.p()) {
            b4 m10 = this.f23374c.m(j1Var);
            t q10 = j1Var.q();
            if (m10 != null) {
                return l10.a(oVar, m10.c());
            }
            if (!(obj == null || (obj2 = q10.get(obj)) == null)) {
                return l10.a(oVar, obj2);
            }
        }
        return l10.b(oVar);
    }

    private void w(o oVar, Object obj, j1 j1Var) {
        Object p10 = p(oVar, obj, j1Var);
        Class type = this.f23377f.getType();
        if (p10 != null) {
            Double valueOf = Double.valueOf(this.f23376e.n(type).revision());
            if (!p10.equals(this.f23375d)) {
                this.f23375d.a(valueOf, p10);
            }
        }
    }

    /* access modifiers changed from: private */
    public void x(o oVar, Object obj, b3 b3Var) {
        j1 version = b3Var.getVersion();
        Class type = this.f23377f.getType();
        if (version != null) {
            o oVar2 = (o) oVar.c().remove(version.getName());
            if (oVar2 != null) {
                w(oVar2, obj, version);
                return;
            }
            r n10 = this.f23376e.n(type);
            Double valueOf = Double.valueOf(this.f23375d.b());
            Double valueOf2 = Double.valueOf(n10.revision());
            this.f23374c.X(version, valueOf);
            this.f23375d.a(valueOf2, valueOf);
        }
    }

    private void y(o oVar, n1 n1Var, Object obj) {
        Class h10 = this.f23376e.h(this.f23377f, obj);
        j0 position = oVar.getPosition();
        Iterator it = n1Var.iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (!j1Var.e() || !this.f23375d.c()) {
                Object k10 = j1Var.k(this.f23376e);
                if (k10 != null) {
                    this.f23374c.X(j1Var, k10);
                }
            } else {
                throw new a4("Unable to satisfy %s for %s at %s", j1Var, h10, position);
            }
        }
    }

    private void z(g0 g0Var, Object obj, b3 b3Var) {
        c3 d10 = b3Var.d();
        L(g0Var, obj, b3Var);
        H(g0Var, obj, d10);
    }

    public Object a(o oVar, Object obj) {
        b3 i10 = this.f23376e.i(obj.getClass());
        h a10 = i10.a();
        k(oVar, obj, i10);
        this.f23374c.f0(obj);
        a10.f(obj);
        a10.a(obj);
        return r(oVar, obj, a10);
    }

    public Object b(o oVar) {
        e1 h10 = this.f23372a.h(oVar);
        Class type = h10.getType();
        if (h10.a()) {
            return h10.c();
        }
        return this.f23376e.o(type) ? q(oVar, h10) : j(oVar, h10, type);
    }

    public void c(g0 g0Var, Object obj) {
        b3 i10 = this.f23376e.i(obj.getClass());
        h a10 = i10.a();
        try {
            if (i10.c()) {
                this.f23373b.c(g0Var, obj);
            } else {
                a10.c(obj);
                z(g0Var, obj, i10);
            }
        } finally {
            a10.b(obj);
        }
    }

    public q(w wVar, f fVar, Class cls) {
        this.f23372a = new c2(wVar, fVar, cls);
        this.f23373b = new q2(wVar, fVar);
        this.f23374c = new m();
        this.f23375d = new x2();
        this.f23376e = wVar;
        this.f23377f = fVar;
    }
}
