package com.nic.mparivahan.Dl.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UpdateDocSuccessResponse {
    private String statusCode;
    private String statusDesc;

    public UpdateDocSuccessResponse(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ UpdateDocSuccessResponse copy$default(UpdateDocSuccessResponse updateDocSuccessResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateDocSuccessResponse.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = updateDocSuccessResponse.statusDesc;
        }
        return updateDocSuccessResponse.copy(str, str2);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final UpdateDocSuccessResponse copy(String str, String str2) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new UpdateDocSuccessResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateDocSuccessResponse)) {
            return false;
        }
        UpdateDocSuccessResponse updateDocSuccessResponse = (UpdateDocSuccessResponse) obj;
        return l.a(this.statusCode, updateDocSuccessResponse.statusCode) && l.a(this.statusDesc, updateDocSuccessResponse.statusDesc);
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

    public final void setStatusCode(String str) {
        l.f(str, "<set-?>");
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        l.f(str, "<set-?>");
        this.statusDesc = str;
    }

    public String toString() {
        return "UpdateDocSuccessResponse(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
