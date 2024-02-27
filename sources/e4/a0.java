package e4;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i4.n;
import i4.o;
import i4.q;
import i4.r;
import t3.a;
import t3.c;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: e  reason: collision with root package name */
    private final int f10042e;

    /* renamed from: f  reason: collision with root package name */
    private final y f10043f;

    /* renamed from: g  reason: collision with root package name */
    private final r f10044g;

    /* renamed from: h  reason: collision with root package name */
    private final o f10045h;

    /* renamed from: i  reason: collision with root package name */
    private final PendingIntent f10046i;

    /* renamed from: j  reason: collision with root package name */
    private final u0 f10047j;

    /* renamed from: k  reason: collision with root package name */
    private final String f10048k;

    a0(int i10, y yVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f10042e = i10;
        this.f10043f = yVar;
        u0 u0Var = null;
        this.f10044g = iBinder != null ? q.d(iBinder) : null;
        this.f10046i = pendingIntent;
        this.f10045h = iBinder2 != null ? n.d(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            u0Var = queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(iBinder3);
        }
        this.f10047j = u0Var;
        this.f10048k = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f10042e);
        c.n(parcel, 2, this.f10043f, i10, false);
        r rVar = this.f10044g;
        IBinder iBinder = null;
        c.i(parcel, 3, rVar == null ? null : rVar.asBinder(), false);
        c.n(parcel, 4, this.f10046i, i10, false);
        o oVar = this.f10045h;
        c.i(parcel, 5, oVar == null ? null : oVar.asBinder(), false);
        u0 u0Var = this.f10047j;
        if (u0Var != null) {
            iBinder = u0Var.asBinder();
        }
        c.i(parcel, 6, iBinder, false);
        c.o(parcel, 8, this.f10048k, false);
        c.b(parcel, a10);
    }
}
