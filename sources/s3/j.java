package s3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import d4.b;

public interface j extends IInterface {

    public static abstract class a extends b implements j {
        public static j d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof j ? (j) queryLocalInterface : new l1(iBinder);
        }
    }

    Account h();
}
