package l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import t3.b;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i10 = b.i(o10);
            if (i10 == 2) {
                latLng = (LatLng) b.c(parcel, o10, LatLng.CREATOR);
            } else if (i10 != 3) {
                b.u(parcel, o10);
            } else {
                latLng2 = (LatLng) b.c(parcel, o10, LatLng.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
