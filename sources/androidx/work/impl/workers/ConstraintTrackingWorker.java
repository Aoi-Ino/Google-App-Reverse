package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.p0;
import cm.l;
import java.util.concurrent.CancellationException;
import lm.a0;
import lm.k1;
import m1.m;
import o1.b;
import o1.d;
import o1.e;
import o1.f;
import pl.x;
import q1.n;
import r1.u;
import r1.v;
import u1.b;
import x5.a;

public final class ConstraintTrackingWorker extends c implements d {

    /* renamed from: i  reason: collision with root package name */
    private final WorkerParameters f4367i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f4368j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f4369k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f4370l = androidx.work.impl.utils.futures.c.t();

    /* renamed from: m  reason: collision with root package name */
    private c f4371m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "appContext");
        l.f(workerParameters, "workerParameters");
        this.f4367i = workerParameters;
    }

    private final void s() {
        if (!this.f4370l.isCancelled()) {
            String m10 = f().m("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            m e10 = m.e();
            l.e(e10, "get()");
            if (m10 == null || m10.length() == 0) {
                e10.c(u1.d.f16882a, "No worker to delegate to.");
            } else {
                c b10 = i().b(a(), m10, this.f4367i);
                this.f4371m = b10;
                if (b10 == null) {
                    e10.a(u1.d.f16882a, "No worker to delegate to.");
                } else {
                    p0 i10 = p0.i(a());
                    l.e(i10, "getInstance(applicationContext)");
                    v H = i10.n().H();
                    String uuid = e().toString();
                    l.e(uuid, "id.toString()");
                    u m11 = H.m(uuid);
                    if (m11 != null) {
                        n m12 = i10.m();
                        l.e(m12, "workManagerImpl.trackers");
                        e eVar = new e(m12);
                        a0 d10 = i10.o().d();
                        l.e(d10, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                        this.f4370l.a(new b(f.b(eVar, m11, d10, this)), new s1.v());
                        if (eVar.a(m11)) {
                            String a10 = u1.d.f16882a;
                            e10.a(a10, "Constraints met for delegate " + m10);
                            try {
                                c cVar = this.f4371m;
                                l.c(cVar);
                                a n10 = cVar.n();
                                l.e(n10, "delegate!!.startWork()");
                                n10.a(new u1.c(this, n10), c());
                                return;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } else {
                            String a11 = u1.d.f16882a;
                            e10.a(a11, "Constraints not met for delegate " + m10 + ". Requesting retry.");
                            androidx.work.impl.utils.futures.c cVar2 = this.f4370l;
                            l.e(cVar2, "future");
                            boolean unused = u1.d.e(cVar2);
                            return;
                        }
                    }
                }
            }
            androidx.work.impl.utils.futures.c cVar3 = this.f4370l;
            l.e(cVar3, "future");
            boolean unused2 = u1.d.d(cVar3);
        }
    }

    /* access modifiers changed from: private */
    public static final void t(k1 k1Var) {
        l.f(k1Var, "$job");
        k1Var.e((CancellationException) null);
    }

    /* access modifiers changed from: private */
    public static final void u(ConstraintTrackingWorker constraintTrackingWorker, a aVar) {
        l.f(constraintTrackingWorker, "this$0");
        l.f(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f4368j) {
            try {
                if (constraintTrackingWorker.f4369k) {
                    androidx.work.impl.utils.futures.c cVar = constraintTrackingWorker.f4370l;
                    l.e(cVar, "future");
                    boolean unused = u1.d.e(cVar);
                } else {
                    constraintTrackingWorker.f4370l.r(aVar);
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void v(ConstraintTrackingWorker constraintTrackingWorker) {
        l.f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.s();
    }

    public void b(u uVar, o1.b bVar) {
        l.f(uVar, "workSpec");
        l.f(bVar, "state");
        m e10 = m.e();
        String a10 = u1.d.f16882a;
        e10.a(a10, "Constraints changed for " + uVar);
        if (bVar instanceof b.C0193b) {
            synchronized (this.f4368j) {
                this.f4369k = true;
                x xVar = x.f30437a;
            }
        }
    }

    public void l() {
        super.l();
        c cVar = this.f4371m;
        if (cVar != null && !cVar.j()) {
            cVar.o(Build.VERSION.SDK_INT >= 31 ? g() : 0);
        }
    }

    public a n() {
        c().execute(new u1.a(this));
        androidx.work.impl.utils.futures.c cVar = this.f4370l;
        l.e(cVar, "future");
        return cVar;
    }
}
