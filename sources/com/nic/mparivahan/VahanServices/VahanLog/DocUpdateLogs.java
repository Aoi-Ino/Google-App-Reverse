package com.nic.mparivahan.VahanServices.VahanLog;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DocUpdateLogs {
    private final String setVahlogDocUplDate;
    private final String setVahlogPhotoUplDate;
    private final String vahlogApplNo;
    private final double vahlogFeeAmt;
    private final String vahlogFeeDate;
    private final String vahlogRcNumber;
    private final String vahlogReptDate;
    private final String vahlogReptNo;

    public DocUpdateLogs(String str, String str2, String str3, double d10, String str4, String str5, String str6, String str7) {
        l.f(str, "vahlogFeeDate");
        l.f(str2, "vahlogReptDate");
        l.f(str3, "vahlogReptNo");
        l.f(str4, "vahlogApplNo");
        l.f(str5, "vahlogRcNumber");
        l.f(str6, "setVahlogPhotoUplDate");
        l.f(str7, "setVahlogDocUplDate");
        this.vahlogFeeDate = str;
        this.vahlogReptDate = str2;
        this.vahlogReptNo = str3;
        this.vahlogFeeAmt = d10;
        this.vahlogApplNo = str4;
        this.vahlogRcNumber = str5;
        this.setVahlogPhotoUplDate = str6;
        this.setVahlogDocUplDate = str7;
    }

    public static /* synthetic */ DocUpdateLogs copy$default(DocUpdateLogs docUpdateLogs, String str, String str2, String str3, double d10, String str4, String str5, String str6, String str7, int i10, Object obj) {
        DocUpdateLogs docUpdateLogs2 = docUpdateLogs;
        int i11 = i10;
        return docUpdateLogs.copy((i11 & 1) != 0 ? docUpdateLogs2.vahlogFeeDate : str, (i11 & 2) != 0 ? docUpdateLogs2.vahlogReptDate : str2, (i11 & 4) != 0 ? docUpdateLogs2.vahlogReptNo : str3, (i11 & 8) != 0 ? docUpdateLogs2.vahlogFeeAmt : d10, (i11 & 16) != 0 ? docUpdateLogs2.vahlogApplNo : str4, (i11 & 32) != 0 ? docUpdateLogs2.vahlogRcNumber : str5, (i11 & 64) != 0 ? docUpdateLogs2.setVahlogPhotoUplDate : str6, (i11 & 128) != 0 ? docUpdateLogs2.setVahlogDocUplDate : str7);
    }

    public final String component1() {
        return this.vahlogFeeDate;
    }

    public final String component2() {
        return this.vahlogReptDate;
    }

    public final String component3() {
        return this.vahlogReptNo;
    }

    public final double component4() {
        return this.vahlogFeeAmt;
    }

    public final String component5() {
        return this.vahlogApplNo;
    }

    public final String component6() {
        return this.vahlogRcNumber;
    }

    public final String component7() {
        return this.setVahlogPhotoUplDate;
    }

    public final String component8() {
        return this.setVahlogDocUplDate;
    }

    public final DocUpdateLogs copy(String str, String str2, String str3, double d10, String str4, String str5, String str6, String str7) {
        l.f(str, "vahlogFeeDate");
        l.f(str2, "vahlogReptDate");
        l.f(str3, "vahlogReptNo");
        String str8 = str4;
        l.f(str8, "vahlogApplNo");
        String str9 = str5;
        l.f(str9, "vahlogRcNumber");
        String str10 = str6;
        l.f(str10, "setVahlogPhotoUplDate");
        String str11 = str7;
        l.f(str11, "setVahlogDocUplDate");
        return new DocUpdateLogs(str, str2, str3, d10, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocUpdateLogs)) {
            return false;
        }
        DocUpdateLogs docUpdateLogs = (DocUpdateLogs) obj;
        return l.a(this.vahlogFeeDate, docUpdateLogs.vahlogFeeDate) && l.a(this.vahlogReptDate, docUpdateLogs.vahlogReptDate) && l.a(this.vahlogReptNo, docUpdateLogs.vahlogReptNo) && Double.compare(this.vahlogFeeAmt, docUpdateLogs.vahlogFeeAmt) == 0 && l.a(this.vahlogApplNo, docUpdateLogs.vahlogApplNo) && l.a(this.vahlogRcNumber, docUpdateLogs.vahlogRcNumber) && l.a(this.setVahlogPhotoUplDate, docUpdateLogs.setVahlogPhotoUplDate) && l.a(this.setVahlogDocUplDate, docUpdateLogs.setVahlogDocUplDate);
    }

    public final String getSetVahlogDocUplDate() {
        return this.setVahlogDocUplDate;
    }

    public final String getSetVahlogPhotoUplDate() {
        return this.setVahlogPhotoUplDate;
    }

    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    public final double getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    public int hashCode() {
        return (((((((((((((this.vahlogFeeDate.hashCode() * 31) + this.vahlogReptDate.hashCode()) * 31) + this.vahlogReptNo.hashCode()) * 31) + Double.hashCode(this.vahlogFeeAmt)) * 31) + this.vahlogApplNo.hashCode()) * 31) + this.vahlogRcNumber.hashCode()) * 31) + this.setVahlogPhotoUplDate.hashCode()) * 31) + this.setVahlogDocUplDate.hashCode();
    }

    public String toString() {
        return "DocUpdateLogs(vahlogFeeDate=" + this.vahlogFeeDate + ", vahlogReptDate=" + this.vahlogReptDate + ", vahlogReptNo=" + this.vahlogReptNo + ", vahlogFeeAmt=" + this.vahlogFeeAmt + ", vahlogApplNo=" + this.vahlogApplNo + ", vahlogRcNumber=" + this.vahlogRcNumber + ", setVahlogPhotoUplDate=" + this.setVahlogPhotoUplDate + ", setVahlogDocUplDate=" + this.setVahlogDocUplDate + ')';
    }
}
