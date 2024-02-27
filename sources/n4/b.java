package n4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    final int f14118e;

    /* renamed from: f  reason: collision with root package name */
    private int f14119f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f14120g;

    b(int i10, int i11, Intent intent) {
        this.f14118e = i10;
        this.f14119f = i11;
        this.f14120g = intent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f14118e);
        c.j(parcel, 2, this.f14119f);
        c.n(parcel, 3, this.f14120g, i10, false);
        c.b(parcel, a10);
    }
}
