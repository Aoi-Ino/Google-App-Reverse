package lm;

import qm.h0;
import qm.m0;

public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public static final f2 f24958a = new f2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f24959b = m0.a(new h0("ThreadLocalEventLoop"));

    private f2() {
    }

    public final u0 a() {
        ThreadLocal threadLocal = f24959b;
        u0 u0Var = (u0) threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        u0 a10 = x0.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void b() {
        f24959b.set((Object) null);
    }

    public final void c(u0 u0Var) {
        f24959b.set(u0Var);
    }
}
