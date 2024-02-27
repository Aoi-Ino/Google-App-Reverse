package w5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class s implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f17902e = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f17902e.post(runnable);
    }
}
