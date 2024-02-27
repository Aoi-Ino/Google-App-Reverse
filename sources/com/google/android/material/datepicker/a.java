package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0099a();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final m f5860e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final m f5861f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final c f5862g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public m f5863h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final int f5864i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5865j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5866k;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    class C0099a implements Parcelable.Creator {
        C0099a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<m> cls = m.class;
            return new a((m) parcel.readParcelable(cls.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(cls.getClassLoader()), parcel.readInt(), (C0099a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        static final long f5867f = t.a(m.d(1900, 0).f5947j);

        /* renamed from: g  reason: collision with root package name */
        static final long f5868g = t.a(m.d(2100, 11).f5947j);

        /* renamed from: a  reason: collision with root package name */
        private long f5869a = f5867f;

        /* renamed from: b  reason: collision with root package name */
        private long f5870b = f5868g;

        /* renamed from: c  reason: collision with root package name */
        private Long f5871c;

        /* renamed from: d  reason: collision with root package name */
        private int f5872d;

        /* renamed from: e  reason: collision with root package name */
        private c f5873e = f.c(Long.MIN_VALUE);

        b(a aVar) {
            this.f5869a = aVar.f5860e.f5947j;
            this.f5870b = aVar.f5861f.f5947j;
            this.f5871c = Long.valueOf(aVar.f5863h.f5947j);
            this.f5872d = aVar.f5864i;
            this.f5873e = aVar.f5862g;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f5873e);
            m e10 = m.e(this.f5869a);
            m e11 = m.e(this.f5870b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f5871c;
            return new a(e10, e11, cVar, l10 == null ? null : m.e(l10.longValue()), this.f5872d, (C0099a) null);
        }

        public b b(long j10) {
            this.f5871c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean a(long j10);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f5860e = mVar;
        this.f5861f = mVar2;
        this.f5863h = mVar3;
        this.f5864i = i10;
        this.f5862g = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else {
            this.f5866k = mVar.m(mVar2) + 1;
            this.f5865j = (mVar2.f5944g - mVar.f5944g) + 1;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5860e.equals(aVar.f5860e) && this.f5861f.equals(aVar.f5861f) && androidx.core.util.c.a(this.f5863h, aVar.f5863h) && this.f5864i == aVar.f5864i && this.f5862g.equals(aVar.f5862g);
    }

    public c h() {
        return this.f5862g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5860e, this.f5861f, this.f5863h, Integer.valueOf(this.f5864i), this.f5862g});
    }

    /* access modifiers changed from: package-private */
    public m i() {
        return this.f5861f;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f5864i;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f5866k;
    }

    /* access modifiers changed from: package-private */
    public m l() {
        return this.f5863h;
    }

    /* access modifiers changed from: package-private */
    public m m() {
        return this.f5860e;
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f5865j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5860e, 0);
        parcel.writeParcelable(this.f5861f, 0);
        parcel.writeParcelable(this.f5863h, 0);
        parcel.writeParcelable(this.f5862g, 0);
        parcel.writeInt(this.f5864i);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0099a aVar) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }
}
