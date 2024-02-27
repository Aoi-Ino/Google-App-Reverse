package x3;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import s3.o;

public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f18200a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f18201b = Executors.defaultThreadFactory();

    public b(String str) {
        o.j(str, "Name must not be null");
        this.f18200a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f18201b.newThread(new c(runnable, 0));
        newThread.setName(this.f18200a);
        return newThread;
    }
}
