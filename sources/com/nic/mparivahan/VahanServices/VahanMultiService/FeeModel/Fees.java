package com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Fees {
    private final int feeAmount;
    private final String feeHeadDescr;
    private final int fineAmount;
    private final int purCd;
    private final String servicecharge;
    private final int totalAmount;

    public Fees(int i10, String str, int i11, int i12, String str2, int i13) {
        this.feeAmount = i10;
        this.feeHeadDescr = str;
        this.fineAmount = i11;
        this.purCd = i12;
        this.servicecharge = str2;
        this.totalAmount = i13;
    }

    public static /* synthetic */ Fees copy$default(Fees fees, int i10, String str, int i11, int i12, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = fees.feeAmount;
        }
        if ((i14 & 2) != 0) {
            str = fees.feeHeadDescr;
        }
        String str3 = str;
        if ((i14 & 4) != 0) {
            i11 = fees.fineAmount;
        }
        int i15 = i11;
        if ((i14 & 8) != 0) {
            i12 = fees.purCd;
        }
        int i16 = i12;
        if ((i14 & 16) != 0) {
            str2 = fees.servicecharge;
        }
        String str4 = str2;
        if ((i14 & 32) != 0) {
            i13 = fees.totalAmount;
        }
        return fees.copy(i10, str3, i15, i16, str4, i13);
    }

    public final int component1() {
        return this.feeAmount;
    }

    public final String component2() {
        return this.feeHeadDescr;
    }

    public final int component3() {
        return this.fineAmount;
    }

    public final int component4() {
        return this.purCd;
    }

    public final String component5() {
        return this.servicecharge;
    }

    public final int component6() {
        return this.totalAmount;
    }

    public final Fees copy(int i10, String str, int i11, int i12, String str2, int i13) {
        return new Fees(i10, str, i11, i12, str2, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fees)) {
            return false;
        }
        Fees fees = (Fees) obj;
        return this.feeAmount == fees.feeAmount && l.a(this.feeHeadDescr, fees.feeHeadDescr) && this.fineAmount == fees.fineAmount && this.purCd == fees.purCd && l.a(this.servicecharge, fees.servicecharge) && this.totalAmount == fees.totalAmount;
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

    public final int getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.feeAmount) * 31;
        String str = this.feeHeadDescr;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.fineAmount)) * 31) + Integer.hashCode(this.purCd)) * 31;
        String str2 = this.servicecharge;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Integer.hashCode(this.totalAmount);
    }

    public String toString() {
        return "Fees(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", servicecharge=" + this.servicecharge + ", totalAmount=" + this.totalAmount + ')';
    }
}
