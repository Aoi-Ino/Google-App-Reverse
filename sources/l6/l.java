package l6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum l implements Executor {
    INSTANCE;
    

    /* renamed from: f  reason: collision with root package name */
    private static final Handler f13309f = null;

    static {
        f13309f = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f13309f.post(runnable);
    }
}
