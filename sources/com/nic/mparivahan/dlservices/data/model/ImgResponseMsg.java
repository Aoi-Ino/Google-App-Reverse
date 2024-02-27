package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ImgResponseMsg {
    @c("developerMessage")
    private final String developerMessage;
    @c("message")
    private final String message;
    @c("statusCode")
    private final Integer statusCode;

    public ImgResponseMsg() {
        this((String) null, (String) null, (Integer) null, 7, (g) null);
    }

    public static /* synthetic */ ImgResponseMsg copy$default(ImgResponseMsg imgResponseMsg, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = imgResponseMsg.developerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = imgResponseMsg.message;
        }
        if ((i10 & 4) != 0) {
            num = imgResponseMsg.statusCode;
        }
        return imgResponseMsg.copy(str, str2, num);
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

    public final ImgResponseMsg copy(String str, String str2, Integer num) {
        return new ImgResponseMsg(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImgResponseMsg)) {
            return false;
        }
        ImgResponseMsg imgResponseMsg = (ImgResponseMsg) obj;
        return l.a(this.developerMessage, imgResponseMsg.developerMessage) && l.a(this.message, imgResponseMsg.message) && l.a(this.statusCode, imgResponseMsg.statusCode);
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
        return "ImgResponseMsg(developerMessage=" + this.developerMessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ImgResponseMsg(String str, String str2, Integer num) {
        this.developerMessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImgResponseMsg(String str, String str2, Integer num, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }
}
