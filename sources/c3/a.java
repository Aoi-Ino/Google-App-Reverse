package c3;

public final class a implements nl.a {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4737c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile nl.a f4738a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f4739b = f4737c;

    private a(nl.a aVar) {
        this.f4738a = aVar;
    }

    public static nl.a a(nl.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f4737c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f4739b;
        Object obj2 = f4737c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4739b;
                    if (obj == obj2) {
                        obj = this.f4738a.get();
                        this.f4739b = b(this.f4739b, obj);
                        this.f4738a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
