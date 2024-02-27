package s1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class s implements t1.a {

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f15850e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Executor f15851f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f15852g;

    /* renamed from: h  reason: collision with root package name */
    final Object f15853h = new Object();

    static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final s f15854e;

        /* renamed from: f  reason: collision with root package name */
        final Runnable f15855f;

        a(s sVar, Runnable runnable) {
            this.f15854e = sVar;
            this.f15855f = runnable;
        }

        public void run() {
            try {
                this.f15855f.run();
                synchronized (this.f15854e.f15853h) {
                    this.f15854e.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f15854e.f15853h) {
                    this.f15854e.a();
                    throw th2;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f15851f = executor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Runnable runnable = (Runnable) this.f15850e.poll();
        this.f15852g = runnable;
        if (runnable != null) {
            this.f15851f.execute(runnable);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f15853h) {
            try {
                this.f15850e.add(new a(this, runnable));
                if (this.f15852g == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean s0() {
        boolean z10;
        synchronized (this.f15853h) {
            z10 = !this.f15850e.isEmpty();
        }
        return z10;
    }
}
