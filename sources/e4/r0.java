package e4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t3.b;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        Status status = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            if (b.i(o10) != 1) {
                b.u(parcel, o10);
            } else {
                status = (Status) b.c(parcel, o10, Status.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new q0(status);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q0[i10];
    }
}
