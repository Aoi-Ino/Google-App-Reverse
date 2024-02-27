package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d4.a;
import d4.c;
import z3.b;

public final class m extends a {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int j() {
        Parcel c10 = c(6, d());
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final int l0(b bVar, String str, boolean z10) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        c.c(d10, z10);
        Parcel c10 = c(3, d10);
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final int m0(b bVar, String str, boolean z10) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        c.c(d10, z10);
        Parcel c10 = c(5, d10);
        int readInt = c10.readInt();
        c10.recycle();
        return readInt;
    }

    public final b n0(b bVar, String str, int i10) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        d10.writeInt(i10);
        Parcel c10 = c(2, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }

    public final b o0(b bVar, String str, int i10, b bVar2) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        d10.writeInt(i10);
        c.d(d10, bVar2);
        Parcel c10 = c(8, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }

    public final b p0(b bVar, String str, int i10) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        d10.writeInt(i10);
        Parcel c10 = c(4, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }

    public final b q0(b bVar, String str, boolean z10, long j10) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        c.c(d10, z10);
        d10.writeLong(j10);
        Parcel c10 = c(7, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }
}
