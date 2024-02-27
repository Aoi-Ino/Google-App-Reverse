package k4;

import android.os.IBinder;
import android.os.Parcel;
import f4.a;
import f4.c;
import f4.d;
import f4.f;
import l4.e;
import z3.b;

public final class l extends a implements b {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final void V(b bVar) {
        Parcel d10 = d();
        f.c(d10, bVar);
        j(5, d10);
    }

    public final d W(e eVar) {
        Parcel d10 = d();
        f.b(d10, eVar);
        Parcel c10 = c(11, d10);
        d d11 = c.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }
}
