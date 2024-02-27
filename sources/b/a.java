package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4381a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static abstract class C0077a extends Binder implements a {

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        private static class C0078a implements a {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f4382b;

            C0078a(IBinder iBinder) {
                this.f4382b = iBinder;
            }

            public IBinder asBinder() {
                return this.f4382b;
            }
        }

        public C0077a() {
            attachInterface(this, a.f4381a);
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f4381a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0078a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f4381a;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                h0(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void h0(int i10, Bundle bundle);
}
