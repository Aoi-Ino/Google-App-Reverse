package i4;

import android.os.IBinder;
import android.os.IInterface;
import e4.e;

public abstract class q extends e implements r {
    public static r d(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new p(iBinder);
    }
}
