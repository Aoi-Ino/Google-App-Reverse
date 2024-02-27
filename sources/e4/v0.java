package e4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import r3.d;

public final class v0 extends a implements w0 {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void I(w wVar, d dVar) {
        Parcel c10 = c();
        k.c(c10, wVar);
        k.d(c10, dVar);
        d(89, c10);
    }

    public final void Y(w wVar, LocationRequest locationRequest, d dVar) {
        Parcel c10 = c();
        k.c(c10, wVar);
        k.c(c10, locationRequest);
        k.d(c10, dVar);
        d(88, c10);
    }

    public final void u(a0 a0Var) {
        Parcel c10 = c();
        k.c(c10, a0Var);
        d(59, c10);
    }
}
