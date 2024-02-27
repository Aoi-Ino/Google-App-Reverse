package f4;

import android.os.IBinder;
import android.os.Parcel;

public final class b extends a implements d {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final int Z() {
        Parcel c10 = c(17, d());
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final boolean k(d dVar) {
        Parcel d10 = d();
        f.c(d10, dVar);
        Parcel c10 = c(16, d10);
        boolean d11 = f.d(c10);
        c10.recycle();
        return d11;
    }
}
