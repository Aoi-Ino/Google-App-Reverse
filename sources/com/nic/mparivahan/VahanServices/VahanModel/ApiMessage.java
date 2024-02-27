package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String data;
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;

    public ApiMessage(String str, String str2, String str3, Object obj, int i10) {
        this.data = str;
        this.developerMessage = str2;
        this.message = str3;
        this.messageParam = obj;
        this.statusCode = i10;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, String str3, Object obj, int i10, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = apiMessage.data;
        }
        if ((i11 & 2) != 0) {
            str2 = apiMessage.developerMessage;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = apiMessage.message;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            obj = apiMessage.messageParam;
        }
        Object obj3 = obj;
        if ((i11 & 16) != 0) {
            i10 = apiMessage.statusCode;
        }
        return apiMessage.copy(str, str4, str5, obj3, i10);
    }

    public final String component1() {
        return this.data;
    }

    public final String component2() {
        return this.developerMessage;
    }

    public final String component3() {
        return this.message;
    }

    public final Object component4() {
        return this.messageParam;
    }

    public final int component5() {
        return this.statusCode;
    }

    public final ApiMessage copy(String str, String str2, String str3, Object obj, int i10) {
        return new ApiMessage(str, str2, str3, obj, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.data, apiMessage.data) && l.a(this.developerMessage, apiMessage.developerMessage) && l.a(this.message, apiMessage.message) && l.a(this.messageParam, apiMessage.messageParam) && this.statusCode == apiMessage.statusCode;
    }

    public final String getData() {
        return this.data;
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
        String str = this.data;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.developerMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.messageParam;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return ((hashCode3 + i10) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ApiMessage(data=" + this.data + ", developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ')';
    }
}
