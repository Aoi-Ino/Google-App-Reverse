package t5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class g0 extends d0 implements i0 {
    g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void N(String str, Bundle bundle, k0 k0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.c(c10, k0Var);
        d(3, c10);
    }

    public final void c0(String str, Bundle bundle, k0 k0Var) {
        Parcel c10 = c();
        c10.writeString(str);
        f0.b(c10, bundle);
        f0.c(c10, k0Var);
        d(2, c10);
    }
}
