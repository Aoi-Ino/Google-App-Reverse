package p4;

import java.util.concurrent.Executor;

final class a0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14663a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f14664b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f14665c;

    public a0(Executor executor, f fVar) {
        this.f14663a = executor;
        this.f14665c = fVar;
    }

    public final void d(i iVar) {
        if (iVar.m()) {
            synchronized (this.f14664b) {
                try {
                    if (this.f14665c != null) {
                        this.f14663a.execute(new z(this, iVar));
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
