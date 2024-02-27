package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l4.h;
import s3.n;
import s3.o;
import t3.a;
import t3.c;

public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new h();

    /* renamed from: e  reason: collision with root package name */
    public final LatLng f5467e;

    /* renamed from: f  reason: collision with root package name */
    public final LatLng f5468f;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        o.j(latLng, "southwest must not be null.");
        o.j(latLng2, "northeast must not be null.");
        double d10 = latLng2.f5465e;
        double d11 = latLng.f5465e;
        o.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f5465e));
        this.f5467e = latLng;
        this.f5468f = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f5467e.equals(latLngBounds.f5467e) && this.f5468f.equals(latLngBounds.f5468f);
    }

    public int hashCode() {
        return n.b(this.f5467e, this.f5468f);
    }

    public String toString() {
        return n.c(this).a("southwest", this.f5467e).a("northeast", this.f5468f).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f5467e;
        int a10 = c.a(parcel);
        c.n(parcel, 2, latLng, i10, false);
        c.n(parcel, 3, this.f5468f, i10, false);
        c.b(parcel, a10);
    }
}
