package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int f439e;

    /* renamed from: f  reason: collision with root package name */
    final long f440f;

    /* renamed from: g  reason: collision with root package name */
    final long f441g;

    /* renamed from: h  reason: collision with root package name */
    final float f442h;

    /* renamed from: i  reason: collision with root package name */
    final long f443i;

    /* renamed from: j  reason: collision with root package name */
    final int f444j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f445k;

    /* renamed from: l  reason: collision with root package name */
    final long f446l;

    /* renamed from: m  reason: collision with root package name */
    List f447m;

    /* renamed from: n  reason: collision with root package name */
    final long f448n;

    /* renamed from: o  reason: collision with root package name */
    final Bundle f449o;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        private final String f450e;

        /* renamed from: f  reason: collision with root package name */
        private final CharSequence f451f;

        /* renamed from: g  reason: collision with root package name */
        private final int f452g;

        /* renamed from: h  reason: collision with root package name */
        private final Bundle f453h;

        static class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f450e = parcel.readString();
            this.f451f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f452g = parcel.readInt();
            this.f453h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f451f + ", mIcon=" + this.f452g + ", mExtras=" + this.f453h;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f450e);
            TextUtils.writeToParcel(this.f451f, parcel, i10);
            parcel.writeInt(this.f452g);
            parcel.writeBundle(this.f453h);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f439e = parcel.readInt();
        this.f440f = parcel.readLong();
        this.f442h = parcel.readFloat();
        this.f446l = parcel.readLong();
        this.f441g = parcel.readLong();
        this.f443i = parcel.readLong();
        this.f445k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f447m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f448n = parcel.readLong();
        this.f449o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f444j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f439e + ", position=" + this.f440f + ", buffered position=" + this.f441g + ", speed=" + this.f442h + ", updated=" + this.f446l + ", actions=" + this.f443i + ", error code=" + this.f444j + ", error message=" + this.f445k + ", custom actions=" + this.f447m + ", active item id=" + this.f448n + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f439e);
        parcel.writeLong(this.f440f);
        parcel.writeFloat(this.f442h);
        parcel.writeLong(this.f446l);
        parcel.writeLong(this.f441g);
        parcel.writeLong(this.f443i);
        TextUtils.writeToParcel(this.f445k, parcel, i10);
        parcel.writeTypedList(this.f447m);
        parcel.writeLong(this.f448n);
        parcel.writeBundle(this.f449o);
        parcel.writeInt(this.f444j);
    }
}
