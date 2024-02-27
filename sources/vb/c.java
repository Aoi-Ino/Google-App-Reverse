package vb;

import android.os.Parcel;
import android.os.Parcelable;
import cm.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final String f17640e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17641f;

    /* renamed from: g  reason: collision with root package name */
    private final String f17642g;

    /* renamed from: h  reason: collision with root package name */
    private final String f17643h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17644i;

    /* renamed from: j  reason: collision with root package name */
    private final String f17645j;

    /* renamed from: k  reason: collision with root package name */
    private final String f17646k;

    /* renamed from: l  reason: collision with root package name */
    private final String f17647l;

    /* renamed from: m  reason: collision with root package name */
    private final String f17648m;

    /* renamed from: n  reason: collision with root package name */
    private final String f17649n;

    /* renamed from: o  reason: collision with root package name */
    private final String f17650o;

    /* renamed from: p  reason: collision with root package name */
    private final String f17651p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f17652q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList f17653r;

    /* renamed from: s  reason: collision with root package name */
    private final ArrayList f17654s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList f17655t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList f17656u;

    /* renamed from: v  reason: collision with root package name */
    private final f f17657v;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z10;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Parcel parcel2 = parcel;
            l.f(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z10 = z12;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt);
                z10 = z12;
                int i10 = 0;
                while (i10 != readInt) {
                    arrayList5.add(i.CREATOR.createFromParcel(parcel2));
                    i10++;
                    readInt = readInt;
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    arrayList6.add(a.CREATOR.createFromParcel(parcel2));
                    i11++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList7.add(j.CREATOR.createFromParcel(parcel2));
                    i12++;
                    readInt3 = readInt3;
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt4);
                int i13 = 0;
                while (i13 != readInt4) {
                    arrayList8.add(b.CREATOR.createFromParcel(parcel2));
                    i13++;
                    readInt4 = readInt4;
                }
                arrayList4 = arrayList8;
            }
            return new c(readString, readString2, readString3, readString4, z11, readString5, readString6, readString7, readString8, readString9, readString10, readString11, z10, arrayList, arrayList2, arrayList3, arrayList4, f.CREATOR.createFromParcel(parcel2));
        }

        /* renamed from: b */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, f fVar) {
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        String str21 = str11;
        f fVar2 = fVar;
        l.f(str, "statusCode");
        l.f(str12, "statusDesc");
        l.f(str13, "licenceFromState");
        l.f(str14, "applCatg");
        l.f(str15, "applDate");
        l.f(str16, "applicationNumber");
        l.f(str17, "licenceFromRTOCode");
        l.f(str18, "licenceFromStateCode");
        l.f(str19, "reference");
        l.f(str20, "licenceFromRTO");
        l.f(str21, "jurisdiction");
        l.f(fVar2, "LLDetails");
        this.f17640e = str;
        this.f17641f = str12;
        this.f17642g = str13;
        this.f17643h = str14;
        this.f17644i = z10;
        this.f17645j = str15;
        this.f17646k = str16;
        this.f17647l = str17;
        this.f17648m = str18;
        this.f17649n = str19;
        this.f17650o = str20;
        this.f17651p = str21;
        this.f17652q = z11;
        this.f17653r = arrayList;
        this.f17654s = arrayList2;
        this.f17655t = arrayList3;
        this.f17656u = arrayList4;
        this.f17657v = fVar2;
    }

    public final ArrayList c() {
        return this.f17654s;
    }

    public final boolean d() {
        return this.f17644i;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f17643h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f17640e, cVar.f17640e) && l.a(this.f17641f, cVar.f17641f) && l.a(this.f17642g, cVar.f17642g) && l.a(this.f17643h, cVar.f17643h) && this.f17644i == cVar.f17644i && l.a(this.f17645j, cVar.f17645j) && l.a(this.f17646k, cVar.f17646k) && l.a(this.f17647l, cVar.f17647l) && l.a(this.f17648m, cVar.f17648m) && l.a(this.f17649n, cVar.f17649n) && l.a(this.f17650o, cVar.f17650o) && l.a(this.f17651p, cVar.f17651p) && this.f17652q == cVar.f17652q && l.a(this.f17653r, cVar.f17653r) && l.a(this.f17654s, cVar.f17654s) && l.a(this.f17655t, cVar.f17655t) && l.a(this.f17656u, cVar.f17656u) && l.a(this.f17657v, cVar.f17657v);
    }

    public final String f() {
        return this.f17645j;
    }

    public final String g() {
        return this.f17646k;
    }

    public final ArrayList h() {
        return this.f17656u;
    }

    public int hashCode() {
        int hashCode = ((((((this.f17640e.hashCode() * 31) + this.f17641f.hashCode()) * 31) + this.f17642g.hashCode()) * 31) + this.f17643h.hashCode()) * 31;
        boolean z10 = this.f17644i;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode2 = (((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.f17645j.hashCode()) * 31) + this.f17646k.hashCode()) * 31) + this.f17647l.hashCode()) * 31) + this.f17648m.hashCode()) * 31) + this.f17649n.hashCode()) * 31) + this.f17650o.hashCode()) * 31) + this.f17651p.hashCode()) * 31;
        boolean z12 = this.f17652q;
        if (!z12) {
            z11 = z12;
        }
        int i10 = (hashCode2 + (z11 ? 1 : 0)) * 31;
        ArrayList arrayList = this.f17653r;
        int i11 = 0;
        int hashCode3 = (i10 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f17654s;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.f17655t;
        int hashCode5 = (hashCode4 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList arrayList4 = this.f17656u;
        if (arrayList4 != null) {
            i11 = arrayList4.hashCode();
        }
        return ((hashCode5 + i11) * 31) + this.f17657v.hashCode();
    }

    public final String i() {
        return this.f17651p;
    }

    public final String j() {
        return this.f17650o;
    }

    public final String k() {
        return this.f17647l;
    }

    public final String l() {
        return this.f17648m;
    }

    public final ArrayList m() {
        return this.f17653r;
    }

    public final String n() {
        return this.f17649n;
    }

    public final ArrayList o() {
        return this.f17655t;
    }

    public final String p() {
        return this.f17640e;
    }

    public final boolean q() {
        return this.f17652q;
    }

    public String toString() {
        return "DetailsSuccessModal(statusCode=" + this.f17640e + ", statusDesc=" + this.f17641f + ", licenceFromState=" + this.f17642g + ", applCatg=" + this.f17643h + ", allowNewAddr=" + this.f17644i + ", applDate=" + this.f17645j + ", applicationNumber=" + this.f17646k + ", licenceFromRTOCode=" + this.f17647l + ", licenceFromStateCode=" + this.f17648m + ", reference=" + this.f17649n + ", licenceFromRTO=" + this.f17650o + ", jurisdiction=" + this.f17651p + ", willingToDonate=" + this.f17652q + ", personalDetails=" + this.f17653r + ", AddressDetails=" + this.f17654s + ", selectedCovList=" + this.f17655t + ", covDetails=" + this.f17656u + ", LLDetails=" + this.f17657v + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.f17640e);
        parcel.writeString(this.f17641f);
        parcel.writeString(this.f17642g);
        parcel.writeString(this.f17643h);
        parcel.writeInt(this.f17644i ? 1 : 0);
        parcel.writeString(this.f17645j);
        parcel.writeString(this.f17646k);
        parcel.writeString(this.f17647l);
        parcel.writeString(this.f17648m);
        parcel.writeString(this.f17649n);
        parcel.writeString(this.f17650o);
        parcel.writeString(this.f17651p);
        parcel.writeInt(this.f17652q ? 1 : 0);
        ArrayList arrayList = this.f17653r;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).writeToParcel(parcel, i10);
            }
        }
        ArrayList arrayList2 = this.f17654s;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).writeToParcel(parcel, i10);
            }
        }
        ArrayList arrayList3 = this.f17655t;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((j) it3.next()).writeToParcel(parcel, i10);
            }
        }
        ArrayList arrayList4 = this.f17656u;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((b) it4.next()).writeToParcel(parcel, i10);
            }
        }
        this.f17657v.writeToParcel(parcel, i10);
    }
}
