package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Dlcov implements Serializable {
    private final String covIssueAuthCode;
    private final String covabbrv;
    private final String covdesc;
    private final String dcApplno;
    private final String dcCovStatus;
    private final int dcCovcd;
    private final String dcEndorsetime;
    private final String dcIssuedt;
    private final String dcLicno;
    private final int endouserid;
    private final String olaName;
    private final String olacd;
    private final String veShortdesc;
    private final String vecatg;

    public Dlcov(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12) {
        l.f(str, "covIssueAuthCode");
        l.f(str2, "covabbrv");
        l.f(str3, "covdesc");
        l.f(str4, "dcApplno");
        l.f(str5, "dcCovStatus");
        l.f(str6, "dcEndorsetime");
        l.f(str7, "dcIssuedt");
        l.f(str8, "dcLicno");
        l.f(str9, "olaName");
        l.f(str10, "olacd");
        l.f(str11, "veShortdesc");
        l.f(str12, "vecatg");
        this.covIssueAuthCode = str;
        this.covabbrv = str2;
        this.covdesc = str3;
        this.dcApplno = str4;
        this.dcCovStatus = str5;
        this.dcCovcd = i10;
        this.dcEndorsetime = str6;
        this.dcIssuedt = str7;
        this.dcLicno = str8;
        this.endouserid = i11;
        this.olaName = str9;
        this.olacd = str10;
        this.veShortdesc = str11;
        this.vecatg = str12;
    }

    public static /* synthetic */ Dlcov copy$default(Dlcov dlcov, String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12, int i12, Object obj) {
        Dlcov dlcov2 = dlcov;
        int i13 = i12;
        return dlcov.copy((i13 & 1) != 0 ? dlcov2.covIssueAuthCode : str, (i13 & 2) != 0 ? dlcov2.covabbrv : str2, (i13 & 4) != 0 ? dlcov2.covdesc : str3, (i13 & 8) != 0 ? dlcov2.dcApplno : str4, (i13 & 16) != 0 ? dlcov2.dcCovStatus : str5, (i13 & 32) != 0 ? dlcov2.dcCovcd : i10, (i13 & 64) != 0 ? dlcov2.dcEndorsetime : str6, (i13 & 128) != 0 ? dlcov2.dcIssuedt : str7, (i13 & 256) != 0 ? dlcov2.dcLicno : str8, (i13 & 512) != 0 ? dlcov2.endouserid : i11, (i13 & 1024) != 0 ? dlcov2.olaName : str9, (i13 & 2048) != 0 ? dlcov2.olacd : str10, (i13 & 4096) != 0 ? dlcov2.veShortdesc : str11, (i13 & 8192) != 0 ? dlcov2.vecatg : str12);
    }

    public final String component1() {
        return this.covIssueAuthCode;
    }

    public final int component10() {
        return this.endouserid;
    }

    public final String component11() {
        return this.olaName;
    }

    public final String component12() {
        return this.olacd;
    }

    public final String component13() {
        return this.veShortdesc;
    }

    public final String component14() {
        return this.vecatg;
    }

    public final String component2() {
        return this.covabbrv;
    }

    public final String component3() {
        return this.covdesc;
    }

    public final String component4() {
        return this.dcApplno;
    }

    public final String component5() {
        return this.dcCovStatus;
    }

    public final int component6() {
        return this.dcCovcd;
    }

    public final String component7() {
        return this.dcEndorsetime;
    }

    public final String component8() {
        return this.dcIssuedt;
    }

    public final String component9() {
        return this.dcLicno;
    }

    public final Dlcov copy(String str, String str2, String str3, String str4, String str5, int i10, String str6, String str7, String str8, int i11, String str9, String str10, String str11, String str12) {
        String str13 = str;
        l.f(str13, "covIssueAuthCode");
        String str14 = str2;
        l.f(str14, "covabbrv");
        String str15 = str3;
        l.f(str15, "covdesc");
        String str16 = str4;
        l.f(str16, "dcApplno");
        String str17 = str5;
        l.f(str17, "dcCovStatus");
        String str18 = str6;
        l.f(str18, "dcEndorsetime");
        String str19 = str7;
        l.f(str19, "dcIssuedt");
        String str20 = str8;
        l.f(str20, "dcLicno");
        String str21 = str9;
        l.f(str21, "olaName");
        String str22 = str10;
        l.f(str22, "olacd");
        String str23 = str11;
        l.f(str23, "veShortdesc");
        String str24 = str12;
        l.f(str24, "vecatg");
        return new Dlcov(str13, str14, str15, str16, str17, i10, str18, str19, str20, i11, str21, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dlcov)) {
            return false;
        }
        Dlcov dlcov = (Dlcov) obj;
        return l.a(this.covIssueAuthCode, dlcov.covIssueAuthCode) && l.a(this.covabbrv, dlcov.covabbrv) && l.a(this.covdesc, dlcov.covdesc) && l.a(this.dcApplno, dlcov.dcApplno) && l.a(this.dcCovStatus, dlcov.dcCovStatus) && this.dcCovcd == dlcov.dcCovcd && l.a(this.dcEndorsetime, dlcov.dcEndorsetime) && l.a(this.dcIssuedt, dlcov.dcIssuedt) && l.a(this.dcLicno, dlcov.dcLicno) && this.endouserid == dlcov.endouserid && l.a(this.olaName, dlcov.olaName) && l.a(this.olacd, dlcov.olacd) && l.a(this.veShortdesc, dlcov.veShortdesc) && l.a(this.vecatg, dlcov.vecatg);
    }

    public final String getCovIssueAuthCode() {
        return this.covIssueAuthCode;
    }

    public final String getCovabbrv() {
        return this.covabbrv;
    }

    public final String getCovdesc() {
        return this.covdesc;
    }

    public final String getDcApplno() {
        return this.dcApplno;
    }

    public final String getDcCovStatus() {
        return this.dcCovStatus;
    }

    public final int getDcCovcd() {
        return this.dcCovcd;
    }

    public final String getDcEndorsetime() {
        return this.dcEndorsetime;
    }

    public final String getDcIssuedt() {
        return this.dcIssuedt;
    }

    public final String getDcLicno() {
        return this.dcLicno;
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

    public final String getVeShortdesc() {
        return this.veShortdesc;
    }

    public final String getVecatg() {
        return this.vecatg;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.covIssueAuthCode.hashCode() * 31) + this.covabbrv.hashCode()) * 31) + this.covdesc.hashCode()) * 31) + this.dcApplno.hashCode()) * 31) + this.dcCovStatus.hashCode()) * 31) + Integer.hashCode(this.dcCovcd)) * 31) + this.dcEndorsetime.hashCode()) * 31) + this.dcIssuedt.hashCode()) * 31) + this.dcLicno.hashCode()) * 31) + Integer.hashCode(this.endouserid)) * 31) + this.olaName.hashCode()) * 31) + this.olacd.hashCode()) * 31) + this.veShortdesc.hashCode()) * 31) + this.vecatg.hashCode();
    }

    public String toString() {
        return "Dlcov(covIssueAuthCode=" + this.covIssueAuthCode + ", covabbrv=" + this.covabbrv + ", covdesc=" + this.covdesc + ", dcApplno=" + this.dcApplno + ", dcCovStatus=" + this.dcCovStatus + ", dcCovcd=" + this.dcCovcd + ", dcEndorsetime=" + this.dcEndorsetime + ", dcIssuedt=" + this.dcIssuedt + ", dcLicno=" + this.dcLicno + ", endouserid=" + this.endouserid + ", olaName=" + this.olaName + ", olacd=" + this.olacd + ", veShortdesc=" + this.veShortdesc + ", vecatg=" + this.vecatg + ')';
    }
}
