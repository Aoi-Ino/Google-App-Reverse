package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23401a;

    public t1(d0 d0Var, n3 n3Var) {
        this.f23401a = new a(d0Var, n3Var);
    }

    private Annotation a(Method method) {
        Class[] b10 = b(method);
        Class j10 = j(method);
        if (j10 != null) {
            return this.f23401a.c(j10, b10);
        }
        return null;
    }

    private Class[] b(Method method) {
        v1 e10 = e(method);
        if (e10 == v1.SET) {
            return t2.i(method, 0);
        }
        if (e10 == v1.GET) {
            return t2.l(method);
        }
        if (e10 == v1.IS) {
            return t2.l(method);
        }
        return null;
    }

    private v1 e(Method method) {
        String name = method.getName();
        if (name.startsWith("get")) {
            return v1.GET;
        }
        if (name.startsWith("is")) {
            return v1.IS;
        }
        return name.startsWith("set") ? v1.SET : v1.NONE;
    }

    private r1 f(Method method, Annotation annotation) {
        v1 e10 = e(method);
        if (e10 == v1.GET) {
            return h(method, e10);
        }
        if (e10 == v1.IS) {
            return h(method, e10);
        }
        if (e10 == v1.SET) {
            return l(method, e10);
        }
        throw new q1("Annotation %s must mark a set or get method", annotation);
    }

    private Class g(Method method) {
        if (method.getParameterTypes().length == 1) {
            return method.getParameterTypes()[0];
        }
        return null;
    }

    private r1 h(Method method, v1 v1Var) {
        Class[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length == 0) {
            String k10 = k(name, v1Var);
            if (k10 != null) {
                return new r1(method, v1Var, k10);
            }
            throw new q1("Could not get name for %s", method);
        }
        throw new q1("Get method %s is not a valid property", method);
    }

    private Class i(Method method) {
        if (method.getParameterTypes().length == 0) {
            return method.getReturnType();
        }
        return null;
    }

    private String k(String str, v1 v1Var) {
        int a10 = v1Var.a();
        int length = str.length();
        if (length > a10) {
            str = str.substring(a10, length);
        }
        return t2.g(str);
    }

    private r1 l(Method method, v1 v1Var) {
        Class[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length == 1) {
            String k10 = k(name, v1Var);
            if (k10 != null) {
                return new r1(method, v1Var, k10);
            }
            throw new q1("Could not get name for %s", method);
        }
        throw new q1("Set method %s is not a valid property", method);
    }

    public s1 c(Method method, Annotation annotation, Annotation[] annotationArr) {
        r1 f10 = f(method, annotation);
        return f10.c() == v1.SET ? new f3(f10, annotation, annotationArr) : new d1(f10, annotation, annotationArr);
    }

    public s1 d(Method method, Annotation[] annotationArr) {
        Annotation a10 = a(method);
        if (a10 != null) {
            return c(method, a10, annotationArr);
        }
        return null;
    }

    public Class j(Method method) {
        v1 e10 = e(method);
        if (e10 == v1.SET) {
            return g(method);
        }
        if (e10 == v1.GET) {
            return i(method);
        }
        if (e10 == v1.IS) {
            return i(method);
        }
        return null;
    }
}
