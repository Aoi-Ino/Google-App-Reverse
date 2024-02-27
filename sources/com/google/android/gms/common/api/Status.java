package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q3.c;
import s3.n;
import t3.a;

public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final Status f5232j = new Status(-1);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f5233k = new Status(0);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f5234l = new Status(14);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f5235m = new Status(8);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f5236n = new Status(15);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f5237o = new Status(16);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f5238p = new Status(18);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f5239q = new Status(17);

    /* renamed from: e  reason: collision with root package name */
    final int f5240e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5241f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5242g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f5243h;

    /* renamed from: i  reason: collision with root package name */
    private final p3.a f5244i;

    public Status(int i10) {
        this(i10, (String) null);
    }

    public p3.a c() {
        return this.f5244i;
    }

    public int d() {
        return this.f5241f;
    }

    public String e() {
        return this.f5242g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5240e == status.f5240e && this.f5241f == status.f5241f && n.a(this.f5242g, status.f5242g) && n.a(this.f5243h, status.f5243h) && n.a(this.f5244i, status.f5244i);
    }

    public boolean f() {
        return this.f5243h != null;
    }

    public boolean g() {
        return this.f5241f <= 0;
    }

    public final String h() {
        String str = this.f5242g;
        return str != null ? str : c.a(this.f5241f);
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f5240e), Integer.valueOf(this.f5241f), this.f5242g, this.f5243h, this.f5244i);
    }

    public String toString() {
        n.a c10 = n.c(this);
        c10.a("statusCode", h());
        c10.a("resolution", this.f5243h);
        return c10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = t3.c.a(parcel);
        t3.c.j(parcel, 1, d());
        t3.c.o(parcel, 2, e(), false);
        t3.c.n(parcel, 3, this.f5243h, i10, false);
        t3.c.n(parcel, 4, c(), i10, false);
        t3.c.j(parcel, 1000, this.f5240e);
        t3.c.b(parcel, a10);
    }

    Status(int i10, int i11, String str, PendingIntent pendingIntent, p3.a aVar) {
        this.f5240e = i10;
        this.f5241f = i11;
        this.f5242g = str;
        this.f5243h = pendingIntent;
        this.f5244i = aVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (p3.a) null);
    }

    public Status(p3.a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(p3.a aVar, String str, int i10) {
        this(1, i10, str, aVar.e(), aVar);
    }
}
