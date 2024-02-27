package qm;

abstract /* synthetic */ class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f30825a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f30825a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
