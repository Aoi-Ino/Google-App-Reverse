package o3;

import android.util.Log;
import java.io.IOException;
import p4.j;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f14383e;

    public /* synthetic */ e(j jVar) {
        this.f14383e = jVar;
    }

    public final void run() {
        if (this.f14383e.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
