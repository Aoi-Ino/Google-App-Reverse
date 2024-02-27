package s3;

import android.os.Parcel;
import d4.b;
import d4.c;

public abstract class m1 extends b implements n1 {
    public m1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            z3.b b10 = b();
            parcel2.writeNoException();
            c.d(parcel2, b10);
        } else if (i10 != 2) {
            return false;
        } else {
            int g02 = g0();
            parcel2.writeNoException();
            parcel2.writeInt(g02);
        }
        return true;
    }
}
