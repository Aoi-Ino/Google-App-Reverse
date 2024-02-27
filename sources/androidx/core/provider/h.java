package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class h {

    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f2469a;

        /* renamed from: b  reason: collision with root package name */
        private int f2470b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        private static class C0034a extends Thread {

            /* renamed from: e  reason: collision with root package name */
            private final int f2471e;

            C0034a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f2471e = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f2471e);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f2469a = str;
            this.f2470b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0034a(runnable, this.f2469a, this.f2470b);
        }
    }

    private static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private Callable f2472e;

        /* renamed from: f  reason: collision with root package name */
        private androidx.core.util.a f2473f;

        /* renamed from: g  reason: collision with root package name */
        private Handler f2474g;

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f2475e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f2476f;

            a(androidx.core.util.a aVar, Object obj) {
                this.f2475e = aVar;
                this.f2476f = obj;
            }

            public void run() {
                this.f2475e.a(this.f2476f);
            }
        }

        b(Handler handler, Callable callable, androidx.core.util.a aVar) {
            this.f2472e = callable;
            this.f2473f = aVar;
            this.f2474g = handler;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f2472e.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f2474g.post(new a(this.f2473f, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, androidx.core.util.a aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static Object c(ExecutorService executorService, Callable callable, int i10) {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
