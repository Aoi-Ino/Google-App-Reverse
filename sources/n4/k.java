package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.i0;
import t3.b;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        i0 i0Var = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i11 != 2) {
                b.u(parcel, o10);
            } else {
                i0Var = (i0) b.c(parcel, o10, i0.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new j(i10, i0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
