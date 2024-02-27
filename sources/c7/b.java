package c7;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f4769a;

    private b() {
    }

    public static b b() {
        if (f4769a == null) {
            f4769a = new b();
        }
        return f4769a;
    }

    public long a() {
        return System.currentTimeMillis();
    }
}
