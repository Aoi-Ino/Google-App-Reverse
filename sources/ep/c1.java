package ep;

import java.lang.reflect.Method;

class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final Method f23136a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23137b;

    public c1(Method method, boolean z10) {
        this.f23137b = z10;
        this.f23136a = method;
    }

    public Object a(w wVar, Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f23137b ? this.f23136a.invoke(obj, new Object[]{wVar.k().a()}) : this.f23136a.invoke(obj, new Object[0]);
    }
}
