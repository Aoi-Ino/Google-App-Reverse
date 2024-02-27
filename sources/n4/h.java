package n4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t3.a;
import t3.c;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    private final List f14121e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14122f;

    public h(List list, String str) {
        this.f14121e = list;
        this.f14122f = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f14121e, false);
        c.o(parcel, 2, this.f14122f, false);
        c.b(parcel, a10);
    }
}
