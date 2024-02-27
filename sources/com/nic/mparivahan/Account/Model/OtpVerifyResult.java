package com.nic.mparivahan.Account.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class OtpVerifyResult {
    private final MparCitizenUser mparCitizenUser;
    private final Object param;
    private final Object recordId;
    private final String statusCode;
    private final String statusDesc;

    public OtpVerifyResult(MparCitizenUser mparCitizenUser2, Object obj, Object obj2, String str, String str2) {
        this.mparCitizenUser = mparCitizenUser2;
        this.param = obj;
        this.recordId = obj2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ OtpVerifyResult copy$default(OtpVerifyResult otpVerifyResult, MparCitizenUser mparCitizenUser2, Object obj, Object obj2, String str, String str2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            mparCitizenUser2 = otpVerifyResult.mparCitizenUser;
        }
        if ((i10 & 2) != 0) {
            obj = otpVerifyResult.param;
        }
        Object obj4 = obj;
        if ((i10 & 4) != 0) {
            obj2 = otpVerifyResult.recordId;
        }
        Object obj5 = obj2;
        if ((i10 & 8) != 0) {
            str = otpVerifyResult.statusCode;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = otpVerifyResult.statusDesc;
        }
        return otpVerifyResult.copy(mparCitizenUser2, obj4, obj5, str3, str2);
    }

    public final MparCitizenUser component1() {
        return this.mparCitizenUser;
    }

    public final Object component2() {
        return this.param;
    }

    public final Object component3() {
        return this.recordId;
    }

    public final String component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.statusDesc;
    }

    public final OtpVerifyResult copy(MparCitizenUser mparCitizenUser2, Object obj, Object obj2, String str, String str2) {
        return new OtpVerifyResult(mparCitizenUser2, obj, obj2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpVerifyResult)) {
            return false;
        }
        OtpVerifyResult otpVerifyResult = (OtpVerifyResult) obj;
        return l.a(this.mparCitizenUser, otpVerifyResult.mparCitizenUser) && l.a(this.param, otpVerifyResult.param) && l.a(this.recordId, otpVerifyResult.recordId) && l.a(this.statusCode, otpVerifyResult.statusCode) && l.a(this.statusDesc, otpVerifyResult.statusDesc);
    }

    public final MparCitizenUser getMparCitizenUser() {
        return this.mparCitizenUser;
    }

    public final Object getParam() {
        return this.param;
    }

    public final Object getRecordId() {
        return this.recordId;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        MparCitizenUser mparCitizenUser2 = this.mparCitizenUser;
        int i10 = 0;
        int hashCode = (mparCitizenUser2 == null ? 0 : mparCitizenUser2.hashCode()) * 31;
        Object obj = this.param;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.recordId;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.statusCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "OtpVerifyResult(mparCitizenUser=" + this.mparCitizenUser + ", param=" + this.param + ", recordId=" + this.recordId + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
