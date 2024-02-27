package p4;

import java.util.concurrent.Executor;

final class c0 implements f, e, c, d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f14668a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f14669b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f14670c;

    public c0(Executor executor, h hVar, h0 h0Var) {
        this.f14668a = executor;
        this.f14669b = hVar;
        this.f14670c = h0Var;
    }

    public final void a(Exception exc) {
        this.f14670c.o(exc);
    }

    public final void b(Object obj) {
        this.f14670c.p(obj);
    }

    public final void c() {
        this.f14670c.q();
    }

    public final void d(i iVar) {
        this.f14668a.execute(new b0(this, iVar));
    }
}
