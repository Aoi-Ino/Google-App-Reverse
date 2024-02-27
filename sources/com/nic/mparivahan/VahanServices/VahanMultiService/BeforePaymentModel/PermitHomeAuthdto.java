package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class PermitHomeAuthdto implements Serializable {
    private final String allotmentOffice;
    private final String applNo;
    private final String authrizationUpto;
    private final String entryStatus;
    private final int flowSrno;
    private final String ipAddress;
    private final int officeCode;
    private final String previousAuthrizationFrom;
    private final String previousAuthrizationNo;
    private final String previousAuthrizationUpto;
    private final String previousIssueDate;
    private final String previousPermitNo;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public PermitHomeAuthdto(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, String str12) {
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
        this.allotmentOffice = str;
        this.applNo = str13;
        this.authrizationUpto = str14;
        this.entryStatus = str15;
        this.flowSrno = i10;
        this.ipAddress = str16;
        this.officeCode = i11;
        this.previousAuthrizationFrom = str17;
        this.previousAuthrizationNo = str18;
        this.previousAuthrizationUpto = str19;
        this.previousIssueDate = str20;
        this.previousPermitNo = str21;
        this.purposeCode = i12;
        this.regnNo = str22;
        this.stateCode = str23;
    }

    public static /* synthetic */ PermitHomeAuthdto copy$default(PermitHomeAuthdto permitHomeAuthdto, String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, String str12, int i13, Object obj) {
        PermitHomeAuthdto permitHomeAuthdto2 = permitHomeAuthdto;
        int i14 = i13;
        return permitHomeAuthdto.copy((i14 & 1) != 0 ? permitHomeAuthdto2.allotmentOffice : str, (i14 & 2) != 0 ? permitHomeAuthdto2.applNo : str2, (i14 & 4) != 0 ? permitHomeAuthdto2.authrizationUpto : str3, (i14 & 8) != 0 ? permitHomeAuthdto2.entryStatus : str4, (i14 & 16) != 0 ? permitHomeAuthdto2.flowSrno : i10, (i14 & 32) != 0 ? permitHomeAuthdto2.ipAddress : str5, (i14 & 64) != 0 ? permitHomeAuthdto2.officeCode : i11, (i14 & 128) != 0 ? permitHomeAuthdto2.previousAuthrizationFrom : str6, (i14 & 256) != 0 ? permitHomeAuthdto2.previousAuthrizationNo : str7, (i14 & 512) != 0 ? permitHomeAuthdto2.previousAuthrizationUpto : str8, (i14 & 1024) != 0 ? permitHomeAuthdto2.previousIssueDate : str9, (i14 & 2048) != 0 ? permitHomeAuthdto2.previousPermitNo : str10, (i14 & 4096) != 0 ? permitHomeAuthdto2.purposeCode : i12, (i14 & 8192) != 0 ? permitHomeAuthdto2.regnNo : str11, (i14 & 16384) != 0 ? permitHomeAuthdto2.stateCode : str12);
    }

    public final String component1() {
        return this.allotmentOffice;
    }

    public final String component10() {
        return this.previousAuthrizationUpto;
    }

    public final String component11() {
        return this.previousIssueDate;
    }

    public final String component12() {
        return this.previousPermitNo;
    }

    public final int component13() {
        return this.purposeCode;
    }

    public final String component14() {
        return this.regnNo;
    }

    public final String component15() {
        return this.stateCode;
    }

    public final String component2() {
        return this.applNo;
    }

    public final String component3() {
        return this.authrizationUpto;
    }

    public final String component4() {
        return this.entryStatus;
    }

    public final int component5() {
        return this.flowSrno;
    }

    public final String component6() {
        return this.ipAddress;
    }

    public final int component7() {
        return this.officeCode;
    }

    public final String component8() {
        return this.previousAuthrizationFrom;
    }

    public final String component9() {
        return this.previousAuthrizationNo;
    }

    public final PermitHomeAuthdto copy(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, int i12, String str11, String str12) {
        String str13 = str;
        l.f(str13, "allotmentOffice");
        String str14 = str2;
        l.f(str14, "applNo");
        String str15 = str3;
        l.f(str15, "authrizationUpto");
        String str16 = str4;
        l.f(str16, "entryStatus");
        String str17 = str5;
        l.f(str17, "ipAddress");
        String str18 = str6;
        l.f(str18, "previousAuthrizationFrom");
        String str19 = str7;
        l.f(str19, "previousAuthrizationNo");
        String str20 = str8;
        l.f(str20, "previousAuthrizationUpto");
        String str21 = str9;
        l.f(str21, "previousIssueDate");
        String str22 = str10;
        l.f(str22, "previousPermitNo");
        String str23 = str11;
        l.f(str23, "regnNo");
        l.f(str12, "stateCode");
        return new PermitHomeAuthdto(str13, str14, str15, str16, i10, str17, i11, str18, str19, str20, str21, str22, i12, str23, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermitHomeAuthdto)) {
            return false;
        }
        PermitHomeAuthdto permitHomeAuthdto = (PermitHomeAuthdto) obj;
        return l.a(this.allotmentOffice, permitHomeAuthdto.allotmentOffice) && l.a(this.applNo, permitHomeAuthdto.applNo) && l.a(this.authrizationUpto, permitHomeAuthdto.authrizationUpto) && l.a(this.entryStatus, permitHomeAuthdto.entryStatus) && this.flowSrno == permitHomeAuthdto.flowSrno && l.a(this.ipAddress, permitHomeAuthdto.ipAddress) && this.officeCode == permitHomeAuthdto.officeCode && l.a(this.previousAuthrizationFrom, permitHomeAuthdto.previousAuthrizationFrom) && l.a(this.previousAuthrizationNo, permitHomeAuthdto.previousAuthrizationNo) && l.a(this.previousAuthrizationUpto, permitHomeAuthdto.previousAuthrizationUpto) && l.a(this.previousIssueDate, permitHomeAuthdto.previousIssueDate) && l.a(this.previousPermitNo, permitHomeAuthdto.previousPermitNo) && this.purposeCode == permitHomeAuthdto.purposeCode && l.a(this.regnNo, permitHomeAuthdto.regnNo) && l.a(this.stateCode, permitHomeAuthdto.stateCode);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthrizationUpto() {
        return this.authrizationUpto;
    }

    public final String getEntryStatus() {
        return this.entryStatus;
    }

    public final int getFlowSrno() {
        return this.flowSrno;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getPreviousAuthrizationFrom() {
        return this.previousAuthrizationFrom;
    }

    public final String getPreviousAuthrizationNo() {
        return this.previousAuthrizationNo;
    }

    public final String getPreviousAuthrizationUpto() {
        return this.previousAuthrizationUpto;
    }

    public final String getPreviousIssueDate() {
        return this.previousIssueDate;
    }

    public final String getPreviousPermitNo() {
        return this.previousPermitNo;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.allotmentOffice.hashCode() * 31) + this.applNo.hashCode()) * 31) + this.authrizationUpto.hashCode()) * 31) + this.entryStatus.hashCode()) * 31) + Integer.hashCode(this.flowSrno)) * 31) + this.ipAddress.hashCode()) * 31) + Integer.hashCode(this.officeCode)) * 31) + this.previousAuthrizationFrom.hashCode()) * 31) + this.previousAuthrizationNo.hashCode()) * 31) + this.previousAuthrizationUpto.hashCode()) * 31) + this.previousIssueDate.hashCode()) * 31) + this.previousPermitNo.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "PermitHomeAuthdto(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authrizationUpto=" + this.authrizationUpto + ", entryStatus=" + this.entryStatus + ", flowSrno=" + this.flowSrno + ", ipAddress=" + this.ipAddress + ", officeCode=" + this.officeCode + ", previousAuthrizationFrom=" + this.previousAuthrizationFrom + ", previousAuthrizationNo=" + this.previousAuthrizationNo + ", previousAuthrizationUpto=" + this.previousAuthrizationUpto + ", previousIssueDate=" + this.previousIssueDate + ", previousPermitNo=" + this.previousPermitNo + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
