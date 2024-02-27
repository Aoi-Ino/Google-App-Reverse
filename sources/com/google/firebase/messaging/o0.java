package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t3.b;
import t3.c;

public class o0 implements Parcelable.Creator {
    static void c(n0 n0Var, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.d(parcel, 2, n0Var.f7529e, false);
        c.b(parcel, a10);
    }

    /* renamed from: a */
    public n0 createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            if (b.i(o10) != 2) {
                b.u(parcel, o10);
            } else {
                bundle = b.a(parcel, o10);
            }
        }
        b.h(parcel, v10);
        return new n0(bundle);
    }

    /* renamed from: b */
    public n0[] newArray(int i10) {
        return new n0[i10];
    }
}
