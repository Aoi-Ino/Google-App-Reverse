package t5;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h0 extends e0 implements i0 {
    public static i0 d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof i0 ? (i0) queryLocalInterface : new g0(iBinder);
    }
}
