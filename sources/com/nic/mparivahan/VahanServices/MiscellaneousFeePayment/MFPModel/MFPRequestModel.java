package com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MFPModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MFPRequestModel {
    private final String applNo;
    private final double feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MFPRequestModel(String str, double d10, int i10, int i11, String str2, String str3) {
        l.f(str2, "regnNo");
        l.f(str3, "stateCode");
        this.applNo = str;
        this.feeCharge = d10;
        this.officeCode = i10;
        this.purposeCode = i11;
        this.regnNo = str2;
        this.stateCode = str3;
    }

    public static /* synthetic */ MFPRequestModel copy$default(MFPRequestModel mFPRequestModel, String str, double d10, int i10, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mFPRequestModel.applNo;
        }
        if ((i12 & 2) != 0) {
            d10 = mFPRequestModel.feeCharge;
        }
        double d11 = d10;
        if ((i12 & 4) != 0) {
            i10 = mFPRequestModel.officeCode;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = mFPRequestModel.purposeCode;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str2 = mFPRequestModel.regnNo;
        }
        String str4 = str2;
        if ((i12 & 32) != 0) {
            str3 = mFPRequestModel.stateCode;
        }
        return mFPRequestModel.copy(str, d11, i13, i14, str4, str3);
    }

    public final String component1() {
        return this.applNo;
    }

    public final double component2() {
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

    public final MFPRequestModel copy(String str, double d10, int i10, int i11, String str2, String str3) {
        l.f(str2, "regnNo");
        String str4 = str3;
        l.f(str4, "stateCode");
        return new MFPRequestModel(str, d10, i10, i11, str2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFPRequestModel)) {
            return false;
        }
        MFPRequestModel mFPRequestModel = (MFPRequestModel) obj;
        return l.a(this.applNo, mFPRequestModel.applNo) && Double.compare(this.feeCharge, mFPRequestModel.feeCharge) == 0 && this.officeCode == mFPRequestModel.officeCode && this.purposeCode == mFPRequestModel.purposeCode && l.a(this.regnNo, mFPRequestModel.regnNo) && l.a(this.stateCode, mFPRequestModel.stateCode);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final double getFeeCharge() {
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
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.feeCharge)) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MFPRequestModel(applNo=" + this.applNo + ", feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
