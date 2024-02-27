package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t3.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        List list = LocationResult.f5425f;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            if (b.i(o10) != 1) {
                b.u(parcel, o10);
            } else {
                list = b.g(parcel, o10, Location.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
