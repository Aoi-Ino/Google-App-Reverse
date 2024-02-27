package com.nic.mparivahan.FetchChallanLog.PojoChallan;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparEchallanLog {
    private final String challanAmt;
    private final String echlogChallanDate;
    private final String echlogChallanStatus;
    private final String echlogCreatedAt;
    private final long echlogCtzId;
    private final int echlogDeptCd;
    private final String echlogDocNumber;
    private final String echlogDocType;
    private final String echlogMobileNo;
    private final String echlogPaymentDate;
    private final String echlogReceiptNo;
    private final int echlogRecordId;
    private final int echlogRtoCd;
    private final String echlogStateCd;
    private final String echlogTransId;
    private final String echlogchallannumber;

    public MparEchallanLog(String str, String str2, String str3, String str4, long j10, int i10, String str5, String str6, String str7, String str8, String str9, int i11, int i12, String str10, String str11, String str12) {
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
        l.f(str, "challanAmt");
        l.f(str13, "echlogChallanDate");
        l.f(str14, "echlogChallanStatus");
        l.f(str15, "echlogCreatedAt");
        l.f(str16, "echlogDocNumber");
        l.f(str17, "echlogDocType");
        l.f(str18, "echlogMobileNo");
        l.f(str19, "echlogPaymentDate");
        l.f(str20, "echlogReceiptNo");
        l.f(str21, "echlogStateCd");
        l.f(str22, "echlogTransId");
        l.f(str23, "echlogchallannumber");
        this.challanAmt = str;
        this.echlogChallanDate = str13;
        this.echlogChallanStatus = str14;
        this.echlogCreatedAt = str15;
        this.echlogCtzId = j10;
        this.echlogDeptCd = i10;
        this.echlogDocNumber = str16;
        this.echlogDocType = str17;
        this.echlogMobileNo = str18;
        this.echlogPaymentDate = str19;
        this.echlogReceiptNo = str20;
        this.echlogRecordId = i11;
        this.echlogRtoCd = i12;
        this.echlogStateCd = str21;
        this.echlogTransId = str22;
        this.echlogchallannumber = str23;
    }

    public static /* synthetic */ MparEchallanLog copy$default(MparEchallanLog mparEchallanLog, String str, String str2, String str3, String str4, long j10, int i10, String str5, String str6, String str7, String str8, String str9, int i11, int i12, String str10, String str11, String str12, int i13, Object obj) {
        MparEchallanLog mparEchallanLog2 = mparEchallanLog;
        int i14 = i13;
        return mparEchallanLog.copy((i14 & 1) != 0 ? mparEchallanLog2.challanAmt : str, (i14 & 2) != 0 ? mparEchallanLog2.echlogChallanDate : str2, (i14 & 4) != 0 ? mparEchallanLog2.echlogChallanStatus : str3, (i14 & 8) != 0 ? mparEchallanLog2.echlogCreatedAt : str4, (i14 & 16) != 0 ? mparEchallanLog2.echlogCtzId : j10, (i14 & 32) != 0 ? mparEchallanLog2.echlogDeptCd : i10, (i14 & 64) != 0 ? mparEchallanLog2.echlogDocNumber : str5, (i14 & 128) != 0 ? mparEchallanLog2.echlogDocType : str6, (i14 & 256) != 0 ? mparEchallanLog2.echlogMobileNo : str7, (i14 & 512) != 0 ? mparEchallanLog2.echlogPaymentDate : str8, (i14 & 1024) != 0 ? mparEchallanLog2.echlogReceiptNo : str9, (i14 & 2048) != 0 ? mparEchallanLog2.echlogRecordId : i11, (i14 & 4096) != 0 ? mparEchallanLog2.echlogRtoCd : i12, (i14 & 8192) != 0 ? mparEchallanLog2.echlogStateCd : str10, (i14 & 16384) != 0 ? mparEchallanLog2.echlogTransId : str11, (i14 & 32768) != 0 ? mparEchallanLog2.echlogchallannumber : str12);
    }

    public final String component1() {
        return this.challanAmt;
    }

    public final String component10() {
        return this.echlogPaymentDate;
    }

    public final String component11() {
        return this.echlogReceiptNo;
    }

    public final int component12() {
        return this.echlogRecordId;
    }

    public final int component13() {
        return this.echlogRtoCd;
    }

    public final String component14() {
        return this.echlogStateCd;
    }

    public final String component15() {
        return this.echlogTransId;
    }

    public final String component16() {
        return this.echlogchallannumber;
    }

    public final String component2() {
        return this.echlogChallanDate;
    }

    public final String component3() {
        return this.echlogChallanStatus;
    }

    public final String component4() {
        return this.echlogCreatedAt;
    }

    public final long component5() {
        return this.echlogCtzId;
    }

    public final int component6() {
        return this.echlogDeptCd;
    }

    public final String component7() {
        return this.echlogDocNumber;
    }

    public final String component8() {
        return this.echlogDocType;
    }

    public final String component9() {
        return this.echlogMobileNo;
    }

    public final MparEchallanLog copy(String str, String str2, String str3, String str4, long j10, int i10, String str5, String str6, String str7, String str8, String str9, int i11, int i12, String str10, String str11, String str12) {
        String str13 = str;
        l.f(str13, "challanAmt");
        l.f(str2, "echlogChallanDate");
        l.f(str3, "echlogChallanStatus");
        l.f(str4, "echlogCreatedAt");
        l.f(str5, "echlogDocNumber");
        l.f(str6, "echlogDocType");
        l.f(str7, "echlogMobileNo");
        l.f(str8, "echlogPaymentDate");
        l.f(str9, "echlogReceiptNo");
        l.f(str10, "echlogStateCd");
        l.f(str11, "echlogTransId");
        l.f(str12, "echlogchallannumber");
        return new MparEchallanLog(str13, str2, str3, str4, j10, i10, str5, str6, str7, str8, str9, i11, i12, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparEchallanLog)) {
            return false;
        }
        MparEchallanLog mparEchallanLog = (MparEchallanLog) obj;
        return l.a(this.challanAmt, mparEchallanLog.challanAmt) && l.a(this.echlogChallanDate, mparEchallanLog.echlogChallanDate) && l.a(this.echlogChallanStatus, mparEchallanLog.echlogChallanStatus) && l.a(this.echlogCreatedAt, mparEchallanLog.echlogCreatedAt) && this.echlogCtzId == mparEchallanLog.echlogCtzId && this.echlogDeptCd == mparEchallanLog.echlogDeptCd && l.a(this.echlogDocNumber, mparEchallanLog.echlogDocNumber) && l.a(this.echlogDocType, mparEchallanLog.echlogDocType) && l.a(this.echlogMobileNo, mparEchallanLog.echlogMobileNo) && l.a(this.echlogPaymentDate, mparEchallanLog.echlogPaymentDate) && l.a(this.echlogReceiptNo, mparEchallanLog.echlogReceiptNo) && this.echlogRecordId == mparEchallanLog.echlogRecordId && this.echlogRtoCd == mparEchallanLog.echlogRtoCd && l.a(this.echlogStateCd, mparEchallanLog.echlogStateCd) && l.a(this.echlogTransId, mparEchallanLog.echlogTransId) && l.a(this.echlogchallannumber, mparEchallanLog.echlogchallannumber);
    }

    public final String getChallanAmt() {
        return this.challanAmt;
    }

    public final String getEchlogChallanDate() {
        return this.echlogChallanDate;
    }

    public final String getEchlogChallanStatus() {
        return this.echlogChallanStatus;
    }

    public final String getEchlogCreatedAt() {
        return this.echlogCreatedAt;
    }

    public final long getEchlogCtzId() {
        return this.echlogCtzId;
    }

    public final int getEchlogDeptCd() {
        return this.echlogDeptCd;
    }

    public final String getEchlogDocNumber() {
        return this.echlogDocNumber;
    }

    public final String getEchlogDocType() {
        return this.echlogDocType;
    }

    public final String getEchlogMobileNo() {
        return this.echlogMobileNo;
    }

    public final String getEchlogPaymentDate() {
        return this.echlogPaymentDate;
    }

    public final String getEchlogReceiptNo() {
        return this.echlogReceiptNo;
    }

    public final int getEchlogRecordId() {
        return this.echlogRecordId;
    }

    public final int getEchlogRtoCd() {
        return this.echlogRtoCd;
    }

    public final String getEchlogStateCd() {
        return this.echlogStateCd;
    }

    public final String getEchlogTransId() {
        return this.echlogTransId;
    }

    public final String getEchlogchallannumber() {
        return this.echlogchallannumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.challanAmt.hashCode() * 31) + this.echlogChallanDate.hashCode()) * 31) + this.echlogChallanStatus.hashCode()) * 31) + this.echlogCreatedAt.hashCode()) * 31) + Long.hashCode(this.echlogCtzId)) * 31) + Integer.hashCode(this.echlogDeptCd)) * 31) + this.echlogDocNumber.hashCode()) * 31) + this.echlogDocType.hashCode()) * 31) + this.echlogMobileNo.hashCode()) * 31) + this.echlogPaymentDate.hashCode()) * 31) + this.echlogReceiptNo.hashCode()) * 31) + Integer.hashCode(this.echlogRecordId)) * 31) + Integer.hashCode(this.echlogRtoCd)) * 31) + this.echlogStateCd.hashCode()) * 31) + this.echlogTransId.hashCode()) * 31) + this.echlogchallannumber.hashCode();
    }

    public String toString() {
        return "MparEchallanLog(challanAmt=" + this.challanAmt + ", echlogChallanDate=" + this.echlogChallanDate + ", echlogChallanStatus=" + this.echlogChallanStatus + ", echlogCreatedAt=" + this.echlogCreatedAt + ", echlogCtzId=" + this.echlogCtzId + ", echlogDeptCd=" + this.echlogDeptCd + ", echlogDocNumber=" + this.echlogDocNumber + ", echlogDocType=" + this.echlogDocType + ", echlogMobileNo=" + this.echlogMobileNo + ", echlogPaymentDate=" + this.echlogPaymentDate + ", echlogReceiptNo=" + this.echlogReceiptNo + ", echlogRecordId=" + this.echlogRecordId + ", echlogRtoCd=" + this.echlogRtoCd + ", echlogStateCd=" + this.echlogStateCd + ", echlogTransId=" + this.echlogTransId + ", echlogchallannumber=" + this.echlogchallannumber + ')';
    }
}
