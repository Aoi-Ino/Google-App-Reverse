package com.nic.mparivahan.DlLog.kycPackage.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ResponsePojo {
    private final String alerMessage;
    private final String statusCode;
    private final String statusDesc;

    public ResponsePojo(String str, String str2, String str3) {
        l.f(str, "alerMessage");
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        this.alerMessage = str;
        this.statusCode = str2;
        this.statusDesc = str3;
    }

    public static /* synthetic */ ResponsePojo copy$default(ResponsePojo responsePojo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = responsePojo.alerMessage;
        }
        if ((i10 & 2) != 0) {
            str2 = responsePojo.statusCode;
        }
        if ((i10 & 4) != 0) {
            str3 = responsePojo.statusDesc;
        }
        return responsePojo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.alerMessage;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final ResponsePojo copy(String str, String str2, String str3) {
        l.f(str, "alerMessage");
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        return new ResponsePojo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponsePojo)) {
            return false;
        }
        ResponsePojo responsePojo = (ResponsePojo) obj;
        return l.a(this.alerMessage, responsePojo.alerMessage) && l.a(this.statusCode, responsePojo.statusCode) && l.a(this.statusDesc, responsePojo.statusDesc);
    }

    public final String getAlerMessage() {
        return this.alerMessage;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.alerMessage.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "ResponsePojo(alerMessage=" + this.alerMessage + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
