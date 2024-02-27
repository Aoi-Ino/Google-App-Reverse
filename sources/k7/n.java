package k7;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f13089a = c();

    class a extends n {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f13090b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f13091c;

        a(Method method, Object obj) {
            this.f13090b = method;
            this.f13091c = obj;
        }

        public Object d(Class cls) {
            n.b(cls);
            return this.f13090b.invoke(this.f13091c, new Object[]{cls});
        }
    }

    class b extends n {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f13092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13093c;

        b(Method method, int i10) {
            this.f13092b = method;
            this.f13093c = i10;
        }

        public Object d(Class cls) {
            n.b(cls);
            return this.f13092b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f13093c)});
        }
    }

    class c extends n {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f13094b;

        c(Method method) {
            this.f13094b = method;
        }

        public Object d(Class cls) {
            n.b(cls);
            return this.f13094b.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    class d extends n {
        d() {
        }

        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* access modifiers changed from: private */
    public static void b(Class cls) {
        String a10 = c.a(cls);
        if (a10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a10);
        }
    }

    private static n c() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract Object d(Class cls);
}
