package com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAPermitModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final String allotmentOffice;
    private final String authorizationUpto;
    private final String perviousAuthNo;
    private final String previousAuthFrom;
    private final String previousAuthUpto;
    private final String previousIssueDate;
    private final String previousPermitNo;
    private final int purposeCode;
    private final String regnNo;

    public Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8) {
        l.f(str, "allotmentOffice");
        l.f(str2, "authorizationUpto");
        l.f(str3, "perviousAuthNo");
        l.f(str4, "previousAuthFrom");
        l.f(str5, "previousAuthUpto");
        l.f(str6, "previousIssueDate");
        l.f(str7, "previousPermitNo");
        l.f(str8, "regnNo");
        this.allotmentOffice = str;
        this.authorizationUpto = str2;
        this.perviousAuthNo = str3;
        this.previousAuthFrom = str4;
        this.previousAuthUpto = str5;
        this.previousIssueDate = str6;
        this.previousPermitNo = str7;
        this.purposeCode = i10;
        this.regnNo = str8;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8, int i11, Object obj) {
        Data data2 = data;
        int i12 = i11;
        return data.copy((i12 & 1) != 0 ? data2.allotmentOffice : str, (i12 & 2) != 0 ? data2.authorizationUpto : str2, (i12 & 4) != 0 ? data2.perviousAuthNo : str3, (i12 & 8) != 0 ? data2.previousAuthFrom : str4, (i12 & 16) != 0 ? data2.previousAuthUpto : str5, (i12 & 32) != 0 ? data2.previousIssueDate : str6, (i12 & 64) != 0 ? data2.previousPermitNo : str7, (i12 & 128) != 0 ? data2.purposeCode : i10, (i12 & 256) != 0 ? data2.regnNo : str8);
    }

    public final String component1() {
        return this.allotmentOffice;
    }

    public final String component2() {
        return this.authorizationUpto;
    }

    public final String component3() {
        return this.perviousAuthNo;
    }

    public final String component4() {
        return this.previousAuthFrom;
    }

    public final String component5() {
        return this.previousAuthUpto;
    }

    public final String component6() {
        return this.previousIssueDate;
    }

    public final String component7() {
        return this.previousPermitNo;
    }

    public final int component8() {
        return this.purposeCode;
    }

    public final String component9() {
        return this.regnNo;
    }

    public final Data copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, String str8) {
        l.f(str, "allotmentOffice");
        l.f(str2, "authorizationUpto");
        l.f(str3, "perviousAuthNo");
        l.f(str4, "previousAuthFrom");
        String str9 = str5;
        l.f(str9, "previousAuthUpto");
        String str10 = str6;
        l.f(str10, "previousIssueDate");
        String str11 = str7;
        l.f(str11, "previousPermitNo");
        String str12 = str8;
        l.f(str12, "regnNo");
        return new Data(str, str2, str3, str4, str9, str10, str11, i10, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.allotmentOffice, data.allotmentOffice) && l.a(this.authorizationUpto, data.authorizationUpto) && l.a(this.perviousAuthNo, data.perviousAuthNo) && l.a(this.previousAuthFrom, data.previousAuthFrom) && l.a(this.previousAuthUpto, data.previousAuthUpto) && l.a(this.previousIssueDate, data.previousIssueDate) && l.a(this.previousPermitNo, data.previousPermitNo) && this.purposeCode == data.purposeCode && l.a(this.regnNo, data.regnNo);
    }

    public final String getAllotmentOffice() {
        return this.allotmentOffice;
    }

    public final String getAuthorizationUpto() {
        return this.authorizationUpto;
    }

    public final String getPerviousAuthNo() {
        return this.perviousAuthNo;
    }

    public final String getPreviousAuthFrom() {
        return this.previousAuthFrom;
    }

    public final String getPreviousAuthUpto() {
        return this.previousAuthUpto;
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

    public int hashCode() {
        return (((((((((((((((this.allotmentOffice.hashCode() * 31) + this.authorizationUpto.hashCode()) * 31) + this.perviousAuthNo.hashCode()) * 31) + this.previousAuthFrom.hashCode()) * 31) + this.previousAuthUpto.hashCode()) * 31) + this.previousIssueDate.hashCode()) * 31) + this.previousPermitNo.hashCode()) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode();
    }

    public String toString() {
        return "Data(allotmentOffice=" + this.allotmentOffice + ", authorizationUpto=" + this.authorizationUpto + ", perviousAuthNo=" + this.perviousAuthNo + ", previousAuthFrom=" + this.previousAuthFrom + ", previousAuthUpto=" + this.previousAuthUpto + ", previousIssueDate=" + this.previousIssueDate + ", previousPermitNo=" + this.previousPermitNo + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ')';
    }
}
