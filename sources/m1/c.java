package m1;

import cm.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f13658a = 8;

    public static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f13659a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13660b;

        a(boolean z10) {
            this.f13660b = z10;
        }

        public Thread newThread(Runnable runnable) {
            l.f(runnable, "runnable");
            String str = this.f13660b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f13659a.incrementAndGet());
        }
    }

    /* access modifiers changed from: private */
    public static final Executor b(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        l.e(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static final int c() {
        return f13658a;
    }
}
