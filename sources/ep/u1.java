package ep;

import dp.c;
import dp.d;
import dp.e;
import dp.f;
import dp.g;
import dp.h;
import dp.i;
import dp.j;
import dp.p;
import dp.q;
import dp.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

class u1 extends u {

    /* renamed from: e  reason: collision with root package name */
    private final t1 f23402e;

    /* renamed from: f  reason: collision with root package name */
    private final n3 f23403f;

    /* renamed from: g  reason: collision with root package name */
    private final b f23404g = new b();

    /* renamed from: h  reason: collision with root package name */
    private final b f23405h = new b();

    /* renamed from: i  reason: collision with root package name */
    private final d0 f23406i;

    private static class b extends LinkedHashMap implements Iterable {
        private b() {
        }

        public Iterator iterator() {
            return keySet().iterator();
        }

        public s1 r(String str) {
            return (s1) remove(str);
        }
    }

    public u1(d0 d0Var, n3 n3Var) {
        this.f23402e = new t1(d0Var, n3Var);
        this.f23403f = n3Var;
        this.f23406i = d0Var;
        r0(d0Var);
    }

    private void F(s1 s1Var, s1 s1Var2) {
        Annotation a10 = s1Var.a();
        String name = s1Var.getName();
        if (s1Var2.a().equals(a10)) {
            Class type = s1Var.getType();
            if (type == s1Var2.getType()) {
                add(new o1(s1Var, s1Var2));
                return;
            }
            throw new q1("Method types do not match for %s in %s", name, type);
        }
        throw new q1("Annotations do not match for '%s' in %s", name, this.f23406i);
    }

    private void T(s1 s1Var, String str) {
        s1 r10 = this.f23404g.r(str);
        if (r10 != null) {
            F(s1Var, r10);
        } else {
            v(s1Var);
        }
    }

    private void Y(Class cls, c cVar) {
        Iterator it = this.f23403f.j(cls, cVar).iterator();
        while (it.hasNext()) {
            l0((o1) ((t) it.next()));
        }
    }

    private void e0(d0 d0Var) {
        for (p1 p1Var : d0Var.m()) {
            Annotation[] a10 = p1Var.a();
            Method b10 = p1Var.b();
            for (Annotation s02 : a10) {
                s0(b10, s02, a10);
            }
        }
    }

    private void g0(d0 d0Var, c cVar) {
        List<p1> m10 = d0Var.m();
        if (cVar == c.PROPERTY) {
            for (p1 p1Var : m10) {
                Annotation[] a10 = p1Var.a();
                Method b10 = p1Var.b();
                if (this.f23402e.j(b10) != null) {
                    o0(b10, a10);
                }
            }
        }
    }

    private void h0(s1 s1Var, b bVar) {
        String name = s1Var.getName();
        s1 s1Var2 = (s1) bVar.remove(name);
        if (s1Var2 != null && k0(s1Var)) {
            s1Var = s1Var2;
        }
        bVar.put(name, s1Var);
    }

    private boolean k0(s1 s1Var) {
        return s1Var.a() instanceof p;
    }

    private void l0(o1 o1Var) {
        s1 f10 = o1Var.f();
        s1 g10 = o1Var.g();
        if (g10 != null) {
            h0(g10, this.f23404g);
        }
        h0(f10, this.f23405h);
    }

    private void m0(s1 s1Var, b bVar) {
        String name = s1Var.getName();
        if (name != null) {
            bVar.put(name, s1Var);
        }
    }

    private void n0(Method method, Annotation annotation, Annotation[] annotationArr) {
        s1 c10 = this.f23402e.c(method, annotation, annotationArr);
        v1 e10 = c10.e();
        if (e10 == v1.GET) {
            m0(c10, this.f23405h);
        }
        if (e10 == v1.IS) {
            m0(c10, this.f23405h);
        }
        if (e10 == v1.SET) {
            m0(c10, this.f23404g);
        }
    }

    private void o0(Method method, Annotation[] annotationArr) {
        s1 d10 = this.f23402e.d(method, annotationArr);
        v1 e10 = d10.e();
        if (e10 == v1.GET) {
            m0(d10, this.f23405h);
        }
        if (e10 == v1.IS) {
            m0(d10, this.f23405h);
        }
        if (e10 == v1.SET) {
            m0(d10, this.f23404g);
        }
    }

    private void p0(s1 s1Var, b bVar) {
        String name = s1Var.getName();
        if (name != null) {
            bVar.remove(name);
        }
    }

    private void q0(Method method, Annotation annotation, Annotation[] annotationArr) {
        s1 c10 = this.f23402e.c(method, annotation, annotationArr);
        v1 e10 = c10.e();
        if (e10 == v1.GET) {
            p0(c10, this.f23405h);
        }
        if (e10 == v1.IS) {
            p0(c10, this.f23405h);
        }
        if (e10 == v1.SET) {
            p0(c10, this.f23404g);
        }
    }

    private void r() {
        Iterator it = this.f23405h.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            s1 s1Var = (s1) this.f23405h.get(str);
            if (s1Var != null) {
                T(s1Var, str);
            }
        }
    }

    private void r0(d0 d0Var) {
        c f10 = d0Var.f();
        c i10 = d0Var.i();
        Class j10 = d0Var.j();
        if (j10 != null) {
            Y(j10, f10);
        }
        g0(d0Var, i10);
        e0(d0Var);
        r();
        t0();
    }

    private void s0(Method method, Annotation annotation, Annotation[] annotationArr) {
        if (annotation instanceof dp.a) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof j) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof g) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof i) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof f) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof e) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof h) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof d) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof r) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof p) {
            n0(method, annotation, annotationArr);
        }
        if (annotation instanceof q) {
            q0(method, annotation, annotationArr);
        }
    }

    private void t0() {
        Iterator it = this.f23404g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            s1 s1Var = (s1) this.f23404g.get(str);
            if (s1Var != null) {
                u0(s1Var, str);
            }
        }
    }

    private void u0(s1 s1Var, String str) {
        s1 r10 = this.f23405h.r(str);
        Method f10 = s1Var.f();
        if (r10 == null) {
            throw new q1("No matching get method for %s in %s", f10, this.f23406i);
        }
    }

    private void v(s1 s1Var) {
        add(new o1(s1Var));
    }
}
