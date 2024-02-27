package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PendingTransTaxBreakListModel {
    private final String applNo;
    private final long finalTaxAmount;
    private final int no_adv_units;
    private final String off_cd;
    private final long previousAdjustment;
    private final int pur_cd;
    private final String regnNo;
    private final String state_cd;
    private final String taxPurcdDesc;
    private final long totalAmount;
    private final long totalPaybaleInterest;
    private final long totalPaybalePenalty;
    private final long totalPaybaleRebate;
    private final long totalPaybaleSurcharge;
    private final long totalPaybaleTax;
    private final long totalPaybaleTax1;
    private final long totalPaybaleTax2;
    private final long vtTaxFinalFine;
    private final long vtTaxFinalTax;

    public PendingTransTaxBreakListModel(String str, String str2, long j10, String str3, long j11, int i10, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i11, long j21, String str4, String str5) {
        String str6 = str4;
        String str7 = str5;
        l.f(str, "state_cd");
        l.f(str2, "off_cd");
        l.f(str3, "regnNo");
        l.f(str6, "taxPurcdDesc");
        l.f(str7, "applNo");
        this.state_cd = str;
        this.off_cd = str2;
        this.totalAmount = j10;
        this.regnNo = str3;
        this.finalTaxAmount = j11;
        this.pur_cd = i10;
        this.totalPaybaleTax = j12;
        this.totalPaybalePenalty = j13;
        this.totalPaybaleSurcharge = j14;
        this.totalPaybaleRebate = j15;
        this.totalPaybaleInterest = j16;
        this.totalPaybaleTax1 = j17;
        this.totalPaybaleTax2 = j18;
        this.vtTaxFinalTax = j19;
        this.previousAdjustment = j20;
        this.no_adv_units = i11;
        this.vtTaxFinalFine = j21;
        this.taxPurcdDesc = str6;
        this.applNo = str7;
    }

    public static /* synthetic */ PendingTransTaxBreakListModel copy$default(PendingTransTaxBreakListModel pendingTransTaxBreakListModel, String str, String str2, long j10, String str3, long j11, int i10, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i11, long j21, String str4, String str5, int i12, Object obj) {
        PendingTransTaxBreakListModel pendingTransTaxBreakListModel2 = pendingTransTaxBreakListModel;
        int i13 = i12;
        return pendingTransTaxBreakListModel.copy((i13 & 1) != 0 ? pendingTransTaxBreakListModel2.state_cd : str, (i13 & 2) != 0 ? pendingTransTaxBreakListModel2.off_cd : str2, (i13 & 4) != 0 ? pendingTransTaxBreakListModel2.totalAmount : j10, (i13 & 8) != 0 ? pendingTransTaxBreakListModel2.regnNo : str3, (i13 & 16) != 0 ? pendingTransTaxBreakListModel2.finalTaxAmount : j11, (i13 & 32) != 0 ? pendingTransTaxBreakListModel2.pur_cd : i10, (i13 & 64) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleTax : j12, (i13 & 128) != 0 ? pendingTransTaxBreakListModel2.totalPaybalePenalty : j13, (i13 & 256) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleSurcharge : j14, (i13 & 512) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleRebate : j15, (i13 & 1024) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleInterest : j16, (i13 & 2048) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleTax1 : j17, (i13 & 4096) != 0 ? pendingTransTaxBreakListModel2.totalPaybaleTax2 : j18, (i13 & 8192) != 0 ? pendingTransTaxBreakListModel2.vtTaxFinalTax : j19, (i13 & 16384) != 0 ? pendingTransTaxBreakListModel2.previousAdjustment : j20, (i13 & 32768) != 0 ? pendingTransTaxBreakListModel2.no_adv_units : i11, (65536 & i13) != 0 ? pendingTransTaxBreakListModel2.vtTaxFinalFine : j21, (i13 & 131072) != 0 ? pendingTransTaxBreakListModel2.taxPurcdDesc : str4, (i13 & 262144) != 0 ? pendingTransTaxBreakListModel2.applNo : str5);
    }

    public final String component1() {
        return this.state_cd;
    }

    public final long component10() {
        return this.totalPaybaleRebate;
    }

    public final long component11() {
        return this.totalPaybaleInterest;
    }

    public final long component12() {
        return this.totalPaybaleTax1;
    }

    public final long component13() {
        return this.totalPaybaleTax2;
    }

    public final long component14() {
        return this.vtTaxFinalTax;
    }

    public final long component15() {
        return this.previousAdjustment;
    }

    public final int component16() {
        return this.no_adv_units;
    }

    public final long component17() {
        return this.vtTaxFinalFine;
    }

    public final String component18() {
        return this.taxPurcdDesc;
    }

    public final String component19() {
        return this.applNo;
    }

    public final String component2() {
        return this.off_cd;
    }

    public final long component3() {
        return this.totalAmount;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final long component5() {
        return this.finalTaxAmount;
    }

    public final int component6() {
        return this.pur_cd;
    }

    public final long component7() {
        return this.totalPaybaleTax;
    }

    public final long component8() {
        return this.totalPaybalePenalty;
    }

    public final long component9() {
        return this.totalPaybaleSurcharge;
    }

    public final PendingTransTaxBreakListModel copy(String str, String str2, long j10, String str3, long j11, int i10, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i11, long j21, String str4, String str5) {
        String str6 = str;
        l.f(str6, "state_cd");
        l.f(str2, "off_cd");
        l.f(str3, "regnNo");
        l.f(str4, "taxPurcdDesc");
        l.f(str5, "applNo");
        return new PendingTransTaxBreakListModel(str6, str2, j10, str3, j11, i10, j12, j13, j14, j15, j16, j17, j18, j19, j20, i11, j21, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransTaxBreakListModel)) {
            return false;
        }
        PendingTransTaxBreakListModel pendingTransTaxBreakListModel = (PendingTransTaxBreakListModel) obj;
        return l.a(this.state_cd, pendingTransTaxBreakListModel.state_cd) && l.a(this.off_cd, pendingTransTaxBreakListModel.off_cd) && this.totalAmount == pendingTransTaxBreakListModel.totalAmount && l.a(this.regnNo, pendingTransTaxBreakListModel.regnNo) && this.finalTaxAmount == pendingTransTaxBreakListModel.finalTaxAmount && this.pur_cd == pendingTransTaxBreakListModel.pur_cd && this.totalPaybaleTax == pendingTransTaxBreakListModel.totalPaybaleTax && this.totalPaybalePenalty == pendingTransTaxBreakListModel.totalPaybalePenalty && this.totalPaybaleSurcharge == pendingTransTaxBreakListModel.totalPaybaleSurcharge && this.totalPaybaleRebate == pendingTransTaxBreakListModel.totalPaybaleRebate && this.totalPaybaleInterest == pendingTransTaxBreakListModel.totalPaybaleInterest && this.totalPaybaleTax1 == pendingTransTaxBreakListModel.totalPaybaleTax1 && this.totalPaybaleTax2 == pendingTransTaxBreakListModel.totalPaybaleTax2 && this.vtTaxFinalTax == pendingTransTaxBreakListModel.vtTaxFinalTax && this.previousAdjustment == pendingTransTaxBreakListModel.previousAdjustment && this.no_adv_units == pendingTransTaxBreakListModel.no_adv_units && this.vtTaxFinalFine == pendingTransTaxBreakListModel.vtTaxFinalFine && l.a(this.taxPurcdDesc, pendingTransTaxBreakListModel.taxPurcdDesc) && l.a(this.applNo, pendingTransTaxBreakListModel.applNo);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final long getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final long getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final long getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final long getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final long getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final long getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final long getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final long getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final long getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final long getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final long getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31) + Long.hashCode(this.totalAmount)) * 31) + this.regnNo.hashCode()) * 31) + Long.hashCode(this.finalTaxAmount)) * 31) + Integer.hashCode(this.pur_cd)) * 31) + Long.hashCode(this.totalPaybaleTax)) * 31) + Long.hashCode(this.totalPaybalePenalty)) * 31) + Long.hashCode(this.totalPaybaleSurcharge)) * 31) + Long.hashCode(this.totalPaybaleRebate)) * 31) + Long.hashCode(this.totalPaybaleInterest)) * 31) + Long.hashCode(this.totalPaybaleTax1)) * 31) + Long.hashCode(this.totalPaybaleTax2)) * 31) + Long.hashCode(this.vtTaxFinalTax)) * 31) + Long.hashCode(this.previousAdjustment)) * 31) + Integer.hashCode(this.no_adv_units)) * 31) + Long.hashCode(this.vtTaxFinalFine)) * 31) + this.taxPurcdDesc.hashCode()) * 31) + this.applNo.hashCode();
    }

    public String toString() {
        return "PendingTransTaxBreakListModel(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", totalAmount=" + this.totalAmount + ", regnNo=" + this.regnNo + ", finalTaxAmount=" + this.finalTaxAmount + ", pur_cd=" + this.pur_cd + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ", previousAdjustment=" + this.previousAdjustment + ", no_adv_units=" + this.no_adv_units + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", taxPurcdDesc=" + this.taxPurcdDesc + ", applNo=" + this.applNo + ')';
    }
}
