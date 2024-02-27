package com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;

    public ApiMessage(String str, String str2, Object obj, int i10) {
        l.f(str, "developerMessage");
        l.f(str2, "message");
        l.f(obj, "messageParam");
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = obj;
        this.statusCode = i10;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = apiMessage.message;
        }
        if ((i11 & 4) != 0) {
            obj = apiMessage.messageParam;
        }
        if ((i11 & 8) != 0) {
            i10 = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str2, obj, i10);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final String component2() {
        return this.message;
    }

    public final Object component3() {
        return this.messageParam;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final ApiMessage copy(String str, String str2, Object obj, int i10) {
        l.f(str, "developerMessage");
        l.f(str2, "message");
        l.f(obj, "messageParam");
        return new ApiMessage(str, str2, obj, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.developerMessage, apiMessage.developerMessage) && l.a(this.message, apiMessage.message) && l.a(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getMessageParam() {
        return this.messageParam;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (((((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + this.messageParam.hashCode()) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ')';
    }
}
