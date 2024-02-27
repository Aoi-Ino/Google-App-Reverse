package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i11 != 2) {
                b.u(parcel, o10);
            } else {
                str = b.d(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new Scope(i10, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
