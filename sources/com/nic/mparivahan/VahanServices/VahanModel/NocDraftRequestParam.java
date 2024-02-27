package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class NocDraftRequestParam implements Serializable {
    private final String appl_no;
    private final String dispatch_no;
    private final String issue_date;
    private final String ncrb_ref;
    private final String new_own_name;
    private final boolean nocRetention;
    private final String noc_dt;
    private final String off_cd;
    private final int off_to;
    private final int reason;
    private final String regn_no;
    private final String rto_to;
    private final String state_cd;
    private final String state_to;

    public NocDraftRequestParam(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, int i10, int i11, String str8, String str9, String str10, String str11) {
        l.f(str, "appl_no");
        l.f(str2, "dispatch_no");
        l.f(str3, "issue_date");
        l.f(str4, "ncrb_ref");
        l.f(str5, "new_own_name");
        l.f(str6, "noc_dt");
        l.f(str7, "off_cd");
        l.f(str8, "regn_no");
        l.f(str9, "rto_to");
        l.f(str10, "state_cd");
        l.f(str11, "state_to");
        this.appl_no = str;
        this.dispatch_no = str2;
        this.issue_date = str3;
        this.ncrb_ref = str4;
        this.new_own_name = str5;
        this.nocRetention = z10;
        this.noc_dt = str6;
        this.off_cd = str7;
        this.off_to = i10;
        this.reason = i11;
        this.regn_no = str8;
        this.rto_to = str9;
        this.state_cd = str10;
        this.state_to = str11;
    }

    public static /* synthetic */ NocDraftRequestParam copy$default(NocDraftRequestParam nocDraftRequestParam, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, int i10, int i11, String str8, String str9, String str10, String str11, int i12, Object obj) {
        NocDraftRequestParam nocDraftRequestParam2 = nocDraftRequestParam;
        int i13 = i12;
        return nocDraftRequestParam.copy((i13 & 1) != 0 ? nocDraftRequestParam2.appl_no : str, (i13 & 2) != 0 ? nocDraftRequestParam2.dispatch_no : str2, (i13 & 4) != 0 ? nocDraftRequestParam2.issue_date : str3, (i13 & 8) != 0 ? nocDraftRequestParam2.ncrb_ref : str4, (i13 & 16) != 0 ? nocDraftRequestParam2.new_own_name : str5, (i13 & 32) != 0 ? nocDraftRequestParam2.nocRetention : z10, (i13 & 64) != 0 ? nocDraftRequestParam2.noc_dt : str6, (i13 & 128) != 0 ? nocDraftRequestParam2.off_cd : str7, (i13 & 256) != 0 ? nocDraftRequestParam2.off_to : i10, (i13 & 512) != 0 ? nocDraftRequestParam2.reason : i11, (i13 & 1024) != 0 ? nocDraftRequestParam2.regn_no : str8, (i13 & 2048) != 0 ? nocDraftRequestParam2.rto_to : str9, (i13 & 4096) != 0 ? nocDraftRequestParam2.state_cd : str10, (i13 & 8192) != 0 ? nocDraftRequestParam2.state_to : str11);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final int component10() {
        return this.reason;
    }

    public final String component11() {
        return this.regn_no;
    }

    public final String component12() {
        return this.rto_to;
    }

    public final String component13() {
        return this.state_cd;
    }

    public final String component14() {
        return this.state_to;
    }

    public final String component2() {
        return this.dispatch_no;
    }

    public final String component3() {
        return this.issue_date;
    }

    public final String component4() {
        return this.ncrb_ref;
    }

    public final String component5() {
        return this.new_own_name;
    }

    public final boolean component6() {
        return this.nocRetention;
    }

    public final String component7() {
        return this.noc_dt;
    }

    public final String component8() {
        return this.off_cd;
    }

    public final int component9() {
        return this.off_to;
    }

    public final NocDraftRequestParam copy(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, int i10, int i11, String str8, String str9, String str10, String str11) {
        String str12 = str;
        l.f(str12, "appl_no");
        String str13 = str2;
        l.f(str13, "dispatch_no");
        String str14 = str3;
        l.f(str14, "issue_date");
        String str15 = str4;
        l.f(str15, "ncrb_ref");
        String str16 = str5;
        l.f(str16, "new_own_name");
        String str17 = str6;
        l.f(str17, "noc_dt");
        String str18 = str7;
        l.f(str18, "off_cd");
        String str19 = str8;
        l.f(str19, "regn_no");
        String str20 = str9;
        l.f(str20, "rto_to");
        String str21 = str10;
        l.f(str21, "state_cd");
        String str22 = str11;
        l.f(str22, "state_to");
        return new NocDraftRequestParam(str12, str13, str14, str15, str16, z10, str17, str18, i10, i11, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NocDraftRequestParam)) {
            return false;
        }
        NocDraftRequestParam nocDraftRequestParam = (NocDraftRequestParam) obj;
        return l.a(this.appl_no, nocDraftRequestParam.appl_no) && l.a(this.dispatch_no, nocDraftRequestParam.dispatch_no) && l.a(this.issue_date, nocDraftRequestParam.issue_date) && l.a(this.ncrb_ref, nocDraftRequestParam.ncrb_ref) && l.a(this.new_own_name, nocDraftRequestParam.new_own_name) && this.nocRetention == nocDraftRequestParam.nocRetention && l.a(this.noc_dt, nocDraftRequestParam.noc_dt) && l.a(this.off_cd, nocDraftRequestParam.off_cd) && this.off_to == nocDraftRequestParam.off_to && this.reason == nocDraftRequestParam.reason && l.a(this.regn_no, nocDraftRequestParam.regn_no) && l.a(this.rto_to, nocDraftRequestParam.rto_to) && l.a(this.state_cd, nocDraftRequestParam.state_cd) && l.a(this.state_to, nocDraftRequestParam.state_to);
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getDispatch_no() {
        return this.dispatch_no;
    }

    public final String getIssue_date() {
        return this.issue_date;
    }

    public final String getNcrb_ref() {
        return this.ncrb_ref;
    }

    public final String getNew_own_name() {
        return this.new_own_name;
    }

    public final boolean getNocRetention() {
        return this.nocRetention;
    }

    public final String getNoc_dt() {
        return this.noc_dt;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final int getOff_to() {
        return this.off_to;
    }

    public final int getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getRto_to() {
        return this.rto_to;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_to() {
        return this.state_to;
    }

    public int hashCode() {
        int hashCode = ((((((((this.appl_no.hashCode() * 31) + this.dispatch_no.hashCode()) * 31) + this.issue_date.hashCode()) * 31) + this.ncrb_ref.hashCode()) * 31) + this.new_own_name.hashCode()) * 31;
        boolean z10 = this.nocRetention;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.noc_dt.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + Integer.hashCode(this.off_to)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.rto_to.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_to.hashCode();
    }

    public String toString() {
        return "NocDraftRequestParam(appl_no=" + this.appl_no + ", dispatch_no=" + this.dispatch_no + ", issue_date=" + this.issue_date + ", ncrb_ref=" + this.ncrb_ref + ", new_own_name=" + this.new_own_name + ", nocRetention=" + this.nocRetention + ", noc_dt=" + this.noc_dt + ", off_cd=" + this.off_cd + ", off_to=" + this.off_to + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", rto_to=" + this.rto_to + ", state_cd=" + this.state_cd + ", state_to=" + this.state_to + ')';
    }
}
