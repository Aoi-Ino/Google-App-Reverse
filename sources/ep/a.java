package ep;

import dp.d;
import dp.e;
import dp.f;
import dp.h;
import hp.i;
import hp.s0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final i f23105a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23106b;

    public a(d0 d0Var, n3 n3Var) {
        this.f23106b = d0Var.e();
        this.f23105a = n3Var.f();
    }

    private ClassLoader a() {
        return a.class.getClassLoader();
    }

    private Annotation b(Class cls) {
        Class cls2;
        ClassLoader a10 = a();
        Class<?> componentType = cls.getComponentType();
        Class<d> cls3 = d.class;
        if (cls.isArray()) {
            if (g(componentType)) {
                return d(a10, cls3);
            }
            cls2 = e.class;
        } else if (!g(cls) || !f()) {
            return d(a10, cls3);
        } else {
            cls2 = dp.a.class;
        }
        return d(a10, cls2);
    }

    private Annotation d(ClassLoader classLoader, Class cls) {
        return e(classLoader, cls, false);
    }

    private Annotation e(ClassLoader classLoader, Class cls, boolean z10) {
        b bVar = new b(cls, this.f23106b, z10);
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, bVar);
    }

    private boolean f() {
        s0 d10 = this.f23105a.d();
        return d10 != null && d10 == s0.LOW;
    }

    private boolean g(Class cls) {
        if (Number.class.isAssignableFrom(cls) || cls == Boolean.class || cls == Character.class) {
            return true;
        }
        return cls.isPrimitive();
    }

    private boolean h(Class[] clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return false;
        }
        Class superclass = clsArr[0].getSuperclass();
        Class cls = clsArr[0];
        if (superclass == null || (!superclass.isEnum() && !cls.isEnum())) {
            return g(cls);
        }
        return true;
    }

    public Annotation c(Class cls, Class[] clsArr) {
        ClassLoader a10 = a();
        if (!Map.class.isAssignableFrom(cls)) {
            return Collection.class.isAssignableFrom(cls) ? d(a10, f.class) : b(cls);
        }
        boolean h10 = h(clsArr);
        Class<h> cls2 = h.class;
        return (!h10 || !f()) ? d(a10, cls2) : e(a10, cls2, true);
    }
}
