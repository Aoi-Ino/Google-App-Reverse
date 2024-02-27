package com.nic.mparivahan.VahanServices.CompoundingFee.CompoundModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CompoundRequest {
    private final String applNo;
    private final Double feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public CompoundRequest(String str, Double d10, int i10, int i11, String str2, String str3) {
        l.f(str2, "regnNo");
        l.f(str3, "stateCode");
        this.applNo = str;
        this.feeCharge = d10;
        this.officeCode = i10;
        this.purposeCode = i11;
        this.regnNo = str2;
        this.stateCode = str3;
    }

    public static /* synthetic */ CompoundRequest copy$default(CompoundRequest compoundRequest, String str, Double d10, int i10, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = compoundRequest.applNo;
        }
        if ((i12 & 2) != 0) {
            d10 = compoundRequest.feeCharge;
        }
        Double d11 = d10;
        if ((i12 & 4) != 0) {
            i10 = compoundRequest.officeCode;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = compoundRequest.purposeCode;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str2 = compoundRequest.regnNo;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            str3 = compoundRequest.stateCode;
        }
        return compoundRequest.copy(str, d11, i13, i14, str4, str3);
    }

    public final String component1() {
        return this.applNo;
    }

    public final Double component2() {
        return this.feeCharge;
    }

    public final int component3() {
        return this.officeCode;
    }

    public final int component4() {
        return this.purposeCode;
    }

    public final String component5() {
        return this.regnNo;
    }

    public final String component6() {
        return this.stateCode;
    }

    public final CompoundRequest copy(String str, Double d10, int i10, int i11, String str2, String str3) {
        l.f(str2, "regnNo");
        l.f(str3, "stateCode");
        return new CompoundRequest(str, d10, i10, i11, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompoundRequest)) {
            return false;
        }
        CompoundRequest compoundRequest = (CompoundRequest) obj;
        return l.a(this.applNo, compoundRequest.applNo) && l.a(this.feeCharge, compoundRequest.feeCharge) && this.officeCode == compoundRequest.officeCode && this.purposeCode == compoundRequest.purposeCode && l.a(this.regnNo, compoundRequest.regnNo) && l.a(this.stateCode, compoundRequest.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final Double getFeeCharge() {
        return this.feeCharge;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.feeCharge;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return ((((((((hashCode + i10) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "CompoundRequest(applNo=" + this.applNo + ", feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
