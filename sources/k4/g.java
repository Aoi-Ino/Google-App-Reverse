package k4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import f4.a;
import f4.f;
import z3.b;

public final class g extends a implements a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final b S(LatLng latLng, float f10) {
        Parcel d10 = d();
        f.b(d10, latLng);
        d10.writeFloat(f10);
        Parcel c10 = c(9, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }
}
