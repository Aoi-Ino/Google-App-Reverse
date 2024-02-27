package retrofit2;

import bm.l;
import cm.m;
import pl.x;

final class KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 extends m implements l {
    final /* synthetic */ Call $this_awaitResponse$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(Call call) {
        super(1);
        this.$this_awaitResponse$inlined = call;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x.f30437a;
    }

    public final void invoke(Throwable th2) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
