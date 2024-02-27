package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RcSurrenderDto implements Serializable {
    private final String applNo;
    private final String approvedBy;

    /* renamed from: fc  reason: collision with root package name */
    private final String f21043fc;
    private final String fcSno;
    private final String fileRefNo;
    private final int offCd;
    private final String opDt;
    private final String permit;
    private final String permitSno;
    private final int purCd;

    /* renamed from: rc  reason: collision with root package name */
    private final String f21044rc;
    private final String rcSno;
    private final String reason;
    private final String regnNo;
    private final String stateCd;
    private final String surrDt;
    private final String taxexem;

    public RcSurrenderDto(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str10;
        String str26 = str11;
        String str27 = str12;
        String str28 = str13;
        String str29 = str14;
        String str30 = str15;
        l.f(str16, "applNo");
        l.f(str17, "approvedBy");
        l.f(str18, "fc");
        l.f(str19, "fcSno");
        l.f(str20, "fileRefNo");
        l.f(str21, "opDt");
        l.f(str22, "permit");
        l.f(str23, "permitSno");
        l.f(str24, "rc");
        l.f(str25, "rcSno");
        l.f(str26, "reason");
        l.f(str27, "regnNo");
        l.f(str28, "stateCd");
        l.f(str29, "surrDt");
        l.f(str30, "taxexem");
        this.applNo = str16;
        this.approvedBy = str17;
        this.f21043fc = str18;
        this.fcSno = str19;
        this.fileRefNo = str20;
        this.offCd = i10;
        this.opDt = str21;
        this.permit = str22;
        this.permitSno = str23;
        this.purCd = i11;
        this.f21044rc = str24;
        this.rcSno = str25;
        this.reason = str26;
        this.regnNo = str27;
        this.stateCd = str28;
        this.surrDt = str29;
        this.taxexem = str30;
    }

    public static /* synthetic */ RcSurrenderDto copy$default(RcSurrenderDto rcSurrenderDto, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i12, Object obj) {
        RcSurrenderDto rcSurrenderDto2 = rcSurrenderDto;
        int i13 = i12;
        return rcSurrenderDto.copy((i13 & 1) != 0 ? rcSurrenderDto2.applNo : str, (i13 & 2) != 0 ? rcSurrenderDto2.approvedBy : str2, (i13 & 4) != 0 ? rcSurrenderDto2.f21043fc : str3, (i13 & 8) != 0 ? rcSurrenderDto2.fcSno : str4, (i13 & 16) != 0 ? rcSurrenderDto2.fileRefNo : str5, (i13 & 32) != 0 ? rcSurrenderDto2.offCd : i10, (i13 & 64) != 0 ? rcSurrenderDto2.opDt : str6, (i13 & 128) != 0 ? rcSurrenderDto2.permit : str7, (i13 & 256) != 0 ? rcSurrenderDto2.permitSno : str8, (i13 & 512) != 0 ? rcSurrenderDto2.purCd : i11, (i13 & 1024) != 0 ? rcSurrenderDto2.f21044rc : str9, (i13 & 2048) != 0 ? rcSurrenderDto2.rcSno : str10, (i13 & 4096) != 0 ? rcSurrenderDto2.reason : str11, (i13 & 8192) != 0 ? rcSurrenderDto2.regnNo : str12, (i13 & 16384) != 0 ? rcSurrenderDto2.stateCd : str13, (i13 & 32768) != 0 ? rcSurrenderDto2.surrDt : str14, (i13 & 65536) != 0 ? rcSurrenderDto2.taxexem : str15);
    }

    public final String component1() {
        return this.applNo;
    }

    public final int component10() {
        return this.purCd;
    }

    public final String component11() {
        return this.f21044rc;
    }

    public final String component12() {
        return this.rcSno;
    }

    public final String component13() {
        return this.reason;
    }

    public final String component14() {
        return this.regnNo;
    }

    public final String component15() {
        return this.stateCd;
    }

    public final String component16() {
        return this.surrDt;
    }

    public final String component17() {
        return this.taxexem;
    }

    public final String component2() {
        return this.approvedBy;
    }

    public final String component3() {
        return this.f21043fc;
    }

    public final String component4() {
        return this.fcSno;
    }

    public final String component5() {
        return this.fileRefNo;
    }

    public final int component6() {
        return this.offCd;
    }

    public final String component7() {
        return this.opDt;
    }

    public final String component8() {
        return this.permit;
    }

    public final String component9() {
        return this.permitSno;
    }

    public final RcSurrenderDto copy(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str;
        l.f(str16, "applNo");
        l.f(str2, "approvedBy");
        l.f(str3, "fc");
        l.f(str4, "fcSno");
        l.f(str5, "fileRefNo");
        l.f(str6, "opDt");
        l.f(str7, "permit");
        l.f(str8, "permitSno");
        l.f(str9, "rc");
        l.f(str10, "rcSno");
        l.f(str11, "reason");
        l.f(str12, "regnNo");
        l.f(str13, "stateCd");
        l.f(str14, "surrDt");
        l.f(str15, "taxexem");
        return new RcSurrenderDto(str16, str2, str3, str4, str5, i10, str6, str7, str8, i11, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RcSurrenderDto)) {
            return false;
        }
        RcSurrenderDto rcSurrenderDto = (RcSurrenderDto) obj;
        return l.a(this.applNo, rcSurrenderDto.applNo) && l.a(this.approvedBy, rcSurrenderDto.approvedBy) && l.a(this.f21043fc, rcSurrenderDto.f21043fc) && l.a(this.fcSno, rcSurrenderDto.fcSno) && l.a(this.fileRefNo, rcSurrenderDto.fileRefNo) && this.offCd == rcSurrenderDto.offCd && l.a(this.opDt, rcSurrenderDto.opDt) && l.a(this.permit, rcSurrenderDto.permit) && l.a(this.permitSno, rcSurrenderDto.permitSno) && this.purCd == rcSurrenderDto.purCd && l.a(this.f21044rc, rcSurrenderDto.f21044rc) && l.a(this.rcSno, rcSurrenderDto.rcSno) && l.a(this.reason, rcSurrenderDto.reason) && l.a(this.regnNo, rcSurrenderDto.regnNo) && l.a(this.stateCd, rcSurrenderDto.stateCd) && l.a(this.surrDt, rcSurrenderDto.surrDt) && l.a(this.taxexem, rcSurrenderDto.taxexem);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final String getFc() {
        return this.f21043fc;
    }

    public final String getFcSno() {
        return this.fcSno;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getOpDt() {
        return this.opDt;
    }

    public final String getPermit() {
        return this.permit;
    }

    public final String getPermitSno() {
        return this.permitSno;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRc() {
        return this.f21044rc;
    }

    public final String getRcSno() {
        return this.rcSno;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getSurrDt() {
        return this.surrDt;
    }

    public final String getTaxexem() {
        return this.taxexem;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.approvedBy.hashCode()) * 31) + this.f21043fc.hashCode()) * 31) + this.fcSno.hashCode()) * 31) + this.fileRefNo.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + this.opDt.hashCode()) * 31) + this.permit.hashCode()) * 31) + this.permitSno.hashCode()) * 31) + Integer.hashCode(this.purCd)) * 31) + this.f21044rc.hashCode()) * 31) + this.rcSno.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.surrDt.hashCode()) * 31) + this.taxexem.hashCode();
    }

    public String toString() {
        return "RcSurrenderDto(applNo=" + this.applNo + ", approvedBy=" + this.approvedBy + ", fc=" + this.f21043fc + ", fcSno=" + this.fcSno + ", fileRefNo=" + this.fileRefNo + ", offCd=" + this.offCd + ", opDt=" + this.opDt + ", permit=" + this.permit + ", permitSno=" + this.permitSno + ", purCd=" + this.purCd + ", rc=" + this.f21044rc + ", rcSno=" + this.rcSno + ", reason=" + this.reason + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", surrDt=" + this.surrDt + ", taxexem=" + this.taxexem + ')';
    }
}
