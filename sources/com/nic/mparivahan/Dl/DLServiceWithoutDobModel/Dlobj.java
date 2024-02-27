package com.nic.mparivahan.Dl.DLServiceWithoutDobModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Dlobj {
    private final String bioid;
    private final long dlApplno;
    private final Object dlAuthCov;
    private final Object dlAuthDt;
    private final Object dlAuthIssauth;
    private final Object dlAuthNo;
    private final Object dlBioId;
    private final Object dlDigest;
    private final Object dlDispatchStatus;
    private final String dlEndorseAuth;
    private final String dlEndorsedt;
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
    private final int dlLatestTrcode;
    private final String dlLicno;
    private final String dlNtValdfrDt;
    private final Object dlNtValdtoDate;
    private final String dlNtValdtoDt;
    private final String dlOldLicno;
    private final Object dlPrintDate;
    private final Object dlPrintStatus;
    private final String dlRecGenesis;
    private final Object dlRemarks;
    private final String dlRtoCode;
    private final Object dlSeqno;
    private final Object dlStateCode;
    private final String dlStatus;
    private final Object dlTokenId;
    private final Object dlTrValdfrDt;
    private final Object dlTrValdtoDate;
    private final Object dlTrValdtoDt;
    private final int dlUsid;
    private final Object dlbLastEndorseDt;
    private final Object dlbLastEndorseOffice;
    private final Object dlbLastEndorseState;
    private final Object dlolaCode;
    private final Object enforceEndDate;
    private final Object enforceFromDate;
    private final Object enforceRemark;
    private final String olaName;
    private final String olacode;
    private final String omOfficeTownname;
    private final String omRtoFullname;
    private final String omRtoShortname;
    private final Object stateName;
    private final String statecd;

    public Dlobj(String str, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str2, String str3, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, int i10, String str7, String str8, Object obj18, String str9, String str10, Object obj19, Object obj20, String str11, Object obj21, String str12, Object obj22, Object obj23, String str13, Object obj24, Object obj25, Object obj26, Object obj27, int i11, Object obj28, Object obj29, Object obj30, Object obj31, Object obj32, Object obj33, Object obj34, String str14, String str15, String str16, String str17, String str18, Object obj35, String str19) {
        String str20 = str;
        Object obj36 = obj;
        Object obj37 = obj2;
        Object obj38 = obj3;
        Object obj39 = obj4;
        Object obj40 = obj5;
        Object obj41 = obj6;
        Object obj42 = obj7;
        String str21 = str2;
        String str22 = str3;
        String str23 = str4;
        Object obj43 = obj8;
        Object obj44 = obj9;
        Object obj45 = obj12;
        l.f(str20, "bioid");
        l.f(obj36, "dlAuthCov");
        l.f(obj37, "dlAuthDt");
        l.f(obj38, "dlAuthIssauth");
        l.f(obj39, "dlAuthNo");
        l.f(obj40, "dlBioId");
        l.f(obj41, "dlDigest");
        l.f(obj42, "dlDispatchStatus");
        l.f(str21, "dlEndorseAuth");
        l.f(str22, "dlEndorsedt");
        l.f(str23, "dlEndorseno");
        l.f(obj43, "dlEndorsetime");
        l.f(obj44, "dlHlValdfrDt");
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
        l.f(str7, "dlLicno");
        l.f(str8, "dlNtValdfrDt");
        l.f(obj18, "dlNtValdtoDate");
        l.f(str9, "dlNtValdtoDt");
        l.f(obj19, "dlPrintDate");
        l.f(obj20, "dlPrintStatus");
        l.f(str11, "dlRecGenesis");
        l.f(obj21, "dlRemarks");
        l.f(str12, "dlRtoCode");
        l.f(obj22, "dlSeqno");
        l.f(obj23, "dlStateCode");
        l.f(str13, "dlStatus");
        l.f(obj24, "dlTokenId");
        l.f(obj25, "dlTrValdfrDt");
        l.f(obj26, "dlTrValdtoDate");
        l.f(obj27, "dlTrValdtoDt");
        l.f(obj28, "dlbLastEndorseDt");
        l.f(obj29, "dlbLastEndorseOffice");
        l.f(obj30, "dlbLastEndorseState");
        l.f(obj31, "dlolaCode");
        l.f(obj32, "enforceEndDate");
        l.f(obj33, "enforceFromDate");
        l.f(obj34, "enforceRemark");
        l.f(str15, "olacode");
        l.f(str16, "omOfficeTownname");
        l.f(obj35, "stateName");
        l.f(str19, "statecd");
        Object obj46 = obj12;
        this.bioid = str20;
        this.dlApplno = j10;
        this.dlAuthCov = obj36;
        this.dlAuthDt = obj37;
        this.dlAuthIssauth = obj38;
        this.dlAuthNo = obj39;
        this.dlBioId = obj40;
        this.dlDigest = obj41;
        this.dlDispatchStatus = obj42;
        this.dlEndorseAuth = str21;
        this.dlEndorsedt = str22;
        this.dlEndorseno = str23;
        this.dlEndorsetime = obj43;
        this.dlHlValdfrDt = obj44;
        this.dlHlValdtoDate = obj10;
        this.dlHlValdtoDt = obj11;
        this.dlHzValdfrDt = obj12;
        this.dlHzValdtoDate = obj13;
        this.dlHzValdtoDt = obj14;
        this.dlInvcrgNo = obj15;
        this.dlIssueDate = obj16;
        this.dlIssueauth = str5;
        this.dlIssuedesig = obj17;
        this.dlIssuedt = str6;
        this.dlLatestTrcode = i10;
        this.dlLicno = str7;
        this.dlNtValdfrDt = str8;
        this.dlNtValdtoDate = obj18;
        this.dlNtValdtoDt = str9;
        this.dlOldLicno = str10;
        this.dlPrintDate = obj19;
        this.dlPrintStatus = obj20;
        this.dlRecGenesis = str11;
        this.dlRemarks = obj21;
        this.dlRtoCode = str12;
        this.dlSeqno = obj22;
        this.dlStateCode = obj23;
        this.dlStatus = str13;
        this.dlTokenId = obj24;
        this.dlTrValdfrDt = obj25;
        this.dlTrValdtoDate = obj26;
        this.dlTrValdtoDt = obj27;
        this.dlUsid = i11;
        this.dlbLastEndorseDt = obj28;
        this.dlbLastEndorseOffice = obj29;
        this.dlbLastEndorseState = obj30;
        this.dlolaCode = obj31;
        this.enforceEndDate = obj32;
        this.enforceFromDate = obj33;
        this.enforceRemark = obj34;
        this.olaName = str14;
        this.olacode = str15;
        this.omOfficeTownname = str16;
        this.omRtoFullname = str17;
        this.omRtoShortname = str18;
        this.stateName = obj35;
        this.statecd = str19;
    }

    public static /* synthetic */ Dlobj copy$default(Dlobj dlobj, String str, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str2, String str3, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, int i10, String str7, String str8, Object obj18, String str9, String str10, Object obj19, Object obj20, String str11, Object obj21, String str12, Object obj22, Object obj23, String str13, Object obj24, Object obj25, Object obj26, Object obj27, int i11, Object obj28, Object obj29, Object obj30, Object obj31, Object obj32, Object obj33, Object obj34, String str14, String str15, String str16, String str17, String str18, Object obj35, String str19, int i12, int i13, Object obj36) {
        Dlobj dlobj2 = dlobj;
        int i14 = i12;
        int i15 = i13;
        return dlobj.copy((i14 & 1) != 0 ? dlobj2.bioid : str, (i14 & 2) != 0 ? dlobj2.dlApplno : j10, (i14 & 4) != 0 ? dlobj2.dlAuthCov : obj, (i14 & 8) != 0 ? dlobj2.dlAuthDt : obj2, (i14 & 16) != 0 ? dlobj2.dlAuthIssauth : obj3, (i14 & 32) != 0 ? dlobj2.dlAuthNo : obj4, (i14 & 64) != 0 ? dlobj2.dlBioId : obj5, (i14 & 128) != 0 ? dlobj2.dlDigest : obj6, (i14 & 256) != 0 ? dlobj2.dlDispatchStatus : obj7, (i14 & 512) != 0 ? dlobj2.dlEndorseAuth : str2, (i14 & 1024) != 0 ? dlobj2.dlEndorsedt : str3, (i14 & 2048) != 0 ? dlobj2.dlEndorseno : str4, (i14 & 4096) != 0 ? dlobj2.dlEndorsetime : obj8, (i14 & 8192) != 0 ? dlobj2.dlHlValdfrDt : obj9, (i14 & 16384) != 0 ? dlobj2.dlHlValdtoDate : obj10, (i14 & 32768) != 0 ? dlobj2.dlHlValdtoDt : obj11, (i14 & 65536) != 0 ? dlobj2.dlHzValdfrDt : obj12, (i14 & 131072) != 0 ? dlobj2.dlHzValdtoDate : obj13, (i14 & 262144) != 0 ? dlobj2.dlHzValdtoDt : obj14, (i14 & 524288) != 0 ? dlobj2.dlInvcrgNo : obj15, (i14 & 1048576) != 0 ? dlobj2.dlIssueDate : obj16, (i14 & 2097152) != 0 ? dlobj2.dlIssueauth : str5, (i14 & 4194304) != 0 ? dlobj2.dlIssuedesig : obj17, (i14 & 8388608) != 0 ? dlobj2.dlIssuedt : str6, (i14 & 16777216) != 0 ? dlobj2.dlLatestTrcode : i10, (i14 & 33554432) != 0 ? dlobj2.dlLicno : str7, (i14 & 67108864) != 0 ? dlobj2.dlNtValdfrDt : str8, (i14 & 134217728) != 0 ? dlobj2.dlNtValdtoDate : obj18, (i14 & 268435456) != 0 ? dlobj2.dlNtValdtoDt : str9, (i14 & 536870912) != 0 ? dlobj2.dlOldLicno : str10, (i14 & 1073741824) != 0 ? dlobj2.dlPrintDate : obj19, (i14 & Integer.MIN_VALUE) != 0 ? dlobj2.dlPrintStatus : obj20, (i15 & 1) != 0 ? dlobj2.dlRecGenesis : str11, (i15 & 2) != 0 ? dlobj2.dlRemarks : obj21, (i15 & 4) != 0 ? dlobj2.dlRtoCode : str12, (i15 & 8) != 0 ? dlobj2.dlSeqno : obj22, (i15 & 16) != 0 ? dlobj2.dlStateCode : obj23, (i15 & 32) != 0 ? dlobj2.dlStatus : str13, (i15 & 64) != 0 ? dlobj2.dlTokenId : obj24, (i15 & 128) != 0 ? dlobj2.dlTrValdfrDt : obj25, (i15 & 256) != 0 ? dlobj2.dlTrValdtoDate : obj26, (i15 & 512) != 0 ? dlobj2.dlTrValdtoDt : obj27, (i15 & 1024) != 0 ? dlobj2.dlUsid : i11, (i15 & 2048) != 0 ? dlobj2.dlbLastEndorseDt : obj28, (i15 & 4096) != 0 ? dlobj2.dlbLastEndorseOffice : obj29, (i15 & 8192) != 0 ? dlobj2.dlbLastEndorseState : obj30, (i15 & 16384) != 0 ? dlobj2.dlolaCode : obj31, (i15 & 32768) != 0 ? dlobj2.enforceEndDate : obj32, (i15 & 65536) != 0 ? dlobj2.enforceFromDate : obj33, (i15 & 131072) != 0 ? dlobj2.enforceRemark : obj34, (i15 & 262144) != 0 ? dlobj2.olaName : str14, (i15 & 524288) != 0 ? dlobj2.olacode : str15, (i15 & 1048576) != 0 ? dlobj2.omOfficeTownname : str16, (i15 & 2097152) != 0 ? dlobj2.omRtoFullname : str17, (i15 & 4194304) != 0 ? dlobj2.omRtoShortname : str18, (i15 & 8388608) != 0 ? dlobj2.stateName : obj35, (i15 & 16777216) != 0 ? dlobj2.statecd : str19);
    }

    public final String component1() {
        return this.bioid;
    }

    public final String component10() {
        return this.dlEndorseAuth;
    }

    public final String component11() {
        return this.dlEndorsedt;
    }

    public final String component12() {
        return this.dlEndorseno;
    }

    public final Object component13() {
        return this.dlEndorsetime;
    }

    public final Object component14() {
        return this.dlHlValdfrDt;
    }

    public final Object component15() {
        return this.dlHlValdtoDate;
    }

    public final Object component16() {
        return this.dlHlValdtoDt;
    }

    public final Object component17() {
        return this.dlHzValdfrDt;
    }

    public final Object component18() {
        return this.dlHzValdtoDate;
    }

    public final Object component19() {
        return this.dlHzValdtoDt;
    }

    public final long component2() {
        return this.dlApplno;
    }

    public final Object component20() {
        return this.dlInvcrgNo;
    }

    public final Object component21() {
        return this.dlIssueDate;
    }

    public final String component22() {
        return this.dlIssueauth;
    }

    public final Object component23() {
        return this.dlIssuedesig;
    }

    public final String component24() {
        return this.dlIssuedt;
    }

    public final int component25() {
        return this.dlLatestTrcode;
    }

    public final String component26() {
        return this.dlLicno;
    }

    public final String component27() {
        return this.dlNtValdfrDt;
    }

    public final Object component28() {
        return this.dlNtValdtoDate;
    }

    public final String component29() {
        return this.dlNtValdtoDt;
    }

    public final Object component3() {
        return this.dlAuthCov;
    }

    public final String component30() {
        return this.dlOldLicno;
    }

    public final Object component31() {
        return this.dlPrintDate;
    }

    public final Object component32() {
        return this.dlPrintStatus;
    }

    public final String component33() {
        return this.dlRecGenesis;
    }

    public final Object component34() {
        return this.dlRemarks;
    }

    public final String component35() {
        return this.dlRtoCode;
    }

    public final Object component36() {
        return this.dlSeqno;
    }

    public final Object component37() {
        return this.dlStateCode;
    }

    public final String component38() {
        return this.dlStatus;
    }

    public final Object component39() {
        return this.dlTokenId;
    }

    public final Object component4() {
        return this.dlAuthDt;
    }

    public final Object component40() {
        return this.dlTrValdfrDt;
    }

    public final Object component41() {
        return this.dlTrValdtoDate;
    }

    public final Object component42() {
        return this.dlTrValdtoDt;
    }

    public final int component43() {
        return this.dlUsid;
    }

    public final Object component44() {
        return this.dlbLastEndorseDt;
    }

    public final Object component45() {
        return this.dlbLastEndorseOffice;
    }

    public final Object component46() {
        return this.dlbLastEndorseState;
    }

    public final Object component47() {
        return this.dlolaCode;
    }

    public final Object component48() {
        return this.enforceEndDate;
    }

    public final Object component49() {
        return this.enforceFromDate;
    }

    public final Object component5() {
        return this.dlAuthIssauth;
    }

    public final Object component50() {
        return this.enforceRemark;
    }

    public final String component51() {
        return this.olaName;
    }

    public final String component52() {
        return this.olacode;
    }

    public final String component53() {
        return this.omOfficeTownname;
    }

    public final String component54() {
        return this.omRtoFullname;
    }

    public final String component55() {
        return this.omRtoShortname;
    }

    public final Object component56() {
        return this.stateName;
    }

    public final String component57() {
        return this.statecd;
    }

    public final Object component6() {
        return this.dlAuthNo;
    }

    public final Object component7() {
        return this.dlBioId;
    }

    public final Object component8() {
        return this.dlDigest;
    }

    public final Object component9() {
        return this.dlDispatchStatus;
    }

    public final Dlobj copy(String str, long j10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str2, String str3, String str4, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, String str5, Object obj17, String str6, int i10, String str7, String str8, Object obj18, String str9, String str10, Object obj19, Object obj20, String str11, Object obj21, String str12, Object obj22, Object obj23, String str13, Object obj24, Object obj25, Object obj26, Object obj27, int i11, Object obj28, Object obj29, Object obj30, Object obj31, Object obj32, Object obj33, Object obj34, String str14, String str15, String str16, String str17, String str18, Object obj35, String str19) {
        String str20 = str;
        l.f(str20, "bioid");
        l.f(obj, "dlAuthCov");
        l.f(obj2, "dlAuthDt");
        l.f(obj3, "dlAuthIssauth");
        l.f(obj4, "dlAuthNo");
        l.f(obj5, "dlBioId");
        l.f(obj6, "dlDigest");
        l.f(obj7, "dlDispatchStatus");
        l.f(str2, "dlEndorseAuth");
        l.f(str3, "dlEndorsedt");
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
        l.f(str7, "dlLicno");
        l.f(str8, "dlNtValdfrDt");
        l.f(obj18, "dlNtValdtoDate");
        l.f(str9, "dlNtValdtoDt");
        l.f(obj19, "dlPrintDate");
        l.f(obj20, "dlPrintStatus");
        l.f(str11, "dlRecGenesis");
        l.f(obj21, "dlRemarks");
        l.f(str12, "dlRtoCode");
        l.f(obj22, "dlSeqno");
        l.f(obj23, "dlStateCode");
        l.f(str13, "dlStatus");
        l.f(obj24, "dlTokenId");
        l.f(obj25, "dlTrValdfrDt");
        l.f(obj26, "dlTrValdtoDate");
        l.f(obj27, "dlTrValdtoDt");
        l.f(obj28, "dlbLastEndorseDt");
        l.f(obj29, "dlbLastEndorseOffice");
        l.f(obj30, "dlbLastEndorseState");
        l.f(obj31, "dlolaCode");
        l.f(obj32, "enforceEndDate");
        l.f(obj33, "enforceFromDate");
        l.f(obj34, "enforceRemark");
        l.f(str15, "olacode");
        l.f(str16, "omOfficeTownname");
        l.f(obj35, "stateName");
        l.f(str19, "statecd");
        return new Dlobj(str20, j10, obj, obj2, obj3, obj4, obj5, obj6, obj7, str2, str3, str4, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, str5, obj17, str6, i10, str7, str8, obj18, str9, str10, obj19, obj20, str11, obj21, str12, obj22, obj23, str13, obj24, obj25, obj26, obj27, i11, obj28, obj29, obj30, obj31, obj32, obj33, obj34, str14, str15, str16, str17, str18, obj35, str19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dlobj)) {
            return false;
        }
        Dlobj dlobj = (Dlobj) obj;
        return l.a(this.bioid, dlobj.bioid) && this.dlApplno == dlobj.dlApplno && l.a(this.dlAuthCov, dlobj.dlAuthCov) && l.a(this.dlAuthDt, dlobj.dlAuthDt) && l.a(this.dlAuthIssauth, dlobj.dlAuthIssauth) && l.a(this.dlAuthNo, dlobj.dlAuthNo) && l.a(this.dlBioId, dlobj.dlBioId) && l.a(this.dlDigest, dlobj.dlDigest) && l.a(this.dlDispatchStatus, dlobj.dlDispatchStatus) && l.a(this.dlEndorseAuth, dlobj.dlEndorseAuth) && l.a(this.dlEndorsedt, dlobj.dlEndorsedt) && l.a(this.dlEndorseno, dlobj.dlEndorseno) && l.a(this.dlEndorsetime, dlobj.dlEndorsetime) && l.a(this.dlHlValdfrDt, dlobj.dlHlValdfrDt) && l.a(this.dlHlValdtoDate, dlobj.dlHlValdtoDate) && l.a(this.dlHlValdtoDt, dlobj.dlHlValdtoDt) && l.a(this.dlHzValdfrDt, dlobj.dlHzValdfrDt) && l.a(this.dlHzValdtoDate, dlobj.dlHzValdtoDate) && l.a(this.dlHzValdtoDt, dlobj.dlHzValdtoDt) && l.a(this.dlInvcrgNo, dlobj.dlInvcrgNo) && l.a(this.dlIssueDate, dlobj.dlIssueDate) && l.a(this.dlIssueauth, dlobj.dlIssueauth) && l.a(this.dlIssuedesig, dlobj.dlIssuedesig) && l.a(this.dlIssuedt, dlobj.dlIssuedt) && this.dlLatestTrcode == dlobj.dlLatestTrcode && l.a(this.dlLicno, dlobj.dlLicno) && l.a(this.dlNtValdfrDt, dlobj.dlNtValdfrDt) && l.a(this.dlNtValdtoDate, dlobj.dlNtValdtoDate) && l.a(this.dlNtValdtoDt, dlobj.dlNtValdtoDt) && l.a(this.dlOldLicno, dlobj.dlOldLicno) && l.a(this.dlPrintDate, dlobj.dlPrintDate) && l.a(this.dlPrintStatus, dlobj.dlPrintStatus) && l.a(this.dlRecGenesis, dlobj.dlRecGenesis) && l.a(this.dlRemarks, dlobj.dlRemarks) && l.a(this.dlRtoCode, dlobj.dlRtoCode) && l.a(this.dlSeqno, dlobj.dlSeqno) && l.a(this.dlStateCode, dlobj.dlStateCode) && l.a(this.dlStatus, dlobj.dlStatus) && l.a(this.dlTokenId, dlobj.dlTokenId) && l.a(this.dlTrValdfrDt, dlobj.dlTrValdfrDt) && l.a(this.dlTrValdtoDate, dlobj.dlTrValdtoDate) && l.a(this.dlTrValdtoDt, dlobj.dlTrValdtoDt) && this.dlUsid == dlobj.dlUsid && l.a(this.dlbLastEndorseDt, dlobj.dlbLastEndorseDt) && l.a(this.dlbLastEndorseOffice, dlobj.dlbLastEndorseOffice) && l.a(this.dlbLastEndorseState, dlobj.dlbLastEndorseState) && l.a(this.dlolaCode, dlobj.dlolaCode) && l.a(this.enforceEndDate, dlobj.enforceEndDate) && l.a(this.enforceFromDate, dlobj.enforceFromDate) && l.a(this.enforceRemark, dlobj.enforceRemark) && l.a(this.olaName, dlobj.olaName) && l.a(this.olacode, dlobj.olacode) && l.a(this.omOfficeTownname, dlobj.omOfficeTownname) && l.a(this.omRtoFullname, dlobj.omRtoFullname) && l.a(this.omRtoShortname, dlobj.omRtoShortname) && l.a(this.stateName, dlobj.stateName) && l.a(this.statecd, dlobj.statecd);
    }

    public final String getBioid() {
        return this.bioid;
    }

    public final long getDlApplno() {
        return this.dlApplno;
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

    public final Object getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final String getDlEndorsedt() {
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

    public final int getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlLicno() {
        return this.dlLicno;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final Object getDlNtValdtoDate() {
        return this.dlNtValdtoDate;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlOldLicno() {
        return this.dlOldLicno;
    }

    public final Object getDlPrintDate() {
        return this.dlPrintDate;
    }

    public final Object getDlPrintStatus() {
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

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final Object getDlTokenId() {
        return this.dlTokenId;
    }

    public final Object getDlTrValdfrDt() {
        return this.dlTrValdfrDt;
    }

    public final Object getDlTrValdtoDate() {
        return this.dlTrValdtoDate;
    }

    public final Object getDlTrValdtoDt() {
        return this.dlTrValdtoDt;
    }

    public final int getDlUsid() {
        return this.dlUsid;
    }

    public final Object getDlbLastEndorseDt() {
        return this.dlbLastEndorseDt;
    }

    public final Object getDlbLastEndorseOffice() {
        return this.dlbLastEndorseOffice;
    }

    public final Object getDlbLastEndorseState() {
        return this.dlbLastEndorseState;
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

    public final Object getEnforceRemark() {
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

    public final Object getStateName() {
        return this.stateName;
    }

    public final String getStatecd() {
        return this.statecd;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bioid.hashCode() * 31) + Long.hashCode(this.dlApplno)) * 31) + this.dlAuthCov.hashCode()) * 31) + this.dlAuthDt.hashCode()) * 31) + this.dlAuthIssauth.hashCode()) * 31) + this.dlAuthNo.hashCode()) * 31) + this.dlBioId.hashCode()) * 31) + this.dlDigest.hashCode()) * 31) + this.dlDispatchStatus.hashCode()) * 31) + this.dlEndorseAuth.hashCode()) * 31) + this.dlEndorsedt.hashCode()) * 31) + this.dlEndorseno.hashCode()) * 31) + this.dlEndorsetime.hashCode()) * 31) + this.dlHlValdfrDt.hashCode()) * 31) + this.dlHlValdtoDate.hashCode()) * 31) + this.dlHlValdtoDt.hashCode()) * 31) + this.dlHzValdfrDt.hashCode()) * 31) + this.dlHzValdtoDate.hashCode()) * 31) + this.dlHzValdtoDt.hashCode()) * 31) + this.dlInvcrgNo.hashCode()) * 31) + this.dlIssueDate.hashCode()) * 31) + this.dlIssueauth.hashCode()) * 31) + this.dlIssuedesig.hashCode()) * 31) + this.dlIssuedt.hashCode()) * 31) + Integer.hashCode(this.dlLatestTrcode)) * 31) + this.dlLicno.hashCode()) * 31) + this.dlNtValdfrDt.hashCode()) * 31) + this.dlNtValdtoDate.hashCode()) * 31) + this.dlNtValdtoDt.hashCode()) * 31;
        String str = this.dlOldLicno;
        int i10 = 0;
        int hashCode2 = (((((((((((((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dlPrintDate.hashCode()) * 31) + this.dlPrintStatus.hashCode()) * 31) + this.dlRecGenesis.hashCode()) * 31) + this.dlRemarks.hashCode()) * 31) + this.dlRtoCode.hashCode()) * 31) + this.dlSeqno.hashCode()) * 31) + this.dlStateCode.hashCode()) * 31) + this.dlStatus.hashCode()) * 31) + this.dlTokenId.hashCode()) * 31) + this.dlTrValdfrDt.hashCode()) * 31) + this.dlTrValdtoDate.hashCode()) * 31) + this.dlTrValdtoDt.hashCode()) * 31) + Integer.hashCode(this.dlUsid)) * 31) + this.dlbLastEndorseDt.hashCode()) * 31) + this.dlbLastEndorseOffice.hashCode()) * 31) + this.dlbLastEndorseState.hashCode()) * 31) + this.dlolaCode.hashCode()) * 31) + this.enforceEndDate.hashCode()) * 31) + this.enforceFromDate.hashCode()) * 31) + this.enforceRemark.hashCode()) * 31;
        String str2 = this.olaName;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.olacode.hashCode()) * 31) + this.omOfficeTownname.hashCode()) * 31;
        String str3 = this.omRtoFullname;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.omRtoShortname;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return ((((hashCode4 + i10) * 31) + this.stateName.hashCode()) * 31) + this.statecd.hashCode();
    }

    public String toString() {
        return "Dlobj(bioid=" + this.bioid + ", dlApplno=" + this.dlApplno + ", dlAuthCov=" + this.dlAuthCov + ", dlAuthDt=" + this.dlAuthDt + ", dlAuthIssauth=" + this.dlAuthIssauth + ", dlAuthNo=" + this.dlAuthNo + ", dlBioId=" + this.dlBioId + ", dlDigest=" + this.dlDigest + ", dlDispatchStatus=" + this.dlDispatchStatus + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlEndorsedt=" + this.dlEndorsedt + ", dlEndorseno=" + this.dlEndorseno + ", dlEndorsetime=" + this.dlEndorsetime + ", dlHlValdfrDt=" + this.dlHlValdfrDt + ", dlHlValdtoDate=" + this.dlHlValdtoDate + ", dlHlValdtoDt=" + this.dlHlValdtoDt + ", dlHzValdfrDt=" + this.dlHzValdfrDt + ", dlHzValdtoDate=" + this.dlHzValdtoDate + ", dlHzValdtoDt=" + this.dlHzValdtoDt + ", dlInvcrgNo=" + this.dlInvcrgNo + ", dlIssueDate=" + this.dlIssueDate + ", dlIssueauth=" + this.dlIssueauth + ", dlIssuedesig=" + this.dlIssuedesig + ", dlIssuedt=" + this.dlIssuedt + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlLicno=" + this.dlLicno + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", dlNtValdtoDate=" + this.dlNtValdtoDate + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ", dlOldLicno=" + this.dlOldLicno + ", dlPrintDate=" + this.dlPrintDate + ", dlPrintStatus=" + this.dlPrintStatus + ", dlRecGenesis=" + this.dlRecGenesis + ", dlRemarks=" + this.dlRemarks + ", dlRtoCode=" + this.dlRtoCode + ", dlSeqno=" + this.dlSeqno + ", dlStateCode=" + this.dlStateCode + ", dlStatus=" + this.dlStatus + ", dlTokenId=" + this.dlTokenId + ", dlTrValdfrDt=" + this.dlTrValdfrDt + ", dlTrValdtoDate=" + this.dlTrValdtoDate + ", dlTrValdtoDt=" + this.dlTrValdtoDt + ", dlUsid=" + this.dlUsid + ", dlbLastEndorseDt=" + this.dlbLastEndorseDt + ", dlbLastEndorseOffice=" + this.dlbLastEndorseOffice + ", dlbLastEndorseState=" + this.dlbLastEndorseState + ", dlolaCode=" + this.dlolaCode + ", enforceEndDate=" + this.enforceEndDate + ", enforceFromDate=" + this.enforceFromDate + ", enforceRemark=" + this.enforceRemark + ", olaName=" + this.olaName + ", olacode=" + this.olacode + ", omOfficeTownname=" + this.omOfficeTownname + ", omRtoFullname=" + this.omRtoFullname + ", omRtoShortname=" + this.omRtoShortname + ", stateName=" + this.stateName + ", statecd=" + this.statecd + ')';
    }
}
