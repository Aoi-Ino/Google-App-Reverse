package wl;

import cm.l;
import fm.b;
import fm.c;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: wl.a$a  reason: collision with other inner class name */
    private static final class C0375a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0375a f32647a = new C0375a();

        /* renamed from: b  reason: collision with root package name */
        public static final Method f32648b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f32649c;

        static {
            Method method;
            Method method2;
            Class<Throwable> cls = Throwable.class;
            Method[] methods = cls.getMethods();
            l.e(methods, "throwableMethods");
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    l.e(parameterTypes, "it.parameterTypes");
                    if (l.a(m.E(parameterTypes), cls)) {
                        break;
                    }
                }
                i11++;
            }
            f32648b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (l.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f32649c = method;
        }

        private C0375a() {
        }
    }

    public void a(Throwable th2, Throwable th3) {
        l.f(th2, "cause");
        l.f(th3, "exception");
        Method method = C0375a.f32648b;
        if (method != null) {
            method.invoke(th2, new Object[]{th3});
        }
    }

    public c b() {
        return new b();
    }
}
