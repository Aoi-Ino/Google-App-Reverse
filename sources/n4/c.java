package n4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i12 = b.i(o10);
            if (i12 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i12 == 2) {
                i11 = b.q(parcel, o10);
            } else if (i12 != 3) {
                b.u(parcel, o10);
            } else {
                intent = (Intent) b.c(parcel, o10, Intent.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new b(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
