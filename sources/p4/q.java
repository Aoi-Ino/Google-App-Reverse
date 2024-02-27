package p4;

import java.util.concurrent.Executor;

final class q implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14689a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f14690b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h0 f14691c;

    public q(Executor executor, a aVar, h0 h0Var) {
        this.f14689a = executor;
        this.f14690b = aVar;
        this.f14691c = h0Var;
    }

    public final void d(i iVar) {
        this.f14689a.execute(new p(this, iVar));
    }
}
