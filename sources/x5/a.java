package x5;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface a extends Future {
    void a(Runnable runnable, Executor executor);
}
