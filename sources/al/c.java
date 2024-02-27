package al;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private int f19381e;

    /* renamed from: f  reason: collision with root package name */
    private int f19382f;

    /* renamed from: g  reason: collision with root package name */
    private int f19383g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    private c(Parcel parcel) {
        super(parcel);
        this.f19381e = parcel.readInt();
        this.f19382f = parcel.readInt();
        this.f19383g = parcel.readInt();
    }

    public int c() {
        return this.f19383g;
    }

    public int d() {
        return this.f19381e;
    }

    public int e() {
        return this.f19382f;
    }

    public void f(int i10) {
        this.f19383g = i10;
    }

    public void g(int i10) {
        this.f19381e = i10;
    }

    public void h(int i10) {
        this.f19382f = i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f19381e);
        parcel.writeInt(this.f19382f);
        parcel.writeInt(this.f19383g);
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c(Parcelable parcelable) {
        super(parcelable);
    }
}
