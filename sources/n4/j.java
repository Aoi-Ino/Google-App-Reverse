package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.i0;
import t3.a;
import t3.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    final int f14123e;

    /* renamed from: f  reason: collision with root package name */
    final i0 f14124f;

    j(int i10, i0 i0Var) {
        this.f14123e = i10;
        this.f14124f = i0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f14123e);
        c.n(parcel, 2, this.f14124f, i10, false);
        c.b(parcel, a10);
    }
}
