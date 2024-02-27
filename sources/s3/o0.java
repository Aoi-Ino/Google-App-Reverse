package s3;

import android.os.IBinder;
import android.os.Parcel;

final class o0 implements l {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f16017b;

    o0(IBinder iBinder) {
        this.f16017b = iBinder;
    }

    public final void X(k kVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                b1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16017b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final IBinder asBinder() {
        return this.f16017b;
    }
}
