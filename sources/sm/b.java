package sm;

import java.util.concurrent.Executor;
import lm.a0;
import lm.a1;
import qm.i0;
import tl.g;
import tl.h;

public final class b extends a1 implements Executor {

    /* renamed from: h  reason: collision with root package name */
    public static final b f31299h = new b();

    /* renamed from: i  reason: collision with root package name */
    private static final a0 f31300i = m.f31320g.D0(k0.e("kotlinx.coroutines.io.parallelism", f.b(64, i0.a()), 0, 0, 12, (Object) null));

    private b() {
    }

    public void A0(g gVar, Runnable runnable) {
        f31300i.A0(gVar, runnable);
    }

    public void B0(g gVar, Runnable runnable) {
        f31300i.B0(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        A0(h.f31683e, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
