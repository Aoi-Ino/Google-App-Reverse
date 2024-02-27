package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessageX {
    private final String developerMessage;
    private final String message;
    private final int statusCode;

    public ApiMessageX(String str, String str2, int i10) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = i10;
    }

    public static /* synthetic */ ApiMessageX copy$default(ApiMessageX apiMessageX, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = apiMessageX.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = apiMessageX.message;
        }
        if ((i11 & 4) != 0) {
            i10 = apiMessageX.statusCode;
        }
        return apiMessageX.copy(str, str2, i10);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.statusCode;
    }

    public final ApiMessageX copy(String str, String str2, int i10) {
        return new ApiMessageX(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessageX)) {
            return false;
        }
        ApiMessageX apiMessageX = (ApiMessageX) obj;
        return l.a(this.developerMessage, apiMessageX.developerMessage) && l.a(this.message, apiMessageX.message) && this.statusCode == apiMessageX.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessageX(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }
}
