package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ResponseMsgSubmit implements Serializable {
    @c("developerMessage")
    private final String developerMessage;
    @c("message")
    private final String message;
    @c("statusCode")
    private final Integer statusCode;

    public ResponseMsgSubmit() {
        this((String) null, (String) null, (Integer) null, 7, (g) null);
    }

    public static /* synthetic */ ResponseMsgSubmit copy$default(ResponseMsgSubmit responseMsgSubmit, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responseMsgSubmit.developerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = responseMsgSubmit.message;
        }
        if ((i10 & 4) != 0) {
            num = responseMsgSubmit.statusCode;
        }
        return responseMsgSubmit.copy(str, str2, num);
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

    public final ResponseMsgSubmit copy(String str, String str2, Integer num) {
        return new ResponseMsgSubmit(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseMsgSubmit)) {
            return false;
        }
        ResponseMsgSubmit responseMsgSubmit = (ResponseMsgSubmit) obj;
        return l.a(this.developerMessage, responseMsgSubmit.developerMessage) && l.a(this.message, responseMsgSubmit.message) && l.a(this.statusCode, responseMsgSubmit.statusCode);
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
        return "ResponseMsgSubmit(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseMsgSubmit(String str, String str2, Integer num) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseMsgSubmit(String str, String str2, Integer num, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }
}
