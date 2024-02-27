package i4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import e4.e;
import e4.k;

public abstract class n extends e implements o {
    public n() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static o d(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof o ? (o) queryLocalInterface : new m(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            k.b(parcel);
            j0((LocationResult) k.a(parcel, LocationResult.CREATOR));
        } else if (i10 == 2) {
            k.b(parcel);
            z((LocationAvailability) k.a(parcel, LocationAvailability.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            g();
        }
        return true;
    }
}
