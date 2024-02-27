package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3338a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set f3339b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f3340c = false;

    private static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f3340c = true;
        Map map = this.f3338a;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object c10 : this.f3338a.values()) {
                        c(c10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Set set = this.f3339b;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable c11 : this.f3339b) {
                        c(c11);
                    }
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
            this.f3339b.clear();
        }
        e();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        Object obj;
        Map map = this.f3338a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f3338a.get(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: package-private */
    public Object f(String str, Object obj) {
        Object obj2;
        synchronized (this.f3338a) {
            try {
                obj2 = this.f3338a.get(str);
                if (obj2 == null) {
                    this.f3338a.put(str, obj);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f3340c) {
            c(obj);
        }
        return obj;
    }
}
