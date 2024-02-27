package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p3.a;
import p3.i;
import p4.j;
import q3.d;
import r3.m;
import s3.g0;
import s3.p;
import s3.q;
import s3.s;
import s3.t;
import s3.u;
import w3.g;

public class b implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f5252r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Status f5253s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final Object f5254t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static b f5255u;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f5256a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f5257b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f5258c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f5259d = false;

    /* renamed from: e  reason: collision with root package name */
    private s f5260e;

    /* renamed from: f  reason: collision with root package name */
    private u f5261f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f5262g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final i f5263h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g0 f5264i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f5265j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f5266k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map f5267l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public k f5268m = null;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set f5269n = new o.b();

    /* renamed from: o  reason: collision with root package name */
    private final Set f5270o = new o.b();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Handler f5271p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f5272q = true;

    private b(Context context, Looper looper, i iVar) {
        this.f5262g = context;
        b4.i iVar2 = new b4.i(looper, this);
        this.f5271p = iVar2;
        this.f5263h = iVar;
        this.f5264i = new g0(iVar);
        if (g.a(context)) {
            this.f5272q = false;
        }
        iVar2.sendMessage(iVar2.obtainMessage(6));
    }

    /* access modifiers changed from: private */
    public static Status h(r3.b bVar, a aVar) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(aVar);
        return new Status(aVar, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    private final q i(d dVar) {
        r3.b g10 = dVar.g();
        q qVar = (q) this.f5267l.get(g10);
        if (qVar == null) {
            qVar = new q(this, dVar);
            this.f5267l.put(g10, qVar);
        }
        if (qVar.L()) {
            this.f5270o.add(g10);
        }
        qVar.D();
        return qVar;
    }

    private final u j() {
        if (this.f5261f == null) {
            this.f5261f = t.a(this.f5262g);
        }
        return this.f5261f;
    }

    private final void k() {
        s sVar = this.f5260e;
        if (sVar != null) {
            if (sVar.c() > 0 || f()) {
                j().b(sVar);
            }
            this.f5260e = null;
        }
    }

    private final void l(j jVar, int i10, d dVar) {
        v b10;
        if (i10 != 0 && (b10 = v.b(this, i10, dVar.g())) != null) {
            p4.i a10 = jVar.a();
            Handler handler = this.f5271p;
            handler.getClass();
            a10.b(new m(handler), b10);
        }
    }

    public static b x(Context context) {
        b bVar;
        synchronized (f5254t) {
            try {
                if (f5255u == null) {
                    f5255u = new b(context.getApplicationContext(), s3.i.c().getLooper(), i.l());
                }
                bVar = f5255u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final p4.i A(d dVar, c.a aVar, int i10) {
        j jVar = new j();
        l(jVar, i10, dVar);
        d0 d0Var = new d0(aVar, jVar);
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(13, new r3.s(d0Var, this.f5266k.get(), dVar)));
        return jVar.a();
    }

    public final void F(d dVar, int i10, g gVar, j jVar, r3.j jVar2) {
        l(jVar, gVar.d(), dVar);
        c0 c0Var = new c0(i10, gVar, jVar, jVar2);
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(4, new r3.s(c0Var, this.f5266k.get(), dVar)));
    }

    /* access modifiers changed from: package-private */
    public final void G(s3.m mVar, int i10, long j10, int i11) {
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(18, new w(mVar, i10, j10, i11)));
    }

    public final void H(a aVar, int i10) {
        if (!g(aVar, i10)) {
            Handler handler = this.f5271p;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, aVar));
        }
    }

    public final void a() {
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(d dVar) {
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void c(k kVar) {
        synchronized (f5254t) {
            try {
                if (this.f5268m != kVar) {
                    this.f5268m = kVar;
                    this.f5269n.clear();
                }
                this.f5269n.addAll(kVar.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(k kVar) {
        synchronized (f5254t) {
            try {
                if (this.f5268m == kVar) {
                    this.f5268m = null;
                    this.f5269n.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f5259d) {
            return false;
        }
        q a10 = p.b().a();
        if (a10 != null && !a10.e()) {
            return false;
        }
        int a11 = this.f5264i.a(this.f5262g, 203400000);
        return a11 == -1 || a11 == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean g(a aVar, int i10) {
        return this.f5263h.v(this.f5262g, aVar, i10);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        long j10 = 300000;
        q qVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f5258c = j10;
                this.f5271p.removeMessages(12);
                for (r3.b obtainMessage : this.f5267l.keySet()) {
                    Handler handler = this.f5271p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f5258c);
                }
                break;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (q qVar2 : this.f5267l.values()) {
                    qVar2.C();
                    qVar2.D();
                }
                break;
            case 4:
            case 8:
            case 13:
                r3.s sVar = (r3.s) message.obj;
                q qVar3 = (q) this.f5267l.get(sVar.f15574c.g());
                if (qVar3 == null) {
                    qVar3 = i(sVar.f15574c);
                }
                if (qVar3.L() && this.f5266k.get() != sVar.f15573b) {
                    sVar.f15572a.a(f5252r);
                    qVar3.J();
                    break;
                } else {
                    qVar3.E(sVar.f15572a);
                    break;
                }
            case 5:
                int i11 = message.arg1;
                a aVar = (a) message.obj;
                Iterator it = this.f5267l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        q qVar4 = (q) it.next();
                        if (qVar4.r() == i11) {
                            qVar = qVar4;
                        }
                    }
                }
                if (qVar != null) {
                    if (aVar.c() != 13) {
                        qVar.f(h(qVar.f5330d, aVar));
                        break;
                    } else {
                        String d10 = this.f5263h.d(aVar.c());
                        String d11 = aVar.d();
                        qVar.f(new Status(17, "Error resolution was canceled by the user, original error message: " + d10 + ": " + d11));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f5262g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f5262g.getApplicationContext());
                    a.b().a(new l(this));
                    if (!a.b().e(true)) {
                        this.f5258c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                i((d) message.obj);
                break;
            case 9:
                if (this.f5267l.containsKey(message.obj)) {
                    ((q) this.f5267l.get(message.obj)).I();
                    break;
                }
                break;
            case 10:
                for (r3.b remove : this.f5270o) {
                    q qVar5 = (q) this.f5267l.remove(remove);
                    if (qVar5 != null) {
                        qVar5.J();
                    }
                }
                this.f5270o.clear();
                break;
            case 11:
                if (this.f5267l.containsKey(message.obj)) {
                    ((q) this.f5267l.get(message.obj)).K();
                    break;
                }
                break;
            case 12:
                if (this.f5267l.containsKey(message.obj)) {
                    ((q) this.f5267l.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                r rVar = (r) message.obj;
                if (this.f5267l.containsKey(rVar.f5341a)) {
                    q.A((q) this.f5267l.get(rVar.f5341a), rVar);
                    break;
                }
                break;
            case 16:
                r rVar2 = (r) message.obj;
                if (this.f5267l.containsKey(rVar2.f5341a)) {
                    q.B((q) this.f5267l.get(rVar2.f5341a), rVar2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                w wVar = (w) message.obj;
                if (wVar.f5360c != 0) {
                    s sVar2 = this.f5260e;
                    if (sVar2 != null) {
                        List d12 = sVar2.d();
                        if (sVar2.c() != wVar.f5359b || (d12 != null && d12.size() >= wVar.f5361d)) {
                            this.f5271p.removeMessages(17);
                            k();
                        } else {
                            this.f5260e.e(wVar.f5358a);
                        }
                    }
                    if (this.f5260e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(wVar.f5358a);
                        this.f5260e = new s(wVar.f5359b, arrayList);
                        Handler handler2 = this.f5271p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), wVar.f5360c);
                        break;
                    }
                } else {
                    j().b(new s(wVar.f5359b, Arrays.asList(new s3.m[]{wVar.f5358a})));
                    break;
                }
                break;
            case 19:
                this.f5259d = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f5265j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final q w(r3.b bVar) {
        return (q) this.f5267l.get(bVar);
    }

    public final p4.i z(d dVar, e eVar, h hVar, Runnable runnable) {
        j jVar = new j();
        l(jVar, eVar.e(), dVar);
        b0 b0Var = new b0(new r3.t(eVar, hVar, runnable), jVar);
        Handler handler = this.f5271p;
        handler.sendMessage(handler.obtainMessage(8, new r3.s(b0Var, this.f5266k.get(), dVar)));
        return jVar.a();
    }
}
