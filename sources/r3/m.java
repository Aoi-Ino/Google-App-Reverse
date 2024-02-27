package r3;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class m implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Handler f15568e;

    public /* synthetic */ m(Handler handler) {
        this.f15568e = handler;
    }

    public final void execute(Runnable runnable) {
        this.f15568e.post(runnable);
    }
}
