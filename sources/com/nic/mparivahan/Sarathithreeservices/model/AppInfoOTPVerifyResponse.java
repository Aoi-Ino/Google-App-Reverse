package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class AppInfoOTPVerifyResponse {
    @c("statusCode")
    private final String statusCode;
    @c("statusDesc")
    private final String statusDesc;

    public AppInfoOTPVerifyResponse() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ AppInfoOTPVerifyResponse copy$default(AppInfoOTPVerifyResponse appInfoOTPVerifyResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appInfoOTPVerifyResponse.statusDesc;
        }
        if ((i10 & 2) != 0) {
            str2 = appInfoOTPVerifyResponse.statusCode;
        }
        return appInfoOTPVerifyResponse.copy(str, str2);
    }

    public final String component1() {
        return this.statusDesc;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final AppInfoOTPVerifyResponse copy(String str, String str2) {
        return new AppInfoOTPVerifyResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfoOTPVerifyResponse)) {
            return false;
        }
        AppInfoOTPVerifyResponse appInfoOTPVerifyResponse = (AppInfoOTPVerifyResponse) obj;
        return l.a(this.statusDesc, appInfoOTPVerifyResponse.statusDesc) && l.a(this.statusCode, appInfoOTPVerifyResponse.statusCode);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusDesc;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "AppInfoOTPVerifyResponse(statusDesc=" + this.statusDesc + ", statusCode=" + this.statusCode + ')';
    }

    public AppInfoOTPVerifyResponse(String str, String str2) {
        this.statusDesc = str;
        this.statusCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppInfoOTPVerifyResponse(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
