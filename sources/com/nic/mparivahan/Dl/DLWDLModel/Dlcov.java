package com.nic.mparivahan.Dl.DLWDLModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Dlcov {
    private final Object badgeIssuedAuth;
    private final Object badgeIssuedt;
    private final Object badgeNo;
    private final Object covIssueAuthCode;
    private final Object covIssuedt;
    private final String covabbrv;
    private final String covdesc;
    private final Object dbcImvDesig;
    private final Object dbcImvName;
    private final int dcApplno;
    private final Object dcAuthDt;
    private final Object dcAuthNo;
    private final String dcCovStatus;
    private final int dcCovcd;
    private final String dcEndorseNo;
    private final String dcEndorsedt;
    private final String dcEndorsetime;
    private final Object dcInvcrgNo;
    private final Object dcInvrgdesc;
    private final Object dcIssRtocode;
    private final String dcIssuedt;
    private final String dcLicno;
    private final Object dcReflicNo;
    private final Object dcReflicType;
    private final Object dcTokenId;
    private final Object dlBacklogCovEndtime;
    private final Object dlTestdate;
    private final int endouserid;
    private final String olaName;
    private final String olacd;
    private final Object veBadgeIssue;
    private final String veShortdesc;
    private final String vecatg;

    public Dlcov(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, int i10, Object obj8, Object obj9, String str3, int i11, String str4, String str5, String str6, Object obj10, Object obj11, Object obj12, String str7, String str8, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, int i12, String str9, String str10, Object obj18, String str11, String str12) {
        Object obj19 = obj;
        Object obj20 = obj2;
        Object obj21 = obj3;
        Object obj22 = obj4;
        Object obj23 = obj5;
        String str13 = str;
        String str14 = str2;
        Object obj24 = obj6;
        Object obj25 = obj7;
        Object obj26 = obj8;
        Object obj27 = obj9;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        Object obj28 = obj10;
        l.f(obj19, "badgeIssuedAuth");
        l.f(obj20, "badgeIssuedt");
        l.f(obj21, "badgeNo");
        l.f(obj22, "covIssueAuthCode");
        l.f(obj23, "covIssuedt");
        l.f(str13, "covabbrv");
        l.f(str14, "covdesc");
        l.f(obj24, "dbcImvDesig");
        l.f(obj25, "dbcImvName");
        l.f(obj26, "dcAuthDt");
        l.f(obj27, "dcAuthNo");
        l.f(str15, "dcCovStatus");
        l.f(str16, "dcEndorseNo");
        l.f(str17, "dcEndorsedt");
        l.f(str6, "dcEndorsetime");
        l.f(obj10, "dcInvcrgNo");
        l.f(obj11, "dcInvrgdesc");
        l.f(obj12, "dcIssRtocode");
        l.f(str7, "dcIssuedt");
        l.f(str8, "dcLicno");
        l.f(obj13, "dcReflicNo");
        l.f(obj14, "dcReflicType");
        l.f(obj15, "dcTokenId");
        l.f(obj16, "dlBacklogCovEndtime");
        l.f(obj17, "dlTestdate");
        l.f(str9, "olaName");
        l.f(str10, "olacd");
        l.f(obj18, "veBadgeIssue");
        l.f(str11, "veShortdesc");
        l.f(str12, "vecatg");
        this.badgeIssuedAuth = obj19;
        this.badgeIssuedt = obj20;
        this.badgeNo = obj21;
        this.covIssueAuthCode = obj22;
        this.covIssuedt = obj23;
        this.covabbrv = str13;
        this.covdesc = str14;
        this.dbcImvDesig = obj24;
        this.dbcImvName = obj25;
        this.dcApplno = i10;
        this.dcAuthDt = obj26;
        this.dcAuthNo = obj27;
        this.dcCovStatus = str15;
        this.dcCovcd = i11;
        this.dcEndorseNo = str16;
        this.dcEndorsedt = str17;
        this.dcEndorsetime = str6;
        this.dcInvcrgNo = obj10;
        this.dcInvrgdesc = obj11;
        this.dcIssRtocode = obj12;
        this.dcIssuedt = str7;
        this.dcLicno = str8;
        this.dcReflicNo = obj13;
        this.dcReflicType = obj14;
        this.dcTokenId = obj15;
        this.dlBacklogCovEndtime = obj16;
        this.dlTestdate = obj17;
        this.endouserid = i12;
        this.olaName = str9;
        this.olacd = str10;
        this.veBadgeIssue = obj18;
        this.veShortdesc = str11;
        this.vecatg = str12;
    }

    public static /* synthetic */ Dlcov copy$default(Dlcov dlcov, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, int i10, Object obj8, Object obj9, String str3, int i11, String str4, String str5, String str6, Object obj10, Object obj11, Object obj12, String str7, String str8, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, int i12, String str9, String str10, Object obj18, String str11, String str12, int i13, int i14, Object obj19) {
        Dlcov dlcov2 = dlcov;
        int i15 = i13;
        return dlcov.copy((i15 & 1) != 0 ? dlcov2.badgeIssuedAuth : obj, (i15 & 2) != 0 ? dlcov2.badgeIssuedt : obj2, (i15 & 4) != 0 ? dlcov2.badgeNo : obj3, (i15 & 8) != 0 ? dlcov2.covIssueAuthCode : obj4, (i15 & 16) != 0 ? dlcov2.covIssuedt : obj5, (i15 & 32) != 0 ? dlcov2.covabbrv : str, (i15 & 64) != 0 ? dlcov2.covdesc : str2, (i15 & 128) != 0 ? dlcov2.dbcImvDesig : obj6, (i15 & 256) != 0 ? dlcov2.dbcImvName : obj7, (i15 & 512) != 0 ? dlcov2.dcApplno : i10, (i15 & 1024) != 0 ? dlcov2.dcAuthDt : obj8, (i15 & 2048) != 0 ? dlcov2.dcAuthNo : obj9, (i15 & 4096) != 0 ? dlcov2.dcCovStatus : str3, (i15 & 8192) != 0 ? dlcov2.dcCovcd : i11, (i15 & 16384) != 0 ? dlcov2.dcEndorseNo : str4, (i15 & 32768) != 0 ? dlcov2.dcEndorsedt : str5, (i15 & 65536) != 0 ? dlcov2.dcEndorsetime : str6, (i15 & 131072) != 0 ? dlcov2.dcInvcrgNo : obj10, (i15 & 262144) != 0 ? dlcov2.dcInvrgdesc : obj11, (i15 & 524288) != 0 ? dlcov2.dcIssRtocode : obj12, (i15 & 1048576) != 0 ? dlcov2.dcIssuedt : str7, (i15 & 2097152) != 0 ? dlcov2.dcLicno : str8, (i15 & 4194304) != 0 ? dlcov2.dcReflicNo : obj13, (i15 & 8388608) != 0 ? dlcov2.dcReflicType : obj14, (i15 & 16777216) != 0 ? dlcov2.dcTokenId : obj15, (i15 & 33554432) != 0 ? dlcov2.dlBacklogCovEndtime : obj16, (i15 & 67108864) != 0 ? dlcov2.dlTestdate : obj17, (i15 & 134217728) != 0 ? dlcov2.endouserid : i12, (i15 & 268435456) != 0 ? dlcov2.olaName : str9, (i15 & 536870912) != 0 ? dlcov2.olacd : str10, (i15 & 1073741824) != 0 ? dlcov2.veBadgeIssue : obj18, (i15 & Integer.MIN_VALUE) != 0 ? dlcov2.veShortdesc : str11, (i14 & 1) != 0 ? dlcov2.vecatg : str12);
    }

    public final Object component1() {
        return this.badgeIssuedAuth;
    }

    public final int component10() {
        return this.dcApplno;
    }

    public final Object component11() {
        return this.dcAuthDt;
    }

    public final Object component12() {
        return this.dcAuthNo;
    }

    public final String component13() {
        return this.dcCovStatus;
    }

    public final int component14() {
        return this.dcCovcd;
    }

    public final String component15() {
        return this.dcEndorseNo;
    }

    public final String component16() {
        return this.dcEndorsedt;
    }

    public final String component17() {
        return this.dcEndorsetime;
    }

    public final Object component18() {
        return this.dcInvcrgNo;
    }

    public final Object component19() {
        return this.dcInvrgdesc;
    }

    public final Object component2() {
        return this.badgeIssuedt;
    }

    public final Object component20() {
        return this.dcIssRtocode;
    }

    public final String component21() {
        return this.dcIssuedt;
    }

    public final String component22() {
        return this.dcLicno;
    }

    public final Object component23() {
        return this.dcReflicNo;
    }

    public final Object component24() {
        return this.dcReflicType;
    }

    public final Object component25() {
        return this.dcTokenId;
    }

    public final Object component26() {
        return this.dlBacklogCovEndtime;
    }

    public final Object component27() {
        return this.dlTestdate;
    }

    public final int component28() {
        return this.endouserid;
    }

    public final String component29() {
        return this.olaName;
    }

    public final Object component3() {
        return this.badgeNo;
    }

    public final String component30() {
        return this.olacd;
    }

    public final Object component31() {
        return this.veBadgeIssue;
    }

    public final String component32() {
        return this.veShortdesc;
    }

    public final String component33() {
        return this.vecatg;
    }

    public final Object component4() {
        return this.covIssueAuthCode;
    }

    public final Object component5() {
        return this.covIssuedt;
    }

    public final String component6() {
        return this.covabbrv;
    }

    public final String component7() {
        return this.covdesc;
    }

    public final Object component8() {
        return this.dbcImvDesig;
    }

    public final Object component9() {
        return this.dbcImvName;
    }

    public final Dlcov copy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, int i10, Object obj8, Object obj9, String str3, int i11, String str4, String str5, String str6, Object obj10, Object obj11, Object obj12, String str7, String str8, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, int i12, String str9, String str10, Object obj18, String str11, String str12) {
        Object obj19 = obj;
        l.f(obj19, "badgeIssuedAuth");
        l.f(obj2, "badgeIssuedt");
        l.f(obj3, "badgeNo");
        l.f(obj4, "covIssueAuthCode");
        l.f(obj5, "covIssuedt");
        l.f(str, "covabbrv");
        l.f(str2, "covdesc");
        l.f(obj6, "dbcImvDesig");
        l.f(obj7, "dbcImvName");
        l.f(obj8, "dcAuthDt");
        l.f(obj9, "dcAuthNo");
        l.f(str3, "dcCovStatus");
        l.f(str4, "dcEndorseNo");
        l.f(str5, "dcEndorsedt");
        l.f(str6, "dcEndorsetime");
        l.f(obj10, "dcInvcrgNo");
        l.f(obj11, "dcInvrgdesc");
        l.f(obj12, "dcIssRtocode");
        l.f(str7, "dcIssuedt");
        l.f(str8, "dcLicno");
        l.f(obj13, "dcReflicNo");
        l.f(obj14, "dcReflicType");
        l.f(obj15, "dcTokenId");
        l.f(obj16, "dlBacklogCovEndtime");
        l.f(obj17, "dlTestdate");
        l.f(str9, "olaName");
        l.f(str10, "olacd");
        l.f(obj18, "veBadgeIssue");
        l.f(str11, "veShortdesc");
        l.f(str12, "vecatg");
        return new Dlcov(obj19, obj2, obj3, obj4, obj5, str, str2, obj6, obj7, i10, obj8, obj9, str3, i11, str4, str5, str6, obj10, obj11, obj12, str7, str8, obj13, obj14, obj15, obj16, obj17, i12, str9, str10, obj18, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dlcov)) {
            return false;
        }
        Dlcov dlcov = (Dlcov) obj;
        return l.a(this.badgeIssuedAuth, dlcov.badgeIssuedAuth) && l.a(this.badgeIssuedt, dlcov.badgeIssuedt) && l.a(this.badgeNo, dlcov.badgeNo) && l.a(this.covIssueAuthCode, dlcov.covIssueAuthCode) && l.a(this.covIssuedt, dlcov.covIssuedt) && l.a(this.covabbrv, dlcov.covabbrv) && l.a(this.covdesc, dlcov.covdesc) && l.a(this.dbcImvDesig, dlcov.dbcImvDesig) && l.a(this.dbcImvName, dlcov.dbcImvName) && this.dcApplno == dlcov.dcApplno && l.a(this.dcAuthDt, dlcov.dcAuthDt) && l.a(this.dcAuthNo, dlcov.dcAuthNo) && l.a(this.dcCovStatus, dlcov.dcCovStatus) && this.dcCovcd == dlcov.dcCovcd && l.a(this.dcEndorseNo, dlcov.dcEndorseNo) && l.a(this.dcEndorsedt, dlcov.dcEndorsedt) && l.a(this.dcEndorsetime, dlcov.dcEndorsetime) && l.a(this.dcInvcrgNo, dlcov.dcInvcrgNo) && l.a(this.dcInvrgdesc, dlcov.dcInvrgdesc) && l.a(this.dcIssRtocode, dlcov.dcIssRtocode) && l.a(this.dcIssuedt, dlcov.dcIssuedt) && l.a(this.dcLicno, dlcov.dcLicno) && l.a(this.dcReflicNo, dlcov.dcReflicNo) && l.a(this.dcReflicType, dlcov.dcReflicType) && l.a(this.dcTokenId, dlcov.dcTokenId) && l.a(this.dlBacklogCovEndtime, dlcov.dlBacklogCovEndtime) && l.a(this.dlTestdate, dlcov.dlTestdate) && this.endouserid == dlcov.endouserid && l.a(this.olaName, dlcov.olaName) && l.a(this.olacd, dlcov.olacd) && l.a(this.veBadgeIssue, dlcov.veBadgeIssue) && l.a(this.veShortdesc, dlcov.veShortdesc) && l.a(this.vecatg, dlcov.vecatg);
    }

    public final Object getBadgeIssuedAuth() {
        return this.badgeIssuedAuth;
    }

    public final Object getBadgeIssuedt() {
        return this.badgeIssuedt;
    }

    public final Object getBadgeNo() {
        return this.badgeNo;
    }

    public final Object getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    public final Object getCovIssuedt() {
        return this.covIssuedt;
    }

    public final String getCovabbrv() {
        return this.covabbrv;
    }

    public final String getCovdesc() {
        return this.covdesc;
    }

    public final Object getDbcImvDesig() {
        return this.dbcImvDesig;
    }

    public final Object getDbcImvName() {
        return this.dbcImvName;
    }

    public final int getDcApplno() {
        return this.dcApplno;
    }

    public final Object getDcAuthDt() {
        return this.dcAuthDt;
    }

    public final Object getDcAuthNo() {
        return this.dcAuthNo;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcEndorseNo() {
        return this.dcEndorseNo;
    }

    public final String getDcEndorsedt() {
        return this.dcEndorsedt;
    }

    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    public final Object getDcInvcrgNo() {
        return this.dcInvcrgNo;
    }

    public final Object getDcInvrgdesc() {
        return this.dcInvrgdesc;
    }

    public final Object getDcIssRtocode() {
        return this.dcIssRtocode;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getDcLicno() {
        return this.dcLicno;
    }

    public final Object getDcReflicNo() {
        return this.dcReflicNo;
    }

    public final Object getDcReflicType() {
        return this.dcReflicType;
    }

    public final Object getDcTokenId() {
        return this.dcTokenId;
    }

    public final Object getDlBacklogCovEndtime() {
        return this.dlBacklogCovEndtime;
    }

    public final Object getDlTestdate() {
        return this.dlTestdate;
    }

    public final int getEndouserid() {
        return this.endouserid;
    }

    public final String getOlaName() {
        return this.olaName;
    }

    public final String getOlacd() {
        return this.olacd;
    }

    public final Object getVeBadgeIssue() {
        return this.veBadgeIssue;
    }

    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.badgeIssuedAuth.hashCode() * 31) + this.badgeIssuedt.hashCode()) * 31) + this.badgeNo.hashCode()) * 31) + this.covIssueAuthCode.hashCode()) * 31) + this.covIssuedt.hashCode()) * 31) + this.covabbrv.hashCode()) * 31) + this.covdesc.hashCode()) * 31) + this.dbcImvDesig.hashCode()) * 31) + this.dbcImvName.hashCode()) * 31) + Integer.hashCode(this.dcApplno)) * 31) + this.dcAuthDt.hashCode()) * 31) + this.dcAuthNo.hashCode()) * 31) + this.dcCovStatus.hashCode()) * 31) + Integer.hashCode(this.dcCovcd)) * 31) + this.dcEndorseNo.hashCode()) * 31) + this.dcEndorsedt.hashCode()) * 31) + this.dcEndorsetime.hashCode()) * 31) + this.dcInvcrgNo.hashCode()) * 31) + this.dcInvrgdesc.hashCode()) * 31) + this.dcIssRtocode.hashCode()) * 31) + this.dcIssuedt.hashCode()) * 31) + this.dcLicno.hashCode()) * 31) + this.dcReflicNo.hashCode()) * 31) + this.dcReflicType.hashCode()) * 31) + this.dcTokenId.hashCode()) * 31) + this.dlBacklogCovEndtime.hashCode()) * 31) + this.dlTestdate.hashCode()) * 31) + Integer.hashCode(this.endouserid)) * 31) + this.olaName.hashCode()) * 31) + this.olacd.hashCode()) * 31) + this.veBadgeIssue.hashCode()) * 31) + this.veShortdesc.hashCode()) * 31) + this.vecatg.hashCode();
    }

    public String toString() {
        return "Dlcov(badgeIssuedAuth=" + this.badgeIssuedAuth + ", badgeIssuedt=" + this.badgeIssuedt + ", badgeNo=" + this.badgeNo + ", covIssueAuthCode=" + this.covIssueAuthCode + ", covIssuedt=" + this.covIssuedt + ", covabbrv=" + this.covabbrv + ", covdesc=" + this.covdesc + ", dbcImvDesig=" + this.dbcImvDesig + ", dbcImvName=" + this.dbcImvName + ", dcApplno=" + this.dcApplno + ", dcAuthDt=" + this.dcAuthDt + ", dcAuthNo=" + this.dcAuthNo + ", dcCovStatus=" + this.dcCovStatus + ", dcCovcd=" + this.dcCovcd + ", dcEndorseNo=" + this.dcEndorseNo + ", dcEndorsedt=" + this.dcEndorsedt + ", dcEndorsetime=" + this.dcEndorsetime + ", dcInvcrgNo=" + this.dcInvcrgNo + ", dcInvrgdesc=" + this.dcInvrgdesc + ", dcIssRtocode=" + this.dcIssRtocode + ", dcIssuedt=" + this.dcIssuedt + ", dcLicno=" + this.dcLicno + ", dcReflicNo=" + this.dcReflicNo + ", dcReflicType=" + this.dcReflicType + ", dcTokenId=" + this.dcTokenId + ", dlBacklogCovEndtime=" + this.dlBacklogCovEndtime + ", dlTestdate=" + this.dlTestdate + ", endouserid=" + this.endouserid + ", olaName=" + this.olaName + ", olacd=" + this.olacd + ", veBadgeIssue=" + this.veBadgeIssue + ", veShortdesc=" + this.veShortdesc + ", vecatg=" + this.vecatg + ')';
    }
}
