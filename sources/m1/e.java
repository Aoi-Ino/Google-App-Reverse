package m1;

import androidx.work.CoroutineWorker;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f13681e;

    public /* synthetic */ e(CoroutineWorker coroutineWorker) {
        this.f13681e = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker.q(this.f13681e);
    }
}
