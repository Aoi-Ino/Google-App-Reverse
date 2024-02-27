package com.nic.mparivahan.VahanServices.DuplicateFitness.RCReleaseModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final Integer statusCode;

    public ApiMessage(String str, String str2, Integer num) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = apiMessage.message;
        }
        if ((i10 & 4) != 0) {
            num = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str2, num);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final String component2() {
        return this.message;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final ApiMessage copy(String str, String str2, Integer num) {
        return new ApiMessage(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.developerMessage, apiMessage.developerMessage) && l.a(this.message, apiMessage.message) && l.a(this.statusCode, apiMessage.statusCode);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }
}
