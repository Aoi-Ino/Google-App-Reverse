package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i4.g;
import java.util.Arrays;
import s3.n;
import t3.a;
import t3.c;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final LocationAvailability f5388j = new LocationAvailability(0, 1, 1, 0, (g[]) null, true);

    /* renamed from: k  reason: collision with root package name */
    public static final LocationAvailability f5389k = new LocationAvailability(1000, 1, 1, 0, (g[]) null, false);

    /* renamed from: e  reason: collision with root package name */
    private final int f5390e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5391f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5392g;

    /* renamed from: h  reason: collision with root package name */
    int f5393h;

    /* renamed from: i  reason: collision with root package name */
    private final g[] f5394i;

    LocationAvailability(int i10, int i11, int i12, long j10, g[] gVarArr, boolean z10) {
        this.f5393h = i10 < 1000 ? 0 : 1000;
        this.f5390e = i11;
        this.f5391f = i12;
        this.f5392g = j10;
        this.f5394i = gVarArr;
    }

    public boolean c() {
        return this.f5393h < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f5390e == locationAvailability.f5390e && this.f5391f == locationAvailability.f5391f && this.f5392g == locationAvailability.f5392g && this.f5393h == locationAvailability.f5393h && Arrays.equals(this.f5394i, locationAvailability.f5394i);
        }
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f5393h));
    }

    public String toString() {
        boolean c10 = c();
        return "LocationAvailability[" + c10 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f5390e);
        c.j(parcel, 2, this.f5391f);
        c.m(parcel, 3, this.f5392g);
        c.j(parcel, 4, this.f5393h);
        c.q(parcel, 5, this.f5394i, i10, false);
        c.c(parcel, 6, c());
        c.b(parcel, a10);
    }
}
