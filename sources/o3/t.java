package o3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import c4.f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import s3.o;
import v3.b;

final class t implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    int f14405a = 0;

    /* renamed from: b  reason: collision with root package name */
    final Messenger f14406b = new Messenger(new f(Looper.getMainLooper(), new q(this)));

    /* renamed from: c  reason: collision with root package name */
    v f14407c;

    /* renamed from: d  reason: collision with root package name */
    final Queue f14408d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray f14409e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a0 f14410f;

    /* synthetic */ t(a0 a0Var, s sVar) {
        this.f14410f = a0Var;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f14405a;
            if (i11 == 0) {
                throw new IllegalStateException();
            } else if (i11 == 1 || i11 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f14405a = 4;
                b.b().c(this.f14410f.f14362a, this);
                y yVar = new y(i10, str, th2);
                for (x c10 : this.f14408d) {
                    c10.c(yVar);
                }
                this.f14408d.clear();
                for (int i12 = 0; i12 < this.f14409e.size(); i12++) {
                    ((x) this.f14409e.valueAt(i12)).c(yVar);
                }
                this.f14409e.clear();
            } else if (i11 == 3) {
                this.f14405a = 4;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f14410f.f14363b.execute(new n(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f14405a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        x xVar = (x) this.f14409e.get(i10);
        if (xVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f14409e.remove(i10);
            xVar.c(new y(3, "Timed out waiting for response", (Throwable) null));
            f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f14405a     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r0 != r1) goto L_0x003a
            java.util.Queue r0 = r2.f14408d     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x003a
            android.util.SparseArray r0 = r2.f14409e     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x003c
        L_0x0028:
            r0 = 3
            r2.f14405a = r0     // Catch:{ all -> 0x0026 }
            o3.a0 r0 = r2.f14410f     // Catch:{ all -> 0x0026 }
            v3.b r1 = v3.b.b()     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = r0.f14362a     // Catch:{ all -> 0x0026 }
            r1.c(r0, r2)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return
        L_0x003a:
            monitor-exit(r2)
            return
        L_0x003c:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.t.f():void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean g(x xVar) {
        int i10 = this.f14405a;
        if (i10 == 0) {
            this.f14408d.add(xVar);
            o.k(this.f14405a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f14405a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!b.b().a(this.f14410f.f14362a, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f14410f.f14363b.schedule(new o(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f14408d.add(xVar);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f14408d.add(xVar);
            c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f14410f.f14363b.execute(new m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f14410f.f14363b.execute(new p(this));
    }
}
