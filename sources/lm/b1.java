package lm;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import qm.c;
import tl.g;

public final class b1 extends a1 implements m0 {

    /* renamed from: h  reason: collision with root package name */
    private final Executor f24947h;

    public b1(Executor executor) {
        this.f24947h = executor;
        c.a(F0());
    }

    private final void E0(g gVar, RejectedExecutionException rejectedExecutionException) {
        o1.c(gVar, z0.a("The task was rejected", rejectedExecutionException));
    }

    public void A0(g gVar, Runnable runnable) {
        try {
            Executor F0 = F0();
            c.a();
            F0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            E0(gVar, e10);
            q0.b().A0(gVar, runnable);
        }
    }

    public Executor F0() {
        return this.f24947h;
    }

    public void close() {
        Executor F0 = F0();
        ExecutorService executorService = F0 instanceof ExecutorService ? (ExecutorService) F0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b1) && ((b1) obj).F0() == F0();
    }

    public int hashCode() {
        return System.identityHashCode(F0());
    }

    public String toString() {
        return F0().toString();
    }
}
