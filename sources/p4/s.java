package p4;

import java.util.concurrent.Executor;

final class s implements f, e, c, d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14694a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a f14695b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h0 f14696c;

    public s(Executor executor, a aVar, h0 h0Var) {
        this.f14694a = executor;
        this.f14695b = aVar;
        this.f14696c = h0Var;
    }

    public final void a(Exception exc) {
        this.f14696c.o(exc);
    }

    public final void b(Object obj) {
        this.f14696c.p(obj);
    }

    public final void c() {
        this.f14696c.q();
    }

    public final void d(i iVar) {
        this.f14694a.execute(new r(this, iVar));
    }
}
