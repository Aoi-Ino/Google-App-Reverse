package o3;

import android.os.Parcel;
import android.os.Parcelable;

final class i implements Parcelable.Creator {
    i() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new k(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
