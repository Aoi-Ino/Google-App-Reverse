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
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

class b1 extends u {

    /* renamed from: e  reason: collision with root package name */
    private final a f23122e;

    /* renamed from: f  reason: collision with root package name */
    private final v f23123f = new v();

    /* renamed from: g  reason: collision with root package name */
    private final n3 f23124g;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f23125a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23126b;

        public a(Field field) {
            this.f23125a = field.getDeclaringClass();
            this.f23126b = field.getName();
        }

        private boolean a(a aVar) {
            if (aVar.f23125a != this.f23125a) {
                return false;
            }
            return aVar.f23126b.equals(this.f23126b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return a((a) obj);
            }
            return false;
        }

        public int hashCode() {
            return this.f23126b.hashCode();
        }
    }

    public b1(d0 d0Var, n3 n3Var) {
        this.f23122e = new a(d0Var, n3Var);
        this.f23124g = n3Var;
        n0(d0Var);
    }

    private void F(d0 d0Var) {
        for (a1 a1Var : d0Var.g()) {
            Annotation[] a10 = a1Var.a();
            Field b10 = a1Var.b();
            for (Annotation o02 : a10) {
                o0(b10, o02, a10);
            }
        }
    }

    private void T(d0 d0Var, c cVar) {
        List<a1> g10 = d0Var.g();
        if (cVar == c.FIELD) {
            for (a1 a1Var : g10) {
                Annotation[] a10 = a1Var.a();
                Field b10 = a1Var.b();
                Class<?> type = b10.getType();
                if (!e0(b10) && !h0(b10)) {
                    k0(b10, type, a10);
                }
            }
        }
    }

    private void Y(Object obj, t tVar) {
        t tVar2 = (t) this.f23123f.remove(obj);
        if (tVar2 != null && g0(tVar)) {
            tVar = tVar2;
        }
        this.f23123f.put(obj, tVar);
    }

    private boolean e0(Field field) {
        return Modifier.isStatic(field.getModifiers());
    }

    private boolean g0(t tVar) {
        return tVar.a() instanceof p;
    }

    private boolean h0(Field field) {
        return Modifier.isTransient(field.getModifiers());
    }

    private void k0(Field field, Class cls, Annotation[] annotationArr) {
        Annotation c10 = this.f23122e.c(cls, t2.e(field));
        if (c10 != null) {
            l0(field, c10, annotationArr);
        }
    }

    private void l0(Field field, Annotation annotation, Annotation[] annotationArr) {
        z0 z0Var = new z0(field, annotation, annotationArr);
        a aVar = new a(field);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        Y(aVar, z0Var);
    }

    private void m0(Field field, Annotation annotation) {
        this.f23123f.remove(new a(field));
    }

    private void n0(d0 d0Var) {
        c f10 = d0Var.f();
        c i10 = d0Var.i();
        Class j10 = d0Var.j();
        if (j10 != null) {
            v(j10, f10);
        }
        T(d0Var, i10);
        F(d0Var);
        r();
    }

    private void o0(Field field, Annotation annotation, Annotation[] annotationArr) {
        if (annotation instanceof dp.a) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof j) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof g) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof i) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof f) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof e) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof h) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof d) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof r) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof p) {
            l0(field, annotation, annotationArr);
        }
        if (annotation instanceof q) {
            m0(field, annotation);
        }
    }

    private void r() {
        Iterator it = this.f23123f.iterator();
        while (it.hasNext()) {
            add((t) it.next());
        }
    }

    private void v(Class cls, c cVar) {
        u e10 = this.f23124g.e(cls, cVar);
        if (e10 != null) {
            addAll(e10);
        }
    }
}
