package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new h0();

    /* renamed from: e  reason: collision with root package name */
    private final int f16003e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16004f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16005g;

    /* renamed from: h  reason: collision with root package name */
    private final long f16006h;

    /* renamed from: i  reason: collision with root package name */
    private final long f16007i;

    /* renamed from: j  reason: collision with root package name */
    private final String f16008j;

    /* renamed from: k  reason: collision with root package name */
    private final String f16009k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16010l;

    /* renamed from: m  reason: collision with root package name */
    private final int f16011m;

    public m(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f16003e = i10;
        this.f16004f = i11;
        this.f16005g = i12;
        this.f16006h = j10;
        this.f16007i = j11;
        this.f16008j = str;
        this.f16009k = str2;
        this.f16010l = i13;
        this.f16011m = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f16003e);
        c.j(parcel, 2, this.f16004f);
        c.j(parcel, 3, this.f16005g);
        c.m(parcel, 4, this.f16006h);
        c.m(parcel, 5, this.f16007i);
        c.o(parcel, 6, this.f16008j, false);
        c.o(parcel, 7, this.f16009k, false);
        c.j(parcel, 8, this.f16010l);
        c.j(parcel, 9, this.f16011m);
        c.b(parcel, a10);
    }
}
