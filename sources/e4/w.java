package e4;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t3.a;
import t3.c;

public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: e  reason: collision with root package name */
    private final int f10093e;

    /* renamed from: f  reason: collision with root package name */
    private final IBinder f10094f;

    /* renamed from: g  reason: collision with root package name */
    private final IBinder f10095g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f10096h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10097i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10098j;

    w(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f10093e = i10;
        this.f10094f = iBinder;
        this.f10095g = iBinder2;
        this.f10096h = pendingIntent;
        this.f10097i = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f10098j = str2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e4.w c(android.os.IInterface r7, i4.o r8, java.lang.String r9, java.lang.String r10) {
        /*
            e4.w r9 = new e4.w
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 2
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.w.c(android.os.IInterface, i4.o, java.lang.String, java.lang.String):e4.w");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f10093e);
        c.i(parcel, 2, this.f10094f, false);
        c.i(parcel, 3, this.f10095g, false);
        c.n(parcel, 4, this.f10096h, i10, false);
        c.o(parcel, 5, this.f10097i, false);
        c.o(parcel, 6, this.f10098j, false);
        c.b(parcel, a10);
    }
}
