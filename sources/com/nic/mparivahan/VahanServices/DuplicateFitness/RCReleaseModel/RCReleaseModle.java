package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
public final class RCReleaseModle implements Serializable {
    private final String applNo;
    private final String approvedBy;
    private final String cancelDt;
    private final String fcSnoval;
    private final String fcval;
    private final String fileRefNo;
    private final Integer offCd;
    private final String permitSnoval;
    private final String permitval;
    private final String purCd;
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

    public RCReleaseModle(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.applNo = str;
        this.approvedBy = str2;
        this.cancelDt = str3;
        this.fcSnoval = str4;
        this.fcval = str5;
        this.fileRefNo = str6;
        this.offCd = num;
        this.permitSnoval = str7;
        this.permitval = str8;
        this.purCd = str9;
        this.rcSnoval = str10;
        this.rcval = str11;
        this.reasonval = str12;
        this.regnNo = str13;
        this.relApprovedBy = str14;
        this.relFileRefNo = str15;
        this.releaseDt = str16;
        this.stateCd = str17;
        this.surrDt = str18;
        this.taxexemval = str19;
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

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final String getPermitSnoval() {
        return this.permitSnoval;
    }

    public final String getPermitval() {
        return this.permitval;
    }

    public final String getPurCd() {
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
}
