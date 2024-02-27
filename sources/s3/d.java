package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new w();

    /* renamed from: e  reason: collision with root package name */
    public final int f15925e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15926f;

    public d(int i10, String str) {
        this.f15925e = i10;
        this.f15926f = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f15925e == this.f15925e && n.a(dVar.f15926f, this.f15926f);
    }

    public final int hashCode() {
        return this.f15925e;
    }

    public final String toString() {
        int i10 = this.f15925e;
        String str = this.f15926f;
        return i10 + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f15925e);
        c.o(parcel, 2, this.f15926f, false);
        c.b(parcel, a10);
    }
}
