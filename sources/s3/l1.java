package s3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import d4.a;
import d4.c;

public final class l1 extends a implements j {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account h() {
        Parcel c10 = c(2, d());
        Account account = (Account) c.a(c10, Account.CREATOR);
        c10.recycle();
        return account;
    }
}
