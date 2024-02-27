package n6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final m6.a f14192a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final m6.b f14193b = m6.b.a(", ").b("null");

    static class a implements m6.a {
        a() {
        }

        /* renamed from: a */
        public String apply(Type type) {
            return b.f14198i.a(type);
        }
    }

    enum b {
        JAVA6 {
        },
        JAVA7 {
        },
        JAVA8 {
            /* access modifiers changed from: package-private */
            public String a(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            }
        },
        JAVA9 {
            /* access modifiers changed from: package-private */
            public String a(Type type) {
                return b.JAVA8.a(type);
            }
        };
        

        /* renamed from: i  reason: collision with root package name */
        static final b f14198i = null;

        static class e extends a {
            e() {
            }
        }

        static class f extends a {
            f() {
            }
        }

        /* access modifiers changed from: package-private */
        public String a(Type type) {
            return c.a(type);
        }
    }

    static String a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
