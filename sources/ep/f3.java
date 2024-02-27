package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import jp.a;
import jp.b;

class f3 implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23203a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f23204b;

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f23205c;

    /* renamed from: d  reason: collision with root package name */
    private final v1 f23206d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f23207e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23208f;

    public f3(r1 r1Var, Annotation annotation, Annotation[] annotationArr) {
        this.f23207e = r1Var.a();
        this.f23208f = r1Var.b();
        this.f23206d = r1Var.c();
        this.f23205c = annotation;
        this.f23204b = annotationArr;
    }

    public Annotation a() {
        return this.f23205c;
    }

    public Annotation b(Class cls) {
        if (this.f23203a.isEmpty()) {
            for (Annotation annotation : this.f23204b) {
                this.f23203a.a(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f23203a.b(cls);
    }

    public Class c() {
        return this.f23207e.getDeclaringClass();
    }

    public Class[] d() {
        return t2.i(this.f23207e, 0);
    }

    public v1 e() {
        return this.f23206d;
    }

    public Method f() {
        if (!this.f23207e.isAccessible()) {
            this.f23207e.setAccessible(true);
        }
        return this.f23207e;
    }

    public String getName() {
        return this.f23208f;
    }

    public Class getType() {
        return this.f23207e.getParameterTypes()[0];
    }

    public Class i() {
        return t2.h(this.f23207e, 0);
    }

    public String toString() {
        return this.f23207e.toGenericString();
    }
}
