package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PermitDetailDto {
    private final String appl_no;
    private final long issue_dt;
    private final String permitCatg;
    private final String permitType;
    private final String permitValidFrom;
    private final String permitValidUpto;
    private final String pmt_catg_code;
    private final String pmt_no;
    private final String pmt_type_code;
    private final String purcd;
    private final String rcpt_no;
    private final String regn_no;
    private final long valid_from;
    private final long valid_upto;

    public PermitDetailDto(String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j11, long j12) {
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
        l.f(str, "appl_no");
        l.f(str12, "permitCatg");
        l.f(str13, "permitType");
        l.f(str14, "permitValidFrom");
        l.f(str15, "permitValidUpto");
        l.f(str16, "pmt_catg_code");
        l.f(str17, "pmt_no");
        l.f(str18, "pmt_type_code");
        l.f(str19, "purcd");
        l.f(str20, "rcpt_no");
        l.f(str21, "regn_no");
        this.appl_no = str;
        this.issue_dt = j10;
        this.permitCatg = str12;
        this.permitType = str13;
        this.permitValidFrom = str14;
        this.permitValidUpto = str15;
        this.pmt_catg_code = str16;
        this.pmt_no = str17;
        this.pmt_type_code = str18;
        this.purcd = str19;
        this.rcpt_no = str20;
        this.regn_no = str21;
        this.valid_from = j11;
        this.valid_upto = j12;
    }

    public static /* synthetic */ PermitDetailDto copy$default(PermitDetailDto permitDetailDto, String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j11, long j12, int i10, Object obj) {
        PermitDetailDto permitDetailDto2 = permitDetailDto;
        int i11 = i10;
        return permitDetailDto.copy((i11 & 1) != 0 ? permitDetailDto2.appl_no : str, (i11 & 2) != 0 ? permitDetailDto2.issue_dt : j10, (i11 & 4) != 0 ? permitDetailDto2.permitCatg : str2, (i11 & 8) != 0 ? permitDetailDto2.permitType : str3, (i11 & 16) != 0 ? permitDetailDto2.permitValidFrom : str4, (i11 & 32) != 0 ? permitDetailDto2.permitValidUpto : str5, (i11 & 64) != 0 ? permitDetailDto2.pmt_catg_code : str6, (i11 & 128) != 0 ? permitDetailDto2.pmt_no : str7, (i11 & 256) != 0 ? permitDetailDto2.pmt_type_code : str8, (i11 & 512) != 0 ? permitDetailDto2.purcd : str9, (i11 & 1024) != 0 ? permitDetailDto2.rcpt_no : str10, (i11 & 2048) != 0 ? permitDetailDto2.regn_no : str11, (i11 & 4096) != 0 ? permitDetailDto2.valid_from : j11, (i11 & 8192) != 0 ? permitDetailDto2.valid_upto : j12);
    }

    public final String component1() {
        return this.appl_no;
    }

    public final String component10() {
        return this.purcd;
    }

    public final String component11() {
        return this.rcpt_no;
    }

    public final String component12() {
        return this.regn_no;
    }

    public final long component13() {
        return this.valid_from;
    }

    public final long component14() {
        return this.valid_upto;
    }

    public final long component2() {
        return this.issue_dt;
    }

    public final String component3() {
        return this.permitCatg;
    }

    public final String component4() {
        return this.permitType;
    }

    public final String component5() {
        return this.permitValidFrom;
    }

    public final String component6() {
        return this.permitValidUpto;
    }

    public final String component7() {
        return this.pmt_catg_code;
    }

    public final String component8() {
        return this.pmt_no;
    }

    public final String component9() {
        return this.pmt_type_code;
    }

    public final PermitDetailDto copy(String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j11, long j12) {
        String str12 = str;
        l.f(str12, "appl_no");
        l.f(str2, "permitCatg");
        l.f(str3, "permitType");
        l.f(str4, "permitValidFrom");
        l.f(str5, "permitValidUpto");
        l.f(str6, "pmt_catg_code");
        l.f(str7, "pmt_no");
        l.f(str8, "pmt_type_code");
        l.f(str9, "purcd");
        l.f(str10, "rcpt_no");
        l.f(str11, "regn_no");
        return new PermitDetailDto(str12, j10, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitDetailDto)) {
            return false;
        }
        PermitDetailDto permitDetailDto = (PermitDetailDto) obj;
        return l.a(this.appl_no, permitDetailDto.appl_no) && this.issue_dt == permitDetailDto.issue_dt && l.a(this.permitCatg, permitDetailDto.permitCatg) && l.a(this.permitType, permitDetailDto.permitType) && l.a(this.permitValidFrom, permitDetailDto.permitValidFrom) && l.a(this.permitValidUpto, permitDetailDto.permitValidUpto) && l.a(this.pmt_catg_code, permitDetailDto.pmt_catg_code) && l.a(this.pmt_no, permitDetailDto.pmt_no) && l.a(this.pmt_type_code, permitDetailDto.pmt_type_code) && l.a(this.purcd, permitDetailDto.purcd) && l.a(this.rcpt_no, permitDetailDto.rcpt_no) && l.a(this.regn_no, permitDetailDto.regn_no) && this.valid_from == permitDetailDto.valid_from && this.valid_upto == permitDetailDto.valid_upto;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final long getIssue_dt() {
        return this.issue_dt;
    }

    public final String getPermitCatg() {
        return this.permitCatg;
    }

    public final String getPermitType() {
        return this.permitType;
    }

    public final String getPermitValidFrom() {
        return this.permitValidFrom;
    }

    public final String getPermitValidUpto() {
        return this.permitValidUpto;
    }

    public final String getPmt_catg_code() {
        return this.pmt_catg_code;
    }

    public final String getPmt_no() {
        return this.pmt_no;
    }

    public final String getPmt_type_code() {
        return this.pmt_type_code;
    }

    public final String getPurcd() {
        return this.purcd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final long getValid_from() {
        return this.valid_from;
    }

    public final long getValid_upto() {
        return this.valid_upto;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.appl_no.hashCode() * 31) + Long.hashCode(this.issue_dt)) * 31) + this.permitCatg.hashCode()) * 31) + this.permitType.hashCode()) * 31) + this.permitValidFrom.hashCode()) * 31) + this.permitValidUpto.hashCode()) * 31) + this.pmt_catg_code.hashCode()) * 31) + this.pmt_no.hashCode()) * 31) + this.pmt_type_code.hashCode()) * 31) + this.purcd.hashCode()) * 31) + this.rcpt_no.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + Long.hashCode(this.valid_from)) * 31) + Long.hashCode(this.valid_upto);
    }

    public String toString() {
        return "PermitDetailDto(appl_no=" + this.appl_no + ", issue_dt=" + this.issue_dt + ", permitCatg=" + this.permitCatg + ", permitType=" + this.permitType + ", permitValidFrom=" + this.permitValidFrom + ", permitValidUpto=" + this.permitValidUpto + ", pmt_catg_code=" + this.pmt_catg_code + ", pmt_no=" + this.pmt_no + ", pmt_type_code=" + this.pmt_type_code + ", purcd=" + this.purcd + ", rcpt_no=" + this.rcpt_no + ", regn_no=" + this.regn_no + ", valid_from=" + this.valid_from + ", valid_upto=" + this.valid_upto + ')';
    }
}
