package r3;

import android.os.IInterface;
import android.os.Parcel;
import b4.b;
import b4.c;
import com.google.android.gms.common.api.Status;

public interface d extends IInterface {

    public static abstract class a extends b implements d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        public final boolean l0(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            c.b(parcel);
            H((Status) c.a(parcel, Status.CREATOR));
            return true;
        }
    }

    void H(Status status);
}
