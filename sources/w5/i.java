package w5;

import java.util.concurrent.Executor;

final class i implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f17885a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f17886b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f17887c;

    public i(Executor executor, a aVar) {
        this.f17885a = executor;
        this.f17887c = aVar;
    }

    public final void a(e eVar) {
        synchronized (this.f17886b) {
            try {
                if (this.f17887c != null) {
                    this.f17885a.execute(new h(this, eVar));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
