package p3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.n;
import t3.a;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new s();

    /* renamed from: e  reason: collision with root package name */
    private final String f14638e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14639f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14640g;

    public c(String str, int i10, long j10) {
        this.f14638e = str;
        this.f14639f = i10;
        this.f14640g = j10;
    }

    public String c() {
        return this.f14638e;
    }

    public long d() {
        long j10 = this.f14640g;
        return j10 == -1 ? (long) this.f14639f : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return ((c() != null && c().equals(cVar.c())) || (c() == null && cVar.c() == null)) && d() == cVar.d();
        }
    }

    public final int hashCode() {
        return n.b(c(), Long.valueOf(d()));
    }

    public final String toString() {
        n.a c10 = n.c(this);
        c10.a("name", c());
        c10.a("version", Long.valueOf(d()));
        return c10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = t3.c.a(parcel);
        t3.c.o(parcel, 1, c(), false);
        t3.c.j(parcel, 2, this.f14639f);
        t3.c.m(parcel, 3, d());
        t3.c.b(parcel, a10);
    }

    public c(String str, long j10) {
        this.f14638e = str;
        this.f14640g = j10;
        this.f14639f = -1;
    }
}
