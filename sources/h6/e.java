package h6;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.os.m;
import androidx.lifecycle.p;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k6.f;
import k6.n;
import k6.w;
import l6.l;
import s3.o;
import w3.j;
import w3.k;

public class e {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Object f12030k = new Object();

    /* renamed from: l  reason: collision with root package name */
    static final Map f12031l = new o.a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f12032a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12033b;

    /* renamed from: c  reason: collision with root package name */
    private final k f12034c;

    /* renamed from: d  reason: collision with root package name */
    private final n f12035d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f12036e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f12037f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final w f12038g;

    /* renamed from: h  reason: collision with root package name */
    private final y6.b f12039h;

    /* renamed from: i  reason: collision with root package name */
    private final List f12040i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List f12041j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    private static class b implements a.C0096a {

        /* renamed from: a  reason: collision with root package name */
        private static AtomicReference f12042a = new AtomicReference();

        private b() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f12042a.get() == null) {
                    b bVar = new b();
                    if (p.a(f12042a, (Object) null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z10) {
            synchronized (e.f12030k) {
                try {
                    Iterator it = new ArrayList(e.f12031l.values()).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.f12036e.get()) {
                            eVar.x(z10);
                        }
                    }
                } finally {
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference f12043b = new AtomicReference();

        /* renamed from: a  reason: collision with root package name */
        private final Context f12044a;

        public c(Context context) {
            this.f12044a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (f12043b.get() == null) {
                c cVar = new c(context);
                if (p.a(f12043b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f12044a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (e.f12030k) {
                try {
                    for (e d10 : e.f12031l.values()) {
                        d10.o();
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            c();
        }
    }

    protected e(Context context, String str, k kVar) {
        this.f12032a = (Context) o.i(context);
        this.f12033b = o.e(str);
        this.f12034c = (k) o.i(kVar);
        l b10 = FirebaseInitProvider.b();
        h7.c.b("Firebase");
        h7.c.b("ComponentDiscovery");
        List b11 = f.c(context, ComponentDiscoveryService.class).b();
        h7.c.a();
        h7.c.b("Runtime");
        n.b g10 = n.k(l.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(k6.c.s(context, Context.class, new Class[0])).b(k6.c.s(this, e.class, new Class[0])).b(k6.c.s(kVar, k.class, new Class[0])).g(new h7.b());
        if (m.a(context) && FirebaseInitProvider.c()) {
            g10.b(k6.c.s(b10, l.class, new Class[0]));
        }
        n e10 = g10.e();
        this.f12035d = e10;
        h7.c.a();
        this.f12038g = new w(new c(this, context));
        this.f12039h = e10.d(w6.f.class);
        g(new d(this));
        h7.c.a();
    }

    private void h() {
        o.l(!this.f12037f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f12030k) {
            try {
                eVar = (e) f12031l.get("[DEFAULT]");
                if (eVar != null) {
                    ((w6.f) eVar.f12039h.get()).l();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public void o() {
        if (!m.a(this.f12032a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f12032a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f12035d.n(t());
        ((w6.f) this.f12039h.get()).l();
    }

    public static e p(Context context) {
        synchronized (f12030k) {
            try {
                if (f12031l.containsKey("[DEFAULT]")) {
                    e k10 = k();
                    return k10;
                }
                k a10 = k.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                e q10 = q(context, a10);
                return q10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static e q(Context context, k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    public static e r(Context context, k kVar, String str) {
        e eVar;
        b.c(context);
        String w10 = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f12030k) {
            Map map = f12031l;
            o.l(!map.containsKey(w10), "FirebaseApp name " + w10 + " already exists!");
            o.j(context, "Application context cannot be null.");
            eVar = new e(context, w10, kVar);
            map.put(w10, eVar);
        }
        eVar.o();
        return eVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ d7.a u(Context context) {
        return new d7.a(context, n(), (v6.c) this.f12035d.a(v6.c.class));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(boolean z10) {
        if (!z10) {
            ((w6.f) this.f12039h.get()).l();
        }
    }

    private static String w(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void x(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (a a10 : this.f12040i) {
            a10.a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f12033b.equals(((e) obj).l());
    }

    public void g(a aVar) {
        h();
        if (this.f12036e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f12040i.add(aVar);
    }

    public int hashCode() {
        return this.f12033b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.f12035d.a(cls);
    }

    public Context j() {
        h();
        return this.f12032a;
    }

    public String l() {
        h();
        return this.f12033b;
    }

    public k m() {
        h();
        return this.f12034c;
    }

    public String n() {
        return w3.c.a(l().getBytes(Charset.defaultCharset())) + "+" + w3.c.a(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return ((d7.a) this.f12038g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return s3.n.c(this).a("name", this.f12033b).a("options", this.f12034c).toString();
    }
}
