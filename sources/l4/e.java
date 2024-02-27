package l4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import t3.a;
import t3.c;
import z3.b;
import z3.d;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* renamed from: e  reason: collision with root package name */
    private LatLng f13274e;

    /* renamed from: f  reason: collision with root package name */
    private String f13275f;

    /* renamed from: g  reason: collision with root package name */
    private String f13276g;

    /* renamed from: h  reason: collision with root package name */
    private b f13277h;

    /* renamed from: i  reason: collision with root package name */
    private float f13278i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private float f13279j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13280k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13281l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13282m = false;

    /* renamed from: n  reason: collision with root package name */
    private float f13283n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f13284o = 0.5f;

    /* renamed from: p  reason: collision with root package name */
    private float f13285p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    private float f13286q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f13287r;

    /* renamed from: s  reason: collision with root package name */
    private int f13288s = 0;

    /* renamed from: t  reason: collision with root package name */
    private View f13289t;

    /* renamed from: u  reason: collision with root package name */
    private int f13290u;

    /* renamed from: v  reason: collision with root package name */
    private String f13291v;

    /* renamed from: w  reason: collision with root package name */
    private float f13292w;

    public e() {
    }

    public float c() {
        return this.f13286q;
    }

    public float d() {
        return this.f13278i;
    }

    public float e() {
        return this.f13279j;
    }

    public float f() {
        return this.f13284o;
    }

    public float g() {
        return this.f13285p;
    }

    public LatLng h() {
        return this.f13274e;
    }

    public float i() {
        return this.f13283n;
    }

    public String j() {
        return this.f13276g;
    }

    public String k() {
        return this.f13275f;
    }

    public float l() {
        return this.f13287r;
    }

    public boolean m() {
        return this.f13280k;
    }

    public boolean n() {
        return this.f13282m;
    }

    public boolean o() {
        return this.f13281l;
    }

    public e p(LatLng latLng) {
        if (latLng != null) {
            this.f13274e = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public e q(String str) {
        this.f13275f = str;
        return this;
    }

    public final int r() {
        return this.f13290u;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 2, h(), i10, false);
        c.o(parcel, 3, k(), false);
        c.o(parcel, 4, j(), false);
        b bVar = this.f13277h;
        c.i(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        c.g(parcel, 6, d());
        c.g(parcel, 7, e());
        c.c(parcel, 8, m());
        c.c(parcel, 9, o());
        c.c(parcel, 10, n());
        c.g(parcel, 11, i());
        c.g(parcel, 12, f());
        c.g(parcel, 13, g());
        c.g(parcel, 14, c());
        c.g(parcel, 15, l());
        c.j(parcel, 17, this.f13288s);
        c.i(parcel, 18, d.l0(this.f13289t).asBinder(), false);
        c.j(parcel, 19, this.f13290u);
        c.o(parcel, 20, this.f13291v, false);
        c.g(parcel, 21, this.f13292w);
        c.b(parcel, a10);
    }

    e(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f13274e = latLng;
        this.f13275f = str;
        this.f13276g = str2;
        View view = null;
        if (iBinder == null) {
            this.f13277h = null;
        } else {
            this.f13277h = new b(b.a.d(iBinder));
        }
        this.f13278i = f10;
        this.f13279j = f11;
        this.f13280k = z10;
        this.f13281l = z11;
        this.f13282m = z12;
        this.f13283n = f12;
        this.f13284o = f13;
        this.f13285p = f14;
        this.f13286q = f15;
        this.f13287r = f16;
        this.f13290u = i11;
        this.f13288s = i10;
        b d10 = b.a.d(iBinder2);
        this.f13289t = d10 != null ? (View) d.j(d10) : view;
        this.f13291v = str3;
        this.f13292w = f17;
    }
}
