package retrofit2;

import pl.p;
import pl.q;
import tl.d;

final class KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 implements Runnable {
    final /* synthetic */ d $continuation;
    final /* synthetic */ Exception $this_suspendAndThrow$inlined;

    KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1(d dVar, Exception exc) {
        this.$continuation = dVar;
        this.$this_suspendAndThrow$inlined = exc;
    }

    public final void run() {
        d b10 = c.b(this.$continuation);
        Exception exc = this.$this_suspendAndThrow$inlined;
        p.a aVar = p.f30426e;
        b10.resumeWith(p.a(q.a(exc)));
    }
}
