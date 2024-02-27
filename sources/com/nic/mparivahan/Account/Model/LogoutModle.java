package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class LogoutModle {
    private final String statusCode;
    private final String statusDesc;

    public LogoutModle(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ LogoutModle copy$default(LogoutModle logoutModle, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logoutModle.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = logoutModle.statusDesc;
        }
        return logoutModle.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final LogoutModle copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new LogoutModle(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoutModle)) {
            return false;
        }
        LogoutModle logoutModle = (LogoutModle) obj;
        return l.a(this.statusCode, logoutModle.statusCode) && l.a(this.statusDesc, logoutModle.statusDesc);
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
        return "LogoutModle(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
