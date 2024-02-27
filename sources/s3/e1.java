package s3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import w3.j;

final class e1 implements ServiceConnection, i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f15943a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f15944b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15945c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f15946d;

    /* renamed from: e  reason: collision with root package name */
    private final c1 f15947e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f15948f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ h1 f15949g;

    public e1(h1 h1Var, c1 c1Var) {
        this.f15949g = h1Var;
        this.f15947e = c1Var;
    }

    public final int a() {
        return this.f15944b;
    }

    public final ComponentName b() {
        return this.f15948f;
    }

    public final IBinder c() {
        return this.f15946d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f15943a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f15944b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (j.k()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            h1 h1Var = this.f15949g;
            boolean d10 = h1Var.f15980j.d(h1Var.f15977g, str, this.f15947e.c(h1Var.f15977g), this, this.f15947e.a(), executor);
            this.f15945c = d10;
            if (d10) {
                this.f15949g.f15978h.sendMessageDelayed(this.f15949g.f15978h.obtainMessage(1, this.f15947e), this.f15949g.f15982l);
            } else {
                this.f15944b = 2;
                try {
                    h1 h1Var2 = this.f15949g;
                    h1Var2.f15980j.c(h1Var2.f15977g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f15943a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f15949g.f15978h.removeMessages(1, this.f15947e);
        h1 h1Var = this.f15949g;
        h1Var.f15980j.c(h1Var.f15977g, this);
        this.f15945c = false;
        this.f15944b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f15943a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f15943a.isEmpty();
    }

    public final boolean j() {
        return this.f15945c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f15949g.f15976f) {
            try {
                this.f15949g.f15978h.removeMessages(1, this.f15947e);
                this.f15946d = iBinder;
                this.f15948f = componentName;
                for (ServiceConnection onServiceConnected : this.f15943a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f15944b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15949g.f15976f) {
            try {
                this.f15949g.f15978h.removeMessages(1, this.f15947e);
                this.f15946d = null;
                this.f15948f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f15943a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f15944b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
