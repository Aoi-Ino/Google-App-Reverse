package d4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        return false;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return c(i10, parcel, parcel2, i11);
    }
}
