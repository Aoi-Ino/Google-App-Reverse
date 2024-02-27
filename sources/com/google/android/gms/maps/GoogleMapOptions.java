package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j4.g;
import k4.d;
import s3.n;
import t3.a;
import t3.c;

public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();

    /* renamed from: x  reason: collision with root package name */
    private static final Integer f5427x = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* renamed from: e  reason: collision with root package name */
    private Boolean f5428e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f5429f;

    /* renamed from: g  reason: collision with root package name */
    private int f5430g = -1;

    /* renamed from: h  reason: collision with root package name */
    private CameraPosition f5431h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f5432i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f5433j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f5434k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f5435l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f5436m;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f5437n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f5438o;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f5439p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f5440q;

    /* renamed from: r  reason: collision with root package name */
    private Float f5441r = null;

    /* renamed from: s  reason: collision with root package name */
    private Float f5442s = null;

    /* renamed from: t  reason: collision with root package name */
    private LatLngBounds f5443t = null;

    /* renamed from: u  reason: collision with root package name */
    private Boolean f5444u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f5445v = null;

    /* renamed from: w  reason: collision with root package name */
    private String f5446w = null;

    public GoogleMapOptions() {
    }

    public static CameraPosition D(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.f12707a);
        int i10 = g.f12713g;
        float f10 = obtainAttributes.hasValue(i10) ? obtainAttributes.getFloat(i10, 0.0f) : 0.0f;
        int i11 = g.f12714h;
        LatLng latLng = new LatLng((double) f10, (double) (obtainAttributes.hasValue(i11) ? obtainAttributes.getFloat(i11, 0.0f) : 0.0f));
        CameraPosition.a c10 = CameraPosition.c();
        c10.c(latLng);
        int i12 = g.f12716j;
        if (obtainAttributes.hasValue(i12)) {
            c10.e(obtainAttributes.getFloat(i12, 0.0f));
        }
        int i13 = g.f12710d;
        if (obtainAttributes.hasValue(i13)) {
            c10.a(obtainAttributes.getFloat(i13, 0.0f));
        }
        int i14 = g.f12715i;
        if (obtainAttributes.hasValue(i14)) {
            c10.d(obtainAttributes.getFloat(i14, 0.0f));
        }
        obtainAttributes.recycle();
        return c10.b();
    }

    public static LatLngBounds E(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.f12707a);
        int i10 = g.f12719m;
        Float valueOf = obtainAttributes.hasValue(i10) ? Float.valueOf(obtainAttributes.getFloat(i10, 0.0f)) : null;
        int i11 = g.f12720n;
        Float valueOf2 = obtainAttributes.hasValue(i11) ? Float.valueOf(obtainAttributes.getFloat(i11, 0.0f)) : null;
        int i12 = g.f12717k;
        Float valueOf3 = obtainAttributes.hasValue(i12) ? Float.valueOf(obtainAttributes.getFloat(i12, 0.0f)) : null;
        int i13 = g.f12718l;
        Float valueOf4 = obtainAttributes.hasValue(i13) ? Float.valueOf(obtainAttributes.getFloat(i13, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static GoogleMapOptions g(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.f12707a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i10 = g.f12723q;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.s(obtainAttributes.getInt(i10, -1));
        }
        int i11 = g.A;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.A(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = g.f12732z;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.z(obtainAttributes.getBoolean(i12, false));
        }
        int i13 = g.f12724r;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.f(obtainAttributes.getBoolean(i13, true));
        }
        int i14 = g.f12726t;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.v(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = g.f12728v;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.x(obtainAttributes.getBoolean(i15, true));
        }
        int i16 = g.f12727u;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.w(obtainAttributes.getBoolean(i16, true));
        }
        int i17 = g.f12729w;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.y(obtainAttributes.getBoolean(i17, true));
        }
        int i18 = g.f12731y;
        if (obtainAttributes.hasValue(i18)) {
            googleMapOptions.C(obtainAttributes.getBoolean(i18, true));
        }
        int i19 = g.f12730x;
        if (obtainAttributes.hasValue(i19)) {
            googleMapOptions.B(obtainAttributes.getBoolean(i19, true));
        }
        int i20 = g.f12721o;
        if (obtainAttributes.hasValue(i20)) {
            googleMapOptions.p(obtainAttributes.getBoolean(i20, false));
        }
        int i21 = g.f12725s;
        if (obtainAttributes.hasValue(i21)) {
            googleMapOptions.r(obtainAttributes.getBoolean(i21, true));
        }
        int i22 = g.f12708b;
        if (obtainAttributes.hasValue(i22)) {
            googleMapOptions.c(obtainAttributes.getBoolean(i22, false));
        }
        int i23 = g.f12712f;
        if (obtainAttributes.hasValue(i23)) {
            googleMapOptions.u(obtainAttributes.getFloat(i23, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i23)) {
            googleMapOptions.t(obtainAttributes.getFloat(g.f12711e, Float.POSITIVE_INFINITY));
        }
        int i24 = g.f12709c;
        if (obtainAttributes.hasValue(i24)) {
            googleMapOptions.d(Integer.valueOf(obtainAttributes.getColor(i24, f5427x.intValue())));
        }
        int i25 = g.f12722p;
        if (obtainAttributes.hasValue(i25) && (string = obtainAttributes.getString(i25)) != null && !string.isEmpty()) {
            googleMapOptions.q(string);
        }
        googleMapOptions.o(E(context, attributeSet));
        googleMapOptions.e(D(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions A(boolean z10) {
        this.f5428e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions B(boolean z10) {
        this.f5432i = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions C(boolean z10) {
        this.f5435l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions c(boolean z10) {
        this.f5440q = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions d(Integer num) {
        this.f5445v = num;
        return this;
    }

    public GoogleMapOptions e(CameraPosition cameraPosition) {
        this.f5431h = cameraPosition;
        return this;
    }

    public GoogleMapOptions f(boolean z10) {
        this.f5433j = Boolean.valueOf(z10);
        return this;
    }

    public Integer h() {
        return this.f5445v;
    }

    public CameraPosition i() {
        return this.f5431h;
    }

    public LatLngBounds j() {
        return this.f5443t;
    }

    public String k() {
        return this.f5446w;
    }

    public int l() {
        return this.f5430g;
    }

    public Float m() {
        return this.f5442s;
    }

    public Float n() {
        return this.f5441r;
    }

    public GoogleMapOptions o(LatLngBounds latLngBounds) {
        this.f5443t = latLngBounds;
        return this;
    }

    public GoogleMapOptions p(boolean z10) {
        this.f5438o = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions q(String str) {
        this.f5446w = str;
        return this;
    }

    public GoogleMapOptions r(boolean z10) {
        this.f5439p = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions s(int i10) {
        this.f5430g = i10;
        return this;
    }

    public GoogleMapOptions t(float f10) {
        this.f5442s = Float.valueOf(f10);
        return this;
    }

    public String toString() {
        return n.c(this).a("MapType", Integer.valueOf(this.f5430g)).a("LiteMode", this.f5438o).a("Camera", this.f5431h).a("CompassEnabled", this.f5433j).a("ZoomControlsEnabled", this.f5432i).a("ScrollGesturesEnabled", this.f5434k).a("ZoomGesturesEnabled", this.f5435l).a("TiltGesturesEnabled", this.f5436m).a("RotateGesturesEnabled", this.f5437n).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f5444u).a("MapToolbarEnabled", this.f5439p).a("AmbientEnabled", this.f5440q).a("MinZoomPreference", this.f5441r).a("MaxZoomPreference", this.f5442s).a("BackgroundColor", this.f5445v).a("LatLngBoundsForCameraTarget", this.f5443t).a("ZOrderOnTop", this.f5428e).a("UseViewLifecycleInFragment", this.f5429f).toString();
    }

    public GoogleMapOptions u(float f10) {
        this.f5441r = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions v(boolean z10) {
        this.f5437n = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions w(boolean z10) {
        this.f5434k = Boolean.valueOf(z10);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, d.a(this.f5428e));
        c.e(parcel, 3, d.a(this.f5429f));
        c.j(parcel, 4, l());
        c.n(parcel, 5, i(), i10, false);
        c.e(parcel, 6, d.a(this.f5432i));
        c.e(parcel, 7, d.a(this.f5433j));
        c.e(parcel, 8, d.a(this.f5434k));
        c.e(parcel, 9, d.a(this.f5435l));
        c.e(parcel, 10, d.a(this.f5436m));
        c.e(parcel, 11, d.a(this.f5437n));
        c.e(parcel, 12, d.a(this.f5438o));
        c.e(parcel, 14, d.a(this.f5439p));
        c.e(parcel, 15, d.a(this.f5440q));
        c.h(parcel, 16, n(), false);
        c.h(parcel, 17, m(), false);
        c.n(parcel, 18, j(), i10, false);
        c.e(parcel, 19, d.a(this.f5444u));
        c.l(parcel, 20, h(), false);
        c.o(parcel, 21, k(), false);
        c.b(parcel, a10);
    }

    public GoogleMapOptions x(boolean z10) {
        this.f5444u = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions y(boolean z10) {
        this.f5436m = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions z(boolean z10) {
        this.f5429f = Boolean.valueOf(z10);
        return this;
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f5428e = d.b(b10);
        this.f5429f = d.b(b11);
        this.f5430g = i10;
        this.f5431h = cameraPosition;
        this.f5432i = d.b(b12);
        this.f5433j = d.b(b13);
        this.f5434k = d.b(b14);
        this.f5435l = d.b(b15);
        this.f5436m = d.b(b16);
        this.f5437n = d.b(b17);
        this.f5438o = d.b(b18);
        this.f5439p = d.b(b19);
        this.f5440q = d.b(b20);
        this.f5441r = f10;
        this.f5442s = f11;
        this.f5443t = latLngBounds;
        this.f5444u = d.b(b21);
        this.f5445v = num;
        this.f5446w = str;
    }
}
