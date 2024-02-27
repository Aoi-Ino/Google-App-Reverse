package o3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c4.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p4.i;
import x3.b;

public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    private static a0 f14361e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f14362a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f14363b;

    /* renamed from: c  reason: collision with root package name */
    private t f14364c = new t(this, (s) null);

    /* renamed from: d  reason: collision with root package name */
    private int f14365d = 1;

    a0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14363b = scheduledExecutorService;
        this.f14362a = context.getApplicationContext();
    }

    public static synchronized a0 b(Context context) {
        a0 a0Var;
        synchronized (a0.class) {
            try {
                if (f14361e == null) {
                    e.a();
                    f14361e = new a0(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b("MessengerIpcClient"))));
                }
                a0Var = f14361e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f14365d;
        this.f14365d = i10 + 1;
        return i10;
    }

    private final synchronized i g(x xVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(xVar.toString()));
            }
            if (!this.f14364c.g(xVar)) {
                t tVar = new t(this, (s) null);
                this.f14364c = tVar;
                tVar.g(xVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return xVar.f14414b.a();
    }

    public final i c(int i10, Bundle bundle) {
        return g(new w(f(), i10, bundle));
    }

    public final i d(int i10, Bundle bundle) {
        return g(new z(f(), 1, bundle));
    }
}
