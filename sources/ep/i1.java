package ep;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class i1 {

    /* renamed from: a  reason: collision with root package name */
    private List f23239a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private h1 f23240b;

    /* renamed from: c  reason: collision with root package name */
    private n1 f23241c = new n1();

    /* renamed from: d  reason: collision with root package name */
    private n1 f23242d = new n1();

    /* renamed from: e  reason: collision with root package name */
    private n1 f23243e = new n1();

    /* renamed from: f  reason: collision with root package name */
    private o f23244f = new o();

    /* renamed from: g  reason: collision with root package name */
    private z2 f23245g;

    /* renamed from: h  reason: collision with root package name */
    private d0 f23246h;

    public i1(z2 z2Var, d0 d0Var) {
        this.f23245g = z2Var;
        this.f23246h = d0Var;
    }

    private h1 b(d0 d0Var) {
        if (this.f23240b == null) {
            this.f23240b = e(d0Var);
        }
        return this.f23240b;
    }

    private boolean c(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 == str || str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private y d(g3 g3Var) {
        i3 i3Var = new i3(g3Var);
        if (g3Var != null) {
            this.f23239a.add(i3Var);
        }
        return i3Var;
    }

    private h1 e(d0 d0Var) {
        g3 f10 = this.f23245g.f();
        return new i(this.f23239a, f10 != null ? new i3(f10) : null, this.f23245g.m(), d0Var);
    }

    private h2 f(h2 h2Var) {
        j1 k10 = k(h2Var);
        if (k10 != null) {
            return new g(h2Var, k10);
        }
        return null;
    }

    private void g(d0 d0Var) {
        for (g3 h10 : this.f23245g.n()) {
            h(h10);
        }
    }

    private void h(g3 g3Var) {
        g3 g3Var2 = new g3(g3Var);
        Iterator it = g3Var.iterator();
        while (it.hasNext()) {
            h2 f10 = f((h2) it.next());
            if (f10 != null) {
                g3Var2.l(f10);
            }
        }
        d(g3Var2);
    }

    private void j(j1 j1Var, n1 n1Var) {
        String name = j1Var.getName();
        String b10 = j1Var.b();
        if (!n1Var.containsKey(name)) {
            n1Var.put(name, j1Var);
        } else if (!((j1) n1Var.get(name)).b().equals(name)) {
            n1Var.remove(name);
        }
        n1Var.put(b10, j1Var);
    }

    private j1 k(h2 h2Var) {
        return l(h2Var, h2Var.g() ? this.f23241c : h2Var.h() ? this.f23243e : this.f23242d);
    }

    private j1 l(h2 h2Var, n1 n1Var) {
        String name = h2Var.getName();
        j1 j1Var = (j1) n1Var.get(h2Var.b());
        return j1Var == null ? (j1) n1Var.get(name) : j1Var;
    }

    private void m(d0 d0Var) {
        for (h2 h2Var : this.f23245g.m().r()) {
            j1 k10 = k(h2Var);
            String b10 = h2Var.b();
            if (k10 != null) {
                t(k10, h2Var);
            } else {
                throw new r("Parameter '%s' does not have a match in %s", b10, d0Var);
            }
        }
        p();
    }

    private void n(j1 j1Var, h2 h2Var) {
        Annotation a10 = j1Var.a();
        Annotation a11 = h2Var.a();
        String name = h2Var.getName();
        if (!this.f23244f.a(a10, a11)) {
            Class<? extends Annotation> annotationType = a10.annotationType();
            Class<? extends Annotation> annotationType2 = a11.annotationType();
            if (!annotationType.equals(annotationType2)) {
                throw new r("Annotation %s does not match %s for '%s' in %s", annotationType2, annotationType, name, h2Var);
            }
        }
    }

    private void o(j1 j1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 f10 = ((y) it.next()).f();
            t q10 = j1Var.q();
            Object key = j1Var.getKey();
            if (q10.e() && f10.r(key) == null) {
                it.remove();
            }
        }
    }

    private void p() {
        List b10 = this.f23240b.b();
        if (this.f23240b.c()) {
            q(this.f23242d);
            q(this.f23241c);
        }
        if (!b10.isEmpty()) {
            r(this.f23242d, b10);
            r(this.f23241c, b10);
        }
    }

    private void q(n1 n1Var) {
        Iterator it = n1Var.iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (j1Var != null && j1Var.q().e()) {
                throw new r("Default constructor can not accept read only %s in %s", j1Var, this.f23246h);
            }
        }
    }

    private void r(n1 n1Var, List list) {
        Iterator it = n1Var.iterator();
        while (it.hasNext()) {
            j1 j1Var = (j1) it.next();
            if (j1Var != null) {
                o(j1Var, list);
            }
        }
        if (list.isEmpty()) {
            throw new r("No constructor accepts all read only values in %s", this.f23246h);
        }
    }

    private void s(j1 j1Var, h2 h2Var) {
        String name;
        String[] n10 = j1Var.n();
        String name2 = h2Var.getName();
        if (!c(n10, name2) && name2 != (name = j1Var.getName())) {
            if (name2 == null || name == null) {
                throw new r("Annotation does not match %s for '%s' in %s", j1Var, name2, h2Var);
            } else if (!name2.equals(name)) {
                throw new r("Annotation does not match %s for '%s' in %s", j1Var, name2, h2Var);
            }
        }
    }

    private void t(j1 j1Var, h2 h2Var) {
        t q10 = j1Var.q();
        String name = h2Var.getName();
        if (n3.o(h2Var.getType(), q10.getType())) {
            s(j1Var, h2Var);
            n(j1Var, h2Var);
            return;
        }
        throw new r("Type is not compatible with %s for '%s' in %s", j1Var, name, h2Var);
    }

    public h1 a() {
        if (this.f23240b == null) {
            g(this.f23246h);
            b(this.f23246h);
            m(this.f23246h);
        }
        return this.f23240b;
    }

    public void i(j1 j1Var) {
        j(j1Var, j1Var.g() ? this.f23241c : j1Var.h() ? this.f23243e : this.f23242d);
    }
}
