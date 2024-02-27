package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final long f5888e;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    private f(long j10) {
        this.f5888e = j10;
    }

    public static f c(long j10) {
        return new f(j10);
    }

    public boolean a(long j10) {
        return j10 >= this.f5888e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f5888e == ((f) obj).f5888e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5888e)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5888e);
    }

    /* synthetic */ f(long j10, a aVar) {
        this(j10);
    }
}
