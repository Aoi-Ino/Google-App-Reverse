package k3;

import c3.b;

public final class d implements b {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final d f12939a = new d();
    }

    public static d a() {
        return a.f12939a;
    }

    public static a c() {
        return (a) c3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
