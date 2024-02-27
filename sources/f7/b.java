package f7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final a f11425a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f11426b;

    /* renamed from: f7.b$b  reason: collision with other inner class name */
    private static class C0147b implements a {
        private C0147b() {
        }

        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0147b bVar = new C0147b();
        f11425a = bVar;
        f11426b = bVar;
    }

    public static a a() {
        return f11426b;
    }
}
