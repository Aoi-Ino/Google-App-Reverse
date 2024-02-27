package m1;

import androidx.work.impl.utils.futures.c;
import cm.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import lm.k1;
import pl.x;

public final class l implements x5.a {

    /* renamed from: e  reason: collision with root package name */
    private final k1 f13691e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f13692f;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l f13693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.f13693e = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x.f30437a;
        }

        public final void invoke(Throwable th2) {
            if (th2 == null) {
                if (!this.f13693e.f13692f.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th2 instanceof CancellationException) {
                this.f13693e.f13692f.cancel(true);
            } else {
                c b10 = this.f13693e.f13692f;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                b10.q(th2);
            }
        }
    }

    public l(k1 k1Var, c cVar) {
        cm.l.f(k1Var, "job");
        cm.l.f(cVar, "underlying");
        this.f13691e = k1Var;
        this.f13692f = cVar;
        k1Var.o(new a(this));
    }

    public void a(Runnable runnable, Executor executor) {
        this.f13692f.a(runnable, executor);
    }

    public final void c(Object obj) {
        this.f13692f.p(obj);
    }

    public boolean cancel(boolean z10) {
        return this.f13692f.cancel(z10);
    }

    public Object get() {
        return this.f13692f.get();
    }

    public boolean isCancelled() {
        return this.f13692f.isCancelled();
    }

    public boolean isDone() {
        return this.f13692f.isDone();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(lm.k1 r1, androidx.work.impl.utils.futures.c r2, int r3, cm.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.t()
            java.lang.String r3 = "create()"
            cm.l.e(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.l.<init>(lm.k1, androidx.work.impl.utils.futures.c, int, cm.g):void");
    }

    public Object get(long j10, TimeUnit timeUnit) {
        return this.f13692f.get(j10, timeUnit);
    }
}
