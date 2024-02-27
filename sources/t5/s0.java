package t5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class s0 extends d0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void R(Bundle bundle) {
        Parcel c10 = c();
        f0.b(c10, bundle);
        d(3, c10);
    }

    public final void a(Bundle bundle) {
        Parcel c10 = c();
        f0.b(c10, bundle);
        d(4, c10);
    }

    public final void p(Bundle bundle, Bundle bundle2) {
        Parcel c10 = c();
        f0.b(c10, bundle);
        f0.b(c10, bundle2);
        d(2, c10);
    }
}
