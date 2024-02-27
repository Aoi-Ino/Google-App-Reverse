package com.nic.mparivahan.VahanServices.VahanMultiService.Model;

import androidx.annotation.Keep;

@Keep
public final class AllowedPurposeCode {
    private final int purposeCode;

    public AllowedPurposeCode(int i10) {
        this.purposeCode = i10;
    }

    public static /* synthetic */ AllowedPurposeCode copy$default(AllowedPurposeCode allowedPurposeCode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = allowedPurposeCode.purposeCode;
        }
        return allowedPurposeCode.copy(i10);
    }

    public final int component1() {
        return this.purposeCode;
    }

    public final AllowedPurposeCode copy(int i10) {
        return new AllowedPurposeCode(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllowedPurposeCode) && this.purposeCode == ((AllowedPurposeCode) obj).purposeCode;
    }

    public final int getPurposeCode() {
        return this.purposeCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.purposeCode);
    }

    public String toString() {
        return "AllowedPurposeCode(purposeCode=" + this.purposeCode + ')';
    }
}
