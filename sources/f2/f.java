package f2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class f implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f11321e = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.f11321e.post(runnable);
    }
}
