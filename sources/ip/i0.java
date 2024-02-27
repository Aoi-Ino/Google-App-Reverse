package ip;

import jp.a;
import jp.b;

public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f24523a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final a f24524b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final z f24525c;

    public i0(z zVar) {
        this.f24525c = new p(zVar);
    }

    private g0 a(Class cls) {
        if (this.f24524b.contains(cls)) {
            return null;
        }
        g0 g0Var = (g0) this.f24523a.b(cls);
        return g0Var != null ? g0Var : b(cls);
    }

    private g0 b(Class cls) {
        g0 a10 = this.f24525c.a(cls);
        if (a10 != null) {
            this.f24523a.a(cls, a10);
        } else {
            this.f24524b.a(cls, this);
        }
        return a10;
    }

    public Object c(String str, Class cls) {
        g0 a10 = a(cls);
        if (a10 != null) {
            return a10.b(str);
        }
        throw new h0("Transform of %s not supported", cls);
    }

    public boolean d(Class cls) {
        return a(cls) != null;
    }

    public String e(Object obj, Class cls) {
        g0 a10 = a(cls);
        if (a10 != null) {
            return a10.a(obj);
        }
        throw new h0("Transform of %s not supported", cls);
    }
}
