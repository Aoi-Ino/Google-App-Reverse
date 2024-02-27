package o3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            if (b.i(o10) != 1) {
                b.u(parcel, o10);
            } else {
                intent = (Intent) b.c(parcel, o10, Intent.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
