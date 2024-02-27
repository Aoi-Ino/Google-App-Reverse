package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class h0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = b.v(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i14 = -1;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel2, o10);
                    break;
                case 2:
                    i11 = b.q(parcel2, o10);
                    break;
                case 3:
                    i12 = b.q(parcel2, o10);
                    break;
                case 4:
                    j10 = b.s(parcel2, o10);
                    break;
                case 5:
                    j11 = b.s(parcel2, o10);
                    break;
                case 6:
                    str = b.d(parcel2, o10);
                    break;
                case 7:
                    str2 = b.d(parcel2, o10);
                    break;
                case 8:
                    i13 = b.q(parcel2, o10);
                    break;
                case 9:
                    i14 = b.q(parcel2, o10);
                    break;
                default:
                    b.u(parcel2, o10);
                    break;
            }
        }
        b.h(parcel2, v10);
        return new m(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
