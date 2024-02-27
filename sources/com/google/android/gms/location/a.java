package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import i4.g;
import t3.b;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = b.v(parcel);
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        long j10 = 0;
        g[] gVarArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i11 = b.q(parcel2, o10);
                    break;
                case 2:
                    i12 = b.q(parcel2, o10);
                    break;
                case 3:
                    j10 = b.s(parcel2, o10);
                    break;
                case 4:
                    i10 = b.q(parcel2, o10);
                    break;
                case 5:
                    gVarArr = (g[]) b.f(parcel2, o10, g.CREATOR);
                    break;
                case 6:
                    z10 = b.j(parcel2, o10);
                    break;
                default:
                    b.u(parcel2, o10);
                    break;
            }
        }
        b.h(parcel2, v10);
        return new LocationAvailability(i10, i11, i12, j10, gVarArr, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
