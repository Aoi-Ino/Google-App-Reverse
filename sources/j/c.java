package j;

import java.util.concurrent.Executor;

public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f12677c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f12678d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f12679e = new b();

    /* renamed from: a  reason: collision with root package name */
    private e f12680a;

    /* renamed from: b  reason: collision with root package name */
    private final e f12681b;

    private c() {
        d dVar = new d();
        this.f12681b = dVar;
        this.f12680a = dVar;
    }

    public static Executor f() {
        return f12679e;
    }

    public static c g() {
        if (f12677c != null) {
            return f12677c;
        }
        synchronized (c.class) {
            try {
                if (f12677c == null) {
                    f12677c = new c();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f12677c;
    }

    public void a(Runnable runnable) {
        this.f12680a.a(runnable);
    }

    public boolean b() {
        return this.f12680a.b();
    }

    public void c(Runnable runnable) {
        this.f12680a.c(runnable);
    }
}
