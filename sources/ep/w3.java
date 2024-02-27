package ep;

import gp.f;
import hp.g0;
import hp.o;
import hp.r0;

class w3 {

    /* renamed from: a  reason: collision with root package name */
    private final w f23413a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f23414b;

    public w3(w wVar) {
        this.f23414b = wVar.l();
        this.f23413a = wVar;
    }

    private q a(Class cls) {
        f d10 = d(cls);
        if (cls != null) {
            return new q(this.f23413a, d10);
        }
        throw new y2("Can not instantiate null class", new Object[0]);
    }

    private a0 b(Class cls) {
        return this.f23413a.c(cls);
    }

    private f d(Class cls) {
        return new l(cls);
    }

    private Object f(o oVar, Class cls, Object obj) {
        if (c(cls) != null) {
            return obj;
        }
        throw new y2("Root annotation required for %s", cls);
    }

    /* access modifiers changed from: protected */
    public String c(Class cls) {
        return this.f23414b.e(this.f23413a.j(cls));
    }

    public Object e(o oVar, Class cls) {
        Object b10 = a(cls).b(oVar);
        if (b10 != null) {
            return f(oVar, b10.getClass(), b10);
        }
        return null;
    }

    public void g(g0 g0Var, Object obj) {
        h(g0Var, obj, obj.getClass());
    }

    public void h(g0 g0Var, Object obj, Class cls) {
        Class<?> cls2 = obj.getClass();
        String c10 = c(cls2);
        if (c10 != null) {
            i(g0Var, obj, cls, c10);
            return;
        }
        throw new y2("Root annotation required for %s", cls2);
    }

    public void i(g0 g0Var, Object obj, Class cls, String str) {
        g0 k10 = g0Var.k(str);
        f d10 = d(cls);
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            a0 b10 = b(cls2);
            if (b10 != null) {
                b10.a(k10);
            }
            if (!this.f23413a.m(d10, obj, k10)) {
                a(cls2).c(k10, obj);
            }
        }
        k10.commit();
    }
}
