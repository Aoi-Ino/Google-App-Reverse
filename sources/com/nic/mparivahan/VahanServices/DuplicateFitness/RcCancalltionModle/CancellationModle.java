package com.nic.mparivahan.VahanServices.DuplicateFitness.RcCancalltionModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CancellationModle {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fcSnoval;
    private final String fcval;
    private final String fileRefNo;
    private final int offCd;
    private final String permitSnoval;
    private final String permitval;
    private final int purCd;
    private final String rcSnoval;
    private final String rcval;
    private final String reasonval;
    private final String regnNo;
    private final String relApprovedBy;
    private final String relFileRefNo;
    private final String releaseDt;
    private final String stateCd;
    private final String surrDt;
    private final String taxexemval;

    public CancellationModle(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.applNo = str;
        this.offCd = i10;
        this.purCd = i11;
        this.regnNo = str2;
        this.stateCd = str3;
        this.surrDt = str4;
        this.fileRefNo = str5;
        this.approvedBy = str6;
        this.reasonval = str7;
        this.rcval = str8;
        this.rcSnoval = str9;
        this.permitval = str10;
        this.permitSnoval = str11;
        this.fcval = str12;
        this.fcSnoval = str13;
        this.taxexemval = str14;
        this.releaseDt = str15;
        this.relFileRefNo = str16;
        this.relApprovedBy = str17;
        this.cancelDt = str18;
    }

    public static /* synthetic */ CancellationModle copy$default(CancellationModle cancellationModle, String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i12, Object obj) {
        CancellationModle cancellationModle2 = cancellationModle;
        int i13 = i12;
        return cancellationModle.copy((i13 & 1) != 0 ? cancellationModle2.applNo : str, (i13 & 2) != 0 ? cancellationModle2.offCd : i10, (i13 & 4) != 0 ? cancellationModle2.purCd : i11, (i13 & 8) != 0 ? cancellationModle2.regnNo : str2, (i13 & 16) != 0 ? cancellationModle2.stateCd : str3, (i13 & 32) != 0 ? cancellationModle2.surrDt : str4, (i13 & 64) != 0 ? cancellationModle2.fileRefNo : str5, (i13 & 128) != 0 ? cancellationModle2.approvedBy : str6, (i13 & 256) != 0 ? cancellationModle2.reasonval : str7, (i13 & 512) != 0 ? cancellationModle2.rcval : str8, (i13 & 1024) != 0 ? cancellationModle2.rcSnoval : str9, (i13 & 2048) != 0 ? cancellationModle2.permitval : str10, (i13 & 4096) != 0 ? cancellationModle2.permitSnoval : str11, (i13 & 8192) != 0 ? cancellationModle2.fcval : str12, (i13 & 16384) != 0 ? cancellationModle2.fcSnoval : str13, (i13 & 32768) != 0 ? cancellationModle2.taxexemval : str14, (i13 & 65536) != 0 ? cancellationModle2.releaseDt : str15, (i13 & 131072) != 0 ? cancellationModle2.relFileRefNo : str16, (i13 & 262144) != 0 ? cancellationModle2.relApprovedBy : str17, (i13 & 524288) != 0 ? cancellationModle2.cancelDt : str18);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.rcval;
    }

    public final String component11() {
        return this.rcSnoval;
    }

    public final String component12() {
        return this.permitval;
    }

    public final String component13() {
        return this.permitSnoval;
    }

    public final String component14() {
        return this.fcval;
    }

    public final String component15() {
        return this.fcSnoval;
    }

    public final String component16() {
        return this.taxexemval;
    }

    public final String component17() {
        return this.releaseDt;
    }

    public final String component18() {
        return this.relFileRefNo;
    }

    public final String component19() {
        return this.relApprovedBy;
    }

    public final int component2() {
        return this.offCd;
    }

    public final String component20() {
        return this.cancelDt;
    }

    public final int component3() {
        return this.purCd;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final String component5() {
        return this.stateCd;
    }

    public final String component6() {
        return this.surrDt;
    }

    public final String component7() {
        return this.fileRefNo;
    }

    public final String component8() {
        return this.approvedBy;
    }

    public final String component9() {
        return this.reasonval;
    }

    public final CancellationModle copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        return new CancellationModle(str, i10, i11, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellationModle)) {
            return false;
        }
        CancellationModle cancellationModle = (CancellationModle) obj;
        return l.a(this.applNo, cancellationModle.applNo) && this.offCd == cancellationModle.offCd && this.purCd == cancellationModle.purCd && l.a(this.regnNo, cancellationModle.regnNo) && l.a(this.stateCd, cancellationModle.stateCd) && l.a(this.surrDt, cancellationModle.surrDt) && l.a(this.fileRefNo, cancellationModle.fileRefNo) && l.a(this.approvedBy, cancellationModle.approvedBy) && l.a(this.reasonval, cancellationModle.reasonval) && l.a(this.rcval, cancellationModle.rcval) && l.a(this.rcSnoval, cancellationModle.rcSnoval) && l.a(this.permitval, cancellationModle.permitval) && l.a(this.permitSnoval, cancellationModle.permitSnoval) && l.a(this.fcval, cancellationModle.fcval) && l.a(this.fcSnoval, cancellationModle.fcSnoval) && l.a(this.taxexemval, cancellationModle.taxexemval) && l.a(this.releaseDt, cancellationModle.releaseDt) && l.a(this.relFileRefNo, cancellationModle.relFileRefNo) && l.a(this.relApprovedBy, cancellationModle.relApprovedBy) && l.a(this.cancelDt, cancellationModle.cancelDt);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getApprovedBy() {
        return this.approvedBy;
    }

    public final String getCancelDt() {
        return this.cancelDt;
    }

    public final String getFcSnoval() {
        return this.fcSnoval;
    }

    public final String getFcval() {
        return this.fcval;
    }

    public final String getFileRefNo() {
        return this.fileRefNo;
    }

    public final int getOffCd() {
        return this.offCd;
    }

    public final String getPermitSnoval() {
        return this.permitSnoval;
    }

    public final String getPermitval() {
        return this.permitval;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getRcSnoval() {
        return this.rcSnoval;
    }

    public final String getRcval() {
        return this.rcval;
    }

    public final String getReasonval() {
        return this.reasonval;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getRelApprovedBy() {
        return this.relApprovedBy;
    }

    public final String getRelFileRefNo() {
        return this.relFileRefNo;
    }

    public final String getReleaseDt() {
        return this.releaseDt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getSurrDt() {
        return this.surrDt;
    }

    public final String getTaxexemval() {
        return this.taxexemval;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.offCd)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.regnNo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCd;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.surrDt;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fileRefNo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.approvedBy;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reasonval;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rcval;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rcSnoval;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.permitval;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.permitSnoval;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fcval;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fcSnoval;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.taxexemval;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.releaseDt;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.relFileRefNo;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.relApprovedBy;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.cancelDt;
        if (str18 != null) {
            i10 = str18.hashCode();
        }
        return hashCode17 + i10;
    }

    public String toString() {
        return "CancellationModle(applNo=" + this.applNo + ", offCd=" + this.offCd + ", purCd=" + this.purCd + ", regnNo=" + this.regnNo + ", stateCd=" + this.stateCd + ", surrDt=" + this.surrDt + ", fileRefNo=" + this.fileRefNo + ", approvedBy=" + this.approvedBy + ", reasonval=" + this.reasonval + ", rcval=" + this.rcval + ", rcSnoval=" + this.rcSnoval + ", permitval=" + this.permitval + ", permitSnoval=" + this.permitSnoval + ", fcval=" + this.fcval + ", fcSnoval=" + this.fcSnoval + ", taxexemval=" + this.taxexemval + ", releaseDt=" + this.releaseDt + ", relFileRefNo=" + this.relFileRefNo + ", relApprovedBy=" + this.relApprovedBy + ", cancelDt=" + this.cancelDt + ')';
    }
}
