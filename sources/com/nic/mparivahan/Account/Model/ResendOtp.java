package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ResendOtp {
    private final String statusCode;
    private final String statusDesc;

    public ResendOtp(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ ResendOtp copy$default(ResendOtp resendOtp, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resendOtp.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = resendOtp.statusDesc;
        }
        return resendOtp.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ResendOtp copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new ResendOtp(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResendOtp)) {
            return false;
        }
        ResendOtp resendOtp = (ResendOtp) obj;
        return l.a(this.statusCode, resendOtp.statusCode) && l.a(this.statusDesc, resendOtp.statusDesc);
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
        return "ResendOtp(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
