package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import t3.b;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i10 = b.i(o10);
            if (i10 == 1) {
                arrayList = b.e(parcel, o10);
            } else if (i10 != 2) {
                b.u(parcel, o10);
            } else {
                str = b.d(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
