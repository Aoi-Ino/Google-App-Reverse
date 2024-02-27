package bk;

import cm.l;
import com.nic.mparivahan.dlservices.ui.renewalofdl.SelectRenewalDLlist;
import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private String f19964a;

    /* renamed from: b  reason: collision with root package name */
    private String f19965b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19966c;

    /* renamed from: d  reason: collision with root package name */
    private String f19967d;

    /* renamed from: e  reason: collision with root package name */
    private String f19968e;

    /* renamed from: f  reason: collision with root package name */
    private SelectRenewalDLlist f19969f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f19970g;

    public m(String str, String str2, String str3, String str4, String str5, SelectRenewalDLlist selectRenewalDLlist, ArrayList arrayList) {
        l.f(str, "dlno");
        l.f(str2, "dob");
        l.f(str3, "rtoCodeDLTr");
        l.f(str4, "applcatgDLserReq");
        l.f(str5, "mobileNumber");
        l.f(selectRenewalDLlist, "selectedDLSerList");
        l.f(arrayList, "covsForRetest");
        this.f19964a = str;
        this.f19965b = str2;
        this.f19966c = str3;
        this.f19967d = str4;
        this.f19968e = str5;
        this.f19969f = selectRenewalDLlist;
        this.f19970g = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f19964a, mVar.f19964a) && l.a(this.f19965b, mVar.f19965b) && l.a(this.f19966c, mVar.f19966c) && l.a(this.f19967d, mVar.f19967d) && l.a(this.f19968e, mVar.f19968e) && l.a(this.f19969f, mVar.f19969f) && l.a(this.f19970g, mVar.f19970g);
    }

    public int hashCode() {
        return (((((((((((this.f19964a.hashCode() * 31) + this.f19965b.hashCode()) * 31) + this.f19966c.hashCode()) * 31) + this.f19967d.hashCode()) * 31) + this.f19968e.hashCode()) * 31) + this.f19969f.hashCode()) * 31) + this.f19970g.hashCode();
    }

    public String toString() {
        return "RenewalValidation(dlno=" + this.f19964a + ", dob=" + this.f19965b + ", rtoCodeDLTr=" + this.f19966c + ", applcatgDLserReq=" + this.f19967d + ", mobileNumber=" + this.f19968e + ", selectedDLSerList=" + this.f19969f + ", covsForRetest=" + this.f19970g + ')';
    }
}
