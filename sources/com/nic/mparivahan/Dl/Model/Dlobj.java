package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Dlobj implements Serializable {
    private final String bioid;
    private final Object dlAuthCov;
    private final Object dlAuthDt;
    private final Object dlAuthIssauth;
    private final Object dlAuthNo;
    private final Object dlBioId;
    private final Object dlDigest;
    private final String dlDispatchStatus;
    private final String dlEndorseAuth;
    private final Object dlEndorsedt;
    private final String dlEndorseno;
    private final Object dlEndorsetime;
    private final Object dlHlValdfrDt;
    private final Object dlHlValdtoDate;
    private final Object dlHlValdtoDt;
    private final Object dlHzValdfrDt;
    private final Object dlHzValdtoDate;
    private final Object dlHzValdtoDt;
    private final Object dlInvcrgNo;
    private final Object dlIssueDate;
    private final String dlIssueauth;
    private final Object dlIssuedesig;
    private final String dlIssuedt;
    private final String dlLatestTrcode;
    private final String dlLicno;
    private final Object dlNtValdfrDt;
    private final Object dlNtValdtoDate;
    private final Object dlNtValdtoDt;
    private final String dlOldLicno;
    private final Object dlPrintDate;
    private final String dlPrintStatus;
    private final String dlRecGenesis;
    private final Object dlRemarks;
    private final String dlRtoCode;
    private final Object dlSeqno;
    private final Object dlStateCode;
    private final Object dlStatus;
    private final Object dlTokenId;
    private final String dlTrValdfrDt;
    private final Object dlTrValdtoDate;
    private final String dlTrValdtoDt;
    private final String dlUsid;
    private final Object dlolaCode;
    private final Object enforceEndDate;
    private final Object enforceFromDate;
    private final String enforceRemark;
    private final String olaName;
    private final String olacode;
    private final String omOfficeTownname;
    private final String omRtoFullname;
    private final String omRtoShortname;
    private final String stateName;
    private final String statecd;

    public Dlobj(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str2, String str3, Object obj7, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, String str7, String str8, Object obj18, Object obj19, Object obj20, String str9, Object obj21, String str10, String str11, Object obj22, String str12, Object obj23, Object obj24, Object obj25, Object obj26, String str13, Object obj27, String str14, String str15, Object obj28, Object obj29, Object obj30, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        String str24 = str;
        Object obj31 = obj;
        Object obj32 = obj2;
        Object obj33 = obj3;
        Object obj34 = obj4;
        Object obj35 = obj5;
        Object obj36 = obj6;
        String str25 = str2;
        String str26 = str3;
        Object obj37 = obj7;
        String str27 = str4;
        Object obj38 = obj8;
        Object obj39 = obj9;
        Object obj40 = obj10;
        Object obj41 = obj12;
        l.f(str24, "bioid");
        l.f(obj31, "dlAuthCov");
        l.f(obj32, "dlAuthDt");
        l.f(obj33, "dlAuthIssauth");
        l.f(obj34, "dlAuthNo");
        l.f(obj35, "dlBioId");
        l.f(obj36, "dlDigest");
        l.f(str25, "dlDispatchStatus");
        l.f(str26, "dlEndorseAuth");
        l.f(obj37, "dlEndorsedt");
        l.f(str27, "dlEndorseno");
        l.f(obj38, "dlEndorsetime");
        l.f(obj39, "dlHlValdfrDt");
        l.f(obj40, "dlHlValdtoDate");
        l.f(obj11, "dlHlValdtoDt");
        l.f(obj12, "dlHzValdfrDt");
        l.f(obj13, "dlHzValdtoDate");
        l.f(obj14, "dlHzValdtoDt");
        l.f(obj15, "dlInvcrgNo");
        l.f(obj16, "dlIssueDate");
        l.f(str5, "dlIssueauth");
        l.f(obj17, "dlIssuedesig");
        l.f(str6, "dlIssuedt");
        l.f(str7, "dlLatestTrcode");
        l.f(str8, "dlLicno");
        l.f(obj18, "dlNtValdfrDt");
        l.f(obj19, "dlNtValdtoDate");
        l.f(obj20, "dlNtValdtoDt");
        l.f(str9, "dlOldLicno");
        l.f(obj21, "dlPrintDate");
        l.f(str10, "dlPrintStatus");
        l.f(str11, "dlRecGenesis");
        l.f(obj22, "dlRemarks");
        l.f(str12, "dlRtoCode");
        l.f(obj23, "dlSeqno");
        l.f(obj24, "dlStateCode");
        l.f(obj25, "dlStatus");
        l.f(obj26, "dlTokenId");
        l.f(str13, "dlTrValdfrDt");
        l.f(obj27, "dlTrValdtoDate");
        l.f(str14, "dlTrValdtoDt");
        l.f(str15, "dlUsid");
        l.f(obj28, "dlolaCode");
        l.f(obj29, "enforceEndDate");
        l.f(obj30, "enforceFromDate");
        l.f(str16, "enforceRemark");
        l.f(str17, "olaName");
        l.f(str18, "olacode");
        l.f(str19, "omOfficeTownname");
        l.f(str20, "omRtoFullname");
        l.f(str21, "omRtoShortname");
        l.f(str22, "stateName");
        l.f(str23, "statecd");
        this.bioid = str24;
        this.dlAuthCov = obj31;
        this.dlAuthDt = obj32;
        this.dlAuthIssauth = obj33;
        this.dlAuthNo = obj34;
        this.dlBioId = obj35;
        this.dlDigest = obj36;
        this.dlDispatchStatus = str25;
        this.dlEndorseAuth = str26;
        this.dlEndorsedt = obj37;
        this.dlEndorseno = str27;
        this.dlEndorsetime = obj38;
        this.dlHlValdfrDt = obj39;
        this.dlHlValdtoDate = obj40;
        this.dlHlValdtoDt = obj11;
        this.dlHzValdfrDt = obj12;
        this.dlHzValdtoDate = obj13;
        this.dlHzValdtoDt = obj14;
        this.dlInvcrgNo = obj15;
        this.dlIssueDate = obj16;
        this.dlIssueauth = str5;
        this.dlIssuedesig = obj17;
        this.dlIssuedt = str6;
        this.dlLatestTrcode = str7;
        this.dlLicno = str8;
        this.dlNtValdfrDt = obj18;
        this.dlNtValdtoDate = obj19;
        this.dlNtValdtoDt = obj20;
        this.dlOldLicno = str9;
        this.dlPrintDate = obj21;
        this.dlPrintStatus = str10;
        this.dlRecGenesis = str11;
        this.dlRemarks = obj22;
        this.dlRtoCode = str12;
        this.dlSeqno = obj23;
        this.dlStateCode = obj24;
        this.dlStatus = obj25;
        this.dlTokenId = obj26;
        this.dlTrValdfrDt = str13;
        this.dlTrValdtoDate = obj27;
        this.dlTrValdtoDt = str14;
        this.dlUsid = str15;
        this.dlolaCode = obj28;
        this.enforceEndDate = obj29;
        this.enforceFromDate = obj30;
        this.enforceRemark = str16;
        this.olaName = str17;
        this.olacode = str18;
        this.omOfficeTownname = str19;
        this.omRtoFullname = str20;
        this.omRtoShortname = str21;
        this.stateName = str22;
        this.statecd = str23;
    }

    public static /* synthetic */ Dlobj copy$default(Dlobj dlobj, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str2, String str3, Object obj7, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, String str7, String str8, Object obj18, Object obj19, Object obj20, String str9, Object obj21, String str10, String str11, Object obj22, String str12, Object obj23, Object obj24, Object obj25, Object obj26, String str13, Object obj27, String str14, String str15, Object obj28, Object obj29, Object obj30, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i10, int i11, Object obj31) {
        Dlobj dlobj2 = dlobj;
        int i12 = i10;
        int i13 = i11;
        return dlobj.copy((i12 & 1) != 0 ? dlobj2.bioid : str, (i12 & 2) != 0 ? dlobj2.dlAuthCov : obj, (i12 & 4) != 0 ? dlobj2.dlAuthDt : obj2, (i12 & 8) != 0 ? dlobj2.dlAuthIssauth : obj3, (i12 & 16) != 0 ? dlobj2.dlAuthNo : obj4, (i12 & 32) != 0 ? dlobj2.dlBioId : obj5, (i12 & 64) != 0 ? dlobj2.dlDigest : obj6, (i12 & 128) != 0 ? dlobj2.dlDispatchStatus : str2, (i12 & 256) != 0 ? dlobj2.dlEndorseAuth : str3, (i12 & 512) != 0 ? dlobj2.dlEndorsedt : obj7, (i12 & 1024) != 0 ? dlobj2.dlEndorseno : str4, (i12 & 2048) != 0 ? dlobj2.dlEndorsetime : obj8, (i12 & 4096) != 0 ? dlobj2.dlHlValdfrDt : obj9, (i12 & 8192) != 0 ? dlobj2.dlHlValdtoDate : obj10, (i12 & 16384) != 0 ? dlobj2.dlHlValdtoDt : obj11, (i12 & 32768) != 0 ? dlobj2.dlHzValdfrDt : obj12, (i12 & 65536) != 0 ? dlobj2.dlHzValdtoDate : obj13, (i12 & 131072) != 0 ? dlobj2.dlHzValdtoDt : obj14, (i12 & 262144) != 0 ? dlobj2.dlInvcrgNo : obj15, (i12 & 524288) != 0 ? dlobj2.dlIssueDate : obj16, (i12 & 1048576) != 0 ? dlobj2.dlIssueauth : str5, (i12 & 2097152) != 0 ? dlobj2.dlIssuedesig : obj17, (i12 & 4194304) != 0 ? dlobj2.dlIssuedt : str6, (i12 & 8388608) != 0 ? dlobj2.dlLatestTrcode : str7, (i12 & 16777216) != 0 ? dlobj2.dlLicno : str8, (i12 & 33554432) != 0 ? dlobj2.dlNtValdfrDt : obj18, (i12 & 67108864) != 0 ? dlobj2.dlNtValdtoDate : obj19, (i12 & 134217728) != 0 ? dlobj2.dlNtValdtoDt : obj20, (i12 & 268435456) != 0 ? dlobj2.dlOldLicno : str9, (i12 & 536870912) != 0 ? dlobj2.dlPrintDate : obj21, (i12 & 1073741824) != 0 ? dlobj2.dlPrintStatus : str10, (i12 & Integer.MIN_VALUE) != 0 ? dlobj2.dlRecGenesis : str11, (i13 & 1) != 0 ? dlobj2.dlRemarks : obj22, (i13 & 2) != 0 ? dlobj2.dlRtoCode : str12, (i13 & 4) != 0 ? dlobj2.dlSeqno : obj23, (i13 & 8) != 0 ? dlobj2.dlStateCode : obj24, (i13 & 16) != 0 ? dlobj2.dlStatus : obj25, (i13 & 32) != 0 ? dlobj2.dlTokenId : obj26, (i13 & 64) != 0 ? dlobj2.dlTrValdfrDt : str13, (i13 & 128) != 0 ? dlobj2.dlTrValdtoDate : obj27, (i13 & 256) != 0 ? dlobj2.dlTrValdtoDt : str14, (i13 & 512) != 0 ? dlobj2.dlUsid : str15, (i13 & 1024) != 0 ? dlobj2.dlolaCode : obj28, (i13 & 2048) != 0 ? dlobj2.enforceEndDate : obj29, (i13 & 4096) != 0 ? dlobj2.enforceFromDate : obj30, (i13 & 8192) != 0 ? dlobj2.enforceRemark : str16, (i13 & 16384) != 0 ? dlobj2.olaName : str17, (i13 & 32768) != 0 ? dlobj2.olacode : str18, (i13 & 65536) != 0 ? dlobj2.omOfficeTownname : str19, (i13 & 131072) != 0 ? dlobj2.omRtoFullname : str20, (i13 & 262144) != 0 ? dlobj2.omRtoShortname : str21, (i13 & 524288) != 0 ? dlobj2.stateName : str22, (i13 & 1048576) != 0 ? dlobj2.statecd : str23);
    }

    public final String component1() {
        return this.bioid;
    }

    public final Object component10() {
        return this.dlEndorsedt;
    }

    public final String component11() {
        return this.dlEndorseno;
    }

    public final Object component12() {
        return this.dlEndorsetime;
    }

    public final Object component13() {
        return this.dlHlValdfrDt;
    }

    public final Object component14() {
        return this.dlHlValdtoDate;
    }

    public final Object component15() {
        return this.dlHlValdtoDt;
    }

    public final Object component16() {
        return this.dlHzValdfrDt;
    }

    public final Object component17() {
        return this.dlHzValdtoDate;
    }

    public final Object component18() {
        return this.dlHzValdtoDt;
    }

    public final Object component19() {
        return this.dlInvcrgNo;
    }

    public final Object component2() {
        return this.dlAuthCov;
    }

    public final Object component20() {
        return this.dlIssueDate;
    }

    public final String component21() {
        return this.dlIssueauth;
    }

    public final Object component22() {
        return this.dlIssuedesig;
    }

    public final String component23() {
        return this.dlIssuedt;
    }

    public final String component24() {
        return this.dlLatestTrcode;
    }

    public final String component25() {
        return this.dlLicno;
    }

    public final Object component26() {
        return this.dlNtValdfrDt;
    }

    public final Object component27() {
        return this.dlNtValdtoDate;
    }

    public final Object component28() {
        return this.dlNtValdtoDt;
    }

    public final String component29() {
        return this.dlOldLicno;
    }

    public final Object component3() {
        return this.dlAuthDt;
    }

    public final Object component30() {
        return this.dlPrintDate;
    }

    public final String component31() {
        return this.dlPrintStatus;
    }

    public final String component32() {
        return this.dlRecGenesis;
    }

    public final Object component33() {
        return this.dlRemarks;
    }

    public final String component34() {
        return this.dlRtoCode;
    }

    public final Object component35() {
        return this.dlSeqno;
    }

    public final Object component36() {
        return this.dlStateCode;
    }

    public final Object component37() {
        return this.dlStatus;
    }

    public final Object component38() {
        return this.dlTokenId;
    }

    public final String component39() {
        return this.dlTrValdfrDt;
    }

    public final Object component4() {
        return this.dlAuthIssauth;
    }

    public final Object component40() {
        return this.dlTrValdtoDate;
    }

    public final String component41() {
        return this.dlTrValdtoDt;
    }

    public final String component42() {
        return this.dlUsid;
    }

    public final Object component43() {
        return this.dlolaCode;
    }

    public final Object component44() {
        return this.enforceEndDate;
    }

    public final Object component45() {
        return this.enforceFromDate;
    }

    public final String component46() {
        return this.enforceRemark;
    }

    public final String component47() {
        return this.olaName;
    }

    public final String component48() {
        return this.olacode;
    }

    public final String component49() {
        return this.omOfficeTownname;
    }

    public final Object component5() {
        return this.dlAuthNo;
    }

    public final String component50() {
        return this.omRtoFullname;
    }

    public final String component51() {
        return this.omRtoShortname;
    }

    public final String component52() {
        return this.stateName;
    }

    public final String component53() {
        return this.statecd;
    }

    public final Object component6() {
        return this.dlBioId;
    }

    public final Object component7() {
        return this.dlDigest;
    }

    public final String component8() {
        return this.dlDispatchStatus;
    }

    public final String component9() {
        return this.dlEndorseAuth;
    }

    public final Dlobj copy(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str2, String str3, Object obj7, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, String str7, String str8, Object obj18, Object obj19, Object obj20, String str9, Object obj21, String str10, String str11, Object obj22, String str12, Object obj23, Object obj24, Object obj25, Object obj26, String str13, Object obj27, String str14, String str15, Object obj28, Object obj29, Object obj30, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23) {
        String str24 = str;
        l.f(str24, "bioid");
        l.f(obj, "dlAuthCov");
        l.f(obj2, "dlAuthDt");
        l.f(obj3, "dlAuthIssauth");
        l.f(obj4, "dlAuthNo");
        l.f(obj5, "dlBioId");
        l.f(obj6, "dlDigest");
        l.f(str2, "dlDispatchStatus");
        l.f(str3, "dlEndorseAuth");
        l.f(obj7, "dlEndorsedt");
        l.f(str4, "dlEndorseno");
        l.f(obj8, "dlEndorsetime");
        l.f(obj9, "dlHlValdfrDt");
        l.f(obj10, "dlHlValdtoDate");
        l.f(obj11, "dlHlValdtoDt");
        l.f(obj12, "dlHzValdfrDt");
        l.f(obj13, "dlHzValdtoDate");
        l.f(obj14, "dlHzValdtoDt");
        l.f(obj15, "dlInvcrgNo");
        l.f(obj16, "dlIssueDate");
        l.f(str5, "dlIssueauth");
        l.f(obj17, "dlIssuedesig");
        l.f(str6, "dlIssuedt");
        l.f(str7, "dlLatestTrcode");
        l.f(str8, "dlLicno");
        l.f(obj18, "dlNtValdfrDt");
        l.f(obj19, "dlNtValdtoDate");
        l.f(obj20, "dlNtValdtoDt");
        l.f(str9, "dlOldLicno");
        l.f(obj21, "dlPrintDate");
        l.f(str10, "dlPrintStatus");
        l.f(str11, "dlRecGenesis");
        l.f(obj22, "dlRemarks");
        l.f(str12, "dlRtoCode");
        l.f(obj23, "dlSeqno");
        l.f(obj24, "dlStateCode");
        l.f(obj25, "dlStatus");
        l.f(obj26, "dlTokenId");
        l.f(str13, "dlTrValdfrDt");
        l.f(obj27, "dlTrValdtoDate");
        l.f(str14, "dlTrValdtoDt");
        l.f(str15, "dlUsid");
        l.f(obj28, "dlolaCode");
        l.f(obj29, "enforceEndDate");
        l.f(obj30, "enforceFromDate");
        l.f(str16, "enforceRemark");
        l.f(str17, "olaName");
        l.f(str18, "olacode");
        l.f(str19, "omOfficeTownname");
        l.f(str20, "omRtoFullname");
        l.f(str21, "omRtoShortname");
        l.f(str22, "stateName");
        l.f(str23, "statecd");
        return new Dlobj(str24, obj, obj2, obj3, obj4, obj5, obj6, str2, str3, obj7, str4, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, str5, obj17, str6, str7, str8, obj18, obj19, obj20, str9, obj21, str10, str11, obj22, str12, obj23, obj24, obj25, obj26, str13, obj27, str14, str15, obj28, obj29, obj30, str16, str17, str18, str19, str20, str21, str22, str23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dlobj)) {
            return false;
        }
        Dlobj dlobj = (Dlobj) obj;
        return l.a(this.bioid, dlobj.bioid) && l.a(this.dlAuthCov, dlobj.dlAuthCov) && l.a(this.dlAuthDt, dlobj.dlAuthDt) && l.a(this.dlAuthIssauth, dlobj.dlAuthIssauth) && l.a(this.dlAuthNo, dlobj.dlAuthNo) && l.a(this.dlBioId, dlobj.dlBioId) && l.a(this.dlDigest, dlobj.dlDigest) && l.a(this.dlDispatchStatus, dlobj.dlDispatchStatus) && l.a(this.dlEndorseAuth, dlobj.dlEndorseAuth) && l.a(this.dlEndorsedt, dlobj.dlEndorsedt) && l.a(this.dlEndorseno, dlobj.dlEndorseno) && l.a(this.dlEndorsetime, dlobj.dlEndorsetime) && l.a(this.dlHlValdfrDt, dlobj.dlHlValdfrDt) && l.a(this.dlHlValdtoDate, dlobj.dlHlValdtoDate) && l.a(this.dlHlValdtoDt, dlobj.dlHlValdtoDt) && l.a(this.dlHzValdfrDt, dlobj.dlHzValdfrDt) && l.a(this.dlHzValdtoDate, dlobj.dlHzValdtoDate) && l.a(this.dlHzValdtoDt, dlobj.dlHzValdtoDt) && l.a(this.dlInvcrgNo, dlobj.dlInvcrgNo) && l.a(this.dlIssueDate, dlobj.dlIssueDate) && l.a(this.dlIssueauth, dlobj.dlIssueauth) && l.a(this.dlIssuedesig, dlobj.dlIssuedesig) && l.a(this.dlIssuedt, dlobj.dlIssuedt) && l.a(this.dlLatestTrcode, dlobj.dlLatestTrcode) && l.a(this.dlLicno, dlobj.dlLicno) && l.a(this.dlNtValdfrDt, dlobj.dlNtValdfrDt) && l.a(this.dlNtValdtoDate, dlobj.dlNtValdtoDate) && l.a(this.dlNtValdtoDt, dlobj.dlNtValdtoDt) && l.a(this.dlOldLicno, dlobj.dlOldLicno) && l.a(this.dlPrintDate, dlobj.dlPrintDate) && l.a(this.dlPrintStatus, dlobj.dlPrintStatus) && l.a(this.dlRecGenesis, dlobj.dlRecGenesis) && l.a(this.dlRemarks, dlobj.dlRemarks) && l.a(this.dlRtoCode, dlobj.dlRtoCode) && l.a(this.dlSeqno, dlobj.dlSeqno) && l.a(this.dlStateCode, dlobj.dlStateCode) && l.a(this.dlStatus, dlobj.dlStatus) && l.a(this.dlTokenId, dlobj.dlTokenId) && l.a(this.dlTrValdfrDt, dlobj.dlTrValdfrDt) && l.a(this.dlTrValdtoDate, dlobj.dlTrValdtoDate) && l.a(this.dlTrValdtoDt, dlobj.dlTrValdtoDt) && l.a(this.dlUsid, dlobj.dlUsid) && l.a(this.dlolaCode, dlobj.dlolaCode) && l.a(this.enforceEndDate, dlobj.enforceEndDate) && l.a(this.enforceFromDate, dlobj.enforceFromDate) && l.a(this.enforceRemark, dlobj.enforceRemark) && l.a(this.olaName, dlobj.olaName) && l.a(this.olacode, dlobj.olacode) && l.a(this.omOfficeTownname, dlobj.omOfficeTownname) && l.a(this.omRtoFullname, dlobj.omRtoFullname) && l.a(this.omRtoShortname, dlobj.omRtoShortname) && l.a(this.stateName, dlobj.stateName) && l.a(this.statecd, dlobj.statecd);
    }

    public final String getBioid() {
        return this.bioid;
    }

    public final Object getDlAuthCov() {
        return this.dlAuthCov;
    }

    public final Object getDlAuthDt() {
        return this.dlAuthDt;
    }

    public final Object getDlAuthIssauth() {
        return this.dlAuthIssauth;
    }

    public final Object getDlAuthNo() {
        return this.dlAuthNo;
    }

    public final Object getDlBioId() {
        return this.dlBioId;
    }

    public final Object getDlDigest() {
        return this.dlDigest;
    }

    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final Object getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    public final String getDlEndorseno() {
        return this.dlEndorseno;
    }

    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    public final Object getDlHlValdfrDt() {
        return this.dlHlValdfrDt;
    }

    public final Object getDlHlValdtoDate() {
        return this.dlHlValdtoDate;
    }

    public final Object getDlHlValdtoDt() {
        return this.dlHlValdtoDt;
    }

    public final Object getDlHzValdfrDt() {
        return this.dlHzValdfrDt;
    }

    public final Object getDlHzValdtoDate() {
        return this.dlHzValdtoDate;
    }

    public final Object getDlHzValdtoDt() {
        return this.dlHzValdtoDt;
    }

    public final Object getDlInvcrgNo() {
        return this.dlInvcrgNo;
    }

    public final Object getDlIssueDate() {
        return this.dlIssueDate;
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final Object getDlIssuedesig() {
        return this.dlIssuedesig;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final String getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlLicno() {
        return this.dlLicno;
    }

    public final Object getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    public final Object getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    public final Object getDlPrintDate() {
        return this.dlPrintDate;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final Object getDlRemarks() {
        return this.dlRemarks;
    }

    public final String getDlRtoCode() {
        return this.dlRtoCode;
    }

    public final Object getDlSeqno() {
        return this.dlSeqno;
    }

    public final Object getDlStateCode() {
        return this.dlStateCode;
    }

    public final Object getDlStatus() {
        return this.dlStatus;
    }

    public final Object getDlTokenId() {
        return this.dlTokenId;
    }

    public final String getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    public final Object getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    public final String getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    public final String getDlUsid() {
        return this.dlUsid;
    }

    public final Object getDlolaCode() {
        return this.dlolaCode;
    }

    public final Object getEnforceEndDate() {
        return this.enforceEndDate;
    }

    public final Object getEnforceFromDate() {
        return this.enforceFromDate;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bioid.hashCode() * 31) + this.dlAuthCov.hashCode()) * 31) + this.dlAuthDt.hashCode()) * 31) + this.dlAuthIssauth.hashCode()) * 31) + this.dlAuthNo.hashCode()) * 31) + this.dlBioId.hashCode()) * 31) + this.dlDigest.hashCode()) * 31) + this.dlDispatchStatus.hashCode()) * 31) + this.dlEndorseAuth.hashCode()) * 31) + this.dlEndorsedt.hashCode()) * 31) + this.dlEndorseno.hashCode()) * 31) + this.dlEndorsetime.hashCode()) * 31) + this.dlHlValdfrDt.hashCode()) * 31) + this.dlHlValdtoDate.hashCode()) * 31) + this.dlHlValdtoDt.hashCode()) * 31) + this.dlHzValdfrDt.hashCode()) * 31) + this.dlHzValdtoDate.hashCode()) * 31) + this.dlHzValdtoDt.hashCode()) * 31) + this.dlInvcrgNo.hashCode()) * 31) + this.dlIssueDate.hashCode()) * 31) + this.dlIssueauth.hashCode()) * 31) + this.dlIssuedesig.hashCode()) * 31) + this.dlIssuedt.hashCode()) * 31) + this.dlLatestTrcode.hashCode()) * 31) + this.dlLicno.hashCode()) * 31) + this.dlNtValdfrDt.hashCode()) * 31) + this.dlNtValdtoDate.hashCode()) * 31) + this.dlNtValdtoDt.hashCode()) * 31) + this.dlOldLicno.hashCode()) * 31) + this.dlPrintDate.hashCode()) * 31) + this.dlPrintStatus.hashCode()) * 31) + this.dlRecGenesis.hashCode()) * 31) + this.dlRemarks.hashCode()) * 31) + this.dlRtoCode.hashCode()) * 31) + this.dlSeqno.hashCode()) * 31) + this.dlStateCode.hashCode()) * 31) + this.dlStatus.hashCode()) * 31) + this.dlTokenId.hashCode()) * 31) + this.dlTrValdfrDt.hashCode()) * 31) + this.dlTrValdtoDate.hashCode()) * 31) + this.dlTrValdtoDt.hashCode()) * 31) + this.dlUsid.hashCode()) * 31) + this.dlolaCode.hashCode()) * 31) + this.enforceEndDate.hashCode()) * 31) + this.enforceFromDate.hashCode()) * 31) + this.enforceRemark.hashCode()) * 31) + this.olaName.hashCode()) * 31) + this.olacode.hashCode()) * 31) + this.omOfficeTownname.hashCode()) * 31) + this.omRtoFullname.hashCode()) * 31) + this.omRtoShortname.hashCode()) * 31) + this.stateName.hashCode()) * 31) + this.statecd.hashCode();
    }

    public String toString() {
        return "Dlobj(bioid=" + this.bioid + ", dlAuthCov=" + this.dlAuthCov + ", dlAuthDt=" + this.dlAuthDt + ", dlAuthIssauth=" + this.dlAuthIssauth + ", dlAuthNo=" + this.dlAuthNo + ", dlBioId=" + this.dlBioId + ", dlDigest=" + this.dlDigest + ", dlDispatchStatus=" + this.dlDispatchStatus + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlEndorsedt=" + this.dlEndorsedt + ", dlEndorseno=" + this.dlEndorseno + ", dlEndorsetime=" + this.dlEndorsetime + ", dlHlValdfrDt=" + this.dlHlValdfrDt + ", dlHlValdtoDate=" + this.dlHlValdtoDate + ", dlHlValdtoDt=" + this.dlHlValdtoDt + ", dlHzValdfrDt=" + this.dlHzValdfrDt + ", dlHzValdtoDate=" + this.dlHzValdtoDate + ", dlHzValdtoDt=" + this.dlHzValdtoDt + ", dlInvcrgNo=" + this.dlInvcrgNo + ", dlIssueDate=" + this.dlIssueDate + ", dlIssueauth=" + this.dlIssueauth + ", dlIssuedesig=" + this.dlIssuedesig + ", dlIssuedt=" + this.dlIssuedt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlLicno=" + this.dlLicno + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlNtValdtoDate=" + this.dlNtValdtoDate + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", dlOldLicno=" + this.dlOldLicno + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlRecGenesis=" + this.dlRecGenesis + ", dlRemarks=" + this.dlRemarks + ", dlRtoCode=" + this.dlRtoCode + ", dlSeqno=" + this.dlSeqno + ", dlStateCode=" + this.dlStateCode + ", dlStatus=" + this.dlStatus + ", dlTokenId=" + this.dlTokenId + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlUsid=" + this.dlUsid + ", dlolaCode=" + this.dlolaCode + ", enforceEndDate=" + this.enforceEndDate + ", enforceFromDate=" + this.enforceFromDate + ", enforceRemark=" + this.enforceRemark + ", olaName=" + this.olaName + ", olacode=" + this.olacode + ", omOfficeTownname=" + this.omOfficeTownname + ", omRtoFullname=" + this.omRtoFullname + ", omRtoShortname=" + this.omRtoShortname + ", stateName=" + this.stateName + ", statecd=" + this.statecd + ')';
    }
}
