package gp;

class b {
    b() {
    }

    private static ClassLoader a() {
        return b.class.getClassLoader();
    }

    private static ClassLoader b() {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class c(String str) {
        ClassLoader b10 = b();
        if (b10 == null) {
            b10 = a();
        }
        return b10.loadClass(str);
    }
}
