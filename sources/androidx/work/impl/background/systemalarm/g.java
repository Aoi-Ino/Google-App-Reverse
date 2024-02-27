package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.b0;
import androidx.work.impl.f;
import androidx.work.impl.n0;
import androidx.work.impl.o0;
import androidx.work.impl.p0;
import androidx.work.impl.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m1.m;
import s1.c0;
import s1.w;

public class g implements f {

    /* renamed from: p  reason: collision with root package name */
    static final String f4165p = m.i("SystemAlarmDispatcher");

    /* renamed from: e  reason: collision with root package name */
    final Context f4166e;

    /* renamed from: f  reason: collision with root package name */
    final t1.b f4167f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f4168g;

    /* renamed from: h  reason: collision with root package name */
    private final u f4169h;

    /* renamed from: i  reason: collision with root package name */
    private final p0 f4170i;

    /* renamed from: j  reason: collision with root package name */
    final b f4171j;

    /* renamed from: k  reason: collision with root package name */
    final List f4172k;

    /* renamed from: l  reason: collision with root package name */
    Intent f4173l;

    /* renamed from: m  reason: collision with root package name */
    private c f4174m;

    /* renamed from: n  reason: collision with root package name */
    private b0 f4175n;

    /* renamed from: o  reason: collision with root package name */
    private final n0 f4176o;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Executor a10;
            d dVar;
            synchronized (g.this.f4172k) {
                g gVar = g.this;
                gVar.f4173l = (Intent) gVar.f4172k.get(0);
            }
            Intent intent = g.this.f4173l;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f4173l.getIntExtra("KEY_START_ID", 0);
                m e10 = m.e();
                String str = g.f4165p;
                e10.a(str, "Processing command " + g.this.f4173l + ", " + intExtra);
                Context context = g.this.f4166e;
                PowerManager.WakeLock b10 = w.b(context, action + " (" + intExtra + ")");
                try {
                    m e11 = m.e();
                    e11.a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    g gVar2 = g.this;
                    gVar2.f4171j.o(gVar2.f4173l, intExtra, gVar2);
                    m e12 = m.e();
                    e12.a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = g.this.f4167f.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    m e13 = m.e();
                    String str2 = g.f4165p;
                    e13.a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    g.this.f4167f.a().execute(new d(g.this));
                    throw th2;
                }
                a10.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final g f4178e;

        /* renamed from: f  reason: collision with root package name */
        private final Intent f4179f;

        /* renamed from: g  reason: collision with root package name */
        private final int f4180g;

        b(g gVar, Intent intent, int i10) {
            this.f4178e = gVar;
            this.f4179f = intent;
            this.f4180g = i10;
        }

        public void run() {
            this.f4178e.a(this.f4179f, this.f4180g);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final g f4181e;

        d(g gVar) {
            this.f4181e = gVar;
        }

        public void run() {
            this.f4181e.c();
        }
    }

    g(Context context) {
        this(context, (u) null, (p0) null, (n0) null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        b();
        synchronized (this.f4172k) {
            try {
                for (Intent action : this.f4172k) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b10 = w.b(this.f4166e, "ProcessCommand");
        try {
            b10.acquire();
            this.f4170i.o().c(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        m e10 = m.e();
        String str = f4165p;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f4172k) {
                try {
                    boolean z10 = !this.f4172k.isEmpty();
                    this.f4172k.add(intent);
                    if (!z10) {
                        l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        m e10 = m.e();
        String str = f4165p;
        e10.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.f4172k) {
            try {
                if (this.f4173l != null) {
                    m e11 = m.e();
                    e11.a(str, "Removing command " + this.f4173l);
                    if (((Intent) this.f4172k.remove(0)).equals(this.f4173l)) {
                        this.f4173l = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                t1.a b10 = this.f4167f.b();
                if (!this.f4171j.n() && this.f4172k.isEmpty() && !b10.s0()) {
                    m.e().a(str, "No more commands & intents.");
                    c cVar = this.f4174m;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.f4172k.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public u d() {
        return this.f4169h;
    }

    public void e(r1.m mVar, boolean z10) {
        this.f4167f.a().execute(new b(this, b.c(this.f4166e, mVar, z10), 0));
    }

    /* access modifiers changed from: package-private */
    public t1.b f() {
        return this.f4167f;
    }

    /* access modifiers changed from: package-private */
    public p0 g() {
        return this.f4170i;
    }

    /* access modifiers changed from: package-private */
    public c0 h() {
        return this.f4168g;
    }

    /* access modifiers changed from: package-private */
    public n0 i() {
        return this.f4176o;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        m.e().a(f4165p, "Destroying SystemAlarmDispatcher");
        this.f4169h.p(this);
        this.f4174m = null;
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f4174m != null) {
            m.e().c(f4165p, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f4174m = cVar;
        }
    }

    g(Context context, u uVar, p0 p0Var, n0 n0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f4166e = applicationContext;
        this.f4175n = new b0();
        p0Var = p0Var == null ? p0.i(context) : p0Var;
        this.f4170i = p0Var;
        this.f4171j = new b(applicationContext, p0Var.g().a(), this.f4175n);
        this.f4168g = new c0(p0Var.g().k());
        uVar = uVar == null ? p0Var.k() : uVar;
        this.f4169h = uVar;
        t1.b o10 = p0Var.o();
        this.f4167f = o10;
        this.f4176o = n0Var == null ? new o0(uVar, o10) : n0Var;
        uVar.e(this);
        this.f4172k = new ArrayList();
        this.f4173l = null;
    }
}
