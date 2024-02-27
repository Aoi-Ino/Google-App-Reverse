package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g1.c;
import h1.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f3928d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f3929e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map f3930a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set f3931b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f3932c;

    a(Context context) {
        this.f3932c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object obj;
        if (b.d()) {
            try {
                b.a(cls.getSimpleName());
            } catch (Throwable th2) {
                b.b();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f3930a.containsKey(cls)) {
                set.add(cls);
                g1.a aVar = (g1.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!this.f3930a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = aVar.b(this.f3932c);
                set.remove(cls);
                this.f3930a.put(cls, obj);
            } else {
                obj = this.f3930a.get(cls);
            }
            b.b();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f3928d == null) {
            synchronized (f3929e) {
                try {
                    if (f3928d == null) {
                        f3928d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f3928d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            b.a("Startup");
            b(this.f3932c.getPackageManager().getProviderInfo(new ComponentName(this.f3932c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            b.b();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new c((Throwable) e10);
        } catch (Throwable th2) {
            b.b();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f3932c.getString(g1.b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (g1.a.class.isAssignableFrom(cls)) {
                            this.f3931b.add(cls);
                        }
                    }
                }
                for (Class d10 : this.f3931b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object c(Class cls) {
        Object obj;
        synchronized (f3929e) {
            try {
                obj = this.f3930a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f3931b.contains(cls);
    }
}
