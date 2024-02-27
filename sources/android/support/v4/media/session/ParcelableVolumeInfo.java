package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public int f434e;

    /* renamed from: f  reason: collision with root package name */
    public int f435f;

    /* renamed from: g  reason: collision with root package name */
    public int f436g;

    /* renamed from: h  reason: collision with root package name */
    public int f437h;

    /* renamed from: i  reason: collision with root package name */
    public int f438i;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f434e = parcel.readInt();
        this.f436g = parcel.readInt();
        this.f437h = parcel.readInt();
        this.f438i = parcel.readInt();
        this.f435f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f434e);
        parcel.writeInt(this.f436g);
        parcel.writeInt(this.f437h);
        parcel.writeInt(this.f438i);
        parcel.writeInt(this.f435f);
    }
}
