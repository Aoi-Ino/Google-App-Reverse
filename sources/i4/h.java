package i4;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 1;
        int i11 = 1;
        long j10 = -1;
        long j11 = -1;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i12 = b.i(o10);
            if (i12 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i12 == 2) {
                i11 = b.q(parcel, o10);
            } else if (i12 == 3) {
                j10 = b.s(parcel, o10);
            } else if (i12 != 4) {
                b.u(parcel, o10);
            } else {
                j11 = b.s(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new g(i10, i11, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
