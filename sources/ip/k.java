package ip;

class k implements g0 {
    k() {
    }

    private ClassLoader c() {
        return getClass().getClassLoader();
    }

    private static ClassLoader d() {
        return Thread.currentThread().getContextClassLoader();
    }

    private Class f(String str) {
        if (str.equals("byte")) {
            return Byte.TYPE;
        }
        if (str.equals("short")) {
            return Short.TYPE;
        }
        if (str.equals("int")) {
            return Integer.TYPE;
        }
        if (str.equals("long")) {
            return Long.TYPE;
        }
        if (str.equals("char")) {
            return Character.TYPE;
        }
        if (str.equals("float")) {
            return Float.TYPE;
        }
        if (str.equals("double")) {
            return Double.TYPE;
        }
        if (str.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return null;
    }

    /* renamed from: e */
    public Class b(String str) {
        Class f10 = f(str);
        if (f10 != null) {
            return f10;
        }
        ClassLoader d10 = d();
        if (d10 == null) {
            d10 = c();
        }
        return d10.loadClass(str);
    }

    /* renamed from: g */
    public String a(Class cls) {
        return cls.getName();
    }
}
