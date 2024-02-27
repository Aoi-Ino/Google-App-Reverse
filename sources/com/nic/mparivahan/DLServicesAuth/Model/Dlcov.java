package com.nic.mparivahan.DLServicesAuth.Model;

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
    private final String dcApplno;
    private final Object dcAuthDt;
    private final Object dcAuthNo;
    private final String dcCovStatus;
    private final int dcCovcd;
    private final Object dcEndorseNo;
    private final Object dcEndorsedt;
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

    public Dlcov(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, String str3, Object obj8, Object obj9, String str4, int i10, Object obj10, Object obj11, String str5, Object obj12, Object obj13, Object obj14, String str6, String str7, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, int i11, String str8, String str9, Object obj20, String str10, String str11) {
        Object obj21 = obj;
        Object obj22 = obj2;
        Object obj23 = obj3;
        Object obj24 = obj4;
        Object obj25 = obj5;
        String str12 = str;
        String str13 = str2;
        Object obj26 = obj6;
        Object obj27 = obj7;
        String str14 = str3;
        Object obj28 = obj8;
        Object obj29 = obj9;
        String str15 = str4;
        Object obj30 = obj10;
        String str16 = str5;
        l.f(obj21, "badgeIssuedAuth");
        l.f(obj22, "badgeIssuedt");
        l.f(obj23, "badgeNo");
        l.f(obj24, "covIssueAuthCode");
        l.f(obj25, "covIssuedt");
        l.f(str12, "covabbrv");
        l.f(str13, "covdesc");
        l.f(obj26, "dbcImvDesig");
        l.f(obj27, "dbcImvName");
        l.f(str14, "dcApplno");
        l.f(obj28, "dcAuthDt");
        l.f(obj29, "dcAuthNo");
        l.f(str15, "dcCovStatus");
        l.f(obj30, "dcEndorseNo");
        l.f(obj11, "dcEndorsedt");
        l.f(str5, "dcEndorsetime");
        l.f(obj12, "dcInvcrgNo");
        l.f(obj13, "dcInvrgdesc");
        l.f(obj14, "dcIssRtocode");
        l.f(str6, "dcIssuedt");
        l.f(str7, "dcLicno");
        l.f(obj15, "dcReflicNo");
        l.f(obj16, "dcReflicType");
        l.f(obj17, "dcTokenId");
        l.f(obj18, "dlBacklogCovEndtime");
        l.f(obj19, "dlTestdate");
        l.f(str8, "olaName");
        l.f(str9, "olacd");
        l.f(obj20, "veBadgeIssue");
        l.f(str10, "veShortdesc");
        l.f(str11, "vecatg");
        this.badgeIssuedAuth = obj21;
        this.badgeIssuedt = obj22;
        this.badgeNo = obj23;
        this.covIssueAuthCode = obj24;
        this.covIssuedt = obj25;
        this.covabbrv = str12;
        this.covdesc = str13;
        this.dbcImvDesig = obj26;
        this.dbcImvName = obj27;
        this.dcApplno = str14;
        this.dcAuthDt = obj28;
        this.dcAuthNo = obj29;
        this.dcCovStatus = str15;
        this.dcCovcd = i10;
        this.dcEndorseNo = obj30;
        this.dcEndorsedt = obj11;
        this.dcEndorsetime = str5;
        this.dcInvcrgNo = obj12;
        this.dcInvrgdesc = obj13;
        this.dcIssRtocode = obj14;
        this.dcIssuedt = str6;
        this.dcLicno = str7;
        this.dcReflicNo = obj15;
        this.dcReflicType = obj16;
        this.dcTokenId = obj17;
        this.dlBacklogCovEndtime = obj18;
        this.dlTestdate = obj19;
        this.endouserid = i11;
        this.olaName = str8;
        this.olacd = str9;
        this.veBadgeIssue = obj20;
        this.veShortdesc = str10;
        this.vecatg = str11;
    }

    public static /* synthetic */ Dlcov copy$default(Dlcov dlcov, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, String str3, Object obj8, Object obj9, String str4, int i10, Object obj10, Object obj11, String str5, Object obj12, Object obj13, Object obj14, String str6, String str7, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, int i11, String str8, String str9, Object obj20, String str10, String str11, int i12, int i13, Object obj21) {
        Dlcov dlcov2 = dlcov;
        int i14 = i12;
        return dlcov.copy((i14 & 1) != 0 ? dlcov2.badgeIssuedAuth : obj, (i14 & 2) != 0 ? dlcov2.badgeIssuedt : obj2, (i14 & 4) != 0 ? dlcov2.badgeNo : obj3, (i14 & 8) != 0 ? dlcov2.covIssueAuthCode : obj4, (i14 & 16) != 0 ? dlcov2.covIssuedt : obj5, (i14 & 32) != 0 ? dlcov2.covabbrv : str, (i14 & 64) != 0 ? dlcov2.covdesc : str2, (i14 & 128) != 0 ? dlcov2.dbcImvDesig : obj6, (i14 & 256) != 0 ? dlcov2.dbcImvName : obj7, (i14 & 512) != 0 ? dlcov2.dcApplno : str3, (i14 & 1024) != 0 ? dlcov2.dcAuthDt : obj8, (i14 & 2048) != 0 ? dlcov2.dcAuthNo : obj9, (i14 & 4096) != 0 ? dlcov2.dcCovStatus : str4, (i14 & 8192) != 0 ? dlcov2.dcCovcd : i10, (i14 & 16384) != 0 ? dlcov2.dcEndorseNo : obj10, (i14 & 32768) != 0 ? dlcov2.dcEndorsedt : obj11, (i14 & 65536) != 0 ? dlcov2.dcEndorsetime : str5, (i14 & 131072) != 0 ? dlcov2.dcInvcrgNo : obj12, (i14 & 262144) != 0 ? dlcov2.dcInvrgdesc : obj13, (i14 & 524288) != 0 ? dlcov2.dcIssRtocode : obj14, (i14 & 1048576) != 0 ? dlcov2.dcIssuedt : str6, (i14 & 2097152) != 0 ? dlcov2.dcLicno : str7, (i14 & 4194304) != 0 ? dlcov2.dcReflicNo : obj15, (i14 & 8388608) != 0 ? dlcov2.dcReflicType : obj16, (i14 & 16777216) != 0 ? dlcov2.dcTokenId : obj17, (i14 & 33554432) != 0 ? dlcov2.dlBacklogCovEndtime : obj18, (i14 & 67108864) != 0 ? dlcov2.dlTestdate : obj19, (i14 & 134217728) != 0 ? dlcov2.endouserid : i11, (i14 & 268435456) != 0 ? dlcov2.olaName : str8, (i14 & 536870912) != 0 ? dlcov2.olacd : str9, (i14 & 1073741824) != 0 ? dlcov2.veBadgeIssue : obj20, (i14 & Integer.MIN_VALUE) != 0 ? dlcov2.veShortdesc : str10, (i13 & 1) != 0 ? dlcov2.vecatg : str11);
    }

    public final Object component1() {
        return this.badgeIssuedAuth;
    }

    public final String component10() {
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

    public final Object component15() {
        return this.dcEndorseNo;
    }

    public final Object component16() {
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

    public final Dlcov copy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, Object obj6, Object obj7, String str3, Object obj8, Object obj9, String str4, int i10, Object obj10, Object obj11, String str5, Object obj12, Object obj13, Object obj14, String str6, String str7, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, int i11, String str8, String str9, Object obj20, String str10, String str11) {
        Object obj21 = obj;
        l.f(obj21, "badgeIssuedAuth");
        l.f(obj2, "badgeIssuedt");
        l.f(obj3, "badgeNo");
        l.f(obj4, "covIssueAuthCode");
        l.f(obj5, "covIssuedt");
        l.f(str, "covabbrv");
        l.f(str2, "covdesc");
        l.f(obj6, "dbcImvDesig");
        l.f(obj7, "dbcImvName");
        l.f(str3, "dcApplno");
        l.f(obj8, "dcAuthDt");
        l.f(obj9, "dcAuthNo");
        l.f(str4, "dcCovStatus");
        l.f(obj10, "dcEndorseNo");
        l.f(obj11, "dcEndorsedt");
        l.f(str5, "dcEndorsetime");
        l.f(obj12, "dcInvcrgNo");
        l.f(obj13, "dcInvrgdesc");
        l.f(obj14, "dcIssRtocode");
        l.f(str6, "dcIssuedt");
        l.f(str7, "dcLicno");
        l.f(obj15, "dcReflicNo");
        l.f(obj16, "dcReflicType");
        l.f(obj17, "dcTokenId");
        l.f(obj18, "dlBacklogCovEndtime");
        l.f(obj19, "dlTestdate");
        l.f(str8, "olaName");
        l.f(str9, "olacd");
        l.f(obj20, "veBadgeIssue");
        l.f(str10, "veShortdesc");
        l.f(str11, "vecatg");
        return new Dlcov(obj21, obj2, obj3, obj4, obj5, str, str2, obj6, obj7, str3, obj8, obj9, str4, i10, obj10, obj11, str5, obj12, obj13, obj14, str6, str7, obj15, obj16, obj17, obj18, obj19, i11, str8, str9, obj20, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dlcov)) {
            return false;
        }
        Dlcov dlcov = (Dlcov) obj;
        return l.a(this.badgeIssuedAuth, dlcov.badgeIssuedAuth) && l.a(this.badgeIssuedt, dlcov.badgeIssuedt) && l.a(this.badgeNo, dlcov.badgeNo) && l.a(this.covIssueAuthCode, dlcov.covIssueAuthCode) && l.a(this.covIssuedt, dlcov.covIssuedt) && l.a(this.covabbrv, dlcov.covabbrv) && l.a(this.covdesc, dlcov.covdesc) && l.a(this.dbcImvDesig, dlcov.dbcImvDesig) && l.a(this.dbcImvName, dlcov.dbcImvName) && l.a(this.dcApplno, dlcov.dcApplno) && l.a(this.dcAuthDt, dlcov.dcAuthDt) && l.a(this.dcAuthNo, dlcov.dcAuthNo) && l.a(this.dcCovStatus, dlcov.dcCovStatus) && this.dcCovcd == dlcov.dcCovcd && l.a(this.dcEndorseNo, dlcov.dcEndorseNo) && l.a(this.dcEndorsedt, dlcov.dcEndorsedt) && l.a(this.dcEndorsetime, dlcov.dcEndorsetime) && l.a(this.dcInvcrgNo, dlcov.dcInvcrgNo) && l.a(this.dcInvrgdesc, dlcov.dcInvrgdesc) && l.a(this.dcIssRtocode, dlcov.dcIssRtocode) && l.a(this.dcIssuedt, dlcov.dcIssuedt) && l.a(this.dcLicno, dlcov.dcLicno) && l.a(this.dcReflicNo, dlcov.dcReflicNo) && l.a(this.dcReflicType, dlcov.dcReflicType) && l.a(this.dcTokenId, dlcov.dcTokenId) && l.a(this.dlBacklogCovEndtime, dlcov.dlBacklogCovEndtime) && l.a(this.dlTestdate, dlcov.dlTestdate) && this.endouserid == dlcov.endouserid && l.a(this.olaName, dlcov.olaName) && l.a(this.olacd, dlcov.olacd) && l.a(this.veBadgeIssue, dlcov.veBadgeIssue) && l.a(this.veShortdesc, dlcov.veShortdesc) && l.a(this.vecatg, dlcov.vecatg);
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

    public final String getDcApplno() {
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

    public final Object getDcEndorseNo() {
        return this.dcEndorseNo;
    }

    public final Object getDcEndorsedt() {
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.badgeIssuedAuth.hashCode() * 31) + this.badgeIssuedt.hashCode()) * 31) + this.badgeNo.hashCode()) * 31) + this.covIssueAuthCode.hashCode()) * 31) + this.covIssuedt.hashCode()) * 31) + this.covabbrv.hashCode()) * 31) + this.covdesc.hashCode()) * 31) + this.dbcImvDesig.hashCode()) * 31) + this.dbcImvName.hashCode()) * 31) + this.dcApplno.hashCode()) * 31) + this.dcAuthDt.hashCode()) * 31) + this.dcAuthNo.hashCode()) * 31) + this.dcCovStatus.hashCode()) * 31) + Integer.hashCode(this.dcCovcd)) * 31) + this.dcEndorseNo.hashCode()) * 31) + this.dcEndorsedt.hashCode()) * 31) + this.dcEndorsetime.hashCode()) * 31) + this.dcInvcrgNo.hashCode()) * 31) + this.dcInvrgdesc.hashCode()) * 31) + this.dcIssRtocode.hashCode()) * 31) + this.dcIssuedt.hashCode()) * 31) + this.dcLicno.hashCode()) * 31) + this.dcReflicNo.hashCode()) * 31) + this.dcReflicType.hashCode()) * 31) + this.dcTokenId.hashCode()) * 31) + this.dlBacklogCovEndtime.hashCode()) * 31) + this.dlTestdate.hashCode()) * 31) + Integer.hashCode(this.endouserid)) * 31) + this.olaName.hashCode()) * 31) + this.olacd.hashCode()) * 31) + this.veBadgeIssue.hashCode()) * 31) + this.veShortdesc.hashCode()) * 31) + this.vecatg.hashCode();
    }

    public String toString() {
        return "Dlcov(badgeIssuedAuth=" + this.badgeIssuedAuth + ", badgeIssuedt=" + this.badgeIssuedt + ", badgeNo=" + this.badgeNo + ", covIssueAuthCode=" + this.covIssueAuthCode + ", covIssuedt=" + this.covIssuedt + ", covabbrv=" + this.covabbrv + ", covdesc=" + this.covdesc + ", dbcImvDesig=" + this.dbcImvDesig + ", dbcImvName=" + this.dbcImvName + ", dcApplno=" + this.dcApplno + ", dcAuthDt=" + this.dcAuthDt + ", dcAuthNo=" + this.dcAuthNo + ", dcCovStatus=" + this.dcCovStatus + ", dcCovcd=" + this.dcCovcd + ", dcEndorseNo=" + this.dcEndorseNo + ", dcEndorsedt=" + this.dcEndorsedt + ", dcEndorsetime=" + this.dcEndorsetime + ", dcInvcrgNo=" + this.dcInvcrgNo + ", dcInvrgdesc=" + this.dcInvrgdesc + ", dcIssRtocode=" + this.dcIssRtocode + ", dcIssuedt=" + this.dcIssuedt + ", dcLicno=" + this.dcLicno + ", dcReflicNo=" + this.dcReflicNo + ", dcReflicType=" + this.dcReflicType + ", dcTokenId=" + this.dcTokenId + ", dlBacklogCovEndtime=" + this.dlBacklogCovEndtime + ", dlTestdate=" + this.dlTestdate + ", endouserid=" + this.endouserid + ", olaName=" + this.olaName + ", olacd=" + this.olacd + ", veBadgeIssue=" + this.veBadgeIssue + ", veShortdesc=" + this.veShortdesc + ", vecatg=" + this.vecatg + ')';
    }
}
