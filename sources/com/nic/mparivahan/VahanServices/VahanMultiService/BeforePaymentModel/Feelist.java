package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class Feelist implements Serializable {
    private final boolean disableDropDown;
    private final String dueDate;
    private final String dueDateString;
    private final int exemptFeesAmount;
    private final int exemptFineAmount;
    private final int feeAmount;
    private final String feeHeadDescr;
    private final int fineAmount;
    private final String fromDate;
    private final String fromDateLable;
    private final String noOfApplications;
    private final String paymentId;
    private final boolean perRcpt;
    private final boolean perTrans;
    private final int purCd;
    private final boolean readOnlyFee;
    private final boolean renderFromDate;
    private final boolean renderUptoDate;
    private final int servicecharge;
    private final int totalAmount;
    private final String uptoDate;
    private final String uptoDateLable;

    public Feelist(boolean z10, String str, String str2, int i10, int i11, int i12, String str3, int i13, String str4, String str5, String str6, String str7, boolean z11, boolean z12, int i14, boolean z13, boolean z14, boolean z15, int i15, int i16, String str8, String str9) {
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        String str16 = str9;
        l.f(str, "dueDate");
        l.f(str2, "dueDateString");
        l.f(str10, "feeHeadDescr");
        l.f(str11, "fromDate");
        l.f(str12, "fromDateLable");
        l.f(str13, "noOfApplications");
        l.f(str14, "paymentId");
        l.f(str15, "uptoDate");
        l.f(str16, "uptoDateLable");
        this.disableDropDown = z10;
        this.dueDate = str;
        this.dueDateString = str2;
        this.exemptFeesAmount = i10;
        this.exemptFineAmount = i11;
        this.feeAmount = i12;
        this.feeHeadDescr = str10;
        this.fineAmount = i13;
        this.fromDate = str11;
        this.fromDateLable = str12;
        this.noOfApplications = str13;
        this.paymentId = str14;
        this.perRcpt = z11;
        this.perTrans = z12;
        this.purCd = i14;
        this.readOnlyFee = z13;
        this.renderFromDate = z14;
        this.renderUptoDate = z15;
        this.servicecharge = i15;
        this.totalAmount = i16;
        this.uptoDate = str15;
        this.uptoDateLable = str16;
    }

    public static /* synthetic */ Feelist copy$default(Feelist feelist, boolean z10, String str, String str2, int i10, int i11, int i12, String str3, int i13, String str4, String str5, String str6, String str7, boolean z11, boolean z12, int i14, boolean z13, boolean z14, boolean z15, int i15, int i16, String str8, String str9, int i17, Object obj) {
        Feelist feelist2 = feelist;
        int i18 = i17;
        return feelist.copy((i18 & 1) != 0 ? feelist2.disableDropDown : z10, (i18 & 2) != 0 ? feelist2.dueDate : str, (i18 & 4) != 0 ? feelist2.dueDateString : str2, (i18 & 8) != 0 ? feelist2.exemptFeesAmount : i10, (i18 & 16) != 0 ? feelist2.exemptFineAmount : i11, (i18 & 32) != 0 ? feelist2.feeAmount : i12, (i18 & 64) != 0 ? feelist2.feeHeadDescr : str3, (i18 & 128) != 0 ? feelist2.fineAmount : i13, (i18 & 256) != 0 ? feelist2.fromDate : str4, (i18 & 512) != 0 ? feelist2.fromDateLable : str5, (i18 & 1024) != 0 ? feelist2.noOfApplications : str6, (i18 & 2048) != 0 ? feelist2.paymentId : str7, (i18 & 4096) != 0 ? feelist2.perRcpt : z11, (i18 & 8192) != 0 ? feelist2.perTrans : z12, (i18 & 16384) != 0 ? feelist2.purCd : i14, (i18 & 32768) != 0 ? feelist2.readOnlyFee : z13, (i18 & 65536) != 0 ? feelist2.renderFromDate : z14, (i18 & 131072) != 0 ? feelist2.renderUptoDate : z15, (i18 & 262144) != 0 ? feelist2.servicecharge : i15, (i18 & 524288) != 0 ? feelist2.totalAmount : i16, (i18 & 1048576) != 0 ? feelist2.uptoDate : str8, (i18 & 2097152) != 0 ? feelist2.uptoDateLable : str9);
    }

    public final boolean component1() {
        return this.disableDropDown;
    }

    public final String component10() {
        return this.fromDateLable;
    }

    public final String component11() {
        return this.noOfApplications;
    }

    public final String component12() {
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

    public final int component19() {
        return this.servicecharge;
    }

    public final String component2() {
        return this.dueDate;
    }

    public final int component20() {
        return this.totalAmount;
    }

    public final String component21() {
        return this.uptoDate;
    }

    public final String component22() {
        return this.uptoDateLable;
    }

    public final String component3() {
        return this.dueDateString;
    }

    public final int component4() {
        return this.exemptFeesAmount;
    }

    public final int component5() {
        return this.exemptFineAmount;
    }

    public final int component6() {
        return this.feeAmount;
    }

    public final String component7() {
        return this.feeHeadDescr;
    }

    public final int component8() {
        return this.fineAmount;
    }

    public final String component9() {
        return this.fromDate;
    }

    public final Feelist copy(boolean z10, String str, String str2, int i10, int i11, int i12, String str3, int i13, String str4, String str5, String str6, String str7, boolean z11, boolean z12, int i14, boolean z13, boolean z14, boolean z15, int i15, int i16, String str8, String str9) {
        boolean z16 = z10;
        l.f(str, "dueDate");
        l.f(str2, "dueDateString");
        l.f(str3, "feeHeadDescr");
        l.f(str4, "fromDate");
        l.f(str5, "fromDateLable");
        l.f(str6, "noOfApplications");
        l.f(str7, "paymentId");
        l.f(str8, "uptoDate");
        l.f(str9, "uptoDateLable");
        return new Feelist(z10, str, str2, i10, i11, i12, str3, i13, str4, str5, str6, str7, z11, z12, i14, z13, z14, z15, i15, i16, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feelist)) {
            return false;
        }
        Feelist feelist = (Feelist) obj;
        return this.disableDropDown == feelist.disableDropDown && l.a(this.dueDate, feelist.dueDate) && l.a(this.dueDateString, feelist.dueDateString) && this.exemptFeesAmount == feelist.exemptFeesAmount && this.exemptFineAmount == feelist.exemptFineAmount && this.feeAmount == feelist.feeAmount && l.a(this.feeHeadDescr, feelist.feeHeadDescr) && this.fineAmount == feelist.fineAmount && l.a(this.fromDate, feelist.fromDate) && l.a(this.fromDateLable, feelist.fromDateLable) && l.a(this.noOfApplications, feelist.noOfApplications) && l.a(this.paymentId, feelist.paymentId) && this.perRcpt == feelist.perRcpt && this.perTrans == feelist.perTrans && this.purCd == feelist.purCd && this.readOnlyFee == feelist.readOnlyFee && this.renderFromDate == feelist.renderFromDate && this.renderUptoDate == feelist.renderUptoDate && this.servicecharge == feelist.servicecharge && this.totalAmount == feelist.totalAmount && l.a(this.uptoDate, feelist.uptoDate) && l.a(this.uptoDateLable, feelist.uptoDateLable);
    }

    public final boolean getDisableDropDown() {
        return this.disableDropDown;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getDueDateString() {
        return this.dueDateString;
    }

    public final int getExemptFeesAmount() {
        return this.exemptFeesAmount;
    }

    public final int getExemptFineAmount() {
        return this.exemptFineAmount;
    }

    public final int getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final int getFineAmount() {
        return this.fineAmount;
    }

    public final String getFromDate() {
        return this.fromDate;
    }

    public final String getFromDateLable() {
        return this.fromDateLable;
    }

    public final String getNoOfApplications() {
        return this.noOfApplications;
    }

    public final String getPaymentId() {
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

    public final int getServicecharge() {
        return this.servicecharge;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final String getUptoDate() {
        return this.uptoDate;
    }

    public final String getUptoDateLable() {
        return this.uptoDateLable;
    }

    public int hashCode() {
        boolean z10 = this.disableDropDown;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int hashCode = (((((((((((((((((((((((z10 ? 1 : 0) * true) + this.dueDate.hashCode()) * 31) + this.dueDateString.hashCode()) * 31) + Integer.hashCode(this.exemptFeesAmount)) * 31) + Integer.hashCode(this.exemptFineAmount)) * 31) + Integer.hashCode(this.feeAmount)) * 31) + this.feeHeadDescr.hashCode()) * 31) + Integer.hashCode(this.fineAmount)) * 31) + this.fromDate.hashCode()) * 31) + this.fromDateLable.hashCode()) * 31) + this.noOfApplications.hashCode()) * 31) + this.paymentId.hashCode()) * 31;
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
        return ((((((((i12 + (z11 ? 1 : 0)) * 31) + Integer.hashCode(this.servicecharge)) * 31) + Integer.hashCode(this.totalAmount)) * 31) + this.uptoDate.hashCode()) * 31) + this.uptoDateLable.hashCode();
    }

    public String toString() {
        return "Feelist(disableDropDown=" + this.disableDropDown + ", dueDate=" + this.dueDate + ", dueDateString=" + this.dueDateString + ", exemptFeesAmount=" + this.exemptFeesAmount + ", exemptFineAmount=" + this.exemptFineAmount + ", feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", fromDate=" + this.fromDate + ", fromDateLable=" + this.fromDateLable + ", noOfApplications=" + this.noOfApplications + ", paymentId=" + this.paymentId + ", perRcpt=" + this.perRcpt + ", perTrans=" + this.perTrans + ", purCd=" + this.purCd + ", readOnlyFee=" + this.readOnlyFee + ", renderFromDate=" + this.renderFromDate + ", renderUptoDate=" + this.renderUptoDate + ", servicecharge=" + this.servicecharge + ", totalAmount=" + this.totalAmount + ", uptoDate=" + this.uptoDate + ", uptoDateLable=" + this.uptoDateLable + ')';
    }
}
