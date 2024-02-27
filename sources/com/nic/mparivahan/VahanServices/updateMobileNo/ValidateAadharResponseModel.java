package com.nic.mparivahan.VahanServices.updateMobileNo;

import androidx.annotation.Keep;

@Keep
public final class ValidateAadharResponseModel {
    private final boolean status;

    public ValidateAadharResponseModel(boolean z10) {
        this.status = z10;
    }

    public static /* synthetic */ ValidateAadharResponseModel copy$default(ValidateAadharResponseModel validateAadharResponseModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = validateAadharResponseModel.status;
        }
        return validateAadharResponseModel.copy(z10);
    }

    public final boolean component1() {
        return this.status;
    }

    public final ValidateAadharResponseModel copy(boolean z10) {
        return new ValidateAadharResponseModel(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ValidateAadharResponseModel) && this.status == ((ValidateAadharResponseModel) obj).status;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public int hashCode() {
        boolean z10 = this.status;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return "ValidateAadharResponseModel(status=" + this.status + ')';
    }
}
