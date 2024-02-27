package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final int f17638e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17639f;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new b(parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str) {
        l.f(str, "cov");
        this.f17638e = i10;
        this.f17639f = str;
    }

    public final String c() {
        return this.f17639f;
    }

    public final int d() {
        return this.f17638e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17638e == bVar.f17638e && l.a(this.f17639f, bVar.f17639f);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f17638e) * 31) + this.f17639f.hashCode();
    }

    public String toString() {
        return "CovDetailsModal(covCode=" + this.f17638e + ", cov=" + this.f17639f + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeInt(this.f17638e);
        parcel.writeString(this.f17639f);
    }
}
