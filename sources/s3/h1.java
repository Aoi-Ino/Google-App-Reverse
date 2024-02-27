package s3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import d4.e;
import java.util.HashMap;
import java.util.concurrent.Executor;
import v3.b;

final class h1 extends i {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f15976f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f15977g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f15978h;

    /* renamed from: i  reason: collision with root package name */
    private final g1 f15979i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final b f15980j;

    /* renamed from: k  reason: collision with root package name */
    private final long f15981k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f15982l;

    h1(Context context, Looper looper) {
        g1 g1Var = new g1(this, (f1) null);
        this.f15979i = g1Var;
        this.f15977g = context.getApplicationContext();
        this.f15978h = new e(looper, g1Var);
        this.f15980j = b.b();
        this.f15981k = 5000;
        this.f15982l = 300000;
    }

    /* access modifiers changed from: protected */
    public final void d(c1 c1Var, ServiceConnection serviceConnection, String str) {
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15976f) {
            try {
                e1 e1Var = (e1) this.f15976f.get(c1Var);
                if (e1Var == null) {
                    String obj = c1Var.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
                } else if (e1Var.h(serviceConnection)) {
                    e1Var.f(serviceConnection, str);
                    if (e1Var.i()) {
                        this.f15978h.sendMessageDelayed(this.f15978h.obtainMessage(0, c1Var), this.f15981k);
                    }
                } else {
                    String obj2 = c1Var.toString();
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(c1 c1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15976f) {
            try {
                e1 e1Var = (e1) this.f15976f.get(c1Var);
                if (e1Var == null) {
                    e1Var = new e1(this, c1Var);
                    e1Var.d(serviceConnection, serviceConnection, str);
                    e1Var.e(str, executor);
                    this.f15976f.put(c1Var, e1Var);
                } else {
                    this.f15978h.removeMessages(0, c1Var);
                    if (!e1Var.h(serviceConnection)) {
                        e1Var.d(serviceConnection, serviceConnection, str);
                        int a10 = e1Var.a();
                        if (a10 == 1) {
                            serviceConnection.onServiceConnected(e1Var.b(), e1Var.c());
                        } else if (a10 == 2) {
                            e1Var.e(str, executor);
                        }
                    } else {
                        String obj = c1Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                j10 = e1Var.j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }
}
