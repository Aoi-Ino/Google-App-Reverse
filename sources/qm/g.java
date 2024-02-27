package qm;

import java.util.Collection;
import java.util.ServiceLoader;
import lm.b0;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection f30814a;

    static {
        Class<b0> cls = b0.class;
        f30814a = o.s(m.b(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection a() {
        return f30814a;
    }

    public static final void b(Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
