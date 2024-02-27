package e4;

import android.os.Parcel;

public abstract class t0 extends e implements u0 {
    public t0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            k.b(parcel);
            E((q0) k.a(parcel, q0.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            e();
        }
        return true;
    }
}
