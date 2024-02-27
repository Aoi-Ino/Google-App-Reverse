package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ApiMessage {
    private final String developerMessage;
    private final String message;
    private final String messageParam;
    private final int statusCode;
    private final String timeStamp;

    public ApiMessage(String str, String str2, String str3, int i10, String str4) {
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = str3;
        this.statusCode = i10;
        this.timeStamp = str4;
    }

    public static /* synthetic */ ApiMessage copy$default(ApiMessage apiMessage, String str, String str2, String str3, int i10, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = apiMessage.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = apiMessage.message;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = apiMessage.messageParam;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            i10 = apiMessage.statusCode;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str4 = apiMessage.timeStamp;
        }
        return apiMessage.copy(str, str5, str6, i12, str4);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.messageParam;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.timeStamp;
    }

    public final ApiMessage copy(String str, String str2, String str3, int i10, String str4) {
        return new ApiMessage(str, str2, str3, i10, str4);
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

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageParam() {
        return this.messageParam;
    }

    public final int getStatusCode() {
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
        String str3 = this.messageParam;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.statusCode)) * 31;
        String str4 = this.timeStamp;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "ApiMessage(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
