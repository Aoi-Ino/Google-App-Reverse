package k4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import f4.a;
import f4.f;
import z3.b;

public final class m extends a implements c {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final b G() {
        Parcel c10 = c(8, d());
        b d10 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d10;
    }

    public final void J(f fVar) {
        Parcel d10 = d();
        f.c(d10, fVar);
        j(9, d10);
    }

    public final void i(Bundle bundle) {
        Parcel d10 = d();
        f.b(d10, bundle);
        j(2, d10);
    }
}
