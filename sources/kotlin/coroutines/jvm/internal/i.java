package kotlin.coroutines.jvm.internal;

import cm.l;
import java.lang.reflect.Method;

final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f24778a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f24779b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f24780c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f24781a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24782b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f24783c;

        public a(Method method, Method method2, Method method3) {
            this.f24781a = method;
            this.f24782b = method2;
            this.f24783c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f24780c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f24779b;
            f24780c = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        l.f(aVar, "continuation");
        a aVar2 = f24780c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f24779b) {
            return null;
        }
        Method method = aVar2.f24781a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f24782b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f24783c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
