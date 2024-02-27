package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.k;

final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final String f3179e;

    /* renamed from: f  reason: collision with root package name */
    final String f3180f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f3181g;

    /* renamed from: h  reason: collision with root package name */
    final int f3182h;

    /* renamed from: i  reason: collision with root package name */
    final int f3183i;

    /* renamed from: j  reason: collision with root package name */
    final String f3184j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f3185k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f3186l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f3187m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f3188n;

    /* renamed from: o  reason: collision with root package name */
    final int f3189o;

    /* renamed from: p  reason: collision with root package name */
    final String f3190p;

    /* renamed from: q  reason: collision with root package name */
    final int f3191q;

    /* renamed from: r  reason: collision with root package name */
    final boolean f3192r;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        /* renamed from: b */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    u(Parcel parcel) {
        this.f3179e = parcel.readString();
        this.f3180f = parcel.readString();
        boolean z10 = true;
        this.f3181g = parcel.readInt() != 0;
        this.f3182h = parcel.readInt();
        this.f3183i = parcel.readInt();
        this.f3184j = parcel.readString();
        this.f3185k = parcel.readInt() != 0;
        this.f3186l = parcel.readInt() != 0;
        this.f3187m = parcel.readInt() != 0;
        this.f3188n = parcel.readInt() != 0;
        this.f3189o = parcel.readInt();
        this.f3190p = parcel.readString();
        this.f3191q = parcel.readInt();
        this.f3192r = parcel.readInt() == 0 ? false : z10;
    }

    /* access modifiers changed from: package-private */
    public i c(m mVar, ClassLoader classLoader) {
        i a10 = mVar.a(classLoader, this.f3179e);
        a10.f3052j = this.f3180f;
        a10.f3061s = this.f3181g;
        a10.f3063u = true;
        a10.B = this.f3182h;
        a10.C = this.f3183i;
        a10.D = this.f3184j;
        a10.G = this.f3185k;
        a10.f3059q = this.f3186l;
        a10.F = this.f3187m;
        a10.E = this.f3188n;
        a10.W = k.b.values()[this.f3189o];
        a10.f3055m = this.f3190p;
        a10.f3056n = this.f3191q;
        a10.O = this.f3192r;
        return a10;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f3179e);
        sb2.append(" (");
        sb2.append(this.f3180f);
        sb2.append(")}:");
        if (this.f3181g) {
            sb2.append(" fromLayout");
        }
        if (this.f3183i != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3183i));
        }
        String str = this.f3184j;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f3184j);
        }
        if (this.f3185k) {
            sb2.append(" retainInstance");
        }
        if (this.f3186l) {
            sb2.append(" removing");
        }
        if (this.f3187m) {
            sb2.append(" detached");
        }
        if (this.f3188n) {
            sb2.append(" hidden");
        }
        if (this.f3190p != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f3190p);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3191q);
        }
        if (this.f3192r) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3179e);
        parcel.writeString(this.f3180f);
        parcel.writeInt(this.f3181g ? 1 : 0);
        parcel.writeInt(this.f3182h);
        parcel.writeInt(this.f3183i);
        parcel.writeString(this.f3184j);
        parcel.writeInt(this.f3185k ? 1 : 0);
        parcel.writeInt(this.f3186l ? 1 : 0);
        parcel.writeInt(this.f3187m ? 1 : 0);
        parcel.writeInt(this.f3188n ? 1 : 0);
        parcel.writeInt(this.f3189o);
        parcel.writeString(this.f3190p);
        parcel.writeInt(this.f3191q);
        parcel.writeInt(this.f3192r ? 1 : 0);
    }

    u(i iVar) {
        this.f3179e = iVar.getClass().getName();
        this.f3180f = iVar.f3052j;
        this.f3181g = iVar.f3061s;
        this.f3182h = iVar.B;
        this.f3183i = iVar.C;
        this.f3184j = iVar.D;
        this.f3185k = iVar.G;
        this.f3186l = iVar.f3059q;
        this.f3187m = iVar.F;
        this.f3188n = iVar.E;
        this.f3189o = iVar.W.ordinal();
        this.f3190p = iVar.f3055m;
        this.f3191q = iVar.f3056n;
        this.f3192r = iVar.O;
    }
}
