package lm;

import cm.l;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class i0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m  reason: collision with root package name */
    public static final i0 f24964m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f24965n;

    static {
        Long l10;
        i0 i0Var = new i0();
        f24964m = i0Var;
        u0.J0(i0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f24965n = timeUnit.toNanos(l10.longValue());
    }

    private i0() {
    }

    private final synchronized void Z0() {
        if (c1()) {
            debugStatus = 3;
            X0();
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread a1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean b1() {
        return debugStatus == 4;
    }

    private final boolean c1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean d1() {
        if (c1()) {
            return false;
        }
        debugStatus = 1;
        l.d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void e1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    public Thread N0() {
        Thread thread = _thread;
        return thread == null ? a1() : thread;
    }

    public void R0(Runnable runnable) {
        if (b1()) {
            e1();
        }
        super.R0(runnable);
    }

    public void run() {
        f2.f24958a.c(this);
        c.a();
        try {
            if (d1()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long V0 = V0();
                    if (V0 == Long.MAX_VALUE) {
                        c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f24965n + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            Z0();
                            c.a();
                            if (!U0()) {
                                N0();
                                return;
                            }
                            return;
                        }
                        V0 = f.e(V0, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (V0 > 0) {
                        if (c1()) {
                            _thread = null;
                            Z0();
                            c.a();
                            if (!U0()) {
                                N0();
                                return;
                            }
                            return;
                        }
                        c.a();
                        LockSupport.parkNanos(this, V0);
                    }
                }
            }
        } finally {
            _thread = null;
            Z0();
            c.a();
            if (!U0()) {
                N0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
