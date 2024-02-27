package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p3.a;
import t3.b;

public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        IBinder iBinder = null;
        a aVar = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i11 == 2) {
                iBinder = b.p(parcel, o10);
            } else if (i11 == 3) {
                aVar = (a) b.c(parcel, o10, a.CREATOR);
            } else if (i11 == 4) {
                z10 = b.j(parcel, o10);
            } else if (i11 != 5) {
                b.u(parcel, o10);
            } else {
                z11 = b.j(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new k0(i10, iBinder, aVar, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
