package s3;

import android.os.Bundle;
import android.os.Parcel;
import d4.b;
import d4.c;

public abstract class n0 extends b implements k {
    public n0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c.b(parcel);
            i0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            c.b(parcel);
            f(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            c.b(parcel);
            B(parcel.readInt(), parcel.readStrongBinder(), (y0) c.a(parcel, y0.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
