package b0;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f4390f = new C0080a();

    /* renamed from: e  reason: collision with root package name */
    private final Parcelable f4391e;

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    class C0080a extends a {
        C0080a() {
            super((C0080a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f4390f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a() {
        this.f4391e = null;
    }

    public final Parcelable c() {
        return this.f4391e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f4391e, i10);
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4391e = readParcelable == null ? f4390f : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4391e = parcelable == f4390f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0080a aVar) {
        this();
    }
}
