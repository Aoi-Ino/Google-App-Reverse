package x3;

import android.os.Handler;
import android.os.Looper;
import d4.e;
import java.util.concurrent.Executor;

public class a implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f18199e;

    public a(Looper looper) {
        this.f18199e = new e(looper);
    }

    public final void execute(Runnable runnable) {
        this.f18199e.post(runnable);
    }
}
