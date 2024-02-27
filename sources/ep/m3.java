package ep;

import dp.a;
import dp.d;
import dp.e;
import dp.f;
import dp.g;
import dp.h;
import dp.i;
import dp.j;
import dp.m;
import dp.p;
import dp.r;
import java.lang.annotation.Annotation;
import java.util.Iterator;

class m3 {

    /* renamed from: a  reason: collision with root package name */
    private i1 f23325a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f23326b;

    /* renamed from: c  reason: collision with root package name */
    private x1 f23327c;

    /* renamed from: d  reason: collision with root package name */
    private h1 f23328d;

    /* renamed from: e  reason: collision with root package name */
    private n1 f23329e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f23330f;

    /* renamed from: g  reason: collision with root package name */
    private n1 f23331g;

    /* renamed from: h  reason: collision with root package name */
    private z2 f23332h;

    /* renamed from: i  reason: collision with root package name */
    private n3 f23333i;

    /* renamed from: j  reason: collision with root package name */
    private j1 f23334j;

    /* renamed from: k  reason: collision with root package name */
    private j1 f23335k;

    /* renamed from: l  reason: collision with root package name */
    private w1 f23336l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23337m;

    public m3(z2 z2Var, d0 d0Var, n3 n3Var) {
        x0 x0Var = new x0(d0Var, n3Var);
        this.f23326b = x0Var;
        this.f23327c = new x1(x0Var, d0Var, n3Var);
        this.f23325a = new i1(z2Var, d0Var);
        this.f23336l = new x3(z2Var, d0Var);
        this.f23329e = new n1(z2Var);
        this.f23330f = new n1(z2Var);
        this.f23331g = new n1(z2Var);
        this.f23332h = z2Var;
        this.f23333i = n3Var;
    }

    private w1 d(w0 w0Var) {
        w1 w1Var = this.f23336l;
        while (w1Var != null) {
            String prefix = w0Var.getPrefix();
            String first = w0Var.getFirst();
            int f10 = w0Var.f();
            if (first != null) {
                w1Var = w1Var.k(first, prefix, f10);
            }
            if (!w0Var.C()) {
                break;
            }
            w0Var = w0Var.R(1);
        }
        return w1Var;
    }

    private boolean e(String str) {
        w0 a10 = this.f23326b.a(str);
        w1 h10 = h(a10);
        if (h10 == null) {
            return false;
        }
        return !a10.C() ? h10.M(str) : h10.M(a10.getLast());
    }

    private boolean f(String str) {
        w0 a10 = this.f23326b.a(str);
        w1 h10 = h(a10);
        if (h10 != null) {
            String last = a10.getLast();
            int f10 = a10.f();
            if (h10.J(last)) {
                return true;
            }
            return h10.G(last) && !h10.D(last, f10).isEmpty();
        }
        return false;
    }

    private boolean g() {
        if (this.f23335k != null) {
            return false;
        }
        return this.f23336l.isEmpty();
    }

    private w1 h(w0 w0Var) {
        return w0Var.C() ? this.f23336l.q(w0Var.a0(0, 1)) : this.f23336l;
    }

    private void i(t tVar, j1 j1Var, n1 n1Var) {
        w0 d10 = j1Var.d();
        String b10 = j1Var.b();
        w1 w1Var = this.f23336l;
        if (!d10.isEmpty()) {
            w1Var = l(d10);
        }
        this.f23325a.i(j1Var);
        w1Var.w(j1Var);
        n1Var.put(b10, j1Var);
    }

    private void k(t tVar, Annotation annotation, n1 n1Var) {
        j1 h10 = this.f23333i.h(tVar, annotation);
        String b10 = h10.b();
        String name = h10.getName();
        if (n1Var.get(b10) == null) {
            i(tVar, h10, n1Var);
            return;
        }
        throw new n2("Duplicate annotation of name '%s' on %s", name, tVar);
    }

    private w1 l(w0 w0Var) {
        w1 q10 = this.f23336l.q(w0Var);
        return q10 != null ? q10 : d(w0Var);
    }

    private void m(t tVar, Annotation annotation) {
        j1 h10 = this.f23333i.h(tVar, annotation);
        w0 d10 = h10.d();
        String b10 = h10.b();
        w1 w1Var = this.f23336l;
        if (!d10.isEmpty()) {
            w1Var = l(d10);
        }
        if (this.f23331g.get(b10) == null) {
            this.f23325a.i(h10);
            w1Var.w(h10);
            this.f23331g.put(b10, h10);
            return;
        }
        throw new t3("Multiple text annotations in %s", annotation);
    }

    private void n(t tVar, Annotation annotation, n1 n1Var) {
        for (j1 j1Var : this.f23333i.i(tVar, annotation)) {
            String b10 = j1Var.b();
            String name = j1Var.getName();
            if (n1Var.get(b10) == null) {
                i(tVar, j1Var, n1Var);
            } else {
                throw new n2("Duplicate annotation of name '%s' on %s", name, j1Var);
            }
        }
    }

    private void p(Class cls, m mVar) {
        if (mVar != null) {
            String[] attributes = mVar.attributes();
            int length = attributes.length;
            int i10 = 0;
            while (i10 < length) {
                String str = attributes[i10];
                if (e(str)) {
                    i10++;
                } else {
                    throw new c("Ordered attribute '%s' missing in %s", str, cls);
                }
            }
        }
    }

    private void q(Class cls, m mVar) {
        if (mVar != null) {
            String[] elements = mVar.elements();
            int length = elements.length;
            int i10 = 0;
            while (i10 < length) {
                String str = elements[i10];
                if (f(str)) {
                    i10++;
                } else {
                    throw new i0("Ordered element '%s' missing for %s", str, cls);
                }
            }
        }
    }

    private void r(Class cls) {
        if (!this.f23336l.isEmpty()) {
            this.f23336l.L(cls);
        }
    }

    private void s(Class cls) {
        j1 text = this.f23336l.getText();
        if (text != null) {
            if (text.s()) {
                return;
            }
            if (!this.f23330f.isEmpty()) {
                throw new t3("Elements used with %s in %s", text, cls);
            } else if (this.f23336l.K()) {
                throw new t3("Paths used with %s in %s", text, cls);
            }
        } else if (this.f23332h.isEmpty()) {
            this.f23337m = g();
        }
    }

    private void t(Class cls) {
        j1 text = this.f23336l.getText();
        if (text != null && text.s()) {
            Object key = text.getKey();
            Iterator it = this.f23330f.iterator();
            while (it.hasNext()) {
                j1 j1Var = (j1) it.next();
                if (j1Var.getKey().equals(key)) {
                    Class<String> type = j1Var.i().getType();
                    if (type == String.class) {
                        throw new t3("Illegal entry of %s with text annotations on %s in %s", type, text, cls);
                    }
                } else {
                    throw new t3("Elements used with %s in %s", text, cls);
                }
            }
            if (this.f23336l.K()) {
                throw new t3("Paths used with %s in %s", text, cls);
            }
        }
    }

    private void u(Class cls) {
        Iterator it = this.f23330f.iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            String[] m10 = j1Var.m();
            t q10 = j1Var.q();
            int length = m10.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    String str = m10[i10];
                    Annotation a10 = q10.a();
                    j1 j1Var2 = (j1) this.f23330f.get(str);
                    if (j1Var.u() != j1Var2.u()) {
                        throw new y3("Inline must be consistent in %s for %s", a10, q10);
                    } else if (j1Var.e() == j1Var2.e()) {
                        i10++;
                    } else {
                        throw new y3("Required must be consistent in %s for %s", a10, q10);
                    }
                }
            }
        }
    }

    private void v(t tVar, Annotation annotation) {
        j1 h10 = this.f23333i.h(tVar, annotation);
        if (this.f23334j == null) {
            this.f23334j = h10;
            return;
        }
        throw new c("Multiple version annotations in %s", annotation);
    }

    public void a(Class cls) {
        m order = this.f23332h.getOrder();
        if (order != null) {
            this.f23327c.a(this.f23336l, order);
        }
    }

    public l3 b(Class cls) {
        return new l3(this.f23328d, this.f23336l, this.f23334j, this.f23335k, this.f23337m);
    }

    public void c(Class cls) {
        if (this.f23328d == null) {
            this.f23328d = this.f23325a.a();
        }
    }

    public void j(t tVar, Annotation annotation) {
        if (annotation instanceof a) {
            k(tVar, annotation, this.f23329e);
        }
        if (annotation instanceof j) {
            n(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof g) {
            n(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof i) {
            n(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof f) {
            k(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof e) {
            k(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof h) {
            k(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof d) {
            k(tVar, annotation, this.f23330f);
        }
        if (annotation instanceof r) {
            v(tVar, annotation);
        }
        if (annotation instanceof p) {
            m(tVar, annotation);
        }
    }

    public void o(Class cls) {
        m order = this.f23332h.getOrder();
        u(cls);
        q(cls, order);
        p(cls, order);
        r(cls);
        s(cls);
        t(cls);
    }
}
