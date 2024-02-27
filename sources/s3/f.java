package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new a1();

    /* renamed from: e  reason: collision with root package name */
    private final q f15950e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15951f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15952g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f15953h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15954i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f15955j;

    public f(q qVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f15950e = qVar;
        this.f15951f = z10;
        this.f15952g = z11;
        this.f15953h = iArr;
        this.f15954i = i10;
        this.f15955j = iArr2;
    }

    public int c() {
        return this.f15954i;
    }

    public int[] d() {
        return this.f15953h;
    }

    public int[] e() {
        return this.f15955j;
    }

    public boolean f() {
        return this.f15951f;
    }

    public boolean g() {
        return this.f15952g;
    }

    public final q h() {
        return this.f15950e;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f15950e, i10, false);
        c.c(parcel, 2, f());
        c.c(parcel, 3, g());
        c.k(parcel, 4, d(), false);
        c.j(parcel, 5, c());
        c.k(parcel, 6, e(), false);
        c.b(parcel, a10);
    }
}
