package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s3.o;
import t3.a;
import t3.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int f5230e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5231f;

    Scope(int i10, String str) {
        o.f(str, "scopeUri must not be null or empty");
        this.f5230e = i10;
        this.f5231f = str;
    }

    public String c() {
        return this.f5231f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5231f.equals(((Scope) obj).f5231f);
    }

    public int hashCode() {
        return this.f5231f.hashCode();
    }

    public String toString() {
        return this.f5231f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f5230e);
        c.o(parcel, 2, c(), false);
        c.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
