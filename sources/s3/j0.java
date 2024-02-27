package s3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import t3.b;

public final class j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int v10 = b.v(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            int i12 = b.i(o10);
            if (i12 == 1) {
                i10 = b.q(parcel, o10);
            } else if (i12 == 2) {
                account = (Account) b.c(parcel, o10, Account.CREATOR);
            } else if (i12 == 3) {
                i11 = b.q(parcel, o10);
            } else if (i12 != 4) {
                b.u(parcel, o10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.c(parcel, o10, GoogleSignInAccount.CREATOR);
            }
        }
        b.h(parcel, v10);
        return new i0(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new i0[i10];
    }
}
