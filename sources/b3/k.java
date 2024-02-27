package b3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f4430a;

    /* renamed from: b  reason: collision with root package name */
    private final i f4431b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4432c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4433a;

        /* renamed from: b  reason: collision with root package name */
        private Map f4434b = null;

        a(Context context) {
            this.f4433a = context;
        }

        private Map a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d10.keySet()) {
                Object obj = d10.get(next);
                if ((obj instanceof String) && next.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map c() {
            if (this.f4434b == null) {
                this.f4434b = a(this.f4433a);
            }
            return this.f4434b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public d b(String str) {
            String str2;
            String str3;
            String str4 = (String) c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                e = e10;
                str3 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (IllegalAccessException e11) {
                e = e11;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InstantiationException e12) {
                e = e12;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InvocationTargetException e14) {
                e = e14;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            }
        }
    }

    k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public synchronized m i(String str) {
        if (this.f4432c.containsKey(str)) {
            return (m) this.f4432c.get(str);
        }
        d b10 = this.f4430a.b(str);
        if (b10 == null) {
            return null;
        }
        m create = b10.create(this.f4431b.a(str));
        this.f4432c.put(str, create);
        return create;
    }

    k(a aVar, i iVar) {
        this.f4432c = new HashMap();
        this.f4430a = aVar;
        this.f4431b = iVar;
    }
}
