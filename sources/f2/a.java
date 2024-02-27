package f2;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f11314b;

    /* renamed from: a  reason: collision with root package name */
    private final e f11315a = new b();

    private a() {
    }

    public static a b() {
        if (f11314b == null) {
            synchronized (a.class) {
                try {
                    if (f11314b == null) {
                        f11314b = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11314b;
    }

    public e a() {
        return this.f11315a;
    }
}
