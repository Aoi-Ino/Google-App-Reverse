package n1;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.f;
import androidx.work.impl.n0;
import androidx.work.impl.u;
import androidx.work.impl.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lm.k1;
import m1.m;
import o1.b;
import o1.d;
import o1.e;
import q1.n;
import r1.x;
import s1.r;

public class b implements w, d, f {

    /* renamed from: s  reason: collision with root package name */
    private static final String f14093s = m.i("GreedyScheduler");

    /* renamed from: e  reason: collision with root package name */
    private final Context f14094e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f14095f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private a f14096g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14097h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f14098i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final b0 f14099j = new b0();

    /* renamed from: k  reason: collision with root package name */
    private final u f14100k;

    /* renamed from: l  reason: collision with root package name */
    private final n0 f14101l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.work.a f14102m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f14103n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    Boolean f14104o;

    /* renamed from: p  reason: collision with root package name */
    private final e f14105p;

    /* renamed from: q  reason: collision with root package name */
    private final t1.b f14106q;

    /* renamed from: r  reason: collision with root package name */
    private final d f14107r;

    /* renamed from: n1.b$b  reason: collision with other inner class name */
    private static class C0186b {

        /* renamed from: a  reason: collision with root package name */
        final int f14108a;

        /* renamed from: b  reason: collision with root package name */
        final long f14109b;

        private C0186b(int i10, long j10) {
            this.f14108a = i10;
            this.f14109b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, u uVar, n0 n0Var, t1.b bVar) {
        this.f14094e = context;
        m1.u k10 = aVar.k();
        this.f14096g = new a(this, k10, aVar.a());
        this.f14107r = new d(k10, n0Var);
        this.f14106q = bVar;
        this.f14105p = new e(nVar);
        this.f14102m = aVar;
        this.f14100k = uVar;
        this.f14101l = n0Var;
    }

    private void f() {
        this.f14104o = Boolean.valueOf(r.b(this.f14094e, this.f14102m));
    }

    private void g() {
        if (!this.f14097h) {
            this.f14100k.e(this);
            this.f14097h = true;
        }
    }

    private void h(r1.m mVar) {
        k1 k1Var;
        synchronized (this.f14098i) {
            k1Var = (k1) this.f14095f.remove(mVar);
        }
        if (k1Var != null) {
            m e10 = m.e();
            String str = f14093s;
            e10.a(str, "Stopping tracking for " + mVar);
            k1Var.e((CancellationException) null);
        }
    }

    private long i(r1.u uVar) {
        long max;
        synchronized (this.f14098i) {
            try {
                r1.m a10 = x.a(uVar);
                C0186b bVar = (C0186b) this.f14103n.get(a10);
                if (bVar == null) {
                    bVar = new C0186b(uVar.f15487k, this.f14102m.a().a());
                    this.f14103n.put(a10, bVar);
                }
                max = bVar.f14109b + (((long) Math.max((uVar.f15487k - bVar.f14108a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }

    public void a(String str) {
        if (this.f14104o == null) {
            f();
        }
        if (!this.f14104o.booleanValue()) {
            m.e().f(f14093s, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        m e10 = m.e();
        String str2 = f14093s;
        e10.a(str2, "Cancelling work ID " + str);
        a aVar = this.f14096g;
        if (aVar != null) {
            aVar.b(str);
        }
        for (a0 a0Var : this.f14099j.c(str)) {
            this.f14107r.b(a0Var);
            this.f14101l.e(a0Var);
        }
    }

    public void b(r1.u uVar, o1.b bVar) {
        r1.m a10 = x.a(uVar);
        if (!(bVar instanceof b.a)) {
            m e10 = m.e();
            String str = f14093s;
            e10.a(str, "Constraints not met: Cancelling work ID " + a10);
            a0 b10 = this.f14099j.b(a10);
            if (b10 != null) {
                this.f14107r.b(b10);
                this.f14101l.d(b10, ((b.C0193b) bVar).a());
            }
        } else if (!this.f14099j.a(a10)) {
            m e11 = m.e();
            String str2 = f14093s;
            e11.a(str2, "Constraints met: Scheduling work ID " + a10);
            a0 d10 = this.f14099j.d(a10);
            this.f14107r.c(d10);
            this.f14101l.b(d10);
        }
    }

    public void c(r1.u... uVarArr) {
        m e10;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f14104o == null) {
            f();
        }
        if (!this.f14104o.booleanValue()) {
            m.e().f(f14093s, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<r1.u> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        for (r1.u uVar : uVarArr) {
            if (!this.f14099j.a(x.a(uVar))) {
                long max = Math.max(uVar.a(), i(uVar));
                long a10 = this.f14102m.a().a();
                if (uVar.f15478b == m1.x.ENQUEUED) {
                    if (a10 < max) {
                        a aVar = this.f14096g;
                        if (aVar != null) {
                            aVar.a(uVar, max);
                        }
                    } else if (uVar.i()) {
                        if (uVar.f15486j.h()) {
                            e10 = m.e();
                            str = f14093s;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(uVar);
                            str2 = ". Requires device idle.";
                        } else if (uVar.f15486j.e()) {
                            e10 = m.e();
                            str = f14093s;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(uVar);
                            str2 = ". Requires ContentUri triggers.";
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f15477a);
                        }
                        sb2.append(str2);
                        e10.a(str, sb2.toString());
                    } else if (!this.f14099j.a(x.a(uVar))) {
                        m.e().a(f14093s, "Starting work for " + uVar.f15477a);
                        a0 e11 = this.f14099j.e(uVar);
                        this.f14107r.c(e11);
                        this.f14101l.b(e11);
                    }
                }
            }
        }
        synchronized (this.f14098i) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    m.e().a(f14093s, "Starting tracking for " + join);
                    for (r1.u uVar2 : hashSet) {
                        r1.m a11 = x.a(uVar2);
                        if (!this.f14095f.containsKey(a11)) {
                            this.f14095f.put(a11, o1.f.b(this.f14105p, uVar2, this.f14106q.d(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public boolean d() {
        return false;
    }

    public void e(r1.m mVar, boolean z10) {
        a0 b10 = this.f14099j.b(mVar);
        if (b10 != null) {
            this.f14107r.b(b10);
        }
        h(mVar);
        if (!z10) {
            synchronized (this.f14098i) {
                this.f14103n.remove(mVar);
            }
        }
    }
}
