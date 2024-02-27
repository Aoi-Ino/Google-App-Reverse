package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m1.i;
import m1.m;
import m1.x;
import r1.u;
import r1.v;
import s1.a0;
import s1.b0;
import s1.p;
import s1.z;

public class t0 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    static final String f4286w = m.i("WorkerWrapper");

    /* renamed from: e  reason: collision with root package name */
    Context f4287e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4288f;

    /* renamed from: g  reason: collision with root package name */
    private WorkerParameters.a f4289g;

    /* renamed from: h  reason: collision with root package name */
    u f4290h;

    /* renamed from: i  reason: collision with root package name */
    androidx.work.c f4291i;

    /* renamed from: j  reason: collision with root package name */
    t1.b f4292j;

    /* renamed from: k  reason: collision with root package name */
    c.a f4293k = c.a.a();

    /* renamed from: l  reason: collision with root package name */
    private androidx.work.a f4294l;

    /* renamed from: m  reason: collision with root package name */
    private m1.b f4295m;

    /* renamed from: n  reason: collision with root package name */
    private androidx.work.impl.foreground.a f4296n;

    /* renamed from: o  reason: collision with root package name */
    private WorkDatabase f4297o;

    /* renamed from: p  reason: collision with root package name */
    private v f4298p;

    /* renamed from: q  reason: collision with root package name */
    private r1.b f4299q;

    /* renamed from: r  reason: collision with root package name */
    private List f4300r;

    /* renamed from: s  reason: collision with root package name */
    private String f4301s;

    /* renamed from: t  reason: collision with root package name */
    androidx.work.impl.utils.futures.c f4302t = androidx.work.impl.utils.futures.c.t();

    /* renamed from: u  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f4303u = androidx.work.impl.utils.futures.c.t();

    /* renamed from: v  reason: collision with root package name */
    private volatile int f4304v = -256;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ x5.a f4305e;

        a(x5.a aVar) {
            this.f4305e = aVar;
        }

        public void run() {
            if (!t0.this.f4303u.isCancelled()) {
                try {
                    this.f4305e.get();
                    m e10 = m.e();
                    String str = t0.f4286w;
                    e10.a(str, "Starting work for " + t0.this.f4290h.f15479c);
                    t0 t0Var = t0.this;
                    t0Var.f4303u.r(t0Var.f4291i.n());
                } catch (Throwable th2) {
                    t0.this.f4303u.q(th2);
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f4307e;

        b(String str) {
            this.f4307e = str;
        }

        public void run() {
            try {
                c.a aVar = (c.a) t0.this.f4303u.get();
                if (aVar == null) {
                    m e10 = m.e();
                    String str = t0.f4286w;
                    e10.c(str, t0.this.f4290h.f15479c + " returned a null result. Treating it as a failure.");
                } else {
                    m e11 = m.e();
                    String str2 = t0.f4286w;
                    e11.a(str2, t0.this.f4290h.f15479c + " returned a " + aVar + ".");
                    t0.this.f4293k = aVar;
                }
            } catch (CancellationException e12) {
                m e13 = m.e();
                String str3 = t0.f4286w;
                e13.g(str3, this.f4307e + " was cancelled", e12);
            } catch (InterruptedException e14) {
                e = e14;
                m e15 = m.e();
                String str4 = t0.f4286w;
                e15.d(str4, this.f4307e + " failed because it threw an exception/error", e);
            } catch (ExecutionException e16) {
                e = e16;
                m e152 = m.e();
                String str42 = t0.f4286w;
                e152.d(str42, this.f4307e + " failed because it threw an exception/error", e);
            } catch (Throwable th2) {
                t0.this.j();
                throw th2;
            }
            t0.this.j();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f4309a;

        /* renamed from: b  reason: collision with root package name */
        androidx.work.c f4310b;

        /* renamed from: c  reason: collision with root package name */
        androidx.work.impl.foreground.a f4311c;

        /* renamed from: d  reason: collision with root package name */
        t1.b f4312d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.a f4313e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f4314f;

        /* renamed from: g  reason: collision with root package name */
        u f4315g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final List f4316h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f4317i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, t1.b bVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, u uVar, List list) {
            this.f4309a = context.getApplicationContext();
            this.f4312d = bVar;
            this.f4311c = aVar2;
            this.f4313e = aVar;
            this.f4314f = workDatabase;
            this.f4315g = uVar;
            this.f4316h = list;
        }

        public t0 b() {
            return new t0(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f4317i = aVar;
            }
            return this;
        }
    }

    t0(c cVar) {
        this.f4287e = cVar.f4309a;
        this.f4292j = cVar.f4312d;
        this.f4296n = cVar.f4311c;
        u uVar = cVar.f4315g;
        this.f4290h = uVar;
        this.f4288f = uVar.f15477a;
        this.f4289g = cVar.f4317i;
        this.f4291i = cVar.f4310b;
        androidx.work.a aVar = cVar.f4313e;
        this.f4294l = aVar;
        this.f4295m = aVar.a();
        WorkDatabase workDatabase = cVar.f4314f;
        this.f4297o = workDatabase;
        this.f4298p = workDatabase.H();
        this.f4299q = this.f4297o.C();
        this.f4300r = cVar.f4316h;
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f4288f);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(c.a aVar) {
        if (aVar instanceof c.a.C0072c) {
            m e10 = m.e();
            String str = f4286w;
            e10.f(str, "Worker result SUCCESS for " + this.f4301s);
            if (!this.f4290h.k()) {
                q();
                return;
            }
        } else if (aVar instanceof c.a.b) {
            m e11 = m.e();
            String str2 = f4286w;
            e11.f(str2, "Worker result RETRY for " + this.f4301s);
            k();
            return;
        } else {
            m e12 = m.e();
            String str3 = f4286w;
            e12.f(str3, "Worker result FAILURE for " + this.f4301s);
            if (!this.f4290h.k()) {
                p();
                return;
            }
        }
        l();
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f4298p.k(str2) != x.CANCELLED) {
                this.f4298p.p(x.FAILED, str2);
            }
            linkedList.addAll(this.f4299q.d(str2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(x5.a aVar) {
        if (this.f4303u.isCancelled()) {
            aVar.cancel(true);
        }
    }

    private void k() {
        this.f4297o.e();
        try {
            this.f4298p.p(x.ENQUEUED, this.f4288f);
            this.f4298p.b(this.f4288f, this.f4295m.a());
            this.f4298p.v(this.f4288f, this.f4290h.f());
            this.f4298p.f(this.f4288f, -1);
            this.f4297o.A();
        } finally {
            this.f4297o.i();
            m(true);
        }
    }

    private void l() {
        this.f4297o.e();
        try {
            this.f4298p.b(this.f4288f, this.f4295m.a());
            this.f4298p.p(x.ENQUEUED, this.f4288f);
            this.f4298p.o(this.f4288f);
            this.f4298p.v(this.f4288f, this.f4290h.f());
            this.f4298p.d(this.f4288f);
            this.f4298p.f(this.f4288f, -1);
            this.f4297o.A();
        } finally {
            this.f4297o.i();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f4297o.e();
        try {
            if (!this.f4297o.H().e()) {
                p.c(this.f4287e, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f4298p.p(x.ENQUEUED, this.f4288f);
                this.f4298p.n(this.f4288f, this.f4304v);
                this.f4298p.f(this.f4288f, -1);
            }
            this.f4297o.A();
            this.f4297o.i();
            this.f4302t.p(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f4297o.i();
            throw th2;
        }
    }

    private void n() {
        boolean z10;
        x k10 = this.f4298p.k(this.f4288f);
        if (k10 == x.RUNNING) {
            m e10 = m.e();
            String str = f4286w;
            e10.a(str, "Status for " + this.f4288f + " is RUNNING; not doing any work and rescheduling for later execution");
            z10 = true;
        } else {
            m e11 = m.e();
            String str2 = f4286w;
            e11.a(str2, "Status for " + this.f4288f + " is " + k10 + " ; not doing any work");
            z10 = false;
        }
        m(z10);
    }

    private void o() {
        androidx.work.b a10;
        if (!r()) {
            this.f4297o.e();
            try {
                u uVar = this.f4290h;
                if (uVar.f15478b != x.ENQUEUED) {
                    n();
                    this.f4297o.A();
                    m e10 = m.e();
                    String str = f4286w;
                    e10.a(str, this.f4290h.f15479c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((uVar.k() || this.f4290h.j()) && this.f4295m.a() < this.f4290h.a()) {
                    m.e().a(f4286w, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f4290h.f15479c}));
                    m(true);
                    this.f4297o.A();
                    this.f4297o.i();
                } else {
                    this.f4297o.A();
                    this.f4297o.i();
                    if (this.f4290h.k()) {
                        a10 = this.f4290h.f15481e;
                    } else {
                        i b10 = this.f4294l.f().b(this.f4290h.f15480d);
                        if (b10 == null) {
                            m e11 = m.e();
                            String str2 = f4286w;
                            e11.c(str2, "Could not create Input Merger " + this.f4290h.f15480d);
                            p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f4290h.f15481e);
                        arrayList.addAll(this.f4298p.r(this.f4288f));
                        a10 = b10.a(arrayList);
                    }
                    androidx.work.b bVar = a10;
                    UUID fromString = UUID.fromString(this.f4288f);
                    List list = this.f4300r;
                    WorkerParameters.a aVar = this.f4289g;
                    u uVar2 = this.f4290h;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, bVar, list, aVar, uVar2.f15487k, uVar2.d(), this.f4294l.d(), this.f4292j, this.f4294l.n(), new b0(this.f4297o, this.f4292j), new a0(this.f4297o, this.f4296n, this.f4292j));
                    if (this.f4291i == null) {
                        this.f4291i = this.f4294l.n().b(this.f4287e, this.f4290h.f15479c, workerParameters);
                    }
                    androidx.work.c cVar = this.f4291i;
                    if (cVar == null) {
                        m e12 = m.e();
                        String str3 = f4286w;
                        e12.c(str3, "Could not create Worker " + this.f4290h.f15479c);
                        p();
                    } else if (cVar.k()) {
                        m e13 = m.e();
                        String str4 = f4286w;
                        e13.c(str4, "Received an already-used Worker " + this.f4290h.f15479c + "; Worker Factory should return new instances");
                        p();
                    } else {
                        this.f4291i.m();
                        if (!s()) {
                            n();
                        } else if (!r()) {
                            z zVar = new z(this.f4287e, this.f4290h, this.f4291i, workerParameters.b(), this.f4292j);
                            this.f4292j.a().execute(zVar);
                            x5.a b11 = zVar.b();
                            this.f4303u.a(new s0(this, b11), new s1.v());
                            b11.a(new a(b11), this.f4292j.a());
                            this.f4303u.a(new b(this.f4301s), this.f4292j.b());
                        }
                    }
                }
            } finally {
                this.f4297o.i();
            }
        }
    }

    private void q() {
        this.f4297o.e();
        try {
            this.f4298p.p(x.SUCCEEDED, this.f4288f);
            this.f4298p.y(this.f4288f, ((c.a.C0072c) this.f4293k).e());
            long a10 = this.f4295m.a();
            for (String str : this.f4299q.d(this.f4288f)) {
                if (this.f4298p.k(str) == x.BLOCKED && this.f4299q.a(str)) {
                    m e10 = m.e();
                    String str2 = f4286w;
                    e10.f(str2, "Setting status to enqueued for " + str);
                    this.f4298p.p(x.ENQUEUED, str);
                    this.f4298p.b(str, a10);
                }
            }
            this.f4297o.A();
            this.f4297o.i();
            m(false);
        } catch (Throwable th2) {
            this.f4297o.i();
            m(false);
            throw th2;
        }
    }

    private boolean r() {
        if (this.f4304v == -256) {
            return false;
        }
        m e10 = m.e();
        String str = f4286w;
        e10.a(str, "Work interrupted for " + this.f4301s);
        x k10 = this.f4298p.k(this.f4288f);
        if (k10 == null) {
            m(false);
        } else {
            m(!k10.b());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f4297o.e();
        try {
            if (this.f4298p.k(this.f4288f) == x.ENQUEUED) {
                this.f4298p.p(x.RUNNING, this.f4288f);
                this.f4298p.s(this.f4288f);
                this.f4298p.n(this.f4288f, -256);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4297o.A();
            this.f4297o.i();
            return z10;
        } catch (Throwable th2) {
            this.f4297o.i();
            throw th2;
        }
    }

    public x5.a c() {
        return this.f4302t;
    }

    public r1.m d() {
        return r1.x.a(this.f4290h);
    }

    public u e() {
        return this.f4290h;
    }

    public void g(int i10) {
        this.f4304v = i10;
        r();
        this.f4303u.cancel(true);
        if (this.f4291i == null || !this.f4303u.isCancelled()) {
            m.e().a(f4286w, "WorkSpec " + this.f4290h + " is already done. Not interrupting.");
            return;
        }
        this.f4291i.o(i10);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!r()) {
            this.f4297o.e();
            try {
                x k10 = this.f4298p.k(this.f4288f);
                this.f4297o.G().a(this.f4288f);
                if (k10 == null) {
                    m(false);
                } else if (k10 == x.RUNNING) {
                    f(this.f4293k);
                } else if (!k10.b()) {
                    this.f4304v = -512;
                    k();
                }
                this.f4297o.A();
                this.f4297o.i();
            } catch (Throwable th2) {
                this.f4297o.i();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f4297o.e();
        try {
            h(this.f4288f);
            androidx.work.b e10 = ((c.a.C0071a) this.f4293k).e();
            this.f4298p.v(this.f4288f, this.f4290h.f());
            this.f4298p.y(this.f4288f, e10);
            this.f4297o.A();
        } finally {
            this.f4297o.i();
            m(false);
        }
    }

    public void run() {
        this.f4301s = b(this.f4300r);
        o();
    }
}
