package gl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import gl.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

class i {

    /* renamed from: a  reason: collision with root package name */
    final b f23835a;

    /* renamed from: b  reason: collision with root package name */
    final Context f23836b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f23837c;

    /* renamed from: d  reason: collision with root package name */
    final j f23838d;

    /* renamed from: e  reason: collision with root package name */
    final Map f23839e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    final Map f23840f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map f23841g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    final Set f23842h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    final Handler f23843i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f23844j;

    /* renamed from: k  reason: collision with root package name */
    final d f23845k;

    /* renamed from: l  reason: collision with root package name */
    final a0 f23846l;

    /* renamed from: m  reason: collision with root package name */
    final List f23847m;

    /* renamed from: n  reason: collision with root package name */
    final c f23848n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f23849o;

    /* renamed from: p  reason: collision with root package name */
    boolean f23850p;

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final i f23851a;

        /* renamed from: gl.i$a$a  reason: collision with other inner class name */
        class C0297a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Message f23852e;

            C0297a(Message message) {
                this.f23852e = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f23852e.what);
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f23851a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 1:
                    this.f23851a.v((a) message.obj);
                    return;
                case 2:
                    this.f23851a.o((a) message.obj);
                    return;
                case 4:
                    this.f23851a.p((c) message.obj);
                    return;
                case 5:
                    this.f23851a.u((c) message.obj);
                    return;
                case 6:
                    this.f23851a.q((c) message.obj, false);
                    return;
                case 7:
                    this.f23851a.n();
                    return;
                case 9:
                    this.f23851a.r((NetworkInfo) message.obj);
                    return;
                case 10:
                    i iVar = this.f23851a;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    iVar.m(z10);
                    return;
                case 11:
                    this.f23851a.s(message.obj);
                    return;
                case 12:
                    this.f23851a.t(message.obj);
                    return;
                default:
                    t.f23893o.post(new C0297a(message));
                    return;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final i f23854a;

        c(i iVar) {
            this.f23854a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f23854a.f23849o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f23854a.f23836b.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f23854a.b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f23854a.f(((ConnectivityManager) e0.p(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, a0 a0Var) {
        b bVar = new b();
        this.f23835a = bVar;
        bVar.start();
        e0.j(bVar.getLooper());
        this.f23836b = context;
        this.f23837c = executorService;
        this.f23843i = new a(bVar.getLooper(), this);
        this.f23838d = jVar;
        this.f23844j = handler;
        this.f23845k = dVar;
        this.f23846l = a0Var;
        this.f23847m = new ArrayList(4);
        this.f23850p = e0.r(context);
        this.f23849o = e0.q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f23848n = cVar;
        cVar.a();
    }

    private void a(c cVar) {
        if (!cVar.s()) {
            this.f23847m.add(cVar);
            if (!this.f23843i.hasMessages(7)) {
                this.f23843i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void i() {
        if (!this.f23840f.isEmpty()) {
            Iterator it = this.f23840f.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                it.remove();
                if (aVar.g().f23907m) {
                    e0.u("Dispatcher", "replaying", aVar.i().d());
                }
                w(aVar, false);
            }
        }
    }

    private void j(List list) {
        if (list != null && !list.isEmpty() && ((c) list.get(0)).o().f23907m) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(e0.l(cVar));
            }
            e0.u("Dispatcher", "delivered", sb2.toString());
        }
    }

    private void k(a aVar) {
        Object k10 = aVar.k();
        if (k10 != null) {
            aVar.f23762k = true;
            this.f23840f.put(k10, aVar);
        }
    }

    private void l(c cVar) {
        a h10 = cVar.h();
        if (h10 != null) {
            k(h10);
        }
        List i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                k((a) i10.get(i11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    public void e(c cVar) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    public void g(c cVar) {
        Handler handler = this.f23843i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        Handler handler = this.f23843i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f23850p = z10;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList(this.f23847m);
        this.f23847m.clear();
        Handler handler = this.f23844j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void o(a aVar) {
        String d10 = aVar.d();
        c cVar = (c) this.f23839e.get(d10);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f23839e.remove(d10);
                if (aVar.g().f23907m) {
                    e0.u("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f23842h.contains(aVar.j())) {
            this.f23841g.remove(aVar.k());
            if (aVar.g().f23907m) {
                e0.v("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        a aVar2 = (a) this.f23840f.remove(aVar.k());
        if (aVar2 != null && aVar2.g().f23907m) {
            e0.v("Dispatcher", "canceled", aVar2.i().d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    public void p(c cVar) {
        if (p.b(cVar.n())) {
            this.f23845k.b(cVar.l(), cVar.q());
        }
        this.f23839e.remove(cVar.l());
        a(cVar);
        if (cVar.o().f23907m) {
            e0.v("Dispatcher", "batched", e0.l(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    public void q(c cVar, boolean z10) {
        if (cVar.o().f23907m) {
            String l10 = e0.l(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : "");
            e0.v("Dispatcher", "batched", l10, sb2.toString());
        }
        this.f23839e.remove(cVar.l());
        a(cVar);
    }

    /* access modifiers changed from: package-private */
    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f23837c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Object obj) {
        if (this.f23842h.add(obj)) {
            Iterator it = this.f23839e.values().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                boolean z10 = cVar.o().f23907m;
                a h10 = cVar.h();
                List i10 = cVar.i();
                boolean z11 = i10 != null && !i10.isEmpty();
                if (h10 != null || z11) {
                    if (h10 != null && h10.j().equals(obj)) {
                        cVar.f(h10);
                        this.f23841g.put(h10.k(), h10);
                        if (z10) {
                            e0.v("Dispatcher", "paused", h10.f23753b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = i10.size() - 1; size >= 0; size--) {
                            a aVar = (a) i10.get(size);
                            if (aVar.j().equals(obj)) {
                                cVar.f(aVar);
                                this.f23841g.put(aVar.k(), aVar);
                                if (z10) {
                                    e0.v("Dispatcher", "paused", aVar.f23753b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (cVar.c()) {
                        it.remove();
                        if (z10) {
                            e0.v("Dispatcher", "canceled", e0.l(cVar), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(Object obj) {
        if (this.f23842h.remove(obj)) {
            Iterator it = this.f23841g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f23844j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(c cVar) {
        if (!cVar.s()) {
            boolean z10 = false;
            if (this.f23837c.isShutdown()) {
                q(cVar, false);
                return;
            }
            NetworkInfo activeNetworkInfo = this.f23849o ? ((ConnectivityManager) e0.p(this.f23836b, "connectivity")).getActiveNetworkInfo() : null;
            boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            boolean u10 = cVar.u(this.f23850p, activeNetworkInfo);
            boolean v10 = cVar.v();
            if (!u10) {
                if (this.f23849o && v10) {
                    z10 = true;
                }
                q(cVar, z10);
                if (z10) {
                    l(cVar);
                }
            } else if (!this.f23849o || z11) {
                if (cVar.o().f23907m) {
                    e0.u("Dispatcher", "retrying", e0.l(cVar));
                }
                if (cVar.k() instanceof r.a) {
                    cVar.f23809m |= q.NO_CACHE.f23889e;
                }
                cVar.f23814r = this.f23837c.submit(cVar);
            } else {
                q(cVar, v10);
                if (v10) {
                    l(cVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(a aVar) {
        w(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void w(a aVar, boolean z10) {
        if (this.f23842h.contains(aVar.j())) {
            this.f23841g.put(aVar.k(), aVar);
            if (aVar.g().f23907m) {
                String d10 = aVar.f23753b.d();
                e0.v("Dispatcher", "paused", d10, "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        c cVar = (c) this.f23839e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
        } else if (!this.f23837c.isShutdown()) {
            c g10 = c.g(aVar.g(), this, this.f23845k, this.f23846l, aVar);
            g10.f23814r = this.f23837c.submit(g10);
            this.f23839e.put(aVar.d(), g10);
            if (z10) {
                this.f23840f.remove(aVar.k());
            }
            if (aVar.g().f23907m) {
                e0.u("Dispatcher", "enqueued", aVar.f23753b.d());
            }
        } else if (aVar.g().f23907m) {
            e0.v("Dispatcher", "ignored", aVar.f23753b.d(), "because shut down");
        }
    }
}
