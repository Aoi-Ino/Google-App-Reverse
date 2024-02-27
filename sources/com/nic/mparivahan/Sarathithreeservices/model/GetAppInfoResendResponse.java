package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetAppInfoResendResponse {
    @c("param")
    private final String param;
    @c("statusCode")
    private final String statusCode;
    @c("statusDesc")
    private final String statusDesc;

    public GetAppInfoResendResponse() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ GetAppInfoResendResponse copy$default(GetAppInfoResendResponse getAppInfoResendResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAppInfoResendResponse.statusDesc;
        }
        if ((i10 & 2) != 0) {
            str2 = getAppInfoResendResponse.param;
        }
        if ((i10 & 4) != 0) {
            str3 = getAppInfoResendResponse.statusCode;
        }
        return getAppInfoResendResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return this.statusDesc;
    }

    public final String component2() {
        return this.param;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final GetAppInfoResendResponse copy(String str, String str2, String str3) {
        return new GetAppInfoResendResponse(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAppInfoResendResponse)) {
            return false;
        }
        GetAppInfoResendResponse getAppInfoResendResponse = (GetAppInfoResendResponse) obj;
        return l.a(this.statusDesc, getAppInfoResendResponse.statusDesc) && l.a(this.param, getAppInfoResendResponse.param) && l.a(this.statusCode, getAppInfoResendResponse.statusCode);
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
        String str = this.statusDesc;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.param;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "GetAppInfoResendResponse(statusDesc=" + this.statusDesc + ", param=" + this.param + ", statusCode=" + this.statusCode + ')';
    }

    public GetAppInfoResendResponse(String str, String str2, String str3) {
        this.statusDesc = str;
        this.param = str2;
        this.statusCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAppInfoResendResponse(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
