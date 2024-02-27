package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class NocDraftResponse implements Serializable {
    private final String aadhaartxno;
    private final String appl_no;
    private final String dispatch_no;
    private final String issue_date;
    private final String ncrb_ref;
    private final String new_own_name;
    private final boolean nocRetention;
    private final String noc_dt;
    private final int off_cd;
    private final int off_to;
    private final int reason;
    private final String regn_no;
    private final String rto_to;
    private final String state_cd;
    private final String state_to;

    public NocDraftResponse(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10, String str11) {
        this.appl_no = str;
        this.dispatch_no = str2;
        this.issue_date = str3;
        this.ncrb_ref = str4;
        this.new_own_name = str5;
        this.nocRetention = z10;
        this.noc_dt = str6;
        this.off_cd = i10;
        this.off_to = i11;
        this.reason = i12;
        this.regn_no = str7;
        this.rto_to = str8;
        this.state_cd = str9;
        this.state_to = str10;
        this.aadhaartxno = str11;
    }

    public static /* synthetic */ NocDraftResponse copy$default(NocDraftResponse nocDraftResponse, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10, String str11, int i13, Object obj) {
        NocDraftResponse nocDraftResponse2 = nocDraftResponse;
        int i14 = i13;
        return nocDraftResponse.copy((i14 & 1) != 0 ? nocDraftResponse2.appl_no : str, (i14 & 2) != 0 ? nocDraftResponse2.dispatch_no : str2, (i14 & 4) != 0 ? nocDraftResponse2.issue_date : str3, (i14 & 8) != 0 ? nocDraftResponse2.ncrb_ref : str4, (i14 & 16) != 0 ? nocDraftResponse2.new_own_name : str5, (i14 & 32) != 0 ? nocDraftResponse2.nocRetention : z10, (i14 & 64) != 0 ? nocDraftResponse2.noc_dt : str6, (i14 & 128) != 0 ? nocDraftResponse2.off_cd : i10, (i14 & 256) != 0 ? nocDraftResponse2.off_to : i11, (i14 & 512) != 0 ? nocDraftResponse2.reason : i12, (i14 & 1024) != 0 ? nocDraftResponse2.regn_no : str7, (i14 & 2048) != 0 ? nocDraftResponse2.rto_to : str8, (i14 & 4096) != 0 ? nocDraftResponse2.state_cd : str9, (i14 & 8192) != 0 ? nocDraftResponse2.state_to : str10, (i14 & 16384) != 0 ? nocDraftResponse2.aadhaartxno : str11);
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

    public final String component15() {
        return this.aadhaartxno;
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

    public final int component8() {
        return this.off_cd;
    }

    public final int component9() {
        return this.off_to;
    }

    public final NocDraftResponse copy(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10, String str11) {
        return new NocDraftResponse(str, str2, str3, str4, str5, z10, str6, i10, i11, i12, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NocDraftResponse)) {
            return false;
        }
        NocDraftResponse nocDraftResponse = (NocDraftResponse) obj;
        return l.a(this.appl_no, nocDraftResponse.appl_no) && l.a(this.dispatch_no, nocDraftResponse.dispatch_no) && l.a(this.issue_date, nocDraftResponse.issue_date) && l.a(this.ncrb_ref, nocDraftResponse.ncrb_ref) && l.a(this.new_own_name, nocDraftResponse.new_own_name) && this.nocRetention == nocDraftResponse.nocRetention && l.a(this.noc_dt, nocDraftResponse.noc_dt) && this.off_cd == nocDraftResponse.off_cd && this.off_to == nocDraftResponse.off_to && this.reason == nocDraftResponse.reason && l.a(this.regn_no, nocDraftResponse.regn_no) && l.a(this.rto_to, nocDraftResponse.rto_to) && l.a(this.state_cd, nocDraftResponse.state_cd) && l.a(this.state_to, nocDraftResponse.state_to) && l.a(this.aadhaartxno, nocDraftResponse.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
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

    public final int getOff_cd() {
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
        String str = this.appl_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dispatch_no;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issue_date;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ncrb_ref;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.new_own_name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z10 = this.nocRetention;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode5 + (z10 ? 1 : 0)) * 31;
        String str6 = this.noc_dt;
        int hashCode6 = (((((((i11 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.off_cd)) * 31) + Integer.hashCode(this.off_to)) * 31) + Integer.hashCode(this.reason)) * 31;
        String str7 = this.regn_no;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rto_to;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.state_cd;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.state_to;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.aadhaartxno;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        return "NocDraftResponse(appl_no=" + this.appl_no + ", dispatch_no=" + this.dispatch_no + ", issue_date=" + this.issue_date + ", ncrb_ref=" + this.ncrb_ref + ", new_own_name=" + this.new_own_name + ", nocRetention=" + this.nocRetention + ", noc_dt=" + this.noc_dt + ", off_cd=" + this.off_cd + ", off_to=" + this.off_to + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", rto_to=" + this.rto_to + ", state_cd=" + this.state_cd + ", state_to=" + this.state_to + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
