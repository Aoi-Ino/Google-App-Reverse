package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l4.g;
import s3.n;
import s3.o;
import t3.c;

public final class CameraPosition extends t3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new g();

    /* renamed from: e  reason: collision with root package name */
    public final LatLng f5457e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5458f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5459g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5460h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LatLng f5461a;

        /* renamed from: b  reason: collision with root package name */
        private float f5462b;

        /* renamed from: c  reason: collision with root package name */
        private float f5463c;

        /* renamed from: d  reason: collision with root package name */
        private float f5464d;

        public a a(float f10) {
            this.f5464d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f5461a, this.f5462b, this.f5463c, this.f5464d);
        }

        public a c(LatLng latLng) {
            this.f5461a = (LatLng) o.j(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f5463c = f10;
            return this;
        }

        public a e(float f10) {
            this.f5462b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        o.j(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        o.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f5457e = latLng;
        this.f5458f = f10;
        this.f5459g = f11 + 0.0f;
        this.f5460h = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a c() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f5457e.equals(cameraPosition.f5457e) && Float.floatToIntBits(this.f5458f) == Float.floatToIntBits(cameraPosition.f5458f) && Float.floatToIntBits(this.f5459g) == Float.floatToIntBits(cameraPosition.f5459g) && Float.floatToIntBits(this.f5460h) == Float.floatToIntBits(cameraPosition.f5460h);
    }

    public int hashCode() {
        return n.b(this.f5457e, Float.valueOf(this.f5458f), Float.valueOf(this.f5459g), Float.valueOf(this.f5460h));
    }

    public String toString() {
        return n.c(this).a("target", this.f5457e).a("zoom", Float.valueOf(this.f5458f)).a("tilt", Float.valueOf(this.f5459g)).a("bearing", Float.valueOf(this.f5460h)).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f5457e;
        int a10 = c.a(parcel);
        c.n(parcel, 2, latLng, i10, false);
        c.g(parcel, 3, this.f5458f);
        c.g(parcel, 4, this.f5459g);
        c.g(parcel, 5, this.f5460h);
        c.b(parcel, a10);
    }
}
