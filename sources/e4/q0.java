package e4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t3.a;
import t3.c;

public final class q0 extends a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* renamed from: f  reason: collision with root package name */
    public static final q0 f10080f = new q0(Status.f5233k);

    /* renamed from: e  reason: collision with root package name */
    private final Status f10081e;

    public q0(Status status) {
        this.f10081e = status;
    }

    public final Status c() {
        return this.f10081e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f10081e, i10, false);
        c.b(parcel, a10);
    }
}
