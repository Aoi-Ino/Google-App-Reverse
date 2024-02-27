package k6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import y6.b;

class x implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set f13016a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set f13017b = null;

    x(Collection collection) {
        this.f13016a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            for (b bVar : this.f13016a) {
                this.f13017b.add(bVar.get());
            }
            this.f13016a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(b bVar) {
        Set set;
        Object obj;
        try {
            if (this.f13017b == null) {
                set = this.f13016a;
                obj = bVar;
            } else {
                set = this.f13017b;
                obj = bVar.get();
            }
            set.add(obj);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public Set get() {
        if (this.f13017b == null) {
            synchronized (this) {
                try {
                    if (this.f13017b == null) {
                        this.f13017b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f13017b);
    }
}
