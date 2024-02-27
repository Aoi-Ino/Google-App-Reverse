package com.nic.mparivahan.VahanServices.CompoundingFee.ComModle;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Fees implements Serializable {
    private final boolean disableDropDown;
    private final Object dueDate;
    private final Object dueDateString;
    private final double exemptFeesAmount;
    private final double exemptFineAmount;
    private final int feeAmount;
    private final String feeHeadDescr;
    private final double fineAmount;
    private final Object fromDate;
    private final Object fromDateLable;
    private final Object noOfApplications;
    private final Object paymentId;
    private final boolean perRcpt;
    private final boolean perTrans;
    private final int purCd;
    private final boolean readOnlyFee;
    private final boolean renderFromDate;
    private final boolean renderUptoDate;
    private final double totalAmount;
    private final Object uptoDate;
    private final Object uptoDateLable;

    public Fees(boolean z10, Object obj, Object obj2, double d10, double d11, int i10, String str, double d12, Object obj3, Object obj4, Object obj5, Object obj6, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15, double d13, Object obj7, Object obj8) {
        String str2 = str;
        Object obj9 = obj3;
        Object obj10 = obj4;
        Object obj11 = obj5;
        Object obj12 = obj6;
        Object obj13 = obj7;
        Object obj14 = obj8;
        l.f(obj, "dueDate");
        l.f(obj2, "dueDateString");
        l.f(str2, "feeHeadDescr");
        l.f(obj9, "fromDate");
        l.f(obj10, "fromDateLable");
        l.f(obj11, "noOfApplications");
        l.f(obj12, "paymentId");
        l.f(obj13, "uptoDate");
        l.f(obj14, "uptoDateLable");
        this.disableDropDown = z10;
        this.dueDate = obj;
        this.dueDateString = obj2;
        this.exemptFeesAmount = d10;
        this.exemptFineAmount = d11;
        this.feeAmount = i10;
        this.feeHeadDescr = str2;
        this.fineAmount = d12;
        this.fromDate = obj9;
        this.fromDateLable = obj10;
        this.noOfApplications = obj11;
        this.paymentId = obj12;
        this.perRcpt = z11;
        this.perTrans = z12;
        this.purCd = i11;
        this.readOnlyFee = z13;
        this.renderFromDate = z14;
        this.renderUptoDate = z15;
        this.totalAmount = d13;
        this.uptoDate = obj13;
        this.uptoDateLable = obj14;
    }

    public static /* synthetic */ Fees copy$default(Fees fees, boolean z10, Object obj, Object obj2, double d10, double d11, int i10, String str, double d12, Object obj3, Object obj4, Object obj5, Object obj6, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15, double d13, Object obj7, Object obj8, int i12, Object obj9) {
        Fees fees2 = fees;
        int i13 = i12;
        return fees.copy((i13 & 1) != 0 ? fees2.disableDropDown : z10, (i13 & 2) != 0 ? fees2.dueDate : obj, (i13 & 4) != 0 ? fees2.dueDateString : obj2, (i13 & 8) != 0 ? fees2.exemptFeesAmount : d10, (i13 & 16) != 0 ? fees2.exemptFineAmount : d11, (i13 & 32) != 0 ? fees2.feeAmount : i10, (i13 & 64) != 0 ? fees2.feeHeadDescr : str, (i13 & 128) != 0 ? fees2.fineAmount : d12, (i13 & 256) != 0 ? fees2.fromDate : obj3, (i13 & 512) != 0 ? fees2.fromDateLable : obj4, (i13 & 1024) != 0 ? fees2.noOfApplications : obj5, (i13 & 2048) != 0 ? fees2.paymentId : obj6, (i13 & 4096) != 0 ? fees2.perRcpt : z11, (i13 & 8192) != 0 ? fees2.perTrans : z12, (i13 & 16384) != 0 ? fees2.purCd : i11, (i13 & 32768) != 0 ? fees2.readOnlyFee : z13, (i13 & 65536) != 0 ? fees2.renderFromDate : z14, (i13 & 131072) != 0 ? fees2.renderUptoDate : z15, (i13 & 262144) != 0 ? fees2.totalAmount : d13, (i13 & 524288) != 0 ? fees2.uptoDate : obj7, (i13 & 1048576) != 0 ? fees2.uptoDateLable : obj8);
    }

    public final boolean component1() {
        return this.disableDropDown;
    }

    public final Object component10() {
        return this.fromDateLable;
    }

    public final Object component11() {
        return this.noOfApplications;
    }

    public final Object component12() {
        return this.paymentId;
    }

    public final boolean component13() {
        return this.perRcpt;
    }

    public final boolean component14() {
        return this.perTrans;
    }

    public final int component15() {
        return this.purCd;
    }

    public final boolean component16() {
        return this.readOnlyFee;
    }

    public final boolean component17() {
        return this.renderFromDate;
    }

    public final boolean component18() {
        return this.renderUptoDate;
    }

    public final double component19() {
        return this.totalAmount;
    }

    public final Object component2() {
        return this.dueDate;
    }

    public final Object component20() {
        return this.uptoDate;
    }

    public final Object component21() {
        return this.uptoDateLable;
    }

    public final Object component3() {
        return this.dueDateString;
    }

    public final double component4() {
        return this.exemptFeesAmount;
    }

    public final double component5() {
        return this.exemptFineAmount;
    }

    public final int component6() {
        return this.feeAmount;
    }

    public final String component7() {
        return this.feeHeadDescr;
    }

    public final double component8() {
        return this.fineAmount;
    }

    public final Object component9() {
        return this.fromDate;
    }

    public final Fees copy(boolean z10, Object obj, Object obj2, double d10, double d11, int i10, String str, double d12, Object obj3, Object obj4, Object obj5, Object obj6, boolean z11, boolean z12, int i11, boolean z13, boolean z14, boolean z15, double d13, Object obj7, Object obj8) {
        boolean z16 = z10;
        l.f(obj, "dueDate");
        l.f(obj2, "dueDateString");
        l.f(str, "feeHeadDescr");
        l.f(obj3, "fromDate");
        l.f(obj4, "fromDateLable");
        l.f(obj5, "noOfApplications");
        l.f(obj6, "paymentId");
        l.f(obj7, "uptoDate");
        l.f(obj8, "uptoDateLable");
        return new Fees(z10, obj, obj2, d10, d11, i10, str, d12, obj3, obj4, obj5, obj6, z11, z12, i11, z13, z14, z15, d13, obj7, obj8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fees)) {
            return false;
        }
        Fees fees = (Fees) obj;
        return this.disableDropDown == fees.disableDropDown && l.a(this.dueDate, fees.dueDate) && l.a(this.dueDateString, fees.dueDateString) && Double.compare(this.exemptFeesAmount, fees.exemptFeesAmount) == 0 && Double.compare(this.exemptFineAmount, fees.exemptFineAmount) == 0 && this.feeAmount == fees.feeAmount && l.a(this.feeHeadDescr, fees.feeHeadDescr) && Double.compare(this.fineAmount, fees.fineAmount) == 0 && l.a(this.fromDate, fees.fromDate) && l.a(this.fromDateLable, fees.fromDateLable) && l.a(this.noOfApplications, fees.noOfApplications) && l.a(this.paymentId, fees.paymentId) && this.perRcpt == fees.perRcpt && this.perTrans == fees.perTrans && this.purCd == fees.purCd && this.readOnlyFee == fees.readOnlyFee && this.renderFromDate == fees.renderFromDate && this.renderUptoDate == fees.renderUptoDate && Double.compare(this.totalAmount, fees.totalAmount) == 0 && l.a(this.uptoDate, fees.uptoDate) && l.a(this.uptoDateLable, fees.uptoDateLable);
    }

    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    public final Object getDueDate() {
        return this.dueDate;
    }

    public final Object getDueDateString() {
        return this.dueDateString;
    }

    public final double getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    public final double getExemptFineAmount() {
        return this.exemptFineAmount;
    }

    public final int getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final double getFineAmount() {
        return this.fineAmount;
    }

    public final Object getFromDate() {
        return this.fromDate;
    }

    public final Object getFromDateLable() {
        return this.fromDateLable;
    }

    public final Object getNoOfApplications() {
        return this.noOfApplications;
    }

    public final Object getPaymentId() {
        return this.paymentId;
    }

    public final boolean getPerRcpt() {
        return this.perRcpt;
    }

    public final boolean getPerTrans() {
        return this.perTrans;
    }

    public final int getPurCd() {
        return this.purCd;
    }

    public final boolean getReadOnlyFee() {
        return this.readOnlyFee;
    }

    public final boolean getRenderFromDate() {
        return this.renderFromDate;
    }

    public final boolean getRenderUptoDate() {
        return this.renderUptoDate;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final Object getUptoDate() {
        return this.uptoDate;
    }

    public final Object getUptoDateLable() {
        return this.uptoDateLable;
    }

    public int hashCode() {
        boolean z10 = this.disableDropDown;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode = (((((((((((((((((((((((z10 ? 1 : 0) * true) + this.dueDate.hashCode()) * 31) + this.dueDateString.hashCode()) * 31) + Double.hashCode(this.exemptFeesAmount)) * 31) + Double.hashCode(this.exemptFineAmount)) * 31) + Integer.hashCode(this.feeAmount)) * 31) + this.feeHeadDescr.hashCode()) * 31) + Double.hashCode(this.fineAmount)) * 31) + this.fromDate.hashCode()) * 31) + this.fromDateLable.hashCode()) * 31) + this.noOfApplications.hashCode()) * 31) + this.paymentId.hashCode()) * 31;
        boolean z12 = this.perRcpt;
        if (z12) {
            z12 = true;
        }
        int i10 = (hashCode + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.perTrans;
        if (z13) {
            z13 = true;
        }
        int hashCode2 = (((i10 + (z13 ? 1 : 0)) * 31) + Integer.hashCode(this.purCd)) * 31;
        boolean z14 = this.readOnlyFee;
        if (z14) {
            z14 = true;
        }
        int i11 = (hashCode2 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.renderFromDate;
        if (z15) {
            z15 = true;
        }
        int i12 = (i11 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.renderUptoDate;
        if (!z16) {
            z11 = z16;
        }
        return ((((((i12 + (z11 ? 1 : 0)) * 31) + Double.hashCode(this.totalAmount)) * 31) + this.uptoDate.hashCode()) * 31) + this.uptoDateLable.hashCode();
    }

    public String toString() {
        return "Fees(disableDropDown=" + this.disableDropDown + ", dueDate=" + this.dueDate + ", dueDateString=" + this.dueDateString + ", exemptFeesAmount=" + this.exemptFeesAmount + ", exemptFineAmount=" + this.exemptFineAmount + ", feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", fromDate=" + this.fromDate + ", fromDateLable=" + this.fromDateLable + ", noOfApplications=" + this.noOfApplications + ", paymentId=" + this.paymentId + ", perRcpt=" + this.perRcpt + ", perTrans=" + this.perTrans + ", purCd=" + this.purCd + ", readOnlyFee=" + this.readOnlyFee + ", renderFromDate=" + this.renderFromDate + ", renderUptoDate=" + this.renderUptoDate + ", totalAmount=" + this.totalAmount + ", uptoDate=" + this.uptoDate + ", uptoDateLable=" + this.uptoDateLable + ')';
    }
}
