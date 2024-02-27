package o3;

import android.os.Bundle;

final class w extends x {
    w(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d((Object) null);
        } else {
            c(new y(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }
}
