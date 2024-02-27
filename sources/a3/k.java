package a3;

import c3.b;
import c3.d;
import java.util.concurrent.Executor;

public final class k implements b {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final k f182a = new k();
    }

    public static k a() {
        return a.f182a;
    }

    public static Executor b() {
        return (Executor) d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
