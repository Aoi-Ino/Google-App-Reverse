package e4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p3.c;
import t3.b;

public final class p0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        List F = l0.F();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        u uVar = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel, o10);
                    break;
                case 2:
                    i11 = b.q(parcel, o10);
                    break;
                case 3:
                    str = b.d(parcel, o10);
                    break;
                case 4:
                    str2 = b.d(parcel, o10);
                    break;
                case 5:
                    i12 = b.q(parcel, o10);
                    break;
                case 6:
                    str3 = b.d(parcel, o10);
                    break;
                case 7:
                    uVar = (u) b.c(parcel, o10, u.CREATOR);
                    break;
                case 8:
                    F = b.g(parcel, o10, c.CREATOR);
                    break;
                default:
                    b.u(parcel, o10);
                    break;
            }
        }
        b.h(parcel, v10);
        return new u(i10, i11, str, str2, str3, i12, F, uVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
