package f2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class b implements e {

    /* renamed from: d  reason: collision with root package name */
    private static final int f11316d = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: a  reason: collision with root package name */
    private final c f11317a = new c(f11316d, new g(10));

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11318b = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11319c = new f();

    b() {
    }

    public Executor a() {
        return this.f11319c;
    }

    public Executor b() {
        return this.f11318b;
    }

    public c c() {
        return this.f11317a;
    }
}
