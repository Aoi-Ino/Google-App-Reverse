package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s3.j;
import t3.a;
import t3.c;

public final class k0 extends a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* renamed from: e  reason: collision with root package name */
    final int f15994e;

    /* renamed from: f  reason: collision with root package name */
    final IBinder f15995f;

    /* renamed from: g  reason: collision with root package name */
    private final p3.a f15996g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15997h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f15998i;

    k0(int i10, IBinder iBinder, p3.a aVar, boolean z10, boolean z11) {
        this.f15994e = i10;
        this.f15995f = iBinder;
        this.f15996g = aVar;
        this.f15997h = z10;
        this.f15998i = z11;
    }

    public final p3.a c() {
        return this.f15996g;
    }

    public final j d() {
        IBinder iBinder = this.f15995f;
        if (iBinder == null) {
            return null;
        }
        return j.a.d(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f15996g.equals(k0Var.f15996g) && n.a(d(), k0Var.d());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f15994e);
        c.i(parcel, 2, this.f15995f, false);
        c.n(parcel, 3, this.f15996g, i10, false);
        c.c(parcel, 4, this.f15997h);
        c.c(parcel, 5, this.f15998i);
        c.b(parcel, a10);
    }
}
