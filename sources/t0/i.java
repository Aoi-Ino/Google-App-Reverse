package t0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.k;
import cm.g;
import cm.l;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final b f16303i = new b((g) null);

    /* renamed from: e  reason: collision with root package name */
    private final String f16304e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16305f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f16306g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f16307h;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            l.f(parcel, "inParcel");
            return new i(parcel);
        }

        /* renamed from: b */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public i(Parcel parcel) {
        l.f(parcel, "inParcel");
        String readString = parcel.readString();
        l.c(readString);
        this.f16304e = readString;
        this.f16305f = parcel.readInt();
        Class<i> cls = i.class;
        this.f16306g = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        l.c(readBundle);
        this.f16307h = readBundle;
    }

    public final int c() {
        return this.f16305f;
    }

    public final String d() {
        return this.f16304e;
    }

    public int describeContents() {
        return 0;
    }

    public final h e(Context context, p pVar, k.b bVar, l lVar) {
        l.f(context, "context");
        l.f(pVar, "destination");
        l.f(bVar, "hostLifecycleState");
        Bundle bundle = this.f16306g;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return h.f16285s.a(context, pVar, bundle, bVar, lVar, this.f16304e, this.f16307h);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.f16304e);
        parcel.writeInt(this.f16305f);
        parcel.writeBundle(this.f16306g);
        parcel.writeBundle(this.f16307h);
    }

    public i(h hVar) {
        l.f(hVar, "entry");
        this.f16304e = hVar.f();
        this.f16305f = hVar.e().H();
        this.f16306g = hVar.c();
        Bundle bundle = new Bundle();
        this.f16307h = bundle;
        hVar.i(bundle);
    }
}
