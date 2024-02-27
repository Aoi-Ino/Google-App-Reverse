package w5;

import java.util.concurrent.CountDownLatch;

final class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f17908a = new CountDownLatch(1);

    /* synthetic */ v(u uVar) {
    }

    public final void a(Exception exc) {
        this.f17908a.countDown();
    }

    public final void b(Object obj) {
        this.f17908a.countDown();
    }

    public final void c() {
        this.f17908a.await();
    }
}
