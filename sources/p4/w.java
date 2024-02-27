package p4;

import java.util.concurrent.Executor;

final class w implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14703a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f14704b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d f14705c;

    public w(Executor executor, d dVar) {
        this.f14703a = executor;
        this.f14705c = dVar;
    }

    public final void d(i iVar) {
        synchronized (this.f14704b) {
            try {
                if (this.f14705c != null) {
                    this.f14703a.execute(new v(this, iVar));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
