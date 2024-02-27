package s3;

import android.util.Log;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    private Object f16035a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16036b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f16037c;

    public t0(c cVar, Object obj) {
        this.f16037c = cVar;
        this.f16035a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f16035a;
                if (this.f16036b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f16036b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f16035a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f16037c.f15907r) {
            this.f16037c.f15907r.remove(this);
        }
    }
}
