package ep;

import dp.d;
import dp.e;
import dp.f;
import dp.g;
import dp.h;
import dp.j;
import dp.p;
import dp.r;
import hp.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import jp.b;

class k1 {

    /* renamed from: a  reason: collision with root package name */
    private final jp.a f23279a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final i f23280b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f23281a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f23282b;

        /* renamed from: c  reason: collision with root package name */
        private final Class f23283c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, (Class) null);
        }

        private Constructor b(Class cls) {
            return this.f23283c.getConstructor(new Class[]{t.class, cls, i.class});
        }

        private Constructor c(Class cls, Class cls2) {
            return this.f23283c.getConstructor(new Class[]{t.class, cls, cls2, i.class});
        }

        public Constructor a() {
            Class cls = this.f23282b;
            return cls != null ? c(this.f23281a, cls) : b(this.f23281a);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.f23282b = cls3;
            this.f23281a = cls2;
            this.f23283c = cls;
        }
    }

    public k1(i iVar) {
        this.f23280b = iVar;
    }

    private Annotation[] a(Annotation annotation) {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        return declaredMethods.length > 0 ? (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]) : new Annotation[0];
    }

    private a b(Annotation annotation) {
        Class<d> cls = d.class;
        if (annotation instanceof d) {
            return new a(j0.class, cls);
        }
        Class<f> cls2 = f.class;
        if (annotation instanceof f) {
            return new a(k0.class, cls2);
        }
        if (annotation instanceof e) {
            return new a(g0.class, e.class);
        }
        Class<h> cls3 = h.class;
        if (annotation instanceof h) {
            return new a(o0.class, cls3);
        }
        if (annotation instanceof j) {
            return new a(t0.class, j.class, cls);
        }
        if (annotation instanceof g) {
            return new a(m0.class, g.class, cls2);
        }
        if (annotation instanceof dp.i) {
            return new a(q0.class, dp.i.class, cls3);
        }
        if (annotation instanceof dp.a) {
            return new a(d.class, dp.a.class);
        }
        if (annotation instanceof r) {
            return new a(c4.class, r.class);
        }
        if (annotation instanceof p) {
            return new a(u3.class, p.class);
        }
        throw new n2("Annotation %s not supported", annotation);
    }

    private Constructor c(Annotation annotation) {
        Constructor a10 = b(annotation).a();
        if (!a10.isAccessible()) {
            a10.setAccessible(true);
        }
        return a10;
    }

    private l1 d(t tVar, Annotation annotation, Object obj) {
        l1 l1Var = (l1) this.f23279a.b(obj);
        if (l1Var != null) {
            return l1Var;
        }
        l1 h10 = h(tVar, annotation);
        if (h10 != null) {
            this.f23279a.a(obj, h10);
        }
        return h10;
    }

    private Object e(t tVar, Annotation annotation) {
        return new m1(tVar, annotation);
    }

    private j1 g(t tVar, Annotation annotation, Annotation annotation2) {
        Constructor c10 = c(annotation);
        return (j1) (annotation2 != null ? c10.newInstance(new Object[]{tVar, annotation, annotation2, this.f23280b}) : c10.newInstance(new Object[]{tVar, annotation, this.f23280b}));
    }

    private l1 h(t tVar, Annotation annotation) {
        if (annotation instanceof j) {
            return k(tVar, annotation);
        }
        if (annotation instanceof g) {
            return k(tVar, annotation);
        }
        return annotation instanceof dp.i ? k(tVar, annotation) : j(tVar, annotation);
    }

    private l1 j(t tVar, Annotation annotation) {
        j1 g10 = g(tVar, annotation, (Annotation) null);
        if (g10 != null) {
            g10 = new f(g10);
        }
        return new l1(g10);
    }

    private l1 k(t tVar, Annotation annotation) {
        Annotation[] a10 = a(annotation);
        if (a10.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Annotation g10 : a10) {
            j1 g11 = g(tVar, annotation, g10);
            if (g11 != null) {
                g11 = new f(g11);
            }
            linkedList.add(g11);
        }
        return new l1((List) linkedList);
    }

    public j1 f(t tVar, Annotation annotation) {
        l1 d10 = d(tVar, annotation, e(tVar, annotation));
        if (d10 != null) {
            return d10.b();
        }
        return null;
    }

    public List i(t tVar, Annotation annotation) {
        l1 d10 = d(tVar, annotation, e(tVar, annotation));
        return d10 != null ? d10.a() : Collections.emptyList();
    }
}
