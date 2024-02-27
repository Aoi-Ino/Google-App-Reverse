package l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import t3.b;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i10 = b.i(o10);
            if (i10 == 2) {
                d10 = b.l(parcel, o10);
            } else if (i10 != 3) {
                b.u(parcel, o10);
            } else {
                d11 = b.l(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new LatLng(d10, d11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLng[i10];
    }
}
