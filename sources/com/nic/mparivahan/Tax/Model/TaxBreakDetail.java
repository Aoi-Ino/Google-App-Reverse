package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class TaxBreakDetail {
    private final double amount;
    private final double amount1;
    private final double amount2;
    private final String applicationstatus;
    private final double fine;
    private final Object g_TAX_UPTO;
    private final double gamount;
    private final double interest;
    private final Object pay_due_date;
    private final double penalty;
    private final int prv_ADJ;
    private final int pur_CD;
    private final String rcpt_dt;
    private final double rebate;
    private final Object receipt_no;
    private final int sr_no;
    private final double surcharge;
    private final String tax_EXAM_UPTO;
    private final String tax_FROM;
    private final String tax_HEAD;
    private final String tax_MODE;
    private final String tax_UPTO;
    private final String tax_clear_upto;
    private final String tax_from_date;
    private final String tax_upto_date;
    private final String transaction_no;

    public TaxBreakDetail(double d10, double d11, double d12, String str, double d13, Object obj, double d14, double d15, Object obj2, double d16, int i10, int i11, String str2, double d17, Object obj3, int i12, double d18, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        String str12 = str;
        Object obj4 = obj;
        Object obj5 = obj2;
        String str13 = str2;
        Object obj6 = obj3;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        l.f(str12, "applicationstatus");
        l.f(obj4, "g_TAX_UPTO");
        l.f(obj5, "pay_due_date");
        l.f(str13, "rcpt_dt");
        l.f(obj6, "receipt_no");
        l.f(str14, "tax_EXAM_UPTO");
        l.f(str15, "tax_FROM");
        l.f(str16, "tax_HEAD");
        l.f(str17, "tax_MODE");
        l.f(str18, "tax_UPTO");
        l.f(str19, "tax_clear_upto");
        l.f(str20, "tax_from_date");
        l.f(str21, "tax_upto_date");
        l.f(str11, "transaction_no");
        this.amount = d10;
        this.amount1 = d11;
        this.amount2 = d12;
        this.applicationstatus = str12;
        this.fine = d13;
        this.g_TAX_UPTO = obj4;
        this.gamount = d14;
        this.interest = d15;
        this.pay_due_date = obj5;
        this.penalty = d16;
        this.prv_ADJ = i10;
        this.pur_CD = i11;
        this.rcpt_dt = str13;
        this.rebate = d17;
        this.receipt_no = obj6;
        this.sr_no = i12;
        this.surcharge = d18;
        this.tax_EXAM_UPTO = str14;
        this.tax_FROM = str15;
        this.tax_HEAD = str16;
        this.tax_MODE = str17;
        this.tax_UPTO = str18;
        this.tax_clear_upto = str19;
        this.tax_from_date = str20;
        this.tax_upto_date = str21;
        this.transaction_no = str11;
    }

    public static /* synthetic */ TaxBreakDetail copy$default(TaxBreakDetail taxBreakDetail, double d10, double d11, double d12, String str, double d13, Object obj, double d14, double d15, Object obj2, double d16, int i10, int i11, String str2, double d17, Object obj3, int i12, double d18, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i13, Object obj4) {
        TaxBreakDetail taxBreakDetail2 = taxBreakDetail;
        int i14 = i13;
        return taxBreakDetail.copy((i14 & 1) != 0 ? taxBreakDetail2.amount : d10, (i14 & 2) != 0 ? taxBreakDetail2.amount1 : d11, (i14 & 4) != 0 ? taxBreakDetail2.amount2 : d12, (i14 & 8) != 0 ? taxBreakDetail2.applicationstatus : str, (i14 & 16) != 0 ? taxBreakDetail2.fine : d13, (i14 & 32) != 0 ? taxBreakDetail2.g_TAX_UPTO : obj, (i14 & 64) != 0 ? taxBreakDetail2.gamount : d14, (i14 & 128) != 0 ? taxBreakDetail2.interest : d15, (i14 & 256) != 0 ? taxBreakDetail2.pay_due_date : obj2, (i14 & 512) != 0 ? taxBreakDetail2.penalty : d16, (i14 & 1024) != 0 ? taxBreakDetail2.prv_ADJ : i10, (i14 & 2048) != 0 ? taxBreakDetail2.pur_CD : i11, (i14 & 4096) != 0 ? taxBreakDetail2.rcpt_dt : str2, (i14 & 8192) != 0 ? taxBreakDetail2.rebate : d17, (i14 & 16384) != 0 ? taxBreakDetail2.receipt_no : obj3, (32768 & i14) != 0 ? taxBreakDetail2.sr_no : i12, (i14 & 65536) != 0 ? taxBreakDetail2.surcharge : d18, (i14 & 131072) != 0 ? taxBreakDetail2.tax_EXAM_UPTO : str3, (262144 & i14) != 0 ? taxBreakDetail2.tax_FROM : str4, (i14 & 524288) != 0 ? taxBreakDetail2.tax_HEAD : str5, (i14 & 1048576) != 0 ? taxBreakDetail2.tax_MODE : str6, (i14 & 2097152) != 0 ? taxBreakDetail2.tax_UPTO : str7, (i14 & 4194304) != 0 ? taxBreakDetail2.tax_clear_upto : str8, (i14 & 8388608) != 0 ? taxBreakDetail2.tax_from_date : str9, (i14 & 16777216) != 0 ? taxBreakDetail2.tax_upto_date : str10, (i14 & 33554432) != 0 ? taxBreakDetail2.transaction_no : str11);
    }

    public final double component1() {
        return this.amount;
    }

    public final double component10() {
        return this.penalty;
    }

    public final int component11() {
        return this.prv_ADJ;
    }

    public final int component12() {
        return this.pur_CD;
    }

    public final String component13() {
        return this.rcpt_dt;
    }

    public final double component14() {
        return this.rebate;
    }

    public final Object component15() {
        return this.receipt_no;
    }

    public final int component16() {
        return this.sr_no;
    }

    public final double component17() {
        return this.surcharge;
    }

    public final String component18() {
        return this.tax_EXAM_UPTO;
    }

    public final String component19() {
        return this.tax_FROM;
    }

    public final double component2() {
        return this.amount1;
    }

    public final String component20() {
        return this.tax_HEAD;
    }

    public final String component21() {
        return this.tax_MODE;
    }

    public final String component22() {
        return this.tax_UPTO;
    }

    public final String component23() {
        return this.tax_clear_upto;
    }

    public final String component24() {
        return this.tax_from_date;
    }

    public final String component25() {
        return this.tax_upto_date;
    }

    public final String component26() {
        return this.transaction_no;
    }

    public final double component3() {
        return this.amount2;
    }

    public final String component4() {
        return this.applicationstatus;
    }

    public final double component5() {
        return this.fine;
    }

    public final Object component6() {
        return this.g_TAX_UPTO;
    }

    public final double component7() {
        return this.gamount;
    }

    public final double component8() {
        return this.interest;
    }

    public final Object component9() {
        return this.pay_due_date;
    }

    public final TaxBreakDetail copy(double d10, double d11, double d12, String str, double d13, Object obj, double d14, double d15, Object obj2, double d16, int i10, int i11, String str2, double d17, Object obj3, int i12, double d18, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        double d19 = d10;
        l.f(str, "applicationstatus");
        l.f(obj, "g_TAX_UPTO");
        l.f(obj2, "pay_due_date");
        l.f(str2, "rcpt_dt");
        l.f(obj3, "receipt_no");
        l.f(str3, "tax_EXAM_UPTO");
        l.f(str4, "tax_FROM");
        l.f(str5, "tax_HEAD");
        l.f(str6, "tax_MODE");
        l.f(str7, "tax_UPTO");
        l.f(str8, "tax_clear_upto");
        l.f(str9, "tax_from_date");
        l.f(str10, "tax_upto_date");
        l.f(str11, "transaction_no");
        return new TaxBreakDetail(d10, d11, d12, str, d13, obj, d14, d15, obj2, d16, i10, i11, str2, d17, obj3, i12, d18, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxBreakDetail)) {
            return false;
        }
        TaxBreakDetail taxBreakDetail = (TaxBreakDetail) obj;
        return Double.compare(this.amount, taxBreakDetail.amount) == 0 && Double.compare(this.amount1, taxBreakDetail.amount1) == 0 && Double.compare(this.amount2, taxBreakDetail.amount2) == 0 && l.a(this.applicationstatus, taxBreakDetail.applicationstatus) && Double.compare(this.fine, taxBreakDetail.fine) == 0 && l.a(this.g_TAX_UPTO, taxBreakDetail.g_TAX_UPTO) && Double.compare(this.gamount, taxBreakDetail.gamount) == 0 && Double.compare(this.interest, taxBreakDetail.interest) == 0 && l.a(this.pay_due_date, taxBreakDetail.pay_due_date) && Double.compare(this.penalty, taxBreakDetail.penalty) == 0 && this.prv_ADJ == taxBreakDetail.prv_ADJ && this.pur_CD == taxBreakDetail.pur_CD && l.a(this.rcpt_dt, taxBreakDetail.rcpt_dt) && Double.compare(this.rebate, taxBreakDetail.rebate) == 0 && l.a(this.receipt_no, taxBreakDetail.receipt_no) && this.sr_no == taxBreakDetail.sr_no && Double.compare(this.surcharge, taxBreakDetail.surcharge) == 0 && l.a(this.tax_EXAM_UPTO, taxBreakDetail.tax_EXAM_UPTO) && l.a(this.tax_FROM, taxBreakDetail.tax_FROM) && l.a(this.tax_HEAD, taxBreakDetail.tax_HEAD) && l.a(this.tax_MODE, taxBreakDetail.tax_MODE) && l.a(this.tax_UPTO, taxBreakDetail.tax_UPTO) && l.a(this.tax_clear_upto, taxBreakDetail.tax_clear_upto) && l.a(this.tax_from_date, taxBreakDetail.tax_from_date) && l.a(this.tax_upto_date, taxBreakDetail.tax_upto_date) && l.a(this.transaction_no, taxBreakDetail.transaction_no);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getAmount1() {
        return this.amount1;
    }

    public final double getAmount2() {
        return this.amount2;
    }

    public final String getApplicationstatus() {
        return this.applicationstatus;
    }

    public final double getFine() {
        return this.fine;
    }

    public final Object getG_TAX_UPTO() {
        return this.g_TAX_UPTO;
    }

    public final double getGamount() {
        return this.gamount;
    }

    public final double getInterest() {
        return this.interest;
    }

    public final Object getPay_due_date() {
        return this.pay_due_date;
    }

    public final double getPenalty() {
        return this.penalty;
    }

    public final int getPrv_ADJ() {
        return this.prv_ADJ;
    }

    public final int getPur_CD() {
        return this.pur_CD;
    }

    public final String getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final double getRebate() {
        return this.rebate;
    }

    public final Object getReceipt_no() {
        return this.receipt_no;
    }

    public final int getSr_no() {
        return this.sr_no;
    }

    public final double getSurcharge() {
        return this.surcharge;
    }

    public final String getTax_EXAM_UPTO() {
        return this.tax_EXAM_UPTO;
    }

    public final String getTax_FROM() {
        return this.tax_FROM;
    }

    public final String getTax_HEAD() {
        return this.tax_HEAD;
    }

    public final String getTax_MODE() {
        return this.tax_MODE;
    }

    public final String getTax_UPTO() {
        return this.tax_UPTO;
    }

    public final String getTax_clear_upto() {
        return this.tax_clear_upto;
    }

    public final String getTax_from_date() {
        return this.tax_from_date;
    }

    public final String getTax_upto_date() {
        return this.tax_upto_date;
    }

    public final String getTransaction_no() {
        return this.transaction_no;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((Double.hashCode(this.amount) * 31) + Double.hashCode(this.amount1)) * 31) + Double.hashCode(this.amount2)) * 31) + this.applicationstatus.hashCode()) * 31) + Double.hashCode(this.fine)) * 31) + this.g_TAX_UPTO.hashCode()) * 31) + Double.hashCode(this.gamount)) * 31) + Double.hashCode(this.interest)) * 31) + this.pay_due_date.hashCode()) * 31) + Double.hashCode(this.penalty)) * 31) + Integer.hashCode(this.prv_ADJ)) * 31) + Integer.hashCode(this.pur_CD)) * 31) + this.rcpt_dt.hashCode()) * 31) + Double.hashCode(this.rebate)) * 31) + this.receipt_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + Double.hashCode(this.surcharge)) * 31) + this.tax_EXAM_UPTO.hashCode()) * 31) + this.tax_FROM.hashCode()) * 31) + this.tax_HEAD.hashCode()) * 31) + this.tax_MODE.hashCode()) * 31) + this.tax_UPTO.hashCode()) * 31) + this.tax_clear_upto.hashCode()) * 31) + this.tax_from_date.hashCode()) * 31) + this.tax_upto_date.hashCode()) * 31) + this.transaction_no.hashCode();
    }

    public String toString() {
        return "TaxBreakDetail(amount=" + this.amount + ", amount1=" + this.amount1 + ", amount2=" + this.amount2 + ", applicationstatus=" + this.applicationstatus + ", fine=" + this.fine + ", g_TAX_UPTO=" + this.g_TAX_UPTO + ", gamount=" + this.gamount + ", interest=" + this.interest + ", pay_due_date=" + this.pay_due_date + ", penalty=" + this.penalty + ", prv_ADJ=" + this.prv_ADJ + ", pur_CD=" + this.pur_CD + ", rcpt_dt=" + this.rcpt_dt + ", rebate=" + this.rebate + ", receipt_no=" + this.receipt_no + ", sr_no=" + this.sr_no + ", surcharge=" + this.surcharge + ", tax_EXAM_UPTO=" + this.tax_EXAM_UPTO + ", tax_FROM=" + this.tax_FROM + ", tax_HEAD=" + this.tax_HEAD + ", tax_MODE=" + this.tax_MODE + ", tax_UPTO=" + this.tax_UPTO + ", tax_clear_upto=" + this.tax_clear_upto + ", tax_from_date=" + this.tax_from_date + ", tax_upto_date=" + this.tax_upto_date + ", transaction_no=" + this.transaction_no + ')';
    }
}
