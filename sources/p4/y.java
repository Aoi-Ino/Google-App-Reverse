package p4;

import java.util.concurrent.Executor;

final class y implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14708a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f14709b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public e f14710c;

    public y(Executor executor, e eVar) {
        this.f14708a = executor;
        this.f14710c = eVar;
    }

    public final void d(i iVar) {
        if (!iVar.m() && !iVar.k()) {
            synchronized (this.f14709b) {
                try {
                    if (this.f14710c != null) {
                        this.f14708a.execute(new x(this, iVar));
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
    }
}
