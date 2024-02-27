package s3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import t3.b;

public final class x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i11 != 2) {
                b.u(parcel, o10);
            } else {
                arrayList = b.g(parcel, o10, m.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new s(i10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
