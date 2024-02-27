package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;

public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f17661e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17662f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17663g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17664h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17665i;

    /* renamed from: j  reason: collision with root package name */
    private final String f17666j;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final g createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "llLicenceNo");
        l.f(str2, "llCovsAbbr");
        l.f(str3, "llEquiCovsAbbrv");
        l.f(str4, "llRefRTOCode");
        l.f(str5, "llIssuedDate");
        l.f(str6, "llValidUpto");
        this.f17661e = str;
        this.f17662f = str2;
        this.f17663g = str3;
        this.f17664h = str4;
        this.f17665i = str5;
        this.f17666j = str6;
    }

    public final String c() {
        return this.f17661e;
    }

    public final String d() {
        return this.f17664h;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f17666j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f17661e, gVar.f17661e) && l.a(this.f17662f, gVar.f17662f) && l.a(this.f17663g, gVar.f17663g) && l.a(this.f17664h, gVar.f17664h) && l.a(this.f17665i, gVar.f17665i) && l.a(this.f17666j, gVar.f17666j);
    }

    public int hashCode() {
        return (((((((((this.f17661e.hashCode() * 31) + this.f17662f.hashCode()) * 31) + this.f17663g.hashCode()) * 31) + this.f17664h.hashCode()) * 31) + this.f17665i.hashCode()) * 31) + this.f17666j.hashCode();
    }

    public String toString() {
        return "LLRefDetailsModal(llLicenceNo=" + this.f17661e + ", llCovsAbbr=" + this.f17662f + ", llEquiCovsAbbrv=" + this.f17663g + ", llRefRTOCode=" + this.f17664h + ", llIssuedDate=" + this.f17665i + ", llValidUpto=" + this.f17666j + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.f17661e);
        parcel.writeString(this.f17662f);
        parcel.writeString(this.f17663g);
        parcel.writeString(this.f17664h);
        parcel.writeString(this.f17665i);
        parcel.writeString(this.f17666j);
    }
}
