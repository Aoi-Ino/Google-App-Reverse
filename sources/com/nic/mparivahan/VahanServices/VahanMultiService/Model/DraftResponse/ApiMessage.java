package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;
    private final int statusCode;

    public ApiMessage(String str, int i10) {
        this.developerMessage = str;
        this.statusCode = i10;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i11 & 2) != 0) {
            i10 = apiMessage.statusCode;
        }
        return apiMessage.copy(str, i10);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final ApiMessage copy(String str, int i10) {
        return new ApiMessage(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.developerMessage, apiMessage.developerMessage) && this.statusCode == apiMessage.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", statusCode=" + this.statusCode + ')';
    }
}
