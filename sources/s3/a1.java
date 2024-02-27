package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.b;

public final class a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    qVar = (q) b.c(parcel, o10, q.CREATOR);
                    break;
                case 2:
                    z10 = b.j(parcel, o10);
                    break;
                case 3:
                    z11 = b.j(parcel, o10);
                    break;
                case 4:
                    iArr = b.b(parcel, o10);
                    break;
                case 5:
                    i10 = b.q(parcel, o10);
                    break;
                case 6:
                    iArr2 = b.b(parcel, o10);
                    break;
                default:
                    b.u(parcel, o10);
                    break;
            }
        }
        b.h(parcel, v10);
        return new f(qVar, z10, z11, iArr, i10, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
