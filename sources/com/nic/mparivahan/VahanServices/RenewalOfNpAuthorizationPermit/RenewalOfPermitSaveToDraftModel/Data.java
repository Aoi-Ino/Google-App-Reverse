package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfPermitSaveToDraftModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Data implements Serializable {
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
    private final Integer purposeCode;
    private final String regnNo;
    private final String stateCode;

    public Data(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
        this.allotmentOffice = str;
        this.applNo = str2;
        this.authrizationUpto = str3;
        this.entryStatus = str4;
        this.flowSrno = i10;
        this.ipAddress = str5;
        this.officeCode = i11;
        this.previousAuthrizationFrom = str6;
        this.previousAuthrizationNo = str7;
        this.previousAuthrizationUpto = str8;
        this.previousIssueDate = str9;
        this.previousPermitNo = str10;
        this.purposeCode = num;
        this.regnNo = str11;
        this.stateCode = str12;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, int i12, Object obj) {
        Data data2 = data;
        int i13 = i12;
        return data.copy((i13 & 1) != 0 ? data2.allotmentOffice : str, (i13 & 2) != 0 ? data2.applNo : str2, (i13 & 4) != 0 ? data2.authrizationUpto : str3, (i13 & 8) != 0 ? data2.entryStatus : str4, (i13 & 16) != 0 ? data2.flowSrno : i10, (i13 & 32) != 0 ? data2.ipAddress : str5, (i13 & 64) != 0 ? data2.officeCode : i11, (i13 & 128) != 0 ? data2.previousAuthrizationFrom : str6, (i13 & 256) != 0 ? data2.previousAuthrizationNo : str7, (i13 & 512) != 0 ? data2.previousAuthrizationUpto : str8, (i13 & 1024) != 0 ? data2.previousIssueDate : str9, (i13 & 2048) != 0 ? data2.previousPermitNo : str10, (i13 & 4096) != 0 ? data2.purposeCode : num, (i13 & 8192) != 0 ? data2.regnNo : str11, (i13 & 16384) != 0 ? data2.stateCode : str12);
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

    public final Integer component13() {
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

    public final Data copy(String str, String str2, String str3, String str4, int i10, String str5, int i11, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12) {
        return new Data(str, str2, str3, str4, i10, str5, i11, str6, str7, str8, str9, str10, num, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.applNo, data.applNo) && l.a(this.authrizationUpto, data.authrizationUpto) && l.a(this.entryStatus, data.entryStatus) && this.flowSrno == data.flowSrno && l.a(this.ipAddress, data.ipAddress) && this.officeCode == data.officeCode && l.a(this.previousAuthrizationFrom, data.previousAuthrizationFrom) && l.a(this.previousAuthrizationNo, data.previousAuthrizationNo) && l.a(this.previousAuthrizationUpto, data.previousAuthrizationUpto) && l.a(this.previousIssueDate, data.previousIssueDate) && l.a(this.previousPermitNo, data.previousPermitNo) && l.a(this.purposeCode, data.purposeCode) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode);
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

    public final Integer getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.allotmentOffice;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authrizationUpto;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entryStatus;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.flowSrno)) * 31;
        String str5 = this.ipAddress;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str6 = this.previousAuthrizationFrom;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.previousAuthrizationNo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.previousAuthrizationUpto;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.previousIssueDate;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.previousPermitNo;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.purposeCode;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.regnNo;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.stateCode;
        if (str12 != null) {
            i10 = str12.hashCode();
        }
        return hashCode12 + i10;
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", applNo=" + this.applNo + ", authrizationUpto=" + this.authrizationUpto + ", entryStatus=" + this.entryStatus + ", flowSrno=" + this.flowSrno + ", ipAddress=" + this.ipAddress + ", officeCode=" + this.officeCode + ", previousAuthrizationFrom=" + this.previousAuthrizationFrom + ", previousAuthrizationNo=" + this.previousAuthrizationNo + ", previousAuthrizationUpto=" + this.previousAuthrizationUpto + ", previousIssueDate=" + this.previousIssueDate + ", previousPermitNo=" + this.previousPermitNo + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
