package p3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                str = b.d(parcel, o10);
            } else if (i11 == 2) {
                i10 = b.q(parcel, o10);
            } else if (i11 != 3) {
                b.u(parcel, o10);
            } else {
                j10 = b.s(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new c(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
