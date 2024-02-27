package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ResponseBean {
    @c("developerMessage")
    private final String developerMessage;
    @c("errorCode")
    private final Object errorCode;
    @c("message")
    private final String message;
    @c("messageParam")
    private final Object messageParam;
    @c("nextSeqNo")
    private final Object nextSeqNo;
    @c("statusCode")
    private final Integer statusCode;
    @c("statusMessage")
    private final String statusMessage;

    public ResponseBean() {
        this((Object) null, (String) null, (Object) null, (Object) null, (String) null, (String) null, (Integer) null, 127, (g) null);
    }

    public static /* synthetic */ ResponseBean copy$default(ResponseBean responseBean, Object obj, String str, Object obj2, Object obj3, String str2, String str3, Integer num, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = responseBean.nextSeqNo;
        }
        if ((i10 & 2) != 0) {
            str = responseBean.developerMessage;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            obj2 = responseBean.errorCode;
        }
        Object obj5 = obj2;
        if ((i10 & 8) != 0) {
            obj3 = responseBean.messageParam;
        }
        Object obj6 = obj3;
        if ((i10 & 16) != 0) {
            str2 = responseBean.message;
        }
        String str5 = str2;
        if ((i10 & 32) != 0) {
            str3 = responseBean.statusMessage;
        }
        String str6 = str3;
        if ((i10 & 64) != 0) {
            num = responseBean.statusCode;
        }
        return responseBean.copy(obj, str4, obj5, obj6, str5, str6, num);
    }

    public final Object component1() {
        return this.nextSeqNo;
    }

    public final String component2() {
        return this.developerMessage;
    }

    public final Object component3() {
        return this.errorCode;
    }

    public final Object component4() {
        return this.messageParam;
    }

    public final String component5() {
        return this.message;
    }

    public final String component6() {
        return this.statusMessage;
    }

    public final Integer component7() {
        return this.statusCode;
    }

    public final ResponseBean copy(Object obj, String str, Object obj2, Object obj3, String str2, String str3, Integer num) {
        return new ResponseBean(obj, str, obj2, obj3, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseBean)) {
            return false;
        }
        ResponseBean responseBean = (ResponseBean) obj;
        return l.a(this.nextSeqNo, responseBean.nextSeqNo) && l.a(this.developerMessage, responseBean.developerMessage) && l.a(this.errorCode, responseBean.errorCode) && l.a(this.messageParam, responseBean.messageParam) && l.a(this.message, responseBean.message) && l.a(this.statusMessage, responseBean.statusMessage) && l.a(this.statusCode, responseBean.statusCode);
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

    public final Object getNextSeqNo() {
        return this.nextSeqNo;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        Object obj = this.nextSeqNo;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.developerMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj2 = this.errorCode;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.messageParam;
        int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusMessage;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        return "ResponseBean(nextSeqNo=" + this.nextSeqNo + ", developerMessage=" + this.developerMessage + ", errorCode=" + this.errorCode + ", messageParam=" + this.messageParam + ", message=" + this.message + ", statusMessage=" + this.statusMessage + ", statusCode=" + this.statusCode + ')';
    }

    public ResponseBean(Object obj, String str, Object obj2, Object obj3, String str2, String str3, Integer num) {
        this.nextSeqNo = obj;
        this.developerMessage = str;
        this.errorCode = obj2;
        this.messageParam = obj3;
        this.message = str2;
        this.statusMessage = str3;
        this.statusCode = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResponseBean(java.lang.Object r7, java.lang.String r8, java.lang.Object r9, java.lang.Object r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, int r14, cm.g r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.temp.ResponseBean.<init>(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Integer, int, cm.g):void");
    }
}
