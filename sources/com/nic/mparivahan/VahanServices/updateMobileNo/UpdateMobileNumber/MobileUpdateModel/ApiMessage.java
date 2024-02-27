package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final Integer statusCode;
    private final String timeStamp;

    public ApiMessage(String str, String str2, Object obj, Integer num, String str3) {
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = obj;
        this.statusCode = num;
        this.timeStamp = str3;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, Object obj, Integer num, String str3, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = apiMessage.message;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            obj = apiMessage.messageParam;
        }
        Object obj3 = obj;
        if ((i10 & 8) != 0) {
            num = apiMessage.statusCode;
        }
        Integer num2 = num;
        if ((i10 & 16) != 0) {
            str3 = apiMessage.timeStamp;
        }
        return apiMessage.copy(str, str4, obj3, num2, str3);
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

    public final Integer component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.timeStamp;
    }

    public final ApiMessage copy(String str, String str2, Object obj, Integer num, String str3) {
        return new ApiMessage(str, str2, obj, num, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessage)) {
            return false;
        }
        ApiMessage apiMessage = (ApiMessage) obj;
        return l.a(this.developerMessage, apiMessage.developerMessage) && l.a(this.message, apiMessage.message) && l.a(this.messageParam, apiMessage.messageParam) && l.a(this.statusCode, apiMessage.statusCode) && l.a(this.timeStamp, apiMessage.timeStamp);
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

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.messageParam;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num = this.statusCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.timeStamp;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
