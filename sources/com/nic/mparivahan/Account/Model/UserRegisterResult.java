package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UserRegisterResult {
    private final String statusCode;
    private final String statusDesc;

    public UserRegisterResult(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ UserRegisterResult copy$default(UserRegisterResult userRegisterResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userRegisterResult.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = userRegisterResult.statusDesc;
        }
        return userRegisterResult.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final UserRegisterResult copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new UserRegisterResult(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRegisterResult)) {
            return false;
        }
        UserRegisterResult userRegisterResult = (UserRegisterResult) obj;
        return l.a(this.statusCode, userRegisterResult.statusCode) && l.a(this.statusDesc, userRegisterResult.statusDesc);
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
        return "UserRegisterResult(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
