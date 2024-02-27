package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f4437b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4438c;

    protected a(IBinder iBinder, String str) {
        this.f4437b = iBinder;
        this.f4438c = str;
    }

    public final IBinder asBinder() {
        return this.f4437b;
    }

    /* access modifiers changed from: protected */
    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4438c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void d(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4437b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void j(int i10, Parcel parcel) {
        try {
            this.f4437b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
