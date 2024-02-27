package lm;

import cm.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class u {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f25022b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f25023a;

    public u(Throwable th2, boolean z10) {
        this.f25023a = th2;
        this._handled = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f25022b.get(this) != 0;
    }

    public final boolean b() {
        return f25022b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return h0.a(this) + '[' + this.f25023a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Throwable th2, boolean z10, int i10, g gVar) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
