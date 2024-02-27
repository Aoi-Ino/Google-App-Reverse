package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0232a();
    private final String A;
    private final String B;
    private final String C;
    private final String D;
    private final String E;
    private final String F;

    /* renamed from: e  reason: collision with root package name */
    private final String f17616e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17617f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17618g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17619h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17620i;

    /* renamed from: j  reason: collision with root package name */
    private final String f17621j;

    /* renamed from: k  reason: collision with root package name */
    private final String f17622k;

    /* renamed from: l  reason: collision with root package name */
    private final String f17623l;

    /* renamed from: m  reason: collision with root package name */
    private final String f17624m;

    /* renamed from: n  reason: collision with root package name */
    private final String f17625n;

    /* renamed from: o  reason: collision with root package name */
    private final String f17626o;

    /* renamed from: p  reason: collision with root package name */
    private final String f17627p;

    /* renamed from: q  reason: collision with root package name */
    private final String f17628q;

    /* renamed from: r  reason: collision with root package name */
    private final String f17629r;

    /* renamed from: s  reason: collision with root package name */
    private final String f17630s;

    /* renamed from: t  reason: collision with root package name */
    private final String f17631t;

    /* renamed from: u  reason: collision with root package name */
    private final String f17632u;

    /* renamed from: v  reason: collision with root package name */
    private final String f17633v;

    /* renamed from: w  reason: collision with root package name */
    private final String f17634w;

    /* renamed from: x  reason: collision with root package name */
    private final String f17635x;

    /* renamed from: y  reason: collision with root package name */
    private final String f17636y;

    /* renamed from: z  reason: collision with root package name */
    private final String f17637z;

    /* renamed from: vb.a$a  reason: collision with other inner class name */
    public static final class C0232a implements Parcelable.Creator {
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        String str29 = str;
        String str30 = str2;
        String str31 = str3;
        String str32 = str4;
        String str33 = str5;
        String str34 = str6;
        String str35 = str7;
        String str36 = str8;
        String str37 = str9;
        String str38 = str10;
        String str39 = str11;
        String str40 = str12;
        String str41 = str13;
        String str42 = str14;
        String str43 = str16;
        l.f(str29, "permDistrict");
        l.f(str30, "permHouseNo");
        l.f(str31, "presDistrict");
        l.f(str32, "presHouseNo");
        l.f(str33, "presStreet");
        l.f(str34, "permSubDistrictCode");
        l.f(str35, "presState");
        l.f(str36, "permStateCode");
        l.f(str37, "permState");
        l.f(str38, "presCityCode");
        l.f(str39, "permVillageOrTown");
        l.f(str40, "presCity");
        l.f(str41, "presSubDistrict");
        l.f(str42, "presPinCode");
        l.f(str15, "permSubDistrict");
        l.f(str16, "permCityCode");
        l.f(str17, "presDistrictCode");
        l.f(str18, "presSubDistrictCode");
        l.f(str19, "permLocation");
        l.f(str20, "presStateCode");
        l.f(str21, "presLocation");
        l.f(str22, "permDistrictCode");
        l.f(str23, "stayPeriodMonths");
        l.f(str24, "permCity");
        l.f(str25, "permStreet");
        l.f(str26, "presVillageOrTown");
        l.f(str27, "permPinCode");
        l.f(str28, "stayPeriodYears");
        this.f17616e = str29;
        this.f17617f = str30;
        this.f17618g = str31;
        this.f17619h = str32;
        this.f17620i = str33;
        this.f17621j = str34;
        this.f17622k = str35;
        this.f17623l = str36;
        this.f17624m = str37;
        this.f17625n = str38;
        this.f17626o = str39;
        this.f17627p = str40;
        this.f17628q = str41;
        this.f17629r = str42;
        this.f17630s = str15;
        this.f17631t = str16;
        this.f17632u = str17;
        this.f17633v = str18;
        this.f17634w = str19;
        this.f17635x = str20;
        this.f17636y = str21;
        this.f17637z = str22;
        this.A = str23;
        this.B = str24;
        this.C = str25;
        this.D = str26;
        this.E = str27;
        this.F = str28;
    }

    public final String A() {
        return this.f17633v;
    }

    public final String B() {
        return this.D;
    }

    public final String C() {
        return this.A;
    }

    public final String D() {
        return this.F;
    }

    public final String c() {
        return this.B;
    }

    public final String d() {
        return this.f17631t;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f17616e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f17616e, aVar.f17616e) && l.a(this.f17617f, aVar.f17617f) && l.a(this.f17618g, aVar.f17618g) && l.a(this.f17619h, aVar.f17619h) && l.a(this.f17620i, aVar.f17620i) && l.a(this.f17621j, aVar.f17621j) && l.a(this.f17622k, aVar.f17622k) && l.a(this.f17623l, aVar.f17623l) && l.a(this.f17624m, aVar.f17624m) && l.a(this.f17625n, aVar.f17625n) && l.a(this.f17626o, aVar.f17626o) && l.a(this.f17627p, aVar.f17627p) && l.a(this.f17628q, aVar.f17628q) && l.a(this.f17629r, aVar.f17629r) && l.a(this.f17630s, aVar.f17630s) && l.a(this.f17631t, aVar.f17631t) && l.a(this.f17632u, aVar.f17632u) && l.a(this.f17633v, aVar.f17633v) && l.a(this.f17634w, aVar.f17634w) && l.a(this.f17635x, aVar.f17635x) && l.a(this.f17636y, aVar.f17636y) && l.a(this.f17637z, aVar.f17637z) && l.a(this.A, aVar.A) && l.a(this.B, aVar.B) && l.a(this.C, aVar.C) && l.a(this.D, aVar.D) && l.a(this.E, aVar.E) && l.a(this.F, aVar.F);
    }

    public final String f() {
        return this.f17637z;
    }

    public final String g() {
        return this.f17617f;
    }

    public final String h() {
        return this.f17634w;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.f17616e.hashCode() * 31) + this.f17617f.hashCode()) * 31) + this.f17618g.hashCode()) * 31) + this.f17619h.hashCode()) * 31) + this.f17620i.hashCode()) * 31) + this.f17621j.hashCode()) * 31) + this.f17622k.hashCode()) * 31) + this.f17623l.hashCode()) * 31) + this.f17624m.hashCode()) * 31) + this.f17625n.hashCode()) * 31) + this.f17626o.hashCode()) * 31) + this.f17627p.hashCode()) * 31) + this.f17628q.hashCode()) * 31) + this.f17629r.hashCode()) * 31) + this.f17630s.hashCode()) * 31) + this.f17631t.hashCode()) * 31) + this.f17632u.hashCode()) * 31) + this.f17633v.hashCode()) * 31) + this.f17634w.hashCode()) * 31) + this.f17635x.hashCode()) * 31) + this.f17636y.hashCode()) * 31) + this.f17637z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode();
    }

    public final String i() {
        return this.E;
    }

    public final String j() {
        return this.f17624m;
    }

    public final String k() {
        return this.f17623l;
    }

    public final String l() {
        return this.C;
    }

    public final String m() {
        return this.f17630s;
    }

    public final String n() {
        return this.f17621j;
    }

    public final String o() {
        return this.f17626o;
    }

    public final String p() {
        return this.f17627p;
    }

    public final String q() {
        return this.f17625n;
    }

    public final String r() {
        return this.f17618g;
    }

    public final String s() {
        return this.f17632u;
    }

    public final String t() {
        return this.f17619h;
    }

    public String toString() {
        return "AddressDetailsModal(permDistrict=" + this.f17616e + ", permHouseNo=" + this.f17617f + ", presDistrict=" + this.f17618g + ", presHouseNo=" + this.f17619h + ", presStreet=" + this.f17620i + ", permSubDistrictCode=" + this.f17621j + ", presState=" + this.f17622k + ", permStateCode=" + this.f17623l + ", permState=" + this.f17624m + ", presCityCode=" + this.f17625n + ", permVillageOrTown=" + this.f17626o + ", presCity=" + this.f17627p + ", presSubDistrict=" + this.f17628q + ", presPinCode=" + this.f17629r + ", permSubDistrict=" + this.f17630s + ", permCityCode=" + this.f17631t + ", presDistrictCode=" + this.f17632u + ", presSubDistrictCode=" + this.f17633v + ", permLocation=" + this.f17634w + ", presStateCode=" + this.f17635x + ", presLocation=" + this.f17636y + ", permDistrictCode=" + this.f17637z + ", stayPeriodMonths=" + this.A + ", permCity=" + this.B + ", permStreet=" + this.C + ", presVillageOrTown=" + this.D + ", permPinCode=" + this.E + ", stayPeriodYears=" + this.F + ')';
    }

    public final String u() {
        return this.f17636y;
    }

    public final String v() {
        return this.f17629r;
    }

    public final String w() {
        return this.f17622k;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.f17616e);
        parcel.writeString(this.f17617f);
        parcel.writeString(this.f17618g);
        parcel.writeString(this.f17619h);
        parcel.writeString(this.f17620i);
        parcel.writeString(this.f17621j);
        parcel.writeString(this.f17622k);
        parcel.writeString(this.f17623l);
        parcel.writeString(this.f17624m);
        parcel.writeString(this.f17625n);
        parcel.writeString(this.f17626o);
        parcel.writeString(this.f17627p);
        parcel.writeString(this.f17628q);
        parcel.writeString(this.f17629r);
        parcel.writeString(this.f17630s);
        parcel.writeString(this.f17631t);
        parcel.writeString(this.f17632u);
        parcel.writeString(this.f17633v);
        parcel.writeString(this.f17634w);
        parcel.writeString(this.f17635x);
        parcel.writeString(this.f17636y);
        parcel.writeString(this.f17637z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
    }

    public final String x() {
        return this.f17635x;
    }

    public final String y() {
        return this.f17620i;
    }

    public final String z() {
        return this.f17628q;
    }
}
