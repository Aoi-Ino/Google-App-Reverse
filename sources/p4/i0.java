package p4;

import java.util.concurrent.Callable;

final class i0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h0 f14681e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Callable f14682f;

    i0(h0 h0Var, Callable callable) {
        this.f14681e = h0Var;
        this.f14682f = callable;
    }

    public final void run() {
        try {
            this.f14681e.p(this.f14682f.call());
        } catch (Exception e10) {
            this.f14681e.o(e10);
        } catch (Throwable th2) {
            this.f14681e.o(new RuntimeException(th2));
        }
    }
}
