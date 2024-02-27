package s3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import t3.a;
import t3.c;

public final class i0 extends a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: e  reason: collision with root package name */
    final int f15988e;

    /* renamed from: f  reason: collision with root package name */
    private final Account f15989f;

    /* renamed from: g  reason: collision with root package name */
    private final int f15990g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleSignInAccount f15991h;

    i0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f15988e = i10;
        this.f15989f = account;
        this.f15990g = i11;
        this.f15991h = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f15988e);
        c.n(parcel, 2, this.f15989f, i10, false);
        c.j(parcel, 3, this.f15990g);
        c.n(parcel, 4, this.f15991h, i10, false);
        c.b(parcel, a10);
    }

    public i0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
