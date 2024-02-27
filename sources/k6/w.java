package k6;

import y6.b;

public class w implements b {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f13013c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f13014a = f13013c;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f13015b;

    public w(b bVar) {
        this.f13015b = bVar;
    }

    public Object get() {
        Object obj = this.f13014a;
        Object obj2 = f13013c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f13014a;
                    if (obj == obj2) {
                        obj = this.f13015b.get();
                        this.f13014a = obj;
                        this.f13015b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
