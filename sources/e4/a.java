package e4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f10040b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10041c;

    protected a(IBinder iBinder, String str) {
        this.f10040b = iBinder;
        this.f10041c = str;
    }

    public final IBinder asBinder() {
        return this.f10040b;
    }

    /* access modifiers changed from: protected */
    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10041c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void d(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10040b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
