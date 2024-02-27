package lm;

import bm.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pl.x;

final class i1 extends m1 {

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24966j = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i  reason: collision with root package name */
    private final l f24967i;

    public i1(l lVar) {
        this.f24967i = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        x((Throwable) obj);
        return x.f30437a;
    }

    public void x(Throwable th2) {
        if (f24966j.compareAndSet(this, 0, 1)) {
            this.f24967i.invoke(th2);
        }
    }
}
