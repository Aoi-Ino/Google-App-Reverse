package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class MiscellaneousDto implements Serializable {
    private final int feeCharge;
    private final int officeCode;
    private final int purposeCode;
    private final String regnNo;
    private final String stateCode;

    public MiscellaneousDto(int i10, int i11, int i12, String str, String str2) {
        l.f(str, "regnNo");
        l.f(str2, "stateCode");
        this.feeCharge = i10;
        this.officeCode = i11;
        this.purposeCode = i12;
        this.regnNo = str;
        this.stateCode = str2;
    }

    public static /* synthetic */ MiscellaneousDto copy$default(MiscellaneousDto miscellaneousDto, int i10, int i11, int i12, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = miscellaneousDto.feeCharge;
        }
        if ((i13 & 2) != 0) {
            i11 = miscellaneousDto.officeCode;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = miscellaneousDto.purposeCode;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            str = miscellaneousDto.regnNo;
        }
        String str3 = str;
        if ((i13 & 16) != 0) {
            str2 = miscellaneousDto.stateCode;
        }
        return miscellaneousDto.copy(i10, i14, i15, str3, str2);
    }

    public final int component1() {
        return this.feeCharge;
    }

    public final int component2() {
        return this.officeCode;
    }

    public final int component3() {
        return this.purposeCode;
    }

    public final String component4() {
        return this.regnNo;
    }

    public final String component5() {
        return this.stateCode;
    }

    public final MiscellaneousDto copy(int i10, int i11, int i12, String str, String str2) {
        l.f(str, "regnNo");
        l.f(str2, "stateCode");
        return new MiscellaneousDto(i10, i11, i12, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiscellaneousDto)) {
            return false;
        }
        MiscellaneousDto miscellaneousDto = (MiscellaneousDto) obj;
        return this.feeCharge == miscellaneousDto.feeCharge && this.officeCode == miscellaneousDto.officeCode && this.purposeCode == miscellaneousDto.purposeCode && l.a(this.regnNo, miscellaneousDto.regnNo) && l.a(this.stateCode, miscellaneousDto.stateCode);
    }

    public final int getFeeCharge() {
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
        return (((((((Integer.hashCode(this.feeCharge) * 31) + Integer.hashCode(this.officeCode)) * 31) + Integer.hashCode(this.purposeCode)) * 31) + this.regnNo.hashCode()) * 31) + this.stateCode.hashCode();
    }

    public String toString() {
        return "MiscellaneousDto(feeCharge=" + this.feeCharge + ", officeCode=" + this.officeCode + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ')';
    }
}
