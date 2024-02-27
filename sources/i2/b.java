package i2;

import e2.j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k2.a;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f12237c;

    /* renamed from: a  reason: collision with root package name */
    private final Map f12238a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f12239b = new AtomicInteger();

    private b() {
    }

    public static b c() {
        if (f12237c == null) {
            synchronized (b.class) {
                try {
                    if (f12237c == null) {
                        f12237c = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f12237c;
    }

    private int d() {
        return this.f12239b.incrementAndGet();
    }

    public static void e() {
        c();
    }

    public void a(a aVar) {
        this.f12238a.put(Integer.valueOf(aVar.n()), aVar);
        aVar.D(j.QUEUED);
        aVar.C(d());
        aVar.B(f2.a.b().a().c().submit(new c(aVar)));
    }

    public void b(a aVar) {
        this.f12238a.remove(Integer.valueOf(aVar.n()));
    }
}
