package en;

import cm.g;
import cm.l;
import java.lang.reflect.Method;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23071d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final Method f23072a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f23073b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f23074c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final j a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method2 = null;
                method3 = null;
                method = null;
            }
            return new j(method2, method, method3);
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f23072a = method;
        this.f23073b = method2;
        this.f23074c = method3;
    }

    public final Object a(String str) {
        l.f(str, "closer");
        Method method = this.f23072a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.f23073b;
                l.c(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f23074c;
            l.c(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
