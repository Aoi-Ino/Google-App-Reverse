package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final b f6575e;

    /* renamed from: f  reason: collision with root package name */
    private final b f6576f;

    /* renamed from: g  reason: collision with root package name */
    final int f6577g;

    /* renamed from: h  reason: collision with root package name */
    int f6578h;

    /* renamed from: i  reason: collision with root package name */
    int f6579i;

    /* renamed from: j  reason: collision with root package name */
    int f6580j;

    /* renamed from: k  reason: collision with root package name */
    int f6581k;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f6578h = i10;
        this.f6579i = i11;
        this.f6580j = i12;
        this.f6577g = i13;
        this.f6581k = e(i10);
        this.f6575e = new b(59);
        this.f6576f = new b(i13 == 1 ? 23 : 12);
    }

    public static String c(Resources resources, CharSequence charSequence) {
        return d(resources, charSequence, "%02d");
    }

    public static String d(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int e(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6578h == eVar.f6578h && this.f6579i == eVar.f6579i && this.f6577g == eVar.f6577g && this.f6580j == eVar.f6580j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6577g), Integer.valueOf(this.f6578h), Integer.valueOf(this.f6579i), Integer.valueOf(this.f6580j)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6578h);
        parcel.writeInt(this.f6579i);
        parcel.writeInt(this.f6580j);
        parcel.writeInt(this.f6577g);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
