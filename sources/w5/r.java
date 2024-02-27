package w5;

import java.util.concurrent.Executor;

final class r implements Executor {
    r() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
