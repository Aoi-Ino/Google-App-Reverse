package n4;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import b4.c;

public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void l0(j jVar, f fVar) {
        Parcel c10 = c();
        c.c(c10, jVar);
        c.d(c10, fVar);
        d(12, c10);
    }
}
