package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class Beforepayment {
    private String applNo;
    private String appl_no;
    private String deal_cd;
    private Double finalTaxAmount;
    private String finalTaxFrom;
    private String finalTaxUpto;
    private Double no_adv_units;
    private Integer off_cd;
    private String op_dt;
    private String ownerName;
    private String payMode;
    private String paymentMode;
    private List<Object> paymntCollectionBean;
    private Double previousAdjustment;
    private Integer pur_cd;
    private String rcptDate;
    private String rcptNo;
    private String rcpt_dt;
    private String regnNo;
    private String state_cd;
    private String status;
    private List<Object> taxBreakDetails;
    private List<Object> taxGroupDetails;
    private String taxMode;
    private String taxPurcdDesc;
    private String taxhead;
    private Double totalAmount;
    private Double totalPaybaleInterest;
    private Double totalPaybalePenalty;
    private Double totalPaybaleRebate;
    private Double totalPaybaleSurcharge;
    private Double totalPaybaleTax;
    private Double totalPaybaleTax1;
    private Double totalPaybaleTax2;
    private String userID;
    private Double vtTaxFinalFine;
    private Double vtTaxFinalTax;

    public Beforepayment(String str, String str2, String str3, Double d10, String str4, String str5, Double d11, Integer num, String str6, String str7, String str8, String str9, List<Object> list, Double d12, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, List<Object> list2, List<Object> list3, String str16, String str17, String str18, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, String str19, Double d21, Double d22) {
        List<Object> list4 = list;
        List<Object> list5 = list2;
        List<Object> list6 = list3;
        l.f(list4, "paymntCollectionBean");
        l.f(list5, "taxBreakDetails");
        l.f(list6, "taxGroupDetails");
        this.applNo = str;
        this.appl_no = str2;
        this.deal_cd = str3;
        this.finalTaxAmount = d10;
        this.finalTaxFrom = str4;
        this.finalTaxUpto = str5;
        this.no_adv_units = d11;
        this.off_cd = num;
        this.op_dt = str6;
        this.ownerName = str7;
        this.payMode = str8;
        this.paymentMode = str9;
        this.paymntCollectionBean = list4;
        this.previousAdjustment = d12;
        this.pur_cd = num2;
        this.rcptDate = str10;
        this.rcptNo = str11;
        this.rcpt_dt = str12;
        this.regnNo = str13;
        this.state_cd = str14;
        this.status = str15;
        this.taxBreakDetails = list5;
        this.taxGroupDetails = list6;
        this.taxMode = str16;
        this.taxPurcdDesc = str17;
        this.taxhead = str18;
        this.totalAmount = d13;
        this.totalPaybaleInterest = d14;
        this.totalPaybalePenalty = d15;
        this.totalPaybaleRebate = d16;
        this.totalPaybaleSurcharge = d17;
        this.totalPaybaleTax = d18;
        this.totalPaybaleTax1 = d19;
        this.totalPaybaleTax2 = d20;
        this.userID = str19;
        this.vtTaxFinalFine = d21;
        this.vtTaxFinalTax = d22;
    }

    public static /* synthetic */ Beforepayment copy$default(Beforepayment beforepayment, String str, String str2, String str3, Double d10, String str4, String str5, Double d11, Integer num, String str6, String str7, String str8, String str9, List list, Double d12, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, List list2, List list3, String str16, String str17, String str18, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, String str19, Double d21, Double d22, int i10, int i11, Object obj) {
        Beforepayment beforepayment2 = beforepayment;
        int i12 = i10;
        return beforepayment.copy((i12 & 1) != 0 ? beforepayment2.applNo : str, (i12 & 2) != 0 ? beforepayment2.appl_no : str2, (i12 & 4) != 0 ? beforepayment2.deal_cd : str3, (i12 & 8) != 0 ? beforepayment2.finalTaxAmount : d10, (i12 & 16) != 0 ? beforepayment2.finalTaxFrom : str4, (i12 & 32) != 0 ? beforepayment2.finalTaxUpto : str5, (i12 & 64) != 0 ? beforepayment2.no_adv_units : d11, (i12 & 128) != 0 ? beforepayment2.off_cd : num, (i12 & 256) != 0 ? beforepayment2.op_dt : str6, (i12 & 512) != 0 ? beforepayment2.ownerName : str7, (i12 & 1024) != 0 ? beforepayment2.payMode : str8, (i12 & 2048) != 0 ? beforepayment2.paymentMode : str9, (i12 & 4096) != 0 ? beforepayment2.paymntCollectionBean : list, (i12 & 8192) != 0 ? beforepayment2.previousAdjustment : d12, (i12 & 16384) != 0 ? beforepayment2.pur_cd : num2, (i12 & 32768) != 0 ? beforepayment2.rcptDate : str10, (i12 & 65536) != 0 ? beforepayment2.rcptNo : str11, (i12 & 131072) != 0 ? beforepayment2.rcpt_dt : str12, (i12 & 262144) != 0 ? beforepayment2.regnNo : str13, (i12 & 524288) != 0 ? beforepayment2.state_cd : str14, (i12 & 1048576) != 0 ? beforepayment2.status : str15, (i12 & 2097152) != 0 ? beforepayment2.taxBreakDetails : list2, (i12 & 4194304) != 0 ? beforepayment2.taxGroupDetails : list3, (i12 & 8388608) != 0 ? beforepayment2.taxMode : str16, (i12 & 16777216) != 0 ? beforepayment2.taxPurcdDesc : str17, (i12 & 33554432) != 0 ? beforepayment2.taxhead : str18, (i12 & 67108864) != 0 ? beforepayment2.totalAmount : d13, (i12 & 134217728) != 0 ? beforepayment2.totalPaybaleInterest : d14, (i12 & 268435456) != 0 ? beforepayment2.totalPaybalePenalty : d15, (i12 & 536870912) != 0 ? beforepayment2.totalPaybaleRebate : d16, (i12 & 1073741824) != 0 ? beforepayment2.totalPaybaleSurcharge : d17, (i12 & Integer.MIN_VALUE) != 0 ? beforepayment2.totalPaybaleTax : d18, (i11 & 1) != 0 ? beforepayment2.totalPaybaleTax1 : d19, (i11 & 2) != 0 ? beforepayment2.totalPaybaleTax2 : d20, (i11 & 4) != 0 ? beforepayment2.userID : str19, (i11 & 8) != 0 ? beforepayment2.vtTaxFinalFine : d21, (i11 & 16) != 0 ? beforepayment2.vtTaxFinalTax : d22);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.ownerName;
    }

    public final String component11() {
        return this.payMode;
    }

    public final String component12() {
        return this.paymentMode;
    }

    public final List<Object> component13() {
        return this.paymntCollectionBean;
    }

    public final Double component14() {
        return this.previousAdjustment;
    }

    public final Integer component15() {
        return this.pur_cd;
    }

    public final String component16() {
        return this.rcptDate;
    }

    public final String component17() {
        return this.rcptNo;
    }

    public final String component18() {
        return this.rcpt_dt;
    }

    public final String component19() {
        return this.regnNo;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final String component20() {
        return this.state_cd;
    }

    public final String component21() {
        return this.status;
    }

    public final List<Object> component22() {
        return this.taxBreakDetails;
    }

    public final List<Object> component23() {
        return this.taxGroupDetails;
    }

    public final String component24() {
        return this.taxMode;
    }

    public final String component25() {
        return this.taxPurcdDesc;
    }

    public final String component26() {
        return this.taxhead;
    }

    public final Double component27() {
        return this.totalAmount;
    }

    public final Double component28() {
        return this.totalPaybaleInterest;
    }

    public final Double component29() {
        return this.totalPaybalePenalty;
    }

    public final String component3() {
        return this.deal_cd;
    }

    public final Double component30() {
        return this.totalPaybaleRebate;
    }

    public final Double component31() {
        return this.totalPaybaleSurcharge;
    }

    public final Double component32() {
        return this.totalPaybaleTax;
    }

    public final Double component33() {
        return this.totalPaybaleTax1;
    }

    public final Double component34() {
        return this.totalPaybaleTax2;
    }

    public final String component35() {
        return this.userID;
    }

    public final Double component36() {
        return this.vtTaxFinalFine;
    }

    public final Double component37() {
        return this.vtTaxFinalTax;
    }

    public final Double component4() {
        return this.finalTaxAmount;
    }

    public final String component5() {
        return this.finalTaxFrom;
    }

    public final String component6() {
        return this.finalTaxUpto;
    }

    public final Double component7() {
        return this.no_adv_units;
    }

    public final Integer component8() {
        return this.off_cd;
    }

    public final String component9() {
        return this.op_dt;
    }

    public final Beforepayment copy(String str, String str2, String str3, Double d10, String str4, String str5, Double d11, Integer num, String str6, String str7, String str8, String str9, List<Object> list, Double d12, Integer num2, String str10, String str11, String str12, String str13, String str14, String str15, List<Object> list2, List<Object> list3, String str16, String str17, String str18, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, String str19, Double d21, Double d22) {
        String str20 = str;
        l.f(list, "paymntCollectionBean");
        l.f(list2, "taxBreakDetails");
        l.f(list3, "taxGroupDetails");
        return new Beforepayment(str, str2, str3, d10, str4, str5, d11, num, str6, str7, str8, str9, list, d12, num2, str10, str11, str12, str13, str14, str15, list2, list3, str16, str17, str18, d13, d14, d15, d16, d17, d18, d19, d20, str19, d21, d22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Beforepayment)) {
            return false;
        }
        Beforepayment beforepayment = (Beforepayment) obj;
        return l.a(this.applNo, beforepayment.applNo) && l.a(this.appl_no, beforepayment.appl_no) && l.a(this.deal_cd, beforepayment.deal_cd) && l.a(this.finalTaxAmount, beforepayment.finalTaxAmount) && l.a(this.finalTaxFrom, beforepayment.finalTaxFrom) && l.a(this.finalTaxUpto, beforepayment.finalTaxUpto) && l.a(this.no_adv_units, beforepayment.no_adv_units) && l.a(this.off_cd, beforepayment.off_cd) && l.a(this.op_dt, beforepayment.op_dt) && l.a(this.ownerName, beforepayment.ownerName) && l.a(this.payMode, beforepayment.payMode) && l.a(this.paymentMode, beforepayment.paymentMode) && l.a(this.paymntCollectionBean, beforepayment.paymntCollectionBean) && l.a(this.previousAdjustment, beforepayment.previousAdjustment) && l.a(this.pur_cd, beforepayment.pur_cd) && l.a(this.rcptDate, beforepayment.rcptDate) && l.a(this.rcptNo, beforepayment.rcptNo) && l.a(this.rcpt_dt, beforepayment.rcpt_dt) && l.a(this.regnNo, beforepayment.regnNo) && l.a(this.state_cd, beforepayment.state_cd) && l.a(this.status, beforepayment.status) && l.a(this.taxBreakDetails, beforepayment.taxBreakDetails) && l.a(this.taxGroupDetails, beforepayment.taxGroupDetails) && l.a(this.taxMode, beforepayment.taxMode) && l.a(this.taxPurcdDesc, beforepayment.taxPurcdDesc) && l.a(this.taxhead, beforepayment.taxhead) && l.a(this.totalAmount, beforepayment.totalAmount) && l.a(this.totalPaybaleInterest, beforepayment.totalPaybaleInterest) && l.a(this.totalPaybalePenalty, beforepayment.totalPaybalePenalty) && l.a(this.totalPaybaleRebate, beforepayment.totalPaybaleRebate) && l.a(this.totalPaybaleSurcharge, beforepayment.totalPaybaleSurcharge) && l.a(this.totalPaybaleTax, beforepayment.totalPaybaleTax) && l.a(this.totalPaybaleTax1, beforepayment.totalPaybaleTax1) && l.a(this.totalPaybaleTax2, beforepayment.totalPaybaleTax2) && l.a(this.userID, beforepayment.userID) && l.a(this.vtTaxFinalFine, beforepayment.vtTaxFinalFine) && l.a(this.vtTaxFinalTax, beforepayment.vtTaxFinalTax);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getDeal_cd() {
        return this.deal_cd;
    }

    public final Double getFinalTaxAmount() {
        return this.finalTaxAmount;
    }

    public final String getFinalTaxFrom() {
        return this.finalTaxFrom;
    }

    public final String getFinalTaxUpto() {
        return this.finalTaxUpto;
    }

    public final Double getNo_adv_units() {
        return this.no_adv_units;
    }

    public final Integer getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPayMode() {
        return this.payMode;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final List<Object> getPaymntCollectionBean() {
        return this.paymntCollectionBean;
    }

    public final Double getPreviousAdjustment() {
        return this.previousAdjustment;
    }

    public final Integer getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcptDate() {
        return this.rcptDate;
    }

    public final String getRcptNo() {
        return this.rcptNo;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<Object> getTaxBreakDetails() {
        return this.taxBreakDetails;
    }

    public final List<Object> getTaxGroupDetails() {
        return this.taxGroupDetails;
    }

    public final String getTaxMode() {
        return this.taxMode;
    }

    public final String getTaxPurcdDesc() {
        return this.taxPurcdDesc;
    }

    public final String getTaxhead() {
        return this.taxhead;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public final Double getTotalPaybaleInterest() {
        return this.totalPaybaleInterest;
    }

    public final Double getTotalPaybalePenalty() {
        return this.totalPaybalePenalty;
    }

    public final Double getTotalPaybaleRebate() {
        return this.totalPaybaleRebate;
    }

    public final Double getTotalPaybaleSurcharge() {
        return this.totalPaybaleSurcharge;
    }

    public final Double getTotalPaybaleTax() {
        return this.totalPaybaleTax;
    }

    public final Double getTotalPaybaleTax1() {
        return this.totalPaybaleTax1;
    }

    public final Double getTotalPaybaleTax2() {
        return this.totalPaybaleTax2;
    }

    public final String getUserID() {
        return this.userID;
    }

    public final Double getVtTaxFinalFine() {
        return this.vtTaxFinalFine;
    }

    public final Double getVtTaxFinalTax() {
        return this.vtTaxFinalTax;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appl_no;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deal_cd;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.finalTaxAmount;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str4 = this.finalTaxFrom;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.finalTaxUpto;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d11 = this.no_adv_units;
        int hashCode7 = (hashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num = this.off_cd;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.op_dt;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ownerName;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payMode;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentMode;
        int hashCode12 = (((hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.paymntCollectionBean.hashCode()) * 31;
        Double d12 = this.previousAdjustment;
        int hashCode13 = (hashCode12 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num2 = this.pur_cd;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.rcptDate;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rcptNo;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rcpt_dt;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.regnNo;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.state_cd;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.status;
        int hashCode20 = (((((hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.taxBreakDetails.hashCode()) * 31) + this.taxGroupDetails.hashCode()) * 31;
        String str16 = this.taxMode;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.taxPurcdDesc;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.taxhead;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Double d13 = this.totalAmount;
        int hashCode24 = (hashCode23 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.totalPaybaleInterest;
        int hashCode25 = (hashCode24 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.totalPaybalePenalty;
        int hashCode26 = (hashCode25 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.totalPaybaleRebate;
        int hashCode27 = (hashCode26 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.totalPaybaleSurcharge;
        int hashCode28 = (hashCode27 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.totalPaybaleTax;
        int hashCode29 = (hashCode28 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.totalPaybaleTax1;
        int hashCode30 = (hashCode29 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d20 = this.totalPaybaleTax2;
        int hashCode31 = (hashCode30 + (d20 == null ? 0 : d20.hashCode())) * 31;
        String str19 = this.userID;
        int hashCode32 = (hashCode31 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Double d21 = this.vtTaxFinalFine;
        int hashCode33 = (hashCode32 + (d21 == null ? 0 : d21.hashCode())) * 31;
        Double d22 = this.vtTaxFinalTax;
        if (d22 != null) {
            i10 = d22.hashCode();
        }
        return hashCode33 + i10;
    }

    public final void setApplNo(String str) {
        this.applNo = str;
    }

    public final void setAppl_no(String str) {
        this.appl_no = str;
    }

    public final void setDeal_cd(String str) {
        this.deal_cd = str;
    }

    public final void setFinalTaxAmount(Double d10) {
        this.finalTaxAmount = d10;
    }

    public final void setFinalTaxFrom(String str) {
        this.finalTaxFrom = str;
    }

    public final void setFinalTaxUpto(String str) {
        this.finalTaxUpto = str;
    }

    public final void setNo_adv_units(Double d10) {
        this.no_adv_units = d10;
    }

    public final void setOff_cd(Integer num) {
        this.off_cd = num;
    }

    public final void setOp_dt(String str) {
        this.op_dt = str;
    }

    public final void setOwnerName(String str) {
        this.ownerName = str;
    }

    public final void setPayMode(String str) {
        this.payMode = str;
    }

    public final void setPaymentMode(String str) {
        this.paymentMode = str;
    }

    public final void setPaymntCollectionBean(List<Object> list) {
        l.f(list, "<set-?>");
        this.paymntCollectionBean = list;
    }

    public final void setPreviousAdjustment(Double d10) {
        this.previousAdjustment = d10;
    }

    public final void setPur_cd(Integer num) {
        this.pur_cd = num;
    }

    public final void setRcptDate(String str) {
        this.rcptDate = str;
    }

    public final void setRcptNo(String str) {
        this.rcptNo = str;
    }

    public final void setRcpt_dt(String str) {
        this.rcpt_dt = str;
    }

    public final void setRegnNo(String str) {
        this.regnNo = str;
    }

    public final void setState_cd(String str) {
        this.state_cd = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTaxBreakDetails(List<Object> list) {
        l.f(list, "<set-?>");
        this.taxBreakDetails = list;
    }

    public final void setTaxGroupDetails(List<Object> list) {
        l.f(list, "<set-?>");
        this.taxGroupDetails = list;
    }

    public final void setTaxMode(String str) {
        this.taxMode = str;
    }

    public final void setTaxPurcdDesc(String str) {
        this.taxPurcdDesc = str;
    }

    public final void setTaxhead(String str) {
        this.taxhead = str;
    }

    public final void setTotalAmount(Double d10) {
        this.totalAmount = d10;
    }

    public final void setTotalPaybaleInterest(Double d10) {
        this.totalPaybaleInterest = d10;
    }

    public final void setTotalPaybalePenalty(Double d10) {
        this.totalPaybalePenalty = d10;
    }

    public final void setTotalPaybaleRebate(Double d10) {
        this.totalPaybaleRebate = d10;
    }

    public final void setTotalPaybaleSurcharge(Double d10) {
        this.totalPaybaleSurcharge = d10;
    }

    public final void setTotalPaybaleTax(Double d10) {
        this.totalPaybaleTax = d10;
    }

    public final void setTotalPaybaleTax1(Double d10) {
        this.totalPaybaleTax1 = d10;
    }

    public final void setTotalPaybaleTax2(Double d10) {
        this.totalPaybaleTax2 = d10;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public final void setVtTaxFinalFine(Double d10) {
        this.vtTaxFinalFine = d10;
    }

    public final void setVtTaxFinalTax(Double d10) {
        this.vtTaxFinalTax = d10;
    }

    public String toString() {
        return "Beforepayment(applNo=" + this.applNo + ", appl_no=" + this.appl_no + ", deal_cd=" + this.deal_cd + ", finalTaxAmount=" + this.finalTaxAmount + ", finalTaxFrom=" + this.finalTaxFrom + ", finalTaxUpto=" + this.finalTaxUpto + ", no_adv_units=" + this.no_adv_units + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", ownerName=" + this.ownerName + ", payMode=" + this.payMode + ", paymentMode=" + this.paymentMode + ", paymntCollectionBean=" + this.paymntCollectionBean + ", previousAdjustment=" + this.previousAdjustment + ", pur_cd=" + this.pur_cd + ", rcptDate=" + this.rcptDate + ", rcptNo=" + this.rcptNo + ", rcpt_dt=" + this.rcpt_dt + ", regnNo=" + this.regnNo + ", state_cd=" + this.state_cd + ", status=" + this.status + ", taxBreakDetails=" + this.taxBreakDetails + ", taxGroupDetails=" + this.taxGroupDetails + ", taxMode=" + this.taxMode + ", taxPurcdDesc=" + this.taxPurcdDesc + ", taxhead=" + this.taxhead + ", totalAmount=" + this.totalAmount + ", totalPaybaleInterest=" + this.totalPaybaleInterest + ", totalPaybalePenalty=" + this.totalPaybalePenalty + ", totalPaybaleRebate=" + this.totalPaybaleRebate + ", totalPaybaleSurcharge=" + this.totalPaybaleSurcharge + ", totalPaybaleTax=" + this.totalPaybaleTax + ", totalPaybaleTax1=" + this.totalPaybaleTax1 + ", totalPaybaleTax2=" + this.totalPaybaleTax2 + ", userID=" + this.userID + ", vtTaxFinalFine=" + this.vtTaxFinalFine + ", vtTaxFinalTax=" + this.vtTaxFinalTax + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Beforepayment(java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.Double r45, java.lang.String r46, java.lang.String r47, java.lang.Double r48, java.lang.Integer r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.util.List r54, java.lang.Double r55, java.lang.Integer r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.util.List r63, java.util.List r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.Double r68, java.lang.Double r69, java.lang.Double r70, java.lang.Double r71, java.lang.Double r72, java.lang.Double r73, java.lang.Double r74, java.lang.Double r75, java.lang.String r76, java.lang.Double r77, java.lang.Double r78, int r79, int r80, cm.g r81) {
        /*
            r41 = this;
            r0 = r79
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r42
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r43
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001c
        L_0x001a:
            r6 = r44
        L_0x001c:
            r1 = r0 & 8
            r7 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            goto L_0x0029
        L_0x0027:
            r1 = r45
        L_0x0029:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x002f
            r9 = r2
            goto L_0x0031
        L_0x002f:
            r9 = r46
        L_0x0031:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x0037
            r10 = r2
            goto L_0x0039
        L_0x0037:
            r10 = r47
        L_0x0039:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x0043
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r11 = r3
            goto L_0x0045
        L_0x0043:
            r11 = r48
        L_0x0045:
            r3 = r0 & 128(0x80, float:1.794E-43)
            r12 = 0
            if (r3 == 0) goto L_0x0050
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r13 = r3
            goto L_0x0052
        L_0x0050:
            r13 = r49
        L_0x0052:
            r3 = r0 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0058
            r14 = r2
            goto L_0x005a
        L_0x0058:
            r14 = r50
        L_0x005a:
            r3 = r0 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0060
            r15 = r2
            goto L_0x0062
        L_0x0060:
            r15 = r51
        L_0x0062:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0069
            r16 = r2
            goto L_0x006b
        L_0x0069:
            r16 = r52
        L_0x006b:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0072
            r17 = r2
            goto L_0x0074
        L_0x0072:
            r17 = r53
        L_0x0074:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x007f
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r18 = r3
            goto L_0x0081
        L_0x007f:
            r18 = r55
        L_0x0081:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x008c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r19 = r3
            goto L_0x008e
        L_0x008c:
            r19 = r56
        L_0x008e:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0097
            r20 = r2
            goto L_0x0099
        L_0x0097:
            r20 = r57
        L_0x0099:
            r3 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00a1
            r21 = r2
            goto L_0x00a3
        L_0x00a1:
            r21 = r58
        L_0x00a3:
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00ab
            r22 = r2
            goto L_0x00ad
        L_0x00ab:
            r22 = r59
        L_0x00ad:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00b5
            r23 = r2
            goto L_0x00b7
        L_0x00b5:
            r23 = r60
        L_0x00b7:
            r3 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00bf
            r24 = r2
            goto L_0x00c1
        L_0x00bf:
            r24 = r61
        L_0x00c1:
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00c9
            r25 = r2
            goto L_0x00cb
        L_0x00c9:
            r25 = r62
        L_0x00cb:
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00d3
            r27 = r2
            goto L_0x00d5
        L_0x00d3:
            r27 = r65
        L_0x00d5:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00dd
            r28 = r2
            goto L_0x00df
        L_0x00dd:
            r28 = r66
        L_0x00df:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00e7
            r29 = r2
            goto L_0x00e9
        L_0x00e7:
            r29 = r67
        L_0x00e9:
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00f5
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r30 = r3
            goto L_0x00f7
        L_0x00f5:
            r30 = r68
        L_0x00f7:
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0103
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r31 = r3
            goto L_0x0105
        L_0x0103:
            r31 = r69
        L_0x0105:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0111
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r32 = r3
            goto L_0x0113
        L_0x0111:
            r32 = r70
        L_0x0113:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x011f
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r33 = r3
            goto L_0x0121
        L_0x011f:
            r33 = r71
        L_0x0121:
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x012d
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r34 = r3
            goto L_0x012f
        L_0x012d:
            r34 = r72
        L_0x012f:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x013b
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r35 = r0
            goto L_0x013d
        L_0x013b:
            r35 = r73
        L_0x013d:
            r0 = r80 & 1
            if (r0 == 0) goto L_0x0148
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r36 = r0
            goto L_0x014a
        L_0x0148:
            r36 = r74
        L_0x014a:
            r0 = r80 & 2
            if (r0 == 0) goto L_0x0155
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r37 = r0
            goto L_0x0157
        L_0x0155:
            r37 = r75
        L_0x0157:
            r0 = r80 & 4
            if (r0 == 0) goto L_0x015e
            r38 = r2
            goto L_0x0160
        L_0x015e:
            r38 = r76
        L_0x0160:
            r0 = r80 & 8
            if (r0 == 0) goto L_0x016b
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r39 = r0
            goto L_0x016d
        L_0x016b:
            r39 = r77
        L_0x016d:
            r0 = r80 & 16
            if (r0 == 0) goto L_0x0178
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r40 = r0
            goto L_0x017a
        L_0x0178:
            r40 = r78
        L_0x017a:
            r3 = r41
            r7 = r1
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r17
            r16 = r54
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r63
            r26 = r64
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Tax.Model.Beforepayment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double, java.lang.Double, int, int, cm.g):void");
    }
}
