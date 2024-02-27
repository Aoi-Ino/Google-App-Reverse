package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new r0();

    /* renamed from: e  reason: collision with root package name */
    private final int f16025e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16026f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16027g;

    /* renamed from: h  reason: collision with root package name */
    private final int f16028h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16029i;

    public q(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f16025e = i10;
        this.f16026f = z10;
        this.f16027g = z11;
        this.f16028h = i11;
        this.f16029i = i12;
    }

    public int c() {
        return this.f16028h;
    }

    public int d() {
        return this.f16029i;
    }

    public boolean e() {
        return this.f16026f;
    }

    public boolean f() {
        return this.f16027g;
    }

    public int g() {
        return this.f16025e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, g());
        c.c(parcel, 2, e());
        c.c(parcel, 3, f());
        c.j(parcel, 4, c());
        c.j(parcel, 5, d());
        c.b(parcel, a10);
    }
}
