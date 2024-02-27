package e4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel, o10);
                    break;
                case 2:
                    iBinder = b.p(parcel, o10);
                    break;
                case 3:
                    iBinder2 = b.p(parcel, o10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.c(parcel, o10, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = b.d(parcel, o10);
                    break;
                case 6:
                    str2 = b.d(parcel, o10);
                    break;
                default:
                    b.u(parcel, o10);
                    break;
            }
        }
        b.h(parcel, v10);
        return new w(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
