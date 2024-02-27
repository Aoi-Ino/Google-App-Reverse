package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import java.util.ArrayList;

final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    ArrayList f3163e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList f3164f;

    /* renamed from: g  reason: collision with root package name */
    b[] f3165g;

    /* renamed from: h  reason: collision with root package name */
    int f3166h;

    /* renamed from: i  reason: collision with root package name */
    String f3167i = null;

    /* renamed from: j  reason: collision with root package name */
    ArrayList f3168j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    ArrayList f3169k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    ArrayList f3170l;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        /* renamed from: b */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    public s() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f3163e);
        parcel.writeStringList(this.f3164f);
        parcel.writeTypedArray(this.f3165g, i10);
        parcel.writeInt(this.f3166h);
        parcel.writeString(this.f3167i);
        parcel.writeStringList(this.f3168j);
        parcel.writeTypedList(this.f3169k);
        parcel.writeTypedList(this.f3170l);
    }

    public s(Parcel parcel) {
        this.f3163e = parcel.createStringArrayList();
        this.f3164f = parcel.createStringArrayList();
        this.f3165g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3166h = parcel.readInt();
        this.f3167i = parcel.readString();
        this.f3168j = parcel.createStringArrayList();
        this.f3169k = parcel.createTypedArrayList(c.CREATOR);
        this.f3170l = parcel.createTypedArrayList(q.k.CREATOR);
    }
}
