package jl;

import android.os.Parcel;
import android.os.Parcelable;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0314a();

    /* renamed from: e  reason: collision with root package name */
    private final String f24612e;

    /* renamed from: f  reason: collision with root package name */
    private final float f24613f;

    /* renamed from: g  reason: collision with root package name */
    private final float f24614g;

    /* renamed from: jl.a$a  reason: collision with other inner class name */
    static class C0314a implements Parcelable.Creator {
        C0314a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    protected a(Parcel parcel) {
        this.f24612e = parcel.readString();
        this.f24613f = parcel.readFloat();
        this.f24614g = parcel.readFloat();
    }

    public String c() {
        return this.f24612e;
    }

    public float d() {
        return this.f24613f;
    }

    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.f24614g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24612e);
        parcel.writeFloat(this.f24613f);
        parcel.writeFloat(this.f24614g);
    }

    public a(String str, float f10, float f11) {
        this.f24612e = str;
        this.f24613f = f10;
        this.f24614g = f11;
    }
}
