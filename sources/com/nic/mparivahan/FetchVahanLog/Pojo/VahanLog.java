package com.nic.mparivahan.FetchVahanLog.Pojo;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class VahanLog {
    private final int vahlogAadhar4;
    private final String vahlogApplDate;
    private final String vahlogApplNo;
    private final String vahlogChassis5;
    private final int vahlogCtzId;
    private final String vahlogDocUplDate;
    private final String vahlogEngine5;
    private final String vahlogFeeAmt;
    private final String vahlogFeeDate;
    private final String vahlogMobileNo;
    private final String vahlogPhotoUplDate;
    private final int vahlogPurCd;
    private final String vahlogRcNumber;
    private final int vahlogRecordId;
    private final String vahlogReptDate;
    private final String vahlogReptNo;
    private final String vahlogRtoCd;
    private final String vahlogStateCd;
    private final String vahlogVhClass;
    private final String vahlog_eKYC;
    private final String vahlog_eSign;

    public VahanLog(int i10, String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str5;
        String str23 = str6;
        String str24 = str7;
        String str25 = str8;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        l.f(str18, "vahlogApplDate");
        l.f(str19, "vahlogApplNo");
        l.f(str20, "vahlogChassis5");
        l.f(str21, "vahlogEngine5");
        l.f(str22, "vahlogDocUplDate");
        l.f(str23, "vahlogFeeDate");
        l.f(str24, "vahlogMobileNo");
        l.f(str25, "vahlogRcNumber");
        l.f(str26, "vahlogReptNo");
        l.f(str27, "vahlogRtoCd");
        l.f(str28, "vahlogStateCd");
        l.f(str29, "vahlogVhClass");
        l.f(str30, "vahlog_eKYC");
        l.f(str31, "vahlog_eSign");
        l.f(str16, "vahlogFeeAmt");
        l.f(str17, "vahlogPhotoUplDate");
        this.vahlogAadhar4 = i10;
        this.vahlogApplDate = str18;
        this.vahlogApplNo = str19;
        this.vahlogChassis5 = str20;
        this.vahlogCtzId = i11;
        this.vahlogEngine5 = str21;
        this.vahlogDocUplDate = str22;
        this.vahlogFeeDate = str23;
        this.vahlogMobileNo = str24;
        this.vahlogPurCd = i12;
        this.vahlogRcNumber = str25;
        this.vahlogRecordId = i13;
        this.vahlogReptDate = str9;
        this.vahlogReptNo = str26;
        this.vahlogRtoCd = str27;
        this.vahlogStateCd = str28;
        this.vahlogVhClass = str29;
        this.vahlog_eKYC = str30;
        this.vahlog_eSign = str31;
        this.vahlogFeeAmt = str16;
        this.vahlogPhotoUplDate = str17;
    }

    public static /* synthetic */ VahanLog copy$default(VahanLog vahanLog, int i10, String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i14, Object obj) {
        VahanLog vahanLog2 = vahanLog;
        int i15 = i14;
        return vahanLog.copy((i15 & 1) != 0 ? vahanLog2.vahlogAadhar4 : i10, (i15 & 2) != 0 ? vahanLog2.vahlogApplDate : str, (i15 & 4) != 0 ? vahanLog2.vahlogApplNo : str2, (i15 & 8) != 0 ? vahanLog2.vahlogChassis5 : str3, (i15 & 16) != 0 ? vahanLog2.vahlogCtzId : i11, (i15 & 32) != 0 ? vahanLog2.vahlogEngine5 : str4, (i15 & 64) != 0 ? vahanLog2.vahlogDocUplDate : str5, (i15 & 128) != 0 ? vahanLog2.vahlogFeeDate : str6, (i15 & 256) != 0 ? vahanLog2.vahlogMobileNo : str7, (i15 & 512) != 0 ? vahanLog2.vahlogPurCd : i12, (i15 & 1024) != 0 ? vahanLog2.vahlogRcNumber : str8, (i15 & 2048) != 0 ? vahanLog2.vahlogRecordId : i13, (i15 & 4096) != 0 ? vahanLog2.vahlogReptDate : str9, (i15 & 8192) != 0 ? vahanLog2.vahlogReptNo : str10, (i15 & 16384) != 0 ? vahanLog2.vahlogRtoCd : str11, (i15 & 32768) != 0 ? vahanLog2.vahlogStateCd : str12, (i15 & 65536) != 0 ? vahanLog2.vahlogVhClass : str13, (i15 & 131072) != 0 ? vahanLog2.vahlog_eKYC : str14, (i15 & 262144) != 0 ? vahanLog2.vahlog_eSign : str15, (i15 & 524288) != 0 ? vahanLog2.vahlogFeeAmt : str16, (i15 & 1048576) != 0 ? vahanLog2.vahlogPhotoUplDate : str17);
    }

    public final int component1() {
        return this.vahlogAadhar4;
    }

    public final int component10() {
        return this.vahlogPurCd;
    }

    public final String component11() {
        return this.vahlogRcNumber;
    }

    public final int component12() {
        return this.vahlogRecordId;
    }

    public final String component13() {
        return this.vahlogReptDate;
    }

    public final String component14() {
        return this.vahlogReptNo;
    }

    public final String component15() {
        return this.vahlogRtoCd;
    }

    public final String component16() {
        return this.vahlogStateCd;
    }

    public final String component17() {
        return this.vahlogVhClass;
    }

    public final String component18() {
        return this.vahlog_eKYC;
    }

    public final String component19() {
        return this.vahlog_eSign;
    }

    public final String component2() {
        return this.vahlogApplDate;
    }

    public final String component20() {
        return this.vahlogFeeAmt;
    }

    public final String component21() {
        return this.vahlogPhotoUplDate;
    }

    public final String component3() {
        return this.vahlogApplNo;
    }

    public final String component4() {
        return this.vahlogChassis5;
    }

    public final int component5() {
        return this.vahlogCtzId;
    }

    public final String component6() {
        return this.vahlogEngine5;
    }

    public final String component7() {
        return this.vahlogDocUplDate;
    }

    public final String component8() {
        return this.vahlogFeeDate;
    }

    public final String component9() {
        return this.vahlogMobileNo;
    }

    public final VahanLog copy(int i10, String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        int i14 = i10;
        l.f(str, "vahlogApplDate");
        l.f(str2, "vahlogApplNo");
        l.f(str3, "vahlogChassis5");
        l.f(str4, "vahlogEngine5");
        l.f(str5, "vahlogDocUplDate");
        l.f(str6, "vahlogFeeDate");
        l.f(str7, "vahlogMobileNo");
        l.f(str8, "vahlogRcNumber");
        l.f(str10, "vahlogReptNo");
        l.f(str11, "vahlogRtoCd");
        l.f(str12, "vahlogStateCd");
        l.f(str13, "vahlogVhClass");
        l.f(str14, "vahlog_eKYC");
        l.f(str15, "vahlog_eSign");
        l.f(str16, "vahlogFeeAmt");
        l.f(str17, "vahlogPhotoUplDate");
        return new VahanLog(i10, str, str2, str3, i11, str4, str5, str6, str7, i12, str8, i13, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VahanLog)) {
            return false;
        }
        VahanLog vahanLog = (VahanLog) obj;
        return this.vahlogAadhar4 == vahanLog.vahlogAadhar4 && l.a(this.vahlogApplDate, vahanLog.vahlogApplDate) && l.a(this.vahlogApplNo, vahanLog.vahlogApplNo) && l.a(this.vahlogChassis5, vahanLog.vahlogChassis5) && this.vahlogCtzId == vahanLog.vahlogCtzId && l.a(this.vahlogEngine5, vahanLog.vahlogEngine5) && l.a(this.vahlogDocUplDate, vahanLog.vahlogDocUplDate) && l.a(this.vahlogFeeDate, vahanLog.vahlogFeeDate) && l.a(this.vahlogMobileNo, vahanLog.vahlogMobileNo) && this.vahlogPurCd == vahanLog.vahlogPurCd && l.a(this.vahlogRcNumber, vahanLog.vahlogRcNumber) && this.vahlogRecordId == vahanLog.vahlogRecordId && l.a(this.vahlogReptDate, vahanLog.vahlogReptDate) && l.a(this.vahlogReptNo, vahanLog.vahlogReptNo) && l.a(this.vahlogRtoCd, vahanLog.vahlogRtoCd) && l.a(this.vahlogStateCd, vahanLog.vahlogStateCd) && l.a(this.vahlogVhClass, vahanLog.vahlogVhClass) && l.a(this.vahlog_eKYC, vahanLog.vahlog_eKYC) && l.a(this.vahlog_eSign, vahanLog.vahlog_eSign) && l.a(this.vahlogFeeAmt, vahanLog.vahlogFeeAmt) && l.a(this.vahlogPhotoUplDate, vahanLog.vahlogPhotoUplDate);
    }

    public final int getVahlogAadhar4() {
        return this.vahlogAadhar4;
    }

    public final String getVahlogApplDate() {
        return this.vahlogApplDate;
    }

    public final String getVahlogApplNo() {
        return this.vahlogApplNo;
    }

    public final String getVahlogChassis5() {
        return this.vahlogChassis5;
    }

    public final int getVahlogCtzId() {
        return this.vahlogCtzId;
    }

    public final String getVahlogDocUplDate() {
        return this.vahlogDocUplDate;
    }

    public final String getVahlogEngine5() {
        return this.vahlogEngine5;
    }

    public final String getVahlogFeeAmt() {
        return this.vahlogFeeAmt;
    }

    public final String getVahlogFeeDate() {
        return this.vahlogFeeDate;
    }

    public final String getVahlogMobileNo() {
        return this.vahlogMobileNo;
    }

    public final String getVahlogPhotoUplDate() {
        return this.vahlogPhotoUplDate;
    }

    public final int getVahlogPurCd() {
        return this.vahlogPurCd;
    }

    public final String getVahlogRcNumber() {
        return this.vahlogRcNumber;
    }

    public final int getVahlogRecordId() {
        return this.vahlogRecordId;
    }

    public final String getVahlogReptDate() {
        return this.vahlogReptDate;
    }

    public final String getVahlogReptNo() {
        return this.vahlogReptNo;
    }

    public final String getVahlogRtoCd() {
        return this.vahlogRtoCd;
    }

    public final String getVahlogStateCd() {
        return this.vahlogStateCd;
    }

    public final String getVahlogVhClass() {
        return this.vahlogVhClass;
    }

    public final String getVahlog_eKYC() {
        return this.vahlog_eKYC;
    }

    public final String getVahlog_eSign() {
        return this.vahlog_eSign;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Integer.hashCode(this.vahlogAadhar4) * 31) + this.vahlogApplDate.hashCode()) * 31) + this.vahlogApplNo.hashCode()) * 31) + this.vahlogChassis5.hashCode()) * 31) + Integer.hashCode(this.vahlogCtzId)) * 31) + this.vahlogEngine5.hashCode()) * 31) + this.vahlogDocUplDate.hashCode()) * 31) + this.vahlogFeeDate.hashCode()) * 31) + this.vahlogMobileNo.hashCode()) * 31) + Integer.hashCode(this.vahlogPurCd)) * 31) + this.vahlogRcNumber.hashCode()) * 31) + Integer.hashCode(this.vahlogRecordId)) * 31;
        String str = this.vahlogReptDate;
        return ((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.vahlogReptNo.hashCode()) * 31) + this.vahlogRtoCd.hashCode()) * 31) + this.vahlogStateCd.hashCode()) * 31) + this.vahlogVhClass.hashCode()) * 31) + this.vahlog_eKYC.hashCode()) * 31) + this.vahlog_eSign.hashCode()) * 31) + this.vahlogFeeAmt.hashCode()) * 31) + this.vahlogPhotoUplDate.hashCode();
    }

    public String toString() {
        return "VahanLog(vahlogAadhar4=" + this.vahlogAadhar4 + ", vahlogApplDate=" + this.vahlogApplDate + ", vahlogApplNo=" + this.vahlogApplNo + ", vahlogChassis5=" + this.vahlogChassis5 + ", vahlogCtzId=" + this.vahlogCtzId + ", vahlogEngine5=" + this.vahlogEngine5 + ", vahlogDocUplDate=" + this.vahlogDocUplDate + ", vahlogFeeDate=" + this.vahlogFeeDate + ", vahlogMobileNo=" + this.vahlogMobileNo + ", vahlogPurCd=" + this.vahlogPurCd + ", vahlogRcNumber=" + this.vahlogRcNumber + ", vahlogRecordId=" + this.vahlogRecordId + ", vahlogReptDate=" + this.vahlogReptDate + ", vahlogReptNo=" + this.vahlogReptNo + ", vahlogRtoCd=" + this.vahlogRtoCd + ", vahlogStateCd=" + this.vahlogStateCd + ", vahlogVhClass=" + this.vahlogVhClass + ", vahlog_eKYC=" + this.vahlog_eKYC + ", vahlog_eSign=" + this.vahlog_eSign + ", vahlogFeeAmt=" + this.vahlogFeeAmt + ", vahlogPhotoUplDate=" + this.vahlogPhotoUplDate + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VahanLog(int i10, String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, int i12, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i14, g gVar) {
        this(i10, str, str2, str3, i11, str4, str5, str6, str7, i12, str8, i13, (i14 & 4096) != 0 ? "" : str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }
}
