package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class SendOtpResult {
    private final String param;
    private final int recordId;
    private final String statusCode;
    private final String statusDesc;

    public SendOtpResult(String str, int i10, String str2, String str3) {
        l.f(str, "param");
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        this.param = str;
        this.recordId = i10;
        this.statusCode = str2;
        this.statusDesc = str3;
    }

    public static /* synthetic */ SendOtpResult copy$default(SendOtpResult sendOtpResult, String str, int i10, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sendOtpResult.param;
        }
        if ((i11 & 2) != 0) {
            i10 = sendOtpResult.recordId;
        }
        if ((i11 & 4) != 0) {
            str2 = sendOtpResult.statusCode;
        }
        if ((i11 & 8) != 0) {
            str3 = sendOtpResult.statusDesc;
        }
        return sendOtpResult.copy(str, i10, str2, str3);
    }

    public final String component1() {
        return this.param;
    }

    public final int component2() {
        return this.recordId;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final SendOtpResult copy(String str, int i10, String str2, String str3) {
        l.f(str, "param");
        l.f(str2, "statusCode");
        l.f(str3, "statusDesc");
        return new SendOtpResult(str, i10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendOtpResult)) {
            return false;
        }
        SendOtpResult sendOtpResult = (SendOtpResult) obj;
        return l.a(this.param, sendOtpResult.param) && this.recordId == sendOtpResult.recordId && l.a(this.statusCode, sendOtpResult.statusCode) && l.a(this.statusDesc, sendOtpResult.statusDesc);
    }

    public final String getParam() {
        return this.param;
    }

    public final int getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.param.hashCode() * 31) + Integer.hashCode(this.recordId)) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "SendOtpResult(param=" + this.param + ", recordId=" + this.recordId + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendOtpResult(String str, int i10, String str2, String str3, int i11, g gVar) {
        this((i11 & 1) != 0 ? "  " : str, i10, str2, str3);
    }
}
