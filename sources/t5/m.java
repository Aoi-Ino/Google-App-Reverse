package t5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import w5.e;
import w5.p;

public final class m {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f16538o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f16539a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f16540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16541c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f16542d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f16543e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f16544f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f16545g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f16546h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final h f16547i;

    /* renamed from: j  reason: collision with root package name */
    private final WeakReference f16548j;

    /* renamed from: k  reason: collision with root package name */
    private final IBinder.DeathRecipient f16549k = new c(this);

    /* renamed from: l  reason: collision with root package name */
    private final AtomicInteger f16550l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public ServiceConnection f16551m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public IInterface f16552n;

    public m(Context context, a aVar, String str, Intent intent, h hVar, g gVar) {
        this.f16539a = context;
        this.f16540b = aVar;
        this.f16541c = str;
        this.f16546h = intent;
        this.f16547i = hVar;
        this.f16548j = new WeakReference((Object) null);
    }

    public static /* synthetic */ void i(m mVar) {
        mVar.f16540b.d("reportBinderDeath", new Object[0]);
        b.a(mVar.f16548j.get());
        mVar.f16540b.d("%s : Binder has died.", mVar.f16541c);
        for (b c10 : mVar.f16542d) {
            c10.c(mVar.t());
        }
        mVar.f16542d.clear();
        mVar.u();
    }

    static /* bridge */ /* synthetic */ void n(m mVar, b bVar) {
        if (mVar.f16552n == null && !mVar.f16545g) {
            mVar.f16540b.d("Initiate binding to the service.", new Object[0]);
            mVar.f16542d.add(bVar);
            l lVar = new l(mVar, (k) null);
            mVar.f16551m = lVar;
            mVar.f16545g = true;
            if (!mVar.f16539a.bindService(mVar.f16546h, lVar, 1)) {
                mVar.f16540b.d("Failed to bind to the service.", new Object[0]);
                mVar.f16545g = false;
                for (b c10 : mVar.f16542d) {
                    c10.c(new n());
                }
                mVar.f16542d.clear();
            }
        } else if (mVar.f16545g) {
            mVar.f16540b.d("Waiting to bind to the service.", new Object[0]);
            mVar.f16542d.add(bVar);
        } else {
            bVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void o(m mVar) {
        mVar.f16540b.d("linkToDeath", new Object[0]);
        try {
            mVar.f16552n.asBinder().linkToDeath(mVar.f16549k, 0);
        } catch (RemoteException e10) {
            mVar.f16540b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void p(m mVar) {
        mVar.f16540b.d("unlinkToDeath", new Object[0]);
        mVar.f16552n.asBinder().unlinkToDeath(mVar.f16549k, 0);
    }

    private final RemoteException t() {
        return new RemoteException(String.valueOf(this.f16541c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void u() {
        synchronized (this.f16544f) {
            try {
                for (p d10 : this.f16543e) {
                    d10.d(t());
                }
                this.f16543e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f16538o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f16541c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16541c, 10);
                    handlerThread.start();
                    map.put(this.f16541c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f16541c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f16552n;
    }

    public final void q(b bVar, p pVar) {
        synchronized (this.f16544f) {
            this.f16543e.add(pVar);
            pVar.a().a(new d(this, pVar));
        }
        synchronized (this.f16544f) {
            try {
                if (this.f16550l.getAndIncrement() > 0) {
                    this.f16540b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        c().post(new e(this, bVar.b(), bVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r(p pVar, e eVar) {
        synchronized (this.f16544f) {
            this.f16543e.remove(pVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        c().post(new t5.f(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(w5.p r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16544f
            monitor-enter(r0)
            java.util.Set r1 = r3.f16543e     // Catch:{ all -> 0x003a }
            r1.remove(r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r3.f16544f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f16550l     // Catch:{ all -> 0x0028 }
            int r0 = r0.get()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f16550l     // Catch:{ all -> 0x0028 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0028 }
            if (r0 <= 0) goto L_0x002a
            t5.a r0 = r3.f16540b     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            r0.d(r1, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0038
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            t5.f r4 = new t5.f
            r4.<init>(r3)
            android.os.Handler r0 = r3.c()
            r0.post(r4)
            return
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x003a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.m.s(w5.p):void");
    }
}
