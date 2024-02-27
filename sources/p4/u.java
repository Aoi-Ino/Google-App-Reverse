package p4;

import java.util.concurrent.Executor;

final class u implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14698a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f14699b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public c f14700c;

    public u(Executor executor, c cVar) {
        this.f14698a = executor;
        this.f14700c = cVar;
    }

    public final void d(i iVar) {
        if (iVar.k()) {
            synchronized (this.f14699b) {
                try {
                    if (this.f14700c != null) {
                        this.f14698a.execute(new t(this));
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
