package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NocDto {
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

    public NocDto(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10) {
        l.f(str, "appl_no");
        l.f(str2, "dispatch_no");
        l.f(str3, "issue_date");
        l.f(str4, "ncrb_ref");
        l.f(str5, "new_own_name");
        l.f(str6, "noc_dt");
        l.f(str7, "regn_no");
        l.f(str8, "rto_to");
        l.f(str9, "state_cd");
        l.f(str10, "state_to");
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
    }

    public static /* synthetic */ NocDto copy$default(NocDto nocDto, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10, int i13, Object obj) {
        NocDto nocDto2 = nocDto;
        int i14 = i13;
        return nocDto.copy((i14 & 1) != 0 ? nocDto2.appl_no : str, (i14 & 2) != 0 ? nocDto2.dispatch_no : str2, (i14 & 4) != 0 ? nocDto2.issue_date : str3, (i14 & 8) != 0 ? nocDto2.ncrb_ref : str4, (i14 & 16) != 0 ? nocDto2.new_own_name : str5, (i14 & 32) != 0 ? nocDto2.nocRetention : z10, (i14 & 64) != 0 ? nocDto2.noc_dt : str6, (i14 & 128) != 0 ? nocDto2.off_cd : i10, (i14 & 256) != 0 ? nocDto2.off_to : i11, (i14 & 512) != 0 ? nocDto2.reason : i12, (i14 & 1024) != 0 ? nocDto2.regn_no : str7, (i14 & 2048) != 0 ? nocDto2.rto_to : str8, (i14 & 4096) != 0 ? nocDto2.state_cd : str9, (i14 & 8192) != 0 ? nocDto2.state_to : str10);
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

    public final int component8() {
        return this.off_cd;
    }

    public final int component9() {
        return this.off_to;
    }

    public final NocDto copy(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, int i10, int i11, int i12, String str7, String str8, String str9, String str10) {
        String str11 = str;
        l.f(str11, "appl_no");
        String str12 = str2;
        l.f(str12, "dispatch_no");
        String str13 = str3;
        l.f(str13, "issue_date");
        String str14 = str4;
        l.f(str14, "ncrb_ref");
        String str15 = str5;
        l.f(str15, "new_own_name");
        String str16 = str6;
        l.f(str16, "noc_dt");
        String str17 = str7;
        l.f(str17, "regn_no");
        String str18 = str8;
        l.f(str18, "rto_to");
        String str19 = str9;
        l.f(str19, "state_cd");
        String str20 = str10;
        l.f(str20, "state_to");
        return new NocDto(str11, str12, str13, str14, str15, z10, str16, i10, i11, i12, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NocDto)) {
            return false;
        }
        NocDto nocDto = (NocDto) obj;
        return l.a(this.appl_no, nocDto.appl_no) && l.a(this.dispatch_no, nocDto.dispatch_no) && l.a(this.issue_date, nocDto.issue_date) && l.a(this.ncrb_ref, nocDto.ncrb_ref) && l.a(this.new_own_name, nocDto.new_own_name) && this.nocRetention == nocDto.nocRetention && l.a(this.noc_dt, nocDto.noc_dt) && this.off_cd == nocDto.off_cd && this.off_to == nocDto.off_to && this.reason == nocDto.reason && l.a(this.regn_no, nocDto.regn_no) && l.a(this.rto_to, nocDto.rto_to) && l.a(this.state_cd, nocDto.state_cd) && l.a(this.state_to, nocDto.state_to);
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
        int hashCode = ((((((((this.appl_no.hashCode() * 31) + this.dispatch_no.hashCode()) * 31) + this.issue_date.hashCode()) * 31) + this.ncrb_ref.hashCode()) * 31) + this.new_own_name.hashCode()) * 31;
        boolean z10 = this.nocRetention;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.noc_dt.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + Integer.hashCode(this.off_to)) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.rto_to.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_to.hashCode();
    }

    public String toString() {
        return "NocDto(appl_no=" + this.appl_no + ", dispatch_no=" + this.dispatch_no + ", issue_date=" + this.issue_date + ", ncrb_ref=" + this.ncrb_ref + ", new_own_name=" + this.new_own_name + ", nocRetention=" + this.nocRetention + ", noc_dt=" + this.noc_dt + ", off_cd=" + this.off_cd + ", off_to=" + this.off_to + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", rto_to=" + this.rto_to + ", state_cd=" + this.state_cd + ", state_to=" + this.state_to + ')';
    }
}
