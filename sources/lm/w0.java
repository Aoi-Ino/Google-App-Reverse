package lm;

import java.util.concurrent.locks.LockSupport;

public abstract class w0 extends u0 {
    /* access modifiers changed from: protected */
    public abstract Thread N0();

    /* access modifiers changed from: protected */
    public final void O0() {
        Thread N0 = N0();
        if (Thread.currentThread() != N0) {
            c.a();
            LockSupport.unpark(N0);
        }
    }
}
