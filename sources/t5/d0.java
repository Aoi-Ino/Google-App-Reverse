package t5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class d0 implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f16528b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16529c;

    protected d0(IBinder iBinder, String str) {
        this.f16528b = iBinder;
        this.f16529c = str;
    }

    public final IBinder asBinder() {
        return this.f16528b;
    }

    /* access modifiers changed from: protected */
    public final Parcel c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16529c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void d(int i10, Parcel parcel) {
        try {
            this.f16528b.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
