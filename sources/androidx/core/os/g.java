package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public abstract class g {

    private static class a implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final Handler f2421e;

        a(Handler handler) {
            this.f2421e = (Handler) androidx.core.util.g.g(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f2421e.post((Runnable) androidx.core.util.g.g(runnable))) {
                throw new RejectedExecutionException(this.f2421e + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
