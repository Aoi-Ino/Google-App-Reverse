package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class UploadDocFlowResponse {
    @c("devmessage")
    private final String devmessage;
    @c("errCode")
    private final Object errCode;
    @c("message")
    private final String message;
    @c("statusCode")
    private final Integer statusCode;

    public UploadDocFlowResponse() {
        this((Object) null, (String) null, (String) null, (Integer) null, 15, (g) null);
    }

    public static /* synthetic */ UploadDocFlowResponse copy$default(UploadDocFlowResponse uploadDocFlowResponse, Object obj, String str, String str2, Integer num, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = uploadDocFlowResponse.errCode;
        }
        if ((i10 & 2) != 0) {
            str = uploadDocFlowResponse.devmessage;
        }
        if ((i10 & 4) != 0) {
            str2 = uploadDocFlowResponse.message;
        }
        if ((i10 & 8) != 0) {
            num = uploadDocFlowResponse.statusCode;
        }
        return uploadDocFlowResponse.copy(obj, str, str2, num);
    }

    public final Object component1() {
        return this.errCode;
    }

    public final String component2() {
        return this.devmessage;
    }

    public final String component3() {
        return this.message;
    }

    public final Integer component4() {
        return this.statusCode;
    }

    public final UploadDocFlowResponse copy(Object obj, String str, String str2, Integer num) {
        return new UploadDocFlowResponse(obj, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadDocFlowResponse)) {
            return false;
        }
        UploadDocFlowResponse uploadDocFlowResponse = (UploadDocFlowResponse) obj;
        return l.a(this.errCode, uploadDocFlowResponse.errCode) && l.a(this.devmessage, uploadDocFlowResponse.devmessage) && l.a(this.message, uploadDocFlowResponse.message) && l.a(this.statusCode, uploadDocFlowResponse.statusCode);
    }

    public final String getDevmessage() {
        return this.devmessage;
    }

    public final Object getErrCode() {
        return this.errCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        Object obj = this.errCode;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.devmessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "UploadDocFlowResponse(errCode=" + this.errCode + ", devmessage=" + this.devmessage + ", message=" + this.message + ", statusCode=" + this.statusCode + ')';
    }

    public UploadDocFlowResponse(Object obj, String str, String str2, Integer num) {
        this.errCode = obj;
        this.devmessage = str;
        this.message = str2;
        this.statusCode = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadDocFlowResponse(Object obj, String str, String str2, Integer num, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }
}
