package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p3.c;
import p4.j;
import q3.a;
import q3.d;
import q3.e;
import q3.g;
import r3.a0;
import r3.b;
import r3.r;
import r3.t;
import s3.n;
import s3.o;

public final class q implements e.a, e.b {

    /* renamed from: b  reason: collision with root package name */
    private final Queue f5328b = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a.f f5329c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final b f5330d;

    /* renamed from: e  reason: collision with root package name */
    private final j f5331e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f5332f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Map f5333g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final int f5334h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f5335i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5336j;

    /* renamed from: k  reason: collision with root package name */
    private final List f5337k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private p3.a f5338l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f5339m = 0;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ b f5340n;

    public q(b bVar, d dVar) {
        this.f5340n = bVar;
        a.f j10 = dVar.j(bVar.f5271p.getLooper(), this);
        this.f5329c = j10;
        this.f5330d = dVar.g();
        this.f5331e = new j();
        this.f5334h = dVar.i();
        if (j10.n()) {
            this.f5335i = dVar.k(bVar.f5262g, bVar.f5271p);
        } else {
            this.f5335i = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(q qVar, r rVar) {
        if (!qVar.f5337k.contains(rVar) || qVar.f5336j) {
            return;
        }
        if (!qVar.f5329c.a()) {
            qVar.D();
        } else {
            qVar.h();
        }
    }

    static /* bridge */ /* synthetic */ void B(q qVar, r rVar) {
        c[] g10;
        if (qVar.f5337k.remove(rVar)) {
            qVar.f5340n.f5271p.removeMessages(15, rVar);
            qVar.f5340n.f5271p.removeMessages(16, rVar);
            c a10 = rVar.f5342b;
            ArrayList arrayList = new ArrayList(qVar.f5328b.size());
            for (e0 e0Var : qVar.f5328b) {
                if ((e0Var instanceof r) && (g10 = ((r) e0Var).g(qVar)) != null && w3.b.b(g10, a10)) {
                    arrayList.add(e0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e0 e0Var2 = (e0) arrayList.get(i10);
                qVar.f5328b.remove(e0Var2);
                e0Var2.b(new g(a10));
            }
        }
    }

    private final c b(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] h10 = this.f5329c.h();
            if (h10 == null) {
                h10 = new c[0];
            }
            o.a aVar = new o.a(r3);
            for (c cVar : h10) {
                aVar.put(cVar.c(), Long.valueOf(cVar.d()));
            }
            for (c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.c());
                if (l10 == null || l10.longValue() < cVar2.d()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void e(p3.a aVar) {
        Iterator it = this.f5332f.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (n.a(aVar, p3.a.f14623i)) {
                this.f5329c.i();
            }
            throw null;
        }
        this.f5332f.clear();
    }

    /* access modifiers changed from: private */
    public final void f(Status status) {
        o.d(this.f5340n.f5271p);
        g(status, (Exception) null, false);
    }

    private final void g(Status status, Exception exc, boolean z10) {
        o.d(this.f5340n.f5271p);
        boolean z11 = true;
        boolean z12 = status == null;
        if (exc != null) {
            z11 = false;
        }
        if (z12 != z11) {
            Iterator it = this.f5328b.iterator();
            while (it.hasNext()) {
                e0 e0Var = (e0) it.next();
                if (!z10 || e0Var.f5287a == 2) {
                    if (status != null) {
                        e0Var.a(status);
                    } else {
                        e0Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void h() {
        ArrayList arrayList = new ArrayList(this.f5328b);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e0 e0Var = (e0) arrayList.get(i10);
            if (this.f5329c.a()) {
                if (o(e0Var)) {
                    this.f5328b.remove(e0Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void i() {
        C();
        e(p3.a.f14623i);
        n();
        Iterator it = this.f5333g.values().iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (b(tVar.f15575a.c()) == null) {
                try {
                    tVar.f15575a.d(this.f5329c, new j());
                } catch (DeadObjectException unused) {
                    c(3);
                    this.f5329c.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        h();
        l();
    }

    /* access modifiers changed from: private */
    public final void k(int i10) {
        C();
        this.f5336j = true;
        this.f5331e.c(i10, this.f5329c.k());
        b bVar = this.f5340n;
        bVar.f5271p.sendMessageDelayed(Message.obtain(bVar.f5271p, 9, this.f5330d), this.f5340n.f5256a);
        b bVar2 = this.f5340n;
        bVar2.f5271p.sendMessageDelayed(Message.obtain(bVar2.f5271p, 11, this.f5330d), this.f5340n.f5257b);
        this.f5340n.f5264i.c();
        for (t tVar : this.f5333g.values()) {
            tVar.f15577c.run();
        }
    }

    private final void l() {
        this.f5340n.f5271p.removeMessages(12, this.f5330d);
        b bVar = this.f5340n;
        bVar.f5271p.sendMessageDelayed(bVar.f5271p.obtainMessage(12, this.f5330d), this.f5340n.f5258c);
    }

    private final void m(e0 e0Var) {
        e0Var.d(this.f5331e, L());
        try {
            e0Var.c(this);
        } catch (DeadObjectException unused) {
            c(1);
            this.f5329c.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        if (this.f5336j) {
            this.f5340n.f5271p.removeMessages(11, this.f5330d);
            this.f5340n.f5271p.removeMessages(9, this.f5330d);
            this.f5336j = false;
        }
    }

    private final boolean o(e0 e0Var) {
        if (!(e0Var instanceof r)) {
            m(e0Var);
            return true;
        }
        r rVar = (r) e0Var;
        c b10 = b(rVar.g(this));
        if (b10 == null) {
            m(e0Var);
            return true;
        }
        String name = this.f5329c.getClass().getName();
        String c10 = b10.c();
        long d10 = b10.d();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + c10 + ", " + d10 + ").");
        if (!this.f5340n.f5272q || !rVar.f(this)) {
            rVar.b(new g(b10));
            return true;
        }
        r rVar2 = new r(this.f5330d, b10, (r3.n) null);
        int indexOf = this.f5337k.indexOf(rVar2);
        if (indexOf >= 0) {
            r rVar3 = (r) this.f5337k.get(indexOf);
            this.f5340n.f5271p.removeMessages(15, rVar3);
            b bVar = this.f5340n;
            bVar.f5271p.sendMessageDelayed(Message.obtain(bVar.f5271p, 15, rVar3), this.f5340n.f5256a);
            return false;
        }
        this.f5337k.add(rVar2);
        b bVar2 = this.f5340n;
        bVar2.f5271p.sendMessageDelayed(Message.obtain(bVar2.f5271p, 15, rVar2), this.f5340n.f5256a);
        b bVar3 = this.f5340n;
        bVar3.f5271p.sendMessageDelayed(Message.obtain(bVar3.f5271p, 16, rVar2), this.f5340n.f5257b);
        p3.a aVar = new p3.a(2, (PendingIntent) null);
        if (p(aVar)) {
            return false;
        }
        this.f5340n.g(aVar, this.f5334h);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean p(p3.a r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.b.f5254t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.b r1 = r3.f5340n     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.k r2 = r1.f5268m     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0029
            java.util.Set r1 = r1.f5269n     // Catch:{ all -> 0x0027 }
            r3.b r2 = r3.f5330d     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0029
            com.google.android.gms.common.api.internal.b r1 = r3.f5340n     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.api.internal.k r1 = r1.f5268m     // Catch:{ all -> 0x0027 }
            int r2 = r3.f5334h     // Catch:{ all -> 0x0027 }
            r1.s(r4, r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 1
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x002c
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            r4 = 0
            return r4
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.p(p3.a):boolean");
    }

    private final boolean q(boolean z10) {
        o.d(this.f5340n.f5271p);
        if (!this.f5329c.a() || this.f5333g.size() != 0) {
            return false;
        }
        if (this.f5331e.e()) {
            if (z10) {
                l();
            }
            return false;
        }
        this.f5329c.d("Timing out service connection.");
        return true;
    }

    public final void C() {
        o.d(this.f5340n.f5271p);
        this.f5338l = null;
    }

    public final void D() {
        p3.a aVar;
        o.d(this.f5340n.f5271p);
        if (!this.f5329c.a() && !this.f5329c.g()) {
            try {
                b bVar = this.f5340n;
                int b10 = bVar.f5264i.b(bVar.f5262g, this.f5329c);
                if (b10 != 0) {
                    p3.a aVar2 = new p3.a(b10, (PendingIntent) null);
                    String name = this.f5329c.getClass().getName();
                    String obj = aVar2.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    G(aVar2, (Exception) null);
                    return;
                }
                b bVar2 = this.f5340n;
                a.f fVar = this.f5329c;
                t tVar = new t(bVar2, fVar, this.f5330d);
                if (fVar.n()) {
                    ((a0) o.i(this.f5335i)).o0(tVar);
                }
                try {
                    this.f5329c.c(tVar);
                } catch (SecurityException e10) {
                    e = e10;
                    aVar = new p3.a(10);
                    G(aVar, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                aVar = new p3.a(10);
                G(aVar, e);
            }
        }
    }

    public final void E(e0 e0Var) {
        o.d(this.f5340n.f5271p);
        if (!this.f5329c.a()) {
            this.f5328b.add(e0Var);
            p3.a aVar = this.f5338l;
            if (aVar == null || !aVar.f()) {
                D();
            } else {
                G(this.f5338l, (Exception) null);
            }
        } else if (o(e0Var)) {
            l();
        } else {
            this.f5328b.add(e0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void F() {
        this.f5339m++;
    }

    public final void G(p3.a aVar, Exception exc) {
        o.d(this.f5340n.f5271p);
        a0 a0Var = this.f5335i;
        if (a0Var != null) {
            a0Var.p0();
        }
        C();
        this.f5340n.f5264i.c();
        e(aVar);
        if ((this.f5329c instanceof u3.e) && aVar.c() != 24) {
            this.f5340n.f5259d = true;
            b bVar = this.f5340n;
            bVar.f5271p.sendMessageDelayed(bVar.f5271p.obtainMessage(19), 300000);
        }
        if (aVar.c() == 4) {
            f(b.f5253s);
        } else if (this.f5328b.isEmpty()) {
            this.f5338l = aVar;
        } else if (exc != null) {
            o.d(this.f5340n.f5271p);
            g((Status) null, exc, false);
        } else if (this.f5340n.f5272q) {
            g(b.h(this.f5330d, aVar), (Exception) null, true);
            if (!this.f5328b.isEmpty() && !p(aVar) && !this.f5340n.g(aVar, this.f5334h)) {
                if (aVar.c() == 18) {
                    this.f5336j = true;
                }
                if (this.f5336j) {
                    b bVar2 = this.f5340n;
                    bVar2.f5271p.sendMessageDelayed(Message.obtain(bVar2.f5271p, 9, this.f5330d), this.f5340n.f5256a);
                    return;
                }
                f(b.h(this.f5330d, aVar));
            }
        } else {
            f(b.h(this.f5330d, aVar));
        }
    }

    public final void H(p3.a aVar) {
        o.d(this.f5340n.f5271p);
        a.f fVar = this.f5329c;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        fVar.d("onSignInFailed for " + name + " with " + valueOf);
        G(aVar, (Exception) null);
    }

    public final void I() {
        o.d(this.f5340n.f5271p);
        if (this.f5336j) {
            D();
        }
    }

    public final void J() {
        o.d(this.f5340n.f5271p);
        f(b.f5252r);
        this.f5331e.d();
        for (c.a d0Var : (c.a[]) this.f5333g.keySet().toArray(new c.a[0])) {
            E(new d0(d0Var, new j()));
        }
        e(new p3.a(4));
        if (this.f5329c.a()) {
            this.f5329c.m(new p(this));
        }
    }

    public final void K() {
        o.d(this.f5340n.f5271p);
        if (this.f5336j) {
            n();
            b bVar = this.f5340n;
            f(bVar.f5263h.f(bVar.f5262g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f5329c.d("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f5329c.n();
    }

    public final boolean a() {
        return q(true);
    }

    public final void c(int i10) {
        if (Looper.myLooper() == this.f5340n.f5271p.getLooper()) {
            k(i10);
        } else {
            this.f5340n.f5271p.post(new n(this, i10));
        }
    }

    public final void d(p3.a aVar) {
        G(aVar, (Exception) null);
    }

    public final void j(Bundle bundle) {
        if (Looper.myLooper() == this.f5340n.f5271p.getLooper()) {
            i();
        } else {
            this.f5340n.f5271p.post(new m(this));
        }
    }

    public final int r() {
        return this.f5334h;
    }

    /* access modifiers changed from: package-private */
    public final int s() {
        return this.f5339m;
    }

    public final a.f u() {
        return this.f5329c;
    }

    public final Map w() {
        return this.f5333g;
    }
}
