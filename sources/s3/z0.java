package s3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p3.c;
import t3.b;

public final class z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        Bundle bundle = null;
        f fVar = null;
        int i10 = 0;
        c[] cVarArr = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i11 = b.i(o10);
            if (i11 == 1) {
                bundle = b.a(parcel, o10);
            } else if (i11 == 2) {
                cVarArr = (c[]) b.f(parcel, o10, c.CREATOR);
            } else if (i11 == 3) {
                i10 = b.q(parcel, o10);
            } else if (i11 != 4) {
                b.u(parcel, o10);
            } else {
                fVar = (f) b.c(parcel, o10, f.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new y0(bundle, cVarArr, i10, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new y0[i10];
    }
}
