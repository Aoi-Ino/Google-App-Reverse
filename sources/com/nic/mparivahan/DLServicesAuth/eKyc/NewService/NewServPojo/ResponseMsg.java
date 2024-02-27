package com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ResponseMsg {
    private final String developerMessage;
    private final String message;
    private final int statusCode;

    public ResponseMsg(String str, String str2, int i10) {
        l.f(str, "developerMessage");
        l.f(str2, "message");
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = i10;
    }

    public static /* synthetic */ ResponseMsg copy$default(ResponseMsg responseMsg, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = responseMsg.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = responseMsg.message;
        }
        if ((i11 & 4) != 0) {
            i10 = responseMsg.statusCode;
        }
        return responseMsg.copy(str, str2, i10);
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

    public final ResponseMsg copy(String str, String str2, int i10) {
        l.f(str, "developerMessage");
        l.f(str2, "message");
        return new ResponseMsg(str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseMsg)) {
            return false;
        }
        ResponseMsg responseMsg = (ResponseMsg) obj;
        return l.a(this.developerMessage, responseMsg.developerMessage) && l.a(this.message, responseMsg.message) && this.statusCode == responseMsg.statusCode;
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
        return (((this.developerMessage.hashCode() * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.statusCode);
    }

    public String toString() {
        return "ResponseMsg(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }
}
