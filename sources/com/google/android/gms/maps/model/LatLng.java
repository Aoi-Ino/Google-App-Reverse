package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l4.i;
import t3.a;
import t3.c;

public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    public final double f5465e;

    /* renamed from: f  reason: collision with root package name */
    public final double f5466f;

    public LatLng(double d10, double d11) {
        this.f5466f = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d11;
        this.f5465e = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f5465e) == Double.doubleToLongBits(latLng.f5465e) && Double.doubleToLongBits(this.f5466f) == Double.doubleToLongBits(latLng.f5466f);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5465e);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5466f);
        return ((((int) j10) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f5465e + "," + this.f5466f + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f5465e;
        int a10 = c.a(parcel);
        c.f(parcel, 2, d10);
        c.f(parcel, 3, this.f5466f);
        c.b(parcel, a10);
    }
}
