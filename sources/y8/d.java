package y8;

import cm.l;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f18625a;

    /* renamed from: b  reason: collision with root package name */
    private String f18626b;

    /* renamed from: c  reason: collision with root package name */
    private String f18627c;

    /* renamed from: d  reason: collision with root package name */
    private String f18628d;

    /* renamed from: e  reason: collision with root package name */
    private String f18629e;

    /* renamed from: f  reason: collision with root package name */
    private String f18630f;

    /* renamed from: g  reason: collision with root package name */
    private String f18631g;

    /* renamed from: h  reason: collision with root package name */
    private final String f18632h;

    /* renamed from: i  reason: collision with root package name */
    private String f18633i;

    /* renamed from: j  reason: collision with root package name */
    private String f18634j;

    /* renamed from: k  reason: collision with root package name */
    private String f18635k;

    /* renamed from: l  reason: collision with root package name */
    private String f18636l;

    /* renamed from: m  reason: collision with root package name */
    private String f18637m;

    /* renamed from: n  reason: collision with root package name */
    private String f18638n;

    /* renamed from: o  reason: collision with root package name */
    private String f18639o;

    /* renamed from: p  reason: collision with root package name */
    private String f18640p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList f18641q;

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ArrayList arrayList) {
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        String str27 = str14;
        String str28 = str15;
        String str29 = str16;
        ArrayList arrayList2 = arrayList;
        l.f(str17, "agentServiceName");
        l.f(str18, "stCode");
        l.f(str19, "applicantCategory");
        l.f(str20, "dlnum");
        l.f(str21, "llnum");
        l.f(str22, "scopea");
        l.f(str23, "scopeb");
        l.f(str24, "scopec");
        l.f(str25, "scoped");
        l.f(str26, "scopee");
        l.f(str27, "scopef");
        l.f(str28, "scopeg");
        l.f(str29, "declaringcheck");
        l.f(arrayList2, "selectedCovsList");
        this.f18625a = str;
        this.f18626b = str2;
        this.f18627c = str3;
        this.f18628d = str17;
        this.f18629e = str18;
        this.f18630f = str19;
        this.f18631g = str20;
        this.f18632h = str21;
        this.f18633i = str22;
        this.f18634j = str23;
        this.f18635k = str24;
        this.f18636l = str25;
        this.f18637m = str26;
        this.f18638n = str27;
        this.f18639o = str28;
        this.f18640p = str29;
        this.f18641q = arrayList2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f18625a, dVar.f18625a) && l.a(this.f18626b, dVar.f18626b) && l.a(this.f18627c, dVar.f18627c) && l.a(this.f18628d, dVar.f18628d) && l.a(this.f18629e, dVar.f18629e) && l.a(this.f18630f, dVar.f18630f) && l.a(this.f18631g, dVar.f18631g) && l.a(this.f18632h, dVar.f18632h) && l.a(this.f18633i, dVar.f18633i) && l.a(this.f18634j, dVar.f18634j) && l.a(this.f18635k, dVar.f18635k) && l.a(this.f18636l, dVar.f18636l) && l.a(this.f18637m, dVar.f18637m) && l.a(this.f18638n, dVar.f18638n) && l.a(this.f18639o, dVar.f18639o) && l.a(this.f18640p, dVar.f18640p) && l.a(this.f18641q, dVar.f18641q);
    }

    public int hashCode() {
        String str = this.f18625a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18626b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18627c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((((((((((((((((((((((((hashCode2 + i10) * 31) + this.f18628d.hashCode()) * 31) + this.f18629e.hashCode()) * 31) + this.f18630f.hashCode()) * 31) + this.f18631g.hashCode()) * 31) + this.f18632h.hashCode()) * 31) + this.f18633i.hashCode()) * 31) + this.f18634j.hashCode()) * 31) + this.f18635k.hashCode()) * 31) + this.f18636l.hashCode()) * 31) + this.f18637m.hashCode()) * 31) + this.f18638n.hashCode()) * 31) + this.f18639o.hashCode()) * 31) + this.f18640p.hashCode()) * 31) + this.f18641q.hashCode();
    }

    public String toString() {
        return "SubmitRequest(agentId=" + this.f18625a + ", agentPwd=" + this.f18626b + ", agentIpAddress=" + this.f18627c + ", agentServiceName=" + this.f18628d + ", stCode=" + this.f18629e + ", applicantCategory=" + this.f18630f + ", dlnum=" + this.f18631g + ", llnum=" + this.f18632h + ", scopea=" + this.f18633i + ", scopeb=" + this.f18634j + ", scopec=" + this.f18635k + ", scoped=" + this.f18636l + ", scopee=" + this.f18637m + ", scopef=" + this.f18638n + ", scopeg=" + this.f18639o + ", declaringcheck=" + this.f18640p + ", selectedCovsList=" + this.f18641q + ')';
    }
}
