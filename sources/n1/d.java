package n1;

import androidx.work.impl.a0;
import androidx.work.impl.n0;
import cm.g;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m1.u;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final u f14112a;

    /* renamed from: b  reason: collision with root package name */
    private final n0 f14113b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14114c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14115d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f14116e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(u uVar, n0 n0Var) {
        this(uVar, n0Var, 0, 4, (g) null);
        l.f(uVar, "runnableScheduler");
        l.f(n0Var, "launcher");
    }

    /* access modifiers changed from: private */
    public static final void d(d dVar, a0 a0Var) {
        l.f(dVar, "this$0");
        l.f(a0Var, "$token");
        dVar.f14113b.c(a0Var, 3);
    }

    public final void b(a0 a0Var) {
        Runnable runnable;
        l.f(a0Var, "token");
        synchronized (this.f14115d) {
            runnable = (Runnable) this.f14116e.remove(a0Var);
        }
        if (runnable != null) {
            this.f14112a.b(runnable);
        }
    }

    public final void c(a0 a0Var) {
        l.f(a0Var, "token");
        c cVar = new c(this, a0Var);
        synchronized (this.f14115d) {
            Runnable runnable = (Runnable) this.f14116e.put(a0Var, cVar);
        }
        this.f14112a.a(this.f14114c, cVar);
    }

    public d(u uVar, n0 n0Var, long j10) {
        l.f(uVar, "runnableScheduler");
        l.f(n0Var, "launcher");
        this.f14112a = uVar;
        this.f14113b = n0Var;
        this.f14114c = j10;
        this.f14115d = new Object();
        this.f14116e = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(u uVar, n0 n0Var, long j10, int i10, g gVar) {
        this(uVar, n0Var, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90) : j10);
    }
}
