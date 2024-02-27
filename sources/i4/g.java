package i4;

import android.os.Parcel;
import android.os.Parcelable;
import s3.n;
import t3.a;
import t3.c;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: e  reason: collision with root package name */
    public final int f12337e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12338f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12339g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12340h;

    g(int i10, int i11, long j10, long j11) {
        this.f12337e = i10;
        this.f12338f = i11;
        this.f12339g = j10;
        this.f12340h = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f12337e == gVar.f12337e && this.f12338f == gVar.f12338f && this.f12339g == gVar.f12339g && this.f12340h == gVar.f12340h;
        }
    }

    public final int hashCode() {
        return n.b(Integer.valueOf(this.f12338f), Integer.valueOf(this.f12337e), Long.valueOf(this.f12340h), Long.valueOf(this.f12339g));
    }

    public final String toString() {
        int i10 = this.f12337e;
        int i11 = this.f12338f;
        long j10 = this.f12340h;
        long j11 = this.f12339g;
        return "NetworkLocationStatus: Wifi status: " + i10 + " Cell status: " + i11 + " elapsed time NS: " + j10 + " system time ms: " + j11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f12337e);
        c.j(parcel, 2, this.f12338f);
        c.m(parcel, 3, this.f12339g);
        c.m(parcel, 4, this.f12340h);
        c.b(parcel, a10);
    }
}
