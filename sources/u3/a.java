package u3;

import android.os.IBinder;
import android.os.Parcel;
import b4.c;
import s3.s;

public final class a extends b4.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void l0(s sVar) {
        Parcel c10 = c();
        c.c(c10, sVar);
        j(1, c10);
    }
}
