package k4;

import android.os.IBinder;
import android.os.Parcel;
import f4.a;
import f4.f;
import f4.h;
import f4.i;
import z3.b;

public final class j extends a implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final i L() {
        Parcel c10 = c(5, d());
        i d10 = h.d(c10.readStrongBinder());
        c10.recycle();
        return d10;
    }

    public final void Q(b bVar, int i10) {
        Parcel d10 = d();
        f.c(d10, bVar);
        d10.writeInt(i10);
        j(10, d10);
    }

    public final int b() {
        Parcel c10 = c(9, d());
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final void b0(b bVar) {
        Parcel d10 = d();
        f.c(d10, bVar);
        j(11, d10);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k4.a e() {
        /*
            r4 = this;
            r0 = 4
            android.os.Parcel r1 = r4.d()
            android.os.Parcel r0 = r4.c(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof k4.a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            k4.a r1 = (k4.a) r1
            goto L_0x0025
        L_0x001f:
            k4.g r2 = new k4.g
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.j.e():k4.a");
    }

    public final void m(b bVar, int i10) {
        Parcel d10 = d();
        f.c(d10, bVar);
        d10.writeInt(18020000);
        j(6, d10);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k4.c q(z3.b r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.d()
            f4.f.c(r0, r3)
            f4.f.b(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.c(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof k4.c
            if (r1 == 0) goto L_0x0025
            r4 = r0
            k4.c r4 = (k4.c) r4
            goto L_0x002b
        L_0x0025:
            k4.m r0 = new k4.m
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.j.q(z3.b, com.google.android.gms.maps.GoogleMapOptions):k4.c");
    }
}
