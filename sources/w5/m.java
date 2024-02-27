package w5;

import java.util.concurrent.Executor;

final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f17895a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f17896b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f17897c;

    public m(Executor executor, c cVar) {
        this.f17895a = executor;
        this.f17897c = cVar;
    }

    public final void a(e eVar) {
        if (eVar.h()) {
            synchronized (this.f17896b) {
                try {
                    if (this.f17897c != null) {
                        this.f17895a.execute(new l(this, eVar));
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
