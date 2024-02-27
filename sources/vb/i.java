package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f17667e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17668f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17669g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17670h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17671i;

    /* renamed from: j  reason: collision with root package name */
    private final String f17672j;

    /* renamed from: k  reason: collision with root package name */
    private final String f17673k;

    /* renamed from: l  reason: collision with root package name */
    private final String f17674l;

    /* renamed from: m  reason: collision with root package name */
    private final String f17675m;

    /* renamed from: n  reason: collision with root package name */
    private final String f17676n;

    /* renamed from: o  reason: collision with root package name */
    private final String f17677o;

    /* renamed from: p  reason: collision with root package name */
    private final String f17678p;

    /* renamed from: q  reason: collision with root package name */
    private final String f17679q;

    /* renamed from: r  reason: collision with root package name */
    private final String f17680r;

    /* renamed from: s  reason: collision with root package name */
    private final String f17681s;

    /* renamed from: t  reason: collision with root package name */
    private final String f17682t;

    /* renamed from: u  reason: collision with root package name */
    private final String f17683u;

    /* renamed from: v  reason: collision with root package name */
    private final String f17684v;

    /* renamed from: w  reason: collision with root package name */
    private final String f17685w;

    /* renamed from: x  reason: collision with root package name */
    private final String f17686x;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final i createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str16;
        l.f(str21, "fname");
        l.f(str22, "relationType");
        l.f(str23, "swdLname");
        l.f(str24, "gender");
        l.f(str25, "countryOfBirthCode");
        l.f(str26, "countryOfBirth");
        l.f(str27, "bloodGroupCode");
        l.f(str28, "mobileNumber");
        l.f(str29, "fullName");
        l.f(str30, "dateOfBirth");
        l.f(str31, "mname");
        l.f(str32, "swdFname");
        l.f(str33, "lname");
        l.f(str34, "eduQualCode");
        l.f(str15, "eduQual");
        l.f(str16, "swdMname");
        l.f(str17, "idMarks1");
        l.f(str18, "idMarks2");
        l.f(str19, "email");
        l.f(str20, "altMobileNo");
        this.f17667e = str21;
        this.f17668f = str22;
        this.f17669g = str23;
        this.f17670h = str24;
        this.f17671i = str25;
        this.f17672j = str26;
        this.f17673k = str27;
        this.f17674l = str28;
        this.f17675m = str29;
        this.f17676n = str30;
        this.f17677o = str31;
        this.f17678p = str32;
        this.f17679q = str33;
        this.f17680r = str34;
        this.f17681s = str15;
        this.f17682t = str16;
        this.f17683u = str17;
        this.f17684v = str18;
        this.f17685w = str19;
        this.f17686x = str20;
    }

    public final String c() {
        return this.f17686x;
    }

    public final String d() {
        return this.f17673k;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f17672j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f17667e, iVar.f17667e) && l.a(this.f17668f, iVar.f17668f) && l.a(this.f17669g, iVar.f17669g) && l.a(this.f17670h, iVar.f17670h) && l.a(this.f17671i, iVar.f17671i) && l.a(this.f17672j, iVar.f17672j) && l.a(this.f17673k, iVar.f17673k) && l.a(this.f17674l, iVar.f17674l) && l.a(this.f17675m, iVar.f17675m) && l.a(this.f17676n, iVar.f17676n) && l.a(this.f17677o, iVar.f17677o) && l.a(this.f17678p, iVar.f17678p) && l.a(this.f17679q, iVar.f17679q) && l.a(this.f17680r, iVar.f17680r) && l.a(this.f17681s, iVar.f17681s) && l.a(this.f17682t, iVar.f17682t) && l.a(this.f17683u, iVar.f17683u) && l.a(this.f17684v, iVar.f17684v) && l.a(this.f17685w, iVar.f17685w) && l.a(this.f17686x, iVar.f17686x);
    }

    public final String f() {
        return this.f17671i;
    }

    public final String g() {
        return this.f17676n;
    }

    public final String h() {
        return this.f17680r;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.f17667e.hashCode() * 31) + this.f17668f.hashCode()) * 31) + this.f17669g.hashCode()) * 31) + this.f17670h.hashCode()) * 31) + this.f17671i.hashCode()) * 31) + this.f17672j.hashCode()) * 31) + this.f17673k.hashCode()) * 31) + this.f17674l.hashCode()) * 31) + this.f17675m.hashCode()) * 31) + this.f17676n.hashCode()) * 31) + this.f17677o.hashCode()) * 31) + this.f17678p.hashCode()) * 31) + this.f17679q.hashCode()) * 31) + this.f17680r.hashCode()) * 31) + this.f17681s.hashCode()) * 31) + this.f17682t.hashCode()) * 31) + this.f17683u.hashCode()) * 31) + this.f17684v.hashCode()) * 31) + this.f17685w.hashCode()) * 31) + this.f17686x.hashCode();
    }

    public final String i() {
        return this.f17685w;
    }

    public final String j() {
        return this.f17667e;
    }

    public final String k() {
        return this.f17675m;
    }

    public final String l() {
        return this.f17670h;
    }

    public final String m() {
        return this.f17683u;
    }

    public final String n() {
        return this.f17684v;
    }

    public final String o() {
        return this.f17679q;
    }

    public final String p() {
        return this.f17677o;
    }

    public final String q() {
        return this.f17674l;
    }

    public final String r() {
        return this.f17668f;
    }

    public final String s() {
        return this.f17678p;
    }

    public final String t() {
        return this.f17669g;
    }

    public String toString() {
        return "PersonalDetailsModal(fname=" + this.f17667e + ", relationType=" + this.f17668f + ", swdLname=" + this.f17669g + ", gender=" + this.f17670h + ", countryOfBirthCode=" + this.f17671i + ", countryOfBirth=" + this.f17672j + ", bloodGroupCode=" + this.f17673k + ", mobileNumber=" + this.f17674l + ", fullName=" + this.f17675m + ", dateOfBirth=" + this.f17676n + ", mname=" + this.f17677o + ", swdFname=" + this.f17678p + ", lname=" + this.f17679q + ", eduQualCode=" + this.f17680r + ", eduQual=" + this.f17681s + ", swdMname=" + this.f17682t + ", idMarks1=" + this.f17683u + ", idMarks2=" + this.f17684v + ", email=" + this.f17685w + ", altMobileNo=" + this.f17686x + ')';
    }

    public final String u() {
        return this.f17682t;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.f17667e);
        parcel.writeString(this.f17668f);
        parcel.writeString(this.f17669g);
        parcel.writeString(this.f17670h);
        parcel.writeString(this.f17671i);
        parcel.writeString(this.f17672j);
        parcel.writeString(this.f17673k);
        parcel.writeString(this.f17674l);
        parcel.writeString(this.f17675m);
        parcel.writeString(this.f17676n);
        parcel.writeString(this.f17677o);
        parcel.writeString(this.f17678p);
        parcel.writeString(this.f17679q);
        parcel.writeString(this.f17680r);
        parcel.writeString(this.f17681s);
        parcel.writeString(this.f17682t);
        parcel.writeString(this.f17683u);
        parcel.writeString(this.f17684v);
        parcel.writeString(this.f17685w);
        parcel.writeString(this.f17686x);
    }
}
