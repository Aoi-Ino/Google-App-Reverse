package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FeeDobj {
    private final String feeAmount;
    private final String feeHeadDescr;
    private final String fineAmount;
    private final Integer purCd;
    private final String servicecharge;
    private final String totalAmount;

    public FeeDobj(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.feeAmount = str;
        this.feeHeadDescr = str2;
        this.fineAmount = str3;
        this.purCd = num;
        this.totalAmount = str4;
        this.servicecharge = str5;
    }

    public static /* synthetic */ FeeDobj copy$default(FeeDobj feeDobj, String str, String str2, String str3, Integer num, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = feeDobj.feeAmount;
        }
        if ((i10 & 2) != 0) {
            str2 = feeDobj.feeHeadDescr;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = feeDobj.fineAmount;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            num = feeDobj.purCd;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            str4 = feeDobj.totalAmount;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = feeDobj.servicecharge;
        }
        return feeDobj.copy(str, str6, str7, num2, str8, str5);
    }

    public final String component1() {
        return this.feeAmount;
    }

    public final String component2() {
        return this.feeHeadDescr;
    }

    public final String component3() {
        return this.fineAmount;
    }

    public final Integer component4() {
        return this.purCd;
    }

    public final String component5() {
        return this.totalAmount;
    }

    public final String component6() {
        return this.servicecharge;
    }

    public final FeeDobj copy(String str, String str2, String str3, Integer num, String str4, String str5) {
        return new FeeDobj(str, str2, str3, num, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeeDobj)) {
            return false;
        }
        FeeDobj feeDobj = (FeeDobj) obj;
        return l.a(this.feeAmount, feeDobj.feeAmount) && l.a(this.feeHeadDescr, feeDobj.feeHeadDescr) && l.a(this.fineAmount, feeDobj.fineAmount) && l.a(this.purCd, feeDobj.purCd) && l.a(this.totalAmount, feeDobj.totalAmount) && l.a(this.servicecharge, feeDobj.servicecharge);
    }

    public final String getFeeAmount() {
        return this.feeAmount;
    }

    public final String getFeeHeadDescr() {
        return this.feeHeadDescr;
    }

    public final String getFineAmount() {
        return this.fineAmount;
    }

    public final Integer getPurCd() {
        return this.purCd;
    }

    public final String getServicecharge() {
        return this.servicecharge;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.feeAmount;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feeHeadDescr;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fineAmount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.purCd;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.totalAmount;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.servicecharge;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "FeeDobj(feeAmount=" + this.feeAmount + ", feeHeadDescr=" + this.feeHeadDescr + ", fineAmount=" + this.fineAmount + ", purCd=" + this.purCd + ", totalAmount=" + this.totalAmount + ", servicecharge=" + this.servicecharge + ')';
    }
}
