package n4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.k0;
import t3.a;
import t3.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    final int f14125e;

    /* renamed from: f  reason: collision with root package name */
    private final p3.a f14126f;

    /* renamed from: g  reason: collision with root package name */
    private final k0 f14127g;

    l(int i10, p3.a aVar, k0 k0Var) {
        this.f14125e = i10;
        this.f14126f = aVar;
        this.f14127g = k0Var;
    }

    public final p3.a c() {
        return this.f14126f;
    }

    public final k0 d() {
        return this.f14127g;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f14125e);
        c.n(parcel, 2, this.f14126f, i10, false);
        c.n(parcel, 3, this.f14127g, i10, false);
        c.b(parcel, a10);
    }
}
