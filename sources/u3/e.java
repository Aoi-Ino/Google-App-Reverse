package u3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b4.d;
import r3.c;
import s3.h;
import s3.v;

public final class e extends h {
    private final v I;

    public e(Context context, Looper looper, s3.e eVar, v vVar, c cVar, r3.h hVar) {
        super(context, looper, 270, eVar, cVar, hVar);
        this.I = vVar;
    }

    /* access modifiers changed from: protected */
    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    public final boolean H() {
        return true;
    }

    public final int f() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final p3.c[] u() {
        return d.f4441b;
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        return this.I.b();
    }
}
