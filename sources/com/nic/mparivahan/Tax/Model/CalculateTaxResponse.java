package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class CalculateTaxResponse {
    private final Object applNo;
    private final Object appl_no;
    private final String deal_cd;
    private final double finalTaxAmount;
    private final String finalTaxFrom;
    private final String finalTaxUpto;
    private final int no_adv_units;
    private final int off_cd;
    private final long op_dt;
    private final String ownerName;
    private final Object payMode;
    private final String paymentMode;
    private final List<Object> paymntCollectionBean;
    private final double previousAdjustment;
    private final int pur_cd;
    private final Object rcptDate;
    private final Object rcptNo;
    private final Object rcpt_dt;
    private final String regnNo;
    private final String state_cd;
    private final Object status;
    private final ArrayList<TaxBreakDetail> taxBreakDetails;
    private final ArrayList<TaxGroupDetail> taxGroupDetails;
    private final Object taxMode;
    private final Object taxPurcdDesc;
    private final Object taxhead;
    private final double totalAmount;
    private final double totalPaybaleInterest;
    private final double totalPaybalePenalty;
    private final double totalPaybaleRebate;
    private final double totalPaybaleSurcharge;
    private final double totalPaybaleTax;
    private final double totalPaybaleTax1;
    private final double totalPaybaleTax2;
    private final double totalTransactionChrg;
    private final double userChrg;
    private final Object userID;
    private final double vtTaxFinalFine;
    private final double vtTaxFinalTax;

    public CalculateTaxResponse(Object obj, Object obj2, String str, double d10, String str2, String str3, int i10, int i11, long j10, String str4, Object obj3, String str5, List<? extends Object> list, double d11, int i12, Object obj4, Object obj5, Object obj6, String str6, String str7, Object obj7, ArrayList<TaxBreakDetail> arrayList, ArrayList<TaxGroupDetail> arrayList2, Object obj8, Object obj9, Object obj10, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, Object obj11, double d20, double d21, double d22, double d23) {
        Object obj12 = obj;
        Object obj13 = obj2;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        Object obj14 = obj3;
        String str12 = str5;
        List<? extends Object> list2 = list;
        Object obj15 = obj4;
        Object obj16 = obj5;
        Object obj17 = obj6;
        String str13 = str6;
        String str14 = str7;
        ArrayList<TaxBreakDetail> arrayList3 = arrayList;
        l.f(obj12, "applNo");
        l.f(obj13, "appl_no");
        l.f(str8, "deal_cd");
        l.f(str9, "finalTaxFrom");
        l.f(str10, "finalTaxUpto");
        l.f(str11, "ownerName");
        l.f(obj14, "payMode");
        l.f(str12, "paymentMode");
        l.f(list2, "paymntCollectionBean");
        l.f(obj15, "rcptDate");
        l.f(obj16, "rcptNo");
        l.f(obj17, "rcpt_dt");
        l.f(str13, "regnNo");
        l.f(str14, "state_cd");
        l.f(obj7, "status");
        l.f(arrayList, "taxBreakDetails");
        l.f(arrayList2, "taxGroupDetails");
        l.f(obj8, "taxMode");
        l.f(obj9, "taxPurcdDesc");
        l.f(obj10, "taxhead");
        l.f(obj11, "userID");
        this.applNo = obj12;
        this.appl_no = obj13;
        this.deal_cd = str8;
        this.finalTaxAmount = d10;
        this.finalTaxFrom = str9;
        this.finalTaxUpto = str10;
        this.no_adv_units = i10;
        this.off_cd = i11;
        this.op_dt = j10;
        this.ownerName = str11;
        this.payMode = obj14;
        this.paymentMode = str12;
        this.paymntCollectionBean = list2;
        this.previousAdjustment = d11;
        this.pur_cd = i12;
        this.rcptDate = obj15;
        this.rcptNo = obj16;
        this.rcpt_dt = obj17;
        this.regnNo = str13;
        this.state_cd = str14;
        this.status = obj7;
        this.taxBreakDetails = arrayList;
        this.taxGroupDetails = arrayList2;
        this.taxMode = obj8;
        this.taxPurcdDesc = obj9;
        this.taxhead = obj10;
        this.totalAmount = d12;
        this.totalPaybaleInterest = d13;
        this.totalPaybalePenalty = d14;
        this.totalPaybaleRebate = d15;
        this.totalPaybaleSurcharge = d16;
        this.totalPaybaleTax = d17;
        this.totalPaybaleTax1 = d18;
        this.totalPaybaleTax2 = d19;
        this.userID = obj11;
        this.vtTaxFinalFine = d20;
        this.vtTaxFinalTax = d21;
        this.userChrg = d22;
        this.totalTransactionChrg = d23;
    }

    public static /* synthetic */ CalculateTaxResponse copy$default(CalculateTaxResponse calculateTaxResponse, Object obj, Object obj2, String str, double d10, String str2, String str3, int i10, int i11, long j10, String str4, Object obj3, String str5, List list, double d11, int i12, Object obj4, Object obj5, Object obj6, String str6, String str7, Object obj7, ArrayList arrayList, ArrayList arrayList2, Object obj8, Object obj9, Object obj10, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, Object obj11, double d20, double d21, double d22, double d23, int i13, int i14, Object obj12) {
        CalculateTaxResponse calculateTaxResponse2 = calculateTaxResponse;
        int i15 = i13;
        Object obj13 = (i15 & 1) != 0 ? calculateTaxResponse2.applNo : obj;
        Object obj14 = (i15 & 2) != 0 ? calculateTaxResponse2.appl_no : obj2;
        String str8 = (i15 & 4) != 0 ? calculateTaxResponse2.deal_cd : str;
        double d24 = (i15 & 8) != 0 ? calculateTaxResponse2.finalTaxAmount : d10;
        String str9 = (i15 & 16) != 0 ? calculateTaxResponse2.finalTaxFrom : str2;
        String str10 = (i15 & 32) != 0 ? calculateTaxResponse2.finalTaxUpto : str3;
        int i16 = (i15 & 64) != 0 ? calculateTaxResponse2.no_adv_units : i10;
        int i17 = (i15 & 128) != 0 ? calculateTaxResponse2.off_cd : i11;
        long j11 = (i15 & 256) != 0 ? calculateTaxResponse2.op_dt : j10;
        String str11 = (i15 & 512) != 0 ? calculateTaxResponse2.ownerName : str4;
        Object obj15 = (i15 & 1024) != 0 ? calculateTaxResponse2.payMode : obj3;
        String str12 = (i15 & 2048) != 0 ? calculateTaxResponse2.paymentMode : str5;
        List list2 = (i15 & 4096) != 0 ? calculateTaxResponse2.paymntCollectionBean : list;
        Object obj16 = obj15;
        double d25 = (i15 & 8192) != 0 ? calculateTaxResponse2.previousAdjustment : d11;
        int i18 = (i15 & 16384) != 0 ? calculateTaxResponse2.pur_cd : i12;
        return calculateTaxResponse.copy(obj13, obj14, str8, d24, str9, str10, i16, i17, j11, str11, obj16, str12, list2, d25, i18, (32768 & i15) != 0 ? calculateTaxResponse2.rcptDate : obj4, (i15 & 65536) != 0 ? calculateTaxResponse2.rcptNo : obj5, (i15 & 131072) != 0 ? calculateTaxResponse2.rcpt_dt : obj6, (i15 & 262144) != 0 ? calculateTaxResponse2.regnNo : str6, (i15 & 524288) != 0 ? calculateTaxResponse2.state_cd : str7, (i15 & 1048576) != 0 ? calculateTaxResponse2.status : obj7, (i15 & 2097152) != 0 ? calculateTaxResponse2.taxBreakDetails : arrayList, (i15 & 4194304) != 0 ? calculateTaxResponse2.taxGroupDetails : arrayList2, (i15 & 8388608) != 0 ? calculateTaxResponse2.taxMode : obj8, (i15 & 16777216) != 0 ? calculateTaxResponse2.taxPurcdDesc : obj9, (i15 & 33554432) != 0 ? calculateTaxResponse2.taxhead : obj10, (i15 & 67108864) != 0 ? calculateTaxResponse2.totalAmount : d12, (i15 & 134217728) != 0 ? calculateTaxResponse2.totalPaybaleInterest : d13, (i15 & 268435456) != 0 ? calculateTaxResponse2.totalPaybalePenalty : d14, (i15 & 536870912) != 0 ? calculateTaxResponse2.totalPaybaleRebate : d15, (i15 & 1073741824) != 0 ? calculateTaxResponse2.totalPaybaleSurcharge : d16, (i15 & Integer.MIN_VALUE) != 0 ? calculateTaxResponse2.totalPaybaleTax : d17, (i14 & 1) != 0 ? calculateTaxResponse2.totalPaybaleTax1 : d18, (i14 & 2) != 0 ? calculateTaxResponse2.totalPaybaleTax2 : d19, (i14 & 4) != 0 ? calculateTaxResponse2.userID : obj11, (i14 & 8) != 0 ? calculateTaxResponse2.vtTaxFinalFine : d20, (i14 & 16) != 0 ? calculateTaxResponse2.vtTaxFinalTax : d21, (i14 & 32) != 0 ? calculateTaxResponse2.userChrg : d22, (i14 & 64) != 0 ? calculateTaxResponse2.totalTransactionChrg : d23);
    }

    public final Object component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.ownerName;
    }

    public final Object component11() {
        return this.payMode;
    }

    public final String component12() {
        return this.paymentMode;
    }

    public final List<Object> component13() {
        return this.paymntCollectionBean;
    }

    public final double component14() {
        return this.previousAdjustment;
    }

    public final int component15() {
        return this.pur_cd;
    }

    public final Object component16() {
        return this.rcptDate;
    }

    public final Object component17() {
        return this.rcptNo;
    }

    public final Object component18() {
        return this.rcpt_dt;
    }

    public final String component19() {
        return this.regnNo;
    }

    public final Object component2() {
        return this.appl_no;
    }

    public final String component20() {
        return this.state_cd;
    }

    public final Object component21() {
        return this.status;
    }

    public final ArrayList<TaxBreakDetail> component22() {
        return this.taxBreakDetails;
    }

    public final ArrayList<TaxGroupDetail> component23() {
        return this.taxGroupDetails;
    }

    public final Object component24() {
        return this.taxMode;
    }

    public final Object component25() {
        return this.taxPurcdDesc;
    }

    public final Object component26() {
        return this.taxhead;
    }

    public final double component27() {
        return this.totalAmount;
    }

    public final double component28() {
        return this.totalPaybaleInterest;
    }

    public final double component29() {
        return this.totalPaybalePenalty;
    }

    public final String component3() {
        return this.deal_cd;
    }

    public final double component30() {
        return this.totalPaybaleRebate;
    }

    public final double component31() {
        return this.totalPaybaleSurcharge;
    }

    public final double component32() {
        return this.totalPaybaleTax;
    }

    public final double component33() {
        return this.totalPaybaleTax1;
    }

    public final double component34() {
        return this.totalPaybaleTax2;
    }

    public final Object component35() {
        return this.userID;
    }

    public final double component36() {
        return this.vtTaxFinalFine;
    }

    public final double component37() {
        return this.vtTaxFinalTax;
    }

    public final double component38() {
        return this.userChrg;
    }

    public final double component39() {
        return this.totalTransactionChrg;
    }

    public final double component4() {
        return this.finalTaxAmount;
    }

    public final String component5() {
        return this.finalTaxFrom;
    }

    public final String component6() {
        return this.finalTaxUpto;
    }

    public final int component7() {
        return this.no_adv_units;
    }

    public final int component8() {
        return this.off_cd;
    }

    public final long component9() {
        return this.op_dt;
    }

    public final CalculateTaxResponse copy(Object obj, Object obj2, String str, double d10, String str2, String str3, int i10, int i11, long j10, String str4, Object obj3, String str5, List<? extends Object> list, double d11, int i12, Object obj4, Object obj5, Object obj6, String str6, String str7, Object obj7, ArrayList<TaxBreakDetail> arrayList, ArrayList<TaxGroupDetail> arrayList2, Object obj8, Object obj9, Object obj10, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, Object obj11, double d20, double d21, double d22, double d23) {
        Object obj12 = obj;
        l.f(obj12, "applNo");
        l.f(obj2, "appl_no");
        l.f(str, "deal_cd");
        l.f(str2, "finalTaxFrom");
        l.f(str3, "finalTaxUpto");
        l.f(str4, "ownerName");
        l.f(obj3, "payMode");
        l.f(str5, "paymentMode");
        l.f(list, "paymntCollectionBean");
        l.f(obj4, "rcptDate");
        l.f(obj5, "rcptNo");
        l.f(obj6, "rcpt_dt");
        l.f(str6, "regnNo");
        l.f(str7, "state_cd");
        l.f(obj7, "status");
        l.f(arrayList, "taxBreakDetails");
        l.f(arrayList2, "taxGroupDetails");
        l.f(obj8, "taxMode");
        l.f(obj9, "taxPurcdDesc");
        l.f(obj10, "taxhead");
        l.f(obj11, "userID");
        return new CalculateTaxResponse(obj12, obj2, str, d10, str2, str3, i10, i11, j10, str4, obj3, str5, list, d11, i12, obj4, obj5, obj6, str6, str7, obj7, arrayList, arrayList2, obj8, obj9, obj10, d12, d13, d14, d15, d16, d17, d18, d19, obj11, d20, d21, d22, d23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculateTaxResponse)) {
            return false;
        }
        CalculateTaxResponse calculateTaxResponse = (CalculateTaxResponse) obj;
        return l.a(this.applNo, calculateTaxResponse.applNo) && l.a(this.appl_no, calculateTaxResponse.appl_no) && l.a(this.deal_cd, calculateTaxResponse.deal_cd) && Double.compare(this.finalTaxAmount, calculateTaxResponse.finalTaxAmount) == 0 && l.a(this.finalTaxFrom, calculateTaxResponse.finalTaxFrom) && l.a(this.finalTaxUpto, calculateTaxResponse.finalTaxUpto) && this.no_adv_units == calculateTaxResponse.no_adv_units && this.off_cd == calculateTaxResponse.off_cd && this.op_dt == calculateTaxResponse.op_dt && l.a(this.ownerName, calculateTaxResponse.ownerName) && l.a(this.payMode, calculateTaxResponse.payMode) && l.a(this.paymentMode, calculateTaxResponse.paymentMode) && l.a(this.paymntCollectionBean, calculateTaxResponse.paymntCollectionBean) && Double.compare(this.previousAdjustment, calculateTaxResponse.previousAdjustment) == 0 && this.pur_cd == calculateTaxResponse.pur_cd && l.a(this.rcptDate, calculateTaxResponse.rcptDate) && l.a(this.rcptNo, calculateTaxResponse.rcptNo) && l.a(this.rcpt_dt, calculateTaxResponse.rcpt_dt) && l.a(this.regnNo, calculateTaxResponse.regnNo) && l.a(this.state_cd, calculateTaxResponse.state_cd) && l.a(this.status, calculateTaxResponse.status) && l.a(this.taxBreakDetails, calculateTaxResponse.taxBreakDetails) && l.a(this.taxGroupDetails, calculateTaxResponse.taxGroupDetails) && l.a(this.taxMode, calculateTaxResponse.taxMode) && l.a(this.taxPurcdDesc, calculateTaxResponse.taxPurcdDesc) && l.a(this.taxhead, calculateTaxResponse.taxhead) && Double.compare(this.totalAmount, calculateTaxResponse.totalAmount) == 0 && Double.compare(this.totalPaybaleInterest, calculateTaxResponse.totalPaybaleInterest) == 0 && Double.compare(this.totalPaybalePenalty, calculateTaxResponse.totalPaybalePenalty) == 0 && Double.compare(this.totalPaybaleRebate, calculateTaxResponse.totalPaybaleRebate) == 0 && Double.compare(this.totalPaybaleSurcharge, calculateTaxResponse.totalPaybaleSurcharge) == 0 && Double.compare(this.totalPaybaleTax, calculateTaxResponse.totalPaybaleTax) == 0 && Double.compare(this.totalPaybaleTax1, calculateTaxResponse.totalPaybaleTax1) == 0 && Double.compare(this.totalPaybaleTax2, calculateTaxResponse.totalPaybaleTax2) == 0 && l.a(this.userID, calculateTaxResponse.userID) && Double.compare(this.vtTaxFinalFine, calculateTaxResponse.vtTaxFinalFine) == 0 && Double.compare(this.vtTaxFinalTax, calculateTaxResponse.vtTaxFinalTax) == 0 && Double.compare(this.userChrg, calculateTaxResponse.userChrg) == 0 && Double.compare(this.totalTransactionChrg, calculateTaxResponse.totalTransactionChrg) == 0;
    }

    public final Object getApplNo() {
        return this.applNo;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final String getDeal_cd() {
        return this.deal_cd;
    }

    public final double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    public final int getNo_adv_units() {
        return this.no_adv_units;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final long getOp_dt() {
        return this.op_dt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final Object getPayMode() {
        return this.payMode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> getPaymntCollectionBean() {
        return this.paymntCollectionBean;
    }

    public final double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final Object getRcptDate() {
        return this.rcptDate;
    }

    public final Object getRcptNo() {
        return this.rcptNo;
    }

    public final Object getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final Object getStatus() {
        return this.status;
    }

    public final ArrayList<TaxBreakDetail> getTaxBreakDetails() {
        return this.taxBreakDetails;
    }

    public final ArrayList<TaxGroupDetail> getTaxGroupDetails() {
        return this.taxGroupDetails;
    }

    public final Object getTaxMode() {
        return this.taxMode;
    }

    public final Object getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final Object getTaxhead() {
        return this.taxhead;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final double getTotalTransactionChrg() {
        return this.totalTransactionChrg;
    }

    public final double getUserChrg() {
        return this.userChrg;
    }

    public final Object getUserID() {
        return this.userID;
    }

    public final double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.applNo.hashCode() * 31) + this.appl_no.hashCode()) * 31) + this.deal_cd.hashCode()) * 31) + Double.hashCode(this.finalTaxAmount)) * 31) + this.finalTaxFrom.hashCode()) * 31) + this.finalTaxUpto.hashCode()) * 31) + Integer.hashCode(this.no_adv_units)) * 31) + Integer.hashCode(this.off_cd)) * 31) + Long.hashCode(this.op_dt)) * 31) + this.ownerName.hashCode()) * 31) + this.payMode.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.paymntCollectionBean.hashCode()) * 31) + Double.hashCode(this.previousAdjustment)) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcptDate.hashCode()) * 31) + this.rcptNo.hashCode()) * 31) + this.rcpt_dt.hashCode()) * 31) + this.regnNo.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.status.hashCode()) * 31) + this.taxBreakDetails.hashCode()) * 31) + this.taxGroupDetails.hashCode()) * 31) + this.taxMode.hashCode()) * 31) + this.taxPurcdDesc.hashCode()) * 31) + this.taxhead.hashCode()) * 31) + Double.hashCode(this.totalAmount)) * 31) + Double.hashCode(this.totalPaybaleInterest)) * 31) + Double.hashCode(this.totalPaybalePenalty)) * 31) + Double.hashCode(this.totalPaybaleRebate)) * 31) + Double.hashCode(this.totalPaybaleSurcharge)) * 31) + Double.hashCode(this.totalPaybaleTax)) * 31) + Double.hashCode(this.totalPaybaleTax1)) * 31) + Double.hashCode(this.totalPaybaleTax2)) * 31) + this.userID.hashCode()) * 31) + Double.hashCode(this.vtTaxFinalFine)) * 31) + Double.hashCode(this.vtTaxFinalTax)) * 31) + Double.hashCode(this.userChrg)) * 31) + Double.hashCode(this.totalTransactionChrg);
    }

    public String toString() {
        return "CalculateTaxResponse(applNo=" + this.applNo + ", appl_no=" + this.appl_no + ", deal_cd=" + this.deal_cd + ", finalTaxAmount=" + this.finalTaxAmount + ", finalTaxFrom=" + this.finalTaxFrom + ", finalTaxUpto=" + this.finalTaxUpto + ", no_adv_units=" + this.no_adv_units + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", ownerName=" + this.ownerName + ", payMode=" + this.payMode + ", paymentMode=" + this.paymentMode + ", paymntCollectionBean=" + this.paymntCollectionBean + ", previousAdjustment=" + this.previousAdjustment + ", pur_cd=" + this.pur_cd + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", rcpt_dt=" + this.rcpt_dt + ", regnNo=" + this.regnNo + ", state_cd=" + this.state_cd + ", status=" + this.status + ", taxBreakDetails=" + this.taxBreakDetails + ", taxGroupDetails=" + this.taxGroupDetails + ", taxMode=" + this.taxMode + ", taxPurcdDesc=" + this.taxPurcdDesc + ", taxhead=" + this.taxhead + ", totalAmount=" + this.totalAmount + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", userID=" + this.userID + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ", userChrg=" + this.userChrg + ", totalTransactionChrg=" + this.totalTransactionChrg + ')';
    }
}
