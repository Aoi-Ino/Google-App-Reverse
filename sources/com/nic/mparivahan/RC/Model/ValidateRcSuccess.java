package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ValidateRcSuccess {
    private final String statusCode;
    private final String statusDesc;

    public ValidateRcSuccess(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ ValidateRcSuccess copy$default(ValidateRcSuccess validateRcSuccess, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validateRcSuccess.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = validateRcSuccess.statusDesc;
        }
        return validateRcSuccess.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ValidateRcSuccess copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new ValidateRcSuccess(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateRcSuccess)) {
            return false;
        }
        ValidateRcSuccess validateRcSuccess = (ValidateRcSuccess) obj;
        return l.a(this.statusCode, validateRcSuccess.statusCode) && l.a(this.statusDesc, validateRcSuccess.statusDesc);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (this.statusCode.hashCode() * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ValidateRcSuccess(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
