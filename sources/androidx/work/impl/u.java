package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import m1.g;
import m1.m;
import s1.w;
import t1.b;

public class u implements a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f4318l = m.i("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f4319a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f4320b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.work.a f4321c;

    /* renamed from: d  reason: collision with root package name */
    private b f4322d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f4323e;

    /* renamed from: f  reason: collision with root package name */
    private Map f4324f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map f4325g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map f4326h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set f4327i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List f4328j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final Object f4329k = new Object();

    public u(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase) {
        this.f4320b = context;
        this.f4321c = aVar;
        this.f4322d = bVar;
        this.f4323e = workDatabase;
    }

    private t0 f(String str) {
        t0 t0Var = (t0) this.f4324f.remove(str);
        boolean z10 = t0Var != null;
        if (!z10) {
            t0Var = (t0) this.f4325g.remove(str);
        }
        this.f4326h.remove(str);
        if (z10) {
            u();
        }
        return t0Var;
    }

    private t0 h(String str) {
        t0 t0Var = (t0) this.f4324f.get(str);
        return t0Var == null ? (t0) this.f4325g.get(str) : t0Var;
    }

    private static boolean i(String str, t0 t0Var, int i10) {
        if (t0Var != null) {
            t0Var.g(i10);
            m e10 = m.e();
            String str2 = f4318l;
            e10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        m e11 = m.e();
        String str3 = f4318l;
        e11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(r1.m mVar, boolean z10) {
        synchronized (this.f4329k) {
            try {
                for (f e10 : this.f4328j) {
                    e10.e(mVar, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ r1.u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f4323e.I().d(str));
        return this.f4323e.H().m(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(x5.a aVar, t0 t0Var) {
        boolean z10;
        try {
            z10 = ((Boolean) aVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        o(t0Var, z10);
    }

    private void o(t0 t0Var, boolean z10) {
        synchronized (this.f4329k) {
            try {
                r1.m d10 = t0Var.d();
                String b10 = d10.b();
                if (h(b10) == t0Var) {
                    f(b10);
                }
                m e10 = m.e();
                String str = f4318l;
                e10.a(str, getClass().getSimpleName() + " " + b10 + " executed; reschedule = " + z10);
                for (f e11 : this.f4328j) {
                    e11.e(d10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q(r1.m mVar, boolean z10) {
        this.f4322d.a().execute(new t(this, mVar, z10));
    }

    private void u() {
        synchronized (this.f4329k) {
            try {
                if (!(!this.f4324f.isEmpty())) {
                    this.f4320b.startService(androidx.work.impl.foreground.b.g(this.f4320b));
                    PowerManager.WakeLock wakeLock = this.f4319a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f4319a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, g gVar) {
        synchronized (this.f4329k) {
            try {
                m e10 = m.e();
                String str2 = f4318l;
                e10.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
                t0 t0Var = (t0) this.f4325g.remove(str);
                if (t0Var != null) {
                    if (this.f4319a == null) {
                        PowerManager.WakeLock b10 = w.b(this.f4320b, "ProcessorForegroundLck");
                        this.f4319a = b10;
                        b10.acquire();
                    }
                    this.f4324f.put(str, t0Var);
                    androidx.core.content.a.n(this.f4320b, androidx.work.impl.foreground.b.f(this.f4320b, t0Var.d(), gVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(f fVar) {
        synchronized (this.f4329k) {
            this.f4328j.add(fVar);
        }
    }

    public r1.u g(String str) {
        synchronized (this.f4329k) {
            try {
                t0 h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                r1.u e10 = h10.e();
                return e10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f4329k) {
            contains = this.f4327i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f4329k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public void p(f fVar) {
        synchronized (this.f4329k) {
            this.f4328j.remove(fVar);
        }
    }

    public boolean r(a0 a0Var) {
        return s(a0Var, (WorkerParameters.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(androidx.work.impl.a0 r13, androidx.work.WorkerParameters.a r14) {
        /*
            r12 = this;
            r1.m r0 = r13.a()
            java.lang.String r1 = r0.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f4323e
            androidx.work.impl.r r3 = new androidx.work.impl.r
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.z(r3)
            r8 = r2
            r1.u r8 = (r1.u) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            m1.m r13 = m1.m.e()
            java.lang.String r14 = f4318l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.k(r14, r1)
            r12.q(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f4329k
            monitor-enter(r10)
            boolean r3 = r12.k(r1)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0090
            java.util.Map r14 = r12.f4326h     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0088 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.a0 r1 = (androidx.work.impl.a0) r1     // Catch:{ all -> 0x0088 }
            r1.m r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r3 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r1 != r3) goto L_0x008b
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            m1.m r13 = m1.m.e()     // Catch:{ all -> 0x0088 }
            java.lang.String r14 = f4318l     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            r13.a(r14, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r13 = move-exception
            goto L_0x010b
        L_0x008b:
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x008e:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x0090:
            int r3 = r8.d()     // Catch:{ all -> 0x0088 }
            int r4 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r3 == r4) goto L_0x009f
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x009f:
            androidx.work.impl.t0$c r11 = new androidx.work.impl.t0$c     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = r12.f4320b     // Catch:{ all -> 0x0088 }
            androidx.work.a r4 = r12.f4321c     // Catch:{ all -> 0x0088 }
            t1.b r5 = r12.f4322d     // Catch:{ all -> 0x0088 }
            androidx.work.impl.WorkDatabase r7 = r12.f4323e     // Catch:{ all -> 0x0088 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.t0$c r14 = r11.c(r14)     // Catch:{ all -> 0x0088 }
            androidx.work.impl.t0 r14 = r14.b()     // Catch:{ all -> 0x0088 }
            x5.a r2 = r14.c()     // Catch:{ all -> 0x0088 }
            androidx.work.impl.s r3 = new androidx.work.impl.s     // Catch:{ all -> 0x0088 }
            r3.<init>(r12, r2, r14)     // Catch:{ all -> 0x0088 }
            t1.b r4 = r12.f4322d     // Catch:{ all -> 0x0088 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0088 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0088 }
            java.util.Map r2 = r12.f4325g     // Catch:{ all -> 0x0088 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0088 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0088 }
            r2.<init>()     // Catch:{ all -> 0x0088 }
            r2.add(r13)     // Catch:{ all -> 0x0088 }
            java.util.Map r13 = r12.f4326h     // Catch:{ all -> 0x0088 }
            r13.put(r1, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            t1.b r13 = r12.f4322d
            t1.a r13 = r13.b()
            r13.execute(r14)
            m1.m r13 = m1.m.e()
            java.lang.String r14 = f4318l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.a(r14, r0)
            r13 = 1
            return r13
        L_0x010b:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.u.s(androidx.work.impl.a0, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean t(String str, int i10) {
        t0 f10;
        synchronized (this.f4329k) {
            m e10 = m.e();
            String str2 = f4318l;
            e10.a(str2, "Processor cancelling " + str);
            this.f4327i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public boolean v(a0 a0Var, int i10) {
        t0 f10;
        String b10 = a0Var.a().b();
        synchronized (this.f4329k) {
            f10 = f(b10);
        }
        return i(b10, f10, i10);
    }

    public boolean w(a0 a0Var, int i10) {
        String b10 = a0Var.a().b();
        synchronized (this.f4329k) {
            try {
                if (this.f4324f.get(b10) != null) {
                    m e10 = m.e();
                    String str = f4318l;
                    e10.a(str, "Ignored stopWork. WorkerWrapper " + b10 + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f4326h.get(b10);
                if (set != null) {
                    if (set.contains(a0Var)) {
                        t0 f10 = f(b10);
                        return i(b10, f10, i10);
                    }
                }
                return false;
            } finally {
            }
        }
    }
}
