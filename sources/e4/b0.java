package e4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 1;
        y yVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel, o10);
                    break;
                case 2:
                    yVar = (y) b.c(parcel, o10, y.CREATOR);
                    break;
                case 3:
                    iBinder = b.p(parcel, o10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.c(parcel, o10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.p(parcel, o10);
                    break;
                case 6:
                    iBinder3 = b.p(parcel, o10);
                    break;
                case 8:
                    str = b.d(parcel, o10);
                    break;
                default:
                    b.u(parcel, o10);
                    break;
            }
        }
        b.h(parcel, v10);
        return new a0(i10, yVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
