package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Calendar f5942e;

    /* renamed from: f  reason: collision with root package name */
    final int f5943f;

    /* renamed from: g  reason: collision with root package name */
    final int f5944g;

    /* renamed from: h  reason: collision with root package name */
    final int f5945h;

    /* renamed from: i  reason: collision with root package name */
    final int f5946i;

    /* renamed from: j  reason: collision with root package name */
    final long f5947j;

    /* renamed from: k  reason: collision with root package name */
    private String f5948k;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return m.d(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c10 = t.c(calendar);
        this.f5942e = c10;
        this.f5943f = c10.get(2);
        this.f5944g = c10.get(1);
        this.f5945h = c10.getMaximum(7);
        this.f5946i = c10.getActualMaximum(5);
        this.f5947j = c10.getTimeInMillis();
    }

    static m d(int i10, int i11) {
        Calendar i12 = t.i();
        i12.set(1, i10);
        i12.set(2, i11);
        return new m(i12);
    }

    static m e(long j10) {
        Calendar i10 = t.i();
        i10.setTimeInMillis(j10);
        return new m(i10);
    }

    static m f() {
        return new m(t.g());
    }

    /* renamed from: c */
    public int compareTo(m mVar) {
        return this.f5942e.compareTo(mVar.f5942e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5943f == mVar.f5943f && this.f5944g == mVar.f5944g;
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        int i11 = this.f5942e.get(7);
        if (i10 <= 0) {
            i10 = this.f5942e.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f5945h : i12;
    }

    /* access modifiers changed from: package-private */
    public long h(int i10) {
        Calendar c10 = t.c(this.f5942e);
        c10.set(5, i10);
        return c10.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5943f), Integer.valueOf(this.f5944g)});
    }

    /* access modifiers changed from: package-private */
    public int i(long j10) {
        Calendar c10 = t.c(this.f5942e);
        c10.setTimeInMillis(j10);
        return c10.get(5);
    }

    /* access modifiers changed from: package-private */
    public String j() {
        if (this.f5948k == null) {
            this.f5948k = e.f(this.f5942e.getTimeInMillis());
        }
        return this.f5948k;
    }

    /* access modifiers changed from: package-private */
    public long k() {
        return this.f5942e.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public m l(int i10) {
        Calendar c10 = t.c(this.f5942e);
        c10.add(2, i10);
        return new m(c10);
    }

    /* access modifiers changed from: package-private */
    public int m(m mVar) {
        if (this.f5942e instanceof GregorianCalendar) {
            return ((mVar.f5944g - this.f5944g) * 12) + (mVar.f5943f - this.f5943f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5944g);
        parcel.writeInt(this.f5943f);
    }
}
