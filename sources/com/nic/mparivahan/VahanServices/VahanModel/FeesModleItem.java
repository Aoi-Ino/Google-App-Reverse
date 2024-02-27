package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class FeesModleItem {
    private final int feeAmount;
    private final String feeHeadDescr;
    private final double fineAmount;
    private final int purCd;
    private final String servicecharge;
    private final double totalAmount;

    public FeesModleItem(int i10, String str, String str2, double d10, int i11, double d11) {
        l.f(str, "feeHeadDescr");
        this.feeAmount = i10;
        this.feeHeadDescr = str;
        this.servicecharge = str2;
        this.fineAmount = d10;
        this.purCd = i11;
        this.totalAmount = d11;
    }

    public static /* synthetic */ FeesModleItem copy$default(FeesModleItem feesModleItem, int i10, String str, String str2, double d10, int i11, double d11, int i12, Object obj) {
        FeesModleItem feesModleItem2 = feesModleItem;
        return feesModleItem.copy((i12 & 1) != 0 ? feesModleItem2.feeAmount : i10, (i12 & 2) != 0 ? feesModleItem2.feeHeadDescr : str, (i12 & 4) != 0 ? feesModleItem2.servicecharge : str2, (i12 & 8) != 0 ? feesModleItem2.fineAmount : d10, (i12 & 16) != 0 ? feesModleItem2.purCd : i11, (i12 & 32) != 0 ? feesModleItem2.totalAmount : d11);
    }

    public final int component1() {
        return this.feeAmount;
    }

    public final String component2() {
        return this.feeHeadDescr;
    }

    public final String component3() {
        return this.servicecharge;
    }

    public final double component4() {
        return this.fineAmount;
    }

    public final int component5() {
        return this.purCd;
    }

    public final double component6() {
        return this.totalAmount;
    }

    public final FeesModleItem copy(int i10, String str, String str2, double d10, int i11, double d11) {
        l.f(str, "feeHeadDescr");
        return new FeesModleItem(i10, str, str2, d10, i11, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesModleItem)) {
            return false;
        }
        FeesModleItem feesModleItem = (FeesModleItem) obj;
        return this.feeAmount == feesModleItem.feeAmount && l.a(this.feeHeadDescr, feesModleItem.feeHeadDescr) && l.a(this.servicecharge, feesModleItem.servicecharge) && Double.compare(this.fineAmount, feesModleItem.fineAmount) == 0 && this.purCd == feesModleItem.purCd && Double.compare(this.totalAmount, feesModleItem.totalAmount) == 0;
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

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.feeAmount) * 31) + this.feeHeadDescr.hashCode()) * 31;
        String str = this.servicecharge;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.fineAmount)) * 31) + Integer.hashCode(this.purCd)) * 31) + Double.hashCode(this.totalAmount);
    }

    public String toString() {
        return "FeesModleItem(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", servicecharge=" + this.servicecharge + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", totalAmount=" + this.totalAmount + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeesModleItem(int i10, String str, String str2, double d10, int i11, double d11, int i12, g gVar) {
        this(i10, str, (i12 & 4) != 0 ? "0.0" : str2, d10, i11, d11);
    }
}
