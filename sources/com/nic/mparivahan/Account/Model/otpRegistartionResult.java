package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class otpRegistartionResult {
    private final MparCitizenUserX mparCitizenUser;
    private final String param;
    private final String statusCode;
    private final String statusDesc;

    public otpRegistartionResult(MparCitizenUserX mparCitizenUserX, String str, String str2, String str3) {
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        this.mparCitizenUser = mparCitizenUserX;
        this.param = str;
        this.statusCode = str2;
        this.statusDesc = str3;
    }

    public static /* synthetic */ otpRegistartionResult copy$default(otpRegistartionResult otpregistartionresult, MparCitizenUserX mparCitizenUserX, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mparCitizenUserX = otpregistartionresult.mparCitizenUser;
        }
        if ((i10 & 2) != 0) {
            str = otpregistartionresult.param;
        }
        if ((i10 & 4) != 0) {
            str2 = otpregistartionresult.statusCode;
        }
        if ((i10 & 8) != 0) {
            str3 = otpregistartionresult.statusDesc;
        }
        return otpregistartionresult.copy(mparCitizenUserX, str, str2, str3);
    }

    public final MparCitizenUserX component1() {
        return this.mparCitizenUser;
    }

    public final String component2() {
        return this.param;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final otpRegistartionResult copy(MparCitizenUserX mparCitizenUserX, String str, String str2, String str3) {
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        return new otpRegistartionResult(mparCitizenUserX, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otpRegistartionResult)) {
            return false;
        }
        otpRegistartionResult otpregistartionresult = (otpRegistartionResult) obj;
        return l.a(this.mparCitizenUser, otpregistartionresult.mparCitizenUser) && l.a(this.param, otpregistartionresult.param) && l.a(this.statusCode, otpregistartionresult.statusCode) && l.a(this.statusDesc, otpregistartionresult.statusDesc);
    }

    public final MparCitizenUserX getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        MparCitizenUserX mparCitizenUserX = this.mparCitizenUser;
        int i10 = 0;
        int hashCode = (mparCitizenUserX == null ? 0 : mparCitizenUserX.hashCode()) * 31;
        String str = this.param;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode + i10) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "otpRegistartionResult(mparCitizenUser=" + this.mparCitizenUser + ", param=" + this.param + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
