package y0;

import cm.l;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import pl.x;

public final class c0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f18280e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f18281f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private Runnable f18282g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f18283h = new Object();

    public c0(Executor executor) {
        l.f(executor, "executor");
        this.f18280e = executor;
    }

    /* access modifiers changed from: private */
    public static final void b(Runnable runnable, c0 c0Var) {
        l.f(runnable, "$command");
        l.f(c0Var, "this$0");
        try {
            runnable.run();
        } finally {
            c0Var.c();
        }
    }

    public final void c() {
        synchronized (this.f18283h) {
            try {
                Object poll = this.f18281f.poll();
                Runnable runnable = (Runnable) poll;
                this.f18282g = runnable;
                if (poll != null) {
                    this.f18280e.execute(runnable);
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void execute(Runnable runnable) {
        l.f(runnable, "command");
        synchronized (this.f18283h) {
            try {
                this.f18281f.offer(new b0(runnable, this));
                if (this.f18282g == null) {
                    c();
                }
                x xVar = x.f30437a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
