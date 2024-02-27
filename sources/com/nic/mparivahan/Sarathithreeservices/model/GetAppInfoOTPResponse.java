package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GetAppInfoOTPResponse {
    @c("param")
    private final String param;
    @c("recordId")
    private final Integer recordId;
    @c("statusCode")
    private final String statusCode;
    @c("statusDesc")
    private final String statusDesc;

    public GetAppInfoOTPResponse() {
        this((Integer) null, (String) null, (String) null, (String) null, 15, (g) null);
    }

    public static /* synthetic */ GetAppInfoOTPResponse copy$default(GetAppInfoOTPResponse getAppInfoOTPResponse, Integer num, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = getAppInfoOTPResponse.recordId;
        }
        if ((i10 & 2) != 0) {
            str = getAppInfoOTPResponse.statusDesc;
        }
        if ((i10 & 4) != 0) {
            str2 = getAppInfoOTPResponse.param;
        }
        if ((i10 & 8) != 0) {
            str3 = getAppInfoOTPResponse.statusCode;
        }
        return getAppInfoOTPResponse.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.recordId;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final String component3() {
        return this.param;
    }

    public final String component4() {
        return this.statusCode;
    }

    public final GetAppInfoOTPResponse copy(Integer num, String str, String str2, String str3) {
        return new GetAppInfoOTPResponse(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAppInfoOTPResponse)) {
            return false;
        }
        GetAppInfoOTPResponse getAppInfoOTPResponse = (GetAppInfoOTPResponse) obj;
        return l.a(this.recordId, getAppInfoOTPResponse.recordId) && l.a(this.statusDesc, getAppInfoOTPResponse.statusDesc) && l.a(this.param, getAppInfoOTPResponse.param) && l.a(this.statusCode, getAppInfoOTPResponse.statusCode);
    }

    public final String getParam() {
        return this.param;
    }

    public final Integer getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        Integer num = this.recordId;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.param;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "GetAppInfoOTPResponse(recordId=" + this.recordId + ", statusDesc=" + this.statusDesc + ", param=" + this.param + ", statusCode=" + this.statusCode + ')';
    }

    public GetAppInfoOTPResponse(Integer num, String str, String str2, String str3) {
        this.recordId = num;
        this.statusDesc = str;
        this.param = str2;
        this.statusCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAppInfoOTPResponse(Integer num, String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }
}
