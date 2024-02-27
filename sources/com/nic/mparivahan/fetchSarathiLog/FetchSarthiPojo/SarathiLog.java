package com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SarathiLog {
    private final Object sarlogAadhar4;
    private final String sarlogApplCat;
    private final String sarlogApplDate;
    private final long sarlogApplNo;
    private final int sarlogCtzId;
    private final String sarlogDlDob;
    private final String sarlogDlNumber;
    private final Object sarlogDocUplDate;
    private final Object sarlogFeeAmt;
    private final String sarlogFeeDate;
    private final String sarlogGender;
    private final String sarlogMobileNo;
    private final boolean sarlogOrgDonor;
    private final Object sarlogPhotoUplDate;
    private final int sarlogPurCd;
    private final int sarlogRecordId;
    private final String sarlogRtoCd;
    private final String sarlogStateCd;
    private final String sarlog_eKYC;
    private final String sarlog_eSign;

    public SarathiLog(Object obj, String str, String str2, long j10, int i10, String str3, String str4, Object obj2, Object obj3, String str5, String str6, String str7, boolean z10, Object obj4, int i11, int i12, String str8, String str9, String str10, String str11) {
        Object obj5 = obj;
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        Object obj6 = obj2;
        Object obj7 = obj3;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        Object obj8 = obj4;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        l.f(obj5, "sarlogAadhar4");
        l.f(str12, "sarlogApplCat");
        l.f(str13, "sarlogApplDate");
        l.f(str14, "sarlogDlDob");
        l.f(str15, "sarlogDlNumber");
        l.f(obj6, "sarlogDocUplDate");
        l.f(obj7, "sarlogFeeAmt");
        l.f(str16, "sarlogFeeDate");
        l.f(str17, "sarlogGender");
        l.f(str18, "sarlogMobileNo");
        l.f(obj8, "sarlogPhotoUplDate");
        l.f(str19, "sarlogRtoCd");
        l.f(str20, "sarlogStateCd");
        l.f(str21, "sarlog_eKYC");
        l.f(str22, "sarlog_eSign");
        this.sarlogAadhar4 = obj5;
        this.sarlogApplCat = str12;
        this.sarlogApplDate = str13;
        this.sarlogApplNo = j10;
        this.sarlogCtzId = i10;
        this.sarlogDlDob = str14;
        this.sarlogDlNumber = str15;
        this.sarlogDocUplDate = obj6;
        this.sarlogFeeAmt = obj7;
        this.sarlogFeeDate = str16;
        this.sarlogGender = str17;
        this.sarlogMobileNo = str18;
        this.sarlogOrgDonor = z10;
        this.sarlogPhotoUplDate = obj8;
        this.sarlogPurCd = i11;
        this.sarlogRecordId = i12;
        this.sarlogRtoCd = str19;
        this.sarlogStateCd = str20;
        this.sarlog_eKYC = str21;
        this.sarlog_eSign = str22;
    }

    public static /* synthetic */ SarathiLog copy$default(SarathiLog sarathiLog, Object obj, String str, String str2, long j10, int i10, String str3, String str4, Object obj2, Object obj3, String str5, String str6, String str7, boolean z10, Object obj4, int i11, int i12, String str8, String str9, String str10, String str11, int i13, Object obj5) {
        SarathiLog sarathiLog2 = sarathiLog;
        int i14 = i13;
        return sarathiLog.copy((i14 & 1) != 0 ? sarathiLog2.sarlogAadhar4 : obj, (i14 & 2) != 0 ? sarathiLog2.sarlogApplCat : str, (i14 & 4) != 0 ? sarathiLog2.sarlogApplDate : str2, (i14 & 8) != 0 ? sarathiLog2.sarlogApplNo : j10, (i14 & 16) != 0 ? sarathiLog2.sarlogCtzId : i10, (i14 & 32) != 0 ? sarathiLog2.sarlogDlDob : str3, (i14 & 64) != 0 ? sarathiLog2.sarlogDlNumber : str4, (i14 & 128) != 0 ? sarathiLog2.sarlogDocUplDate : obj2, (i14 & 256) != 0 ? sarathiLog2.sarlogFeeAmt : obj3, (i14 & 512) != 0 ? sarathiLog2.sarlogFeeDate : str5, (i14 & 1024) != 0 ? sarathiLog2.sarlogGender : str6, (i14 & 2048) != 0 ? sarathiLog2.sarlogMobileNo : str7, (i14 & 4096) != 0 ? sarathiLog2.sarlogOrgDonor : z10, (i14 & 8192) != 0 ? sarathiLog2.sarlogPhotoUplDate : obj4, (i14 & 16384) != 0 ? sarathiLog2.sarlogPurCd : i11, (i14 & 32768) != 0 ? sarathiLog2.sarlogRecordId : i12, (i14 & 65536) != 0 ? sarathiLog2.sarlogRtoCd : str8, (i14 & 131072) != 0 ? sarathiLog2.sarlogStateCd : str9, (i14 & 262144) != 0 ? sarathiLog2.sarlog_eKYC : str10, (i14 & 524288) != 0 ? sarathiLog2.sarlog_eSign : str11);
    }

    public final Object component1() {
        return this.sarlogAadhar4;
    }

    public final String component10() {
        return this.sarlogFeeDate;
    }

    public final String component11() {
        return this.sarlogGender;
    }

    public final String component12() {
        return this.sarlogMobileNo;
    }

    public final boolean component13() {
        return this.sarlogOrgDonor;
    }

    public final Object component14() {
        return this.sarlogPhotoUplDate;
    }

    public final int component15() {
        return this.sarlogPurCd;
    }

    public final int component16() {
        return this.sarlogRecordId;
    }

    public final String component17() {
        return this.sarlogRtoCd;
    }

    public final String component18() {
        return this.sarlogStateCd;
    }

    public final String component19() {
        return this.sarlog_eKYC;
    }

    public final String component2() {
        return this.sarlogApplCat;
    }

    public final String component20() {
        return this.sarlog_eSign;
    }

    public final String component3() {
        return this.sarlogApplDate;
    }

    public final long component4() {
        return this.sarlogApplNo;
    }

    public final int component5() {
        return this.sarlogCtzId;
    }

    public final String component6() {
        return this.sarlogDlDob;
    }

    public final String component7() {
        return this.sarlogDlNumber;
    }

    public final Object component8() {
        return this.sarlogDocUplDate;
    }

    public final Object component9() {
        return this.sarlogFeeAmt;
    }

    public final SarathiLog copy(Object obj, String str, String str2, long j10, int i10, String str3, String str4, Object obj2, Object obj3, String str5, String str6, String str7, boolean z10, Object obj4, int i11, int i12, String str8, String str9, String str10, String str11) {
        Object obj5 = obj;
        l.f(obj5, "sarlogAadhar4");
        l.f(str, "sarlogApplCat");
        l.f(str2, "sarlogApplDate");
        l.f(str3, "sarlogDlDob");
        l.f(str4, "sarlogDlNumber");
        l.f(obj2, "sarlogDocUplDate");
        l.f(obj3, "sarlogFeeAmt");
        l.f(str5, "sarlogFeeDate");
        l.f(str6, "sarlogGender");
        l.f(str7, "sarlogMobileNo");
        l.f(obj4, "sarlogPhotoUplDate");
        l.f(str8, "sarlogRtoCd");
        l.f(str9, "sarlogStateCd");
        l.f(str10, "sarlog_eKYC");
        l.f(str11, "sarlog_eSign");
        return new SarathiLog(obj5, str, str2, j10, i10, str3, str4, obj2, obj3, str5, str6, str7, z10, obj4, i11, i12, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SarathiLog)) {
            return false;
        }
        SarathiLog sarathiLog = (SarathiLog) obj;
        return l.a(this.sarlogAadhar4, sarathiLog.sarlogAadhar4) && l.a(this.sarlogApplCat, sarathiLog.sarlogApplCat) && l.a(this.sarlogApplDate, sarathiLog.sarlogApplDate) && this.sarlogApplNo == sarathiLog.sarlogApplNo && this.sarlogCtzId == sarathiLog.sarlogCtzId && l.a(this.sarlogDlDob, sarathiLog.sarlogDlDob) && l.a(this.sarlogDlNumber, sarathiLog.sarlogDlNumber) && l.a(this.sarlogDocUplDate, sarathiLog.sarlogDocUplDate) && l.a(this.sarlogFeeAmt, sarathiLog.sarlogFeeAmt) && l.a(this.sarlogFeeDate, sarathiLog.sarlogFeeDate) && l.a(this.sarlogGender, sarathiLog.sarlogGender) && l.a(this.sarlogMobileNo, sarathiLog.sarlogMobileNo) && this.sarlogOrgDonor == sarathiLog.sarlogOrgDonor && l.a(this.sarlogPhotoUplDate, sarathiLog.sarlogPhotoUplDate) && this.sarlogPurCd == sarathiLog.sarlogPurCd && this.sarlogRecordId == sarathiLog.sarlogRecordId && l.a(this.sarlogRtoCd, sarathiLog.sarlogRtoCd) && l.a(this.sarlogStateCd, sarathiLog.sarlogStateCd) && l.a(this.sarlog_eKYC, sarathiLog.sarlog_eKYC) && l.a(this.sarlog_eSign, sarathiLog.sarlog_eSign);
    }

    public final Object getSarlogAadhar4() {
        return this.sarlogAadhar4;
    }

    public final String getSarlogApplCat() {
        return this.sarlogApplCat;
    }

    public final String getSarlogApplDate() {
        return this.sarlogApplDate;
    }

    public final long getSarlogApplNo() {
        return this.sarlogApplNo;
    }

    public final int getSarlogCtzId() {
        return this.sarlogCtzId;
    }

    public final String getSarlogDlDob() {
        return this.sarlogDlDob;
    }

    public final String getSarlogDlNumber() {
        return this.sarlogDlNumber;
    }

    public final Object getSarlogDocUplDate() {
        return this.sarlogDocUplDate;
    }

    public final Object getSarlogFeeAmt() {
        return this.sarlogFeeAmt;
    }

    public final String getSarlogFeeDate() {
        return this.sarlogFeeDate;
    }

    public final String getSarlogGender() {
        return this.sarlogGender;
    }

    public final String getSarlogMobileNo() {
        return this.sarlogMobileNo;
    }

    public final boolean getSarlogOrgDonor() {
        return this.sarlogOrgDonor;
    }

    public final Object getSarlogPhotoUplDate() {
        return this.sarlogPhotoUplDate;
    }

    public final int getSarlogPurCd() {
        return this.sarlogPurCd;
    }

    public final int getSarlogRecordId() {
        return this.sarlogRecordId;
    }

    public final String getSarlogRtoCd() {
        return this.sarlogRtoCd;
    }

    public final String getSarlogStateCd() {
        return this.sarlogStateCd;
    }

    public final String getSarlog_eKYC() {
        return this.sarlog_eKYC;
    }

    public final String getSarlog_eSign() {
        return this.sarlog_eSign;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.sarlogAadhar4.hashCode() * 31) + this.sarlogApplCat.hashCode()) * 31) + this.sarlogApplDate.hashCode()) * 31) + Long.hashCode(this.sarlogApplNo)) * 31) + Integer.hashCode(this.sarlogCtzId)) * 31) + this.sarlogDlDob.hashCode()) * 31) + this.sarlogDlNumber.hashCode()) * 31) + this.sarlogDocUplDate.hashCode()) * 31) + this.sarlogFeeAmt.hashCode()) * 31) + this.sarlogFeeDate.hashCode()) * 31) + this.sarlogGender.hashCode()) * 31) + this.sarlogMobileNo.hashCode()) * 31;
        boolean z10 = this.sarlogOrgDonor;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((((hashCode + (z10 ? 1 : 0)) * 31) + this.sarlogPhotoUplDate.hashCode()) * 31) + Integer.hashCode(this.sarlogPurCd)) * 31) + Integer.hashCode(this.sarlogRecordId)) * 31) + this.sarlogRtoCd.hashCode()) * 31) + this.sarlogStateCd.hashCode()) * 31) + this.sarlog_eKYC.hashCode()) * 31) + this.sarlog_eSign.hashCode();
    }

    public String toString() {
        return "SarathiLog(sarlogAadhar4=" + this.sarlogAadhar4 + ", sarlogApplCat=" + this.sarlogApplCat + ", sarlogApplDate=" + this.sarlogApplDate + ", sarlogApplNo=" + this.sarlogApplNo + ", sarlogCtzId=" + this.sarlogCtzId + ", sarlogDlDob=" + this.sarlogDlDob + ", sarlogDlNumber=" + this.sarlogDlNumber + ", sarlogDocUplDate=" + this.sarlogDocUplDate + ", sarlogFeeAmt=" + this.sarlogFeeAmt + ", sarlogFeeDate=" + this.sarlogFeeDate + ", sarlogGender=" + this.sarlogGender + ", sarlogMobileNo=" + this.sarlogMobileNo + ", sarlogOrgDonor=" + this.sarlogOrgDonor + ", sarlogPhotoUplDate=" + this.sarlogPhotoUplDate + ", sarlogPurCd=" + this.sarlogPurCd + ", sarlogRecordId=" + this.sarlogRecordId + ", sarlogRtoCd=" + this.sarlogRtoCd + ", sarlogStateCd=" + this.sarlogStateCd + ", sarlog_eKYC=" + this.sarlog_eKYC + ", sarlog_eSign=" + this.sarlog_eSign + ')';
    }
}
