package p4;

import android.os.Handler;
import android.os.Looper;
import h4.a;
import java.util.concurrent.Executor;

final class g0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f14674e = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f14674e.post(runnable);
    }
}
