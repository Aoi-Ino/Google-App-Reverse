package n7;

import i7.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f14200a;

    private static abstract class b {
        private b() {
        }

        public abstract Method a(Class cls, Field field);

        /* access modifiers changed from: package-private */
        public abstract Constructor b(Class cls);

        /* access modifiers changed from: package-private */
        public abstract String[] c(Class cls);

        /* access modifiers changed from: package-private */
        public abstract boolean d(Class cls);
    }

    private static class c extends b {
        private c() {
            super();
        }

        public Method a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public Constructor b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public String[] c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        public boolean d(Class cls) {
            return false;
        }
    }

    private static class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Method f14201a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f14202b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f14203c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f14204d;

        private d() {
            super();
            Class<Class> cls = Class.class;
            this.f14201a = cls.getMethod("isRecord", new Class[0]);
            Method method = cls.getMethod("getRecordComponents", new Class[0]);
            this.f14202b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f14203c = componentType.getMethod("getName", new Class[0]);
            this.f14204d = componentType.getMethod("getType", new Class[0]);
        }

        public Method a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        public Constructor b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f14202b.invoke(cls, new Object[0]);
                Class[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f14204d.invoke(objArr[i10], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public String[] c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f14202b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f14203c.invoke(objArr[i10], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(Class cls) {
            try {
                return ((Boolean) this.f14201a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw a.d(e10);
            }
        }
    }

    static {
        b bVar;
        try {
            bVar = new d();
        } catch (NoSuchMethodException unused) {
            bVar = new c();
        }
        f14200a = bVar;
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String c(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f(java.lang.reflect.AccessibleObject r5, boolean r6) {
        /*
            boolean r0 = r5 instanceof java.lang.reflect.Field
            java.lang.String r1 = "#"
            java.lang.String r2 = "'"
            if (r0 == 0) goto L_0x0031
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "field '"
            r0.append(r3)
            java.lang.Class r3 = r5.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r5 = r5.getName()
        L_0x0026:
            r0.append(r5)
            r0.append(r2)
        L_0x002c:
            java.lang.String r5 = r0.toString()
            goto L_0x0091
        L_0x0031:
            boolean r0 = r5 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L_0x006a
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r5.getName()
            r0.<init>(r3)
            b(r5, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "method '"
            r3.append(r4)
            java.lang.Class r5 = r5.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            r3.append(r5)
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            goto L_0x0091
        L_0x006a:
            boolean r0 = r5 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "constructor '"
            r0.append(r1)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r5 = c(r5)
            goto L_0x0026
        L_0x007f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.append(r1)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            goto L_0x002c
        L_0x0091:
            if (r6 == 0) goto L_0x00ba
            r6 = 0
            char r0 = r5.charAt(r6)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L_0x00ba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r6 = r5.charAt(r6)
            char r6 = java.lang.Character.toUpperCase(r6)
            r0.append(r6)
            r6 = 1
            java.lang.String r5 = r5.substring(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L_0x00ba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.f(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    public static Method g(Class cls, Field field) {
        return f14200a.a(cls, field);
    }

    public static Constructor h(Class cls) {
        return f14200a.b(cls);
    }

    public static String[] i(Class cls) {
        return f14200a.c(cls);
    }

    public static boolean j(Class cls) {
        return f14200a.d(cls);
    }

    public static void k(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            String f10 = f(accessibleObject, false);
            throw new h("Failed making " + f10 + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e10);
        }
    }

    public static String l(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage();
        }
    }
}
