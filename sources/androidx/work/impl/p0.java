package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.List;
import java.util.UUID;
import m1.m;
import m1.y;
import q1.n;
import s1.q;
import s1.u;
import t1.b;

public class p0 extends y {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4257k = m.i("WorkManagerImpl");

    /* renamed from: l  reason: collision with root package name */
    private static p0 f4258l = null;

    /* renamed from: m  reason: collision with root package name */
    private static p0 f4259m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f4260n = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f4261a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.a f4262b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f4263c;

    /* renamed from: d  reason: collision with root package name */
    private b f4264d;

    /* renamed from: e  reason: collision with root package name */
    private List f4265e;

    /* renamed from: f  reason: collision with root package name */
    private u f4266f;

    /* renamed from: g  reason: collision with root package name */
    private q f4267g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4268h = false;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f4269i;

    /* renamed from: j  reason: collision with root package name */
    private final n f4270j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public p0(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, List list, u uVar, n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a.a(applicationContext)) {
            m.h(new m.a(aVar.j()));
            this.f4261a = applicationContext;
            this.f4264d = bVar;
            this.f4263c = workDatabase;
            this.f4266f = uVar;
            this.f4270j = nVar;
            this.f4262b = aVar;
            this.f4265e = list;
            this.f4267g = new q(workDatabase);
            z.g(list, this.f4266f, bVar.b(), this.f4263c, aVar);
            this.f4264d.c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static void d(Context context, androidx.work.a aVar) {
        synchronized (f4260n) {
            try {
                p0 p0Var = f4258l;
                if (p0Var != null) {
                    if (f4259m != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (p0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f4259m == null) {
                        f4259m = q0.c(applicationContext, aVar);
                    }
                    f4258l = f4259m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static p0 h() {
        synchronized (f4260n) {
            try {
                p0 p0Var = f4258l;
                if (p0Var != null) {
                    return p0Var;
                }
                p0 p0Var2 = f4259m;
                return p0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static p0 i(Context context) {
        p0 h10;
        synchronized (f4260n) {
            try {
                h10 = h();
                if (h10 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h10;
    }

    public m1.q a(List list) {
        if (!list.isEmpty()) {
            return new c0(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public m1.q e(UUID uuid) {
        s1.b b10 = s1.b.b(uuid, this);
        this.f4264d.c(b10);
        return b10.d();
    }

    public Context f() {
        return this.f4261a;
    }

    public androidx.work.a g() {
        return this.f4262b;
    }

    public q j() {
        return this.f4267g;
    }

    public u k() {
        return this.f4266f;
    }

    public List l() {
        return this.f4265e;
    }

    public n m() {
        return this.f4270j;
    }

    public WorkDatabase n() {
        return this.f4263c;
    }

    public b o() {
        return this.f4264d;
    }

    public void p() {
        synchronized (f4260n) {
            try {
                this.f4268h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f4269i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f4269i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q() {
        g.b(f());
        n().H().z();
        z.h(g(), n(), l());
    }

    public void r(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f4260n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f4269i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f4269i = pendingResult;
                if (this.f4268h) {
                    pendingResult.finish();
                    this.f4269i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(r1.m mVar) {
        this.f4264d.c(new u(this.f4266f, new a0(mVar), true));
    }
}
