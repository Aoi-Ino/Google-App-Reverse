package p4;

import java.util.concurrent.Executor;

final class f0 implements Executor {
    f0() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
