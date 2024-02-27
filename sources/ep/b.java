package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final o f23116a = new o();

    /* renamed from: b  reason: collision with root package name */
    private final Class f23117b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23118c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23119d;

    public b(Class cls, boolean z10, boolean z11) {
        this.f23118c = z11;
        this.f23119d = z10;
        this.f23117b = cls;
    }

    private void a(StringBuilder sb2) {
        Method[] declaredMethods = this.f23117b.getDeclaredMethods();
        for (int i10 = 0; i10 < declaredMethods.length; i10++) {
            String name = declaredMethods[i10].getName();
            Object d10 = d(declaredMethods[i10]);
            if (i10 > 0) {
                sb2.append(',');
                sb2.append(' ');
            }
            sb2.append(name);
            sb2.append('=');
            sb2.append(d10);
        }
        sb2.append(')');
    }

    private boolean b(Object obj, Object[] objArr) {
        Annotation annotation = (Annotation) obj;
        Annotation annotation2 = objArr[0];
        if (annotation.annotationType() == annotation2.annotationType()) {
            return this.f23116a.a(annotation, annotation2);
        }
        throw new n2("Annotation %s is not the same as %s", annotation, annotation2);
    }

    private void c(StringBuilder sb2) {
        String name = this.f23117b.getName();
        sb2.append('@');
        sb2.append(name);
        sb2.append('(');
    }

    private Object d(Method method) {
        boolean z10;
        String name = method.getName();
        if (name.equals("required")) {
            z10 = this.f23119d;
        } else if (!name.equals("attribute")) {
            return method.getDefaultValue();
        } else {
            z10 = this.f23118c;
        }
        return Boolean.valueOf(z10);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z10;
        String name = method.getName();
        if (name.equals("toString")) {
            return toString();
        }
        if (name.equals("equals")) {
            z10 = b(obj, objArr);
        } else if (name.equals("annotationType")) {
            return this.f23117b;
        } else {
            if (name.equals("required")) {
                z10 = this.f23119d;
            } else if (!name.equals("attribute")) {
                return method.getDefaultValue();
            } else {
                z10 = this.f23118c;
            }
        }
        return Boolean.valueOf(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f23117b != null) {
            c(sb2);
            a(sb2);
        }
        return sb2.toString();
    }
}
