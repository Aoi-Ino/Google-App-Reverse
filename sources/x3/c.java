package x3;

import android.os.Process;

final class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f18202e;

    public c(Runnable runnable, int i10) {
        this.f18202e = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f18202e.run();
    }
}
