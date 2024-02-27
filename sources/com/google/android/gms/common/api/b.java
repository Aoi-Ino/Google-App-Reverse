package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p3.a;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = t3.b.v(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        while (parcel.dataPosition() < v10) {
            int o10 = t3.b.o(parcel);
            int i12 = t3.b.i(o10);
            if (i12 == 1) {
                i11 = t3.b.q(parcel, o10);
            } else if (i12 == 2) {
                str = t3.b.d(parcel, o10);
            } else if (i12 == 3) {
                pendingIntent = (PendingIntent) t3.b.c(parcel, o10, PendingIntent.CREATOR);
            } else if (i12 == 4) {
                aVar = (a) t3.b.c(parcel, o10, a.CREATOR);
            } else if (i12 != 1000) {
                t3.b.u(parcel, o10);
            } else {
                i10 = t3.b.q(parcel, o10);
            }
        }
        t3.b.h(parcel, v10);
        return new Status(i10, i11, str, pendingIntent, aVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
