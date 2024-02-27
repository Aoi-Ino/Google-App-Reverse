package w5;

import java.util.concurrent.Executor;

final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f17890a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f17891b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f17892c;

    public k(Executor executor, b bVar) {
        this.f17890a = executor;
        this.f17892c = bVar;
    }

    public final void a(e eVar) {
        if (!eVar.h()) {
            synchronized (this.f17891b) {
                try {
                    if (this.f17892c != null) {
                        this.f17890a.execute(new j(this, eVar));
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
