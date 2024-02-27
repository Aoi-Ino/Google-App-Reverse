package p3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i12 = b.i(o10);
            if (i12 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i12 == 2) {
                i11 = b.q(parcel, o10);
            } else if (i12 == 3) {
                pendingIntent = (PendingIntent) b.c(parcel, o10, PendingIntent.CREATOR);
            } else if (i12 != 4) {
                b.u(parcel, o10);
            } else {
                str = b.d(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new a(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
