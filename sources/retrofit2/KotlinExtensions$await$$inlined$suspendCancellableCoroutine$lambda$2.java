package retrofit2;

import bm.l;
import cm.m;
import pl.x;

final class KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 extends m implements l {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x.f30437a;
    }

    public final void invoke(Throwable th2) {
        this.$this_await$inlined.cancel();
    }
}
