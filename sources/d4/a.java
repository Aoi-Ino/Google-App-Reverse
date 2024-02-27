package d4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9743b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9744c;

    protected a(IBinder iBinder, String str) {
        this.f9743b = iBinder;
        this.f9744c = str;
    }

    public final IBinder asBinder() {
        return this.f9743b;
    }

    /* access modifiers changed from: protected */
    public final Parcel c(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f9743b.transact(i10, parcel, parcel, 0);
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
        obtain.writeInterfaceToken(this.f9744c);
        return obtain;
    }
}
