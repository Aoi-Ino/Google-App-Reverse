package ep;

import dp.d;
import dp.e;
import dp.f;
import dp.g;
import dp.h;
import dp.j;
import dp.p;
import hp.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

class i2 {

    /* renamed from: a  reason: collision with root package name */
    private final i f23247a;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f23248a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f23249b;

        /* renamed from: c  reason: collision with root package name */
        private final Class f23250c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, (Class) null);
        }

        private Constructor d(Class... clsArr) {
            return this.f23250c.getConstructor(clsArr);
        }

        public Constructor a() {
            Class cls = this.f23248a;
            return cls != null ? c(this.f23249b, cls) : b(this.f23249b);
        }

        public Constructor b(Class cls) {
            return d(Constructor.class, cls, i.class, Integer.TYPE);
        }

        public Constructor c(Class cls, Class cls2) {
            return d(Constructor.class, cls, cls2, i.class, Integer.TYPE);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.f23249b = cls2;
            this.f23248a = cls3;
            this.f23250c = cls;
        }
    }

    public i2(n3 n3Var) {
        this.f23247a = n3Var.f();
    }

    private a a(Annotation annotation) {
        Class<d> cls = d.class;
        if (annotation instanceof d) {
            return new a(s0.class, cls);
        }
        Class<f> cls2 = f.class;
        if (annotation instanceof f) {
            return new a(l0.class, cls2);
        }
        if (annotation instanceof e) {
            return new a(h0.class, e.class);
        }
        Class<h> cls3 = h.class;
        if (annotation instanceof dp.i) {
            return new a(r0.class, dp.i.class, cls3);
        }
        if (annotation instanceof g) {
            return new a(n0.class, g.class, cls2);
        }
        if (annotation instanceof j) {
            return new a(u0.class, j.class, cls);
        }
        if (annotation instanceof h) {
            return new a(p0.class, cls3);
        }
        if (annotation instanceof dp.a) {
            return new a(e.class, dp.a.class);
        }
        if (annotation instanceof p) {
            return new a(v3.class, p.class);
        }
        throw new n2("Annotation %s not supported", annotation);
    }

    private Constructor b(Annotation annotation) {
        Constructor a10 = a(annotation).a();
        if (!a10.isAccessible()) {
            a10.setAccessible(true);
        }
        return a10;
    }

    public h2 c(Constructor constructor, Annotation annotation, int i10) {
        return d(constructor, annotation, (Annotation) null, i10);
    }

    public h2 d(Constructor constructor, Annotation annotation, Annotation annotation2, int i10) {
        Constructor b10 = b(annotation);
        return (h2) (annotation2 != null ? b10.newInstance(new Object[]{constructor, annotation, annotation2, this.f23247a, Integer.valueOf(i10)}) : b10.newInstance(new Object[]{constructor, annotation, this.f23247a, Integer.valueOf(i10)}));
    }
}
