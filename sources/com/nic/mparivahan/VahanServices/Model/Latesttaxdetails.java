package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Latesttaxdetails {
    private final String collected_by;
    private final Object flag;
    private final String payment_mode;
    private final long rcpt_dt;
    private final String regn_no;
    private final int tax_amt;
    private final int tax_fine;
    private final long tax_from;
    private final String tax_mode;
    private final long tax_upto;
    private final VtTaxEntityByid vtTaxEntityByid;

    public Latesttaxdetails(String str, Object obj, String str2, long j10, String str3, int i10, int i11, long j11, String str4, long j12, VtTaxEntityByid vtTaxEntityByid2) {
        l.f(str, "collected_by");
        l.f(obj, "flag");
        l.f(str2, "payment_mode");
        l.f(str3, "regn_no");
        l.f(str4, "tax_mode");
        l.f(vtTaxEntityByid2, "vtTaxEntityByid");
        this.collected_by = str;
        this.flag = obj;
        this.payment_mode = str2;
        this.rcpt_dt = j10;
        this.regn_no = str3;
        this.tax_amt = i10;
        this.tax_fine = i11;
        this.tax_from = j11;
        this.tax_mode = str4;
        this.tax_upto = j12;
        this.vtTaxEntityByid = vtTaxEntityByid2;
    }

    public static /* synthetic */ Latesttaxdetails copy$default(Latesttaxdetails latesttaxdetails, String str, Object obj, String str2, long j10, String str3, int i10, int i11, long j11, String str4, long j12, VtTaxEntityByid vtTaxEntityByid2, int i12, Object obj2) {
        Latesttaxdetails latesttaxdetails2 = latesttaxdetails;
        int i13 = i12;
        return latesttaxdetails.copy((i13 & 1) != 0 ? latesttaxdetails2.collected_by : str, (i13 & 2) != 0 ? latesttaxdetails2.flag : obj, (i13 & 4) != 0 ? latesttaxdetails2.payment_mode : str2, (i13 & 8) != 0 ? latesttaxdetails2.rcpt_dt : j10, (i13 & 16) != 0 ? latesttaxdetails2.regn_no : str3, (i13 & 32) != 0 ? latesttaxdetails2.tax_amt : i10, (i13 & 64) != 0 ? latesttaxdetails2.tax_fine : i11, (i13 & 128) != 0 ? latesttaxdetails2.tax_from : j11, (i13 & 256) != 0 ? latesttaxdetails2.tax_mode : str4, (i13 & 512) != 0 ? latesttaxdetails2.tax_upto : j12, (i13 & 1024) != 0 ? latesttaxdetails2.vtTaxEntityByid : vtTaxEntityByid2);
    }

    public final String component1() {
        return this.collected_by;
    }

    public final long component10() {
        return this.tax_upto;
    }

    public final VtTaxEntityByid component11() {
        return this.vtTaxEntityByid;
    }

    public final Object component2() {
        return this.flag;
    }

    public final String component3() {
        return this.payment_mode;
    }

    public final long component4() {
        return this.rcpt_dt;
    }

    public final String component5() {
        return this.regn_no;
    }

    public final int component6() {
        return this.tax_amt;
    }

    public final int component7() {
        return this.tax_fine;
    }

    public final long component8() {
        return this.tax_from;
    }

    public final String component9() {
        return this.tax_mode;
    }

    public final Latesttaxdetails copy(String str, Object obj, String str2, long j10, String str3, int i10, int i11, long j11, String str4, long j12, VtTaxEntityByid vtTaxEntityByid2) {
        String str5 = str;
        l.f(str5, "collected_by");
        Object obj2 = obj;
        l.f(obj2, "flag");
        String str6 = str2;
        l.f(str6, "payment_mode");
        String str7 = str3;
        l.f(str7, "regn_no");
        String str8 = str4;
        l.f(str8, "tax_mode");
        VtTaxEntityByid vtTaxEntityByid3 = vtTaxEntityByid2;
        l.f(vtTaxEntityByid3, "vtTaxEntityByid");
        return new Latesttaxdetails(str5, obj2, str6, j10, str7, i10, i11, j11, str8, j12, vtTaxEntityByid3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Latesttaxdetails)) {
            return false;
        }
        Latesttaxdetails latesttaxdetails = (Latesttaxdetails) obj;
        return l.a(this.collected_by, latesttaxdetails.collected_by) && l.a(this.flag, latesttaxdetails.flag) && l.a(this.payment_mode, latesttaxdetails.payment_mode) && this.rcpt_dt == latesttaxdetails.rcpt_dt && l.a(this.regn_no, latesttaxdetails.regn_no) && this.tax_amt == latesttaxdetails.tax_amt && this.tax_fine == latesttaxdetails.tax_fine && this.tax_from == latesttaxdetails.tax_from && l.a(this.tax_mode, latesttaxdetails.tax_mode) && this.tax_upto == latesttaxdetails.tax_upto && l.a(this.vtTaxEntityByid, latesttaxdetails.vtTaxEntityByid);
    }

    public final String getCollected_by() {
        return this.collected_by;
    }

    public final Object getFlag() {
        return this.flag;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getTax_amt() {
        return this.tax_amt;
    }

    public final int getTax_fine() {
        return this.tax_fine;
    }

    public final long getTax_from() {
        return this.tax_from;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final long getTax_upto() {
        return this.tax_upto;
    }

    public final VtTaxEntityByid getVtTaxEntityByid() {
        return this.vtTaxEntityByid;
    }

    public int hashCode() {
        return (((((((((((((((((((this.collected_by.hashCode() * 31) + this.flag.hashCode()) * 31) + this.payment_mode.hashCode()) * 31) + Long.hashCode(this.rcpt_dt)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.tax_amt)) * 31) + Integer.hashCode(this.tax_fine)) * 31) + Long.hashCode(this.tax_from)) * 31) + this.tax_mode.hashCode()) * 31) + Long.hashCode(this.tax_upto)) * 31) + this.vtTaxEntityByid.hashCode();
    }

    public String toString() {
        return "Latesttaxdetails(collected_by=" + this.collected_by + ", flag=" + this.flag + ", payment_mode=" + this.payment_mode + ", rcpt_dt=" + this.rcpt_dt + ", regn_no=" + this.regn_no + ", tax_amt=" + this.tax_amt + ", tax_fine=" + this.tax_fine + ", tax_from=" + this.tax_from + ", tax_mode=" + this.tax_mode + ", tax_upto=" + this.tax_upto + ", vtTaxEntityByid=" + this.vtTaxEntityByid + ')';
    }
}
