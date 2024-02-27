package t5;

public final class a0 implements c0, y {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f16521c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile c0 f16522a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f16523b = f16521c;

    private a0(c0 c0Var) {
        this.f16522a = c0Var;
    }

    public static y b(c0 c0Var) {
        if (c0Var instanceof y) {
            return (y) c0Var;
        }
        c0Var.getClass();
        return new a0(c0Var);
    }

    public static c0 c(c0 c0Var) {
        c0Var.getClass();
        return c0Var instanceof a0 ? c0Var : new a0(c0Var);
    }

    public final Object a() {
        Object obj = this.f16523b;
        Object obj2 = f16521c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f16523b;
                    if (obj == obj2) {
                        obj = this.f16522a.a();
                        Object obj3 = this.f16523b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                String valueOf = String.valueOf(obj3);
                                String valueOf2 = String.valueOf(obj);
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                                sb2.append("Scoped provider was invoked recursively returning different results: ");
                                sb2.append(valueOf);
                                sb2.append(" & ");
                                sb2.append(valueOf2);
                                sb2.append(". This is likely due to a circular dependency.");
                                throw new IllegalStateException(sb2.toString());
                            }
                        }
                        this.f16523b = obj;
                        this.f16522a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
