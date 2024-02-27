package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d4.a;
import d4.c;
import z3.b;

public final class n extends a {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final b j(b bVar, String str, int i10, b bVar2) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        d10.writeInt(i10);
        c.d(d10, bVar2);
        Parcel c10 = c(2, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }

    public final b l0(b bVar, String str, int i10, b bVar2) {
        Parcel d10 = d();
        c.d(d10, bVar);
        d10.writeString(str);
        d10.writeInt(i10);
        c.d(d10, bVar2);
        Parcel c10 = c(3, d10);
        b d11 = b.a.d(c10.readStrongBinder());
        c10.recycle();
        return d11;
    }
}
