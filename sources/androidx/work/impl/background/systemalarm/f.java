package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.a0;
import androidx.work.impl.background.systemalarm.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import lm.k1;
import m1.m;
import o1.b;
import o1.d;
import o1.e;
import q1.n;
import r1.u;
import s1.c0;
import s1.w;

public class f implements d, c0.a {

    /* renamed from: s  reason: collision with root package name */
    private static final String f4150s = m.i("DelayMetCommandHandler");

    /* renamed from: e  reason: collision with root package name */
    private final Context f4151e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4152f;

    /* renamed from: g  reason: collision with root package name */
    private final r1.m f4153g;

    /* renamed from: h  reason: collision with root package name */
    private final g f4154h;

    /* renamed from: i  reason: collision with root package name */
    private final e f4155i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f4156j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private int f4157k = 0;

    /* renamed from: l  reason: collision with root package name */
    private final Executor f4158l;

    /* renamed from: m  reason: collision with root package name */
    private final Executor f4159m;

    /* renamed from: n  reason: collision with root package name */
    private PowerManager.WakeLock f4160n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4161o = false;

    /* renamed from: p  reason: collision with root package name */
    private final a0 f4162p;

    /* renamed from: q  reason: collision with root package name */
    private final lm.a0 f4163q;

    /* renamed from: r  reason: collision with root package name */
    private volatile k1 f4164r;

    f(Context context, int i10, g gVar, a0 a0Var) {
        this.f4151e = context;
        this.f4152f = i10;
        this.f4154h = gVar;
        this.f4153g = a0Var.a();
        this.f4162p = a0Var;
        n m10 = gVar.g().m();
        this.f4158l = gVar.f().b();
        this.f4159m = gVar.f().a();
        this.f4163q = gVar.f().d();
        this.f4155i = new e(m10);
    }

    private void e() {
        synchronized (this.f4156j) {
            try {
                if (this.f4164r != null) {
                    this.f4164r.e((CancellationException) null);
                }
                this.f4154h.h().b(this.f4153g);
                PowerManager.WakeLock wakeLock = this.f4160n;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m e10 = m.e();
                    String str = f4150s;
                    e10.a(str, "Releasing wakelock " + this.f4160n + "for WorkSpec " + this.f4153g);
                    this.f4160n.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f4157k == 0) {
            this.f4157k = 1;
            m e10 = m.e();
            String str = f4150s;
            e10.a(str, "onAllConstraintsMet for " + this.f4153g);
            if (this.f4154h.d().r(this.f4162p)) {
                this.f4154h.h().a(this.f4153g, 600000, this);
            } else {
                e();
            }
        } else {
            m e11 = m.e();
            String str2 = f4150s;
            e11.a(str2, "Already started work for " + this.f4153g);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        StringBuilder sb2;
        String str;
        m mVar;
        String b10 = this.f4153g.b();
        if (this.f4157k < 2) {
            this.f4157k = 2;
            m e10 = m.e();
            str = f4150s;
            e10.a(str, "Stopping work for WorkSpec " + b10);
            this.f4159m.execute(new g.b(this.f4154h, b.f(this.f4151e, this.f4153g), this.f4152f));
            if (this.f4154h.d().k(this.f4153g.b())) {
                m e11 = m.e();
                e11.a(str, "WorkSpec " + b10 + " needs to be rescheduled");
                this.f4159m.execute(new g.b(this.f4154h, b.d(this.f4151e, this.f4153g), this.f4152f));
                return;
            }
            mVar = m.e();
            sb2 = new StringBuilder();
            sb2.append("Processor does not have WorkSpec ");
            sb2.append(b10);
            b10 = ". No need to reschedule";
        } else {
            mVar = m.e();
            str = f4150s;
            sb2 = new StringBuilder();
            sb2.append("Already stopped work for ");
        }
        sb2.append(b10);
        mVar.a(str, sb2.toString());
    }

    public void a(r1.m mVar) {
        m e10 = m.e();
        String str = f4150s;
        e10.a(str, "Exceeded time limits on execution for " + mVar);
        this.f4158l.execute(new d(this));
    }

    public void b(u uVar, b bVar) {
        Executor executor;
        Runnable dVar;
        if (bVar instanceof b.a) {
            executor = this.f4158l;
            dVar = new e(this);
        } else {
            executor = this.f4158l;
            dVar = new d(this);
        }
        executor.execute(dVar);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String b10 = this.f4153g.b();
        Context context = this.f4151e;
        this.f4160n = w.b(context, b10 + " (" + this.f4152f + ")");
        m e10 = m.e();
        String str = f4150s;
        e10.a(str, "Acquiring wakelock " + this.f4160n + "for WorkSpec " + b10);
        this.f4160n.acquire();
        u m10 = this.f4154h.g().n().H().m(b10);
        if (m10 == null) {
            this.f4158l.execute(new d(this));
            return;
        }
        boolean i10 = m10.i();
        this.f4161o = i10;
        if (!i10) {
            m e11 = m.e();
            e11.a(str, "No constraints for " + b10);
            this.f4158l.execute(new e(this));
            return;
        }
        this.f4164r = o1.f.b(this.f4155i, m10, this.f4163q, this);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        m e10 = m.e();
        String str = f4150s;
        e10.a(str, "onExecuted " + this.f4153g + ", " + z10);
        e();
        if (z10) {
            this.f4159m.execute(new g.b(this.f4154h, b.d(this.f4151e, this.f4153g), this.f4152f));
        }
        if (this.f4161o) {
            this.f4159m.execute(new g.b(this.f4154h, b.a(this.f4151e), this.f4152f));
        }
    }
}
