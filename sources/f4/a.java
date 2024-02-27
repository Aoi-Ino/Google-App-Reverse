package f4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f11325b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11326c;

    protected a(IBinder iBinder, String str) {
        this.f11325b = iBinder;
        this.f11326c = str;
    }

    public final IBinder asBinder() {
        return this.f11325b;
    }

    /* access modifiers changed from: protected */
    public final Parcel c(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11325b.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11326c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void j(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11325b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
