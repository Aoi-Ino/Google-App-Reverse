package ep;

import dp.a;
import dp.d;
import dp.e;
import dp.f;
import dp.g;
import dp.h;
import dp.i;
import dp.j;
import dp.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

class j3 {

    /* renamed from: a  reason: collision with root package name */
    private final h3 f23265a;

    /* renamed from: b  reason: collision with root package name */
    private final i2 f23266b;

    /* renamed from: c  reason: collision with root package name */
    private final j2 f23267c;

    /* renamed from: d  reason: collision with root package name */
    private final Constructor f23268d;

    /* renamed from: e  reason: collision with root package name */
    private final Class f23269e;

    public j3(Constructor constructor, j2 j2Var, n3 n3Var) {
        this.f23265a = new h3(constructor);
        this.f23266b = new i2(n3Var);
        Class declaringClass = constructor.getDeclaringClass();
        this.f23269e = declaringClass;
        this.f23268d = constructor;
        this.f23267c = j2Var;
        g(declaringClass);
    }

    private List a(Annotation annotation, int i10) {
        h2 c10 = this.f23266b.c(this.f23268d, annotation, i10);
        if (c10 != null) {
            f(c10);
        }
        return Collections.singletonList(c10);
    }

    private Annotation[] b(Annotation annotation) {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length == 1) {
            return (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]);
        }
        throw new y3("Annotation '%s' is not a valid union for %s", annotation, this.f23269e);
    }

    private List e(Annotation annotation, int i10) {
        if (annotation instanceof a) {
            return a(annotation, i10);
        }
        if (annotation instanceof d) {
            return a(annotation, i10);
        }
        if (annotation instanceof f) {
            return a(annotation, i10);
        }
        if (annotation instanceof e) {
            return a(annotation, i10);
        }
        if (annotation instanceof h) {
            return a(annotation, i10);
        }
        if (annotation instanceof g) {
            return i(annotation, i10);
        }
        if (annotation instanceof i) {
            return i(annotation, i10);
        }
        if (annotation instanceof j) {
            return i(annotation, i10);
        }
        return annotation instanceof p ? a(annotation, i10) : Collections.emptyList();
    }

    private void f(h2 h2Var) {
        String b10 = h2Var.b();
        Object key = h2Var.getKey();
        if (this.f23267c.containsKey(key)) {
            j(h2Var, key);
        }
        if (this.f23267c.containsKey(b10)) {
            j(h2Var, b10);
        }
        this.f23267c.put(b10, h2Var);
        this.f23267c.put(key, h2Var);
    }

    private void g(Class cls) {
        Class[] parameterTypes = this.f23268d.getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            h(parameterTypes[i10], i10);
        }
    }

    private void h(Class cls, int i10) {
        Annotation[][] parameterAnnotations = this.f23268d.getParameterAnnotations();
        int i11 = 0;
        while (true) {
            Annotation[] annotationArr = parameterAnnotations[i10];
            if (i11 < annotationArr.length) {
                for (h2 g10 : e(annotationArr[i11], i10)) {
                    this.f23265a.g(g10, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    private List i(Annotation annotation, int i10) {
        g3 g3Var = new g3(this.f23268d);
        Annotation[] b10 = b(annotation);
        int length = b10.length;
        int i11 = 0;
        while (i11 < length) {
            h2 d10 = this.f23266b.d(this.f23268d, annotation, b10[i11], i10);
            String b11 = d10.b();
            if (!g3Var.contains(b11)) {
                g3Var.y(b11, d10);
                f(d10);
                i11++;
            } else {
                throw new y3("Annotation name '%s' used more than once in %s for %s", b11, annotation, this.f23269e);
            }
        }
        return g3Var.s();
    }

    private void j(h2 h2Var, Object obj) {
        h2 h2Var2 = (h2) this.f23267c.get(obj);
        if (h2Var.h() != h2Var2.h()) {
            Annotation a10 = h2Var.a();
            Annotation a11 = h2Var2.a();
            String b10 = h2Var.b();
            if (!a10.equals(a11)) {
                throw new r("Annotations do not match for '%s' in %s", b10, this.f23269e);
            } else if (h2Var2.getType() != h2Var.getType()) {
                throw new r("Parameter types do not match for '%s' in %s", b10, this.f23269e);
            }
        }
    }

    public List c() {
        return this.f23265a.a();
    }

    public boolean d() {
        return this.f23265a.h();
    }
}
