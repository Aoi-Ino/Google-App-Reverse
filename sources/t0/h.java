package t0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b1.f;
import cm.g;
import cm.l;
import cm.m;
import java.util.Set;
import java.util.UUID;

public final class h implements s, x0, i, f {

    /* renamed from: s  reason: collision with root package name */
    public static final a f16285s = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f16286e;

    /* renamed from: f  reason: collision with root package name */
    private p f16287f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f16288g;

    /* renamed from: h  reason: collision with root package name */
    private k.b f16289h;

    /* renamed from: i  reason: collision with root package name */
    private final z f16290i;

    /* renamed from: j  reason: collision with root package name */
    private final String f16291j;

    /* renamed from: k  reason: collision with root package name */
    private final Bundle f16292k;

    /* renamed from: l  reason: collision with root package name */
    private u f16293l;

    /* renamed from: m  reason: collision with root package name */
    private final b1.e f16294m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f16295n;

    /* renamed from: o  reason: collision with root package name */
    private final pl.h f16296o;

    /* renamed from: p  reason: collision with root package name */
    private final pl.h f16297p;

    /* renamed from: q  reason: collision with root package name */
    private k.b f16298q;

    /* renamed from: r  reason: collision with root package name */
    private final u0.b f16299r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Context context, p pVar, Bundle bundle, k.b bVar, z zVar, String str, Bundle bundle2, int i10, Object obj) {
            String str2;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            k.b bVar2 = (i10 & 8) != 0 ? k.b.CREATED : bVar;
            z zVar2 = (i10 & 16) != 0 ? null : zVar;
            if ((i10 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                l.e(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return aVar.a(context, pVar, bundle3, bVar2, zVar2, str2, (i10 & 64) != 0 ? null : bundle2);
        }

        public final h a(Context context, p pVar, Bundle bundle, k.b bVar, z zVar, String str, Bundle bundle2) {
            l.f(pVar, "destination");
            l.f(bVar, "hostLifecycleState");
            String str2 = str;
            l.f(str2, "id");
            return new h(context, pVar, bundle, bVar, zVar, str2, bundle2, (g) null);
        }
    }

    private static final class b extends androidx.lifecycle.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(fVar, (Bundle) null);
            l.f(fVar, "owner");
        }

        /* access modifiers changed from: protected */
        public t0 e(String str, Class cls, j0 j0Var) {
            l.f(str, "key");
            l.f(cls, "modelClass");
            l.f(j0Var, "handle");
            return new c(j0Var);
        }
    }

    private static final class c extends t0 {

        /* renamed from: d  reason: collision with root package name */
        private final j0 f16300d;

        public c(j0 j0Var) {
            l.f(j0Var, "handle");
            this.f16300d = j0Var;
        }

        public final j0 g() {
            return this.f16300d;
        }
    }

    static final class d extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f16301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.f16301e = hVar;
        }

        /* renamed from: b */
        public final p0 a() {
            Context a10 = this.f16301e.f16286e;
            Application application = null;
            Context applicationContext = a10 != null ? a10.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            h hVar = this.f16301e;
            return new p0(application, hVar, hVar.c());
        }
    }

    static final class e extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f16302e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(0);
            this.f16302e = hVar;
        }

        /* renamed from: b */
        public final j0 a() {
            if (!this.f16302e.f16295n) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            } else if (this.f16302e.d0().b() != k.b.DESTROYED) {
                return ((c) new u0((x0) this.f16302e, (u0.b) new b(this.f16302e)).a(c.class)).g();
            } else {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
        }
    }

    private h(Context context, p pVar, Bundle bundle, k.b bVar, z zVar, String str, Bundle bundle2) {
        this.f16286e = context;
        this.f16287f = pVar;
        this.f16288g = bundle;
        this.f16289h = bVar;
        this.f16290i = zVar;
        this.f16291j = str;
        this.f16292k = bundle2;
        this.f16293l = new u(this);
        this.f16294m = b1.e.f4403d.a(this);
        this.f16296o = j.a(new d(this));
        this.f16297p = j.a(new e(this));
        this.f16298q = k.b.INITIALIZED;
        this.f16299r = d();
    }

    private final p0 d() {
        return (p0) this.f16296o.getValue();
    }

    public u0.b I() {
        return this.f16299r;
    }

    public r0.a J() {
        Application application = null;
        r0.d dVar = new r0.d((r0.a) null, 1, (g) null);
        Context context = this.f16286e;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            dVar.c(u0.a.f3358h, application);
        }
        dVar.c(m0.f3314a, this);
        dVar.c(m0.f3315b, this);
        Bundle c10 = c();
        if (c10 != null) {
            dVar.c(m0.f3316c, c10);
        }
        return dVar;
    }

    public w0 X() {
        if (!this.f16295n) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        } else if (d0().b() != k.b.DESTROYED) {
            z zVar = this.f16290i;
            if (zVar != null) {
                return zVar.a(this.f16291j);
            }
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        } else {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
    }

    public final Bundle c() {
        if (this.f16288g == null) {
            return null;
        }
        return new Bundle(this.f16288g);
    }

    public k d0() {
        return this.f16293l;
    }

    public final p e() {
        return this.f16287f;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!l.a(this.f16291j, hVar.f16291j) || !l.a(this.f16287f, hVar.f16287f) || !l.a(d0(), hVar.d0()) || !l.a(l(), hVar.l())) {
            return false;
        }
        if (!l.a(this.f16288g, hVar.f16288g)) {
            Bundle bundle = this.f16288g;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            if (!keySet.isEmpty()) {
                for (String str : keySet) {
                    Object obj2 = this.f16288g.get(str);
                    Bundle bundle2 = hVar.f16288g;
                    if (!l.a(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final String f() {
        return this.f16291j;
    }

    public final k.b g() {
        return this.f16298q;
    }

    public final void h(k.a aVar) {
        l.f(aVar, "event");
        this.f16289h = aVar.b();
        n();
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f16291j.hashCode() * 31) + this.f16287f.hashCode();
        Bundle bundle = this.f16288g;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i10 = hashCode * 31;
                Object obj = this.f16288g.get(str);
                hashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + d0().hashCode()) * 31) + l().hashCode();
    }

    public final void i(Bundle bundle) {
        l.f(bundle, "outBundle");
        this.f16294m.e(bundle);
    }

    public final void j(p pVar) {
        l.f(pVar, "<set-?>");
        this.f16287f = pVar;
    }

    public b1.d l() {
        return this.f16294m.b();
    }

    public final void m(k.b bVar) {
        l.f(bVar, "maxState");
        this.f16298q = bVar;
        n();
    }

    public final void n() {
        u uVar;
        k.b bVar;
        if (!this.f16295n) {
            this.f16294m.c();
            this.f16295n = true;
            if (this.f16290i != null) {
                m0.c(this);
            }
            this.f16294m.d(this.f16292k);
        }
        if (this.f16289h.ordinal() < this.f16298q.ordinal()) {
            uVar = this.f16293l;
            bVar = this.f16289h;
        } else {
            uVar = this.f16293l;
            bVar = this.f16298q;
        }
        uVar.o(bVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append('(' + this.f16291j + ')');
        sb2.append(" destination=");
        sb2.append(this.f16287f);
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    public /* synthetic */ h(Context context, p pVar, Bundle bundle, k.b bVar, z zVar, String str, Bundle bundle2, g gVar) {
        this(context, pVar, bundle, bVar, zVar, str, bundle2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(h hVar, Bundle bundle) {
        this(hVar.f16286e, hVar.f16287f, bundle, hVar.f16289h, hVar.f16290i, hVar.f16291j, hVar.f16292k);
        l.f(hVar, "entry");
        this.f16289h = hVar.f16289h;
        m(hVar.f16298q);
    }
}
