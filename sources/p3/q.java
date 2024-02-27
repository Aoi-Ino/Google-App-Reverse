package p3;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b4.i;

final class q extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f14658b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(i iVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f14658b = iVar;
        this.f14657a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int f10 = this.f14658b.f(this.f14657a);
        if (this.f14658b.i(f10)) {
            this.f14658b.n(this.f14657a, f10);
        }
    }
}
