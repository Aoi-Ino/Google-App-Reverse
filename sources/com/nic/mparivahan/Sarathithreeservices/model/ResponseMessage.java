package com.nic.mparivahan.Sarathithreeservices.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class ResponseMessage implements Serializable {
    @c("developerMessage")
    private final String developerMessage;
    @c("errorCode")
    private final Object errorCode;
    @c("message")
    private final String message;
    @c("messageParam")
    private final Object messageParam;
    @c("statusCode")
    private final Integer statusCode;

    public ResponseMessage() {
        this((String) null, (Object) null, (Object) null, (String) null, (Integer) null, 31, (g) null);
    }

    public static /* synthetic */ ResponseMessage copy$default(ResponseMessage responseMessage, String str, Object obj, Object obj2, String str2, Integer num, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            str = responseMessage.developerMessage;
        }
        if ((i10 & 2) != 0) {
            obj = responseMessage.errorCode;
        }
        Object obj4 = obj;
        if ((i10 & 4) != 0) {
            obj2 = responseMessage.messageParam;
        }
        Object obj5 = obj2;
        if ((i10 & 8) != 0) {
            str2 = responseMessage.message;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            num = responseMessage.statusCode;
        }
        return responseMessage.copy(str, obj4, obj5, str3, num);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final Object component2() {
        return this.errorCode;
    }

    public final Object component3() {
        return this.messageParam;
    }

    public final String component4() {
        return this.message;
    }

    public final Integer component5() {
        return this.statusCode;
    }

    public final ResponseMessage copy(String str, Object obj, Object obj2, String str2, Integer num) {
        return new ResponseMessage(str, obj, obj2, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseMessage)) {
            return false;
        }
        ResponseMessage responseMessage = (ResponseMessage) obj;
        return l.a(this.developerMessage, responseMessage.developerMessage) && l.a(this.errorCode, responseMessage.errorCode) && l.a(this.messageParam, responseMessage.messageParam) && l.a(this.message, responseMessage.message) && l.a(this.statusCode, responseMessage.statusCode);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final Object getErrorCode() {
        return this.errorCode;
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

    public int hashCode() {
        String str = this.developerMessage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.errorCode;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.messageParam;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str2 = this.message;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "ResponseMessage(developerMessage=" + this.developerMessage + ", errorCode=" + this.errorCode + ", messageParam=" + this.messageParam + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseMessage(String str, Object obj, Object obj2, String str2, Integer num) {
        this.developerMessage = str;
        this.errorCode = obj;
        this.messageParam = obj2;
        this.message = str2;
        this.statusCode = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResponseMessage(java.lang.String r5, java.lang.Object r6, java.lang.Object r7, java.lang.String r8, java.lang.Integer r9, int r10, cm.g r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage.<init>(java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Integer, int, cm.g):void");
    }
}
