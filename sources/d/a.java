package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0122a();

    /* renamed from: e  reason: collision with root package name */
    private final int f9625e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f9626f;

    /* renamed from: d.a$a  reason: collision with other inner class name */
    class C0122a implements Parcelable.Creator {
        C0122a() {
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

    public a(int i10, Intent intent) {
        this.f9625e = i10;
        this.f9626f = intent;
    }

    public static String e(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent c() {
        return this.f9626f;
    }

    public int d() {
        return this.f9625e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + e(this.f9625e) + ", data=" + this.f9626f + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9625e);
        parcel.writeInt(this.f9626f == null ? 0 : 1);
        Intent intent = this.f9626f;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    a(Parcel parcel) {
        this.f9625e = parcel.readInt();
        this.f9626f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
