package t5;

import android.os.Bundle;
import android.os.Parcel;

public abstract class j0 extends e0 implements k0 {
    public j0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            a((Bundle) f0.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            y((Bundle) f0.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
