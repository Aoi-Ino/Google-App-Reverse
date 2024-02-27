package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class u0 extends n0 {

    /* renamed from: b  reason: collision with root package name */
    private c f16038b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16039c;

    public u0(c cVar, int i10) {
        this.f16038b = cVar;
        this.f16039c = i10;
    }

    public final void B(int i10, IBinder iBinder, y0 y0Var) {
        c cVar = this.f16038b;
        o.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.i(y0Var);
        c.a0(cVar, y0Var);
        i0(i10, iBinder, y0Var.f16048e);
    }

    public final void f(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void i0(int i10, IBinder iBinder, Bundle bundle) {
        o.j(this.f16038b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f16038b.M(i10, iBinder, bundle, this.f16039c);
        this.f16038b = null;
    }
}
