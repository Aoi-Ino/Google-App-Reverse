package fg;

import cm.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f23452a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23453b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23454c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23455d;

    /* renamed from: e  reason: collision with root package name */
    private final int f23456e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23457f;

    /* renamed from: g  reason: collision with root package name */
    private final int f23458g;

    /* renamed from: h  reason: collision with root package name */
    private final String f23459h;

    /* renamed from: i  reason: collision with root package name */
    private final String f23460i;

    /* renamed from: j  reason: collision with root package name */
    private final String f23461j;

    /* renamed from: k  reason: collision with root package name */
    private final String f23462k;

    /* renamed from: l  reason: collision with root package name */
    private final String f23463l;

    /* renamed from: m  reason: collision with root package name */
    private final int f23464m;

    /* renamed from: n  reason: collision with root package name */
    private final String f23465n;

    /* renamed from: o  reason: collision with root package name */
    private final String f23466o;

    public a(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, String str12) {
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        l.f(str, "allotmentOffice");
        l.f(str13, "applNo");
        l.f(str14, "authrizationUpto");
        l.f(str15, "entryStatus");
        l.f(str16, "ipAddress");
        l.f(str17, "previousAuthrizationFrom");
        l.f(str18, "previousAuthrizationNo");
        l.f(str19, "previousAuthrizationUpto");
        l.f(str20, "previousIssueDate");
        l.f(str21, "previousPermitNo");
        l.f(str22, "regnNo");
        l.f(str23, "stateCode");
        this.f23452a = str;
        this.f23453b = str13;
        this.f23454c = str14;
        this.f23455d = str15;
        this.f23456e = i10;
        this.f23457f = str16;
        this.f23458g = i11;
        this.f23459h = str17;
        this.f23460i = str18;
        this.f23461j = str19;
        this.f23462k = str20;
        this.f23463l = str21;
        this.f23464m = i12;
        this.f23465n = str22;
        this.f23466o = str23;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f23452a, aVar.f23452a) && l.a(this.f23453b, aVar.f23453b) && l.a(this.f23454c, aVar.f23454c) && l.a(this.f23455d, aVar.f23455d) && this.f23456e == aVar.f23456e && l.a(this.f23457f, aVar.f23457f) && this.f23458g == aVar.f23458g && l.a(this.f23459h, aVar.f23459h) && l.a(this.f23460i, aVar.f23460i) && l.a(this.f23461j, aVar.f23461j) && l.a(this.f23462k, aVar.f23462k) && l.a(this.f23463l, aVar.f23463l) && this.f23464m == aVar.f23464m && l.a(this.f23465n, aVar.f23465n) && l.a(this.f23466o, aVar.f23466o);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f23452a.hashCode() * 31) + this.f23453b.hashCode()) * 31) + this.f23454c.hashCode()) * 31) + this.f23455d.hashCode()) * 31) + Integer.hashCode(this.f23456e)) * 31) + this.f23457f.hashCode()) * 31) + Integer.hashCode(this.f23458g)) * 31) + this.f23459h.hashCode()) * 31) + this.f23460i.hashCode()) * 31) + this.f23461j.hashCode()) * 31) + this.f23462k.hashCode()) * 31) + this.f23463l.hashCode()) * 31) + Integer.hashCode(this.f23464m)) * 31) + this.f23465n.hashCode()) * 31) + this.f23466o.hashCode();
    }

    public String toString() {
        return "RenewalOfPermitSavetoDraftRequest(allotmentOffice=" + this.f23452a + ", applNo=" + this.f23453b + ", authrizationUpto=" + this.f23454c + ", entryStatus=" + this.f23455d + ", flowSrno=" + this.f23456e + ", ipAddress=" + this.f23457f + ", officeCode=" + this.f23458g + ", previousAuthrizationFrom=" + this.f23459h + ", previousAuthrizationNo=" + this.f23460i + ", previousAuthrizationUpto=" + this.f23461j + ", previousIssueDate=" + this.f23462k + ", previousPermitNo=" + this.f23463l + ", purposeCode=" + this.f23464m + ", regnNo=" + this.f23465n + ", stateCode=" + this.f23466o + ')';
    }
}
