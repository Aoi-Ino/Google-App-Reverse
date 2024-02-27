package ep;

import dp.c;
import dp.k;
import dp.l;
import dp.m;
import dp.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

class j {

    /* renamed from: a  reason: collision with root package name */
    private b2 f23254a = new b2();

    /* renamed from: b  reason: collision with root package name */
    private s f23255b;

    /* renamed from: c  reason: collision with root package name */
    private c1 f23256c;

    /* renamed from: d  reason: collision with root package name */
    private c1 f23257d;

    /* renamed from: e  reason: collision with root package name */
    private c1 f23258e;

    /* renamed from: f  reason: collision with root package name */
    private c1 f23259f;

    /* renamed from: g  reason: collision with root package name */
    private c1 f23260g;

    /* renamed from: h  reason: collision with root package name */
    private c1 f23261h;

    /* renamed from: i  reason: collision with root package name */
    private n3 f23262i;

    /* renamed from: j  reason: collision with root package name */
    private n f23263j;

    /* renamed from: k  reason: collision with root package name */
    private m f23264k;

    public j(d0 d0Var, n3 n3Var) {
        this.f23255b = new s(d0Var, n3Var);
        this.f23262i = n3Var;
        y(d0Var);
    }

    private void a(d0 d0Var) {
        k namespace = d0Var.getNamespace();
        if (namespace != null) {
            this.f23254a.f(namespace);
        }
    }

    private void b(Method method) {
        if (this.f23256c == null) {
            this.f23256c = h(method);
        }
    }

    private void c(Method method) {
        if (this.f23259f == null) {
            this.f23259f = h(method);
        }
    }

    private void d(d0 d0Var) {
        if (this.f23263j == null) {
            this.f23263j = d0Var.k();
        }
        if (this.f23264k == null) {
            this.f23264k = d0Var.getOrder();
        }
    }

    private c1 h(Method method) {
        boolean r10 = r(method);
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return new c1(method, r10);
    }

    private boolean r(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            return Map.class.equals(parameterTypes[0]);
        }
        return false;
    }

    private void s(d0 d0Var) {
        for (p1 t10 : d0Var.m()) {
            t(t10);
        }
    }

    private void t(p1 p1Var) {
        Annotation[] a10 = p1Var.a();
        Method b10 = p1Var.b();
        for (Annotation annotation : a10) {
            if (annotation instanceof n) {
                b(b10);
            }
            if (annotation instanceof z3) {
                z(b10);
            }
            if (annotation instanceof m2) {
                v(b10);
            }
            if (annotation instanceof p) {
                c(b10);
            }
            if (annotation instanceof v2) {
                w(b10);
            }
            if (annotation instanceof w2) {
                x(b10);
            }
        }
    }

    private void u(d0 d0Var) {
        l n10 = d0Var.n();
        k namespace = d0Var.getNamespace();
        if (namespace != null) {
            this.f23254a.c(namespace);
        }
        if (n10 != null) {
            for (k c10 : n10.value()) {
                this.f23254a.c(c10);
            }
        }
    }

    private void v(Method method) {
        if (this.f23258e == null) {
            this.f23258e = h(method);
        }
    }

    private void w(Method method) {
        if (this.f23260g == null) {
            this.f23260g = h(method);
        }
    }

    private void x(Method method) {
        if (this.f23261h == null) {
            this.f23261h = h(method);
        }
    }

    private void y(d0 d0Var) {
        c f10 = d0Var.f();
        Class type = d0Var.getType();
        while (type != null) {
            d0 d10 = this.f23262i.d(type, f10);
            u(d10);
            s(d10);
            d(d10);
            type = d10.j();
        }
        a(d0Var);
    }

    private void z(Method method) {
        if (this.f23257d == null) {
            this.f23257d = h(method);
        }
    }

    public c1 e() {
        return this.f23256c;
    }

    public c1 f() {
        return this.f23259f;
    }

    public a0 g() {
        return this.f23254a;
    }

    public m i() {
        return this.f23264k;
    }

    public j2 j() {
        return this.f23255b.a();
    }

    public c1 k() {
        return this.f23258e;
    }

    public c1 l() {
        return this.f23260g;
    }

    public c1 m() {
        return this.f23261h;
    }

    public n n() {
        return this.f23263j;
    }

    public g3 o() {
        return this.f23255b.b();
    }

    public List p() {
        return this.f23255b.c();
    }

    public c1 q() {
        return this.f23257d;
    }
}
