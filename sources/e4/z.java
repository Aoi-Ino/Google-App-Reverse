package e4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import s3.d;
import t3.b;

public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = b.v(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i10 = b.i(o10);
            if (i10 == 1) {
                locationRequest = (LocationRequest) b.c(parcel2, o10, LocationRequest.CREATOR);
            } else if (i10 != 5) {
                switch (i10) {
                    case 8:
                        z10 = b.j(parcel2, o10);
                        break;
                    case 9:
                        z11 = b.j(parcel2, o10);
                        break;
                    case 10:
                        str = b.d(parcel2, o10);
                        break;
                    case 11:
                        z12 = b.j(parcel2, o10);
                        break;
                    case 12:
                        z13 = b.j(parcel2, o10);
                        break;
                    case 13:
                        str2 = b.d(parcel2, o10);
                        break;
                    case 14:
                        j10 = b.s(parcel2, o10);
                        break;
                    default:
                        b.u(parcel2, o10);
                        break;
                }
            } else {
                arrayList = b.g(parcel2, o10, d.CREATOR);
            }
        }
        b.h(parcel2, v10);
        return new y(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
