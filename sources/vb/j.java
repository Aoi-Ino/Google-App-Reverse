package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;

public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final int f17687e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17688f;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final j createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new j(parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(int i10, String str) {
        l.f(str, "selectedcov");
        this.f17687e = i10;
        this.f17688f = str;
    }

    public final int c() {
        return this.f17687e;
    }

    public final String d() {
        return this.f17688f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17687e == jVar.f17687e && l.a(this.f17688f, jVar.f17688f);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f17687e) * 31) + this.f17688f.hashCode();
    }

    public String toString() {
        return "SelectedCovListModal(selectedCovCode=" + this.f17687e + ", selectedcov=" + this.f17688f + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeInt(this.f17687e);
        parcel.writeString(this.f17688f);
    }
}
