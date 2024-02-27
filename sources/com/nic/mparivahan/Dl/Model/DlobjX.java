package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class DlobjX implements Serializable {
    private final String dlIssueauth;
    private final String dlIssuedt;
    private final int dlLatestTrcode;
    private final String dlLicno;
    private final String dlNtValdfrDt;
    private final String dlNtValdtoDt;
    private final String dlOldLicno;
    private final String dlPrintDate;
    private final String dlPrintStatus;
    private final String dlRecGenesis;
    private final String dlRtoCode;
    private final String dlSeqno;
    private final String dlStatus;
    private final int dlTokenId;
    private final String dlTrValdfrDt;
    private final String dlTrValdtoDate;
    private final String dlTrValdtoDt;
    private final int dlUsid;
    private final String enforceRemark;
    private final String olaName;
    private final String olacode;
    private final String omOfficeTownname;
    private final String omRtoFullname;
    private final String omRtoShortname;
    private final String stateName;
    private final String statecd;

    public DlobjX(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        String str24 = str;
        String str25 = str2;
        String str26 = str3;
        String str27 = str4;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str15;
        String str36 = str16;
        String str37 = str17;
        String str38 = str19;
        l.f(str24, "dlIssueauth");
        l.f(str25, "dlIssuedt");
        l.f(str26, "dlLicno");
        l.f(str27, "dlNtValdfrDt");
        l.f(str28, "dlNtValdtoDt");
        l.f(str29, "dlOldLicno");
        l.f(str30, "dlPrintDate");
        l.f(str31, "dlPrintStatus");
        l.f(str32, "dlRecGenesis");
        l.f(str33, "dlRtoCode");
        l.f(str34, "dlSeqno");
        l.f(str35, "dlStatus");
        l.f(str36, "enforceRemark");
        l.f(str37, "olaName");
        l.f(str18, "olacode");
        l.f(str19, "omOfficeTownname");
        l.f(str20, "omRtoFullname");
        l.f(str21, "omRtoShortname");
        l.f(str22, "stateName");
        l.f(str23, "statecd");
        this.dlIssueauth = str24;
        this.dlIssuedt = str25;
        this.dlLatestTrcode = i10;
        this.dlLicno = str26;
        this.dlNtValdfrDt = str27;
        this.dlTrValdfrDt = str5;
        this.dlTrValdtoDate = str6;
        this.dlTrValdtoDt = str7;
        this.dlNtValdtoDt = str28;
        this.dlOldLicno = str29;
        this.dlPrintDate = str30;
        this.dlPrintStatus = str31;
        this.dlRecGenesis = str32;
        this.dlRtoCode = str33;
        this.dlSeqno = str34;
        this.dlStatus = str35;
        this.dlTokenId = i11;
        this.dlUsid = i12;
        this.enforceRemark = str36;
        this.olaName = str37;
        this.olacode = str18;
        this.omOfficeTownname = str19;
        this.omRtoFullname = str20;
        this.omRtoShortname = str21;
        this.stateName = str22;
        this.statecd = str23;
    }

    public static /* synthetic */ DlobjX copy$default(DlobjX dlobjX, String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i13, Object obj) {
        DlobjX dlobjX2 = dlobjX;
        int i14 = i13;
        return dlobjX.copy((i14 & 1) != 0 ? dlobjX2.dlIssueauth : str, (i14 & 2) != 0 ? dlobjX2.dlIssuedt : str2, (i14 & 4) != 0 ? dlobjX2.dlLatestTrcode : i10, (i14 & 8) != 0 ? dlobjX2.dlLicno : str3, (i14 & 16) != 0 ? dlobjX2.dlNtValdfrDt : str4, (i14 & 32) != 0 ? dlobjX2.dlTrValdfrDt : str5, (i14 & 64) != 0 ? dlobjX2.dlTrValdtoDate : str6, (i14 & 128) != 0 ? dlobjX2.dlTrValdtoDt : str7, (i14 & 256) != 0 ? dlobjX2.dlNtValdtoDt : str8, (i14 & 512) != 0 ? dlobjX2.dlOldLicno : str9, (i14 & 1024) != 0 ? dlobjX2.dlPrintDate : str10, (i14 & 2048) != 0 ? dlobjX2.dlPrintStatus : str11, (i14 & 4096) != 0 ? dlobjX2.dlRecGenesis : str12, (i14 & 8192) != 0 ? dlobjX2.dlRtoCode : str13, (i14 & 16384) != 0 ? dlobjX2.dlSeqno : str14, (i14 & 32768) != 0 ? dlobjX2.dlStatus : str15, (i14 & 65536) != 0 ? dlobjX2.dlTokenId : i11, (i14 & 131072) != 0 ? dlobjX2.dlUsid : i12, (i14 & 262144) != 0 ? dlobjX2.enforceRemark : str16, (i14 & 524288) != 0 ? dlobjX2.olaName : str17, (i14 & 1048576) != 0 ? dlobjX2.olacode : str18, (i14 & 2097152) != 0 ? dlobjX2.omOfficeTownname : str19, (i14 & 4194304) != 0 ? dlobjX2.omRtoFullname : str20, (i14 & 8388608) != 0 ? dlobjX2.omRtoShortname : str21, (i14 & 16777216) != 0 ? dlobjX2.stateName : str22, (i14 & 33554432) != 0 ? dlobjX2.statecd : str23);
    }

    public final String component1() {
        return this.dlIssueauth;
    }

    public final String component10() {
        return this.dlOldLicno;
    }

    public final String component11() {
        return this.dlPrintDate;
    }

    public final String component12() {
        return this.dlPrintStatus;
    }

    public final String component13() {
        return this.dlRecGenesis;
    }

    public final String component14() {
        return this.dlRtoCode;
    }

    public final String component15() {
        return this.dlSeqno;
    }

    public final String component16() {
        return this.dlStatus;
    }

    public final int component17() {
        return this.dlTokenId;
    }

    public final int component18() {
        return this.dlUsid;
    }

    public final String component19() {
        return this.enforceRemark;
    }

    public final String component2() {
        return this.dlIssuedt;
    }

    public final String component20() {
        return this.olaName;
    }

    public final String component21() {
        return this.olacode;
    }

    public final String component22() {
        return this.omOfficeTownname;
    }

    public final String component23() {
        return this.omRtoFullname;
    }

    public final String component24() {
        return this.omRtoShortname;
    }

    public final String component25() {
        return this.stateName;
    }

    public final String component26() {
        return this.statecd;
    }

    public final int component3() {
        return this.dlLatestTrcode;
    }

    public final String component4() {
        return this.dlLicno;
    }

    public final String component5() {
        return this.dlNtValdfrDt;
    }

    public final String component6() {
        return this.dlTrValdfrDt;
    }

    public final String component7() {
        return this.dlTrValdtoDate;
    }

    public final String component8() {
        return this.dlTrValdtoDt;
    }

    public final String component9() {
        return this.dlNtValdtoDt;
    }

    public final DlobjX copy(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, int i12, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        String str24 = str;
        l.f(str24, "dlIssueauth");
        l.f(str2, "dlIssuedt");
        l.f(str3, "dlLicno");
        l.f(str4, "dlNtValdfrDt");
        l.f(str8, "dlNtValdtoDt");
        l.f(str9, "dlOldLicno");
        l.f(str10, "dlPrintDate");
        l.f(str11, "dlPrintStatus");
        l.f(str12, "dlRecGenesis");
        l.f(str13, "dlRtoCode");
        l.f(str14, "dlSeqno");
        l.f(str15, "dlStatus");
        l.f(str16, "enforceRemark");
        l.f(str17, "olaName");
        l.f(str18, "olacode");
        l.f(str19, "omOfficeTownname");
        l.f(str20, "omRtoFullname");
        l.f(str21, "omRtoShortname");
        l.f(str22, "stateName");
        l.f(str23, "statecd");
        return new DlobjX(str24, str2, i10, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, i11, i12, str16, str17, str18, str19, str20, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlobjX)) {
            return false;
        }
        DlobjX dlobjX = (DlobjX) obj;
        return l.a(this.dlIssueauth, dlobjX.dlIssueauth) && l.a(this.dlIssuedt, dlobjX.dlIssuedt) && this.dlLatestTrcode == dlobjX.dlLatestTrcode && l.a(this.dlLicno, dlobjX.dlLicno) && l.a(this.dlNtValdfrDt, dlobjX.dlNtValdfrDt) && l.a(this.dlTrValdfrDt, dlobjX.dlTrValdfrDt) && l.a(this.dlTrValdtoDate, dlobjX.dlTrValdtoDate) && l.a(this.dlTrValdtoDt, dlobjX.dlTrValdtoDt) && l.a(this.dlNtValdtoDt, dlobjX.dlNtValdtoDt) && l.a(this.dlOldLicno, dlobjX.dlOldLicno) && l.a(this.dlPrintDate, dlobjX.dlPrintDate) && l.a(this.dlPrintStatus, dlobjX.dlPrintStatus) && l.a(this.dlRecGenesis, dlobjX.dlRecGenesis) && l.a(this.dlRtoCode, dlobjX.dlRtoCode) && l.a(this.dlSeqno, dlobjX.dlSeqno) && l.a(this.dlStatus, dlobjX.dlStatus) && this.dlTokenId == dlobjX.dlTokenId && this.dlUsid == dlobjX.dlUsid && l.a(this.enforceRemark, dlobjX.enforceRemark) && l.a(this.olaName, dlobjX.olaName) && l.a(this.olacode, dlobjX.olacode) && l.a(this.omOfficeTownname, dlobjX.omOfficeTownname) && l.a(this.omRtoFullname, dlobjX.omRtoFullname) && l.a(this.omRtoShortname, dlobjX.omRtoShortname) && l.a(this.stateName, dlobjX.stateName) && l.a(this.statecd, dlobjX.statecd);
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final int getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlLicno() {
        return this.dlLicno;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    public final String getDlPrintDate() {
        return this.dlPrintDate;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final int getDlTokenId() {
        return this.dlTokenId;
    }

    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    public final String getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    public final int getDlUsid() {
        return this.dlUsid;
    }

    public final String getEnforceRemark() {
        return this.enforceRemark;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getOlacode() {
        return this.olacode;
    }

    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public int hashCode() {
        int hashCode = ((((((((this.dlIssueauth.hashCode() * 31) + this.dlIssuedt.hashCode()) * 31) + Integer.hashCode(this.dlLatestTrcode)) * 31) + this.dlLicno.hashCode()) * 31) + this.dlNtValdfrDt.hashCode()) * 31;
        String str = this.dlTrValdfrDt;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dlTrValdtoDate;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dlTrValdtoDt;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((hashCode3 + i10) * 31) + this.dlNtValdtoDt.hashCode()) * 31) + this.dlOldLicno.hashCode()) * 31) + this.dlPrintDate.hashCode()) * 31) + this.dlPrintStatus.hashCode()) * 31) + this.dlRecGenesis.hashCode()) * 31) + this.dlRtoCode.hashCode()) * 31) + this.dlSeqno.hashCode()) * 31) + this.dlStatus.hashCode()) * 31) + Integer.hashCode(this.dlTokenId)) * 31) + Integer.hashCode(this.dlUsid)) * 31) + this.enforceRemark.hashCode()) * 31) + this.olaName.hashCode()) * 31) + this.olacode.hashCode()) * 31) + this.omOfficeTownname.hashCode()) * 31) + this.omRtoFullname.hashCode()) * 31) + this.omRtoShortname.hashCode()) * 31) + this.stateName.hashCode()) * 31) + this.statecd.hashCode();
    }

    public String toString() {
        return "DlobjX(dlIssueauth=" + this.dlIssueauth + ", dlIssuedt=" + this.dlIssuedt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlLicno=" + this.dlLicno + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", dlOldLicno=" + this.dlOldLicno + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlRecGenesis=" + this.dlRecGenesis + ", dlRtoCode=" + this.dlRtoCode + ", dlSeqno=" + this.dlSeqno + ", dlStatus=" + this.dlStatus + ", dlTokenId=" + this.dlTokenId + ", dlUsid=" + this.dlUsid + ", enforceRemark=" + this.enforceRemark + ", olaName=" + this.olaName + ", olacode=" + this.olacode + ", omOfficeTownname=" + this.omOfficeTownname + ", omRtoFullname=" + this.omRtoFullname + ", omRtoShortname=" + this.omRtoShortname + ", stateName=" + this.stateName + ", statecd=" + this.statecd + ')';
    }
}
