package p4;

import java.util.concurrent.Executor;

final class r implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14692e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ s f14693f;

    r(s sVar, i iVar) {
        this.f14693f = sVar;
        this.f14692e = iVar;
    }

    public final void run() {
        try {
            i iVar = (i) this.f14693f.f14695b.a(this.f14692e);
            if (iVar == null) {
                this.f14693f.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f14685b;
            iVar.e(executor, this.f14693f);
            iVar.d(executor, this.f14693f);
            iVar.a(executor, this.f14693f);
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f14693f.f14696c.o((Exception) e10.getCause());
            } else {
                this.f14693f.f14696c.o(e10);
            }
        } catch (Exception e11) {
            this.f14693f.f14696c.o(e11);
        }
    }
}
