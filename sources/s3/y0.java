package s3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p3.c;
import t3.a;

public final class y0 extends a {
    public static final Parcelable.Creator<y0> CREATOR = new z0();

    /* renamed from: e  reason: collision with root package name */
    Bundle f16048e;

    /* renamed from: f  reason: collision with root package name */
    c[] f16049f;

    /* renamed from: g  reason: collision with root package name */
    int f16050g;

    /* renamed from: h  reason: collision with root package name */
    f f16051h;

    y0(Bundle bundle, c[] cVarArr, int i10, f fVar) {
        this.f16048e = bundle;
        this.f16049f = cVarArr;
        this.f16050g = i10;
        this.f16051h = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = t3.c.a(parcel);
        t3.c.d(parcel, 1, this.f16048e, false);
        t3.c.q(parcel, 2, this.f16049f, i10, false);
        t3.c.j(parcel, 3, this.f16050g);
        t3.c.n(parcel, 4, this.f16051h, i10, false);
        t3.c.b(parcel, a10);
    }
}
