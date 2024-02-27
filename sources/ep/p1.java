package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class p1 {

    /* renamed from: a  reason: collision with root package name */
    private final Annotation[] f23364a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f23365b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23366c;

    public p1(Method method) {
        this.f23364a = method.getDeclaredAnnotations();
        this.f23366c = method.getName();
        this.f23365b = method;
    }

    public Annotation[] a() {
        return this.f23364a;
    }

    public Method b() {
        return this.f23365b;
    }
}
