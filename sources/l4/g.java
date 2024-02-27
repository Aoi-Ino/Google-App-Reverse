package l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import t3.b;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        float f12 = 0.0f;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i10 = b.i(o10);
            if (i10 == 2) {
                latLng = (LatLng) b.c(parcel, o10, LatLng.CREATOR);
            } else if (i10 == 3) {
                f10 = b.m(parcel, o10);
            } else if (i10 == 4) {
                f12 = b.m(parcel, o10);
            } else if (i10 != 5) {
                b.u(parcel, o10);
            } else {
                f11 = b.m(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new CameraPosition(latLng, f10, f12, f11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
