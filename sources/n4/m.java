package n4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.a;
import s3.k0;
import t3.b;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        a aVar = null;
        k0 k0Var = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i11 == 2) {
                aVar = (a) b.c(parcel, o10, a.CREATOR);
            } else if (i11 != 3) {
                b.u(parcel, o10);
            } else {
                k0Var = (k0) b.c(parcel, o10, k0.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new l(i10, aVar, k0Var);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
