package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e4.c0;
import e4.u;
import i4.i;
import i4.j;
import i4.l;
import s3.n;
import s3.o;
import t3.c;
import w3.m;

public final class LocationRequest extends t3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    private int f5395e;

    /* renamed from: f  reason: collision with root package name */
    private long f5396f;

    /* renamed from: g  reason: collision with root package name */
    private long f5397g;

    /* renamed from: h  reason: collision with root package name */
    private long f5398h;

    /* renamed from: i  reason: collision with root package name */
    private long f5399i;

    /* renamed from: j  reason: collision with root package name */
    private int f5400j;

    /* renamed from: k  reason: collision with root package name */
    private float f5401k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5402l;

    /* renamed from: m  reason: collision with root package name */
    private long f5403m;

    /* renamed from: n  reason: collision with root package name */
    private final int f5404n;

    /* renamed from: o  reason: collision with root package name */
    private final int f5405o;

    /* renamed from: p  reason: collision with root package name */
    private final String f5406p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f5407q;

    /* renamed from: r  reason: collision with root package name */
    private final WorkSource f5408r;

    /* renamed from: s  reason: collision with root package name */
    private final u f5409s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5410a;

        /* renamed from: b  reason: collision with root package name */
        private long f5411b;

        /* renamed from: c  reason: collision with root package name */
        private long f5412c;

        /* renamed from: d  reason: collision with root package name */
        private long f5413d;

        /* renamed from: e  reason: collision with root package name */
        private long f5414e;

        /* renamed from: f  reason: collision with root package name */
        private int f5415f;

        /* renamed from: g  reason: collision with root package name */
        private float f5416g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5417h;

        /* renamed from: i  reason: collision with root package name */
        private long f5418i;

        /* renamed from: j  reason: collision with root package name */
        private int f5419j;

        /* renamed from: k  reason: collision with root package name */
        private int f5420k;

        /* renamed from: l  reason: collision with root package name */
        private String f5421l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5422m;

        /* renamed from: n  reason: collision with root package name */
        private WorkSource f5423n;

        /* renamed from: o  reason: collision with root package name */
        private u f5424o;

        public a(LocationRequest locationRequest) {
            this.f5410a = locationRequest.k();
            this.f5411b = locationRequest.e();
            this.f5412c = locationRequest.j();
            this.f5413d = locationRequest.g();
            this.f5414e = locationRequest.c();
            this.f5415f = locationRequest.h();
            this.f5416g = locationRequest.i();
            this.f5417h = locationRequest.n();
            this.f5418i = locationRequest.f();
            this.f5419j = locationRequest.d();
            this.f5420k = locationRequest.r();
            this.f5421l = locationRequest.u();
            this.f5422m = locationRequest.v();
            this.f5423n = locationRequest.s();
            this.f5424o = locationRequest.t();
        }

        public LocationRequest a() {
            int i10 = this.f5410a;
            long j10 = this.f5411b;
            long j11 = this.f5412c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f5413d, this.f5411b);
            long j12 = this.f5414e;
            int i11 = this.f5415f;
            float f10 = this.f5416g;
            boolean z10 = this.f5417h;
            long j13 = this.f5418i;
            long j14 = j13 == -1 ? this.f5411b : j13;
            int i12 = this.f5419j;
            int i13 = this.f5420k;
            String str = this.f5421l;
            boolean z11 = this.f5422m;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f5423n);
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j14, i12, i13, str, z11, workSource, this.f5424o);
        }

        public a b(int i10) {
            l.a(i10);
            this.f5419j = i10;
            return this;
        }

        public a c(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            o.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f5418i = j10;
            return this;
        }

        public a d(boolean z10) {
            this.f5417h = z10;
            return this;
        }

        public final a e(boolean z10) {
            this.f5422m = z10;
            return this;
        }

        public final a f(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f5421l = str;
            }
            return this;
        }

        public final a g(int i10) {
            int i11;
            boolean z10 = true;
            if (!(i10 == 0 || i10 == 1)) {
                i11 = 2;
                if (i10 == 2) {
                    i10 = 2;
                    o.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                    this.f5420k = i11;
                    return this;
                }
                z10 = false;
            }
            i11 = i10;
            o.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f5420k = i11;
            return this;
        }

        public final a h(WorkSource workSource) {
            this.f5423n = workSource;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    private static String w(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : c0.a(j10);
    }

    public long c() {
        return this.f5399i;
    }

    public int d() {
        return this.f5404n;
    }

    public long e() {
        return this.f5396f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f5395e == locationRequest.f5395e && (m() || this.f5396f == locationRequest.f5396f) && this.f5397g == locationRequest.f5397g && l() == locationRequest.l() && ((!l() || this.f5398h == locationRequest.f5398h) && this.f5399i == locationRequest.f5399i && this.f5400j == locationRequest.f5400j && this.f5401k == locationRequest.f5401k && this.f5402l == locationRequest.f5402l && this.f5404n == locationRequest.f5404n && this.f5405o == locationRequest.f5405o && this.f5407q == locationRequest.f5407q && this.f5408r.equals(locationRequest.f5408r) && n.a(this.f5406p, locationRequest.f5406p) && n.a(this.f5409s, locationRequest.f5409s));
        }
    }

    public long f() {
        return this.f5403m;
    }

    public long g() {
        return this.f5398h;
    }

    public int h() {
        return this.f5400j;
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f5395e), Long.valueOf(this.f5396f), Long.valueOf(this.f5397g), this.f5408r);
    }

    public float i() {
        return this.f5401k;
    }

    public long j() {
        return this.f5397g;
    }

    public int k() {
        return this.f5395e;
    }

    public boolean l() {
        long j10 = this.f5398h;
        return j10 > 0 && (j10 >> 1) >= this.f5396f;
    }

    public boolean m() {
        return this.f5395e == 105;
    }

    public boolean n() {
        return this.f5402l;
    }

    public LocationRequest o(long j10) {
        o.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f5397g = j10;
        return this;
    }

    public LocationRequest p(long j10) {
        o.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f5397g;
        long j12 = this.f5396f;
        if (j11 == j12 / 6) {
            this.f5397g = j10 / 6;
        }
        if (this.f5403m == j12) {
            this.f5403m = j10;
        }
        this.f5396f = j10;
        return this;
    }

    public LocationRequest q(int i10) {
        i.a(i10);
        this.f5395e = i10;
        return this;
    }

    public final int r() {
        return this.f5405o;
    }

    public final WorkSource s() {
        return this.f5408r;
    }

    public final u t() {
        return this.f5409s;
    }

    public String toString() {
        long j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (!m()) {
            sb2.append("@");
            if (l()) {
                c0.b(this.f5396f, sb2);
                sb2.append("/");
                j10 = this.f5398h;
            } else {
                j10 = this.f5396f;
            }
            c0.b(j10, sb2);
            sb2.append(" ");
        }
        sb2.append(i.b(this.f5395e));
        if (m() || this.f5397g != this.f5396f) {
            sb2.append(", minUpdateInterval=");
            sb2.append(w(this.f5397g));
        }
        if (((double) this.f5401k) > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f5401k);
        }
        boolean m10 = m();
        long j11 = this.f5403m;
        if (!m10 ? j11 != this.f5396f : j11 != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(w(this.f5403m));
        }
        if (this.f5399i != Long.MAX_VALUE) {
            sb2.append(", duration=");
            c0.b(this.f5399i, sb2);
        }
        if (this.f5400j != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f5400j);
        }
        if (this.f5405o != 0) {
            sb2.append(", ");
            sb2.append(j.a(this.f5405o));
        }
        if (this.f5404n != 0) {
            sb2.append(", ");
            sb2.append(l.b(this.f5404n));
        }
        if (this.f5402l) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f5407q) {
            sb2.append(", bypass");
        }
        if (this.f5406p != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f5406p);
        }
        if (!m.d(this.f5408r)) {
            sb2.append(", ");
            sb2.append(this.f5408r);
        }
        if (this.f5409s != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f5409s);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final String u() {
        return this.f5406p;
    }

    public final boolean v() {
        return this.f5407q;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, k());
        c.m(parcel, 2, e());
        c.m(parcel, 3, j());
        c.j(parcel, 6, h());
        c.g(parcel, 7, i());
        c.m(parcel, 8, g());
        c.c(parcel, 9, n());
        c.m(parcel, 10, c());
        c.m(parcel, 11, f());
        c.j(parcel, 12, d());
        c.j(parcel, 13, this.f5405o);
        c.o(parcel, 14, this.f5406p, false);
        c.c(parcel, 15, this.f5407q);
        c.n(parcel, 16, this.f5408r, i10, false);
        c.n(parcel, 17, this.f5409s, i10, false);
        c.b(parcel, a10);
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, u uVar) {
        this.f5395e = i10;
        long j16 = j10;
        this.f5396f = j16;
        this.f5397g = j11;
        this.f5398h = j12;
        this.f5399i = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1, j13 - SystemClock.elapsedRealtime()), j14);
        this.f5400j = i11;
        this.f5401k = f10;
        this.f5402l = z10;
        this.f5403m = j15 != -1 ? j15 : j16;
        this.f5404n = i12;
        this.f5405o = i13;
        this.f5406p = str;
        this.f5407q = z11;
        this.f5408r = workSource;
        this.f5409s = uVar;
    }
}
