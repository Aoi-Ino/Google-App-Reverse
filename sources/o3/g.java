package o3;

import android.os.Looper;
import android.os.Message;
import c4.f;

final class g extends f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f14390b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(c cVar, Looper looper) {
        super(looper);
        this.f14390b = cVar;
    }

    public final void handleMessage(Message message) {
        c.e(this.f14390b, message);
    }
}
