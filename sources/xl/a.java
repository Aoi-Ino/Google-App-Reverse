package xl;

import cm.l;

public abstract class a extends wl.a {

    /* renamed from: xl.a$a  reason: collision with other inner class name */
    private static final class C0382a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0382a f32798a = new C0382a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f32799b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f32799b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f32799b = num2;
        }

        private C0382a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0382a.f32799b;
        return num == null || num.intValue() >= i10;
    }

    public void a(Throwable th2, Throwable th3) {
        l.f(th2, "cause");
        l.f(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
