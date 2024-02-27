package yl;

import fm.c;

public class a extends xl.a {

    /* renamed from: yl.a$a  reason: collision with other inner class name */
    private static final class C0387a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0387a f33058a = new C0387a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f33059b;

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
                    f33059b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f33059b = num2;
        }

        private C0387a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0387a.f33059b;
        return num == null || num.intValue() >= i10;
    }

    public c b() {
        return c(34) ? new gm.a() : super.b();
    }
}
