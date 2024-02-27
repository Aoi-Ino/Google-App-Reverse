package k5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.g;

public class a extends b0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0170a();

    /* renamed from: g  reason: collision with root package name */
    public final g f12943g;

    /* renamed from: k5.a$a  reason: collision with other inner class name */
    class C0170a implements Parcelable.ClassLoaderCreator {
        C0170a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0170a) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0170a) null);
        }

        /* renamed from: c */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f12943g = new g(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f12943g.put(strArr[i10], bundleArr[i10]);
        }
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f12943g + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f12943g.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = (String) this.f12943g.i(i11);
            bundleArr[i11] = (Bundle) this.f12943g.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0170a aVar) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f12943g = new g();
    }
}
