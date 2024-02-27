package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final Object developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;
    private final String timeStamp;

    public ApiMessage(Object obj, String str, Object obj2, int i10, String str2) {
        l.f(obj, "developerMessage");
        l.f(str, "message");
        l.f(obj2, "messageParam");
        l.f(str2, "timeStamp");
        this.developerMessage = obj;
        this.message = str;
        this.messageParam = obj2;
        this.statusCode = i10;
        this.timeStamp = str2;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, Object obj, String str, Object obj2, int i10, String str2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = apiMessage.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str = apiMessage.message;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            obj2 = apiMessage.messageParam;
        }
        Object obj4 = obj2;
        if ((i11 & 8) != 0) {
            i10 = apiMessage.statusCode;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str2 = apiMessage.timeStamp;
        }
        return apiMessage.copy(obj, str3, obj4, i12, str2);
    }

    public final Object component1() {
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

    public final String component5() {
        return this.timeStamp;
    }

    public final ApiMessage copy(Object obj, String str, Object obj2, int i10, String str2) {
        l.f(obj, "developerMessage");
        l.f(str, "message");
        l.f(obj2, "messageParam");
        l.f(str2, "timeStamp");
        return new ApiMessage(obj, str, obj2, i10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.developerMessage, apiMessage.developerMessage) && l.a(this.message, apiMessage.message) && l.a(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode && l.a(this.timeStamp, apiMessage.timeStamp);
    }

    public final Object getDeveloperMessage() {
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

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + this.messageParam.hashCode()) * 31) + Integer.hashCode(this.statusCode)) * 31) + this.timeStamp.hashCode();
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
