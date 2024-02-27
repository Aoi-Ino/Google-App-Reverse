package s3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p3.j;

public abstract class c {
    public static final String[] D = {"service_esmobile", "service_googleme"};
    private static final p3.c[] E = new p3.c[0];
    /* access modifiers changed from: private */
    public boolean A = false;
    private volatile y0 B = null;
    protected AtomicInteger C = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private int f15890a;

    /* renamed from: b  reason: collision with root package name */
    private long f15891b;

    /* renamed from: c  reason: collision with root package name */
    private long f15892c;

    /* renamed from: d  reason: collision with root package name */
    private int f15893d;

    /* renamed from: e  reason: collision with root package name */
    private long f15894e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f15895f = null;

    /* renamed from: g  reason: collision with root package name */
    k1 f15896g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f15897h;

    /* renamed from: i  reason: collision with root package name */
    private final Looper f15898i;

    /* renamed from: j  reason: collision with root package name */
    private final i f15899j;

    /* renamed from: k  reason: collision with root package name */
    private final j f15900k;

    /* renamed from: l  reason: collision with root package name */
    final Handler f15901l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f15902m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Object f15903n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public l f15904o;

    /* renamed from: p  reason: collision with root package name */
    protected C0213c f15905p;

    /* renamed from: q  reason: collision with root package name */
    private IInterface f15906q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f15907r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private v0 f15908s;

    /* renamed from: t  reason: collision with root package name */
    private int f15909t = 1;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final a f15910u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final b f15911v;

    /* renamed from: w  reason: collision with root package name */
    private final int f15912w;

    /* renamed from: x  reason: collision with root package name */
    private final String f15913x;

    /* renamed from: y  reason: collision with root package name */
    private volatile String f15914y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public p3.a f15915z = null;

    public interface a {
        void c(int i10);

        void j(Bundle bundle);
    }

    public interface b {
        void d(p3.a aVar);
    }

    /* renamed from: s3.c$c  reason: collision with other inner class name */
    public interface C0213c {
        void a(p3.a aVar);
    }

    protected class d implements C0213c {
        public d() {
        }

        public final void a(p3.a aVar) {
            if (aVar.g()) {
                c cVar = c.this;
                cVar.j((j) null, cVar.B());
            } else if (c.this.f15911v != null) {
                c.this.f15911v.d(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, i iVar, j jVar, int i10, a aVar, b bVar, String str) {
        o.j(context, "Context must not be null");
        this.f15897h = context;
        o.j(looper, "Looper must not be null");
        this.f15898i = looper;
        o.j(iVar, "Supervisor must not be null");
        this.f15899j = iVar;
        o.j(jVar, "API availability must not be null");
        this.f15900k = jVar;
        this.f15901l = new s0(this, looper);
        this.f15912w = i10;
        this.f15910u = aVar;
        this.f15911v = bVar;
        this.f15913x = str;
    }

    static /* bridge */ /* synthetic */ void a0(c cVar, y0 y0Var) {
        cVar.B = y0Var;
        if (cVar.Q()) {
            f fVar = y0Var.f16051h;
            p.b().c(fVar == null ? null : fVar.h());
        }
    }

    static /* bridge */ /* synthetic */ void b0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f15902m) {
            i11 = cVar.f15909t;
        }
        if (i11 == 3) {
            cVar.A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f15901l;
        handler.sendMessage(handler.obtainMessage(i12, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f15902m) {
            try {
                if (cVar.f15909t != i10) {
                    return false;
                }
                cVar.g0(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void g0(int i10, IInterface iInterface) {
        k1 k1Var;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        o.a(z10);
        synchronized (this.f15902m) {
            try {
                this.f15909t = i10;
                this.f15906q = iInterface;
                if (i10 == 1) {
                    v0 v0Var = this.f15908s;
                    if (v0Var != null) {
                        i iVar = this.f15899j;
                        String c10 = this.f15896g.c();
                        o.i(c10);
                        iVar.e(c10, this.f15896g.b(), this.f15896g.a(), v0Var, V(), this.f15896g.d());
                        this.f15908s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    v0 v0Var2 = this.f15908s;
                    if (!(v0Var2 == null || (k1Var = this.f15896g) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + k1Var.c() + " on " + k1Var.b());
                        i iVar2 = this.f15899j;
                        String c11 = this.f15896g.c();
                        o.i(c11);
                        iVar2.e(c11, this.f15896g.b(), this.f15896g.a(), v0Var2, V(), this.f15896g.d());
                        this.C.incrementAndGet();
                    }
                    v0 v0Var3 = new v0(this, this.C.get());
                    this.f15908s = v0Var3;
                    k1 k1Var2 = (this.f15909t != 3 || A() == null) ? new k1(F(), E(), false, i.a(), H()) : new k1(x().getPackageName(), A(), true, i.a(), false);
                    this.f15896g = k1Var2;
                    if (k1Var2.d()) {
                        if (f() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f15896g.c())));
                        }
                    }
                    i iVar3 = this.f15899j;
                    String c12 = this.f15896g.c();
                    o.i(c12);
                    if (!iVar3.f(new c1(c12, this.f15896g.b(), this.f15896g.a(), this.f15896g.d()), v0Var3, V(), v())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f15896g.c() + " on " + this.f15896g.b());
                        c0(16, (Bundle) null, this.C.get());
                    }
                } else if (i10 == 4) {
                    o.i(iInterface);
                    J(iInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public String A() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f15902m) {
            try {
                if (this.f15909t != 5) {
                    q();
                    iInterface = this.f15906q;
                    o.j(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    /* access modifiers changed from: protected */
    public abstract String D();

    /* access modifiers changed from: protected */
    public abstract String E();

    /* access modifiers changed from: protected */
    public String F() {
        return "com.google.android.gms";
    }

    public f G() {
        y0 y0Var = this.B;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f16051h;
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        return f() >= 211700000;
    }

    public boolean I() {
        return this.B != null;
    }

    /* access modifiers changed from: protected */
    public void J(IInterface iInterface) {
        this.f15892c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void K(p3.a aVar) {
        this.f15893d = aVar.c();
        this.f15894e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void L(int i10) {
        this.f15890a = i10;
        this.f15891b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f15901l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new w0(this, i10, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f15914y = str;
    }

    public void P(int i10) {
        Handler handler = this.f15901l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i10));
    }

    public boolean Q() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String V() {
        String str = this.f15913x;
        return str == null ? this.f15897h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f15902m) {
            z10 = this.f15909t == 4;
        }
        return z10;
    }

    public void c(C0213c cVar) {
        o.j(cVar, "Connection progress callbacks cannot be null.");
        this.f15905p = cVar;
        g0(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public final void c0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f15901l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new x0(this, i10, (Bundle) null)));
    }

    public void d(String str) {
        this.f15895f = str;
        l();
    }

    public boolean e() {
        return true;
    }

    public abstract int f();

    public boolean g() {
        boolean z10;
        synchronized (this.f15902m) {
            int i10 = this.f15909t;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public final p3.c[] h() {
        y0 y0Var = this.B;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f16049f;
    }

    public String i() {
        k1 k1Var;
        if (a() && (k1Var = this.f15896g) != null) {
            return k1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void j(j jVar, Set set) {
        Set set2 = set;
        Bundle z10 = z();
        int i10 = this.f15912w;
        String str = this.f15914y;
        int i11 = j.f14645a;
        Scope[] scopeArr = g.f15957s;
        Bundle bundle = new Bundle();
        p3.c[] cVarArr = g.f15958t;
        g gVar = r3;
        g gVar2 = new g(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        g gVar3 = gVar;
        gVar3.f15962h = this.f15897h.getPackageName();
        gVar3.f15965k = z10;
        if (set2 != null) {
            gVar3.f15964j = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (n()) {
            Account t10 = t();
            if (t10 == null) {
                t10 = new Account("<<default account>>", "com.google");
            }
            gVar3.f15966l = t10;
            if (jVar != null) {
                gVar3.f15963i = jVar.asBinder();
            }
        } else if (N()) {
            gVar3.f15966l = t();
        }
        gVar3.f15967m = E;
        gVar3.f15968n = u();
        if (Q()) {
            gVar3.f15971q = true;
        }
        try {
            synchronized (this.f15903n) {
                l lVar = this.f15904o;
                if (lVar != null) {
                    lVar.X(new u0(this, this.C.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            P(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            M(8, (IBinder) null, (Bundle) null, this.C.get());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String k() {
        return this.f15895f;
    }

    public void l() {
        this.C.incrementAndGet();
        synchronized (this.f15907r) {
            try {
                int size = this.f15907r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((t0) this.f15907r.get(i10)).d();
                }
                this.f15907r.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        synchronized (this.f15903n) {
            this.f15904o = null;
        }
        g0(1, (IInterface) null);
    }

    public void m(e eVar) {
        eVar.a();
    }

    public boolean n() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void q() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract IInterface r(IBinder iBinder);

    /* access modifiers changed from: protected */
    public boolean s() {
        return false;
    }

    public abstract Account t();

    public p3.c[] u() {
        return E;
    }

    /* access modifiers changed from: protected */
    public abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f15897h;
    }

    public int y() {
        return this.f15912w;
    }

    /* access modifiers changed from: protected */
    public Bundle z() {
        return new Bundle();
    }
}
