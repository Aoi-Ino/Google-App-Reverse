package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i13 = b.i(o10);
            if (i13 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i13 == 2) {
                z10 = b.j(parcel, o10);
            } else if (i13 == 3) {
                z11 = b.j(parcel, o10);
            } else if (i13 == 4) {
                i11 = b.q(parcel, o10);
            } else if (i13 != 5) {
                b.u(parcel, o10);
            } else {
                i12 = b.q(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new q(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
