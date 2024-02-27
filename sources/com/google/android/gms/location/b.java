package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import e4.u;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = t3.b.v(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j15 = -1;
        String str = null;
        u uVar = null;
        while (parcel.dataPosition() < v10) {
            int o10 = t3.b.o(parcel);
            switch (t3.b.i(o10)) {
                case 1:
                    i10 = t3.b.q(parcel2, o10);
                    break;
                case 2:
                    j10 = t3.b.s(parcel2, o10);
                    break;
                case 3:
                    j11 = t3.b.s(parcel2, o10);
                    break;
                case 5:
                    j13 = t3.b.s(parcel2, o10);
                    break;
                case 6:
                    i11 = t3.b.q(parcel2, o10);
                    break;
                case 7:
                    f10 = t3.b.m(parcel2, o10);
                    break;
                case 8:
                    j12 = t3.b.s(parcel2, o10);
                    break;
                case 9:
                    z10 = t3.b.j(parcel2, o10);
                    break;
                case 10:
                    j14 = t3.b.s(parcel2, o10);
                    break;
                case 11:
                    j15 = t3.b.s(parcel2, o10);
                    break;
                case 12:
                    i12 = t3.b.q(parcel2, o10);
                    break;
                case 13:
                    i13 = t3.b.q(parcel2, o10);
                    break;
                case 14:
                    str = t3.b.d(parcel2, o10);
                    break;
                case 15:
                    z11 = t3.b.j(parcel2, o10);
                    break;
                case 16:
                    workSource = (WorkSource) t3.b.c(parcel2, o10, WorkSource.CREATOR);
                    break;
                case 17:
                    uVar = (u) t3.b.c(parcel2, o10, u.CREATOR);
                    break;
                default:
                    t3.b.u(parcel2, o10);
                    break;
            }
        }
        t3.b.h(parcel2, v10);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, str, z11, workSource, uVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
