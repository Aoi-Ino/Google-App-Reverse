package p4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class b0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14666e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c0 f14667f;

    b0(c0 c0Var, i iVar) {
        this.f14667f = c0Var;
        this.f14666e = iVar;
    }

    public final void run() {
        try {
            i a10 = this.f14667f.f14669b.a(this.f14666e.i());
            if (a10 == null) {
                this.f14667f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14685b;
            a10.e(executor, this.f14667f);
            a10.d(executor, this.f14667f);
            a10.a(executor, this.f14667f);
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f14667f.a((Exception) e10.getCause());
            } else {
                this.f14667f.a(e10);
            }
        } catch (CancellationException unused) {
            this.f14667f.c();
        } catch (Exception e11) {
            this.f14667f.a(e11);
        }
    }
}
