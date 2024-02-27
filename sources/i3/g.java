package i3;

import c3.b;
import c3.d;

public final class g implements b {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final g f12273a = new g();
    }

    public static g a() {
        return a.f12273a;
    }

    public static String b() {
        return (String) d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
