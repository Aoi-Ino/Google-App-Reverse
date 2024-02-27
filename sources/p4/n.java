package p4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f14686a = new CountDownLatch(1);

    /* synthetic */ n(m mVar) {
    }

    public final void a(Exception exc) {
        this.f14686a.countDown();
    }

    public final void b(Object obj) {
        this.f14686a.countDown();
    }

    public final void c() {
        this.f14686a.countDown();
    }

    public final void d() {
        this.f14686a.await();
    }

    public final boolean e(long j10, TimeUnit timeUnit) {
        return this.f14686a.await(j10, timeUnit);
    }
}
