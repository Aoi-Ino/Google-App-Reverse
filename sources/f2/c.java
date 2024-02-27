package f2;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c extends ThreadPoolExecutor {
    c(int i10, ThreadFactory threadFactory) {
        super(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    public Future submit(Runnable runnable) {
        d dVar = new d((i2.c) runnable);
        execute(dVar);
        return dVar;
    }
}
