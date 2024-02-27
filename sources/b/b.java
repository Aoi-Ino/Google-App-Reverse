package b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final boolean f4383e = false;

    /* renamed from: f  reason: collision with root package name */
    final Handler f4384f = null;

    /* renamed from: g  reason: collision with root package name */
    a f4385g;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    class C0079b extends a.C0077a {
        C0079b() {
        }

        public void h0(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4384f;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.c(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final int f4387e;

        /* renamed from: f  reason: collision with root package name */
        final Bundle f4388f;

        c(int i10, Bundle bundle) {
            this.f4387e = i10;
            this.f4388f = bundle;
        }

        public void run() {
            b.this.c(this.f4387e, this.f4388f);
        }
    }

    b(Parcel parcel) {
        this.f4385g = a.C0077a.c(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void c(int i10, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f4385g == null) {
                    this.f4385g = new C0079b();
                }
                parcel.writeStrongBinder(this.f4385g.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
