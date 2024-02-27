package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class o {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f23348a;

    public o() {
        this("name");
    }

    private boolean b(Method method) {
        String name = method.getName();
        String[] strArr = this.f23348a;
        if (strArr != null) {
            for (String equals : strArr) {
                if (name.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean a(Annotation annotation, Annotation annotation2) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Class<? extends Annotation> annotationType2 = annotation2.annotationType();
        Method[] declaredMethods = annotationType.getDeclaredMethods();
        if (!annotationType.equals(annotationType2)) {
            return false;
        }
        for (Method method : declaredMethods) {
            if (!b(method) && !method.invoke(annotation, new Object[0]).equals(method.invoke(annotation2, new Object[0]))) {
                return false;
            }
        }
        return true;
    }

    public o(String... strArr) {
        this.f23348a = strArr;
    }
}
