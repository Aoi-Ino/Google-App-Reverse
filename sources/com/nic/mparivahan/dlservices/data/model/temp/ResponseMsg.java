package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ResponseMsg {
    @c("developerMessage")
    private final String developerMessage;
    @c("message")
    private final String message;
    @c("statusCode")
    private final Integer statusCode;

    public ResponseMsg() {
        this((String) null, (String) null, (Integer) null, 7, (g) null);
    }

    public static /* synthetic */ ResponseMsg copy$default(ResponseMsg responseMsg, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseMsg.developerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = responseMsg.message;
        }
        if ((i10 & 4) != 0) {
            num = responseMsg.statusCode;
        }
        return responseMsg.copy(str, str2, num);
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

    public final ResponseMsg copy(String str, String str2, Integer num) {
        return new ResponseMsg(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseMsg)) {
            return false;
        }
        ResponseMsg responseMsg = (ResponseMsg) obj;
        return l.a(this.developerMessage, responseMsg.developerMessage) && l.a(this.message, responseMsg.message) && l.a(this.statusCode, responseMsg.statusCode);
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
        return "ResponseMsg(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseMsg(String str, String str2, Integer num) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseMsg(String str, String str2, Integer num, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }
}
