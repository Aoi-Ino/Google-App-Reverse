package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UserLoginModel {
    private final String statusCode;
    private final String statusDesc;
    private final String token;

    public UserLoginModel(String str, String str2, String str3) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.token = str3;
    }

    public static /* synthetic */ UserLoginModel copy$default(UserLoginModel userLoginModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userLoginModel.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = userLoginModel.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str3 = userLoginModel.token;
        }
        return userLoginModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.token;
    }

    public final UserLoginModel copy(String str, String str2, String str3) {
        return new UserLoginModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLoginModel)) {
            return false;
        }
        UserLoginModel userLoginModel = (UserLoginModel) obj;
        return l.a(this.statusCode, userLoginModel.statusCode) && l.a(this.statusDesc, userLoginModel.statusDesc) && l.a(this.token, userLoginModel.token);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.token;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "UserLoginModel(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", token=" + this.token + ')';
    }
}
