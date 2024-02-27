package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import jp.a;
import jp.b;

class d1 implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23138a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f23139b;

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f23140c;

    /* renamed from: d  reason: collision with root package name */
    private final v1 f23141d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f23142e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23143f;

    public d1(r1 r1Var, Annotation annotation, Annotation[] annotationArr) {
        this.f23142e = r1Var.a();
        this.f23143f = r1Var.b();
        this.f23141d = r1Var.c();
        this.f23140c = annotation;
        this.f23139b = annotationArr;
    }

    public Annotation a() {
        return this.f23140c;
    }

    public Annotation b(Class cls) {
        if (this.f23138a.isEmpty()) {
            for (Annotation annotation : this.f23139b) {
                this.f23138a.a(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f23138a.b(cls);
    }

    public Class c() {
        return this.f23142e.getDeclaringClass();
    }

    public Class[] d() {
        return t2.l(this.f23142e);
    }

    public v1 e() {
        return this.f23141d;
    }

    public Method f() {
        if (!this.f23142e.isAccessible()) {
            this.f23142e.setAccessible(true);
        }
        return this.f23142e;
    }

    public String getName() {
        return this.f23143f;
    }

    public Class getType() {
        return this.f23142e.getReturnType();
    }

    public Class i() {
        return t2.k(this.f23142e);
    }

    public String toString() {
        return this.f23142e.toGenericString();
    }
}
